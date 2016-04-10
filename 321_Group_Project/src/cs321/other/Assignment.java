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
    */
    public String[] getInstructions()
    {
        return instructions;
    }
    
    /**
     * JavaDoc comment
    */
    public String[] setInstruction()
    {
        
    }
    
    /**
     * JavaDoc comment
    */
    public String[] getMasterCode()
    {
        return masterCode;
    }
    
    /**
     * JavaDoc comment
    */
    public String[] setMasterCode()
    {
        //??
    }
    
    /**
     * JavaDoc comment
    */
    public String[] getUserEnteredCode()
    {
        return userEnteredCode;
    }
    
    /**
     * JavaDoc comment
    */
    public String[] setUserEnteredCode()
    {
        //??
    }
}
