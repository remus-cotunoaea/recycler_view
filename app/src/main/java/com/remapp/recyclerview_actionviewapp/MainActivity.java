package com.remapp.recyclerview_actionviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView btn = findViewById(R.id.ID_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        TextView txt1 = findViewById(R.id.ID_text1);
        TextView txt2 = findViewById(R.id.ID_text2);

        ImageView boneUno = findViewById(R.id.ID_uno);
        boneUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = txt1.getText().toString();
                String text2 = txt2.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("image_cat", R.drawable.cat);
                intent.putExtra("image_bone1_1", R.drawable.bone);
                intent.putExtra("image_bone2_1", R.drawable.bone_yellow);
                intent.putExtra("text1_1", text1);
                intent.putExtra("text2_1", text2);
                startActivity(intent);
            }
        });

        TextView txt3 = findViewById(R.id.ID_text3);
        TextView txt4 = findViewById(R.id.ID_text4);

        ImageView boneDos = findViewById(R.id.ID_dos);
        boneDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = txt3.getText().toString();
                String text2 = txt4.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("image_dog", R.drawable.dog);
                intent.putExtra("image_bone1_2", R.drawable.bone);
                intent.putExtra("image_bone2_2", R.drawable.bone_yellow);
                intent.putExtra("text1_2", text1);
                intent.putExtra("text2_2", text2);
                startActivity(intent);
            }
        });

        TextView txt5 = findViewById(R.id.ID_text5);
        TextView txt6 = findViewById(R.id.ID_text6);

        ImageView boneTres = findViewById(R.id.ID_tres);
        boneTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = txt5.getText().toString();
                String text2 = txt6.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("image_pig", R.drawable.pig);
                intent.putExtra("image_bone1_3", R.drawable.bone);
                intent.putExtra("image_bone2_3", R.drawable.bone_yellow);
                intent.putExtra("text1_3", text1);
                intent.putExtra("text2_3", text2);
                startActivity(intent);
            }
        });

        TextView txt7 = findViewById(R.id.ID_text7);
        TextView txt8 = findViewById(R.id.ID_text8);

        ImageView boneCuatro = findViewById(R.id.ID_cuatro);
        boneCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = txt7.getText().toString();
                String text2 = txt8.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("image_cow", R.drawable.cow);
                intent.putExtra("image_bone1_4", R.drawable.bone);
                intent.putExtra("image_bone2_4", R.drawable.bone_yellow);
                intent.putExtra("text1_4", text1);
                intent.putExtra("text2_4", text2);
                startActivity(intent);
            }
        });

        TextView txt9 = findViewById(R.id.ID_text9);
        TextView txt10 = findViewById(R.id.ID_text10);

        ImageView boneCinco = findViewById(R.id.ID_cinco);
        boneCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = txt9.getText().toString();
                String text2 = txt10.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("image_rabbit", R.drawable.rabbit);
                intent.putExtra("image_bone1_5", R.drawable.bone);
                intent.putExtra("image_bone2_5", R.drawable.bone_yellow);
                intent.putExtra("text1_5", text1);
                intent.putExtra("text2_5", text2);
                startActivity(intent);
            }
        });

    }
}