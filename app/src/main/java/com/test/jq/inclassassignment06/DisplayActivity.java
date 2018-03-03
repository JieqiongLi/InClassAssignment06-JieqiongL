package com.test.jq.inclassassignment06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView textView = findViewById(R.id.display_text);
        Intent intent = getIntent();
        Animal animal = (Animal) intent.getSerializableExtra(Keys.ANIMAL_KEY);
        textView.setText(animal.toString());

    }
}
