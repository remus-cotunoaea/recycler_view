package com.remapp.recyclerview_actionviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView txt1;
    TextView txt2;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        firstView();
        secondView();
        thirdView();
        forthView();
        fifthView();

        back = findViewById(R.id.ID_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent();
                setResult(RESULT_FIRST_USER, back);
                finish();
            }
        });
    }


    public void firstView() {
        ImageView img1 = findViewById(R.id.ID_imageView1);
        ImageView img2 = findViewById(R.id.ID_bone1_1);
        ImageView img3 = findViewById(R.id.ID_bone2_1);
        txt1 = findViewById(R.id.ID_text1_1);
        txt2 = findViewById(R.id.ID_text2_1);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int res = bundle.getInt("image_cat");
            img1.setImageResource(res);
        }

        if (bundle != null) {
            int res = bundle.getInt("image_bone1_1");
            img2.setImageResource(res);
        }

        if (bundle != null) {
            int res = bundle.getInt("image_bone2_1");
            img3.setImageResource(res);
        }

        if (txt1 != null) {
            Intent intent = getIntent();
            String mes = intent.getStringExtra("text1_1");
            txt1.setText(mes);
        }

        if (txt2 != null) {
            Intent intent = getIntent();
            String mes = intent.getStringExtra("text2_1");
            txt2.setText(mes);
        }
    }

    public void secondView() {
        ImageView img1 = findViewById(R.id.ID_imageView2);
        ImageView img2 = findViewById(R.id.ID_bone1_2);
        ImageView img3 = findViewById(R.id.ID_bone2_2);
        txt1 = findViewById(R.id.ID_text1_2);
        txt2 = findViewById(R.id.ID_text2_2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int res = bundle.getInt("image_dog");
            img1.setImageResource(res);
        }

        if (bundle != null) {
            int res = bundle.getInt("image_bone1_2");
            img2.setImageResource(res);
        }

        if (bundle != null) {
            int res = bundle.getInt("image_bone2_2");
            img3.setImageResource(res);
        }

        if (txt1 != null) {
            Intent intent = getIntent();
            String mes = intent.getStringExtra("text1_2");
            txt1.setText(mes);
        }

        if (txt2 != null) {
            Intent intent = getIntent();
            String mes = intent.getStringExtra("text2_2");
            txt2.setText(mes);
        }
    }

    public void thirdView() {
        ImageView img1 = findViewById(R.id.ID_imageView3);
        ImageView img2 = findViewById(R.id.ID_bone1_3);
        ImageView img3 = findViewById(R.id.ID_bone2_3);
        txt1 = findViewById(R.id.ID_text1_3);
        txt2 = findViewById(R.id.ID_text2_3);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int res = bundle.getInt("image_pig");
            img1.setImageResource(res);
        }

        if (bundle != null) {
            int res = bundle.getInt("image_bone1_3");
            img2.setImageResource(res);
        }

        if (bundle != null) {
            int res = bundle.getInt("image_bone2_3");
            img3.setImageResource(res);
        }

        if (txt1 != null) {
            Intent intent = getIntent();
            String mes = intent.getStringExtra("text1_3");
            txt1.setText(mes);
        }

        if (txt2 != null) {
            Intent intent = getIntent();
            String mes = intent.getStringExtra("text2_3");
            txt2.setText(mes);
        }
    }

    public void forthView() {
        ImageView img1 = findViewById(R.id.ID_imageView4);
        ImageView img2 = findViewById(R.id.ID_bone1_4);
        ImageView img3 = findViewById(R.id.ID_bone2_4);
        txt1 = findViewById(R.id.ID_text1_4);
        txt2 = findViewById(R.id.ID_text2_4);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int res = bundle.getInt("image_cow");
            img1.setImageResource(res);
        }

        if (bundle != null) {
            int res = bundle.getInt("image_bone1_4");
            img2.setImageResource(res);
        }

        if (bundle != null) {
            int res = bundle.getInt("image_bone2_4");
            img3.setImageResource(res);
        }

        if (txt1 != null) {
            Intent intent = getIntent();
            String mes = intent.getStringExtra("text1_4");
            txt1.setText(mes);
        }

        if (txt2 != null) {
            Intent intent = getIntent();
            String mes = intent.getStringExtra("text2_4");
            txt2.setText(mes);
        }
    }

    public void fifthView() {
        ImageView img1 = findViewById(R.id.ID_imageView5);
        ImageView img2 = findViewById(R.id.ID_bone1_5);
        ImageView img3 = findViewById(R.id.ID_bone2_5);
        txt1 = findViewById(R.id.ID_text1_5);
        txt2 = findViewById(R.id.ID_text2_5);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int res = bundle.getInt("image_rabbit");
            img1.setImageResource(res);
        }

        if (bundle != null) {
            int res = bundle.getInt("image_bone1_5");
            img2.setImageResource(res);
        }

        if (bundle != null) {
            int res = bundle.getInt("image_bone2_5");
            img3.setImageResource(res);
        }

        if (txt1 != null) {
            Intent intent = getIntent();
            String mes = intent.getStringExtra("text1_5");
            txt1.setText(mes);
        }

        if (txt2 != null) {
            Intent intent = getIntent();
            String mes = intent.getStringExtra("text2_5");
            txt2.setText(mes);
        }
    }
}



