package com.example.home;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText login,password;

    Button btn_cnx ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login =findViewById(R.id.login);
       password =findViewById(R.id.password);
        btn_cnx =findViewById(R.id.btn_connexion);






        btn_cnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myintent = new Intent(MainActivity.this,Two.class);
                if (login.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")  )
                    startActivity(myintent);
                else
                    Toast.makeText(MainActivity.this, "TRY AGAIN",Toast.LENGTH_LONG).show();

            }
        });

    }


}