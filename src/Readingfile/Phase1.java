package Readingfile;

import java.util.Arrays;
import java.io.*;
import java.util.Scanner;


public class Phase1 {
    public static void main(String[] args){
        String path = "C:\\Users\\Hewehy\\Desktop\\student-data.txt";
        String line = "";
        int column = '$';
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) !=null) {
                String[] rows = line.split("\\$");
                System.out.println(line);
//               int[] header = line.contains($);
                System.out.println(Arrays.toString(rows));
                System.out.println((rows.length));

                for(int i = 0; i < rows.length; i++) {
//                   System.out.println((rows[i]));
                    String[] cells = rows[i].split("\\#");
                    System.out.println(Arrays.toString(cells));
                }
            }


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }




    }
}
