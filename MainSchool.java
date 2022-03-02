package com.trungtamjava.model;

import java.util.Scanner;

public class MainSchool {
    public static void main(String[] args) {
        System.out.println("Nhap vao n truong :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        School[] schools = new School[n];
        for (int i = 0; i < schools.length; i++) {
            schools[i] = new School();
            schools[i].input();
        }
        for (int i = 0; i < schools.length; i++) {
            schools[i].inf();
        }
        System.out.println("nhap vao ki tu ");
        String check = new Scanner(System.in).nextLine();
        for (int i = 0; i < schools.length; i++) {
            if (schools[i].getSchoolName().toLowerCase().contains(check.toLowerCase().trim())) {
                schools[i].inf();
            }
        }
    }
}
