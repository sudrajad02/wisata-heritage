package com.android.kelompok.heritageyogya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class listview_main extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Title 1", "Title 2",
            "Title 3", "Title 4",
            "Title 5",
    };

    String[] subtitle ={
            "Sub Title 1", "Sub title 2",
            "Sub Title 3", "Sub title 4",
            "Sub Title 5",
    };

    Integer[] imgid={
            R.drawable.candijo,R.drawable.tugu,
            R.drawable.mboko,R.drawable.keraton,
            R.drawable.vandenburg,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_main);

        MyListView adapter = new MyListView(this, maintitle, subtitle, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO Auto-generated method stub
                if (position==0){
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code", Toast.LENGTH_SHORT).show();
                }

                else if (position==1){
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code", Toast.LENGTH_SHORT).show();
                }

                else if (position==2){
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code", Toast.LENGTH_SHORT).show();
                }

                else if (position==3){
                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code", Toast.LENGTH_SHORT).show();
                }

                else if (position==4){
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}