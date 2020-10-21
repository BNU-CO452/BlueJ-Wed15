
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    private boolean completed;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        mark = 0;
        this.title = title;
        this.codeNo = codeNo;
        completed = false;
    }
    
    public void setMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
            if(mark >= 40) completed = true;
        }
    }
    
    public boolean isCompleted()
    {
        return completed;
    }
    
    /**
     * 
     */
    public int getMark()
    {
        return mark;
    }

    /**
     * 
     */
    public void print()
    {
        System.out.println(title + codeNo);
    }
}
