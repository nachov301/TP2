package app.iggy.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    private Button primerPantalla;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        primerPantalla = (Button) findViewById(R.id.btn1Pantalla);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        final EditText ingresarMonto = (EditText) findViewById(R.id.ingresarMonto);
        final EditText resultado = (EditText) findViewById(R.id.resultado);
//        RadioButton dolar = (RadioButton) findViewById(R.id.dolar);
//        RadioButton euro = (RadioButton) findViewById(R.id.euro);
//        RadioButton real = (RadioButton) findViewById(R.id.real);
        Button convertir = (Button) findViewById(R.id.btnConvertir);
        Button reiniciar = (Button) findViewById(R.id.btnReiniciar);

        primerPantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrir1Actividad();
            }
        });

        reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButton.setText("DOLAR (USA)");
                resultado.setText("");
                ingresarMonto.setText("");
            }
        });

        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    if(radioButton.getText().equals("DOLAR (USA)")){
                        String value = ingresarMonto.getText().toString();
                        Double doubleValue = Double.valueOf(value);
                        Double result = doubleValue / 70;
                        value = String.valueOf(result);
                        resultado.setText(value);
                    }
                    if(radioButton.getText().equals(("EURO"))){
                        String value = ingresarMonto.getText().toString();
                        Double doubleValue = Double.valueOf(value);
                        Double result = doubleValue / 13;
                        value = String.valueOf(result);
                        resultado.setText(value);
                    }
                    if (radioButton.getText().equals("REAL (BRAZIL)")){
                        String value = ingresarMonto.getText().toString();
                        Double doubleValue = Double.valueOf(value);
                        Double result = doubleValue / 78;
                        value = String.valueOf(result);
                        resultado.setText(value);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }

    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

    public void abrir1Actividad() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
