package com.example.socialmediaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import com.example.socialmediaapp.Fragments.AddFragment;
import com.example.socialmediaapp.Fragments.HomeFragment;
import com.example.socialmediaapp.Fragments.NotificationFragment;
import com.example.socialmediaapp.Fragments.ProfileFragment;
import com.example.socialmediaapp.Fragments.SearchFragment;
import com.example.socialmediaapp.databinding.ActivityMainBinding;
import com.iammert.library.readablebottombar.ReadableBottomBar;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        MainActivity.this.setTitle("My profile");
       binding.readableBottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
           @Override

           public void onItemSelected(int i) {
               FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
               switch (i){
                   case 0:
                       transaction.replace(R.id.container, new HomeFragment());
                         binding.toolbar.setVisibility(View.GONE);
                         break;
                   case 1:
                       transaction.replace(R.id.container, new NotificationFragment());
                       binding.toolbar.setVisibility(View.GONE);
                       break;
                   case 2:
                       transaction.replace(R.id.container, new AddFragment());
                       binding.toolbar.setVisibility(View.GONE);
                       break;
                   case 3:
                       transaction.replace(R.id.container, new SearchFragment());
                       binding.toolbar.setVisibility(View.GONE);
                       break;
                   case 4:
                       transaction.replace(R.id.container, new ProfileFragment());
                       binding.toolbar.setVisibility(View.VISIBLE);
                       break;
               }
               transaction.commit();
           }
       });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }
}