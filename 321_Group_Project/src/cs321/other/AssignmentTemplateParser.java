/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs321.other;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Group 1
 */
public class AssignmentTemplateParser {
    private String line;
    private Scanner read;
    private ArrayList <String> Instruction;
    private ArrayList <String> masterCode;

    public AssignmentTemplateParser(File f){
            Instruction = new ArrayList <String>();
            masterCode = new ArrayList <String>();
            read = new Scanner(f.getPath());
            line = null;
    }
     /**
     * JavaDoc comment
     * @
     * 
     */
    public void readFile()
    {
        
        read.findInLine("@Instruction@");
        line = read.nextLine();
        while(!line.equals("@InstructionEnd@"))
        {
           Instruction.add(line);
           line = read.nextLine();
        }
        
        read.findInLine("@Master@");
        line = read.nextLine();
        while(!line.equals("@MasterEnd@"))
        {
           masterCode.add(line);
           line = read.nextLine();
        }
    }
    
    /**
     * JavaDoc comment
     * @return Instruction of type ArrayList string
    */
    public ArrayList<String> getInstruction()
    {
        return Instruction;
    }
    
    /**
     * JavaDoc comment
     * @return masterCode of type ArrayList string
    */    
    public ArrayList<String> getMasterCode()
    {
        return masterCode;
    }
    
    /**
     * JavaDoc comment
     * @return template the Assignment Object
    */   
    public Assignment getAssignment()
    {
        Assignment template = new Assignment(this.getInstruction(), this.getMasterCode());
        return template;
    }
       
}
