package services.impl;

import models.EducationLevel;
import models.Employee;
import models.Position;
import services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    static List<Employee> listEmployee = new ArrayList<>();
    static {
        listEmployee.add(new Employee("Phan Đại Phước", "01/01/1990", "male",
                                   "123456789", "0905123456", "abcxyz@gmail.com", 1,
                                   new EducationLevel("university"), new Position("expert")));
        listEmployee.add(new Employee("Nguyễn Văn A", "02/08/1994", "male",
                                      "456123789", "0905234098", "xyaghu@gmail.com", 2,
                                      new EducationLevel("college"), new Position("waiter")));
        listEmployee.add(new Employee("Trương Thị B", "08/12/1988", "female",
                                      "578097124", "0901478932", "stuhjk@gmail.com", 3,
                                       new EducationLevel("intermediate"), new Position("receptionist")));
        listEmployee.add(new Employee("Ngô Văn C", "22/6/1992", "male",
                                     "347812390", "0902965438", "aythugf@gmail.com", 4,
                                      new EducationLevel("intermediate"), new Position("waiter")));
        listEmployee.add(new Employee("Hà Thị D", "29/3/1994", "female",
                                      "458124670", "0903409671", "drytui@gmail.com", 5,
                                       new EducationLevel("college"), new Position("waitress")));
    }
    @Override
    public void addList () {
        System.out.print("Please enter full name: ");
        String inputName = scanner.nextLine();
        System.out.print("Please enter birthday (dd/mm/yyyy): ");
        String inputBirthday = scanner.nextLine();
        System.out.print("Please enter gender (male/female): ");
        String inputGender = scanner.nextLine();
        System.out.print("Please enter Id card number: ");
        String inputIdCardNumber = scanner.nextLine();
        System.out.print("Please enter phone number: ");
        String inputPhoneNumber = scanner.nextLine();
        System.out.print("Please enter email: ");
        String inputEmail = scanner.nextLine();
        System.out.print("Please enter Id of the employee: ");
        int inputIdOfEmployee = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter education level (intermediate/college/university/post graduate): ");
        String inputEducationLevel = scanner.nextLine();
        System.out.print("Please enter position (receptionist/waiter:waitress/expert/supervision/manager/director): ");
        String inputPosition = scanner.nextLine();
        EducationLevel educationLevel = new EducationLevel(inputEducationLevel);
        Position position = new Position(inputPosition);
        boolean check = true;
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getIdOfEmployee() == inputIdOfEmployee) {
                System.out.print("Error. The id already exists in the list. Please re-enter. \n");
                check = false;
                break;
            }
            if (inputIdOfEmployee == 0) {
                System.out.print("Error. Id cannot be 0. Please re-enter. \n");
                check = false;
                break;
            }
        }
        if (check) {
            listEmployee.add(new Employee(inputName, inputBirthday, inputGender, inputIdCardNumber, inputPhoneNumber,
                                          inputEmail, inputIdOfEmployee, educationLevel, position));
        }
    }

    @Override
    public void displayList() {
        for (Employee employee : listEmployee) {
            System.out.print(employee.toString() + "\n");
        }
    }

    @Override
    public void editList() {
        System.out.print("Please enter the id of the employee to be edit: ");
        int idOfEmployeeForEdit = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getIdOfEmployee() == idOfEmployeeForEdit) {
                check = true;
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
                int choiceForEdit = Integer.parseInt(scanner.nextLine());
                switch (choiceForEdit) {
                    case 1:
                        System.out.print("Please enter new full name: ");
                        String inputNewName = scanner.nextLine();
                        listEmployee.get(i).setFullName(inputNewName);
                        break;
                    case 2:
                        System.out.print("Please enter new birthday (dd/mm/yyyy): ");
                        String inputNewBirthday = scanner.nextLine();
                        listEmployee.get(i).setBirthday(inputNewBirthday);
                        break;
                    case 3:
                        System.out.print("Please enter new gender (male/female): ");
                        String inputNewGender = scanner.nextLine();
                        listEmployee.get(i).setGender(inputNewGender);
                        break;
                    case 4:
                        System.out.print("Please enter new Id card number: ");
                        String inputNewIdCardNumber = scanner.nextLine();
                        listEmployee.get(i).setIdCardNumber(inputNewIdCardNumber);
                        break;
                    case 5:
                        System.out.print("Please enter new phone number: ");
                        String inputNewPhoneNumber = scanner.nextLine();
                        listEmployee.get(i).setPhoneNumber(inputNewPhoneNumber);
                        break;
                    case 6:
                        System.out.print("Please enter new email: ");
                        String inputNewEmail = scanner.nextLine();
                        listEmployee.get(i).setEmail(inputNewEmail);
                        break;
                    case 7:
                        System.out.print("Please enter new education level (intermediate/college/university/post graduate): ");
                        String inputNewEducationLevel = scanner.nextLine();
                        EducationLevel newEducationLevel = new EducationLevel();
                        newEducationLevel.setEducationLevel(inputNewEducationLevel);
                        listEmployee.get(i).setEducationLevel(newEducationLevel);
                        break;
                    case 8:
                        System.out.print("Please enter new position (receptionist/waiter:waitress/expert/supervision/manager/director): ");
                        String inputNewPosition = scanner.nextLine();
                        Position newPosition = new Position();
                        newPosition.setPosition(inputNewPosition);
                        listEmployee.get(i).setPosition(newPosition);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Error. Please re-enter");
                }
            }
        }
        if (!check) {
            System.out.println("Error. The id already exists in the list or Id cannot be 0. Please re-enter.");
        }
    }
}
