package com.example.habitual;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class AddNewReminder extends AppCompatDialogFragment {
    private EditText reminderTitle;
    private EditText reminderMessage;
    private EditText reminderTime;
    private AddNewReminderListener listener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.add_new_goal_dialog, null);
        builder.setView(view)
                .setTitle("Add New Assignment")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String title = reminderTitle.getText().toString();
                        String desc = reminderMessage.getText().toString();
                        String dueDate = reminderTime.getText().toString();
                    }
                });
        reminderTitle = view.findViewById(R.id.reminderTitle);
        reminderMessage = view.findViewById(R.id.reminderMessage);
        reminderTime = view.findViewById(R.id.reminderTime);
        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (AddNewReminderListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "must implement AddNewReminderListener");
        }
    }

    public interface AddNewReminderListener
    {
    }

}
