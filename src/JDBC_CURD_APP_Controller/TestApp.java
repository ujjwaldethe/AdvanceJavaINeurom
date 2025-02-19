package JDBC_CURD_APP_Controller;

import IStudentService.StudentServiceFactory;
import JDBC_CURD_APP_Service.IStudentService;
import JDBC_CURD_APP_dto.Student;
import java.util.Scanner;

//Controller Logic
public class TestApp {



    public static void main(String[] args) {
        String name;
        Integer age;
        String address;
        String msg ;
        IStudentService studentService = StudentServiceFactory.getStudentService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Enter Age : ");
        age = sc.nextInt();
        System.out.println("Enter Address : ");
        address = sc.next();

        msg = studentService.addStudent(name,age,address);
        if(msg.equalsIgnoreCase("success"))
        {
            System.out.println("Record Inserted Successfully");
        }
        else
        {
            System.out.println("Record Insertion UnSuccessful");
        }
    }
}
