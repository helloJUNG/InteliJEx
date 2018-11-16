package org.yj.domain;

public class Movie {

    private String title;
    private String gnere;


    public Movie(String title, String gnere) {
        this.title = title;
        this.gnere = gnere;
    }

    public String getTitle() {
        return title;
    }

    public String getGnere() {
        return gnere;
    }

    public boolean checkGenre(String gName){
        return this.gnere.equals(gName);
    }

    @Override
    public String toString() {
        return "movie{" +
                "title='" + title + '\'' +
                ", gnere='" + gnere + '\'' +
                '}';
    }


}
