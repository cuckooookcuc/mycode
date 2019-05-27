package performance;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

class Secret{
    public int errcode;
    public String errmsg;
    public String access_token;
    public int expires_in;

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public String toString() {
        return "Secret [errcode=" + errcode + ", errmsg=" + errmsg + ", access_token="
                + access_token + ", expires_in=" + expires_in + "]";
    }
}

public class Demo01 {
    public static void main(String[] args) throws Exception {
        String Path1 = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?"
                + "corpid=wwec783c318a911670"
                + "&"
                + "corpsecret=l3WzyOngkofRFyjTZN5hpcOUkI9X-i3B7QRXYTASAqw";
        String target1="access_token";

        String Path2 = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?"
                + "access_token="+GetChatId(Path1,target1)
                + "&"
                + "code=Z5ZO0cOPorCzGsxn1hLrXMQ5Vd9eExwEhQlFOeDOu6s";//code需不需要帮忙截出来提供
        String target2="UserId";
        System.out.println(GetChatId(Path2,target2));
    }

    public static String GetAcess_token() throws Exception {
        String result = "";
        String Path = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?"
                + "corpid=wwec783c318a911670"
                + "&"
                + "corpsecret=l3WzyOngkofRFyjTZN5hpcOUkI9X-i3B7QRXYTASAqw";
        //创建URL地址
        URL url = new URL(Path);
        //调用openConnection方法获得对象实例
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //设置请求方式
        conn.setRequestMethod("GET");
        //设置连接超时
        conn.setConnectTimeout(10000);
//        if (conn.getResponseCode() == 0) {
        //获得返回输入流
        InputStream in = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String str = "";
        while ((str = br.readLine()) != null) {
            result += str;
        }
        br.close();
        in.close();

        return result;
    }

    /**
     *从输入的微信API，获得目标数据
     */

    public static String GetChatId(String Path,String target) throws Exception {
        String result = "";
//        String Path = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?"
//                + "access_token=ilX6nCzzKcSoR5ibFmFCjQzHn0dqyd7wg8uA-pvdlyDTGxIZTceQ7PSmoju92k7-fjcIFVIfzSj2a-XeO_19jFL3LjgPTB4acxHshM-6tABMdBLhXOnhFxXs8JeqEKz0X0Z_x8WwqvEONAW-isxGCIsZ45xtagcnynng9jHfi5KLLBgFc8iwlmNPt97PzvCt48gZXvQ3nsuL1gMu-LL4yg"
//                + "&"
//                + "code=tgCeOXxZb-NnFfwARPH7PAGyTbgaQevGICVm0QgEfPE";
        //创建URL地址
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
        //使用自制getTarget方法
        //result=getTarget(br.readLine(),target);
        while ((str = br.readLine()) != null) {
            result += str;
        }
        result=getTarget(result,target);
        br.close();
        in.close();
        return result;
    }

    /**
     * 获得下一个字符，当以""分割时
     */

    public static String getTarget(String str, String target) {
        String[] st = str.split("\"");

        for (String s :
                st) {
            System.out.println(s);
        }

        for (int i = 0; i < st.length; i++) {
            if (st[i].equals(target)) {
//                System.out.println(st[i+2]);
                return st[i + 2];
            }
        }
        return null;
    }

}
