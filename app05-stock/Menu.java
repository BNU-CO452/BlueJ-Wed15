
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    private static InputReader reader = new InputReader();
    
    public static int getChoice(String [] choices)
    {
        int choiceNo = 0;
        boolean isValid = false;
        
        while(!isValid)
        {
            Menu.displayChoices(choices);


            choiceNo = reader.getInt(" Please enter your choice > ");

            if(choiceNo > 0 && choiceNo <= choices.length)
            {
                isValid = true;
            }
            else
            {
                System.out.println(" Please enter a number between 1 and " 
                    + choices.length);
            }
        }
        
        return choiceNo;
    }
    
    public static void displayChoices(String [] choices)
    {
        System.out.println("\n Your Choices are: \n");
        
        for(int index = 0; index < choices.length; index++)
        {
            System.out.println("   " + (index + 1) + ". " + choices[index]);
        }
        
        System.out.println();
    }
}
