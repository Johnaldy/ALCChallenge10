package com.example.alcchallenge10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.alcchallenge10.Socials.JohnFacebook;
import com.example.alcchallenge10.Socials.JohnGithub;
import com.example.alcchallenge10.Socials.JohnInstagram;
import com.example.alcchallenge10.Socials.JohnLinkedin;
import com.example.alcchallenge10.Socials.JohnTwitter;

public class MeetJohnaldy extends AppCompatActivity {
    ImageButton facebookbtn, twitterbtn, instagrambtn, linkendinbtn, githubbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_johnaldy);
        this.setTitle("JohnAldy Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        facebookbtn = findViewById(R.id.facebook);
        twitterbtn = findViewById(R.id.twitter);
        instagrambtn = findViewById(R.id.instagram);
        linkendinbtn = findViewById(R.id.linkedin);
        githubbtn = findViewById(R.id.github);

        facebookbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFacebook = new Intent(MeetJohnaldy.this, JohnFacebook.class);
                startActivity(intentFacebook);
            }
        });

        twitterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTwitter = new Intent(MeetJohnaldy.this, JohnTwitter.class);
                startActivity(intentTwitter);
            }
        });


        instagrambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentInstagram = new Intent(MeetJohnaldy.this, JohnInstagram.class);
                startActivity(intentInstagram);
            }
        });


        linkendinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLinkedin = new Intent(MeetJohnaldy.this, JohnLinkedin.class);
                startActivity(intentLinkedin);
            }
        });

        githubbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGithub = new Intent(MeetJohnaldy.this, JohnGithub.class);
                startActivity(intentGithub);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
