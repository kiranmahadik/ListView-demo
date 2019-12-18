package in.kiran.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView mTextViewOne;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextViewOne = findViewById(R.id.textViewOne);

        Intent intent = getIntent();
        String string = intent.getStringExtra("Data");
        mTextViewOne.setText(string + " is selected");
    }
}

