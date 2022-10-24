package com.example.pruebas.pila;

import android.util.Log;

//PILA. es comun que tengan tamaño fijo ,estático
public class PilaArreglo {
    private static final int size=50;//constante
    private char[] list;
    private int top;//guarda la ultima posicion de la lista, es como 'i' en un for

    public PilaArreglo() {//CONSTRUCTOR
        list=new char[size];
        top=-1;
    }

     public int getTop() { //getter, muestra el valor del top que se asigna en el metodo push,posicion
         return top;}
     
     //metodo que no regresa nd, agrega
     public void push(char data){

        if (isFull()==true) {
            Log.i("log", "the stack is full");
        } else {
            top++;
            list[top] = data; //para agregar valores en posiciones
        }
     }

     public int pop(){ //quitar
       char aux = 0;
        if(isEmpty()==true){
            Log.i("log","the stack is empty");
        }else{
         aux =list[top];//dato de la lista
         list[top]='c';
         top--;
        }return aux;
    }

     public int getDataTop(){//lo mismo que el get top pero el dato 
        return list[top];
     }

     public boolean isFull(){
        if (top==size-1){ //si el arreglo esta lleno
            return true;
        }
        return false;
     }

     public boolean isEmpty(){
        if (top==-1){
            return true;
        }
        return false;
     }
 }

