package com.linux.prime.pruebafirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private EditText mensajeEditText;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference();
    DatabaseReference mensajeRef = ref.child("mensaje");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensajeEditText = (EditText) findViewById(R.id.mensajeEditText);

    }
    protected void onStart(){
        super.onStart();
    }
    protected void mostrar(View view){
        String m = mensajeEditText.getText().toString();
        mensajeRef.setValue(m);


    }
}
