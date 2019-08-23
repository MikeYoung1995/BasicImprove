package javabase.network;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Network {
   static String path="http://www.baidu.com";
    public static void main(String args[])
    {
        new Thread()
        {
            @Override
            public void run() {
                super.run();
                try {
                    URL url =new URL(path);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }

            }
        }.start();
    }
}
