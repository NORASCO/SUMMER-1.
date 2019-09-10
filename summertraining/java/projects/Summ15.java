import java.util.Scanner;

public class Summ15
{
    public static void main(String[] args)
    {
         Scanner numbers =new Scanner(System.in);
        int i,j,sum;
        sum=0;
        System.out.println("Enter 15 numbers please to find sum");
       
        
        System.out.println("\n");
        for(i=1;i<16;i++)
        {
            System.out.println("enter "+i);
           int input = numbers.nextInt();
              sum=input+sum;
           
        }
         System.out.println("Answer is:  "+sum);

    }
}