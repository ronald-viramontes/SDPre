public class Objective9Lab3 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int selection;

    while(true) {
      printMenu();
      selection = scanner.nextInt();
      if (selection == 1) { System.out.println("Hello Human"); continue; }
      if (selection == 2) { System.out.println("Apples, Bananas, Coconuts"); continue; }
      if (selection == 3) { System.out.println("Exit"); break; }
    }
      scanner.close();
}
  public static void printMenu() {
    System.out.println("____Menu____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My Favorite Foods");
    System.out.println("3: Exit");
  }
}
