package IOFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;

/**
 * 2019/5/25
 * IO流测试
 */

class myFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        System.out.println("文件夹名："+dir+"文件名"+name);

        return name.endsWith("txt");
    }
}
public class FilePractice {

    public static void main(String[] args){
//        File file = new File(".");
//        File file2 = new File("../a.txt");
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file2.getAbsoluteFile());
////        if(file2.exists()){
////            System.out.println("already");
////            file2.getName();
////        }
////        else {
////            System.out.println("no");
////        }
//      File[] listFiles = file.listFiles(new myFilter());
//
//        for (File f :
//                listFiles) {
//            System.out.println("***"+f.getName());
//        }
        try/*(FileInputStream fileInputStream = new FileInputStream(new File("A.txt"))) */{
            FileInputStream fileInputStream = new FileInputStream(new File("A.txt"));
//            int read =0;
//                File filr = new File("A.txt");
//                for (int i=0; i<filr.length();i++){
//                    read = fileInputStream.read();
//                    System.out.println("读到的内容是"+(char)read);}
//            int content =0;
//            while ((content=fileInputStream.read())!=0){
//                System.out.println((char) content);
//            }
            byte[] bytes = new byte[4];
            int co;
            while ((co = fileInputStream.read(bytes))!=-1){
                System.out.print(new String(bytes,0,co));
            }

            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
