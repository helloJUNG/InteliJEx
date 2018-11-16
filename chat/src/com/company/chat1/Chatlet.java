package com.company.chat1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Chatlet implements Runnable{

    private Socket socket;
    private DataInputStream din;
    private DataOutputStream dos;
    private Scanner scanner;

    //모든시작은 소켓 그래서 생성자를 소켓으로 잡자~
    public Chatlet(Socket socket)throws Exception {
        this.socket = socket;
        this.din = new DataInputStream(socket.getInputStream());
        this.dos = new DataOutputStream(socket.getOutputStream());
        this.scanner = new Scanner(System.in);
    }

    //다른건생각하지말고 보내는 기능과 받는기능
    public void write()throws Exception{
        while (true){

            for (int i = 0 ; i < 10000; i++) {
                String  msg = "입벌려라 쓰레드 들어간다!!!!!!";
                dos.writeUTF(msg);
            }

            //A:Hello (모든사람한테 메세지 뿌린다.)
            //S:84:Hello (84번에게만 보낸다.)

        }
    }

    public void read()throws Exception{
        while (true){
            String msg = din.readUTF();
            System.out.println(msg);
        }
    }

    public void closeAll(){ //한번에 쓰면 만약에 스캐너가 클로즈 안되면 나머지도 안되나까 아래처럼 쓴다.
        try{scanner.close();}catch (Exception e){}
        try{din.close();}catch (Exception e){}
        try{dos.close();}catch (Exception e){}
        try{socket.close();}catch (Exception e){}
    }

    @Override//이게 쓰레드가 관통하는 코트
    public void run() {
        try {
            read();
        } catch (Exception e) {
            e.printStackTrace();
            closeAll();
        }
    }
}
