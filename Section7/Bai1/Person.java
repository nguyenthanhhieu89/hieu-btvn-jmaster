package Section7.Bai1;

import java.util.Scanner;

public class Person {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void inf() {
        System.out.println(name);
        System.out.println(age);

    }

    public void input() {
        System.out.println("Nhap name :");
        name = new Scanner(System.in).nextLine();
        System.out.println("Nhap age : ");
        age = new Scanner(System.in).nextInt();
    }
}
