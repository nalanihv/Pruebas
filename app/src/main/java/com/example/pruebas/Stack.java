package com.example.pruebas;
import android.util.Log;

import com.example.pruebas.pila.StackNode;

//pila con una lista enlazada
public class Stack {
    private StackNode top;

    public Stack(){ //contructor:inicializa,valor inicial del valor
       top=null;
    }

    public StackNode getTop(){//getter top
        return top;
    }

    public void Push(int data){ //paga agregar valores
        StackNode node=new StackNode(data,top);
         //top=new StackNode(data,top);
        top=node;
        if(top==null){ //StarOverflow
            /*en este caso el limite es el espacio en memoria, si  ya esta lleno
            * no se va a guardar el dato y por ello el enlace del dato
            * va a ser nulo */
            Log.i("log","stackOverflow");
        }}



    public void  printl(){
        String aux="";
        StackNode node=top;
        while (top!=null){
            aux+=node+ "-> ";
            node=node.getNext();
        }
        Log.i("log",""+aux);
    }

    public int Pop(/*solo si recibe parametros de otra clase*/){
        if (top.getNext()==null) { //stackUnderflow
            Log.i("log", "empty stack");
            return -1;
        }else{
                StackNode aux = top;
                top = top.getNext();
                return aux.getData();
            }}
    }

