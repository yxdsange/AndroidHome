package com.it.dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.it.dev.datatraffic.TrafficHomeActivity;
import com.it.dev.media.MediaHomeActivity;
import com.it.dev.net.NetHomeActivity;
import com.it.dev.property.PropertyHomeActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_home_propeerty, btn_home_net, btn_home_datatraffic, btn_home_media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initOnClicke();

    }

    private void initOnClicke() {
        btn_home_propeerty.setOnClickListener(this);
        btn_home_net.setOnClickListener(this);
        btn_home_datatraffic.setOnClickListener(this);
        btn_home_media.setOnClickListener(this);
    }

    private void initUI() {
        btn_home_propeerty = findViewById(R.id.btn_home_propeerty);
        btn_home_net = findViewById(R.id.btn_home_net);
        btn_home_datatraffic = findViewById(R.id.btn_home_datatraffic);
        btn_home_media = findViewById(R.id.btn_home_media);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_home_propeerty:
                startActivity(new Intent(MainActivity.this, PropertyHomeActivity.class));

                break;
            case R.id.btn_home_datatraffic:
                startActivity(new Intent(MainActivity.this, TrafficHomeActivity.class));
                break;
            case R.id.btn_home_net:

                startActivity(new Intent(MainActivity.this, NetHomeActivity.class));

                break;
            case R.id.btn_home_media:
                startActivity(new Intent(MainActivity.this, MediaHomeActivity.class));
                break;

        }
    }
}
