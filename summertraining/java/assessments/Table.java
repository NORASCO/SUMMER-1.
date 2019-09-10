import java.util.Scanner;
public class Table 
{
    public static void main(String[] args)
    {
        int product=0;
        System.out.println("Welcome in Mthematics tables");
        System.out.println("Choose table from 1 to 12");

        Scanner table =new Scanner(System.in);

        int input=table.nextInt();
        if(input>0 && input <12)
        {
            for(int i=1;i<13;i++)
            {
                product=input*i;
                System.out.println(+product);
            }
        }
        else
        {
            System.out.println("INVALID INPUT BE CAREFUL!");
        }
    }

}