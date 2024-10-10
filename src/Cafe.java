import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Cafe {
   public Cafe() {

   }

   public ArrayList <String> loadMenuData() {
       ArrayList <String> result = new ArrayList<>();
       try {

           File file = new File("coffees.txt");
           Scanner scan = new Scanner(file);
           while (scan.hasNextLine()){
                    result.add(scan.nextLine());
           }
           scan.close();

       } catch (FileNotFoundException e){
           System.out.println("File not found. Check path and filename");
       }


       return result;
   }
    public ArrayList<String> getCoffeeMenu() {
        return loadMenuData();
    }
}
