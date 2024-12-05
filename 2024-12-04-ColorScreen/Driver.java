public class Driver {
    public static void border() {
        Text.go(0,0);
        Text.color(Text.YELLOW,Text.background(Text.CYAN));
        
        for (int i = 0; i < 80; i++) {    
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < 28; i++) {
            System.out.print("*");
            System.out.print(Text.RESET);
            for (int k = 0; k < 78; k++) {
                System.out.print(" ");
            }
            Text.color(Text.YELLOW,Text.background(Text.CYAN));
            System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < 80; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print(Text.RESET);
    }
    
    public static void displayNums(int[] nums) {
        for (int i = 0; i < 3; i++) {
            Text.go(2,20*(i+1));
            if (nums[i] < 25) {
                Text.color(Text.BRIGHT,Text.RED);
            }
            else if (nums[i] > 75) {
                Text.color(Text.BRIGHT,Text.GREEN);
            }
            else {
                System.out.print(Text.RESET);
            }
            System.out.print(nums[i]);
        }
        
    }

    public static void divider() {
        Text.go(3,2);
        Text.color(Text.BRIGHT,Text.background(Text.YELLOW),Text.MAGENTA);
        for (int i = 0; i < 78; i++) {
            System.out.print("+");
        }
    }

    public static void face() {
        Text.color(Text.BRIGHT,Text.background(Text.YELLOW));
        Text.go(10,30);
        System.out.print(" ");
        Text.go(10,50);
        System.out.print(" ");
        Text.go(13,35);
        for (int i = 35; i <= 45; i++) {
            System.out.print(" ");
        }
    }
    
    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        border();

        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        displayNums(nums);
        divider();
        face();
        System.out.print(Text.RESET);
        Text.go(31,0);
    }
}