public class ArraysTable
{
    public static void main(String[] args)
    {
        int i,j;
        int[][]array = {{2,3,5,},{2,4,6},{3,7,9},{1,4,7},{2,5,8}};
        for(i=0;i<5;i++)
        {
            for(j=0;j<3;j++)
            {
                if(j%3==0)
                System.out.println();
                System.out.print("    "+array[i][j]);
            }
        }
    }
}