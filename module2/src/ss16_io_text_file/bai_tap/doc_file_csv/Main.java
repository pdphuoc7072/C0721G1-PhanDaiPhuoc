package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static void printCountry (List<String> country) {
        System.out.println(
                "Country {" +
                        "id = " + country.get(0) +
                        ", code = " + country.get(1) +
                        ", name = " + country.get(2) +
                        '}');
    }
    private static List<String> parseCsvLine (String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (String i : splitData) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào đường dẫn của file .csv: ");
        String inPath = scanner.nextLine();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inPath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
