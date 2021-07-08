public class SwitchExample {
  public static void main(String[] args) {
    char grade;
    grade = 'A';

    switch (grade) {
      case 'A':
        System.out.println("Fantastic job!");
        break;
      case 'B':
        System.out.println("Good job!");
        break;
      case 'C':
        System.out.println("You are doing ok.");
        break;
      case 'D':
        System.out.println("Please schedule a conference.");
        break;
      case 'F':
        System.out.println("Start finishing homework and showing up to class.");
        break;
      default:
        System.out.println("Invalid grade.");
    }
  }
}
