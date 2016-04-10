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
 * @author jdbrown2005
 */
public class Checker {
    private String line;
    private float accuracy;
    private int errors;
    
    public int getErrors(){
        return errors;
    }
    
    public float getAccuracy(){
        return accuracy;
    }
    
    //add index of wrong line to ArrayList
    public void checkline(Assignment a)
    {
      ArrayList errorIndex = new ArrayList();
      ArrayList user = a.getUserEnteredCode();
      ArrayList master = a.getMasterCode();
      int check=0;
      
      for(int i=0; i<user.size(); i++)
      {
          if(user.get(i) != null)
          {
              if(user.get( i ) != master.get( check ))
              {
                  errorIndex.add(i); //add wrong line to the array
              }
              check++;
          }
      }
       errors = errorIndex.size();
    }

   
    
}
            
