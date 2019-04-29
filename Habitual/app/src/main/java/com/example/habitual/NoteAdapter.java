package com.example.habitual;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {
    private ArrayList<Note> noteList;
    public static class NoteViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public EditText mCourse;
        public EditText mTitle;
        public EditText mDueDate;
        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mCourse = itemView.findViewById(R.id.courseName);
            mTitle = itemView.findViewById(R.id.title);
            mDueDate = itemView.findViewById(R.id.date);
        }
    }

    public NoteAdapter(ArrayList<Note> list){
        noteList = list;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.note_recycler_view_item, viewGroup, false);
        NoteViewHolder nvh = new NoteViewHolder(v);
        return nvh;
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder noteViewHolder, int i) {
        Note currentItem = noteList.get(i);
        noteViewHolder.mImageView.setImageResource(currentItem.getImageResource());
        noteViewHolder.mCourse.setText(currentItem.getCourse());
        noteViewHolder.mTitle.setText(currentItem.getTitle());
        noteViewHolder.mDueDate.setText(currentItem.getDueDate());
    }

    @Override
    public int getItemCount() {
        return noteList.size();
    }
}
