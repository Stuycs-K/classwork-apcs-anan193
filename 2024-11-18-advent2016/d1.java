import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d1 {
  public static int d1(String filename) {
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);

      int orientation = 0;
      int x = 0;
      int y = 0;

      while (input.hasNext()) {
        String direction = input.next();
        System.out.println(direction);
        if (direction.charAt(0) == 'R') {
          orientation = (orientation + 1);
        }
        if (direction.charAt(0) == 'L') {
          orientation = (orientation - 1);
        }
        System.out.println(orientation);
        if (direction.charAt(direction.length()-1) == ',') {
          direction = direction.substring(1,direction.length()-1);
        }
        else {
          direction = direction.substring(1,direction.length());
        }
        System.out.println(direction);
        if (orientation%4 == 0) {
          x += Integer.parseInt(direction);
        }
        if (orientation%4 == 1) {
          y += Integer.parseInt(direction);
        }
        if (orientation%4 == 2) {
          x -= Integer.parseInt(direction);
        }
        if (orientation%4 == 3) {
          y -= Integer.parseInt(direction);
        }
      }
      return x + y;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[] args) {
    System.out.println(d1("d1_input.txt"));
  }
}
