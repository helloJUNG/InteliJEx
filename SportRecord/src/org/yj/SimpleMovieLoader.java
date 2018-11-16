package org.yj;

import java.util.ArrayList;

public class SimpleMovieLoader implements MovieLoader{


    @Override
    public ArrayList<Movie> getList() throws Exception {

        ArrayList<Movie> list = new ArrayList<>();

        list.add(new Movie("명량",123212312));
        list.add(new Movie("명",128572312));
        list.add(new Movie("량",123233123));
        list.add(new Movie("베",1873212312));
        list.add(new Movie("테",112321672));
        return list;
    }


}
