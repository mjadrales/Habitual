package com.example.habitual;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssignmentTest {
    Assignment assignment = new Assignment(0, "Computer Science", "CS 449", "05/19/19");
    int imageResource = assignment.getImageResource();
    String course = assignment.getCourse();
    String title = assignment.getTitle();
    String dueDate = assignment.getDueDate();

    @Test
    public void getImageResource() {
        assertEquals(imageResource, 0);
    }

    @Test
    public void getCourse() {
        assertEquals(course, "Computer Science");
    }

    @Test
    public void getTitle() {
        assertEquals(title, "CS 449");
    }

    @Test
    public void getDueDate() {
        assertEquals(dueDate, "5/19/19");
    }
}