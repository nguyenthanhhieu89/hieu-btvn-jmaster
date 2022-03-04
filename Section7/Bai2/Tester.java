package Section7.Bai2;

import java.util.Scanner;

public class Tester extends NhanVien{
    private String testTools ;

    public Tester(String testTools) {
        this.testTools = testTools;
    }

    public String getTestTools() {
        return testTools;
    }

    public void setTestTools(String testTools) {
        this.testTools = testTools;
    }

    @Override
    public void input () {
        super.input();
        System.out.println("Nhap testTools");
        testTools = new Scanner(System.in).nextLine();
    }
    @Override
    public void inf(){
        super.inf();
        System.out.println(testTools);
    }
}
