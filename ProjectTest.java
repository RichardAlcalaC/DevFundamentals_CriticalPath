

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProjectTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProjectTest
{
    //US0
    @Test
    public void createEmptyProject()
    {
        Project project = new Project();
        assertTrue(project instanceof Project);
    }
    
    @Test
    public void createProjectWithName()
    {
        Project project = new Project("My First Project");
        assertTrue(project instanceof Project);
        assertEquals("My First Project", project.getName());
    }
    
    @Test
    public void calculateTimeToDeliverASingleTask()
    {
        Project project = new Project("My First Project");
        //task1
        Task singleTask = new Task();
        singleTask.setTimeToComplete(5);
        
        project.addTask(singleTask);
        
        assertEquals(5, project.calculateTimeToDelivery());
    }
    @Test
    public void calculateTimeToDeliverOf2NonDependentTasks()
    {
        Project project = new Project("sample");
        //task1
        Task task1 = new Task("t1", 6);
        Task task2 = new Task("t1", 9);
        
        project.addTask(task1);
        project.addTask(task2);
        
       assertEquals(6, project.calculateTimeToDelivery());
    }

}
