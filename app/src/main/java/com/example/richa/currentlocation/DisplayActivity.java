package com.example.richa.currentlocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class DisplayActivity extends AppCompatActivity {
    EditText diaplayed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        diaplayed=findViewById(R.id.displayed);
        Intent intent=this.getIntent();
        String locationdetail=intent.getExtras().getString("Location");
        diaplayed.setText(locationdetail);
    }
}
