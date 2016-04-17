/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs321.other;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

/**
 * The Checker class will implement a checker with high-lighter 
 * component to check the correctness of selected assignment. 
 * This class will also display error lines to user through GUI 
 * that the user can go back to fix errors.
 * 
 * @author Group1
 * @version 04/18/16
 */

public class Checker{
    /**
     * Declared field variables that represent
     * assignment, error index of this assignment
     * in the form of Assignment and arrayLists.
    */
    Assignment checker;
    ArrayList <Integer> errorIndex;
    
    /**
    * Creates an checker that contains Assignment object and ArrayList 
    * @param assignmentOne
    */
    public Checker(Assignment assignmentOne)
    {
         checker = new Assignment(assignmentOne.getInstruction(), assignmentOne.getMasterCode());
         checker.setUserEnteredCode(assignmentOne.getUserEnteredCode());
         errorIndex = new ArrayList();
    }

    /**
     * Returns number of error lines.
     * @return errorIndex.size of type integer
    */
    public int getErrors(){
        return errorIndex.size();
    }
    
     /**
     * Returns accuracy of user's performance of current assignment 
     * corrected lines out of total lines
     * @return accuracy
    */
    public double getAccuracy(){
        double accuracy = (checker.getUserEnteredCode().size()-errorIndex.size())
                /checker.getUserEnteredCode().size();
        return accuracy;
    }
    
     /**
     * Compare userEnteredCode with masterCode line by line.
     * Store index of incorrect userEnteredCode line to the errorIndex ArrayList
    */
    public void checkline()
    {
      for(int i=0; i< (checker.getUserEnteredCode().size()); i++)
      {
          String user = checker.getUserEnteredCode().get( i ).trim();
          String master = checker.getMasterCode().get( i ).trim();
          if (! user.equals(master))
                  errorIndex.add(i); //add wrong line to the array
      }
    }

    /**
     * Highligter highlights error line that present in userEnteredCode
     * @throws BadLocationException
     */
    public void highlighter() throws BadLocationException
   {
       try{
       JTextArea textArea = new JTextArea(600, 30);//where the Highlight area size
       int size = errorIndex.size();
            for(int i=0; i < size; i++)// loop of the number of bad lines
              {    
                    textArea.setText(checker.getUserEnteredCode().get(errorIndex.get(i))); // set bad text line
                    Highlighter highlighter = textArea.getHighlighter(); // set highlighter
                    HighlightPainter painter = 
                    new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
                    int p1 = checker.getUserEnteredCode().get(errorIndex.get(i)).length();//length of the bad line
                    highlighter.addHighlight(0, p1, painter ); //highlight from index 0 to length? or length -1;
              }
       }
       
       catch (BadLocationException e){
           System.err.println("Unable to highlight");
       }
   }
}
         