package com.company.chat1;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatletClient {

    public static void main(String[] args)throws Exception {

        Socket socket = new Socket("10.10.10.85",7777);
        System.out.println("메시지를 입력하세요!");

        Chatlet chatlet = new Chatlet(socket);


       new Thread(chatlet).start();

        chatlet.write();

        System.out.println("END");
    }
}
