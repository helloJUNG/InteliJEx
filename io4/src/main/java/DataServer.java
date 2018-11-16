import com.google.gson.Gson;
import domain.Movie;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class DataServer {

    //bad code
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(7777);

        System.out.println("READY");

        Socket socket = serverSocket.accept();
        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);


        Movie movie = new Movie();
        movie.setTitle("영구와 떙칠이");
        movie.setDirector("심형래");
        movie.setPop(10);
        movie.setScore(3);

        Movie movie1 = new Movie();
        movie1.setTitle("범죄도시");
        movie1.setDirector("마동석");
        movie1.setPop(1000);
        movie1.setScore(8.5);

        ArrayList<Movie> list = new ArrayList<>();
        list.add(movie);
        list.add(movie1);

        Gson gson = new Gson();
        String str = gson.toJson(list);
        System.out.println(str);


        dos.writeUTF(str);

        dos.close();
        socket.close();
        serverSocket.close();

    }
}
