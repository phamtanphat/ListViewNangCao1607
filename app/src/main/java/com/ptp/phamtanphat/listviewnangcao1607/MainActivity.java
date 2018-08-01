package com.ptp.phamtanphat.listviewnangcao1607;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMonan;
    ArrayList<Monan> mangmonan;
    MonanAdapter monanAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonan = findViewById(R.id.listviewMonan);
        mangmonan = new ArrayList<>();

        mangmonan.add(new Monan("Bun dau",25000,R.drawable.bundau));
        mangmonan.add(new Monan("Cari",50000,R.drawable.cari));
        mangmonan.add(new Monan("Cha gio",60000,R.drawable.chagio));
        mangmonan.add(new Monan("Com suon",30000,R.drawable.comsuon));

        monanAdapter = new MonanAdapter(MainActivity.this,android.R.layout.simple_list_item_1,mangmonan);
        lvMonan.setAdapter(monanAdapter);
    }
}
