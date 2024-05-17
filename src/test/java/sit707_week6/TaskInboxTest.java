package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

import sit707_week10.TaskInbox;

import java.util.List;
import java.util.Map;

public class TaskInboxTest {

    // Test to verify getting tasks for a student with tasks
    @Test
    public void testGetStudentsTasks() {
        // Get tasks for student with ID 221270936
        List<Map<String, String>> tasks = TaskInbox.getTasks(221270936);
        // Verify that there are 2 tasks
        Assert.assertEquals(2, tasks.size());

        // Verify details of the first task
        Map<String, String> task1 = tasks.get(0);
        Assert.assertEquals("10.1P", task1.get("taskId"));
        Assert.assertEquals("TDD & CI", task1.get("title"));
        Assert.assertEquals("23-5-2024", task1.get("submissionDate"));
        Assert.assertEquals("Working On It", task1.get("status"));

        // Verify details of the second task
        Map<String, String> task2 = tasks.get(1);
        Assert.assertEquals("9.1P", task2.get("taskId"));
        Assert.assertEquals("STEM math game", task2.get("title"));
        Assert.assertEquals("23-5-2024", task2.get("submissionDate"));
        Assert.assertEquals("Ready For Feedback", task2.get("status"));
    }

    // Test to verify getting tasks for a student with no tasks
    @Test
    public void testGetTasksForStudentWithNoTasks() {
        // Get tasks for a student with no tasks (using an arbitrary student ID)
        List<Map<String, String>> tasks = TaskInbox.getTasks(999999999);
        // Verify that the task list is empty
        Assert.assertTrue(tasks.isEmpty());
    }
}
