package com.company.multi;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Arrays;

public class ServerAgent extends Thread{

    private Socket socket;
    private DataInputStream din;
    private DataOutputStream dos;
    private String ip;

    public ServerAgent(Socket socket) throws Exception{//기능은 while 하면서 사용자들의 메세지 받는거 하나는 보내는거
        this.socket = socket;
        this.din = new DataInputStream(socket.getInputStream());
        this.dos = new DataOutputStream(socket.getOutputStream());
    }

    public void read() throws Exception{
        while (true){
            String msg = din.readUTF();
            //System.out.println(msg);
            String[] arr = msg.split(":");
            System.out.println(Arrays.toString(arr));

            String oper = arr[0];

            switch (oper){
                case "A":
                    MultiServer2.ONE.broadcast(ip +":" + msg);
                    break;
                case "S":
                    MultiServer2.ONE.whisper(ip, arr[1], arr[2]);
            }

        }
    }

    @Override  //dd
    public void run() {
        try {
            read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void write(String msg) throws Exception{

        dos.writeUTF(msg);
    }
}
