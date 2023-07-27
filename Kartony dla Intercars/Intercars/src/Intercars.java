import java.io.*;
import java.util.Scanner;

public class Intercars {
    public static void main (String[] args) throws FileNotFoundException {
        File fileRead = new File("suma.csv");
        File file2Read = new File("intercars.csv");

        Scanner sc = new Scanner(fileRead);
        String rowReadFromFile;

        Scanner sc2 = new Scanner(file2Read);
        String rowReadFromIC;

        File fileWrite = new File("wynik.csv");              //new csv for selected houses
        PrintWriter writer = new PrintWriter(fileWrite);

        for(int j = 0; sc.hasNext(); j++) {
            rowReadFromFile = sc.next(); sc.nextLine();
            rowReadFromIC = sc2.next(); sc2.nextLine();

            //only 1 storey houses in the countryside:
            if (rowReadFromFile.split(",")[0].equals(rowReadFromIC.split(",")[0])) {

                writer.println(rowReadFromFile.split(",")[0] + "," + rowReadFromFile.split(",")[3]);      //write House name and sell price to new csv
            }
        }
        writer.close();
        sc.close();
    }
}