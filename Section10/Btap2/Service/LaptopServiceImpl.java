package Section10.Btap2.Service;

import Section10.Btap2.Model.Laptop;

import java.util.Scanner;

public class LaptopServiceImpl implements LaptopService {
    @Override
    public void input(Laptop laptop) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Vui long nhap id");
        laptop.setId(sc1.nextInt());

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Vui long nhap Cpu");
        laptop.setCpu(sc2.nextLine());

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Vui long nhap Ram :");
        laptop.setRam(sc3.nextLine());

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Vui long nhap Vga : ");
        laptop.setVga(sc4.nextLine());
    }

    @Override
    public void info(Laptop laptop) {
        System.out.println("ID : " +laptop.getId() + "\nCpu :" +laptop.getCpu() +
                            "\nRam :" +laptop.getRam() + "\nVga :" +laptop.getVga());
    }
}
