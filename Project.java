import java.util.Vector;
/**
 * Write a description of class Project here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Project
{
    private String name = "";
    private Vector <Task> tasks;
    
    public Project()
    {
        tasks = new Vector();
    }
    
    public Project(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void addTask(Task task)
    {
        tasks.add(task);
    }
    public int calculateTimeToDelivery()
    {
        int maxTimeToComplete = 0;
        for(Task task: tasks){
            //Task task = (Task) element;
            int time = task.calculateTimeToComplete();
            
            if(time > maxTimeToComplete)
            {
                maxTimeToComplete = time;
            }
        }
        return maxTimeToComplete;
    }
    
    public Vector <Task> getTasks()
    {
        return tasks;
    }

}
