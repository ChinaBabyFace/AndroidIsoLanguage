package com.shark.language;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private LanguageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.language_list);
        adapter = new LanguageAdapter(this, getLanguageList());
        listView.setAdapter(adapter);
    }

    public List<String> getLanguageList() {
        List<String> list = new ArrayList<>();
        for (Locale local : Locale.getAvailableLocales()) {
//            String item = local.getISO3Country() + "-" + local.getISO3Language();
            String item = "国家:"+local.getDisplayCountry()
                    + "\n语言:" + local.getDisplayLanguage()+"\n代码:"+local.getCountry();

            list.add(item);
        }
        return list;
    }
}
