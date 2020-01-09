package com.example.shopdaggerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.shopdaggerjava.interators.IMainActivityInteractor;

public class MainActivity extends AppCompatActivity {

    private IMainActivityInteractor mainActivityInteractor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.act_main_tv)).setText(mainActivityInteractor.getShops().toString());
    }
}
