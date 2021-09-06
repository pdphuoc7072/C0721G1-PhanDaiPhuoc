package services.impl;

import models.EducationLevel;
import models.Employee;
import models.Position;
import services.IEmployeeService;
import utils.AllRegex;
import utils.InvalidBirthdayException;
import utils.ReadAndWriteFileOfEmployee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    String filePath = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\employee.csv";
    AllRegex allRegex = new AllRegex();

    @Override
    public void add() {
        List<Employee> employeeList = getList();

        boolean checkIdOfEmployee;
        String idOfEmployee;
        do {
            checkIdOfEmployee = true;
            System.out.print("Please enter Id of the employee: ");
            idOfEmployee = scanner.nextLine();
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getIdOfEmployee().equals(idOfEmployee)) {
                    checkIdOfEmployee = false;
                    break;
                }
            }
            if (!checkIdOfEmployee) {
                System.out.print("Error. The id already exists in the list. Please re-enter. \n");
            }
        } while (!checkIdOfEmployee);

        System.out.print("Please enter full name: ");
        String nameOfEmployee = scanner.nextLine();

        String birthdayOfEmployee;
        boolean isValidOfBirthday;
        String checkExceptionOfBirthday;
        do {
            do {
                System.out.print("Please enter birthday (dd/mm/yyyy): ");
                birthdayOfEmployee = scanner.nextLine();
                isValidOfBirthday = allRegex.validateOfDate(birthdayOfEmployee);
                if (!isValidOfBirthday) {
                    System.out.println("The birthday must be in the correct format: dd/mm/yyyy");
                }
            } while (!isValidOfBirthday);
            checkExceptionOfBirthday = invalidOfBirthday(birthdayOfEmployee);
        } while (checkExceptionOfBirthday.equals("Exception: Birthday is invalid"));

        System.out.print("Please enter gender (male/female): ");
        String genderOfEmployee = scanner.nextLine();

        String idCardNumberOfEmployee;
        boolean isValidOfIdCardNumber;
        do {
            System.out.print("Please enter Id card number: ");
            idCardNumberOfEmployee = scanner.nextLine();
            isValidOfIdCardNumber = allRegex.validateOfIdCardNumber(idCardNumberOfEmployee);
            if (!isValidOfIdCardNumber) {
                System.out.println("Error. The Id card number must be in the correct format");
            }
        } while (!isValidOfIdCardNumber);

        String phoneNumberOfEmployee;
        boolean isValidOfPhoneNumber;
        do {
            System.out.print("Please enter phone number: ");
            phoneNumberOfEmployee = scanner.nextLine();
            isValidOfPhoneNumber = allRegex.validateOfPhoneNumber(phoneNumberOfEmployee);
            if (!isValidOfPhoneNumber) {
                System.out.println("Error. The phone number must be in the correct format");
            }
        } while (!isValidOfPhoneNumber);

        String emailOfEmployee;
        boolean isValidOfEmail;
        do {
            System.out.print("Please enter email: ");
            emailOfEmployee = scanner.nextLine();
            isValidOfEmail = allRegex.validateOfEmail(emailOfEmployee);
            if (!isValidOfEmail) {
                System.out.println("Error. The email must be in the correct format");
            }
        } while (!isValidOfEmail);

        System.out.print("Please enter education level (intermediate/college/university/post graduate): ");
        String educationLevelOfEmployee = scanner.nextLine();
        System.out.print("Please enter position (receptionist/waiter:waitress/expert/supervision/manager/director): ");
        String positionOfEmployee = scanner.nextLine();

        employeeList.clear();
        EducationLevel educationLevel = new EducationLevel(educationLevelOfEmployee);
        Position position = new Position(positionOfEmployee);
        employeeList.add(new Employee(nameOfEmployee, birthdayOfEmployee, genderOfEmployee, idCardNumberOfEmployee, phoneNumberOfEmployee, emailOfEmployee, idOfEmployee, educationLevel, position));
        ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, true);
    }

    @Override
    public void display() {
        List<Employee> employeeList = getList();
        for (Employee employee : employeeList) {
            System.out.print(employee.toString() + "\n");
        }
    }

    @Override
    public void edit() {
        List<Employee> employeeList = getList();
        System.out.print("Please enter the id of the employee to be edit: ");
        String idOfEmployeeForEdit = scanner.nextLine();
        boolean checkIdOfEmployeeForEdit = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdOfEmployee().equals(idOfEmployeeForEdit)) {
                checkIdOfEmployeeForEdit = true;
                System.out.println("What do you want to edit?");
                System.out.println("\t1. Edit employee's full name");
                System.out.println("\t2. Edit employee's birthday");
                System.out.println("\t3. Edit employee's gender");
                System.out.println("\t4. Edit employee's Id card number");
                System.out.println("\t5. Edit employee's phone number");
                System.out.println("\t6. Edit employee's email");
                System.out.println("\t7. Edit employee's education level");
                System.out.println("\t8. Edit employee's position");
                System.out.println("\t0. Return main menu");
                System.out.print("Please choose from 0 to 8: ");
                int chooseForEdit = Integer.parseInt(scanner.nextLine());
                switch (chooseForEdit) {
                    case 1:
                        System.out.print("Please enter new full name: ");
                        String newNameOfEmployee = scanner.nextLine();
                        employeeList.get(i).setFullName(newNameOfEmployee);
                        ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                        break;
                    case 2:
                        System.out.print("Please enter new birthday (dd/mm/yyyy): ");
                        String newBirthdayOfEmployee = scanner.nextLine();
                        employeeList.get(i).setBirthday(newBirthdayOfEmployee);
                        ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                        break;
                    case 3:
                        System.out.print("Please enter new gender (male/female): ");
                        String newGenderOfEmployee = scanner.nextLine();
                        employeeList.get(i).setGender(newGenderOfEmployee);
                        ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                        break;
                    case 4:
                        System.out.print("Please enter new Id card number: ");
                        String newIdCardNumberOfEmployee = scanner.nextLine();
                        employeeList.get(i).setIdCardNumber(newIdCardNumberOfEmployee);
                        ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                        break;
                    case 5:
                        System.out.print("Please enter new phone number: ");
                        String newPhoneNumberOfEmployee = scanner.nextLine();
                        employeeList.get(i).setPhoneNumber(newPhoneNumberOfEmployee);
                        ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                        break;
                    case 6:
                        System.out.print("Please enter new email: ");
                        String newEmailOfEmployee = scanner.nextLine();
                        employeeList.get(i).setEmail(newEmailOfEmployee);
                        ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                        break;
                    case 7:
                        System.out.print("Please enter new education level (intermediate/college/university/post graduate): ");
                        String newEducationLevelOfEmployee = scanner.nextLine();
                        EducationLevel newEducationLevel = new EducationLevel();
                        newEducationLevel.setEducationLevel(newEducationLevelOfEmployee);
                        employeeList.get(i).setEducationLevel(newEducationLevel);
                        ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                        break;
                    case 8:
                        System.out.print("Please enter new position (receptionist/waiter:waitress/expert/supervision/manager/director): ");
                        String newPositionOfEmployee = scanner.nextLine();
                        Position newPosition = new Position();
                        newPosition.setPosition(newPositionOfEmployee);
                        employeeList.get(i).setPosition(newPosition);
                        ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Error. Please re-enter");
                }
            }
        }
        if (!checkIdOfEmployeeForEdit) {
            System.out.println("Error. The id already exists in the list or Id cannot be 0. Please re-enter.");
        }
    }

    @Override
    public List<Employee> getList() {
        return ReadAndWriteFileOfEmployee.readEmployeeFromFile(filePath);
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
