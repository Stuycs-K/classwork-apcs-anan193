public class Color {
  public static final String CLEAR_SCREEN =  "\u001b[2J";

  public static void main(String[] args) {
    System.out.print(CLEAR_SCREEN);

    int radius = 20; //0,0 is bottom left corner, 20,20 is the center, 40,40 is the top right

    for (int y = 0; y < 2 * radius+1; y++) {
        for (int x = 0; x < 2 * radius+1; x++) {
            
            int xDistance = radius - x;
            int yDistance = radius - y;
            int totalDistance = xDistance * xDistance + yDistance * yDistance;

            if (totalDistance <= radius * radius) {
              double brightness = 255 * totalDistance/(radius*radius);
              double angle = 0;
              if (xDistance!=0) {
                angle = Math.atan(yDistance/xDistance) * 180 / Math.PI;
              }
              else if (yDistance!= 0){
                angle = Math.abs(yDistance)/yDistance * 90;
              }

              int r,g,b;
              
              r = (int) (brightness * (angle)) % 256;
              g = (int) (brightness * (angle + 120)) % 256;
              b = (int) (brightness * (angle + 240)) % 256;

              System.out.print("\u001b[48;2;" + r + ";" + g + ";" + b + "m  ");
            } 
            else {
              System.out.print("\u001b[0m");
              System.out.print("  ");
            }
        }
        System.out.print("\u001b[0m");
        System.out.println();  
    }
    
    System.out.print("\u001b[0m");
}
}
