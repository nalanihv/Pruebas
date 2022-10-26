package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.pruebas.colas.Queue;

public class QueueActivity2 extends AppCompatActivity {
    private Queue queue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue2);

        queue=new Queue();
        queue.add(3);
        queue.add(6);
        queue.add(9);
        queue.printl();

        Log.i("log",queue.getFirst()+"  fist ");
        Log.i("log",queue.getLast()+"   last ");
    }
}