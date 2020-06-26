package app.iggy.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    EditText User;
    EditText Password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        User = (EditText) findViewById(R.id.user);
        Password = (EditText) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((User.getText().toString().equals("ites"))&&(Password.getText().toString().equals("1234"))){
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    "Acceso valido", Toast.LENGTH_SHORT);

                    toast1.show();
                    abrir1Actividad();
                }else{
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    "Acceso no permitido", Toast.LENGTH_SHORT);

                    toast1.show();
                    User.setText("");
                    Password.setText("");
                }
            }
        });
    }

    public void abrir1Actividad() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
