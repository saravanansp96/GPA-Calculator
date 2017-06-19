package com.example.saravanan.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{"","semester 1", "semester 2", "semester 3","semester 4","semester 5","semester 6","semester 7","semester 8"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        Button submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String s1;
                Intent intent;
                s1 = dropdown.getSelectedItem().toString();
                if(s1.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "select the semester!", Toast.LENGTH_LONG).show();

                }
                if(s1.equals("semester 1")) {
                    intent = new Intent(v.getContext(), Main2Activity.class);
                    startActivityForResult(intent, 0);
                }
                if(s1.equals("semester 2"))
                {
                        intent = new Intent(v.getContext(), Main3Activity.class);
                        startActivityForResult(intent, 0);
                }
                if(s1.equals("semester 3")) {
                    intent = new Intent(v.getContext(), Main4Activity.class);
                    startActivityForResult(intent, 0);
                }
                    if(s1.equals("semester 4"))
                    intent = new Intent(v.getContext(), Main5Activity.class);
                if(s1.equals("semester 5"))
                    intent = new Intent(v.getContext(), Main6Activity.class);
                if(s1.equals("semester 6"))
                    intent = new Intent(v.getContext(), Main7Activity.class);
                if(s1.equals("semester 7"))
                    intent = new Intent(v.getContext(), Main8Activity.class);
                if(s1.equals("semester 8"))
                    intent = new Intent(v.getContext(), Main9Activity.class);
                //startActivityForResult(intent, 0);

            }
        });
    }
}
