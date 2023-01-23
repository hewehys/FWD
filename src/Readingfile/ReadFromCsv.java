package Readingfile;
import java.io. * ;
import java.util.Scanner;
public class ReadFromCsv {
    public static void main(String[] r) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Hewehy\\IdeaProjects\\LearningManagementSystem\\result1.csv"));
        //parsing a CSV file into the constructor of Scanner class
        sc.useDelimiter(",");
        //setting comma as delimiter pattern
        sc.nextLine();
        System.out.println("---------------------");
        System.out.println("Current Student List");
        System.out.println("---------------------");
        System.out.println("id name             Grade       email               address                         region  country");

        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
        sc.close();
        //closes the scanner
}

}
