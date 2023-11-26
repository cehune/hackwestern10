package com.example.hackwestern10.information;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.widget.SearchView;

import com.example.hackwestern10.R;


public class DogInf_1 extends AppCompatActivity {
    private Button button_golden;
    private Button button_chihuahua;
    private Button button_beagle;
    private Button button_German_Shepherd;
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

        button_golden = (Button) findViewById(R.id.button_golden);
        button_golden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_MainActivity2("golden_retriever");
            }
        });



        button_chihuahua = (Button) findViewById(R.id.button_chihuahua);
        button_chihuahua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_MainActivity2("chihuahua");
            }
        });



        button_beagle = (Button) findViewById(R.id.button_beagle);
        button_beagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_MainActivity2("beagle");
            }
        });

        button_German_Shepherd = (Button) findViewById(R.id.button_German_Shepherd);
        button_German_Shepherd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_MainActivity2("germanhepherd");
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