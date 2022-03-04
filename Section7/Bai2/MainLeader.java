package Section7.Bai2;

import java.util.Scanner;

public class MainLeader {
    public static void main(String[] args) {
        System.out.println("Nhap so luong leader : ");
        int b = new Scanner(System.in).nextInt();
        Leader [] leaders = new Leader[b];
        for (int i = 0; i < leaders.length; i++) {
            leaders[i] = new Leader();
            leaders[i].input();
        }

        System.out.println("Leader co team size > 10 : ");
        for(int i = 0 ; i < leaders.length; i++) {
            if(leaders[i].teamSize > 10)
                leaders[i].inf();
        }
    }
}
