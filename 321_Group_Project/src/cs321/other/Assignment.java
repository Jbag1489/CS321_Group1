/*
 * The Assignment class will implement the interface of the assignment using 
 * GUI component. This class will also display instructions and the assignment 
 * that the user will be working on, as well as accept submitted 
 * code by the user.
 * 
 */
package cs321.other;
import java.util.ArrayList;

/**
 * 
 * @author Group1
 */
public class Assignment {
    //Fields:
    
    private ArrayList<String> instruction;
    private ArrayList<String> masterCode;
    private ArrayList<String> userEnteredCode;
    /*
    * Javadoc comments needed
    * @param instruction
    * @param masterCode
    */
    public Assignment(ArrayList<String> instruction, ArrayList<String> masterCode)
                      
    {
        this.instruction = instruction;
        this.masterCode = masterCode;
    }

    //Methods:
    
    /**
     * JavaDoc comment
     * @return instruction of type ArrayList string
    */
    public ArrayList<String> getInstruction()
    {
        return instruction;
    }
    
    /**
     * JavaDoc comment
     * @param instruction to set instructions
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

