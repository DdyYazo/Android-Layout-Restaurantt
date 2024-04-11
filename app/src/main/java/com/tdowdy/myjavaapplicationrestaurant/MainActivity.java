package com.tdowdy.myjavaapplicationrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.textView);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                String texto = "Su pedido es ";
                String pedido = "";
                if (radioButton.getText().equals("Frito")) {
                    pedido = "Huevos fritos";
                } else if (radioButton.getText().equals("Revuelto")) {
                    pedido = "Huevos revueltos";
                } else if (radioButton.getText().equals("Perico")) {
                    pedido = "Huevos pericos";
                } else if (radioButton.getText().equals("Cocido")) {
                    pedido = "Huevos cocidos";
                }
                textView.setText(texto + pedido);
            }
        });
    }
}