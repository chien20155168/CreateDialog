package com.nvchung.excercutedialog;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;

public class MFragmentDialog extends DialogFragment implements View.OnClickListener {
    //TODO b3
    interface NotificeDialog{
        void onLogin();
    }
    private NotificeDialog notificeDialog;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            notificeDialog = (NotificeDialog) context;
        } catch (ClassCastException e) {
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       //TODO b1
        //setup View
        View v = inflater.inflate(R.layout.mdialog, container, false);
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        }
        //TODO b2
        //setup View listener
        
        v.findViewById(R.id.login).setOnClickListener(this);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onClick(View v) {
        notificeDialog.onLogin();

    }


}
