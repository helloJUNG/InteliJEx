package com.company;

public class Ex1 implements Runnable{ //public void run 이라는 메소드를 오버라이드 해줘야오류안뜸

    @Override
    public void run() {
        for(int i  =0; i<10000; i++){
            System.out.println(Thread.currentThread().getName()+":"+this);
        }
    }

    public static void main(String[] args){

        Ex1 obj = new Ex1();



    }

}
