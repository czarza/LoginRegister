package com.example.alfredo.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etRFC         = (EditText) findViewById(R.id.etRFC);
        final EditText etNumberAgent = (EditText) findViewById(R.id.etNumberAgent);
        final EditText etNameAgent   = (EditText) findViewById(R.id.etNameAgent);
        final EditText etUserName    = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword    = (EditText) findViewById(R.id.etPassword);
        final EditText etCellPhone   = (EditText) findViewById(R.id.etCellphone);
        final Button   bRegister     = (Button) findViewById(R.id.bRegister);

    }
}
