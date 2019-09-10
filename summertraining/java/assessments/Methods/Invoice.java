public class Invoice
{
   
    Invoice(String PartNumber, String PartDescription, int quantity, double price_peritem)
    {
      getInvoiceDetails(PartNumber,PartDescription,quantity,price_peritem);
        
    }
    public static void main(String[] args)
    {
        Invoice store1 = new Invoice("ST01","Stationary",40,500.0);
        Invoice store2 = new Invoice("ST02","Drinks",4,500.0);
        
    }
    public void getInvoiceDetails(String PartNumber, String PartDescription, int quantity, double price_peritem)
    {
        System.out.println("Part Number:"+PartNumber);
        System.out.println("Part Description:"+PartDescription);
        System.out.println("Purchaised quantity:"+quantity);
        System.out.println("Price per Units:"+price_peritem);
        System.out.println("*********************************************");
        System.out.println("Total cost for product:"+PartNumber+ "  is  " +quantity*price_peritem);
        System.out.println("*********************************************");
        
    }
}