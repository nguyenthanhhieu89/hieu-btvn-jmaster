package BtapSection16.SetMap.Service;

import BtapSection16.SetMap.Model.Person;

import java.util.Set;

public interface SetExamService {

    Set <Person> input();

    void inf(Set<Person> set);

    void filter(Set<Person> set);

    void delete (Set<Person> set);

}
