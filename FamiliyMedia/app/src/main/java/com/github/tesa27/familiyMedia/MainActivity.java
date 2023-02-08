package com.github.tesa27.familiyMedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.github.tesa27.familiyMedia.ui.login.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new LoginFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_login, fragment)
                .commit();

    }
}