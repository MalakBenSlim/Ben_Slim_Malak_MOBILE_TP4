package com.example.ben_slim_malak_tp4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_welcome extends AppCompatActivity {
    TextView txtWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);
        //Initialisation du TextView
        txtWelcome = findViewById(R.id.txtWelcome);

        // Récupération de l’intent et des extras
        String nom    = getIntent().getStringExtra("nom");
        String prenom = getIntent().getStringExtra("prenom");
        String mail   = getIntent().getStringExtra("mail");

        //  Affichage du message personnalisé
        String message = "Bienvenue " + nom + " " + prenom + ",\n"
                + "c’est la deuxième activité.\n"
                + "Vous serez bientôt contacté sur : " + mail + " ";

        txtWelcome.setText(message);
    }
}
