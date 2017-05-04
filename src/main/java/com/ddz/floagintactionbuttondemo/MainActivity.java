package com.ddz.floagintactionbuttondemo;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.ddz.floatingactionbutton.FloatingActionButton;
import com.ddz.floatingactionbutton.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {

    private FloatingActionMenu fl_menu;
    private FloatingActionButton fl_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fl_menu = (FloatingActionMenu) findViewById(R.id.fab1);
        fl_menu.setButtonIcon(R.drawable.icon_like);
        fl_menu.setOnFloatingActionsMenuUpdateListener(new FloatingActionMenu.OnFloatingActionsMenuUpdateListener() {
            @Override
            public void onMenuExpanded() {
                Toast.makeText(MainActivity.this, "打开", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onMenuCollapsed() {
                Toast.makeText(MainActivity.this, "折叠", Toast.LENGTH_SHORT).show();
            }
        });

        fl_button = (FloatingActionButton) findViewById(R.id.fl_button);
        fl_button.setTitle("你好");
        fl_button.setIcon(R.drawable.icon_share);
        fl_button.setSize(20);
        fl_button.setColorNormal(getResources().getColor(R.color.colorAccent));
        fl_button.setColorPressed(getResources().getColor(R.color.colorAccent));
    }
}
