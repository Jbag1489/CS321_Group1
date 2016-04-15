/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs321.other;
import java.util.ArrayList;
import java.awt.Color;
import java.util.HashSet;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import java.lang.Cloneable;

/**
 *
 * @author Group1
 */
public class Checker{
    Assignment checker;
    ArrayList <Integer> errorIndex;
    
    public Checker(Assignment assignmentOne)
    {
         checker.setInstruction(assignmentOne.getInstruction());
         checker.setUserEnteredCode(assignmentOne.getUserEnteredCode());
         checker.setMasterCode(assignmentOne.getMasterCode());
         errorIndex = new ArrayList();
    }

     /**
     * JavaDoc comment
     * @return the number of errors in user's input
    */
    public int getErrors(){
        return errorIndex.size();
    }
    
     /**
     * JavaDoc comment
     * @return accuracy of user's performance of selected assignment (corrected lines out of total lines)
    */
    public double getAccuracy(){
        return ((checker.getUserEnteredCode().size()-errorIndex.size())/checker.getUserEnteredCode().size());
    }
    
     /**
     * JavaDoc comment
     * 
    */
    public void checkline()
    {
      
      ArrayList<String> user = checker.getUserEnteredCode();
      ArrayList<String> master = checker.getMasterCode();
      int check=0;
      
      for(int i=0; i<user.size(); i++)
      {
          if(user.get(i) != null)
          {
              if(!(user.get( i ) .equals( master.get( check ))))
              {
                  errorIndex.add(i); //add wrong line to the array
              }
              check++;
          }
      }
    }

   
    
}
            
