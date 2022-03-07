package BtapSection8;

import java.util.Scanner;

public class House {
    private String address;
    private int floorHouse;
    private Person owner;

    public House() {
    }

    public House(String address, int floorHouse, Person owner) {
        this.address = address;
        this.floorHouse = floorHouse;
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void input() {
        System.out.println("Enter address house :");
        address = new Scanner(System.in).nextLine();
        System.out.println("Enter floor house :");
        floorHouse = new Scanner(System.in).nextInt();
    }

    public void inf() {
        System.out.println("--------------");
        System.out.println(address);
        System.out.println(floorHouse);
    }
}
