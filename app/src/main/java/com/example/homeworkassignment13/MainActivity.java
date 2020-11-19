package com.example.homeworkassignment13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView FirstNameTextView = this.findViewById(R.id.FirstNameTextView);
        FirstNameTextView.setText("First Name");

    }

    public void onButtonClicked1(View v)
    {
        TextView FirstNameTextView = this.findViewById(R.id.FirstNameTextView);
        FirstNameTextView.setText("James");

    }
    public void onButtonClicked2(View v)
    {
        TextView LastNameTextView = this.findViewById(R.id.LastNameTextView);
        LastNameTextView.setText("Schwantes");
    }

}