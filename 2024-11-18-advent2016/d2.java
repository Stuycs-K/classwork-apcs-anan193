import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d2 {
  public static int d2a (String filename) {
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);

      int[][] numpad = {{1,2,3},{4,5,6},{7,8,9}};
      int row = 1;
      int col = 1;
      while (input.hasNextLine()) {
        String line = input.nextLine();
        for (int i = 0; i < line.length(); i++) {
          if (line.charAt(i) == 'R') {
            if (col < 2) {
              col++;
            }
          }
          if (line.charAt(i) == 'L') {
            if (col > 0) {
              col--;
            }
          }
          if (line.charAt(i) == 'U') {
            if (row > 0) {
              row--;
            }
          }
          if (line.charAt(i) == 'D') {
            if (row < 2) {
              row++;
            }
          }
        }
        System.out.print(numpad[row][col]);
      }
      System.out.println("");
      return 0;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static int d2b (String filename) {
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);

      int[][] numpad = {{0,0,1,0,0},{0,2,3,4,0},{5,6,7,8,9},{0,10,11,12,0},{0,0,13,0,0}};
      int row = 1;
      int col = 1;
      while (input.hasNextLine()) {
        String line = input.nextLine();
        for (int i = 0; i < line.length(); i++) {
          if (line.charAt(i) == 'R') {
            if (col < 4 && numpad[row][col+1] != 0) {
              col++;
            }
          }
          if (line.charAt(i) == 'L') {
            if (col > 0 && numpad[row][col-1] != 0) {
              col--;
            }
          }
          if (line.charAt(i) == 'U') {
            if (row > 0 && numpad[row-1][col] != 0) {
              row--;
            }
          }
          if (line.charAt(i) == 'D') {
            if (row < 4 && numpad[row+1][col] != 0) {
              row++;
            }
          }
        }
        if (numpad[row][col] == 10) {
          System.out.print("A");
        }
        else if (numpad[row][col] == 11) {
          System.out.print("B");
        }
        else if (numpad[row][col] == 12) {
          System.out.print("C");
        }
        else if (numpad[row][col] == 13) {
          System.out.print("D");
        }
        else {
        System.out.print(numpad[row][col]);
        }
      }
      System.out.println("");
      return 0;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[] args) {
    System.out.println(d2a("d2_input.txt"));
    System.out.println(d2b("d2_input.txt"));
  }
}
