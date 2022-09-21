import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter a word:");

    Scanner myObj = new Scanner(System.in);
    String someString = myObj.nextLine();

    System.out.println(someString.length());
    
    //Your code will return the length of the entered String
  }
}
