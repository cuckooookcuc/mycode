package Practice;

public class Test01 {
    public static void main(String[] args)
    {
//        System.out.println(getMySttttttr());
        String s="zGdv3M8VQIEduiSPm1OBf1Fuv-98lYt9Bs38nc0dokEDBy_e9uO8jgk_0dJzuol1w_NPCZffKNAwlYeIX39sjTpaivW6SrtvJwfEl1ebREk_fMA3HF-JdG7vx5uNDPpDES12XJzomPuAz4iFm-zrqHuoyOTT9r7J7LnZfHPe7pjR3NT15kkPUrYMCKuKl_qocm-6_yL64eJx0ef_4AN3Hw";
        System.out.println(s);
    }

     static String getMySttttttr()
    {
        String str="{\"UserId\":\"ShengYaJie\",\"DeviceId\":\"10000551685640AL\",\"errcode\":0,\"errmsg\":\"ok\"}";
        String[] st=str.split("\"");
        for (int i=0;i<str.length();i++)
        {
            if (st[i].equals("UserId"))
            {
                return st[i+2];
            }
        }
        return null;
    }
}
