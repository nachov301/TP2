package app.iggy.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button segundaPantalla;
    private int number = 0;
    private TextView result;
    private String string = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSumar = findViewById(R.id.btnSumar);
        Button btnRestar = findViewById(R.id.btnRestar);
        Button btnZoom = findViewById(R.id.btnZoom);
        Button btnZoom2 = findViewById(R.id.btnZoom2);
        Button btnOcultar = findViewById(R.id.btnOcultar);
        Button btnReset = findViewById(R.id.btnReset);
        result = (TextView)findViewById(R.id.result);

        segundaPantalla = (Button) findViewById(R.id.btn2Pantalla);

        segundaPantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrir2Actividad();
            }
        });

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number++;
                string = String.valueOf(number);
                result.setText(string);
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number > 0){
                    number--;
                    string = String.valueOf(number);
                    result.setText(string);
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = 0;
                string = String.valueOf(number);
                result.setText(string);
            }
        });
    }

    public void abrir2Actividad(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
