public class First20OddNumbers
{
    public static void main(String[] args)
    {
    int i,j;
    i=0;
    j=11;
     System.out.println("numbers are:");
    while(i<10)
    {
       i++;
        if(i%2==0)
        {
        continue;
        }
        System.out.printf(i+",");
 while(j<20)
 {
     j++;
            if(j%2==0)
            {
                continue;
            }
            System.out.print(j+",");
 }
        }
    }
}