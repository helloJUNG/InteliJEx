package org.yj;

public class Movie implements Comparable<Movie> {

    String title;
    int count;

    public Movie(String title,int count) {
        this.count = count;
        this.title = title;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "count=" + count +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return o.count-this.count;
    }




}
