import java.util.*;


class Program
{
    String name;
    int age;

    Program(String name,int age)
    { 
        this.name = name;
        this.age = age;
          Code.checkBongoMovies(name);

   
    

    }


    public static void main(String [] args)
    {
         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to Movie show, Enter your age to direct you to movies");
      int  newAge = input.nextInt();
         System.out.println("enter your name");
        String newName = input.next();
            
          Program program = new Program(newName,newAge);
          program.checkAge();
        
}

 

 public void checkAge()
 {
      if(age >19)
      {
         checkAdultMovie(name);
      }
      else if(age < 18)
      {
          checkCartoonMovie(name);
      }
      else if(age >60)
      {
         readHolyBooks(name);
      }
      else{
          System.out.println("your out of option");
      }
 }

public void checkAdultMovie(String name)
{
  System.out.println("Welcome to Adult movies");
}

public void checkCartoonMovie(String name)
{
  System.out.println("Welcome to Cartoons movies");
}

public void readHolyBooks(String name)
{
System.out.println("Welcome to HolyBooks movies");
}





public double doebleAge(int age)
{
   int ag = 2*age;
  return ag ;
}


}

class Code
{
  public static void checkBongoMovies(String name)
  {
    System.out.println("Welcome to Bongo Movies"+"   "+name);
  }
} 