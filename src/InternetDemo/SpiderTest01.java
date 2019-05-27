package InternetDemo;

import sun.nio.cs.UTF_32;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * 网络爬虫原理
 */
public class SpiderTest01 {
        public static void main(String[] args) throws Exception
        {
            URL url=new URL("https://www.dianping.com");
            InputStream is=url.openStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String msg=null;
            while ((msg= br.readLine())!=null)
            {
                System.out.println(msg);
            }
            br.close();
            //分析
            //处理
        }
}
