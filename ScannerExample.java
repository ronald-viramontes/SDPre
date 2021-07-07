public class ScannerExample {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    // changed the initial variable name from scanner to keyboard.
    System.out.println("Please enter your username");
    String userInput = keyboard.nextLine();
    // changed the variable scanner back to keyboard.
    // changed the variable from keyboard to scanner,
    // since keyboard was not defined in example.
    System.out.println("Hello " + userInput + "!");
  }
}
