package com.company;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class Main {

    //bad code
    public static void main(String[] args) throws  Exception{
    Writer writer = new FileWriter("C:\\zzz\\z1.txt");

        PrintWriter printWriter = new PrintWriter(writer);

        printWriter.println("오늘은 비가 옵니다.");
        printWriter.flush();
        printWriter.close();
    }
}
