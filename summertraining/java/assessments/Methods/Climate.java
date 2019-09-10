public class Climate
{
    public static void main(String[] args)
    {
        int i,j;
        int[][]climate = {{23,23,35},{25,30,26},{23,35,24},{20,22,28},{25,30,26},{23,24,22},{25,33,24},{23,27,25},{23,25,29},{22,31,30},{23,27,23},{22,27,20}};
        String[]Month={"January","February","March","April","May","June","July","Augost","September","October","Novenber","December"};
        System.out.println("     THE CLIMATE CHANGE IN 3YEARS");
        for(i=0;i<12;i++)
          {
               
         for(j=0;j<3;j++)
         {
        if(j%3==0)
        System.out.println();
       
        System.out.print("      "+climate[i][j]);
        }
     System.out.println("  "+Month[i]); 
      
    }
    }
}