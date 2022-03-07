package BtapSection8;

import java.util.Scanner;

public class Nation {
    private String quocGia;
    private Person [] persons;

    public Nation() {
    }

    public Nation(String quocGia, Person[] persons) {
        this.quocGia = quocGia;
        this.persons = persons;
    }

    public void input() {
        System.out.println("Nhap quoc gia :");
        quocGia = new Scanner(System.in).nextLine();
    }

    public void in4() {
        System.out.println("-------------");
        System.out.println("quoc gia :" +quocGia);
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }
}
