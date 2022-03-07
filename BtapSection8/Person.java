package BtapSection8;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private int age;
    private House[] houses;
    private Car[] cars;
    private Nation nation;


    public Person() {
    }

    public Person(int id, String name, int age, House[] houses, Car[] cars, Nation nation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.houses = houses;
        this.cars = cars;
        this.nation = nation;
    }

    public void input () {
        System.out.println("Nhap ten :");
        name = new Scanner(System.in).nextLine();
        System.out.println("Nhap id :");
        id = new Scanner(System.in).nextInt();
        System.out.println("Nhap age :");
        age = new Scanner(System.in).nextInt();

    }

    public void inf (){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

}
