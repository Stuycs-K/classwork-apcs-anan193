public class MyArrays {
  public static String arrayToString(int[] nums) {
    String str = "[";
    for (int i = 0; i < nums.length; i++) {
      str += nums[i];
      if (i < nums.length - 1) {
        str += ", ";
      }
    }
    str += "]";
    return str;
  }

  public static int[] returnCopy(int[] ary) {
    int[] newArr = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      newArr[i] = ary[i];
    }
    return newArr;
  }

  public static int[] concatArray(int[] ary1, int[] ary2) {
    int[] newArr = new int[ary1.length + ary2.length];
  }

  public static void main(String[] args) {
    int[] arr = new int[] {0, 1, 2, 3, 4};
    int[] empty = new int[0];
    System.out.println(arrayToString(arr));
    System.out.println(arr == returnCopy(arr));
  }
}
