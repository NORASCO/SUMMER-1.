import java.util.*;

public class Malipo
{
    public static void main(String []args)
    {
         Scanner input = new Scanner(System.in);


         System.out.println("WELCOME TO MALIPO PROGRAM ,CHOOSE YOUR OPTION BELOW");

         System.out.println("1.M-PESA   \n 2.TIGO-PESA  \n 3.HALO-PESA");
         int userOption = input.nextInt();

         switch (userOption) {
             case 1: 
                     System.out.println(" 1.Tuma Pesa");
                     System.out.println("2.Toa Pesa");
                     System.out.println("3.Nunua Vifurushi vya muda wa maongezi");
                     System.out.println("4.Lipa kwa M-Pesa");
                     System.out.println("5.M-Power");
                     System.out.println("6.Huduma za Kifedha");
                     System.out.println("7.Account Yangu(Jihudumie)");

                     int mpesa_input = input.nextInt();

                       switch(mpesa_input)
                       {
                           case 1:
                           System.out.println("1.Ingiza namba ya simu");
                           System.out.println("2.Chagua Namba Kwenye Orodha");
                           System.out.println("3.Tuma mitandao Mingine");
                           System.out.println("4.tuma kwenda Benki");
                           break;
                           case 2:
                           System.out.println("Weka namba ya Wakala au Weka 99999 Kutoa kwa njia ya ATM\n");
                           break;
                           case 3:
                           System.out.println("1.Mnunulie rafiki");
                           System.out.println("2.simu yangu");
                           System.out.println("3.Nunua vifurushi kwa njia ya Mpesa");
                           default:
                           System.out.println("Huduma hii haipatikani kwa sasa Tafadhari jaribu tena Badae");
                       }
                 
                 break;
             case 2:
             System.out.println("1.Tuma Pesa") ;
             System.out.println("2.Vocha na Vifurishi");
             System.out.println("3.Kutoa Pesa");
             System.out.println("4.Lipa Bili");
             System.out.println("5. Lipa Bidhaa");
             System.out.println("6.Jihudumie (Account na Salio)");
             System.out.println("7.Huduma za kifedha");
             System.out.println("8.Language");
             break;
                case 3:
                System.out.println("1.Tuma pesa");
                System.out.println("2.Kutoa Pesa");
                System.out.println("3.Vocha Na vifurushi");
                 System.out.println("4.Lipa Bili");
                 System.out.println("5. Lipia Bidhaa");
                 System.out.println("6.Tuma Benki");
                 System.out.println("7.Halo Yako");
                 System.out.println("8.Angalia  Salio");
                 System.out.println("9.Account Yangu");
                break;
             default:


             System.out.println("WRONG INPUT");
                 break;
         }

    }
}