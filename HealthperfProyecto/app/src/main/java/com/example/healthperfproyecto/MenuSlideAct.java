package com.example.healthperfproyecto;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.healthperfproyecto.databinding.ActivityMenuSlideBinding;

public class MenuSlideAct extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMenuSlideBinding binding;
public static int opcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMenuSlideBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMenuSlide.toolbar);
        binding.appBarMenuSlide.fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.escenario);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        FragmentManager fm = getSupportFragmentManager();
        switch(opcion){
            case 1: fm.beginTransaction().replace(R.id.escenario,new Usuario_Fragment()).commit();break;
            case 2: fm.beginTransaction().replace(R.id.escenario,new Activo_Fragment()).commit();break;
            case 3: fm.beginTransaction().replace(R.id.escenario,new Sueno_Fragment()).commit();break;
            case 4: fm.beginTransaction().replace(R.id.escenario,new Redes_Fragment()).commit();break;
            default: fm.beginTransaction().replace(R.id.escenario,new Usuario_Fragment()).commit();break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_slide, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.escenario);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();

    }


}