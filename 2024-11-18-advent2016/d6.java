import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d6 {
  public static int d6a (String filename) {
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);


    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
}
