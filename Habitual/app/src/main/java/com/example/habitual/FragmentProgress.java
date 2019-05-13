package com.example.habitual;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentProgress extends Fragment {
    View view;
    public FragmentProgress() { }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.progress_fragment, container, false);
        Button button = view.findViewById(R.id.addReminderButton);
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
        AddNewReminder addNewReminder = new AddNewReminder();
        addNewReminder.show(getFragmentManager(), "Add New Reminder");
    }
}
