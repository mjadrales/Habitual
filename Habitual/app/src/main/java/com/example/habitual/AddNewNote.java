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

public class AddNewNote extends AppCompatDialogFragment {
    private EditText noteTitle;
    private EditText noteMessage;
    private AddNewNoteListener listener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.add_new_log_dialog, null);
        builder.setView(view)
                .setTitle("Add New Note")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String title = noteTitle.getText().toString();
                        String desc = noteMessage.getText().toString();
                    }
                });
        noteTitle = view.findViewById(R.id.noteTitle);
        noteMessage = view.findViewById(R.id.noteMessage);
        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (AddNewNoteListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "must implement AddNewNoteListener");
        }
    }

    public interface AddNewNoteListener
    {

    }

}
