package BtapSection15.Bai1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(111,"Hieu",18);
        Person p2 = new Person(112,"Hieuu",18);
        System.out.println("Kiểm tra xem 2 person có cùng tuổi :"+
                                p1.kiemTraCungTuoi(p2));
    }
}
