package bai_lam_them_1.service.impl;

import bai_lam_them_1.model.Contact;
import bai_lam_them_1.service.IContactService;
import bai_lam_them_1.util.ReadAndWrite;
import bai_lam_them_1.util.regex.Regex;

import java.util.List;
import java.util.Scanner;

public class ContactServiceImpl implements IContactService {
    private static final String PATH = "src\\bai_lam_them_1\\data\\contact.csv";
    static Scanner scanner = new Scanner(System.in);
    Regex regex = new Regex();

    @Override
    public void add() {
        List<Contact> contactList = ReadAndWrite.readContactList(PATH);

        int id = 0;
        if (contactList.isEmpty()) {
            id = 1;
        } else {
            id = contactList.get(contactList.size() - 1).getId() + 1;
        }

        String fullName;
        boolean isValidOfFullName;
        do {
            System.out.print("Hãy nhập họ và tên: ");
            fullName = scanner.nextLine();
            isValidOfFullName = regex.validateOfFullName(fullName);
            if (!isValidOfFullName) {
                System.out.println("Lỗi. Họ tên phải đúng định dạng. Hãy nhập lại");
            }
        } while (!isValidOfFullName);

        String phoneNumber;
        boolean isValidOfPhoneNumber;
        do {
            System.out.print("Hãy nhập số điện thoại: ");
            phoneNumber = scanner.nextLine();
            isValidOfPhoneNumber = regex.validateOfPhoneNumber(phoneNumber);
            if (!isValidOfPhoneNumber) {
                System.out.println("Lỗi. Số điện thoại phải đúng định dạng. Hãy nhập lại");
            }
        } while (!isValidOfPhoneNumber);

        System.out.print("Hãy nhập địa chỉ: ");
        String address = scanner.nextLine();

        String email;
        boolean isValidOfEmail;
        do {
            System.out.print("Hãy nhập email: ");
            email = scanner.nextLine();
            isValidOfEmail = regex.validateOfEmail(email);
            if (!isValidOfEmail) {
                System.out.println("Lỗi. Email phải đúng định dạng. Hãy nhập lại");
            }
        } while (!isValidOfEmail);

        System.out.print("Hãy nhập facebook: ");
        String facebook = scanner.nextLine();

        String gender;
        while (true) {
            try {
                String[] arrayOfGender = {"male", "female", "other"};
                for (int i = 0; i < arrayOfGender.length; i++) {
                    System.out.println((i + 1) + ". " + arrayOfGender[i]);
                }
                System.out.print("Hãy chọn số: ");
                int chooseOfGender = Integer.parseInt(scanner.nextLine());
                gender = arrayOfGender[chooseOfGender - 1];
                System.out.println("Bạn đã chon: " + gender);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String birthday;
        boolean isValidOfBirthday;
        do {
            System.out.print("Hãy nhập ngày sinh: ");
            birthday = scanner.nextLine();
            isValidOfBirthday = regex.validateOfBirthday(birthday);
            if (!isValidOfBirthday) {
                System.out.println("Lỗi. Ngày sinh phải đúng định dạng. Hãy nhập lại");
            }
        } while (!isValidOfBirthday);

        Contact contact = new Contact(id, fullName, phoneNumber, address, email, facebook, gender, birthday);
        contactList.add(contact);
        ReadAndWrite.writeContactList(contactList, PATH, false);
    }

    @Override
    public void display() {
        List<Contact> contactList = ReadAndWrite.readContactList(PATH);
        for (Contact contact : contactList) {
            System.out.println(contact.toString());
        }
    }

    @Override
    public void edit() {
        List<Contact> contactList = ReadAndWrite.readContactList(PATH);
        System.out.print("Hãy nhập số điện thoại cần sửa: ");
        String phoneNumberForEdit = scanner.nextLine();
        boolean flag = false;
        for (Contact contact : contactList) {
            if (contact.getPhoneNumber().equals(phoneNumberForEdit)) {
                flag = true;
                System.out.println("Bạn muốn sửa gì?");
                System.out.println("1. Sửa tên");
                System.out.println("2. Sửa số điện thoại");
                System.out.println("3. Sửa địa chỉ");
                System.out.println("4. Sửa email");
                System.out.println("5. Sửa facebook");
                System.out.println("6. Sửa giới tính");
                System.out.println("7. Sửa ngày sinh");
                System.out.println("0. Quay về menu chính");
                System.out.print("Hãy chọn chức năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.print("Hãy nhập tên mới: ");
                        String fullNameNew = scanner.nextLine();
                        contact.setFullName(fullNameNew);
                        ReadAndWrite.writeContactList(contactList, PATH, false);
                        break;
                    case 2:
                        System.out.print("Hãy nhập số điện thoại mới: ");
                        String phoneNumberNew = scanner.nextLine();
                        contact.setPhoneNumber(phoneNumberNew);
                        ReadAndWrite.writeContactList(contactList, PATH, false);
                        break;
                    case 3:
                        System.out.print("Hãy nhập địa chỉ mới: ");
                        String addressNew = scanner.nextLine();
                        contact.setAddress(addressNew);
                        ReadAndWrite.writeContactList(contactList, PATH, false);
                        break;
                    case 4:
                        System.out.print("Hãy nhập email mới: ");
                        String emailNew = scanner.nextLine();
                        contact.setEmail(emailNew);
                        ReadAndWrite.writeContactList(contactList, PATH, false);
                        break;
                    case 5:
                        System.out.print("Hãy nhập facebook mới: ");
                        String facebookNew = scanner.nextLine();
                        contact.setFacebook(facebookNew);
                        ReadAndWrite.writeContactList(contactList, PATH, false);
                        break;
                    case 6:
                        System.out.print("Hãy nhập giới tính mới: ");
                        String genderNew = scanner.nextLine();
                        contact.setGender(genderNew);
                        ReadAndWrite.writeContactList(contactList, PATH, false);
                        break;
                    case 7:
                        System.out.print("Hãy nhập ngày sinh mới: ");
                        String birthdayNew = scanner.nextLine();
                        contact.setBirthday(birthdayNew);
                        ReadAndWrite.writeContactList(contactList, PATH, false);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Lỗi");
                }
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy số điện thoại cần sửa trong danh bạ");
        }
    }

    @Override
    public void delete() {
        List<Contact> contactList = ReadAndWrite.readContactList(PATH);
        System.out.print("Hãy nhập số điện thoại cần xóa: ");
        String phoneNumberForDelete = scanner.nextLine();
        boolean flag = false;
        for (Contact contact : contactList) {
            if (contact.getPhoneNumber().equals(phoneNumberForDelete)) {
                flag = true;
                contactList.remove(contact);
                ReadAndWrite.writeContactList(contactList, PATH, false);
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy số điện thoại cần xóa trong danh bạ");
        }
    }

    public void searchByName() {
        List<Contact> contactList = ReadAndWrite.readContactList(PATH);
        System.out.print("Hãy nhập tên cần tìm: ");
        String nameForSearch = scanner.nextLine();
        boolean flag = false;
        for (Contact contact : contactList) {
            if (contact.getFullName().contains(nameForSearch)) {
                flag = true;
                System.out.println(contact);
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy tên trong danh bạ");
        }
    }

    public void searchByNumberPhone() {
        List<Contact> contactList = ReadAndWrite.readContactList(PATH);
        System.out.print("Hãy nhập số điện thoại cần tìm: ");
        String numberPhoneForSearch = scanner.nextLine();
        boolean flag = false;
        for (Contact contact : contactList) {
            if (contact.getPhoneNumber().contains(numberPhoneForSearch)) {
                flag = true;
                System.out.println(contact);
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy số điện thoại trong danh bạ");
        }
    }
}
