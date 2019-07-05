package com.example.imagebuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private ImageButton imgButton;
    private ImageView imgView;
    private Switch switch_imageView;
    private RadioButton radio_enabled;
    private CheckBox checkbox;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgButton=findViewById(R.id.imageButton);
        imgView=findViewById(R.id.imageview_iv);
        switch_imageView=findViewById(R.id.showhide_sw);
        radio_enabled=findViewById(R.id.radio_enabled);
        checkbox=findViewById(R.id.checked_ch);
    }


    public void changeImage(View view){
        if(count%2==0){
            imgButton.setImageResource(R.drawable.saitama);
            imgView.setImageResource(R.drawable.punch);
        }else{
            imgButton.setImageResource(R.drawable.punch);
            imgView.setImageResource(R.drawable.saitama);
        }
        count++;
    }
    public void refreshment(View view){
        if(switch_imageView.isChecked()){
            imgView.setVisibility(View.INVISIBLE);
        }else{
            imgView.setVisibility(View.VISIBLE);
        }
        if(radio_enabled.isChecked()){
            imgButton.setClickable(true);
        }else{
            imgButton.setClickable(false);
        }
        if(checkbox.isChecked()){
            imgButton.setVisibility(View.VISIBLE);
        }else{
            imgButton.setVisibility(View.INVISIBLE);
        }


    }



}
