package Readingfile;

import java.util.Arrays;
import java.io.*;
import java.util.Scanner;


public class CreateCSV {
    public static void main(String[] args){
     String path = "C:\\Users\\Hewehy\\Downloads\\FWD\\student-data.txt";
     String line = "";
     int column = '$';
     String newFile ="";

       try {
           BufferedWriter writer = new BufferedWriter(new FileWriter("result1.csv"));
           BufferedReader br = new BufferedReader(new FileReader(path));
           line = br.readLine().replaceAll("\\$","\n").replaceAll("\\#",",");

           System.out.println(line);
           writer.write(line);
           writer.close();
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }




    }
}
