package com.example.pruebas.colas;

import android.util.Log;

public class Queue { //para usar los datos de esa clase
    private QueueNode first;
    private QueueNode last;

    public Queue() {//por que la primera vez estan vacios -Se inicializa
        first=null;
        last=null;
      //first=last=null  ;
    }

    public void add(int data){
        QueueNode node=new QueueNode(data);//agrega valores
        if (node==null){
            Log.i("log","Queue overflow");
        }else {
            if(first==null){
                first=node;//el primero siempre va a tener el mismo valor agregando
            }else {
                node.setNext(last);//el dato que entra se enlaza con el set el enlace para que apunte al ultimo de ese momento , hasta
                //que se actualiza en la siguente linea
            }
            last=node;//el ultimo que llegue es el ultimo
        }
    }

    public void printl(){
        String result="";
        QueueNode aux=last;
        while (aux.getNext()!=null){ // aux==last.getNext; sign.
            result+=last+" -> ";
        }
    }


    public int quit(){
        return 0;
    }
}
