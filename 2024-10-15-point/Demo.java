public class Demo{

    /*
    Write this method third. Test it then move on
    to the others.
    */
    public static double distance(Point a, Point b){
      return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }
  
    public static void main(String[]args){
      Point p1 = new Point(1,1);
      Point p2 = new Point(-1,-1);
      Point p3 = new Point(3,4);
      Point p4 = new Point(0,0);
      Point p5 = new Point(1,0);
      Point p6 = new Point(0.5,Math.sqrt(3)/2);
      System.out.println(p3);
      System.out.println(distance(p1,p2));
      System.out.println(Point.distance(p1,p2));
      System.out.println(p1.distanceTo(p2));
      System.out.println("Testing equilateral triangle: point 1: " + p4 + "point 2: " + p5 + "point 3: " + p6);
      System.out.println(distance(p4,p5));
      System.out.println(Point.distance(p5,p6));
      System.out.println(p4.distanceTo(p6));
  
  
  
  
    }
  }