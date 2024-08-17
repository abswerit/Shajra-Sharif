package com.abswer.shajrasharif;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    ImageView imageMenu;
    private Button button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_10, button_11, button_12, button_13, button_14, button_15, button_16, button_17, button_18, button_19, button_20, button_21, button_22, button_23, button_24, button_25, button_26, button_27, button_28;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout = findViewById(R.id.drawerId);
        navigationView = findViewById(R.id.navmenuId);


        toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.homeId) {
                    intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                if (item.getItemId() == R.id.shareId) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    String subject = "Share this app";
                    String body = "আস-সালামু আলাইকুম ওয়া-রাহমাতুল্লাহি ওয়া-বারাকাতু, হে প্রিয় মুসলিম ভাইবোন! শাজরা শরীফ অ্যাপ্সটি প্লেস্টোর থেকে বিনামূল্যে ডাউনলোড করতে পারবেন। নিচের লিংকে ক্লিক করে তারপর ইন্সটল করুন https://play.google.com/store/apps/details?id=com.abswer.shajrasharif";
                    intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                    intent.putExtra(Intent.EXTRA_TEXT, body);
                    startActivity(Intent.createChooser(intent, "Share with"));
                }
                if (item.getItemId() == R.id.rateId) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.abswer.shajrasharif"));
                    startActivity(intent);
                }
                if (item.getItemId() == R.id.privacyId) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.abswer.com/p/privacy-policy-for-shajra-sharif.html"));
                    startActivity(intent);
                }
                if (item.getItemId() == R.id.moreappsId) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=6366150173205547249"));
                    startActivity(intent);
                }


                return false;
            }
        });

        imageMenu = findViewById(R.id.imageMenu);
        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });




        button_1 = findViewById(R.id.button_1Id);
        button_2 = findViewById(R.id.button_2Id);
        button_3 = findViewById(R.id.button_3Id);
        button_4 = findViewById(R.id.button_4Id);
        button_5 = findViewById(R.id.button_5Id);
        button_6 = findViewById(R.id.button_6Id);
        button_7 = findViewById(R.id.button_7Id);
        button_8 = findViewById(R.id.button_8Id);
        button_9 = findViewById(R.id.button_9Id);
        button_10 = findViewById(R.id.button_10Id);
        button_11 = findViewById(R.id.button_11Id);
        button_12 = findViewById(R.id.button_12Id);
        button_13 = findViewById(R.id.button_13Id);
        button_14 = findViewById(R.id.button_14Id);
        button_15 = findViewById(R.id.button_15Id);
        button_16 = findViewById(R.id.button_16Id);
        button_17 = findViewById(R.id.button_17Id);
        button_18 = findViewById(R.id.button_18Id);
        button_19 = findViewById(R.id.button_19Id);
        button_20 = findViewById(R.id.button_20Id);
        button_21 = findViewById(R.id.button_21Id);
        button_22 = findViewById(R.id.button_22Id);
        button_23 = findViewById(R.id.button_23Id);
        button_24 = findViewById(R.id.button_24Id);
        button_25 = findViewById(R.id.button_25Id);
        button_26 = findViewById(R.id.button_26Id);
        button_27 = findViewById(R.id.button_27Id);
        button_28 = findViewById(R.id.button_28Id);


        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_10.setOnClickListener(this);
        button_11.setOnClickListener(this);
        button_12.setOnClickListener(this);
        button_13.setOnClickListener(this);
        button_14.setOnClickListener(this);
        button_15.setOnClickListener(this);
        button_16.setOnClickListener(this);
        button_17.setOnClickListener(this);
        button_18.setOnClickListener(this);
        button_19.setOnClickListener(this);
        button_20.setOnClickListener(this);
        button_21.setOnClickListener(this);
        button_22.setOnClickListener(this);
        button_23.setOnClickListener(this);
        button_24.setOnClickListener(this);
        button_25.setOnClickListener(this);
        button_26.setOnClickListener(this);
        button_27.setOnClickListener(this);
        button_28.setOnClickListener(this);



    }
    @Override
    public void onClick(View view){

        if (view.getId()==R.id.button_1Id){
        intent = new Intent(MainActivity.this,ViewActivity.class);
        intent.putExtra("buttonName","button_1");
        startActivity(intent);}

        if (view.getId()==R.id.button_2Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_2");
            startActivity(intent);}

        if (view.getId()==R.id.button_3Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_3");
            startActivity(intent);}

        if (view.getId()==R.id.button_4Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_4");
            startActivity(intent);}

        if (view.getId()==R.id.button_5Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_5");
            startActivity(intent);}

        if (view.getId()==R.id.button_6Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_6");
            startActivity(intent);}

        if (view.getId()==R.id.button_7Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_7");
            startActivity(intent);}

        if (view.getId()==R.id.button_8Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_8");
            startActivity(intent);}

        if (view.getId()==R.id.button_9Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_9");
            startActivity(intent);}

        if (view.getId()==R.id.button_10Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_10");
            startActivity(intent);}

        if (view.getId()==R.id.button_11Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_11");
            startActivity(intent);}

        if (view.getId()==R.id.button_12Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_12");
            startActivity(intent);}

        if (view.getId()==R.id.button_13Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_13");
            startActivity(intent);}

        if (view.getId()==R.id.button_14Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_14");
            startActivity(intent);}

        if (view.getId()==R.id.button_15Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_15");
            startActivity(intent);}

        if (view.getId()==R.id.button_16Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_16");
            startActivity(intent);}

        if (view.getId()==R.id.button_17Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_17");
            startActivity(intent);}

        if (view.getId()==R.id.button_18Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_18");
            startActivity(intent);}

        if (view.getId()==R.id.button_19Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_19");
            startActivity(intent);}

        if (view.getId()==R.id.button_20Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_20");
            startActivity(intent);}

        if (view.getId()==R.id.button_21Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_21");
            startActivity(intent);}

        if (view.getId()==R.id.button_22Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_22");
            startActivity(intent);}

        if (view.getId()==R.id.button_23Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_23");
            startActivity(intent);}

        if (view.getId()==R.id.button_24Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_24");
            startActivity(intent);}

        if (view.getId()==R.id.button_25Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_25");
            startActivity(intent);}

        if (view.getId()==R.id.button_26Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_26");
            startActivity(intent);}

        if (view.getId()==R.id.button_27Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_27");
            startActivity(intent);}

        if (view.getId()==R.id.button_28Id){
            intent = new Intent(MainActivity.this,ViewActivity.class);
            intent.putExtra("buttonName","button_28");
            startActivity(intent);}
}

@Override
public void onBackPressed() {

    AlertDialog.Builder alertDialogBuilder;
    alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
    alertDialogBuilder.setIcon(R.drawable.ic_exit);
    alertDialogBuilder.setTitle(R.string.exit_title);
    alertDialogBuilder.setMessage(R.string.exit_message);
    alertDialogBuilder.setCancelable(false);

    alertDialogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            finish();
        }
    });

    alertDialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    });

    AlertDialog alertDialog = alertDialogBuilder.create();
    alertDialog.show();
}








}