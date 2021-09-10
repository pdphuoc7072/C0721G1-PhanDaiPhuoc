package bai_lam_them_fix_bug_tuan_4.util;

import bai_lam_them_fix_bug_tuan_4.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static void writeToCSV(String path,List<String> list,boolean append){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line: list){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeListStudentToCSV(String path, List<Student> listStudent, boolean append){
        List<String> listString =new  ArrayList<>();
        for (Student student: listStudent){
            listString.add(student.toStringSaveCSV());
        }
        writeToCSV(path,listString,append);
    }

    private static List<String> readFromCSV(String path){
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while ((line=bufferedReader.readLine())!=null){
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<Student> getListStudent(String path){
        List<String> listString =readFromCSV(path);
        List<Student> studentList=new ArrayList<>();
        for (int i=0;i<listString.size();i++){
            String[] array =listString.get(i).split(",");
            Student student = new Student(array[0],Integer.parseInt(array[1]),array[2]);
            studentList.add(student);
        }
        return studentList;
    }

}
