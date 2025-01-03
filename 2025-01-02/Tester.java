public class Tester {
  public static void main(String[] args) {
    //System.out.println(fib(46));
    makeWords(3,"","xy");
  }
  public static int fib(int n) {
    if (n == 0) return 0;
    else if (n == 1) return 1;
    else return fib(n-1)+fib(n-2);
  }

  public static void makeWords(int n, String partial, String alphabet) {
    if (n == 0) {
      System.out.println(partial);
      return;
    }
    for (int i = 0; i < alphabet.length(); i++) {
      char c = alphabet.charAt(i);
      makeWords(n-1, partial + c, alphabet);
    }
  }
}
