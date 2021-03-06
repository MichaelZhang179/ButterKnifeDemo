package com.nzhang9.butterknifetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv_hello)
    TextView tvHello;

    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tvHello.setText("heheda  ");
    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        Toast.makeText(this, "button click", Toast.LENGTH_SHORT).show();
    }
}
