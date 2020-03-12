package com.example.tp4_gestion_onglet;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.tp4_gestion_onglet.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    public ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        Toolbar myToolbar = (Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_settings) {
            return true;
        }

        if(id == R.id.item1) {
            Snackbar.make(viewPager, item.getTitle(), Snackbar.LENGTH_SHORT).show();
        }
        if(id == R.id.item2) {
            Snackbar.make(viewPager, item.getTitle(), Snackbar.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}