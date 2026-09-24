/*1. Create a class called Invoice that a hardware store might use to represent 
an invoice for an item sold at the store. An Invoice should include four 
pieces of information as instance variables—a part number (type String), a 
part description (type String), a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor 
that initializes the four instance variables. Provide a set and a get method 
for each instance variable. calculates the invoice amount (i.e. multiplies the 
quantity by the price per item), then returns the amount as a double value. 
If the quantity is not positive, it should be set to 0. 
If the price per item is not positive, it should be set to 0.0. 
Write a test application named InvoiceTest that demonstrate class Invoice’s 
capabilities.*/


package assignment2;

class Invoice
{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription,
                   int quantity, double pricePerItem)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;

        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

    public String getPartNumber()
    {
        return partNumber;
    }

    public void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }

    public String getPartDescription()
    {
        return partDescription;
    }

    public void setPartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
    }

    public double getPricePerItem()
    {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem)
    {
        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

    public double getInvoiceAmount()
    {
        return quantity * pricePerItem;
    }
}

public class InvoiceTest
{
    public static void main(String[] args)
    {
        Invoice invoice = new Invoice("P101", "Keyboard", 2, 500.0);

        System.out.println("Part Number : " + invoice.getPartNumber());
        System.out.println("Part Description : " + invoice.getPartDescription());
        System.out.println("Quantity : " + invoice.getQuantity());
        System.out.println("Price Per Item : " + invoice.getPricePerItem());
        System.out.println("Invoice Amount : " + invoice.getInvoiceAmount());

        invoice.setQuantity(-5);
        invoice.setPricePerItem(-100);

        System.out.println();
        System.out.println("After Invalid Values:");
        System.out.println("Quantity : " + invoice.getQuantity());
        System.out.println("Price Per Item : " + invoice.getPricePerItem());
        System.out.println("Invoice Amount : " + invoice.getInvoiceAmount());
    }
}






