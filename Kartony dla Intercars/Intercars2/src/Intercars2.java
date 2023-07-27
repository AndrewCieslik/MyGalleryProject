import java.io.*;
import java.util.Scanner;

public class Intercars2 {
    public static void main (String[] args) throws FileNotFoundException {
        File fileRead = new File("suma.csv");

        Scanner sc = new Scanner(fileRead);
        String rowReadFromFile;

        File fileWrite = new File("wynik.csv");              //new csv for selected houses
        PrintWriter writer = new PrintWriter(fileWrite);

        //for(int j = 0; sc.hasNext(); j++) {
            rowReadFromFile = sc.next(); sc.nextLine();
            System.out.println(rowReadFromFile.split(",")[3]);
//            if (rowReadFromFile.split(";")[0].equals(rowReadFromFile.split(";")[2])) {
//
//               writer.println(rowReadFromFile.split(";")[0] + "," + rowReadFromFile.split(";")[2]);      //write House name and sell price to new csv
//            }
        //}
        writer.close();
        sc.close();
    }
}