package com.syj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo5 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement ps1=null;
        PreparedStatement ps2=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdbc?serverTimezone=GMT",
                    "root", "syj67227229");

            conn.setAutoCommit(false);

            ps1=conn.prepareStatement("insert into t_user (username,pwd) values(?,?)");
            ps1.setObject(1,"大舅");
            ps1.setObject(2,"9999");
            ps1.execute();
            System.out.println("插入一个用户1");

            try {
                Thread.sleep(6000);
            }catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }

            ps2=conn.prepareStatement("insert into t_user (username,pwd) values(?,?)");
            ps2.setObject(1,"error");
            ps2.setObject(2,"9999");
            ps2.execute();
            System.out.println("插入一个用户2");


            conn.commit();

        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
            try{conn.rollback();}catch (SQLException e){e.printStackTrace();}
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }finally {
            try {
                if (ps2 != null) {
                    ps2.close();
                }
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
            try {
                if (ps1 != null) {
                    ps1.close();
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
