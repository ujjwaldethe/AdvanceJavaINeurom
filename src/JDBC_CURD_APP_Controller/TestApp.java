package JDBC_CURD_APP_Controller;

import IStudentService.StudentServiceFactory;
import JDBC_CURD_APP_Service.IStudentService;
import JDBC_CURD_APP_dto.Student;
//Controller Logic
public class TestApp {
    public static void main(String[] args) {
        IStudentService studentService = StudentServiceFactory.getStudentService();
        String msg = studentService.addStudent("Ujjwal",21,"MI");
        if(msg.equalsIgnoreCase("success"))
        {
            System.out.println("Record Inserted Successfully");
        }
        else {
            System.out.println("Record Insertion UnSuccessful");
        }
    }
}
