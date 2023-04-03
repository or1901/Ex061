package com.example.ex061;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggle;
    Switch switch1;
    View mainView;

    boolean toggleChecked;
    boolean switchChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggle = findViewById(R.id.toggle);
        switch1 = findViewById(R.id.switch1);
        mainView = findViewById(R.id.view);
    }

    public void changeBackground(View view) {
        toggleChecked = toggle.isChecked();
        switchChecked = switch1.isChecked();

        if(toggleChecked && switchChecked) {
            mainView.setBackgroundColor(Color.RED);
        }
        else if(toggleChecked && !switchChecked) {
            mainView.setBackgroundColor(Color.CYAN);
        }
        else if(!toggleChecked && switchChecked) {
            mainView.setBackgroundColor(Color.GREEN);
        }
        else{
            mainView.setBackgroundColor(Color.YELLOW);
        }
    }
}