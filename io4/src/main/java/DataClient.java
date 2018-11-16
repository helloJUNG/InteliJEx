import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import domain.Movie;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class DataClient {

    //bad code
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("10.10.10.92",7777);

        DataInputStream din = new DataInputStream(socket.getInputStream());

        String msg = din.readUTF();
        System.out.println(msg);

        Gson gson = new Gson();

        ArrayList<Movie> list = gson.fromJson(msg, new TypeToken<ArrayList<Movie>>(){}.getType());

        System.out.println(list);

        din.close();
        socket.close();

    }
}
