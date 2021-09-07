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
        boolean isValidIdOfEmployee;
        boolean flagOfId;
        String idOfEmployee = null;
        do {
            checkIdOfEmployee = true;
            flagOfId = false;
            try {
                System.out.print("Please enter Id of the employee: ");
                idOfEmployee = scanner.nextLine();
                isValidIdOfEmployee = allRegex.validateOfIdPerson(idOfEmployee);
                if (!isValidIdOfEmployee) {
                    throw new Exception("The Id of employee must be in the correct format");
                }
                for (int i = 0; i < employeeList.size(); i++) {
                    if (employeeList.get(i).getIdOfEmployee().equals(idOfEmployee)) {
                        checkIdOfEmployee = false;
                        break;
                    }
                }
                if (!checkIdOfEmployee) {
                    throw new Exception("Error. The id already exists in the list. Please re-enter.");
                }
                flagOfId = isValidIdOfEmployee && checkIdOfEmployee;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!flagOfId);

        System.out.print("Please enter full name: ");
        String nameOfEmployee = scanner.nextLine();

        String birthdayOfEmployee;
        boolean isValidOfBirthday;
        boolean flag;
        do {
            System.out.print("Please enter birthday (dd/mm/yyyy): ");
            birthdayOfEmployee = scanner.nextLine();
            isValidOfBirthday = allRegex.validateOfDate(birthdayOfEmployee);
            if (!isValidOfBirthday) {
                System.out.println("The birthday must be in the correct format: dd/mm/yyyy");
            }
            flag = isValidOfBirthday && invalidOfBirthday(birthdayOfEmployee);
        } while (!flag);

        String genderOfEmployee = null;
        while (true) {
            try {
                String[] genderOfArray = {"MALE", "FEMALE", "OTHER"};
                for (int j = 0; j < genderOfArray.length; j++) {
                    System.out.println((j+1) + ". " + genderOfArray[j]);
                }
                System.out.print("Please enter gender: ");
                int chooseOfGender = Integer.parseInt(scanner.nextLine());
                if (chooseOfGender > genderOfArray.length) {
                    throw new Exception("Error. Please re-enter.");
                }
                for (int j = 0; j < genderOfArray.length; j++) {
                    genderOfEmployee = genderOfArray[chooseOfGender - 1];
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        String idCardNumberOfEmployee = null;
        boolean isValidOfIdCardNumber;
        do {
            isValidOfIdCardNumber = true;
            try {
                System.out.print("Please enter Id card number: ");
                idCardNumberOfEmployee = scanner.nextLine();
                isValidOfIdCardNumber = allRegex.validateOfIdCardNumber(idCardNumberOfEmployee);
                if (!isValidOfIdCardNumber) {
                    throw new Exception("Error. The Id card number must be in the correct format");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!isValidOfIdCardNumber);

        String phoneNumberOfEmployee = null;
        boolean isValidOfPhoneNumber;
        do {
            isValidOfPhoneNumber = true;
            try {
                System.out.print("Please enter phone number: ");
                phoneNumberOfEmployee = scanner.nextLine();
                isValidOfPhoneNumber = allRegex.validateOfPhoneNumber(phoneNumberOfEmployee);
                if (!isValidOfPhoneNumber) {
                    throw new Exception("Error. The phone number must be in the correct format");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!isValidOfPhoneNumber);

        String emailOfEmployee = null;
        boolean isValidOfEmail;
        do {
            isValidOfEmail = true;
            try {
                System.out.print("Please enter email: ");
                emailOfEmployee = scanner.nextLine();
                isValidOfEmail = allRegex.validateOfEmail(emailOfEmployee);
                if (!isValidOfEmail) {
                    throw new Exception("Error. The email must be in the correct format");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!isValidOfEmail);

        String educationLevelOfEmployee = null;
        while (true) {
            try {
                String[] educationLevelOfArray = {"INTERMEDIATE", "COLLEGE", "UNIVERSITY", "POST GRADUATE"};
                for (int j = 0; j < educationLevelOfArray.length; j++) {
                    System.out.println((j+1) + ". " + educationLevelOfArray[j]);
                }
                System.out.print("Please enter education level: ");
                int chooseOfEducationLevel = Integer.parseInt(scanner.nextLine());
                if (chooseOfEducationLevel > educationLevelOfArray.length) {
                    throw new Exception("Error. Please re-enter.");
                }
                for (int j = 0; j < educationLevelOfArray.length; j++) {
                    educationLevelOfEmployee = educationLevelOfArray[chooseOfEducationLevel - 1];
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        String positionOfEmployee = null;
        while (true) {
            try {
                String[] positionOfArray = {"RECEPTIONIST", "WAITER", "WAITRESS", "EXPERT", "SUPERVISION", "MANAGER", "DIRECTOR"};
                for (int i = 0; i < positionOfArray.length; i++) {
                    System.out.println((i+1) + ". " + positionOfArray[i]);
                }
                System.out.print("Please enter position: ");
                int chooseOfPosition = Integer.parseInt(scanner.nextLine());
                if (chooseOfPosition > positionOfArray.length) {
                    throw new Exception("Error. Please re-enter.");
                }
                for (int i = 0; i < positionOfArray.length; i++) {
                    positionOfEmployee = positionOfArray[chooseOfPosition - 1];
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

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

        boolean isValidOfIdOfEmployeeForEdit;
        boolean checkIdOfEmployeeForEdit;
        String idOfEmployeeForEdit;
        while (true) {
            try {
                checkIdOfEmployeeForEdit = false;
                System.out.print("Please enter the id of the employee to be edit: ");
                idOfEmployeeForEdit = scanner.nextLine();
                isValidOfIdOfEmployeeForEdit = allRegex.validateOfIdPerson(idOfEmployeeForEdit);
                if (!isValidOfIdOfEmployeeForEdit) {
                    throw new Exception("The Id of employee must be in the correct format");
                }
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
                                String newBirthdayOfEmployee;
                                boolean isValidOfNewBirthday;
                                boolean flag;
                                do {
                                    System.out.print("Please enter birthday (dd/mm/yyyy): ");
                                    newBirthdayOfEmployee = scanner.nextLine();
                                    isValidOfNewBirthday = allRegex.validateOfDate(newBirthdayOfEmployee);
                                    if (!isValidOfNewBirthday) {
                                        System.out.println("The birthday must be in the correct format: dd/mm/yyyy");
                                    }
                                    flag = isValidOfNewBirthday && invalidOfBirthday(newBirthdayOfEmployee);
                                } while (!flag);
                                employeeList.get(i).setBirthday(newBirthdayOfEmployee);
                                ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                                break;
                            case 3:
                                String newGenderOfEmployee = null;
                                while (true) {
                                    try {
                                        String[] genderOfArray = {"MALE", "FEMALE", "OTHER"};
                                        for (int j = 0; j < genderOfArray.length; j++) {
                                            System.out.println((j+1) + ". " + genderOfArray[j]);
                                        }
                                        System.out.print("Please enter gender: ");
                                        int chooseOfGender = Integer.parseInt(scanner.nextLine());
                                        if (chooseOfGender > genderOfArray.length) {
                                            throw new Exception("Error. Please re-enter.");
                                        }
                                        for (int j = 0; j < genderOfArray.length; j++) {
                                            newGenderOfEmployee = genderOfArray[chooseOfGender - 1];
                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                employeeList.get(i).setGender(newGenderOfEmployee);
                                ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                                break;
                            case 4:
                                String newIdCardNumberOfEmployee = null;
                                boolean isValidOfNewIdCardNumber;
                                do {
                                    isValidOfNewIdCardNumber = true;
                                    try {
                                        System.out.print("Please enter Id card number: ");
                                        newIdCardNumberOfEmployee = scanner.nextLine();
                                        isValidOfNewIdCardNumber = allRegex.validateOfIdCardNumber(newIdCardNumberOfEmployee);
                                        if (!isValidOfNewIdCardNumber) {
                                            throw new Exception("Error. The Id card number must be in the correct format");
                                        }
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                } while (!isValidOfNewIdCardNumber);
                                employeeList.get(i).setIdCardNumber(newIdCardNumberOfEmployee);
                                ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                                break;
                            case 5:
                                String newPhoneNumberOfEmployee = null;
                                boolean isValidOfNewPhoneNumber;
                                do {
                                    isValidOfNewPhoneNumber = true;
                                    try {
                                        System.out.print("Please enter phone number: ");
                                        newPhoneNumberOfEmployee = scanner.nextLine();
                                        isValidOfNewPhoneNumber = allRegex.validateOfPhoneNumber(newPhoneNumberOfEmployee);
                                        if (!isValidOfNewPhoneNumber) {
                                            throw new Exception("Error. The phone number must be in the correct format");
                                        }
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                } while (!isValidOfNewPhoneNumber);
                                employeeList.get(i).setPhoneNumber(newPhoneNumberOfEmployee);
                                ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                                break;
                            case 6:
                                String newEmailOfEmployee = null;
                                boolean isValidOfNewEmail;
                                do {
                                    isValidOfNewEmail = true;
                                    try {
                                        System.out.print("Please enter email: ");
                                        newEmailOfEmployee = scanner.nextLine();
                                        isValidOfNewEmail = allRegex.validateOfEmail(newEmailOfEmployee);
                                        if (!isValidOfNewEmail) {
                                            throw new Exception("Error. The email must be in the correct format");
                                        }
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                } while (!isValidOfNewEmail);
                                employeeList.get(i).setEmail(newEmailOfEmployee);
                                ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                                break;
                            case 7:
                                String newEducationLevelOfEmployee = null;
                                while (true) {
                                    try {
                                        String[] educationLevelOfArray = {"INTERMEDIATE", "COLLEGE", "UNIVERSITY", "POST GRADUATE"};
                                        for (int j = 0; j < educationLevelOfArray.length; j++) {
                                            System.out.println((j+1) + ". " + educationLevelOfArray[j]);
                                        }
                                        System.out.print("Please enter education level: ");
                                        int chooseOfEducationLevel = Integer.parseInt(scanner.nextLine());
                                        if (chooseOfEducationLevel > educationLevelOfArray.length) {
                                            throw new Exception("Error. Please re-enter.");
                                        }
                                        for (int j = 0; j < educationLevelOfArray.length; j++) {
                                            newEducationLevelOfEmployee = educationLevelOfArray[chooseOfEducationLevel - 1];
                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                EducationLevel newEducationLevel = new EducationLevel();
                                newEducationLevel.setEducationLevel(newEducationLevelOfEmployee);
                                employeeList.get(i).setEducationLevel(newEducationLevel);
                                ReadAndWriteFileOfEmployee.writeEmployeeToFile(filePath, employeeList, false);
                                break;
                            case 8:
                                String newPositionOfEmployee = null;
                                while (true) {
                                    try {
                                        String[] positionOfArray = {"RECEPTIONIST", "WAITER", "WAITRESS", "EXPERT", "SUPERVISION", "MANAGER", "DIRECTOR"};
                                        for (int j = 0; j < positionOfArray.length; j++) {
                                            System.out.println((j+1) + ". " + positionOfArray[j]);
                                        }
                                        System.out.print("Please enter position: ");
                                        int chooseOfPosition = Integer.parseInt(scanner.nextLine());
                                        if (chooseOfPosition > positionOfArray.length) {
                                            throw new Exception("Error. Please re-enter.");
                                        }
                                        for (int j = 0; j < positionOfArray.length; j++) {
                                            newPositionOfEmployee = positionOfArray[chooseOfPosition - 1];
                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
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
                    throw new Exception("Error. The id of customer does not exists in the list. Please re-enter.");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public List<Employee> getList() {
        return ReadAndWriteFileOfEmployee.readEmployeeFromFile(filePath);
    }
    public boolean invalidOfBirthday (String string) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar now = Calendar.getInstance();
        Calendar born = Calendar.getInstance();
        try {
            now.setTime(new Date());
            born.setTime(sdf.parse(string));
            int age = now.get(Calendar.YEAR) - born.get(Calendar.YEAR);
            if (age < 18 || age > 100) {
                throw new InvalidBirthdayException("Exception: Birthday is invalid");
            }
            return true;
        } catch (InvalidBirthdayException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }
}
