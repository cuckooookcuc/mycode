package Practice;

import java.io.*;

public class Sample {
    public static void main(String[] args)
    {
        StringBuilder stringBuilder=new StringBuilder();
        //准备好要放的文本TXT地址
        String filepath=System.getProperty("user.dir");
        String filepath2=System.getProperty("user.dir");
        filepath+="\\data.txt";
        filepath2+="\\data2.txt";

        try
        {
            //新建第一个地址
            File file = new File(filepath);
            if (!file.exists())
            {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            //生成随机数
            for (int i = 0; i < 10; i++)
            {
                bw.write(String.valueOf((int) (Math.random()*10)));
                bw.newLine();
            }
            bw.close();
            fw.close();


            //读取第一个TXT中的字符串
            FileInputStream inp = new FileInputStream(filepath);
            byte[] b = new byte[1024];
            //在此处加上循环
            int hasRead=0;
            //while((hasRead=inp.read(b))>0)
            //{
                //int length = inp.read(b);
                String s = new String(b, 0, hasRead);
                String[] array=s.split("\\r?\\n");
                //stringBuilder.append(s);
            //}
            inp.close();


            //将提取的字符串进行处理得到需要的数组
            //String[] array=s.split("\\r?\\n");
            ////stringBuilder.
            int[] result =new int[array.length];

            //新建第二个文本并放入
            File file2 = new File(filepath2);
            if (!file2.exists())
            {
                file2.createNewFile();
                System.out.println("data2.txt创建完成");
            }
            FileWriter fw2 = new FileWriter(file2);
            BufferedWriter bw2 = new BufferedWriter(fw2);

            for (int i = 0; i < 10; i++)
            {
                result[i]=Integer.parseInt(array[i])*2;
                bw2.write(String.valueOf(result[i]));
                bw2.newLine();
            }
            bw2.close();
            fw2.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
