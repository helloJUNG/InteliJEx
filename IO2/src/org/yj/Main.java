package org.yj;

import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {

        String path = "https://cdn.videofarm.daum.net/vod/v4c91989uP9Hd5ZXuP5GXaH/mp4_1280_720_2M/movie.mp4?px-time=1534858763&px-hash=407b9be28dac636e13a1d77f32d12327&px-bps=2934879&px-bufahead=10";

        URL url = new URL(path);

        InputStream in = url.openStream();
        OutputStream out = new FileOutputStream("C:\\zzz\\mama.mp4");

        byte[] buffer = new byte[1024*8];

        long start = System.currentTimeMillis();

        while (true){
            int count = in.read(buffer);
            System.out.println("COUNT: " + count);
            if(count == -1){
                break;
            }
            out.write(buffer,0,count);

        }

        long end = System.currentTimeMillis();
        in.close();
        out.close();
    }
}
