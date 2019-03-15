package guilherme.br.edu.ifsc.exercicioimc;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
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

        ImageView imagem = findViewById(R.id.imagem);

        Drawable imageDrawable;

        if (imc < 18.5F)
        {
            imageDrawable = getDrawable(R.drawable.abaixopeso);
        }
        else if (imc <= 24.9F)
        {
            imageDrawable = getDrawable(R.drawable.normal);
        }
        else if (imc <= 29.9F)
        {
            imageDrawable = getDrawable(R.drawable.sobrepeso);
        }
        else if (imc <= 34.9F)
        {
            imageDrawable = getDrawable(R.drawable.obesidade1);
        }
        else if (imc <= 39.9F)
        {
            imageDrawable = getDrawable(R.drawable.obesidade2);
        }
        else
        {
            imageDrawable = getDrawable(R.drawable.obesidade3);
        }

        imagem.setImageDrawable(imageDrawable);
    }
}
