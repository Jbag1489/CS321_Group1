package cs321.other;
import java.io.*;
import java.util.ArrayList;
/**
 * The Assignment class will implement the assignment template parser.
 * Assignment template parser will read selected assignment .txt file into 
 * two String ArrayList Instruction and masterCode in order to create Assignment
 * object.
 * 
 * @author Group1
 * @version 04/18/16
 */

public class AssignmentTemplateParser {
     /**
     * Declared field variables that represent String type ArrayList of Instruction
     * and master code.
     */

    private ArrayList<String> Instruction;
    private ArrayList<String> masterCode;

    /**
     * Read a file in to create an Assignment object.
     *
     * @param f File that will be parsed to create Assignment object.
     * @throws IOException
     */
    public void readFile(File f) throws IOException {
        Instruction = new ArrayList<String>();
        masterCode = new ArrayList<String>();
        
        try {

            FileInputStream read = new FileInputStream(f);
            BufferedReader reader = new BufferedReader(new InputStreamReader(read));
            String line = reader.readLine();

            if (line.equals("@Instruction@")) {
                boolean done = false;
                int i = 0;
                while (!done) {
                    line = reader.readLine();
                    if (line.equals("@InstructionEnd@")) {
                        done = true;
                    } else {
                        if (i != 0) {
                            Instruction.add("\n");
                        }
                        Instruction.add(line);
                        i++;
                    }

                }
            }

            // Grab next line to see if next section.
            while (!line.equals("@Master@")) {
                line = reader.readLine();
            }

            if (line.equals("@Master@")) {
                boolean done = false;
                int i = 0;
                while (!done) {
                    line = reader.readLine();
                    if (line.equals("@MasterEnd@")) {
                        done = true;
                    } else {
                        if (i != 0) {
                            masterCode.add("\n");
                        }
                        masterCode.add(line);
                        i++;
                    }

                }
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Unable to read from file");
        }

    }

    /**
     * Returns instructions
     * @return Instruction of type ArrayList string
     */
    public ArrayList<String> getInstruction() {
        return Instruction;
    }

    /**
     * Returns master code
     * @return masterCode of type ArrayList string
     */
    public ArrayList<String> getMasterCode() {
        return masterCode;
    }

    /**
     * Returns the assignment object with selected template
     * @return template the Assignment Object
     */
    public Assignment getAssignment() {
        Assignment template = new Assignment(this.getInstruction(), this.getMasterCode());
        return template;
    }

}
