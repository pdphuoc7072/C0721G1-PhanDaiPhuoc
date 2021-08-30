package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile (String filePath) {
        List<Integer> listInteger = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                listInteger.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc có nội dung lỗi");
        }
        return listInteger;
    }
    public void writeFile (String filePath, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là " + max + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
