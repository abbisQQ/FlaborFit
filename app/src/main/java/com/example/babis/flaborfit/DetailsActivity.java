package com.example.babis.flaborfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView exerciseTitle;
    ImageView exerciseImage;
    String title;
    LinearLayout mainBg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        exerciseTitle = (TextView)findViewById(R.id.exercise_title);
        exerciseImage = (ImageView)findViewById(R.id.exercise_image);

        mainBg = (LinearLayout)findViewById(R.id.mainBg);

        title = getIntent().getStringExtra(MainActivity.EXTRA_TITLE);

        exerciseTitle.setText(title);



        if(title.equalsIgnoreCase(MainActivity.WEIGHT)){

            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight,getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(getColor(R.color.MY_BLUE));

        }else if(title.equalsIgnoreCase(MainActivity.YOGA)){

            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus,getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(getColor(R.color.MY_PINK));

        }else if(title.equalsIgnoreCase(MainActivity.CARDIO)){

            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart,getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(getColor(R.color.MY_GREEN));

        }

    }
}
