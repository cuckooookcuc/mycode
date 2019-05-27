package TestOrm;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {

    static Properties pros = null;

    static {
        pros = new Properties();

        try {
            pros.load(Thread.currentThread().getContextClassLoader().
                    getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getMysqlConn() {
        try {
            Class.forName(pros.getProperty("mysqlDriver"));
            return DriverManager.getConnection(
                    pros.getProperty("mysqlURL"),
                    pros.getProperty("mysqlUser"),
                    pros.getProperty("mysqlPwd"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void close(ResultSet rs, Statement ps, Connection conn) {
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

    public static void close(Statement ps, Connection conn) {
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

    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}

