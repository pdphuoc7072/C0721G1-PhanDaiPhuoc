package bai_tap_huong_doi_tuong.bai_4.service;

import bai_tap_huong_doi_tuong.bai_4.model.Cadres;
import bai_tap_huong_doi_tuong.bai_4.util.ReadAndWrite;
import bai_tap_huong_doi_tuong.bai_4.util.regex.Regex;

import java.util.List;
import java.util.Scanner;

public class CadresManager {
    private static String path = "src\\bai_tap_huong_doi_tuong\\bai_4\\data\\cadres.csv";
    Regex regex = new Regex();

    public void add () {
        List<Cadres> cadresList = ReadAndWrite.readCadresList(path);
        Scanner scanner = new Scanner(System.in);

        String id;
        boolean checkId;
        boolean isValidOfId;
        boolean flag;
        do {
            checkId = true;
            System.out.print("Hãy nhập mã số cán bộ: ");
            id = scanner.nextLine();
            isValidOfId = regex.validateOfIdCadres(id);
            if (!isValidOfId) {
                System.out.println("Lỗi. Mã số cán bộ phải đúng định dạng");
            }
            for (Cadres cadres : cadresList) {
                if (cadres.getIdOfCadres().equals(id)) {
                    checkId = false;
                    System.out.println("Lỗi. Mã cán bộ đã tồn tại trong danh sách. Hãy nhập lại.");
                }
            }
            flag = isValidOfId && checkId;
        } while (!flag);

        if (checkId) {
            System.out.print("Hãy nhập họ và tên: ");
            String fullName = scanner.nextLine();

            String gender;
            while (true) {
                try {
                    String[] arrayOfGender = {"Nam", "Nữ", "Khác"};
                    for (int i = 0; i < arrayOfGender.length; i++) {
                        System.out.println((i+1) + ". " + arrayOfGender[i]);
                    }
                    System.out.print("Hãy chọn số: ");
                    int chooseForGender = Integer.parseInt(scanner.nextLine());
                    if (chooseForGender > arrayOfGender.length) {
                        throw new Exception("Lỗi. Hãy chọn lại");
                    }
                    gender = arrayOfGender[chooseForGender-1];
                    System.out.println("Bạn đã chọn: " + gender);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.print("Hãy nhập quê quán: ");
            String homeTown = scanner.nextLine();

            String birthday;
            boolean isValidOfBirthday;
            do {
                System.out.print("Hãy nhập ngày tháng năm sinh: ");
                birthday = scanner.nextLine();
                isValidOfBirthday = regex.validateOfBirthday(birthday);
                if (!isValidOfBirthday) {
                    System.out.println("Lỗi. Ngày tháng năm sinh phải đúng định dạng. Hãy nhập lại.");
                }
            } while (!isValidOfBirthday);

            System.out.print("Hãy nhập chuyên môn: ");
            String specialize = scanner.nextLine();

            String educationLevel;
            while (true) {
                try {
                    String[] arrayOfEducationLevel = {"Trung cấp", "Cao đẳng", "Đại học", "Sau đại học"};
                    for (int i = 0; i < arrayOfEducationLevel.length; i++) {
                        System.out.println((i+1) + ". " + arrayOfEducationLevel[i]);
                    }
                    System.out.print("Hãy chọn số: ");
                    int chooseForEducationLevel = Integer.parseInt(scanner.nextLine());
                    if (chooseForEducationLevel > arrayOfEducationLevel.length) {
                        throw new Exception("Lỗi. Hãy chọn lại.");
                    }
                    educationLevel = arrayOfEducationLevel[chooseForEducationLevel-1];
                    System.out.println("Bạn đã chọn: " + educationLevel);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            double coefficientOfSalary;
            while (true) {
                try {
                    System.out.print("Hãy nhập hệ số lương: ");
                    coefficientOfSalary = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }

            double allowance;
            while (true) {
                try {
                    System.out.print("Hãy nhập phụ cấp: ");
                    allowance = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }

            double netSalary = (coefficientOfSalary + allowance) * 450000;

            Cadres cadres = new Cadres(id, fullName, gender, homeTown, birthday, specialize, educationLevel, coefficientOfSalary, allowance, netSalary);

            cadresList.add(cadres);

            ReadAndWrite.writeCadresList(cadresList, path, false);
        }
    }
    public void display () {
        List<Cadres> cadresList = ReadAndWrite.readCadresList(path);
        for (Cadres cadres : cadresList) {
            System.out.println(cadres.toString());
        }
    }
    public void countFemale () {
        List<Cadres> cadresList = ReadAndWrite.readCadresList(path);
        int count = 0;
        for (Cadres cadres : cadresList) {
            if (cadres.getGender().equals("Nữ")) {
                count++;
            }
        }
        System.out.println("Hiện tại trong cơ quan có " + count + " nữ.");
    }
    public void calculateTotalSalary () {
        List<Cadres> cadresList = ReadAndWrite.readCadresList(path);
        int sumOfSalary = 0;
        for (Cadres cadres : cadresList) {
            sumOfSalary += cadres.getNetSalary();
        }
        System.out.println("Hiện tại, tổng lương trong cơ quan là: " + sumOfSalary);
    }
    public void displayCadresIsInformationTechnology () {
        List<Cadres> cadresList = ReadAndWrite.readCadresList(path);
        String string = "Công nghệ thông tin";
        boolean flag = false;
        for (Cadres cadres : cadresList) {
            if (cadres.getSpecialize().equals(string)) {
                flag = true;
                System.out.println(cadres.toString());
            }
        }
        if (!flag) {
            System.out.println("Hiện tại trong cơ quan không có cán bộ có chuyên môn là: " + string);
        }
    }
}
