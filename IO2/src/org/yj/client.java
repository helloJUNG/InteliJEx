package org.yj;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {

    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("10.10.10.93",9705);
        System.out.println(socket );

        InputStream in = socket.getInputStream();
        OutputStream out = new FileOutputStream("C:\\zzz\\샘플2.jpg");

        byte[] buffer = new byte[1024*8];

        long start = System.currentTimeMillis();

        while (true){
            int count = in.read(buffer);
            if(count == -1){
                break;

            }
         out.write(buffer,0,count);
        }
        in.close();
        out.close();

        socket.close();
    }
}
