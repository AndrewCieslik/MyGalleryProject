import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IC {
    public static void main (String[] args) throws FileNotFoundException, NoSuchElementException {
        File file2Read = new File("intercars.csv");   //towary ktore odkupuje Intercars

        Scanner sc2 = new Scanner(file2Read);
        String rowReadFromIC;

        File fileWrite = new File("kupili.csv");
        PrintWriter writer = new PrintWriter(fileWrite);

        while(sc2.hasNext()) {
            rowReadFromIC = sc2.nextLine();

                File fileRead = new File("suma.csv");   //wykaz wszystkich towarów z numerem kartonu/wuzetki
                Scanner sc = new Scanner(fileRead);
                String rowReadFromSum;

            while(sc.hasNext()) {
                rowReadFromSum = sc.nextLine();sc.hasNext();

                if (rowReadFromSum.split(",")[0].equals(rowReadFromIC.split(",")[0])) {
                    System.out.println(rowReadFromIC.split(",")[3]);
                    writer.println(rowReadFromSum.split(",")[0] + "," + rowReadFromSum.split(",")[3] + ","+ rowReadFromIC.split(",")[5] + "," + rowReadFromIC.split(",")[4]+ "," + rowReadFromSum.split(",")[2]+","+rowReadFromIC.split(",")[3]);
                }
            }
        }
        writer.close();
    }
}