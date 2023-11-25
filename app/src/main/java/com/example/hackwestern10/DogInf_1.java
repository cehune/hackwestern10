package com.example.hackwestern10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import java.util.ArrayList;
import java.util.List;


public class DogInf_1 extends AppCompatActivity {
    private Button button1;
    private SearchView search_dog;


    private String Doglist[]
            = { "golden r", "hairy",
            "Languages", "Interview Corner",
            "GATE", "ISRO CS",
            "UGC NET CS", "CS Subjects",
            "Web Technologies" };


    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doginf_1);

        button1 = (Button) findViewById(R.id.button);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_MainActivity2("golden_retriever");
            }

        });

        /*
        search_dog = findViewById(R.id.search_dog);

        search_dog.clearFocus();

        search_dog.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }
        });

    }

    private void filterList(String text) {
        List<String> filteredList = new ArrayList<>();
        for(String item : Doglist){
            if(item.contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }

        if(filteredList.isEmpty() ){
            Toast.makeText(this, "No Such Dog Brand Found", Toast.LENGTH_SHORT).show();
        }else{
            // to do, need item adaptor.
        }
*/

    }

    public void open_MainActivity2(String key) {
            Intent intent1 = new Intent(this, DogInf_2.class);
            intent1.putExtra("breed", key);
            startActivity(intent1);


        }

}