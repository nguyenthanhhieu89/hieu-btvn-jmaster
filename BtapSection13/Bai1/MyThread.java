package BtapSection13.Bai1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyThread extends Thread{
    public void run () {
        super.run();
        try {
            Dos();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void Dos () throws IOException {
        URL url = new URL("http://www.24h.com.vn/");
        HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
        for (int i = 0; i < urlCon.getHeaderFields().size(); i++) {
            System.out.println(urlCon.getHeaderFieldKey(i) + "=" + urlCon.getHeaderField(i));
        }
    }
}
