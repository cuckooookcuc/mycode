package IOFile;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsoluteFile().getParent());
//        File tmp;
//        tmp = File.createTempFile("ssfrfr", ".txt", file);
//        tmp.deleteOnExit();
//        File file1 = new File(System.currentTimeMillis() + ".txt");
//        System.out.println(file1.exists());
//        file1.createNewFile();
//        System.out.println(file1.mkdir());
//        String[] fileList=file.list();
//        System.out.println("********");
//        for (String fileName :
//                fileList) {
//            System.out.println(fileName);
//        }
//        File[] root=File.listRoots();
//        for (File fileName :
//                root) {
//                System.out.println(root);
//
//        }

    }
}
