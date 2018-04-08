package com.puncht.pnchtltd;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.puncht.pnchtltd.AccountActivity.LoginActivity;

public class MenuActivity extends AppCompatActivity {

    private Button account;
    private Button qrcodes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        qrcodes = (Button) findViewById(R.id.qrcodes);
        qrcodes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScan();
            }
        });


        account = (Button) findViewById(R.id.account);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });




    }

    public void openScan(){
        Intent intent= new Intent(MenuActivity.this, ScanCodeActivity.class);
        startActivity(intent);
    }

    public void openMainActivity(){
        Intent intent= new Intent(MenuActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
