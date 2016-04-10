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
    
    /**
     * JavaDoc comment
     * @return 
    */
    public String getUserName()
    {
        return userName;
    }
    
    /**
     * JavaDoc comment
    */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    /**
     * JavaDoc comment
    */
    public String getStudentName()
    {
        return studentName;
    }
    
    /**
     * JavaDoc comment
    */
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    
    /**
     * JavaDoc comment
    */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * JavaDoc comment
    */
    public int getAssignmentCounter()
    {
        return assignmentCounter;
    }
    
    /**
     * JavaDoc comment
    */
    public void setAssignmentCounter(int assignmentCounter)
    {
        this.assignmentCounter = assignmentCounter;
    }
    
    /**
     * JavaDoc comment
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
    */
    public UserSettings getSettings()
    {
        return settings;
    }
    
    /**
     * JavaDoc comment
    */
    public void setSettings(UserSettings settings)
    {
        this.settings = settings;
    }
}
