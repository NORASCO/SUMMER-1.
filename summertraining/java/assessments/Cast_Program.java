import java.util.*;

  public class Cast_Program{
     public static void main(String []args)
     {
  Scanner in = new Scanner(System.in);
  String a,b;
  int answer;

  System.out.println ("Welcome to Addition Calculator");

  System.out.println ("Enter first Number");
  a = in.next();

  System.out.println  ("Enter second Number");
  b = in.next();
  

  System.out.println  ( a + b +" This is Concatenation");

  //CASTING
  int a1 = Integer.parseInt(a);
  int b1 = Integer.parseInt(b);

  //Tricks

    /** int to string
     *  String a = String.parseString(intValue)
     * 
     * 
     * 
     * 
     * char a = 'r';
     * String b = "2";
     * 
     * 
     * 
     *  
     * 
     * 
     * 
     * 
     * 
     * 
         */
    
    
    
    


 



  answer = a1+ b1;

  System.out.println ("Answer is: " + answer + "\n\n");



              

     }
  }