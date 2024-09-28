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
    for (int i = 0; i < ary1.length; i++) {
      newArr[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++) {
      newArr[i + ary1.length] = ary2[i];
    }
    return newArr;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] {0, 1, 2, 3, 4};
    int[] arr2 = new int[] {20, 30, 40, 50};
    int[] empty = new int[0];
    System.out.println(arrayToString(arr1));
    System.out.println(arr1 == returnCopy(arr1));
    System.out.println(arrayToString(concatArray(arr1, arr2)));
    
  }
}
