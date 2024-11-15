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
    for(int x = 0; x < original.size(); x++){
      if(original.get(x).equals("")){
        original.set(x, "Empty");
      }
    }
  }
  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
  ArrayList<String> b = new ArrayList<String>(original.size());
  for(int i = original.size() - 1; i > -1; i--){
    b.add(original.get(i));
  }
  return b;
}
public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  ArrayList<String> mix = new ArrayList<String>(a.size() + b.size());
  int i = 0;
  while (i < a.size() && i < b.size()) {
    mix.add(a.get(i));
    mix.add(b.get(i));
    i++;
  }
  if (a.size() > b.size()) {
    while (i < a.size()) {
      mix.add(a.get(i));
      i++;
    }
  }
  else {
    while (i < b.size()) {
      mix.add(b.get(i));
      i++;
    }
  }
  return mix;
}

}
