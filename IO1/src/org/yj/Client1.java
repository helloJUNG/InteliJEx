package org.yj;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client1   {

    //bad code
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("10.10.10.92",9705);
        System.out.println(socket);

        InputStream in =socket.getInputStream();
        OutputStream out = new FileOutputStream("C:\\zzz\\사진.jpg");

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


        in.close();
        out.close();

        socket.close();

    }


    }

