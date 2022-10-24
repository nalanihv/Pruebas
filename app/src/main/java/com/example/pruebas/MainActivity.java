package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pruebas.pila.PilaArreglo;
import com.example.pruebas.pila.StackNode;

public class MainActivity extends AppCompatActivity {
    private PilaArreglo stack; //datos de la calse pila
    private Stack stackList; //datos de clase stack
    private EditText etTexto;
    private Button btGuardar;
    private StackNode top;
    char date;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTexto=findViewById(R.id.etTexto);
        btGuardar=findViewById(R.id.btButton);
      //  stack=new PilaArreglo(); //se crea/inicializa



        btGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stackList=new Stack();
                String input=etTexto.getText().toString().trim();
                etTexto.setText("");
                if (input.equals(""))
                    Toast.makeText(getApplicationContext(), "Favor de ingresar un dato", Toast.LENGTH_SHORT).show();
                else {

                    for (int i = 0; i < input.length(); i++) {
                       date= input.charAt(i);
                       char top=date;
                       Log.i("log","dato "+ date);

                    }
                     // stackList.printl();

                    String aux="";
                    StackNode node=top;
                    while (top!=null){
                        aux+=node+ "-> ";
                        node=node.getNext();
                    }
                    Log.i("log",""+aux);



                  //  while (node=='a'){
                        int  auxInverso= stackList.Pop();

                        if (top.equals(auxInverso)){
                            Log.i("es palindromo ","");
                        }
                        else {
                            Log.i("no es palindromo","");
                        }

                    //}






                   // stackList.printl();





                   // stackList = new StackNode(aux, stackList);
                  //  stackList.Push(date);
                   //stackList.Push(aux);
                    //Log.i("log","top"+stackList.getTop());

                    //Log.i("log","dato ingresado "+aux);
                    //stackList.printl();
                }
              //  stackList.printl();
            }
        });

/*
        stackList.Push(20); //usos de los metodos de la clase stack
        stackList.Push(11);
        stackList.Push(34);
        stackList.Push(2);
        stackList.Push(34);
        Log.i("log","remove "+stackList.Pop());//quita el primer elemento de la lista
        Log.i("log","top   "+stackList.getTop()); //imprime el top de la lista
        stackList.printl();//imprime la toda la lista



        //se usa el metodo para agrear los datos
        Log.i("pop",stack.pop()+" ");
        stack.push(3);
        stack.push(5);
        stack.push(9);
        stack.push(2);
        stack.push(1);
        Log.i("log","TOP "+stack.getTop());//posciones, es decir cuentos datos hay, por asi decrilo
        Log.i("log",stack.pop()+""); //posciones, uno se borra
        Log.i("log",stack.getTop()+"Data ->"+stack.getDataTop());//regresa el valor que hay en la  ultima posicion
        stack.push(11);
        stack.push(23);
        stack.push(345);
        stack.push(6);
        stack.push(4);
        stack.push(8);
        Log.i("log","top "+stack.getTop());*/

    }
}