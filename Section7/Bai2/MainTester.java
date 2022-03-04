package Section7.Bai2;

import java.util.Scanner;

public class MainTester {
    public static void main(String[] args) {
        System.out.println("Nhap so luong tester : ");
        int c = new Scanner(System.in).nextInt();
        Tester [] testers = new Tester[c];
        for (int i = 0; i < testers.length; i++) {
            testers[i] = new Tester();
            testers[i].input();
        }

        for (int i = 0; i < testers.length; i++) {
            testers[i].inf();
        }
    }
}
