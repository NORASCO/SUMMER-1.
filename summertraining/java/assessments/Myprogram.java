import java.util.Scanner;
public class Myprogram
{
    public static void main(String[] args)
    {
      System.out.println("Please enter four numbers numb1,numb2,numb3,numb4");
      Scanner numb1 =new Scanner(System.in);
        int one=numb1.nextInt();
        Scanner numb2 =new Scanner(System.in);
        int two=numb2.nextInt();
        Scanner numb3 =new Scanner(System.in);
        int three=numb3.nextInt();
        Scanner numb4 =new Scanner(System.in);
        int four=numb4.nextInt();
        int average=(numb1+numb2+numb3+numb4)/4;
        System.out.print("Average value is"+average);

        if(one>two && one>three && one>four)
        {
            System.out.println("maximum value is"+numb1);
        }
        if else(two>one && two>three && two>four)
        {
            System.out.println("maximum value is"+numb2);
        }
        if else(three>one && three>two && three>four)
        {
            System.out.println("Maximum value is"+numb3);
        }
        if else(four>one && four>two && four>three)
        {
            System.out.println("Maximum value is"+numb4);
        }}
        else
      
        if(one<two && one<three && one<four)
        {
            System.out.println("minimum value is"+numb1);
        }
        if else(two<one && two<three && two<four)
        {
            System.out.println("minimum value is"+numb2);
        }
        if else(three<one && three<two && three<four)
        {
            System.out.println("minimum value is"+numb3);
        }
        else(four<one && four<two && four<three)
        {
            System.out.println("minimum value is"+numb4);
        }
    }
        

}