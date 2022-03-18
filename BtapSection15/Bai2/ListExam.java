package BtapSection15.Bai2;

import BtapSection15.Bai1.Person;

import java.util.List;

public interface ListExam {
    List<Person> input();

    void info(List<Person> list);

    void filter(List<Person> list);

    void sortPerson(List<Person> list);

    void delete(List<Person> list);
}
