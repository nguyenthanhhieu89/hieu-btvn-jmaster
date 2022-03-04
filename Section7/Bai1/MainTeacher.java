package Section7.Bai1;

import Section7.Bai1.Student;

import java.util.Scanner;

/*Từ bài tập section trước. Tạo package com.trungtamjava.model chứa class: Person, Student ext Person, Teacher ext Person.
        khai báo lại các thuộc tính cho từng lớp để dùng kế thừa.
        overide lại các hàm input, info đã có. và bổ sung thêm thuộc tính riêng.
        Tạo package com.trungtamjava.main để tạo class MainTeacher, MainStudent.
        Từ đó new các mảng đối tượng Teacher và Student với số lượng nhập từ bàn phím vào tương ứng.

        For nhập vào các giá trị cho các đối tượng trong từng phần tử trong mảng. (gọi hàm input)

        Sau khi nhập hết tất cả xong, thì For in ra các thông tin (gọi hàm info) */
public class MainTeacher {
    public static void main(String[] args) {
        System.out.println("Nhap so luong teacher : ");
        int b = new Scanner(System.in).nextInt();
        Student[] students = new Student[b];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(b);
            students[i].input();
        }

        for (int i = 0; i < students.length; i++) {
            students[i].inf();
        }
    }
}
