package fr.wildcodeschool.bestplanecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import fr.wildcodeschool.bestplanecalculator.Model.PassengerModel;
import fr.wildcodeschool.bestplanecalculator.Model.PlaneModel;

public class MainActivity extends AppCompatActivity {

    private PassengerModel passenger1, passenger2, passenger3, passenger4;
    private EditText poidP1, nameP1, poidP2, nameP2, poidP3, nameP3, poidP4, nameP4;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               passenger1 = new PassengerModel(Float.parseFloat(poidP1.getText().toString()),nameP1.getText().toString());
               passenger2 = new PassengerModel(Float.parseFloat(poidP2.getText().toString()),nameP2.getText().toString());
               passenger3 = new PassengerModel(Float.parseFloat(poidP3.getText().toString()),nameP3.getText().toString());
               passenger4 = new PassengerModel(Float.parseFloat(poidP4.getText().toString()),nameP4.getText().toString());
           }
       });
    }

}
