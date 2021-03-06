package com.example.habitual;

public class Assignment {
    private int mImageResource;
    private String mCourse;
    private String mTitle;
    private String mDueDate;

    public Assignment(int imageResource, String course, String title, String dueDate)
    {
        mImageResource = imageResource;
        mCourse = course;
        mTitle = title;
        mDueDate = dueDate;
    }

    public int getImageResource(){return mImageResource;}
    public String getCourse(){return mCourse;}
    public String getTitle(){return mTitle;}
    public String getDueDate(){return mDueDate;}
}
