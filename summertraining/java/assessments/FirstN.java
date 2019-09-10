import java.util.Scanner;
public class FirstN
{
    public static void main(String[] args)
    {
        //int N;
        System.out.println("Enter the number N");
        Scanner N = new Scanner(System.in);
        int input = N.nextInt();
        

        System.out.println("\n");
        if(input>0 && input <20)
        {
            for(int i = input ;i<20;i++)
         {
             if(i%2==0)
             {
                 continue;
             }
                System.out.println(" "+i +",");
         }
        }
        else
        {
            System.out.println("Dear students,try again you are beyond the level");
        }
    }
}