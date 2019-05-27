package performance;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test {
    /**
     * 主方法
     */

    public static String GetUserId(String code) throws Exception {
        String Path1 = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?"
                + "corpid=wwec783c318a911670"
                + "&"
                + "corpsecret=l3WzyOngkofRFyjTZN5hpcOUkI9X-i3B7QRXYTASAqw";
        String target1 = "access_token";

        String Path2 = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?"
                + "access_token=" + GetChatId(Path1, target1)
                + "&"
                + code;//"code=Z5ZO0cOPorCzGsxn1hLrXMQ5Vd9eExwEhQlFOeDOu6s";
        String target2 = "UserId";
        return GetChatId(Path2, target2);
    }

    /**
     * 从输入的微信API，获得目标数据,获得access_token
     */

    public static String GetChatId(String Path, String target) throws Exception {
        String result = "";
        URL url = new URL(Path);
        //调用openConnection方法获得对象实例
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //设置请求方式
        conn.setRequestMethod("GET");
        //设置连接超时
        conn.setConnectTimeout(5000);
        //获得返回输入流
        InputStream in = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String str = "";
        while ((str = br.readLine()) != null) {
            result += str;
        }
        result = getTarget(result, target);
        br.close();
        in.close();
        return result;
    }

    /**
     * 获得下一个字符，当以""分割时
     */

    public static String getTarget(String str, String target) {
        String[] st = str.split("\"");
        for (int i = 0; i < st.length; i++) {
            if (st[i].equals(target)) {
                return st[i + 2];
            }
        }
        return null;
    }
}
