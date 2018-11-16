package org.yj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class TrailerDownloader {

    public static void main(String[] args) throws Exception {//문제가 생기면 토스하겟다.

        String path = "https://cdn.videofarm.daum.net/vod/v95938e81Q3HaVBFFKDBa1B/mp4_1280_720_2M/movie.mp4?px-time=1534828387&px-hash=ad2b708637401a9fce004335663f2542&px-bps=2950105&px-bufahead=10";

        URL url = new URL(path);


        InputStream in = url.openStream();
        OutputStream out = new FileOutputStream("C:\\zzz\\copi.mp4");

        byte[] buffer = new byte[1024*8];//인터넷에서 받아오는 것은 네트워크 속도와 관련있다.

        long start = System.currentTimeMillis();//시간체크
        //read write

        while(true){

            int count = in.read(buffer);
            System.out.println("COUNT: " + count);
            if(count == -1){

                break;}
            out.write(buffer,0,count);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);


        in.close();
        out.close();

    }
}

