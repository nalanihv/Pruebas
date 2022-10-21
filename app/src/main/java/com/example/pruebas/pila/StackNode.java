package com.example.pruebas.pila;

public class StackNode {
    private int data;//dato a guradar
    private StackNode next; //representa el enlace

     public StackNode(int data,StackNode next){
         this.data=data;
         this.next=next;
     }

    public StackNode getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
      return  String.valueOf(data);
    }
}
