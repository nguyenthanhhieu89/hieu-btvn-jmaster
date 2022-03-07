package BtapSection8;

import java.util.Scanner;

public class Car {
    private String hangXe;
    private String quocGiaSanXuat;
    private Person owner;

    public Car() {
    }

    public Car(String hangXe, String quocGiaSanXuat, Person owner) {
        hangXe = hangXe;
        this.quocGiaSanXuat = quocGiaSanXuat;
        this.owner = owner;
    }

    public void input () {
        System.out.println("Nhap hang xe :");
        hangXe = new Scanner(System.in).nextLine();
        System.out.println("Nhap quoc gia san xuat");
        quocGiaSanXuat = new Scanner(System.in).nextLine();
    }
    public void inf() {
        System.out.println(hangXe);
        System.out.println(quocGiaSanXuat);


    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public String getQuocGiaSanXuat() {
        return quocGiaSanXuat;
    }

    public void setQuocGiaSanXuat(String quocGiaSanXuat) {
        this.quocGiaSanXuat = quocGiaSanXuat;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
