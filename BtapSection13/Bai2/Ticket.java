package BtapSection13.Bai2;
//runable :
public class Ticket implements Runnable{
    private int ticket = 2;
    @Override
    public void run(){
        muaVe();
    }

    public synchronized void muaVe()  { // Đồng bộ synchronized : Có 1 hàm trong 1 đối tượng cùng lúc 2 thread khác nhau gọi, thì mình sẽ cho sếp hàng để thực th
        try {
            ticket = ticket - 1;
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(3000);

            if (ticket > 0) {
                System.out.println("Can buy");
            } else {
                System.out.println("Out of ticket");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
