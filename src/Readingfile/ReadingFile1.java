package Readingfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile1 {
 public static void main(String[] args)throws FileNotFoundException{;

    File file = new File(
    "C:\\Users\\Hewehy\\Desktop\\" +
            "Student data project1.txt");
    Scanner scanner = new Scanner(file);
    System.out.println(scanner.nextLine());
    }
}


