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

public class AddNewGoal extends AppCompatDialogFragment {
    private EditText assignmentTitle;
    private EditText assignmentDesc;
    private EditText assignmentDueDate;
    private AddNewGoalListener listener;

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
                        String title = assignmentTitle.getText().toString();
                        String desc = assignmentDesc.getText().toString();
                        String dueDate = assignmentDueDate.getText().toString();
                        listener.applyText(title, desc, dueDate);
                    }
                });
        assignmentTitle = view.findViewById(R.id.goalTitle);
        assignmentDesc = view.findViewById(R.id.goalDescription);
        assignmentDueDate = view.findViewById(R.id.dueDate);
        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        /*try {
            listener = (AddNewGoalListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "must implement AddNewGoalListener");
        }*/
    }

    public interface AddNewGoalListener
    {
        //void applyText(String title, String desc, String dueDate);
    }

}
