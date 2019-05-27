import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Transfer {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(
                System.getProperty("user.dir") +
                        "\\UDP编程.JPG");
             FileOutputStream outputStream = new FileOutputStream(
                     System.getProperty("user.dir")
                             + "\\Twice.JPG")
        ) {
            int hasRead = 0;
            byte[] buff = new byte[1024];
            while ((hasRead = fileInputStream.read(buff)) > 0) {
                outputStream.write(buff, 0, hasRead);
            }
            System.out.println("完成传输");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
