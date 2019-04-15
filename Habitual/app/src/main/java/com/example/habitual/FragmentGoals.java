package com.example.habitual;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class FragmentGoals extends Fragment implements AddNewGoal.AddNewGoalListener {
    View view;
    ImageButton button;
    ArrayList<Assignment> assignments = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    public FragmentGoals() { }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.goals_fragment, container, false);
        button = view.findViewById(R.id.addGoalButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this.getContext());
        adapter = new AssignmentAdapter(assignments);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        assignments.add(new Assignment(R.drawable.ic_computer, "Course", "Title", "Due Date"));
        return view;
    }

    public void openDialog()
    {
        AddNewGoal addNewGoal = new AddNewGoal();
        addNewGoal.show(getFragmentManager(), "Add New Assignment");
    }

    @Override
    public void applyText(String title, String desc, String dueDate) {
    }
}
