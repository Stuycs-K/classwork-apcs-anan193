public class ArrayMethods {
  //1. Write both your names + emails at the top of the document as a comment.
  // Andy Jiang - andyj44@nycstudents.net
  // Bryan Lam - bryanl156@nycstudents.net
  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[]ary){
    String str = "[";
    for (int i = 0; i < ary.length; i++) {
      str += ary[i];
      if (i < ary.length - 1) {
        str += ", ";
      }
    }
    str += "]";
    return str;
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    String str = "[";
    for (int i = 0; i < ary.length; i++){
      str += arrToString(ary[i]);
      if (i < ary.length - 1){
        str += ", ";
      }
    }
    str += "]";
    return str;
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int k = 0; k < nums[i].length; k++) {
        sum += nums[i][k];
      }
    }
    return sum;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }

  public static void main(String[] args) {
    int[][] test1 = new int[][] {{1}, {2}, {3}, {4, 5}};
    int[][] test2 = new int[][] {{}, {}, {}};
    int[][] test3 = new int[][] {};
    int[][] test4 = new int[][] {{},{145,213,2},{4},{12,3021,12}};
    System.out.println(arrToString(test1));
    System.out.println(arrToString(test2));
    System.out.println(arrToString(test3));
    System.out.println(arrToString(test4));
    System.out.println(arr2DSum(test1));
    System.out.println(arr2DSum(test2));
    System.out.println(arr2DSum(test4));
  }
}
