package com.example.arraylistviewandadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edt;
    ListView lw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button00);
        edt = findViewById(R.id.edittext00);
        lw = findViewById(R.id.listview00);

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hassan");
        ArrayAdapter<String> adp = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        lw.setAdapter(adp);



    }
}