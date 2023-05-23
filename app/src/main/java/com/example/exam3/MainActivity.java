package com.example.exam3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(Intent.ACTION_SEND);
        Button btn1 = findViewById(R.id.btn1);
        final Intent intent2;
        intent.setData(Uri.parse("mailto"));
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"someone@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT,"This is out text subject");
        intent.putExtra(Intent.EXTRA_TEXT,"This is out test email body");
        intent.setType("message/rfc822");
        intent2 = Intent.createChooser(intent,"send emaill test app");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
    }
}