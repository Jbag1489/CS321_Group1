/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs321.other;


//-------------------------
/**
 * This is a test
 * @author jdbrown2005
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
    
    public String getUserName()
    {
        return userName;
    }
    
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    public String getStudentName()
    {
        return studentName;
    }
    
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public int getAssignmentCounter()
    {
        return assignmentCounter;
    }
    
    public void setAssignmentCounter(int assignmentCounter)
    {
        this.assignmentCounter = assignmentCounter;
    }
    
    public boolean getAdministratorStatus()
    {
        return adminstratorStatus;
    }
    
    public void setAdministratorStatus(boolean administratorStatus)
    {
        this.adminstratorStatus = administratorStatus;
    }
    
    public UserSettings getSettings()
    {
        return settings;
    }
    
    public void setSettings(UserSettings settings)
    {
        this.settings = settings;
    }
}
