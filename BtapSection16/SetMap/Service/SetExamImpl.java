package BtapSection16.SetMap.Service;

import BtapSection16.SetMap.Model.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetExamImpl implements SetExamService{
    @Override
    public Set<Person> input() {
        Set <Person> setPerson = new HashSet<>();

        while (true) {
            System.out.println("Nhập thông tin sinh viên ");

            Person p = new Person();
            PersonService.input(p);
            setPerson.add(p);

            System.out.println("Chọn N nếu bạn không muốn nhập !");
            String s = new Scanner(System.in).nextLine();
            if (s.equalsIgnoreCase("N"))
                break;
        }
        return setPerson;
    }

    @Override
    public void inf(Set<Person> set) {
        for (Person p : set) {
            PersonService.inf(p);
        }
    }

    @Override
    public void filter(Set<Person> set) {
        System.out.println("Person who have age < 20");
        for (Person p : set) {
            if (p.getAge() < 20) {
                PersonService.inf(p);
            }
        }

    }

    @Override
    public void delete(Set<Person> set) {
        Iterator<Person> itr = set.iterator();
        while (itr.hasNext()) {
            Person p = itr.next();
            if (p.getName().toUpperCase().contains("A")) {
                itr.remove();
            }
        }
        System.out.println("After delete");
        inf(set);
    }

}