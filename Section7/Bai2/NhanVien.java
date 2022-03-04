package Section7.Bai2;

import java.util.Scanner;

public class NhanVien {
    public int id;
    public String name;
    public int age;


    public void inf() {
        System.out.println("Nhap id nhan vien :");
        id = new Scanner(System.in).nextInt();
        System.out.println("Nhap name :");
        name = new Scanner(System.in).nextLine();
        System.out.println("Nhap age :");
        age = new Scanner(System.in).nextInt();
    }
    public void input () {
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }
}
