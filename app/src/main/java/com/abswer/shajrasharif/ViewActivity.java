package com.abswer.shajrasharif;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.google.android.material.navigation.NavigationView;

public class ViewActivity extends AppCompatActivity {

    PDFView myPDFViewer;
    LottieAnimationView lottieAnimationView;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Intent intent;
    ImageView imageMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        drawerLayout = findViewById(R.id.drawerId);
        navigationView = findViewById(R.id.navmenuId);


        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.homeId) {
                    intent = new Intent(ViewActivity.this, MainActivity.class);
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




        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);
        lottieAnimationView = findViewById(R.id.animationViewId);
        myPDFViewer.setVisibility(View.INVISIBLE);
        lottieAnimationView.setVisibility(View.VISIBLE);
        String getItem = getIntent().getStringExtra("buttonName");

        if (getItem.equals("button_1")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(0,1)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_2")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_3")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(17,18)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_4")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(19,20,21)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_5")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(22,23)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_6")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(24,25,26,27)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_7")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(28)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_8")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(29,30)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_9")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(31)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_10")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(32,33)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_11")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(34)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_12")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(35)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_13")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(36,37)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_14")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(38)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_15")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(39)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_16")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(40,41,42,43,44)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_17")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(45,46,47,48)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_18")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(49,50,51)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_19")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(52)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_20")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(53,54,55,56)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_21")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(57)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_22")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(58,59,60,61)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_23")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(62,63,64)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_24")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(65,66,67,68,69)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_25")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(70,71)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_26")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(72,73)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_27")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(74,75,76,77,78)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }

        if (getItem.equals("button_28")){
            myPDFViewer.fromAsset("book.pdf")
                    .onLoad(new OnLoadCompleteListener() {

                        @Override
                        public void loadComplete(int nbPages) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    myPDFViewer.setVisibility(View.VISIBLE);
                                    lottieAnimationView.setVisibility(View.GONE);
                                }
                            }, 2000);
                        }
                    })
                    .pages(79,80,81) .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(3)
                    .enableDoubletap(false)
                    .enableAntialiasing(true)
                    .load();

        }



    }



}
