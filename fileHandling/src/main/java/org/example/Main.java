package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception{
        String path= "/Users/sainooli/git_loacl_repo/fileHandling/Book1.csv";

        File file;
        BufferedReader bf= null;

        try{
              file  =new File(path);
            bf = new BufferedReader(new FileReader(file));
            String line = "";
            while((line=bf.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            bf.close();
        }



    }
}