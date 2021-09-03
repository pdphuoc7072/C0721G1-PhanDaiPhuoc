package utils;

import models.EducationLevel;
import models.Employee;
import models.Position;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileOfEmployee {
    private static final String COMMA_DELIMITER = ",";
    public static List<Employee> readEmployeeFromFile (String filePath) {
        List<Employee> employeeList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] result;
            while ((line = br.readLine()) != null) {
                result = line.split(COMMA_DELIMITER);
                Employee employee = new Employee(result[0], result[1], result[2], result[3], result[4], result[5], result[6],
                                                  new EducationLevel(result[7]), new Position(result[8]));
                employeeList.add(employee);
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
    public static void writeEmployeeToFile (String filePath, List<Employee> employeeList, boolean flag) {
        try {
            FileWriter fw = new FileWriter(filePath, flag);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Employee employee : employeeList) {
                bw.append(employee.getFullName());
                bw.append(COMMA_DELIMITER);
                bw.append(employee.getBirthday());
                bw.append(COMMA_DELIMITER);
                bw.append(employee.getGender());
                bw.append(COMMA_DELIMITER);
                bw.append(employee.getIdCardNumber());
                bw.append(COMMA_DELIMITER);
                bw.append(employee.getPhoneNumber());
                bw.append(COMMA_DELIMITER);
                bw.append(employee.getEmail());
                bw.append(COMMA_DELIMITER);
                bw.append(employee.getIdOfEmployee());
                bw.append(COMMA_DELIMITER);
                bw.append(employee.getEducationLevel().getEducationLevel());
                bw.append(COMMA_DELIMITER);
                bw.append(employee.getPosition().getPosition());
                bw.newLine();
            }
            bw.flush();
            fw.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
