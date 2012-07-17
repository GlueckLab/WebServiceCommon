package edu.ucdenver.bios.webservice.common.domain;

import java.io.Serializable;

public class BugReport implements  Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String bugSubject= null;
    private String bugName = null;
    private String bugDescription = null;
    private String bugPriority = "major";
    
    public void setBugSubject(String bugSubject)
    {
        this.bugSubject= bugSubject;
    }
    
    public void setBugName(String bugName)
    {
        this.bugName = bugName;
    }
    
    public void setBugDescription(String bugDescription)
    {
        this.bugDescription = bugDescription;
    }
    public void setBugPriority(String bugPriority)
    {
        this.bugPriority= bugPriority;
    }
    
    public String getBugSubject()
    {
        return bugSubject;
    }
    
    public String getBugName()
    {
        return bugName;
    }
    
    public String getBugDescription()
    {
        return bugDescription;
    }
    public String getBugPriority()
    {
        return bugPriority;
    }
    
}
