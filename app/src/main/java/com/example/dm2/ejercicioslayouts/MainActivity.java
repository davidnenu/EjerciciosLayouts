package com.example.dm2.ejercicioslayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button ej1;
    private Button ej2;
    private Button ej3;
    private Button ej4;
    private Button ej5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ej1=(Button)findViewById(R.id.ej1);

        ej1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this,Ej1.class);
            startActivity(intent);

        }
    });
        ej2=(Button)findViewById(R.id.ej2);

        ej2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,Ej2.class);
                startActivity(intent);

            }
        });
        ej3=(Button)findViewById(R.id.ej3);

        ej3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,Ej3.class);
                startActivity(intent);

            }
        });
        ej4=(Button)findViewById(R.id.ej4);

        ej4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,Ej4.class);
                startActivity(intent);

            }
        });
        ej5=(Button)findViewById(R.id.ej5);

        ej5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,Ej5.class);
                startActivity(intent);

            }
        });
}

}
