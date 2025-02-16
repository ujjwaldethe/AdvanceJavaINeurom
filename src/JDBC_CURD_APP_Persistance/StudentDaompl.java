package JDBC_CURD_APP_Persistance;

import JDBC_CURD_APP_dto.Student;

public class StudentDaompl implements IstudentDao{
    @Override
    public String addStudent(String sname, Integer sage, String address) {
        return "";
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
