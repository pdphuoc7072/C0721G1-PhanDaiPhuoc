package ss17_io_binary_file_va_serialization.bai_tap_optional.copy_file_nhi_phan;

import java.io.*;

public class CopyFileBinary {
    public static void copyFileBinary (String sourcePath, String targetPath) {
        try {
            File file = new File(sourcePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            InputStream is = new FileInputStream(file);
            OutputStream os = new FileOutputStream(targetPath);
            int readEverByte;
            int count = 0;
            while ((readEverByte = is.read()) != -1) {
                os.write(readEverByte);
                count++;
            }
            System.out.println("Hoàn thành. Số ký tự đã copy là: " + count);
            is.close();
            os.close();
        } catch (Exception e) {
            System.err.println("Tệp nguồn không tồn tại hoặc tập tin đích đã tồn tại. ");
        }
    }
}
