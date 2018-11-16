package domain;

import com.google.gson.Gson;

public class GsonTest {

    public static void main(String[] args) throws Exception{

        Movie movie = new Movie();
        movie.setTitle("영구와 떙칠이");
        movie.setDirector("심형래");
        movie.setPop(10);
        movie.setScore(3);

        Gson gson = new Gson();

        String str = gson.toJson(movie);

        System.out.println(str);
    }
}
