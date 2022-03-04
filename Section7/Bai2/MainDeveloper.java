package Section7.Bai2;

import Section7.Bai1.Student;

import java.util.Locale;
import java.util.Scanner;

public class MainDeveloper {
    public static void main(String[] args) {
        System.out.println("Nhap so luong dev : ");
        int a = new Scanner(System.in).nextInt();
        Developer [] developers = new Developer[a];
        for (int i = 0; i < developers.length; i++) {
            developers[i] = new Developer();
            developers[i].input();
        }

        for (int i = 0; i < developers.length; i++) {
            developers[i].inf();
        }

        System.out.println("Nhan vien co ngon ngu lap trinh java");
        for (int i = 0; i < developers.length; i++) {
            if (developers[i].getProgramLangguage().toLowerCase().equals("java".toLowerCase(Locale.ROOT).trim())) {
                developers[i].inf();
            }
        }
    }
}
