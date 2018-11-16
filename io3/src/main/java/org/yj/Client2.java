package org.yj;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

    public static void main(String[] args) throws Exception{

        Scanner keyScanner = new Scanner(System.in);

        System.out.println("Input Your Message");

        String msg = keyScanner.next() + "\n";//<- 키입력 받을 떄 이 표시가 있어야 엔터를 추가 // nextLine은 짤라버린다...

        Socket socket = new Socket("10.10.10.93",7777);

        OutputStream out = socket.getOutputStream();
        Scanner inScanner = new Scanner(socket.getInputStream());

        out.write(msg.getBytes());
        out.flush();

        String receiveMsg = inScanner.nextLine();

        System.out.println("RECEIVE: " + receiveMsg);
        out.close();
        socket.close();

    }
}
