package com.example.listener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView mainImage;
    private TextView mainText;
    private Button imageBtn;
    private Button textBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        imageBtn.setOnClickListener(view -> changeImage());
        textBtn.setOnClickListener(view -> changeText());
    }

    private void findViews(){
        mainImage = findViewById(R.id.main_image);
        mainText = findViewById(R.id.main_text);
        imageBtn = findViewById(R.id.img_button);
        textBtn = findViewById(R.id.text_button);
    }

    protected void changeImage(){
        mainImage.setImageResource(R.drawable.image2);
    }

    private void changeText() {
        mainText.setText(R.string.text2);
    }

}
