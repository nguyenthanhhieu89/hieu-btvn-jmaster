package Section7.Bai1;

import java.util.Scanner;

public class Teacher extends Person {
    private String chucVu;

    public Teacher(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public void input(){
        super.input();
        System.out.println("Nhap chuc vu : ");
        chucVu = new Scanner(System.in).nextLine();
    }
    @Override
    public void inf(){
        super.inf();
        System.out.println(chucVu);
    }
}
