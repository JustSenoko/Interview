package com.blueroofstudio.interview.lesson4.task1;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.blueroofstudio.interview.R;

public class CycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle);
        showMessage("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showMessage("onStart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        showMessage("onRestoreInstanceState()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showMessage("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showMessage("onPause()");
    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
        showMessage("onSaveInstanceState()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showMessage("onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showMessage("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showMessage("onDestroy()");
    }

    private void showMessage(String message) {
        Toast.makeText(this, "Activity " + message, Toast.LENGTH_SHORT).show();
    }
}
