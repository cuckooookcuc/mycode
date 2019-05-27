package TestOrm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/***
 * 测试使用Map[]来封装一条记录
 */
public class Demo2 {
    public static void main(String[] args) {
        Connection conn = JDBCUtil.getMysqlConn();
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Object[]> list=new ArrayList<>();
        try {
            ps = conn.prepareStatement("select empname,salary,age from emp where id>?");
            ps.setObject(1,1);
            rs = ps.executeQuery();
            Object[] objs=new Object[3];
            while (rs.next()){
                objs[0]=rs.getString(1);
                objs[1]=rs.getObject(2);
                objs[2]=rs.getObject(3);

                list.add(objs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, ps, conn);
        }

        for (Object[] objs :
                list) {
            System.out.println(""+objs[0] + objs[1] + objs[2]);
        }
    }
}
