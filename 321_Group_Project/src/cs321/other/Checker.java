package cs321.other;
import java.util.ArrayList;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
/**
 * The Checker class will implement a theAssignment with high-lighter component
 * to check the correctness of selected assignment. This class will also display
 * error lines to user through GUI that the user can go back to fix errors.
 *
 * @author Group1
 * @version 04/18/16
 */

public class Checker {

    /**
     * Declared field variables that represent assignment, error index of this
     * assignment in the form of Assignment and arrayLists.
     */
    Assignment theAssignment;
    ArrayList<Integer> errorIndex;

    /**
     * Creates an theAssignment that contains Assignment object and ArrayList
     *
     * @param assignmentOne
     */
    public Checker(Assignment assignmentOne) {
        theAssignment = new Assignment(assignmentOne.getInstruction(), assignmentOne.getMasterCode());
        theAssignment.setUserEnteredCode(assignmentOne.getUserEnteredCode());
        errorIndex = new ArrayList();
    }

    /**
     * Returns number of error lines.
     *
     * @return errorIndex.size of type integer
     */
    public int getErrors() {
        return errorIndex.size();
    }

    /**
     * Returns accuracy of user's performance of current assignment corrected
     * lines out of total lines
     *
     * @return accuracy
     */
    public double getAccuracy() {
        double accuracy = (theAssignment.getUserEnteredCode().size() - errorIndex.size())
                / theAssignment.getUserEnteredCode().size();
        return accuracy;
    }

    /**
     * Compare userEnteredCode with masterCode line by line. Store index of
     * incorrect userEnteredCode line to the errorIndex ArrayList
     */
    public void checkline() {
        for (int i = 0; i < (theAssignment.getUserEnteredCode().size()); i++) {
            String user = theAssignment.getUserEnteredCode().get(i).trim();
            String master = theAssignment.getMasterCode().get(i).trim();
            if (!user.equals(master)) {
                errorIndex.add(i); //add wrong line to the array
            }
        }
    }

    /**
     * checkAndHighlight will compare the UserEnteredCode to the MasterCode of the
     *  current assignment, and highlight any incorrect lines on the MasterCode
     *  JTextArea.
     * @param masterCode The JTextArea the contains the MasterCode to be highlighted.
     */
    public void checkAndHighlight(JTextArea masterCode) {
        masterCode.setText("");
        Highlighter h = masterCode.getHighlighter();
        HighlightPainter highLightPainter = 
                new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
        h.removeAllHighlights();
        int prevLength = 0;
        for (int i = 0; i < theAssignment.getMasterCode().size(); i++) {
            if (theAssignment.getUserEnteredCode().size()-1 < i) {
                masterCode.append(theAssignment.getMasterCode().get(i));
                try {
                    h.addHighlight(prevLength, prevLength + 
                            theAssignment.getMasterCode().get(i).length() - 1, highLightPainter);
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                } 
            } else {
                if (theAssignment.getUserEnteredCode().get(i).equals(
                        theAssignment.getMasterCode().get(i))) {
                    masterCode.append(theAssignment.getMasterCode().get(i));
                } else {
                    masterCode.append(theAssignment.getMasterCode().get(i));
                    try {
                        h.addHighlight(prevLength, prevLength + 
                                theAssignment.getMasterCode().get(i).length() 
                                - 1, highLightPainter);
                    } catch (BadLocationException ex) {
                        ex.printStackTrace();
                    }
                }
                prevLength += theAssignment.getMasterCode().get(i).length();
            }

        }
    }

    /**
     * Highlighter highlights error line that present in userEnteredCode
     */
    public void highlighter() {
        JTextArea textArea = new JTextArea(600, 30);//where the Highlight area size
        try {
            int size = errorIndex.size();
            for (int i = 0; i < size; i++)// loop of the number of bad lines
            {
                textArea.setText(theAssignment.getUserEnteredCode().get(errorIndex.get(i))); // set bad text line
                Highlighter highlighter = textArea.getHighlighter(); // set highlighter
                HighlightPainter painter
                        = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
                int p1 = theAssignment.getUserEnteredCode().get(errorIndex.get(i)).length();//length of the bad line
                highlighter.addHighlight(0, p1, painter); //highlight from index 0 to length? or length -1;
            }
        } catch (BadLocationException e) {
            System.err.println("Unable to highlight");
        }
    }
}
