package com.syj.jdbc;

import java.sql.*;

public class ResultSetDemo {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            //加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            //建立连接
            //"jdbc:mysql://host:port/database","root","123456"
             conn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdbc?serverTimezone=GMT",
                    "root", "syj67227229");

            //String sql="select * from t_user where id>?";
            String sql="select id,username,pwd from t_user where id>?";
            ps=conn.prepareStatement(sql);
            ps.setObject(1,5);
            rs=ps.executeQuery();
            System.out.println("提取数据");
            while ((rs.next()))
            {
                System.out.println(rs.getInt(1)+"---"
                +rs.getString(2)+"---"
                +rs.getString(3));
            }

        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }finally {

            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
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
