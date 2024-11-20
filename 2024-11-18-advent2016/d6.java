import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class d6 {
  public static int d6a (String filename) {
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String message = "";
      ArrayList<String> lines = new ArrayList<String>();
      while (input.hasNextLine()) {
        String a = input.nextLine();
        lines.add(a);
      }
      for (int i = 0; i < lines.get(0).length(); i++) {
        int count = 0;
        

        message +=
      }
      System.out.println(message);
      return 0;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[] args) {

    d6a("d6_input.txt");
  }
}
