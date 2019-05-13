package com.example.habitual;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoteTest {
    Note testNote = new Note(0, "Computer Science", "CS 449", "5/12/19");
    int imageResource = testNote.getImageResource();
    String course = testNote.getCourse();
    String title = testNote.getTitle();
    String dueDate = testNote.getDueDate();

    @Test
    public void assertImageResource() {
        assertEquals(imageResource, 0);
    }

    @Test
    public void assertCourse() {
        assertEquals(course, "Computer Science");
    }

    @Test
    public void assertTitle(){
        assertEquals(title, "CS 449");
    }

    @Test
    public void assertDueDate(){
        assertEquals(dueDate, "5/12/19");
    }
}