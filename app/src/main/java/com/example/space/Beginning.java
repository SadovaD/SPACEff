 package com.example.space;

 import android.app.Activity;
 import android.content.Intent;
 import android.media.MediaPlayer;
 import android.os.Bundle;
 import android.view.View;
 import android.view.animation.Animation;
 import android.view.animation.AnimationUtils;
 import android.widget.Button;
 import android.widget.TextView;

 public class Beginning extends Activity {
     public int l = 0;
     int c = 0;

     Background text1 = new Background();
     TextView[] t;
     Button button;
     MediaPlayer mySong;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         mySong = MediaPlayer.create(Beginning.this,R.raw.watr);
         mySong.start();

         init();

         Thread threadInterface = new Thread(new InterfaceUpdater());
         threadInterface.start();

         Thread threadTime = new Thread(new TextProgress());
         threadTime.start();

     }

     class TextProgress implements Runnable {
         @Override
         public void run() {
             for (l = 0; l <= 10; l++) {
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     break;
                 }
             }

         }
     }

     class InterfaceUpdater implements Runnable {
         @Override
         public void run() {
             do {
                 update();
                 try {
                     Thread.sleep(18);
                 } catch (InterruptedException e) {
                     break;
                 }
             } while (l < 10);
         }
     }

     void init() {
         setContentView(R.layout.beginning);
         t =  new TextView[8];
         for(int i=0; i<t.length; i++) {
             int g = 0;
             String textvID = "textView" + (i+1);
             int resID = getResources().getIdentifier(textvID, "id", getPackageName());
             t[i] = findViewById(resID);
             t[i].setText(text1.text_s[i][g]);
             t[i].setVisibility(View.INVISIBLE);
         }
         button = findViewById(R.id.button);

         button.setVisibility(View.INVISIBLE);
     }
     private void update () {
         if (c == l) return;
         c = l;
         runOnUiThread(new Runnable() {
             @Override
             public void run() {
                 Animation textAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha1);
                 t =  new TextView[8];
                 for (int h = 0; h < t.length; h++) {
                     {
                         String textvID = "textView" + (h + 1);
                         int resID_2 = getResources().getIdentifier(textvID, "id", getPackageName());
                         t[h] = (findViewById(resID_2));
                     }
                 }
                 switch (l) {
                     case 1:
                         t[0].setVisibility(View.VISIBLE);
                         t[0].startAnimation(textAnim);
                         break;
                     case 2:
                         t[1].setVisibility(View.VISIBLE);
                         t[1].startAnimation(textAnim);
                         break;
                     case 3:
                         t[2].setVisibility(View.VISIBLE);
                         t[2].startAnimation(textAnim);
                         break;
                     case 4:
                         t[3].setVisibility(View.VISIBLE);
                         t[3].startAnimation(textAnim);
                         break;
                     case 5:
                         t[4].setVisibility(View.VISIBLE);
                         t[4].startAnimation(textAnim);
                         break;
                     case 6:
                         t[5].setVisibility(View.VISIBLE);
                         t[5].startAnimation(textAnim);
                         break;
                     case 7:
                         t[6].setVisibility(View.VISIBLE);
                         t[6].startAnimation(textAnim);
                         break;
                     case 8:
                         t[7].setVisibility(View.VISIBLE);
                         t[7].startAnimation(textAnim);
                         break;
                     case 9:
                         button.setVisibility(View.VISIBLE);
                         button.startAnimation(textAnim);
                         button.setOnClickListener(new View.OnClickListener() {
                             @Override
                             public void onClick(View view) {
                                 try {
                                     Intent intent = new Intent(Beginning.this, Story.class);
                                     startActivity(intent);
                                 } catch (Exception e) {
                                     e.printStackTrace();
                                 }

                             }
                         });

                     default:
                         break;
                 }
             }
         });
     }
     protected void onPause(){
         super.onPause();
         mySong.release();
     }

 }

