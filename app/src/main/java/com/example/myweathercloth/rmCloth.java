package com.example.myweathercloth;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.graphics.drawable.Drawable;

public class rmCloth extends AppCompatActivity {

    TextView Tv1;
    EditText ET1;
    Button BT1;
    ImageView iv1, iv2, iv3;

    int[] i28 = new int[] {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4,
            R.drawable.a5, R.drawable.a6};
    int[] i23 = new int[] {R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4,
            R.drawable.b5, R.drawable.b6};
    int[] i17 = new int[] {R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4,
            R.drawable.c5, R.drawable.c6};
    int[] i12 = new int[] {R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4,
            R.drawable.d5, R.drawable.d6};
    int[] i8 = new int[] {R.drawable.e1, R.drawable.e2, R.drawable.e3, R.drawable.e4,
            R.drawable.e5, R.drawable.e6};
    int[] i3 = new int[] {R.drawable.f1, R.drawable.f2, R.drawable.f3, R.drawable.f4,
            R.drawable.f5, R.drawable.f6};
    int[] i0 = new int[] {R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4,
            R.drawable.g5, R.drawable.g6};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rmcloth);
        setTitle("온도별 의상 추천");

        Tv1 = (TextView) findViewById(R.id.Tv1);
        ET1 = (EditText) findViewById(R.id.ET1);
        BT1 = (Button) findViewById(R.id.BT1);
        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);

        iv1.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.INVISIBLE);

        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setVisibility(View.VISIBLE);
                iv2.setVisibility(View.VISIBLE);
                iv3.setVisibility(View.VISIBLE);

                int i = Integer.parseInt(ET1.getText().toString());
                if(i>28) {
                    int server_num1 = (int)(Math.random() * i28.length);
                    int server_num2 = (int)(Math.random() * i28.length);
                    int server_num3 = (int)(Math.random() * i28.length);
                    iv1.setBackgroundResource(i28[server_num1]);
                    iv2.setBackgroundResource(i28[server_num2]);
                    iv3.setBackgroundResource(i28[server_num3]);
                }
                if(i>23) {
                    int server_num1 = (int)(Math.random() * i23.length);
                    int server_num2 = (int)(Math.random() * i23.length);
                    int server_num3 = (int)(Math.random() * i23.length);
                    iv1.setBackgroundResource(i23[server_num1]);
                    iv2.setBackgroundResource(i23[server_num2]);
                    iv3.setBackgroundResource(i23[server_num3]);
                }
                if(i>17) {
                    int server_num1 = (int)(Math.random() * i17.length);
                    int server_num2 = (int)(Math.random() * i17.length);
                    int server_num3 = (int)(Math.random() * i17.length);
                    iv1.setBackgroundResource(i17[server_num1]);
                    iv2.setBackgroundResource(i17[server_num2]);
                    iv3.setBackgroundResource(i17[server_num3]);
                }
                if(i>12) {
                    int server_num1 = (int)(Math.random() * i12.length);
                    int server_num2 = (int)(Math.random() * i12.length);
                    int server_num3 = (int)(Math.random() * i12.length);
                    iv1.setBackgroundResource(i12[server_num1]);
                    iv2.setBackgroundResource(i12[server_num2]);
                    iv3.setBackgroundResource(i12[server_num3]);
                }
                if(i>8) {
                    int server_num1 = (int)(Math.random() * i8.length);
                    int server_num2 = (int)(Math.random() * i8.length);
                    int server_num3 = (int)(Math.random() * i8.length);
                    iv1.setBackgroundResource(i8[server_num1]);
                    iv2.setBackgroundResource(i8[server_num2]);
                    iv3.setBackgroundResource(i8[server_num3]);
                }
                if(i>3) {
                    int server_num1 = (int)(Math.random() * i3.length);
                    int server_num2 = (int)(Math.random() * i3.length);
                    int server_num3 = (int)(Math.random() * i3.length);
                    iv1.setBackgroundResource(i3[server_num1]);
                    iv2.setBackgroundResource(i3[server_num2]);
                    iv3.setBackgroundResource(i3[server_num3]);
                }
                if(i<=0 && i<3) {
                    int server_num1 = (int)(Math.random() * i0.length);
                    int server_num2 = (int)(Math.random() * i0.length);
                    int server_num3 = (int)(Math.random() * i0.length);
                    iv1.setBackgroundResource(i0[server_num1]);
                    iv2.setBackgroundResource(i0[server_num2]);
                    iv3.setBackgroundResource(i0[server_num3]);
                }
            }
        });



    }
}
