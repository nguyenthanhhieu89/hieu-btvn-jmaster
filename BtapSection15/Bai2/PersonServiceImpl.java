package BtapSection15.Bai2;

import BtapSection15.Bai1.Person;

import java.util.Scanner;

public class PersonServiceImpl implements PersonService{
    @Override
    public void input(Person p) {
        System.out.println("Nhập thông tin sinh viên :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id :");
        p.setId(sc.nextInt());

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập tên:");
        p.setName(sc1.nextLine());

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhập tuổi :");
        p.setAge(sc2.nextInt());
    }

    @Override
    public void info(Person p) {
        System.out.println("ID :" +p.getId());
        System.out.println("Name :" +p.getName());
        System.out.println("Age :" +p.getAge());
        System.out.println("_____________________________");
    }
}
