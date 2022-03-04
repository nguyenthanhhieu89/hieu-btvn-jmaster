package Section7.Bai2;

public class Leader extends NhanVien {
    public static long luongCoban = 10000000;
    public int teamSize;

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap vao teamSize");
    }

    public void inf() {
        super.inf();
        System.out.println(teamSize);
        System.out.println("so luong team nay nhan duoc " + bonus());
    }

    public long bonus() {
        if (teamSize > 10) {
            return luongCoban = luongCoban + luongCoban * (50 / 100);
        } else {
            return luongCoban = luongCoban + luongCoban * (10 / 100);
        }
    }
}
