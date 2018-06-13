package com.goa.spotfix.govolunteer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    ImageView profilePicture;
    TextView username;
    TextView spotfixCreated;
    TextView spotfixAttended;
    TextView email;
    Button signOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        profilePicture = findViewById(R.id.profilePicture);
        username = findViewById(R.id.Username);
        spotfixCreated = findViewById(R.id.spotfixCreated);
        spotfixAttended = findViewById(R.id.spotfixAttended);
        email = findViewById(R.id.textViewEmail);
        signOut = findViewById(R.id.buttonSignOut);

        profilePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}
