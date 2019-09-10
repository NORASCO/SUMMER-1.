import java.util.Scanner;
public class PassFail
{
    int marks,input2;
    PassFail(int marks)
    {
        this.marks=marks;
        marksTat(marks);
       
    }
    public static void main(String[] args)
    {
        Scanner marks =new Scanner(System.in);
        System.out.println("          welcome Student\n      Now Enter your marks");
        int input = marks.nextInt();
        PassFail Test = new PassFail(input);
       
    }
    public void marksTat(int m)
    {
       
        if(m>50)
        {
          System.out.println("Congratilations");
        }
        else
        {
           System.out.println("Failed");
        }
    }
}
        
   /* }
         public void marksGreaterThanFifty()
         {
             System.out.println("      Congratulations You have passed from test");
         }
    public void marksLessThanFifty()
    {
        System.out.println("Discontinued from this university");
    }
}**/