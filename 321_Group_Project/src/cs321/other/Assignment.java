
/*
 * The Assignment class will implement the interface of the assignment using 
 * GUI component. This class will also display instructions and the assignment 
 * that the user will be working on, as well as accept submitted 
 * code by the user.
 */
package cs321.other;
import java.util.ArrayList;

/**
 *
 * @author Group1
 */
public class Assignment {
    //Fields:
    
    private ArrayList<String> instruction = new ArrayList<String>();
    private ArrayList<String> masterCode = new ArrayList<String>();
    private ArrayList<String> userEnteredCode = new ArrayList<String>();
    AssignmentTemplateParser parser = new AssignmentTemplateParser.getInstance();
    
    public Assignment(ArrayList<String> instructionOne,
                      ArrayList<String> masterCodeOne)
                      
    {
     instruction = instructionOne;
     masterCode = masterCodeOne;
    }
    

    //Methods:
    
    /**
     * JavaDoc comment
     * @return instructions of type ArrayList string
    */
    public ArrayList<String> getInstruction()
    {
        return instruction;
    }
    
    
    /**
     * JavaDoc comment
     * @param instructions to set instructions
    */
    public void setInstruction(ArrayList<String> instruction)
    {
        this.instruction = instruction;
    }
    
    /**
     * JavaDoc comment
     * @return master code of type ArrayList string
    */
    public ArrayList<String> getMasterCode()
    {
        return masterCode;
    }
    
    /**
     * JavaDoc comment
     * @param masterCode the masterCode to set
     * 
    */
    public void setMasterCode(ArrayList<String> masterCode)
    {
        this.masterCode = masterCode;
    }
    
    /**
     * JavaDoc comment
     * @return userEnteredCode of type ArrayList string
    */
    public ArrayList<String> getUserEnteredCode()
    {
        return userEnteredCode;
    }
    
    /**
     * JavaDoc comment
     * @param userEnteredCode the userEnteredCode to set
    */
    public void setUserEnteredCode(ArrayList<String> userEnteredCode) 
    {
        this.userEnteredCode = userEnteredCode;
    }
}

