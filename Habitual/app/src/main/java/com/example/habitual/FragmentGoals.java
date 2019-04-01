package com.example.habitual;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentGoals extends Fragment {
    View view;
    private Button button;
    public FragmentGoals() { }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.goals_fragment, container, false);
        button = (Button) getView().findViewById(R.id.addGoalButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
        return view;
    }

    public void openDialog()
    {
        AddNewGoal addNewGoal = new AddNewGoal();
        addNewGoal.show(getFragmentManager(), "Add New Goal Dialog");
    }

}
