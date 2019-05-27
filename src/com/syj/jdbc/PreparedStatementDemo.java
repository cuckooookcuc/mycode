package com.syj.jdbc;

import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            //加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            //建立连接
            //"jdbc:mysql://host:port/database","root","123456"
             conn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdbc?serverTimezone=GMT",
                    "root", "syj67227229");

            String sql="insert into t_user (username,pwd,regTime) values(?,?,?)";
            ps=conn.prepareStatement(sql);
//            ps.setString(1,"小七");
//            ps.setString(2,"7777");
//            System.out.println("插入一行记录");
//            ps.execute();
            ps.setObject(1,"中八");
            ps.setObject(2,"8888");
            ps.setObject(3,new java.sql.Date(System.currentTimeMillis()));
            System.out.println("插入一行数据");
            ps.execute();

        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }finally {
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
