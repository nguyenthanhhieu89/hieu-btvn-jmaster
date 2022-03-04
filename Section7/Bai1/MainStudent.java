package Section7.Bai1;

import Section7.Bai1.Student;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        System.out.println("Nhap so luong student : ");
        int a = new Scanner(System.in).nextInt();
        Student[] students = new Student[a];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(a);
            students[i].input();
        }

        for (int i = 0; i < students.length; i++) {
            students[i].inf();
        }
    }
}
