import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    int testNum = 0;
    String testName;

    /****************************************************
    Test 1 - Testing createRandomArray
    ****************************************************/

    testNum++;
    testName = "createRandomArray";

    ArrayList<String> a = ArrayListPractice.createRandomArray(100);
    System.out.println(a.toString());
  }
}
