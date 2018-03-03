package com.test.jq.inclassassignment06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    private String habitat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.habitat_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        adapter = ArrayAdapter.createFromResource(this,R.array.habitat_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(),"Habitat: "+ adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
                habitat = adapterView.getItemAtPosition(i).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void submit(View view){
        Intent myIntent = new Intent(this, DisplayActivity.class);
        String name = ((EditText) findViewById(R.id.name_edit)).getText().toString();
        int legs =Integer.parseInt(((EditText) findViewById(R.id.legs_edit)).getText().toString());
        CheckBox hasFurCheckBox = (CheckBox) findViewById(R.id.has_fur_checkbox);
        boolean hasFur = hasFurCheckBox.isChecked();
        Animal animal = new Animal(name,legs,hasFur,habitat);
        myIntent.putExtra(Keys.ANIMAL_KEY,animal);
        startActivity(myIntent);
    }
}
