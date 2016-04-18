package cs321.other;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/**
 * The UserProfile will create a user profile to identify 
 * the status and progress of the user.
 * 
 * @author Group1
 * 04/18/16
 */
public class UserProfile {
 /**
  * Declared field variables that represent username, student name, password,
  * the assignment counter, the administrator status, and settings.
 */
private String userName;
private String studentName;
private String password;
private int assignmentCounter;
private boolean adminstratorStatus;
private UserSettings settings;
 /**
  * Creates a user profile with general attributes 
  * to identify a student or an administrator.
  * @param userName
  * @param studentName
  * @param password
  * @param adminstratorStatus 
  */   
public UserProfile(String userName, String studentName, 
                   String password, boolean adminstratorStatus)
    {
        this.userName = userName;
        this.studentName = studentName;
        this.password = password;
        this.adminstratorStatus = adminstratorStatus;
    }
    
    /**
     * Returns a username
     * @return the user name
    */
    public String getUserName()
    {
        return userName;
    }
    
    /**
     * Sets or changes the username in userProfile.
     * @param userName The username that will be set to this userProfile
    */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    /**
     * Returns the name of the student
     * @return studentName - the student's name
    */
    public String getStudentName()
    {
        return studentName;
    }
    
    /**
     * Sets or updates the name of the student
     * @param studentName The student's name to be set.
    */
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    
    /**
     * Returns password.
     * @return password - the userProfile's password.
    */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * Returns the number of assignments done.
     * @return assignmentCounter - the number of assignments completed.
    */
    public int getAssignmentCounter()
    {
        return assignmentCounter;
    }
    
    /**
     * Sets and updates how many assignments have been completed by the user.
     * @param assignmentCounter The number of assignments the user has completed.
    */
    public void setAssignmentCounter(int assignmentCounter)
    {
        this.assignmentCounter = assignmentCounter;
    }
    
    /**
     * Returns the administrator status.
     * @return administratorStatus, true if it's an administrator.
    */
    public boolean getAdministratorStatus()
    {
        return adminstratorStatus;
    }
    
    /**
     * Sets the status to an administrator setting, if it's an administrator.
     * @param administratorStatus, true if it's an administrator.
     */
    public void setAdministratorStatus(boolean administratorStatus)
    {
        this.adminstratorStatus = administratorStatus;
    }
    
    /**
     * Returns the settings of the userProfile.
     * @return The userProfile's settings.
    */
    public UserSettings getSettings()
    {
        return settings;
    }
    
    /**
     * Sets or updates the userProfile's settings.
     * @param settings The userProfile's settings.
    */
    public void setSettings(UserSettings settings)
    {
        this.settings = settings;
    }
    
    public void outputUser(String name, String user, String pw, boolean isTeacher)
     {
         File fout = new File("user.txt");
         if(fout.exists())
         {
         String output = "USER:" +user + "&&&&PASS" + pw + "&&&&NAME:" +  name + "&&&&T:" + isTeacher + "\n";
         try {
             Files.write(Paths.get("user.txt"), output.getBytes(), StandardOpenOption.APPEND);
             
         }
         catch(IOException e){
            System.out.println("File not saved!!");
            }
         }
         else {
             //File newFile = new
             
         }
         
//         try
//         {
//             if(fout.exists() == false)
//             fout.createNewFile();
//             else
//             {
//             PrintWriter out = new PrintWriter(fout);
//             out.append("USER:" +user + "&&&&PASS" + pw + "&&&&NAME:" +  name + "&&&&T:" + isTeacher + "\n");
//             out.close();
//             }
//         }catch(IOException e){
//        System.out.println("File not saved!!");
       // }
     }
}