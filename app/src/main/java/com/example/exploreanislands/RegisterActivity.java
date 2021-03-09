package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private static final String TAG = "EmailPasswword";

    EditText email, password, conpassword;
    Button register, link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser() != null) {
            startActivity(new Intent(RegisterActivity.this, MainHomeActivity.class));
            finish();
        }
        setContentView(R.layout.activity_register);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);
        conpassword = findViewById(R.id.CPassword);

        register = findViewById(R.id.btn_register);
        link = findViewById(R.id.btn_alAccount);

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup();
            }
        });
    }


    private void signup() {
        Log.d(TAG, "signUp" + email);
        if (!validateForm()) {
            return;
        }
        String em = email.getText().toString();
        String pw = password.getText().toString();

        mAuth.createUserWithEmailAndPassword(em, pw)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(RegisterActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegisterActivity.this, MainHomeActivity.class));
                            finish();
                        } else {
                            Log.w(TAG, "signUpWithEmail:failure", task.getException());
                            Toast.makeText(RegisterActivity.this, "Registration Failed!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

    private boolean validateForm() {
        boolean valid = true;

        String em = email.getText().toString();
        if (TextUtils.isEmpty(em)) {
            email.setError("Required.");
            valid = false;
        } else {
            email.setError(null);
        }

        String pw = password.getText().toString();
        if (TextUtils.isEmpty(pw)) {
            password.setError("Required.");
            valid = false;
        } else {
            password.setError(null);
        }

        String cpw = conpassword.getText().toString();
        if (TextUtils.isEmpty(cpw)) {
            conpassword.setError("Required.");
            valid = false;
        } else {
            conpassword.setError(null);
        }

        if (!(cpw.equals(pw))) {
            conpassword.setError("Re Enter Password!");
            valid = false;
        } else {
            conpassword.setError(null);
        }

        return valid;
    }

}