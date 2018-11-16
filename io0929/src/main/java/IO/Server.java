package IO;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws Exception{

       MsgMaker maker = new HansotMaker();
        ServerSocket serverSocket = new ServerSocket(7777);
        System.out.println("ready");

     while(true){

         Socket socket = serverSocket.accept();
         System.out.println("socket");

         InputStream in = socket.getInputStream();
         Scanner scanner = new Scanner(in);
         OutputStream out = socket.getOutputStream();

         String str = scanner.nextLine();
         System.out.println("CLIENT: " + str);

         String[] answer = maker.getMsg(str);
         String resultMsg = Arrays.toString(answer)+ "\n";

         out.flush();
         out.close();
         scanner.close();
         in.close();
         socket.close();
     }//end while
     //serverSocket.close();
    }

}
