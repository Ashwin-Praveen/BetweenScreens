package com.example.ashwinpraveen1.betweenscreens;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class second_screen extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        Intent activityThatCalled = new Intent();
        activityThatCalled = getIntent();

        String previousActivity = activityThatCalled.getExtras().getString("callingActivity");

        TextView callingActivityMessage = (TextView) findViewById(R.id.string_to_let_us_know);

        callingActivityMessage.append(" "+previousActivity);

    }

    public void onSendUsersName(View view) {
        EditText userEditText = (EditText) findViewById(R.id.userEditText);
        String user = userEditText.getText().toString();

        Intent goBack = new Intent();
        goBack.putExtra("UserName",user);
        setResult(RESULT_OK,goBack);
        finish();
    }
}
