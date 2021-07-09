public class Objective8Lab3 {
  public static void main(String[] args) {
    int i;
    int even = 2;

    for (i = 1; i <= 20; i++) {
      if (i % even != 0) System.out.println(i + " is odd");
      if (i % even == 0) System.out.println(i + " is even");

    }
}
}
