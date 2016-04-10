/*
 * The Assignment class will implement the interface of the assignment using 
 * GUI component. This class will also display instructions and the assignment 
 * that the user will be working on, as well as accept submitted 
 * code by the user.
 */
package cs321.other;

/**
 *
 * @author Group1
 */
public class Assignment {
    //Fields:
    private String[] instructions = new String[0];
    private String[] masterCode = new String[0];
    private String[] userEnteredCode = new String[0];
    AssignmentTemplateParser parser = new AssignmentTemplateParser.getInstance();
    
    //Methods:
    
    /**
     * JavaDoc comment
     * @return instructions of type ArrayList string
    */
    public String[] getInstructions()
    {
        return instructions;
    }
    
    /**
     * JavaDoc comment
     * @param
    */
    public void setInstruction(String[] instructions) 
    {
        this.instructions = instructions;
    }
    
    /**
     * JavaDoc comment
     * @return master code of type ArrayList string
    */
    public String[] getMasterCode()
    {
        return masterCode;
    }
    
    /**
     * JavaDoc comment
     * @param 
     * 
    */
    public void setMasterCode(String[] masterCode)
    {
        this.masterCode = masterCode;
    }
    
    /**
     * JavaDoc comment
     * @return userEnteredCode of type ArrayList string
    */
    public String[] getUserEnteredCode()
    {
        return userEnteredCode;
    }
    
    /**
     * JavaDoc comment
     * @param
    */
    public void setUserEnteredCode(String[] userEnteredCode) 
    {
        this.userEnteredCode = userEnteredCode;
    }
}
