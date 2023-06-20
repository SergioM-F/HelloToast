package cl.samf.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initListener();







    }

    private void initListener() {
        Button botonToast = findViewById(R.id.buttonToast);
        Button botoncontar = findViewById(R.id.buttonContador);
        TextView textoContador = findViewById(R.id.textContador);

        botonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Hello Toast", Toast.LENGTH_SHORT).show();
            }
        });

        botoncontar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer numero = Integer.parseInt(textoContador.getText().toString()) ;
                numero++;
                textoContador.setText(numero.toString());

            }
        });
        

    }
}