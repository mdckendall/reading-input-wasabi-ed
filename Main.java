import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    String someString = myObj.nextLine();

    System.out.println("Length of string: " + someString.length());
  }
}