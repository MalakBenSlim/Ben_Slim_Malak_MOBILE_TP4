package com.example.ben_slim_malak_tp4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtnom, edtprenom, edtmail;
    private Button envoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1) Association avec les vues XML
        edtnom = findViewById(R.id.nom);
        edtprenom = findViewById(R.id.prenom);
        edtmail = findViewById(R.id.mail);
        envoyer = findViewById(R.id.btnsend);

        // 2) Listener du bouton
        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupération des valeurs saisies
                String nom = edtnom.getText().toString();
                String prenom = edtprenom.getText().toString();
                String mail = edtmail.getText().toString();

                if (nom.isEmpty() || prenom.isEmpty() || mail.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                    return;
                }
                // 3) Intent explicite
                Intent intent = new Intent(MainActivity.this, activity_welcome.class);
                intent.putExtra("nom", nom);
                intent.putExtra("prenom", prenom);
                intent.putExtra("mail", mail);
                startActivity(intent);


            }
        });
    }

}