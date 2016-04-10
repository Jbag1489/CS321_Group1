/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs321.other;
import java.util.Timer;
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
    
    public void setLine(String line)
    {
        this.line=line;
    }
    
    public boolean checkline()
    {
        
        return true;
    }
            
   
    
}
