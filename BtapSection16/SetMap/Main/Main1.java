package BtapSection16.SetMap.Main;

import BtapSection16.SetMap.Model.Person;
import BtapSection16.SetMap.Service.SetExamImpl;
import BtapSection16.SetMap.Service.SetExamService;

import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        SetExamService setExamService = new SetExamImpl();
        Set<Person> set = setExamService.input();
        setExamService.inf(set);
        setExamService.filter(set);
        setExamService.delete(set);
    }
}
