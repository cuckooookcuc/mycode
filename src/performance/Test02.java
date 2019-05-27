package performance;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test02 {
    public static void main(String[] args) throws Exception {
        String Path = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?"
                + "corpid=wwec783c318a911670"
                + "&"
                + "corpsecret=l3WzyOngkofRFyjTZN5hpcOUkI9X-i3B7QRXYTASAqw";
        //String target = "access_token";
        String result = "";


        URL url = new URL(Path);
        //调用openConnection方法获得对象实例
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //设置请求方式
        conn.setRequestMethod("GET");
        conn.setRequestProperty("accept", "*/*");
        conn.setRequestProperty("connection", "Keep-Alive");
        conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
       conn.setUseCaches(false);
        conn.connect();
        //设置连接超时
        //conn.setConnectTimeout(5000);
        //获得返回输入流
        InputStream in = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String str = "";
        while ((str = br.readLine()) != null) {
            result += str;
        }
        //


//        result = getTarget(result, target);
        br.close();
        in.close();
        conn.disconnect();

    }
}
