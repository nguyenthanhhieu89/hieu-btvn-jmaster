package BtapSection15.Bai2;

import BtapSection15.Bai1.Person;

import java.util.*;

public class ListExamImpl implements ListExam {

    PersonService personService = new PersonServiceImpl();

    @Override
    public List<Person> input() {
        List<Person> list = new ArrayList<Person>();
        while (true) {
            Person p = new Person();
            personService.input(p);
            list.add(p);
            System.out.println("Chọn N để thoát ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("N")) {
                break;
            }
        }
        return list;
    }

    @Override
    public void info(List<Person> list) {
        System.out.println("Danh sách sinh viên :");
        for (Person person : list) {
            personService.info(person);
        }
    }

    @Override
    public void filter(List<Person> list) {
        System.out.println("Người có tuổi <20");
        for (Person person : list) {
            if (person.getAge() < 20) {
                personService.info(person);
            }
        }
    }

    @Override
    public void sortPerson(List<Person> list) {
        System.out.println("List tuổi tăng dần :");
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (o1.getAge() - o2.getAge());
            }
        });
        info(list);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (o2.getAge() - o1.getAge());
            }
        });
        info(list);
    }

    @Override
    public void delete(List<Person> list) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getName().contains("k")){
                list.remove(person);
            }
            info(list);
        }
    }


}
