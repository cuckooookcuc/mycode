package com.syj.jdbc;

import java.sql.*;

public class BatchDemo {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            //建立连接
            //"jdbc:mysql://host:port/database","root","123456"
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdbc?serverTimezone=GMT",
                    "root", "syj67227229");
            conn.setAutoCommit(false);//设为手动提交
            long start = System.currentTimeMillis();
            stmt = conn.createStatement();
            for (int i = 0; i < 1000; i++) {
                stmt.addBatch(
                        "insert into t_user(username,pwd,regTime) values ('s" + i + "',123,now())");
            }
            stmt.executeBatch();
            conn.commit();
            long end = System.currentTimeMillis();
            System.out.println("耗时" + (end - start));

        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
            try {
                if (stmt != null) {
                    stmt.close();
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
