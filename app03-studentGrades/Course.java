
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Derek Peacock
 * @version 0.1 11/Sep/2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    
    private String title;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int noModules;
    
    private int finalMark;
    private Grades finalGrade;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        noModules = 0;
        
        finalGrade = Grades.NULL;
        createModules();
    }

    public void createModules()
    {
        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Programming Concepts", "CO452");
        module3 = new Module("Programming Concepts", "CO452");
        module4 = new Module("Programming Concepts", "CO452");
        
    }
    
    public void addModule(Module module)
    {
        noModules ++;
        
        if(noModules == 1)
        {
            module1 = module;
        }
    }
    
    public void setModuleMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.setMark(mark);
        }// add others
    }

    public void calculateFinalGrade()
    {
        if(finalMark < 40)
        {
            finalGrade = Grades.F;
        }
        else if((finalMark >= 40) && (finalMark < 50))
        {
            finalGrade = Grades.D;
        }
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
    }
}
