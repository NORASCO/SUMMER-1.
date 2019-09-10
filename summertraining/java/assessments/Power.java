import java.lang.*;
import java.util.Scanner;
public class Power
{
    public static void main(String[] args)
    {
        System.out.println("Below is a table of powers of N from 1-10 select\n Choose the number to fill the table");
        Scanner powers =new Scanner(System.in);
        int input = powers.nextInt();
        System.out.println("\n");

        int a=10;
        int b=100;
        int c=1000;
        //Power=0;
        if(input>1 && input<10)
        {
        for(int i=input;i<10;i++)
        {
            System.out.println("   "+Math.pow(10,i)+ "             "+ Math.pow(100,i) +"           "+Math.pow(1000,i));
        }
    }
    else
    {
        System.out.println("Student follow all the instructions");

    }
    }
}