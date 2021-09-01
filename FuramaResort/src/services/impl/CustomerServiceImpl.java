package services.impl;

import models.AddressOfCustomer;
import models.Customer;
import models.CustomerType;
import services.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class CustomerServiceImpl implements ICustomerService {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> listCustomer = new LinkedList<>();
    static {
        listCustomer.add(new Customer("Phan Tuấn Kiệt", "02/04/1992", "male", "201123456",
                                      "0905123456", "ptk@gmail.com", 1, new CustomerType("diamond"),
                                      new AddressOfCustomer("12", "Yên Thế", "Hòa An", "Cẩm Lệ", "Đà Nẵng")));
        listCustomer.add(new Customer("Đoàn Văn E", "06/02/1996", "male", "458793246",
                                      "0905467890", "lkorth@gmail.com", 2, new CustomerType("gold"),
                                       new AddressOfCustomer("38", "Huỳnh Ngọc Huệ", "An Khê", "Thanh Khê", "Đà Nẵng")));
        listCustomer.add(new Customer("Nguyễn Thị F", "05/07/1985", "female", "678097123",
                                     "0956348670", "tuiopu@gmail.com", 3, new CustomerType("silver"),
                                     new AddressOfCustomer("31", "Quảng Xương", "Quế Châu", "Quế Sơn", "Quảng Nam")));
    }

    @Override
    public void addList() {
        System.out.print("Please enter full name of customer: ");
        String nameOfCustomer = scanner.nextLine();
        System.out.print("Please enter birthday of customer (dd/mm/yyyy): ");
        String birthdayOfCustomer = scanner.nextLine();
        System.out.print("Please enter gender of customer (male/female): ");
        String genderOfCustomer = scanner.nextLine();
        System.out.print("Please enter Id card number of customer: ");
        String idCardNumberOfCustomer = scanner.nextLine();
        System.out.print("Please enter phone number of customer: ");
        String phoneNumberOfCustomer = scanner.nextLine();
        System.out.print("Please enter email of customer: ");
        String emailOfCustomer = scanner.nextLine();
        System.out.print("Please enter Id of Customer: ");
        int idOfCustomer = Integer.parseInt(scanner.nextLine());
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
        CustomerType customerType = new CustomerType(customerOfType);
        AddressOfCustomer addressOfCustomer = new AddressOfCustomer(houseNumberOfCustomer, streetOfCustomer, wardOfCustomer, districtOfCustomer, provinceOfCustomer);
        boolean check = true;
        for (int i = 0; i< listCustomer.size(); i++) {
            if (listCustomer.get(i).getIdOfCustomer() == idOfCustomer) {
                System.out.print("Error. The id already exists in the list. Please re-enter. \n");
                check = false;
                break;
            }
            if (idOfCustomer == 0) {
                System.out.print("Error. Id cannot be 0. Please re-enter. \n");
                check = false;
                break;
            }
        }
        if (check) {
            listCustomer.add(new Customer(nameOfCustomer, birthdayOfCustomer, genderOfCustomer, idCardNumberOfCustomer,
                    phoneNumberOfCustomer, emailOfCustomer, idOfCustomer,customerType, addressOfCustomer));
        }
    }

    @Override
    public void displayList() {
        for (Customer customer : listCustomer) {
            System.out.print(customer.toString() + "\n");
        }

    }

    @Override
    public void editList() {
        System.out.print("Please enter the id of the customer to be edit: ");
        int idOfCustomerForEdit = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getIdOfCustomer() == idOfCustomerForEdit) {
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
                        listCustomer.get(i).setFullName(newFullNameOfCustomer);
                        break;
                    case 2:
                        System.out.print("Please enter new birthday: ");
                        String newBirthdayOfCustomer = scanner.nextLine();
                        listCustomer.get(i).setBirthday(newBirthdayOfCustomer);
                        break;
                    case 3:
                        System.out.print("Please enter new gender: ");
                        String newGenderOfCustomer = scanner.nextLine();
                        listCustomer.get(i).setGender(newGenderOfCustomer);
                        break;
                    case 4:
                        System.out.print("Please enter new Id card number: ");
                        String newIdCardNumberOfCustomer = scanner.nextLine();
                        listCustomer.get(i).setIdCardNumber(newIdCardNumberOfCustomer);
                        break;
                    case 5:
                        System.out.print("Please enter new phone number: ");
                        String newPhoneNumber = scanner.nextLine();
                        listCustomer.get(i).setPhoneNumber(newPhoneNumber);
                        break;
                    case 6:
                        System.out.println("Please enter new email: ");
                        String newEmailOfCustomer = scanner.nextLine();
                        listCustomer.get(i).setEmail(newEmailOfCustomer);
                        break;
                    case 7:
                        System.out.print("Please enter new customer type (diamond/platinium/gold/silver/member): ");
                        String newCustomerTye = scanner.nextLine();
                        CustomerType customerType = new CustomerType();
                        customerType.setCustomerType(newCustomerTye);
                        listCustomer.get(i).setCustomerType(customerType);
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
                                addressOfCustomer1 = listCustomer.get(i).getAddressOfCustomer();
                                addressOfCustomer1.setHouseNumber(newHouseNumberOfCustomer);
                                listCustomer.get(i).setAddressOfCustomer(addressOfCustomer1);
                                break;
                            case 2:
                                System.out.print("Please enter new street: ");
                                String newStreetOfCustomer = scanner.nextLine();
                                AddressOfCustomer addressOfCustomer2 = new AddressOfCustomer();
                                addressOfCustomer2 = listCustomer.get(i).getAddressOfCustomer();
                                addressOfCustomer2.setStreet(newStreetOfCustomer);
                                listCustomer.get(i).setAddressOfCustomer(addressOfCustomer2);
                                break;
                            case 3:
                                System.out.print("Please enter new ward: ");
                                String newWardOfCustomer = scanner.nextLine();
                                AddressOfCustomer addressOfCustomer3 = new AddressOfCustomer();
                                addressOfCustomer3 = listCustomer.get(i).getAddressOfCustomer();
                                addressOfCustomer3.setWard(newWardOfCustomer);
                                listCustomer.get(i).setAddressOfCustomer(addressOfCustomer3);
                                break;
                            case 4:
                                System.out.print("Please enter new district: ");
                                String newDistrictOfCustomer = scanner.nextLine();
                                AddressOfCustomer addressOfCustomer4 = new AddressOfCustomer();
                                addressOfCustomer4 = listCustomer.get(i).getAddressOfCustomer();
                                addressOfCustomer4.setDistrict(newDistrictOfCustomer);
                                listCustomer.get(i).setAddressOfCustomer(addressOfCustomer4);
                                break;
                            case 5:
                                System.out.print("Please enter new province: ");
                                String newProvinceOfCustomer = scanner.nextLine();
                                AddressOfCustomer addressOfCustomer5 = new AddressOfCustomer();
                                addressOfCustomer5 = listCustomer.get(i).getAddressOfCustomer();
                                addressOfCustomer5.setProvince(newProvinceOfCustomer);
                                listCustomer.get(i).setAddressOfCustomer(addressOfCustomer5);
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
}
