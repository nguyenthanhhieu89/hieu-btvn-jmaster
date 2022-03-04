package Section7.Bai2;

import java.util.Scanner;

public class Developer extends NhanVien{
    private String programLangguage ;

    public Developer(String programLangguage) {
        this.programLangguage = programLangguage;
    }

    public Developer() {

    }

    public String getProgramLangguage() {
        return programLangguage;
    }

    public void setProgramLangguage(String programLangguage) {
        this.programLangguage = programLangguage;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap vao programLangguage");
        programLangguage = new Scanner(System.in).nextLine();
    }

    @Override
    public void inf(){
        super.inf();
        System.out.println(programLangguage);
    }
}
