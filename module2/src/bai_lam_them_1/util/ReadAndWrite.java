package bai_lam_them_1.util;

import bai_lam_them_1.model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static void writeStringList (List<String> stringList, String path, boolean check) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file, check);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeContactList (List<Contact> contactList, String path, boolean check) {
        List<String> stringList = new ArrayList<>();
        for (Contact contact : contactList) {
            stringList.add(contact.getStringToCSV());
        }
        writeStringList(stringList, path, check);
    }
    private static List<String> readStringList (String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<Contact> readContactList (String path) {
        List<Contact> contactList = new ArrayList<>();
        List<String> stringList = readStringList(path);
        for (String string : stringList) {
            String[] arrayString = string.split(",");
            Contact contact = new Contact(Integer.parseInt(arrayString[0]), arrayString[1], arrayString[2], arrayString[3], arrayString[4], arrayString[5], arrayString[6], arrayString[7]);
            contactList.add(contact);
        }
        return contactList;
    }
}
