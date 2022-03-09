package BtapSection9.Bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Nhap lua chon :");
            System.out.println("1. Train :");
            System.out.println("2. Car :");
            int n = new Scanner(System.in).nextInt();
            if (n == 1) {
                System.out.println("Train :");
                Train train = new Train();
                input(train);
                inf(train);
            } else if (n == 2) {
                System.out.println("Car :");
                Car car = new Car();
                input(car);
                inf(car);
            } else {
                System.out.println("vui long chon lai :");
            }
        }


    }

    public static void input(PhuongTien phuongTien) {
        System.out.println(" puong tien input : ");
        System.out.println("Nhap gia ve :");
        phuongTien.setGiaVe(new Scanner(System.in).nextInt());
        System.out.println("Nhap so ghe :");
        phuongTien.setSoGhe(new Scanner(System.in).nextInt());
        if (phuongTien instanceof Train) {
            Train train = (Train) phuongTien;
            System.out.println("Nhap vao so toa :");
            train.setSoToa(new Scanner(System.in).nextInt());
        }
        if (phuongTien instanceof Car) {
            Car car = (Car) phuongTien;
            System.out.println("Nhap vao so toa :");
            car.setLoaiXe(new Scanner(System.in).nextLine());
        }
    }

    public static void inf(PhuongTien phuongTien) {
        if (phuongTien instanceof Train) {
            Train train = (Train) phuongTien;
            System.out.println("Gia ve la : " + phuongTien.getGiaVe() + "Vnd " + "\n So ghe la :" + phuongTien.getSoGhe()
                    + "\n So toa la : " + train.getSoToa());
        }
        if (phuongTien instanceof Car) {
            Car car = (Car) phuongTien;
            System.out.println("Gia ve la : " + phuongTien.getGiaVe() + "vnd " + "\n so ghe la " + phuongTien.getSoGhe()
                    + "\n thuoc loai xe : " + ((Car) phuongTien).getLoaiXe());
        }
    }

    public static void menu() {
        Train train = new Train();
        Car car = new Car();
        input(train);
        input(car);
        inf(train);
        inf(car);
    }
}
