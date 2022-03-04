package Section7.Bai1;

import java.util.Scanner;

public class Student extends Person {
    private int id ;

    public Student(int id) {

        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    @Override
    public void input(){
        super.input();
        System.out.println("Nhap id : ");
        id = new Scanner(System.in).nextInt();
    }
    @Override
    public void inf(){
        super.inf();
        System.out.println(id);
    }
}
