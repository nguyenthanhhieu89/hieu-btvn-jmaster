package Section10.Bai3.Service;

import Section10.Bai3.Model.Student;

import java.util.Scanner;

public class StudentImpl implements StudentService {

    @Override
    public void input(Student student) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Vui long nhap id");
        student.setId(sc1.nextInt());

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Vui long nhap name");
        student.setName(sc1.nextLine());

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Vui long nhap age");
        student.setAge(sc3.nextInt());
    }

    @Override
    public void info(Student student) {
        System.out.println("name : " + student.getName() + "\n id :" + student.getId() + "" +
                "\n Age : " + student.getAge());
    }



}
