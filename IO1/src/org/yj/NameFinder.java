package org.yj;

import java.io.File;

public class NameFinder {

    private String[] fileNames;


    public NameFinder(){

        File folder = new File("C:\\zzz\\img");

        fileNames = folder.list();
    }

    public String getName(){

        int idx = (int)(Math.random() + fileNames.length);
        System.out.println(idx);

        return fileNames[idx];
    }

}
