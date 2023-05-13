package org.example.collection;

import com.sun.source.tree.LiteralTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentMappping {
    public static void main(String[] args){
        HashMap<Integer, String> map= new HashMap<>();
        map.put(101, "Sai");
        map.put(102, "Hema");
        map.put(103, "Siva");
        map.put(104, "Raju");


//        for(Map.Entry<Integer, String> entry:map.entrySet()){
//            System.out.println(entry.getKey());
//        }

        Iterator< Map.Entry<Integer, String>> it = map.entrySet().iterator();

    }

}
