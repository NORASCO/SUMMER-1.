public class First20OddNumber
{
    public static void main(String[] args)
    {
        int number;
        number=0;
           System.out.printf("numbers are:");
        while(number<20)
        {
            number++;
            if(number%2==0)
            {
                continue;
            }
            System.out.printf(number + ",");
        }
    }
}