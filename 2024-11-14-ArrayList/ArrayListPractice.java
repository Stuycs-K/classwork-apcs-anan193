import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String> createRandomArray(int size) {
    ArrayList<String> a = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      int random = (int)(Math.random() * 10);
      a.add("" + random);
    }
    return a;
  }
}
