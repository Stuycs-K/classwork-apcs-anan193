import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


public class d6 {
  public static String hash(ArrayList<String> a) {
    String message = "";
    for (int i = 0; i < a.get(0).length(); i++) { //choose a column
      HashMap<String, Integer> chars = new HashMap<String, Integer>();
      for (int j = 0; j < a.size(); j++) { //choose a row
        String letter = a.get(j).substring(i,i+1);
        if (chars.containsKey(letter)) {
          int freq = chars.get(letter);
          freq++;
          chars.put(letter,freq);
        }
        else {
          chars.put(letter,1);
        }
      }
      int max_freq = 0;
      String max_letter = "";

      for (String key : chars.keySet()) {
        int frequency = chars.get(key);
        if (frequency > max_freq) {
          max_freq = frequency;
          max_letter = key;
        }
      }
      message += max_letter;
    }
    System.out.println(message);
    return message;
  }

  public static String minHash(ArrayList<String> a) {
    String message = "";
    for (int i = 0; i < a.get(0).length(); i++) { //choose a column
      HashMap<String, Integer> chars = new HashMap<String, Integer>();
      for (int j = 0; j < a.size(); j++) { //choose a row
        String letter = a.get(j).substring(i,i+1);
        if (chars.containsKey(letter)) {
          int freq = chars.get(letter);
          freq++;
          chars.put(letter,freq);
        }
        else {
          chars.put(letter,1);
        }
      }
      int max_freq = 1000;
      String min_letter = "";

      for (String key : chars.keySet()) {
        int frequency = chars.get(key);
        if (frequency < max_freq) {
          max_freq = frequency;
          min_letter = key;
        }
      }
      message += min_letter;
    }
    System.out.println(message);
    return message;
  }


  public static int d6a (String filename) {
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      ArrayList<String> lines = new ArrayList<String>();
      while (input.hasNextLine()) {
        String a = input.nextLine();
        lines.add(a);
      }
      hash(lines);
      minHash(lines);
      return 0;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[] args) {

    d6a("d6_input.txt");
  }
}
