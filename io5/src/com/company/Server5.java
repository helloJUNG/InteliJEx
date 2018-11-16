package com.company;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server5 {

    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(7777);

        System.out.println("READY...");

        while(true){

            Socket socket = serverSocket.accept();
            OutputStream os = socket.getOutputStream();
            PrintWriter out = new PrintWriter(os);

            out.write("HTTP/1.1 200 OK\r\n");
            out.write("Cache-Control: private\r\n");
            out.write("Content-Type: text/html;\r\n\r\n");

            out.write("<h1>Hello</h1>");
            out.flush();
            out.close();
        }
    }
}
