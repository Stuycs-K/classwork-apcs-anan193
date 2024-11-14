import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String> createRandomArray(int size) {
    ArrayList<String> a = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      int random = (int)(Math.random() * 10);
      if(random == 0){
        a.add("");
      }
      else{
        a.add("" + random);
      }
    }
    return a;
  }
  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".\
    for(int x = 0; x < original.length(); x++){
      if(a.get(x).equals("")){
        a.set(x, "Empty");
      }
    }
  }

}
