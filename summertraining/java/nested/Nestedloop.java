public class Nestedloop
{
    public static void main(String[] args)
    {
        int i,j;
        System.out.println("aNSWER IS");
        for(i=0;i<10;i++)
        if(i/2==0)
        {
            break;
        }
        System.out.println("X"+i);

        for(j=0;j<10;j++)

        if(j%2==1)
        {
            continue;
        }
      System.out.println("X"+j);
    }
}