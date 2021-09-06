package services.impl;

import models.AddressOfCustomer;
import models.Customer;
import models.CustomerType;
import services.ICustomerService;
import utils.AllRegex;
import utils.InvalidBirthdayException;
import utils.ReadAndWriteFileOfCustomer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class CustomerServiceImpl implements ICustomerService {
    static Scanner scanner = new Scanner(System.in);
    static String filePath = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\customer.csv";
    AllRegex allRegex = new AllRegex();

    @Override
    public void add() {
        List<Customer> customerList = getList();

        String idOfCustomer;
        boolean checkIdOfCustomer;
        do {
            checkIdOfCustomer = true;
            System.out.print("Please enter Id of Customer: ");
            idOfCustomer = scanner.nextLine();
            for (int i = 0; i< customerList.size(); i++) {
                if (customerList.get(i).getIdOfCustomer().equals(idOfCustomer)) {
                    checkIdOfCustomer = false;
                    break;
                }
            }
            if (!checkIdOfCustomer) {
                System.out.print("Error. The id already exists in the list. Please re-enter. \n");
            }
        } while (!checkIdOfCustomer);

        System.out.print("Please enter full name of customer: ");
        String nameOfCustomer = scanner.nextLine();

        String birthdayOfCustomer;
        boolean isValidOfBirthday;
        String checkExceptionOfBirthday;
        do {
            do {
                System.out.print("Please enter birthday of customer (dd/mm/yyyy): ");
                birthdayOfCustomer = scanner.nextLine();
                isValidOfBirthday = allRegex.validateOfDate(birthdayOfCustomer);
                if (!isValidOfBirthday) {
                    System.out.println("The birthday must be in the correct format: dd/mm/yyyy");
                }
            } while (!isValidOfBirthday);
            checkExceptionOfBirthday = invalidOfBirthday(birthdayOfCustomer);
        } while (checkExceptionOfBirthday.equals("Exception: Birthday is invalid"));

        System.out.print("Please enter gender of customer (male/female): ");
        String genderOfCustomer = scanner.nextLine();

        String idCardNumberOfCustomer;
        boolean isValidOfIdCardNumber;
        do {
            System.out.print("Please enter Id card number of customer: ");
            idCardNumberOfCustomer = scanner.nextLine();
            isValidOfIdCardNumber = allRegex.validateOfIdCardNumber(idCardNumberOfCustomer);
            if (!isValidOfIdCardNumber) {
                System.out.println("Error. The Id card number must be in the correct format");
            }
        } while (!isValidOfIdCardNumber);

        String phoneNumberOfCustomer;
        boolean isValidOfPhoneNumber;
        do {
            System.out.print("Please enter phone number of customer: ");
            phoneNumberOfCustomer = scanner.nextLine();
            isValidOfPhoneNumber = allRegex.validateOfPhoneNumber(phoneNumberOfCustomer);
            if (!isValidOfPhoneNumber) {
                System.out.println("Error. The phone number must be in the correct format");
            }
        } while (!isValidOfPhoneNumber);

        String emailOfCustomer;
        boolean isValidEmailOfCustomer;
        do {
            System.out.print("Please enter email of customer: ");
            emailOfCustomer = scanner.nextLine();
            isValidEmailOfCustomer = allRegex.validateOfEmail(emailOfCustomer);
            if (!isValidEmailOfCustomer) {
                System.out.println("Error. The email must be in the correct format");
            }
        } while (!isValidEmailOfCustomer);

        System.out.print("Please enter customer type (diamond/platinium/gold/silver/member): ");
        String customerOfType = scanner.nextLine();
        System.out.print("Please enter house's number of customer: ");
        String houseNumberOfCustomer = scanner.nextLine();
        System.out.print("Please enter street's name of customer: ");
        String streetOfCustomer = scanner.nextLine();
        System.out.print("Please enter ward's name of customer: ");
        String wardOfCustomer = scanner.nextLine();
        System.out.print("Please enter district's name of customer: ");
        String districtOfCustomer = scanner.nextLine();
        System.out.print("Please enter province's name of customer: ");
        String provinceOfCustomer = scanner.nextLine();

        customerList.clear();
        CustomerType customerType = new CustomerType(customerOfType);
        AddressOfCustomer addressOfCustomer = new AddressOfCustomer(houseNumberOfCustomer, streetOfCustomer, wardOfCustomer, districtOfCustomer, provinceOfCustomer);

        customerList.add(new Customer(nameOfCustomer, birthdayOfCustomer, genderOfCustomer, idCardNumberOfCustomer,
                phoneNumberOfCustomer, emailOfCustomer, idOfCustomer,customerType, addressOfCustomer));
        ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, true);
    }

    @Override
    public void display() {
        List<Customer> customerList = getList();
        for (Customer customer : customerList) {
            System.out.print(customer.toString() + "\n");
        }

    }

    @Override
    public void edit() {
        List<Customer> customerList = getList();
        System.out.print("Please enter the id of the customer to be edit: ");
        String idOfCustomerForEdit = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdOfCustomer().equals(idOfCustomerForEdit)) {
                check = true;
                System.out.print("What do you want to edit? \n");
                System.out.print("\t1. Edit customer's full name \n");
                System.out.print("\t2. Edit customer's birthday\n");
                System.out.print("\t3. Edit customer's gender\n");
                System.out.print("\t4. Edit customer's Id card number\n");
                System.out.print("\t5. Edit customer's phone number\n");
                System.out.print("\t6. Edit customer's email\n");
                System.out.print("\t7. Edit customer's customer type\n");
                System.out.print("\t8. Edit customer's address\n");
                System.out.print("\t0. Return main menu\n");
                System.out.print("Please choose from 0 to 8: ");
                int chooseForEdit = Integer.parseInt(scanner.nextLine());
                switch (chooseForEdit) {
                    case 1:
                        System.out.print("Please enter new full name: ");
                        String newFullNameOfCustomer = scanner.nextLine();
                        customerList.get(i).setFullName(newFullNameOfCustomer);
                        ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, false);
                        break;
                    case 2:
                        String newBirthdayOfCustomer;
                        boolean isValidOfNewBirthday;
                        do {
                            System.out.print("Please enter new birthday: ");
                            newBirthdayOfCustomer = scanner.nextLine();
                            isValidOfNewBirthday = allRegex.validateOfDate(newBirthdayOfCustomer);
                            if (!isValidOfNewBirthday) {
                                System.out.println("The birthday must be in the correct format: dd/mm/yyyy");
                            }
                        } while (!isValidOfNewBirthday);
                        customerList.get(i).setBirthday(newBirthdayOfCustomer);
                        ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, false);
                        break;
                    case 3:
                        System.out.print("Please enter new gender: ");
                        String newGenderOfCustomer = scanner.nextLine();
                        customerList.get(i).setGender(newGenderOfCustomer);
                        ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, false);
                        break;
                    case 4:
                        String newIdCardNumberOfCustomer;
                        boolean isValidOfNewIdCardNumber;
                        do {
                            System.out.print("Please enter new Id card number: ");
                            newIdCardNumberOfCustomer = scanner.nextLine();
                            isValidOfNewIdCardNumber = allRegex.validateOfIdCardNumber(newIdCardNumberOfCustomer);
                            if (!isValidOfNewIdCardNumber) {
                                System.out.println("Error. The Id card number must be in the correct format");
                            }
                        } while (!isValidOfNewIdCardNumber);
                        customerList.get(i).setIdCardNumber(newIdCardNumberOfCustomer);
                        ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, false);
                        break;
                    case 5:
                        String newPhoneNumberOfCustomer;
                        boolean isValidOfNewPhoneNumber;
                        do {
                            System.out.print("Please enter new phone number: ");
                            newPhoneNumberOfCustomer = scanner.nextLine();
                            isValidOfNewPhoneNumber = allRegex.validateOfPhoneNumber(newPhoneNumberOfCustomer);
                            if (!isValidOfNewPhoneNumber) {
                                System.out.println("Error. The phone number must be in the correct format");
                            }
                        } while (!isValidOfNewPhoneNumber);
                        customerList.get(i).setPhoneNumber(newPhoneNumberOfCustomer);
                        ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, false);
                        break;
                    case 6:
                        String newEmailOfCustomer;
                        boolean isValidOfNewEmail;
                        do {
                            System.out.println("Please enter new email: ");
                            newEmailOfCustomer = scanner.nextLine();
                            isValidOfNewEmail = allRegex.validateOfEmail(newEmailOfCustomer);
                            if (!isValidOfNewEmail) {
                                System.out.println("Error. The email must be in the correct format");
                            }
                        } while (!isValidOfNewEmail);
                        customerList.get(i).setEmail(newEmailOfCustomer);
                        ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, false);
                        break;
                    case 7:
                        System.out.print("Please enter new customer type (diamond/platinium/gold/silver/member): ");
                        String newCustomerTye = scanner.nextLine();
                        CustomerType customerType = new CustomerType();
                        customerType.setCustomerType(newCustomerTye);
                        customerList.get(i).setCustomerType(customerType);
                        ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, false);
                        break;
                    case 8:
                        System.out.print("\t1. Edit customer's house Number \n");
                        System.out.print("\t2. Edit customer's street \n");
                        System.out.print("\t3. Edit customer's ward \n");
                        System.out.print("\t4. Edit customer's district \n");
                        System.out.print("\t5. Edit customer's province\n");
                        System.out.print("\t0. Return main menu\n");
                        System.out.print("Please choose from 0 to 5: ");
                        int chooseAddressForEdit = Integer.parseInt(scanner.nextLine());
                        switch (chooseAddressForEdit) {
                            case 1:
                                System.out.print("Please enter new house number: ");
                                String newHouseNumberOfCustomer = scanner.nextLine();
                                AddressOfCustomer addressOfCustomer1 = new AddressOfCustomer();
                                addressOfCustomer1 = customerList.get(i).getAddressOfCustomer();
                                addressOfCustomer1.setHouseNumber(newHouseNumberOfCustomer);
                                customerList.get(i).setAddressOfCustomer(addressOfCustomer1);
                                ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, false);
                                break;
                            case 2:
                                System.out.print("Please enter new street: ");
                                String newStreetOfCustomer = scanner.nextLine();
                                AddressOfCustomer addressOfCustomer2 = new AddressOfCustomer();
                                addressOfCustomer2 = customerList.get(i).getAddressOfCustomer();
                                addressOfCustomer2.setStreet(newStreetOfCustomer);
                                customerList.get(i).setAddressOfCustomer(addressOfCustomer2);
                                ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, false);
                                break;
                            case 3:
                                System.out.print("Please enter new ward: ");
                                String newWardOfCustomer = scanner.nextLine();
                                AddressOfCustomer addressOfCustomer3 = new AddressOfCustomer();
                                addressOfCustomer3 = customerList.get(i).getAddressOfCustomer();
                                addressOfCustomer3.setWard(newWardOfCustomer);
                                customerList.get(i).setAddressOfCustomer(addressOfCustomer3);
                                ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, false);
                                break;
                            case 4:
                                System.out.print("Please enter new district: ");
                                String newDistrictOfCustomer = scanner.nextLine();
                                AddressOfCustomer addressOfCustomer4 = new AddressOfCustomer();
                                addressOfCustomer4 = customerList.get(i).getAddressOfCustomer();
                                addressOfCustomer4.setDistrict(newDistrictOfCustomer);
                                customerList.get(i).setAddressOfCustomer(addressOfCustomer4);
                                ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, false);
                                break;
                            case 5:
                                System.out.print("Please enter new province: ");
                                String newProvinceOfCustomer = scanner.nextLine();
                                AddressOfCustomer addressOfCustomer5 = new AddressOfCustomer();
                                addressOfCustomer5 = customerList.get(i).getAddressOfCustomer();
                                addressOfCustomer5.setProvince(newProvinceOfCustomer);
                                customerList.get(i).setAddressOfCustomer(addressOfCustomer5);
                                ReadAndWriteFileOfCustomer.writeCustomerToFile(filePath, customerList, false);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.print("Error. Please re-enter");
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.print("Error. Please re-enter");
                }
            }
        }
        if (!check) {
            System.out.print("Error. The id already exists in the list or Id cannot be 0. Please re-enter. \n");
        }
    }

    @Override
    public List<Customer> getList() {
        return ReadAndWriteFileOfCustomer.readCustomerFromFile(filePath);
    }
    public String invalidOfBirthday (String string) {
        String stringException = "Exception: Birthday is invalid";
        String stringNotException = "Birthday is valid";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar now = Calendar.getInstance();
        Calendar born = Calendar.getInstance();
        try {
            now.setTime(new Date());
            born.setTime(sdf.parse(string));
            int age = now.get(Calendar.YEAR) - born.get(Calendar.YEAR);
            if (age < 18 || age > 100) {
                throw new InvalidBirthdayException(stringException);
            } else {
                System.out.println(stringNotException);
            }
        } catch (InvalidBirthdayException e) {
            System.out.println(e.getMessage());
            return stringException;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return stringNotException;
    }
}
