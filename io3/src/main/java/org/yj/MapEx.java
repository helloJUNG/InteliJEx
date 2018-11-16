package org.yj;

import java.util.HashMap;
import java.util.Map;

public class MapEx { //키워드를 통해 원하는 클래스를 가지고오기위해 필요

    public static void main(String[] args) {

        Map<String,String[]> wordMap = new HashMap<>();
        wordMap.put("lunch",new String[]{"점심"});
        wordMap.put("pug",new String[]{"개,퍼그"});
        wordMap.put("cat",new String[]{"고양이"});



        System.out.println(wordMap.get("cat"));

    }

}
