
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
    
    /**
     * Constructor for objects of class Ticket
     */
    public Ticket()
    {
        price = 220;
        destination = "Aylesbury";
    }
    
    public Ticket(String destination, int price)
    {
        this.price = price;
        this.destination = destination;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }

}
