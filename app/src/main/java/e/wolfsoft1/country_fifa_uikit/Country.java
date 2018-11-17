package e.wolfsoft1.country_fifa_uikit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.Country_Adapter;
import model.Country_Model;

public class Country extends AppCompatActivity {

    Integer[] image = {R.drawable.ic_argentina, R.drawable.ic_argentina, R.drawable.ic_argentina, R.drawable.ic_argentina, R.drawable.ic_argentina, R.drawable.ic_argentina, R.drawable.ic_argentina, R.drawable.ic_argentina, R.drawable.ic_argentina, R.drawable.ic_argentina, R.drawable.ic_argentina};
    Integer[] image1 = {R.drawable.path_37, R.drawable.path_37, R.drawable.path_37, R.drawable.path_37, R.drawable.path_37, R.drawable.path_37, R.drawable.path_37, R.drawable.path_37, R.drawable.path_37, R.drawable.path_37, R.drawable.path_37};

    String[] text = {"Argentina", "Argentina", "Argentina", "Argentina", "Argentina", "Argentina", "Argentina", "Argentina", "Argentina", "Argentina", "Argentina"};


    private ArrayList<Country_Model> countryModelArrayList;
    private RecyclerView recyclerView;
    private Country_Adapter bAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);


        //recyclerview code
        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Country.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        countryModelArrayList = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            Country_Model beanClassForRecyclerView_contacts = new Country_Model(image[i], image1[i], text[i]);
            countryModelArrayList.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new Country_Adapter(Country.this, countryModelArrayList);
        recyclerView.setAdapter(bAdapter);
    }
}
