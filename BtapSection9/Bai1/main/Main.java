package BtapSection9.Bai1.main;

import BtapSection9.Bai1.model.Animal;
import BtapSection9.Bai1.model.Chicken;
import BtapSection9.Bai1.model.Dog;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        while (true) {
            System.out.println("Vui long nhap lua chon : ");
            System.out.println("1.Menu Dog :");
            System.out.println("2.Menu Chicken :");
            int n = new Scanner(System.in).nextInt();

            if (n == 1) {
                System.out.println("1.Menu Dog :");
                menuDog();
                break;
                 }
            else if (n == 2) {
                System.out.println("2.Menu Chicken :");
                menuChicken();
                break;
            }
            else {
                System.out.println("Vui long chon lai :");
            }
            }
        }
    public static void input(Animal animal){

        System.out.println("Animal input");
        System.out.println("Nhap so chan : ");
        animal.setNumberFoot(new Scanner(System.in).nextInt());
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            System.out.println("Nhap ten giong cho :");
            dog.setGiongCho(new Scanner(System.in).nextLine());
        }

        if (animal instanceof Chicken){
            Chicken chicken = (Chicken) animal;
            System.out.println("Nhap so luong trung 1 ngay :");
            chicken.setSoTrungDeMotNgay(new Scanner(System.in).nextInt());
        }
    }

    public static void inf(Animal animal){
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println(animal.getNumberFoot() + " " + dog.getGiongCho());
        }

        if (animal instanceof Chicken) {
            Chicken chicken = (Chicken) animal ;
            System.out.println(animal.getNumberFoot() + " " + chicken.getSoTrungDeMotNgay());
        }
    }

    public static void menuDog () {
        System.out.println("Nhap so luong Dog :");
        int n = new Scanner(System.in).nextInt();
        Dog [] dogs = new Dog[n];
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] =new Dog();
            input(dogs[i]);
        }

        for (Dog dog: dogs ) {
            inf(dog);
        }
    }


    public static void menuChicken() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong chicken: ");
        int p = sc.nextInt();

        Chicken[] chickens = new Chicken[p];
        for(int i = 0; i < chickens.length; i++) {
            chickens[i] = new Chicken();
            input(chickens[i]);
        }

        for(Chicken chicken : chickens) {
            inf(chicken);
        }
    }
}
