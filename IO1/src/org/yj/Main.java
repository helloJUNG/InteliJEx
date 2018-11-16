package org.yj;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

    //bad code
    public static void main(String[] args) throws Exception {//문제가 생기면 토스하겟다.

        InputStream in = new FileInputStream("C:\\zzz\\abc.jpg");
        OutputStream out = new FileOutputStream("C:\\zzz\\copa.jpg");

        byte[] buffer = new byte[1024*8];//100배

        long start = System.currentTimeMillis();//시간체크
        //read write

        while(true){
            int count = in.read(buffer);
            if(count == -1){
                System.out.println("count:"+count);
                break;}
                out.write(buffer,0,count);
            }
         long end = System.currentTimeMillis();
        System.out.println(end - start);


        in.close();
        out.close();

    }
}
