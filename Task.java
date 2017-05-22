
/**
 * Write a description of class Task here.
 *
 * @author Richard Alcala Cuba
 * @version 0.1
 */
public class Task
{
    //1 atributes
    private String name;
    private String description;
    private String owner;
    private int timeToComplete;
    
    
    //2 Constructor
    public Task()
    {
        description = "";
        name = "";
        owner = "";
        timeToComplete = 0;
    }
    
    public Task(String name, int time)
    {
        this.name = name;
        this.timeToComplete = time;
    }
    
    //3 Getteers and Setters
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getOwner()
    {
        return owner;
    }
    
    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    
    public int getTimeToComplete()
    {
        return timeToComplete;
    }
    
    public void setTimeToComplete(int timeToComplete)
    {
        this.timeToComplete = timeToComplete;
    }
}
