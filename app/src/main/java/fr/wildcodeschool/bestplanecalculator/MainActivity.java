package fr.wildcodeschool.bestplanecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import fr.wildcodeschool.bestplanecalculator.Model.PassengerModel;
import fr.wildcodeschool.bestplanecalculator.Model.PlaneModel;

public class MainActivity extends AppCompatActivity {

    private PassengerModel passenger1, passenger2, passenger3, passenger4;
    private EditText poidP1, nameP1, poidP2, nameP2, poidP3, nameP3, poidP4, nameP4, bagage;
    private Button button;
    private TextView textResult;

    private PlaneModel plane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        poidP1 = (EditText) findViewById(R.id.editText4);
        nameP1 = (EditText) findViewById(R.id.editText2);
        poidP2 = (EditText) findViewById(R.id.editText3);
        nameP2 = (EditText) findViewById(R.id.editText);
        poidP3 = (EditText) findViewById(R.id.editText6);
        nameP3 = (EditText) findViewById(R.id.editText5);
        poidP4 = (EditText) findViewById(R.id.editText8);
        nameP4 = (EditText) findViewById(R.id.editText7);
        bagage = (EditText) findViewById(R.id.Luggage);
        button = (Button) findViewById(R.id.submit_btn);
        textResult = (TextView) findViewById(R.id.textResult);

        plane = new PlaneModel(0.205f, 0.564f, "DR400", 578f, 900f, 110f, 0.376f, 0.410f, 1.190f, 1.900f, 1.120f, 0.72f);

        button.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {

               passenger1 = new PassengerModel(Float.parseFloat(poidP1.getText().toString()),nameP1.getText().toString());
               passenger2 = new PassengerModel(Float.parseFloat(poidP2.getText().toString()),nameP2.getText().toString());
               passenger3 = new PassengerModel(Float.parseFloat(poidP3.getText().toString()),nameP3.getText().toString());
               passenger4 = new PassengerModel(Float.parseFloat(poidP4.getText().toString()),nameP4.getText().toString());
               float lugage = Float.parseFloat(bagage.getText().toString());

               plane.setLuggage(lugage);
               plane.setPassenger1(passenger1);
               plane.setPassenger2(passenger2);
               plane.setPassenger3(passenger3);
               plane.setPassenger4(passenger4);

               textResult.setText(plane.optimizationOfTheYear());
           }

       });
    }

}
