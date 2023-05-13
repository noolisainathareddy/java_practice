package org.example.thread;

import java.util.*;
import java.util.concurrent.*;

public class Main {


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            ArrayList<Integer> list = new ArrayList<>();
            int d = sc.nextInt();
            list.add(d);
            for(int j = 1; j<=d; j++){
                list.add(sc.nextInt());
            }
            System.out.println(list);
            rows.add(list);
        }
        int q=sc.nextInt();
        for(int i=1;i<=q;i++){
            try{
                System.out.println(rows.get(sc.nextInt()-1).get(sc.nextInt()));

            }
            catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }

    }
}
