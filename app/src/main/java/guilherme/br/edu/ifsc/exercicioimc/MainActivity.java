package guilherme.br.edu.ifsc.exercicioimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularIMC(View view)
    {
        EditText alturaText = findViewById(R.id.altura);
        EditText pesoText = findViewById(R.id.peso);

        float altura = Float.valueOf(alturaText.getText().toString());
        float peso = Float.valueOf(pesoText.getText().toString());

        float imc = peso / (altura * altura);

        TextView imcText = findViewById(R.id.imc);

        imcText.setText(String.format("IMC: %.2f", imc));
    }
}
