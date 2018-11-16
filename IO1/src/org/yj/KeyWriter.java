package org.yj;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class KeyWriter {


    public static void main(String[] args) throws Exception{

        InputStream in = System.in;
        OutputStream out =
                new FileOutputStream("C:\\zzz\\test1.txt");

        System.out.println("한글 넣어봐!");
        for(int i =0 ; i < 100; i++){
            int data = in.read();
            System.out.println(data);
            out.write(data);

        }

    }

}
