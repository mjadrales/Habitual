package com.example.habitual;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class AssignmentAdapter extends RecyclerView.Adapter<AssignmentAdapter.AssignmentViewHolder> {
    private ArrayList<Assignment> assignmentList;
    public static class AssignmentViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public EditText mCourse;
        public EditText mTitle;
        public EditText mDueDate;
        public AssignmentViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mCourse = itemView.findViewById(R.id.courseName);
            mTitle = itemView.findViewById(R.id.title);
            mDueDate = itemView.findViewById(R.id.date);
        }
    }

    public AssignmentAdapter(ArrayList<Assignment> list){
        assignmentList = list;
    }

    @NonNull
    @Override
    public AssignmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item, viewGroup, false);
        AssignmentViewHolder avh = new AssignmentViewHolder(v);
        return avh;
    }

    @Override
    public void onBindViewHolder(@NonNull AssignmentViewHolder assignmentViewHolder, int i) {
        Assignment currentItem = assignmentList.get(i);
        assignmentViewHolder.mImageView.setImageResource(currentItem.getImageResource());
        assignmentViewHolder.mCourse.setText(currentItem.getCourse());
        assignmentViewHolder.mTitle.setText(currentItem.getTitle());
        assignmentViewHolder.mDueDate.setText(currentItem.getDueDate());
    }

    @Override
    public int getItemCount() {
        return assignmentList.size();
    }
}
