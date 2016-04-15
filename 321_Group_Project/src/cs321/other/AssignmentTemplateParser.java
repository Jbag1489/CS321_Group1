/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs321.other;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Group 1
 */
public class AssignmentTemplateParser {
    
    private ArrayList <String> Instruction;
    private ArrayList <String> masterCode;

 
     /**
     * JavaDoc comment
     * @
     * 
     */
    public void readFile(File f)
    {
        Instruction = new ArrayList <String>();
        masterCode = new ArrayList <String>();
        try{
        FileInputStream read = new FileInputStream(f);
        BufferedReader reader = new BufferedReader(new InputStreamReader(read));
        String line = reader.readLine();
        while (!line.equals("@Instruction@"))
            line = reader.readLine(); //until it reads @Instruction@
        line = reader.readLine();
        while(!line.equals("@InstructionEnd@")) //until it reaches @InstructionEnd@
        {
           Instruction.add(line);
           line = reader.readLine();
        }
        
        while (!line.equals("@Master@"))
            line = reader.readLine();
        while(!line.equals("@MasterEnd@"))
        {
           masterCode.add(line);
           line = reader.readLine();
        }
        reader.close();
    }
    catch (IOException e){
        System.err.println("Unable to read from file");
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
