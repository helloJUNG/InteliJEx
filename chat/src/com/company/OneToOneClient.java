package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class OneToOneClient {

    public static void main(String[] args) {
    //소켓 연결부분만 빼고 서버랑 클라이언트는 똑같네~

        System.out.println("연결 시작합니다. ");
        try(
                Socket socket = new Socket("10.10.10.84",7777);
                DataInputStream din = new DataInputStream(socket.getInputStream());
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                Scanner scanner = new Scanner(System.in);

                ){

            new Thread(()->{
                try{

                    while (true) {
                    String myMsg = scanner.nextLine();
                    dos.writeUTF(myMsg);
                }

                }catch (Exception e){

                }
            }).start();

            while (true){
                String otherMsg = din.readUTF();
                System.out.println(otherMsg);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }//end catch


    }

}
