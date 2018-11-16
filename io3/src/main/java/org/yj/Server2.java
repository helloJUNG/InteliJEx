package org.yj;

import org.yj.domain.MovieMaker;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Server2 {

    //bad code
    public static void main(String[] args) throws Exception{

        Map<String,MsgMaker>makerMap = new HashMap<>();
        makerMap.put("1", new HansotMaker());
        makerMap.put("2", new MovieMaker());

        MsgMaker maker = null;
        ServerSocket serverSocket = new ServerSocket(7777);

        System.out.println("Ready");

        while(true) {
            Socket socket = serverSocket.accept();

            System.out.println(socket);
            InputStream in = socket.getInputStream();
            Scanner scanner = new Scanner(in);
            OutputStream out = socket.getOutputStream();

            String str = scanner.nextLine();
            //1,수
            System.out.println("CLIENT: " + str);

            String[] inputArr = str.split(",");

            maker = makerMap.get(inputArr[1]);

            String[] answer = maker.getMsg(str);

            String resultMsg = Arrays.toString(answer)+"\n";

            out.write(resultMsg.getBytes());
            out.flush();

            out.close();
            scanner.close();
            in.close();
            socket.close();

        }//end while

        //serverSocket.close();

    }
}


