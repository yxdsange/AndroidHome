package com.it.dev.property;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.it.dev.R;

public class PropertyHomeActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_activity, tv_view, tv_linearlayout, tv_ui, tv_activity_pm, tv_ui_map, tv_ui_menu, tv_ui_dialog, tv_activity_life, tv_ui_fragment, tv_ui_travel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_home);
        initUI();
        initOnClicklistener();
    }

    private void initUI() {
        tv_activity = findViewById(R.id.tv_activity);
        tv_view = findViewById(R.id.tv_view);
        tv_linearlayout = findViewById(R.id.tv_linearlayout);
        tv_ui = findViewById(R.id.tv_ui);
        tv_activity_pm = findViewById(R.id.tv_activity_pm);
        tv_ui_map = findViewById(R.id.tv_ui_map);
        tv_ui_menu = findViewById(R.id.tv_ui_menu);
        tv_ui_dialog = findViewById(R.id.tv_ui_dialog);
        tv_activity_life = findViewById(R.id.tv_activity_life);
        tv_ui_fragment = findViewById(R.id.tv_ui_fragment);
        tv_ui_travel = findViewById(R.id.tv_ui_travel);
    }

    private void initOnClicklistener() {
        tv_activity.setOnClickListener(this);
        tv_view.setOnClickListener(this);
        tv_linearlayout.setOnClickListener(this);
        tv_ui.setOnClickListener(this);
        tv_activity_pm.setOnClickListener(this);
        tv_ui_map.setOnClickListener(this);
        tv_ui_menu.setOnClickListener(this);
        tv_ui_dialog.setOnClickListener(this);
        tv_activity_life.setOnClickListener(this);
        tv_ui_fragment.setOnClickListener(this);
        tv_ui_travel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_activity:
                break;
            case R.id.tv_view:
                break;
            case R.id.tv_linearlayout:
                break;
            case R.id.tv_ui:
                break;
            case R.id.tv_activity_pm:
                break;
            case R.id.tv_ui_map:
                break;
            case R.id.tv_ui_menu:
                break;
            case R.id.tv_ui_dialog:
                break;
            case R.id.tv_activity_life:
                break;
            case R.id.tv_ui_fragment:
                break;
            case R.id.tv_ui_travel:
                break;
        }
    }
}
