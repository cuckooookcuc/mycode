package com.syj.jdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateDemo2 {
    public static  long str2Date(String dateStr) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            return format.parse(dateStr).getTime();
        } catch (ParseException pe) {
            pe.printStackTrace();
            return 0;
        }
    }

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdbc?serverTimezone=GMT",
                    "root", "syj67227229");

            ps=conn.prepareStatement("select * from t_user where regTime>? and regTime<?");
            java.sql.Date start=new java.sql.Date(str2Date("2019-3-10 10:23:45"));
            java.sql.Date end=new java.sql.Date(str2Date("2019-3-20 10:23:45"));
            ps.setObject(1,start);
            ps.setObject(2,end);
            rs=ps.executeQuery();
            System.out.println("符合要求的有");
            while (rs.next()){
                System.out.println(rs.getInt("id")+"--"+rs.getString("username")
                +rs.getDate("regTime"));
            }
            //ps.setClob(2,new FileReader(new File("d:/a.txt")));
            //ps.setClob(2,new BufferedReader(new InputStreamReader(new ByteArrayInputStream("aa".getBytes()))));
            //ps=conn.prepareStatement("select * from t_user where id=?");
            //ps.setObject(1,134);
            //rs=ps.executeQuery();
            //while(rs.next()){Clob c=rs.getClob("myInfo");}
            //Reader r=c.getCharacterStream();
            //int temp=0;
            //while((temp=r.read())!=-1){System.out.print((char)temp);}
            //记得关闭r,这里没写
            //ps.executeUpdate();

            //处理大数据图片

//            ps.setBlob(2,new FileInputStream("d://"));
//            ps.execute();

            //取blob
//            rs=ps.executeQuery();
//            while (rs.next()){
//                Blob b=rs.getBlob("headImg");
//                is=b.getBinaryStream();
//            os=new FileOutputStream("d;//");
//                int temp=0;
//                while ((temp=is.read())!=-1)
//                {
//                   os.write(temp);
//                }
//            }

        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
        }
    }
}
