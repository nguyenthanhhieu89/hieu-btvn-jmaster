package BtapSection8;

import java.util.Scanner;

public class MainNation {
    public static void main(String[] args) {
        Nation nation = new Nation();
        nation.input();
        System.out.println("Nhap vao n person :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person [] persons = new Person[n];

        for(int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            persons[i].input();
            persons[i].setNation(nation);
        }

        for (Person person : persons ) {
            person.inf();
            person.getNation().in4();
        }
    }
}
