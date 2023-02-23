package edu.sv.erick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pantalla2 extends AppCompatActivity {
    EditText edtpeso,edtaltura;
    TextView txvres;
    Button btnCalcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        edtpeso=findViewById(R.id.edtPeso);
        edtaltura=findViewById(R.id.edtAltura);
        txvres =findViewById(R.id.txvmensaje);
        btnCalcu=findViewById(R.id.btnCalcular);

    }
    public void calcular(View view ){
        double peso,altura,res;
        peso =Double.parseDouble(edtpeso.getText().toString());
        altura =Double .parseDouble(edtaltura.getText().toString());

        res=(peso/(altura*altura));

        if(res<10.5){
            txvres.setText("Críticamente Bajo de Peso" +"su IMC es de "+ res);
        }else if(res<15.9) {
            txvres.setText("Severamente Bajo de Peso"  +"su IMC es de "+ res);
        }else if(res<18.5) {
            txvres.setText("Bajo de Peso" + "su IMC es de "+ res);
        }else if(res<25) {
            txvres.setText("Normal (peso saludable)"  +"su IMC es de "+"su IMC es de "+ res);
        }else if(res<30) {
            txvres.setText( "Sobrepeso" +"su IMC es de "+"su IMC es de "+res);
        }else if(res<35) {
            txvres.setText("Obesidad Clase 1 - Moderadamente Obeso"  +"su IMC es de "+ res);
        }else if(res<40) {
            txvres.setText("Obesidad Clase 2 - Severamente Obeso" +"su IMC es de "+ res);
        }else
            txvres.setText("Obesidad Clase 3 - Críticamente Obeso" +"su IMC es de "+ res);

    }
}