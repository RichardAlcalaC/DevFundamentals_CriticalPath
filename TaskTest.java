import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TaskTest.
 *
 * @author  Richard Alcala Cuba
 * @version 0.1
 */
public class TaskTest
{
    
    //US1
    @Test
    public void createInstanceOfTask()
    {
        Task emptyTask = new Task();
        assertTrue(emptyTask instanceof Task);
        assertTrue(emptyTask instanceof Object);
    }
    
    //US1
    @Test
    public void readDescriptionProperty()
    {
        Task emptyTask = new Task();
        assertEquals("", emptyTask.getDescription());
    }
    
    //US1
    @Test
    public void writeDescriptionProperty()
    {
        Task task = new Task();
        task.setDescription("This is a task");
        assertEquals("This is a task", task.getDescription());
    }
    
    //US1
    @Test
    public void readNameProperty()
    {
        Task task = new Task();
        assertEquals("", task.getName());
    }
    @Test
    public void writeNameProperty()
    {
        Task task = new Task();
        task.setName("Maria");
        assertEquals("Maria", task.getName());
        
    }
    
    //US1
    @Test
    public void readOwner()
    {
        Task task = new Task();
        assertEquals("", task.getOwner());
    }
    @Test
    public void writeOwner()
    {
        Task task = new Task();
        task.setOwner("Juana");
        assertEquals("Juana", task.getOwner());
        
    }
    
    //US1
    @Test
    public void readTime()
    {
        Task task = new Task();
        assertEquals(0, task.getTimeToComplete());
    }
    @Test
    public void writeTime()
    {
        Task task = new Task();
        task.setTimeToComplete(2);
        assertEquals(2, task.getTimeToComplete());
        
    }

}
