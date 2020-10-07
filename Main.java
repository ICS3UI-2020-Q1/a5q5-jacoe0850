import java.util.Scanner;
/**
 * Makes a line of stars
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //make scanner for input
    Scanner input = new Scanner(System.in);
    // ask for number and make variable
    System.out.println("Please enter a number between 1 and 10");
    int num = input.nextInt();
// for loop calculates how long line will be and system.out.print
    for(int count=1; count<= num; count++){
      System.out.print("*");
    }
    
  }
}
