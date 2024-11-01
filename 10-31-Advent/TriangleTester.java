// I worked with Galen

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TriangleTester {

  public static int countTrianglesA(String filename) {
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);

      int count = 0;
      while(input.hasNextLine()) {
        String line = input.nextLine();
        Scanner lineScan = new Scanner(line);
        int longest = -1;
        int sum = 0;

        for (int i = 0; i < 3; i++) {
          int x = lineScan.nextInt();
          longest = Math.max(longest,x); //finding max length
          sum += x; //adding to perimeter
        }

        if (2*longest < sum) count++; //triangle inequality
        lineScan.close();
      }

      input.close();
      return count;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static int countTrianglesB(String filename) {
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      int count = 0;
      int[][] ary = new int[3][3];
      while(input.hasNextLine()) { //grabs a 3x3 block
        for (int i = 0; i < 3; i++) { 
          String line = input.nextLine();
          Scanner lineScan = new Scanner(line);

          for (int k = 0; k < 3; k++) {
            ary[i][k] = lineScan.nextInt();
          }
          lineScan.close();
        }

        for(int i = 0; i < 3; i++) {
          if (
            ary[0][i] < ary[1][i] + ary[2][i]
            &&
            ary[1][i] < ary[0][i] + ary[2][i]
            &&
            ary[2][i] < ary[1][i] + ary[0][i]
          ) count++;
        }

      }

      input.close();
      return count;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }

}
