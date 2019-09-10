import java.util.Scanner;

public class Lottery
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    String input;
    int winningNumber =


    System.out.println("Want to win a million dollars?");
    System.out.println("If so, guess the winning number (a" +
      " number between 0 and " + Integer.MAX_VALUE + ").");
    do
    {
      System.out.print(
        "Insert $1.00 and enter your number or 'q' to quit: ");
      input = stdIn.nextLine();
 if (input.equals("give me a hint"))    //  a back door
      {
        System.out.println("try: " + winningNumber);
      }
      else if (!input.equals("q"))
      
        if (
        {
          System.out.println("YOU WIN!");
          input = "q"; // force winners to quit
        }
        else
        {
          System.out.println(
            "Sorry, good guess, but not quite right.");
        }
       // end else if
    } while (!input.equals("q"));
    System.out.println("Thanks for playing. Come again!");
  }
   }// end main
