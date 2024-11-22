import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class d6 {
  public static String naive(ArrayList<String> a) {
    String message = ""

    for (int i = 0; i < a.get(0).length(); i++) {
      ArrayList<String> letters = new ArrayList<String>();
      for (int j = 0; j < a.size(); j++) {
        letters.add(a.get(j).substring(i,i+1));
      }
      System.out.println(letters);
    }
    return message;
  }

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
      naive(lines);
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
