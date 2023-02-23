package edu.sv.erick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtUser,edtContra;
    TextView txvRes;
    Button btnIngresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser=findViewById(R.id.edtuser);
        edtContra=findViewById(R.id.edtContrase);
        btnIngresar=findViewById(R.id.btnLogin);
        txvRes=findViewById(R.id.txvMensa);


    }
    public void ingresar (View view){
        String user, contra;
        user  = edtUser.getText().toString();
        contra=edtContra.getText().toString();

        if(user.equals("parcialETps1")&&(contra.equals("p4rC14l#tp$"))){
            Intent intento= new Intent(this,Pantalla2.class);
            startActivity(intento);
        }
        else
            txvRes.setText("usuario o contrasena incorrectas");



    }
}