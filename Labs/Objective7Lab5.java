public class Objective7Lab5 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int sel;

    do {
      System.out.println("____Menu____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My Favorite Foods");
      System.out.println("3: Exit");
      System.out.println();
      sel = scanner.nextInt();

      if (sel == 1) {
        System.out.println("1");
        System.out.println("Hello World");
          continue; }
      if (sel == 2) {
        System.out.println("2");
        System.out.println("Apple, Banana, Coconut");
          continue; }
      if (sel == 3) {
        System.out.println("3");
        System.out.println("Goodbye");
         break; }
    } while (sel >= 1 && sel < 3);
  }
}
