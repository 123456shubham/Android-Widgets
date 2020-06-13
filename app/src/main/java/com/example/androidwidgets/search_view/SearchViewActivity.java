package com.example.androidwidgets.search_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.androidwidgets.R;

import java.util.ArrayList;

public class SearchViewActivity extends AppCompatActivity {

    ListView listViewSearchView;
    SearchView searchView1;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);
        listViewSearchView=findViewById(R.id.list_View_searchView);
        searchView1=findViewById(R.id.searchView);
        final ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Ball");
        arrayList.add("Cat");
        arrayList.add("Dog");
        arrayList.add("App");
        arrayList.add("Base");
        arrayList.add("Cot");
        arrayList.add("Dinner");
        arrayList.add("Aunt");
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listViewSearchView.setAdapter(arrayAdapter);
        searchView1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                if(arrayList.contains(s)){
                    arrayAdapter.getFilter().filter(s);

                }else{
                    Toast.makeText(SearchViewActivity.this, "No Match found", Toast.LENGTH_LONG).show();

                }

                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });


    }
}
