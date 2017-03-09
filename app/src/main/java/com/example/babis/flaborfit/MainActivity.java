package com.example.babis.flaborfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public  static  final  String EXTRA_TITLE = "extra key string";
    public static final String YOGA = "Yoga";
    public static final String WEIGHT = "Weight Lifting";
    public static final String CARDIO = "Cardio";




    RelativeLayout weightBtn,yogaBtn,cardioBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightBtn = (RelativeLayout)findViewById(R.id.weightBtn);
        yogaBtn = (RelativeLayout)findViewById(R.id.yogaBtn);
        cardioBtn = (RelativeLayout)findViewById(R.id.cardioBtn);


        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailsActivity(MainActivity.WEIGHT);
            }
        });


        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailsActivity(MainActivity.YOGA);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailsActivity(MainActivity.CARDIO);
            }
        });


    }


    private void loadDetailsActivity(String title){
        Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
        intent.putExtra(MainActivity.EXTRA_TITLE,title);
        startActivity(intent);
    }



}
