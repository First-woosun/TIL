package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    Button btnOK;
    ImageView imgPet;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("애완동물 사진보기");

        text1 = findViewById(R.id.Text1);
        text2 = findViewById(R.id.Text2);
        chkAgree = findViewById(R.id.ChkAgree);
        rGroup1 = findViewById(R.id.Rgroup1);

        btnOK = findViewById(R.id.BtnOK);
        imgPet = findViewById(R.id.ImgPet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chkAgree.isChecked() == true){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rGroup1.getCheckedRadioButtonId();
                if (id == R.id.Rdog){
                    imgPet.setImageResource(R.drawable.dog);
                } else if (id == R.id.Rcat) {
                    imgPet.setImageResource(R.drawable.cat);
                } else if (id == R.id.Rrabbit) {
                    imgPet.setImageResource(R.drawable.rabbit);
                } else {
                    Toast.makeText(getApplicationContext(),"동물 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}