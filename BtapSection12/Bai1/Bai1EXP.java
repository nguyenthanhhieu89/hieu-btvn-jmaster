package BtapSection12.Bai1;

import java.util.Scanner;

public class Bai1EXP {
    public static void main(String[] args) {
        int x = inputNumber();
        int y = inputNumber();

    }
    public static int inputNumber() {
        while (true) {
            try {
                System.out.println("Nhap so :");
                return new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("Vui long nhap lai :");
            }
        }
    }
}
