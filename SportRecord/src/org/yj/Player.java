package org.yj;

public class Player implements Comparable<Player>{

    private  String name;
    public double rate;


    public Player(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
    @Override
    public int compareTo(Player o) {
        System.out.println(this);
        System.out.println(o);
        System.out.println("----------------------");

        if(o.rate>this.rate){
            return 1;
        }else if(o.rate>this.rate){
            return -1;
        }

        return 0;
    }

}
