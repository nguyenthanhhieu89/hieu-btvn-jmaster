package BtapSection8;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.input();
        House[] houses = new House[2];
        Car[] cars = new Car[2];

        for (int i = 0; i < houses.length; i++) {
            houses[i] = new House();
            houses[i].input();
            houses[i].setOwner(person);
        }
        for (int k = 0; k < cars.length; k++) {
            cars[k] = new Car();
            cars[k].input();
            cars[k].setOwner(person);
        }

        for (int i = 0; i < houses.length; i++) {
            houses[i].inf();
        }
        for (int i = 0; i < cars.length; i++) {
            cars[i].inf();
        }

    }
}
