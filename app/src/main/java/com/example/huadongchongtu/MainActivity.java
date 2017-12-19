package com.example.huadongchongtu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initDate();
        initAdapter();
    }

    private void initAdapter() {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(arrayAdapter);
    }

    private void initDate() {
        list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("联系git");
        }

    }

    private void initView() {
        lv = (ListView) findViewById(R.id.lv);
    }
}
