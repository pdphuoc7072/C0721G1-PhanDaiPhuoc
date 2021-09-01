package ss17_io_binary_file_va_serialization.bai_tap_optional.copy_file_nhi_phan;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteToFileBinary {
    public static void writeToFileBinary(String filePath, List<Student> listStudent) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listStudent);
            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
