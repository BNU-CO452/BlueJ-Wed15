import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author Derek Peacock
 * @version (a version number or a date)
 */
public class Ticket
{
    private String destination;
    
    // this is in pence
    private int price;
    
    private Date datePurchased = new Date();
    
    /**
     * Constructor for objects of class Ticket
     */
    public Ticket()
    {
        price = 220;
        destination = "Aylesbury";
    }
    
    /**
     * 
     */
    public Ticket(String destination, int price)
    {
        this.price = price;
        this.destination = destination;
    }
    
    /**
     * 
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * 
     */
    public String getDestination()
    {
        return destination;
    }
    
    public void print()
    {
        System.out.print("Destination: " + destination);
        System.out.println(" Price " + price + " pence");
    }

}
