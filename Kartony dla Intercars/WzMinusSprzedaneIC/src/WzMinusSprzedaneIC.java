import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WzMinusSprzedaneIC {
    public static void main (String[] args) throws FileNotFoundException, NoSuchElementException {

        String sell;

        File fileRead = new File("sumaWz.csv");               //all car parts
        Scanner wz = new Scanner(fileRead);
        String rowWz = null;

        File fileWrite = new File("zostalo.csv");             //AllParts minus SoldCarParts
        PrintWriter writer = new PrintWriter(fileWrite);

        while(wz.hasNext()) {
            rowWz = wz.nextLine();

            File file2Read = new File("kupili.csv");          //sold car parts
            Scanner sc = new Scanner(file2Read);
            
            boolean found = false;
            while(sc.hasNext()) {
                sell= sc.nextLine();

                if (rowWz.split(",")[0].equals(sell.split(",")[0])) {
                found = true;
                break;
                }
            }
            if(!found) {
                writer.println(rowWz.split(",")[0]+ "," + rowWz.split(",")[1]+ ","+ rowWz.split(",")[2]);
            }
        }
        writer.close();
    }
}