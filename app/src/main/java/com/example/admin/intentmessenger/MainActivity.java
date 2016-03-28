package com.example.admin.intentmessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view)
    {
        Intent intent = new Intent(this, Main2Activity.class);
        EditText messageView = (EditText) findViewById(R.id.message);
        String value = messageView.getText().toString();
        intent.putExtra("message", value);
        startActivity(intent);


    }
}
