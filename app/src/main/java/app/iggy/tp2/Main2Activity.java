package app.iggy.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    private Button primerPantalla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        primerPantalla = (Button) findViewById(R.id.btn1Pantalla);

        EditText ingresarMonto = (EditText) findViewById(R.id.ingresarMonto);
        EditText resultado = (EditText) findViewById(R.id.resultado);
        RadioButton dolar = (RadioButton) findViewById(R.id.dolar);
        RadioButton euro = (RadioButton) findViewById(R.id.euro);
        RadioButton real = (RadioButton) findViewById(R.id.real);
        Button convertir = (Button) findViewById(R.id.btnConvertir);
        Button reiniciar = (Button) findViewById(R.id.btnReiniciar);

        primerPantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrir1Actividad();
            }
        });
    }

    public void abrir1Actividad() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
