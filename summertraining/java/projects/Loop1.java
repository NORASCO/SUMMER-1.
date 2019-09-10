import java.util.Scanner;
public class Loop1
{
    public static void main(String[] args)
    {
        int i,j,k,rows;
        System.out.println("Enter the number of rows:");
        Scanner input = new Scanner(System.in);
        rows= input.nextInt();
        System.out.println("");

        for(i=1;i<rows;i++)
        {
            System.out.println(" ");
        }
        for(j=0;j<rows-1;j++)
        {
            System.out.println("         X");
        }
        for(k=0;k<j-1;k++)
        System.out.println("    X");
    }
}