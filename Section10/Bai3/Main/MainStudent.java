package Section10.Bai3.Main;

import Section10.Bai3.Model.Student;
import Section10.Bai3.Service.StudentImpl;
import Section10.Bai3.Service.StudentService;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        StudentService studentService = new StudentImpl();
        System.out.println("vui long nhap so luong student :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            studentService.input(students[i]);
        }

        for (Student student : students) {
            studentService.info(student);
        }


        Student st = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAge() > st.getAge()) {
                st = students[i];
            }
        }
        System.out.println("Sinh vien co so tuoi lon nhat la :");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAge() == st.getAge()) {
                studentService.info(students[i]);
            }
        }
    }
}
