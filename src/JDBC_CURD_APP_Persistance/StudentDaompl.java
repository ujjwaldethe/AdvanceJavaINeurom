package JDBC_CURD_APP_Persistance;

import JDBC.JDBCStandardApp2;
import JDBC_CURD_APP_dto.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

//Persistance Logic USing JDBC API
public class StudentDaompl implements IstudentDao{
    Connection conn = null;
    PreparedStatement ps = null;
    String sqlInsertQuery  = "Insert into students (`name`,`age`,`address`) values (?,?,?)";
    @Override
    public String addStudent(String sname, Integer sage, String address) {
        try {
            conn = JDBCStandardApp2.getJDBCConnection();
            if(conn!=null)
            {
                ps = conn.prepareStatement(sqlInsertQuery);
            }
            if(ps!=null)
            {
                ps.setString(1,sname);
                ps.setInt(2,sage);
                ps.setString(3,address);

                int rowAffected= ps.executeUpdate();
                if(rowAffected==1)
                {
                    return "Success";
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return "Failed";
    }

    @Override
    public Student searchStudent(Integer id) {
        return null;
    }

    @Override
    public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
        return null;
    }

    @Override
    public String deleteStudent(Integer sid) {
        return "";
    }
}
