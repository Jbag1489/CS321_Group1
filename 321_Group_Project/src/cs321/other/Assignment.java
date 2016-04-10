<<<<<<< HEAD
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
     * @param instructions to set instructions
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
     * @param masterCode the masterCode to set
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
     * @param userEnteredCode the userEnteredCode to set
    */
    public void setUserEnteredCode(String[] userEnteredCode) 
    {
        this.userEnteredCode = userEnteredCode;
    }
}
=======
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package cs321.other;
//
///**
// *
// * @author jdbrown2005
// */
//public class Assignment {
//    //Fields:
//    //Can go back and change the types when meet as a group
//    //Not sure about *assignmentParser ??
//    private String[] instructions = new String[0];
//    private String[] masterCode = new String[0];
//    private String[] userEnteredCode = new String[0];
//    //assignmentParser?
//    
//    
//    //Methods:
//    
//    /**
//     * JavaDoc comment
//    */
//    public String[] getInstructions()
//    {
//        return instructions;
//    }
//    
//    /**
//     * JavaDoc comment
//    */
//    public String[] setInstruction()
//    {
//        //??
//    }
//    
//    /**
//     * JavaDoc comment
//    */
//    public String[] getMasterCode()
//    {
//        return masterCode;
//    }
//    
//    /**
//     * JavaDoc comment
//    */
//    public String[] setMasterCode()
//    {
//        //??
//    }
//    
//    /**
//     * JavaDoc comment
//    */
//    public String[] getUserEnteredCode()
//    {
//        return userEnteredCode;
//    }
//    
//    /**
//     * JavaDoc comment
//    */
//    public String[] setUserEnteredCode()
//    {
//        //??
//    }
//}
>>>>>>> origin/master
