import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d1 {
    public static int d1(String filename) {
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int orientation = 0;
            int x = 0;
            int y = 0;
            while (input.hasNext()) {
                String direction = input.next();
                if (direction.charAt(direction.length() - 1) == ',') {
                    direction = direction.substring(0, direction.length() - 1);
                }
                
                char turn = direction.charAt(0);
                int steps = Integer.parseInt(direction.substring(1));
                
                if (turn == 'R') {
                    orientation = (orientation + 1) % 4;
                } else if (turn == 'L') {
                    orientation = (orientation - 1 + 4) % 4;
                }

                if (orientation == 0) {
                  y+=steps;
                }
                if (orientation == 1) {
                  x+=steps;
                }
                if (orientation == 2) {
                  y-=steps;
                }
                if (orientation == 3) {
                  x-=steps;
                }
            }

            return Math.abs(x) + Math.abs(y);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(d1("d1_input.txt"));
    }
}