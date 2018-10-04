package com.example.admin.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ListView listview;
String []arr={"click1","click2","click3","click4","click5"};
ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=(ListView)findViewById(R.id.list);
        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            if(i==0)
            {
                Intent in=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(in);
            }
                if(i==1)
                {
                    Toast.makeText(MainActivity.this,"click2",Toast.LENGTH_SHORT).show();
                }
                if(i==2)
                {
                    Toast.makeText(MainActivity.this,"click3",Toast.LENGTH_SHORT).show();
                }
                if(i==3)
                {
                    Toast.makeText(MainActivity.this,"click4",Toast.LENGTH_SHORT).show();

                }
                if(i==4)
                {
                    Toast.makeText(MainActivity.this,"click5",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
