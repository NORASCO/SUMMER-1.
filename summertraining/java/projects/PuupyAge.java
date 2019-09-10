public class PuupyAge
{
    public static void main(String[] args)
    {
         PuupyAge small = new PuupyAge("Josephina");
         PuupyAge old = new PuupyAge("Phelista",72);

    }
public PuupyAge(String name)
{
   
System.out.println("Name of smallest puupy is:"+name);
}

public PuupyAge(String name,int age)
{
   
System.out.println("NAME of Old IS:"+name);
System.out.println("Age of Old IS:"+age+"years");
}

}