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
 *
 * @author Group1
 */
public class Checker{
    Assignment checker;
    ArrayList <Integer> errorIndex;
    
    public Checker(Assignment assignmentOne)
    {
         checker = new Assignment(assignmentOne.getInstruction(), assignmentOne.getMasterCode());
         checker.setUserEnteredCode(assignmentOne.getUserEnteredCode());
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
      int check=0;
      for(int i=0; i<checker.getUserEnteredCode().size(); i++)
      {
          String user = checker.getUserEnteredCode().get( i ).trim();
          String master = checker.getMasterCode().get( check ).trim();
          if (! user.equals(master))
                  errorIndex.add(i); //add wrong line to the array
          check++;
      }
    }

   public void highlighter() throws BadLocationException
   {
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
    
}
         