package com.trungtamjava.model;

import java.util.Scanner;

public class School {
    private int id;
    private String schoolName;
    private String address;

    public School(){

    }

    public School(int id, String schoolName, String address) {
        this.id = id;
        this.schoolName = schoolName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inf() {
        System.out.println(id);
        System.out.println(schoolName);
        System.out.println(address);
    }

    public void input() {
        System.out.println("Nhap id : ");
        id = new Scanner(System.in).nextInt();
        System.out.println("Nhap ten truong :");
        schoolName = new Scanner(System.in).nextLine();
        System.out.println("Nhap address ");
        address = new Scanner(System.in).nextLine();
    }
    public void timKiemTenTruong () {
    }
}
