package BtapSection15.Bai2;

import BtapSection15.Bai1.Person;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListExam listExam = new ListExamImpl();
        List<Person> list = listExam.input();
        listExam.info(list);
        while (true) {
            System.out.println("_________________________________________");
            System.out.println("====Menu===");
            System.out.println("1.In ra danh sách sinh viên ");
            System.out.println("2.In ra người số tuổi nhỏ hơn 20");
            System.out.println("3.In ra danh sách list tuổi tăng dần và giảm dần ");
            System.out.println("4.Xóa sinh viên có chữ k");
            int n = new Scanner(System.in).nextInt();
            if (n == 1) {
                listExam.info(list);
            } else if (n == 2){
                listExam.filter(list);
            } else if (n == 3){
                listExam.sortPerson(list);
            } else if (n == 4) {
                listExam.delete(list);
            }
        }
    }
}
