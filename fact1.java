public class fact1 {
  public static void main(String[] arg) {

    factorial(10);
  }
  public static void factorial(int a) {
    if (a == 0)
      return;

    System.out.println(a);

    factorial(a - 1);
  }
}
