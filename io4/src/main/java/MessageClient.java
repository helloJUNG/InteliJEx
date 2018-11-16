import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class MessageClient {

    //bad code
    public static void main(String[] args) throws Exception {

        String i1 ="";


        Map<String, String> iconMap = new HashMap<>();
        iconMap.put("@i1","\n" +i1+"\n");

        ServerSocket serverSocket = new ServerSocket(7777);

        System.out.println("CLIENT READY");

        while(true){
            try (
                    Socket socket = serverSocket.accept();
                    DataInputStream din = new DataInputStream(socket.getInputStream());
                    ){
                System.out.println(socket);
                String message = din.readUTF();

                if(message.contains("\\@i1")){
                    System.out.println(iconMap.get("@i1"));
                }

                System.out.println(message);

            }catch (Exception e){
                System.out.println(e.getMessage());
            }



        }//end while

    }

}
