package cs321.other;
import java.util.ArrayList;
/**
 * The Assignment class will implement the interface of the assignment using 
 * GUI component. This class will also display instructions and the assignment 
 * that the user will be working on, as well as accept submitted 
 * code by the user.
 * 
 * @author Group1
 * @version 04/18/16
 */

public class Assignment implements Cloneable {
    /**
     * Declared field variables that represent
     * instructions, masterCode and userEnteredCode
     * in the form of arrayLists.
     * 
    */
    
    private ArrayList<String> instruction;
    private ArrayList<String> masterCode;
    private ArrayList<String> userEnteredCode;
    /**
    * Creates an assignment that contains arrayLists 
    * of instructions and masterCode.
    * @param instruction
    * @param masterCode
    */
    public Assignment(ArrayList<String> instruction, ArrayList<String> masterCode)                   
    {
        this.instruction = instruction;
        this.masterCode = masterCode;
    }
    
    /**
    * Creates an assignment that contains arrayLists 
    * of instructions, masterCode, and typedCode
    * @param instruction
    * @param masterCode
    * @param typedCode 
    */
    public Assignment(ArrayList<String> instruction, ArrayList<String> masterCode, ArrayList<String> typedCode)                   
    {
        this.instruction = instruction;
        this.masterCode = masterCode;
        this.userEnteredCode = typedCode;
    }
    
    /**
     * Returns instructions
     * @return instruction of type ArrayList string
    */
    public ArrayList<String> getInstruction()
    {
        return instruction;
    }
    
    /**
     * Passes in the changed instructions.
     * @param instruction to set instructions
    */
    public void setInstruction(ArrayList<String> instruction)
    {
        this.instruction = instruction;
    }
    
    /**
     * Returns master code.
     * @return master code of type ArrayList string
    */
    public ArrayList<String> getMasterCode()
    {
        return masterCode;
    }
    
    /**
     * Passes in the newly set master code.
     * @param masterCode the masterCode to set
     * 
    */
    public void setMasterCode(ArrayList<String> masterCode)
    {
        this.masterCode = masterCode;
    }
    
    /**
     * Returns the code entered by the user.
     * @return userEnteredCode of type ArrayList string
    */
    public ArrayList<String> getUserEnteredCode()
    {
        return userEnteredCode;
    }
    
    /**
     * Sets or updates the entered code by the user.
     * @param userEnteredCode the userEnteredCode to set
    */
    public void setUserEnteredCode(ArrayList<String> userEnteredCode) 
    {
        this.userEnteredCode = userEnteredCode;
    }
}

