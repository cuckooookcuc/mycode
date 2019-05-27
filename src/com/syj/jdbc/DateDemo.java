package com.syj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class DateDemo {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdbc?serverTimezone=GMT",
                    "root", "syj67227229");

            for (int i = 0; i < 1000; i++) {
                String sql = "insert into t_user (username,pwd,regTime,lastLoginTime) values (?,?,?,?)";
                ps = conn.prepareStatement(sql);
                ps.setObject(1, "中八" + i);
                ps.setObject(2, "8888");
                ps.setObject(3, new java.sql.Date(System.currentTimeMillis()));
                int rand = 100000000 + new Random().nextInt(1000000000);
                java.sql.Timestamp st = new java.sql.Timestamp(System.currentTimeMillis() - rand);
                ps.setTimestamp(4, st);
                ps.execute();
            }

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
