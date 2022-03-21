package BtapSection16.SetMap.Service;

import BtapSection16.SetMap.Model.Person;

import java.util.Scanner;

public class PersonServiceImpl implements PersonService{
    @Override
    public void input(Person person) {
        System.out.println("Nhập thông tin person :");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Vui long nhap ID: ");
        person.setId(scan1.nextInt());

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Vui long nhap Name: ");
        person.setName(scan2.next());

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Vui long nhap Age: ");
        person.setAge(scan3.nextInt());
    }

    @Override
    public void inf(Person person) {
        System.out.println("id :" +person.getId());
        System.out.println("Name :" +person.getName());
        System.out.println("Age :" +person.getAge());
    }
}
