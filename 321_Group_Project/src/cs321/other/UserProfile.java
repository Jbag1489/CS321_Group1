/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs321.other;


//-------------------------
/**
 * 
 * @author GRoup1
 */
public class UserProfile {
 //Fields:
private String userName;
private String studentName;
private String password;
private int assignmentCounter;
private boolean adminstratorStatus;
private UserSettings settings;
    
    //Methods:

public UserProfile(String userName, String studentName, 
                   String password, boolean adminstratorStatus)
    {
        this.userName = userName;
        this.studentName = studentName;
        this.password = password;
        this.adminstratorStatus = adminstratorStatus;
    }
    
    /**
     * JavaDoc comment
     * @return the user name
    */
    public String getUserName()
    {
        return userName;
    }
    
    /**
     * JavaDoc comment
     * @param userName The username that will be set to this userProfile
    */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    /**
     * JavaDoc comment
     * @return The student's name
    */
    public String getStudentName()
    {
        return studentName;
    }
    
    /**
     * JavaDoc comment
     * @param studentName The student's name to be set.
    */
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    
    /**
     * JavaDoc comment
     * @return The userProfile's password.
    */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * JavaDoc comment
     * @return The number of assignments completed.
    */
    public int getAssignmentCounter()
    {
        return assignmentCounter;
    }
    
    /**
     * JavaDoc comment
     * @param assignmentCounter The number of assignments the user has completed.
    */
    public void setAssignmentCounter(int assignmentCounter)
    {
        this.assignmentCounter = assignmentCounter;
    }
    
    /**
     * JavaDoc comment
     * @return The administrator status, true if is an administrator.
    */
    public boolean getAdministratorStatus()
    {
        return adminstratorStatus;
    }
    
    public void setAdministratorStatus(boolean administratorStatus)
    {
        this.adminstratorStatus = administratorStatus;
    }
    
    /**
     * JavaDoc comment
     * @return The userProfile's settings.
    */
    public UserSettings getSettings()
    {
        return settings;
    }
    
    /**
     * JavaDoc comment
     * @param settings The userProfile's settings.
    */
    public void setSettings(UserSettings settings)
    {
        this.settings = settings;
    }
}
