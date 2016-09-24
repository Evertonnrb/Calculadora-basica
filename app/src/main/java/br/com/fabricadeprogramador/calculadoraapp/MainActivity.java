package br.com.fabricadeprogramador.calculadoraapp;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button somar = (Button)findViewById(R.id.btnSomar);
        Button subtrair = (Button)findViewById(R.id.btnSub);
        Button multiplicar = (Button)findViewById(R.id.btnMult);
        Button divdir = (Button)findViewById(R.id.btnDiv);

        somar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //recebendo a entrada de dados
               EditText num1 = (EditText)findViewById(R.id.n1);
               EditText num2 = (EditText)findViewById(R.id.n2);
               //Convertendo para usar a condicional mais simples
               String numero1 = num1.getText().toString();
               String numero2 = num2.getText().toString();

               if((numero1.isEmpty()||numero2.isEmpty())&&(numero2.isEmpty()||numero1.isEmpty())){
                   Toast.makeText(MainActivity.this,"Por favor preencha os campos",Toast.LENGTH_SHORT).show();
               }
               else{
                   Double n1 = new Double(numero1);
                   Double n2 = new Double(numero2);
                   Double somar = n1+n2;

                   Toast.makeText(MainActivity.this,"O resultado da soma é "+somar,Toast.LENGTH_SHORT).show();
               }

           }
       });

        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recebendo a entrada de dados
                EditText num1 = (EditText)findViewById(R.id.n1);
                EditText num2 = (EditText)findViewById(R.id.n2);
                //Convertendo para usar a condicional mais simples
                String numero1 = num1.getText().toString();
                String numero2 = num2.getText().toString();

                if((numero1.isEmpty()||numero2.isEmpty())&&(numero2.isEmpty()||numero1.isEmpty())){
                    Toast.makeText(MainActivity.this,"Por favor preencha os campos",Toast.LENGTH_SHORT).show();
                }
                else{
                    Double n1 = new Double(numero1);
                    Double n2 = new Double(numero2);
                    Double subtracao = n1-n2;

                    Toast.makeText(MainActivity.this,"O resultado da subtração é "+subtracao,Toast.LENGTH_SHORT).show();
                }

            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recebendo a entrada de dados
                EditText num1 = (EditText)findViewById(R.id.n1);
                EditText num2 = (EditText)findViewById(R.id.n2);
                //Convertendo para usar a condicional mais simples
                String numero1 = num1.getText().toString();
                String numero2 = num2.getText().toString();

                if((numero1.isEmpty()||numero2.isEmpty())&&(numero2.isEmpty()||numero1.isEmpty())){
                    Toast.makeText(MainActivity.this,"Por favor preencha os campos",Toast.LENGTH_SHORT).show();
                }
                else{
                    Double n1 = new Double(numero1);
                    Double n2 = new Double(numero2);
                    Double multi = n1*n2;

                    Toast.makeText(MainActivity.this,"O resultado da multiplicação é "+multi,Toast.LENGTH_SHORT).show();
                }

            }
        });

        divdir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recebendo a entrada de dados
                EditText num1 = (EditText)findViewById(R.id.n1);
                EditText num2 = (EditText)findViewById(R.id.n2);
                //Convertendo para usar a condicional mais simples
                String numero1 = num1.getText().toString();
                String numero2 = num2.getText().toString();


                if((numero1.isEmpty()||numero2.isEmpty())&&(numero2.isEmpty()||numero1.isEmpty())){
                    Toast.makeText(MainActivity.this,"Por favor preencha os campos",Toast.LENGTH_SHORT).show();
                }

                else{
                    Double n1 = new Double(numero1);
                    Double n2 = new Double(numero2);
                    if(n1 == 0){
                        Toast.makeText(MainActivity.this,"O primeiro valor não pode ser 0 ;,)",Toast.LENGTH_SHORT).show();
                    }
                    Double divi = n1/n2;

                    Toast.makeText(MainActivity.this,"O resultado da divisão é "+divi,Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
