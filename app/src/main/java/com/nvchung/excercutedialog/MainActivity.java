package com.nvchung.excercutedialog;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//TODO b4
public class MainActivity extends AppCompatActivity implements mFragmentDialog.NotificeDialog {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //>> create a dialog
        // = FramentDialog
        //= >>b1 class
        //b2 xml
        // goi
        // tao interface



    }

    public void showDialogFragment() {
        mFragmentDialog dialog = new mFragmentDialog();
        FragmentManager fragmentManager = getSupportFragmentManager();
        dialog.show(fragmentManager, "Dialog1");
    }

    public void ShowDialog(View view) {
        showDialogFragment();

    }

    @Override
    public void onLogin() {
        Toast.makeText(this, "Login from Maint Dilog", Toast.LENGTH_SHORT).show();
    }
}
