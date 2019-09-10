import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        int input;
        System.out.println("Ndugu mteja karibu katika huduma ya Malipo");
        System.out.println(" Tafadhari chagua numbers 1.M-PESA 2.TIGO-PESA 3.HALOTEL");
        Scanner numbers =new Scanner(System.in);
        input = numbers.nextInt();
        System.out.println("\n");
        if(numbers==1)
        {
            System.out.println("1.Toa Pesa \n2.Tuma Pesa \n3.Nunua Muda Wa maongezi");

        }
        else if(numbers==2)
        {
            /* Scanner numbers =new Scanner(System.in);
            int input=numbers.nextInt();**/
            System.out.println("\n1.Tuma Pesa \n2.Vocha na vifurushi \n3.Kutoa Pesa");
            System.out.println("\n4.LipaBills \n5.Lipia Bidhaa");
        }
        else if(numbers==3)
        {
            System.out.println("\n1.Tuma Pesa \n2.Vocha na vifurushi \n3.Kutoa Pesa");
            System.out.println("\n4.LipaBills \n5.Lugha");

        }
        else
        {
            System.out.println("incorrect input");

        }
        
    }
}