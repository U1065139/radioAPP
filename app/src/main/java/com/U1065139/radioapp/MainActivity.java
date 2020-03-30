package com.U1065139.radioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_ok(View view) {
        TextView txvLike = findViewById(R.id.txvShow);
        RadioGroup kGrilGroup = findViewById(R.id.kGirlGroup);

        int id = kGrilGroup.getCheckedRadioButtonId();
        RadioButton selected = findViewById(id);

        txvLike.setText("My favorite K Girl Group:"  + selected.getText());

    }
}
