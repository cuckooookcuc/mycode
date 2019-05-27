package Practice;

import java.io.*;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args)
    {
        ArrayList<String>arrayList=new ArrayList<>();
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

            //读取每行TXT中的字符串
            InputStreamReader inp = new InputStreamReader(new FileInputStream(filepath));
            BufferedReader bf=new BufferedReader(inp);
            String str;
            while((str=bf.readLine())!=null)
            {
                arrayList.add(str);
            }
            bf.close();
            inp.close();

            //新建第二个文本并放入
            File file2 = new File(filepath2);
            if (!file2.exists())
            {
                file2.createNewFile();
            }
            FileWriter fw2 = new FileWriter(file2);
            BufferedWriter bw2 = new BufferedWriter(fw2);

            int[] result =new int[arrayList.size()];//?

            for (int i = 0; i < 10; i++)
            {
                result[i]=Integer.parseInt(arrayList.get(i))*2;
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
