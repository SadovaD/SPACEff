 package com.example.space;

 import static android.view.animation.AnimationUtils.loadAnimation;

 import android.app.Activity;
 import android.media.MediaPlayer;
 import android.os.Bundle;
 import android.view.View;
 import android.view.animation.Animation;
 import android.widget.Button;
 import android.widget.ImageView;
 import android.widget.TextView;

 public class Story extends Activity {
     public volatile int l = 0;
     int c = 0;

     Basic_Text text1 = new Basic_Text();
     Button[] b = new Button[17];
     TextView[] t =  new TextView[42];
     ImageView[] d = new ImageView[17];
     MediaPlayer mySong;


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         mySong = MediaPlayer.create(Story.this,R.raw.watr);
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
             for (l = 0; l <= 54; l++) {
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
                     Thread.sleep(17);
                 } catch (InterruptedException e) {
                     break;
                 }
             } while (l < 54);
         }
     }
     void init() {

         setContentView(R.layout.story);

         for(int i=0; i<b.length; i++) {
                 String buttonID = "button" + (i+1);
                 int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                 b[i] = findViewById(resID);
                 b[i].setVisibility(View.INVISIBLE);
         }
         for(int i=0; i<d.length; i++) {
             String buttonID = "imageView" + (i+1);
             int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
             d[i] = findViewById(resID);
             d[i].setVisibility(View.INVISIBLE);
         }
         for(int i=0; i<t.length; i++) {
             int g = 0;
             String textvID = "textView" + (i+1);
             int resID = getResources().getIdentifier(textvID, "id", getPackageName());
             t[i] = findViewById(resID);
             t[i].setText(text1.scenario[i][g]);
             t[i].setVisibility(View.INVISIBLE);
         }
         }

         private void update() {
             if (c == l) return;
             c = l;
             runOnUiThread(new Runnable() {
                 @Override
                 public void run() {

                     Animation textAnim1000 = loadAnimation(getApplicationContext(), R.anim.alpha1);

                     Animation textAnim1 = loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim2 = loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim3 = loadAnimation(getApplicationContext(), R.anim.alpha4);
                     Animation textAnim4 = loadAnimation(getApplicationContext(), R.anim.alpha5);
                     Animation textAnim5 = loadAnimation(getApplicationContext(), R.anim.alpha6);
                     Animation textAnim6 = loadAnimation(getApplicationContext(), R.anim.alpha6);
                     Animation textAnim7 = loadAnimation(getApplicationContext(), R.anim.alpha6);
                     Animation textAnim8 = loadAnimation(getApplicationContext(), R.anim.alpha7);
                     Animation textAnim9 = loadAnimation(getApplicationContext(), R.anim.alpha8);
                     Animation textAnim10 = loadAnimation(getApplicationContext(), R.anim.alpha9);
                     Animation textAnim11 = loadAnimation(getApplicationContext(), R.anim.alpha9);
                     Animation textAnim12 = loadAnimation(getApplicationContext(), R.anim.alpha11);
                     Animation textAnim13 = loadAnimation(getApplicationContext(), R.anim.alpha12);
                     Animation textAnim14 = loadAnimation(getApplicationContext(), R.anim.alpha13);
                     Animation textAnim15 = loadAnimation(getApplicationContext(), R.anim.alpha13);
                     Animation textAnim16 = loadAnimation(getApplicationContext(), R.anim.alpha13);
                     Animation textAnim17 = loadAnimation(getApplicationContext(), R.anim.alpha14);
                     Animation textAnim18 = loadAnimation(getApplicationContext(), R.anim.alpha15);
                     Animation textAnim19 = loadAnimation(getApplicationContext(), R.anim.alpha16);
                     Animation textAnim20 = loadAnimation(getApplicationContext(), R.anim.alpha16);
                     Animation textAnim21 = loadAnimation(getApplicationContext(), R.anim.alpha17);
                     Animation textAnim22 = loadAnimation(getApplicationContext(), R.anim.alpha17);
                     Animation textAnim23 = loadAnimation(getApplicationContext(), R.anim.alpha18);
                     Animation textAnim24 = loadAnimation(getApplicationContext(), R.anim.alpha19);
                     Animation textAnim25 = loadAnimation(getApplicationContext(), R.anim.alpha20);
                     Animation textAnim26 = loadAnimation(getApplicationContext(), R.anim.alpha21);
                     Animation textAnim27 = loadAnimation(getApplicationContext(), R.anim.alpha21);
                     Animation textAnim28 = loadAnimation(getApplicationContext(), R.anim.alpha22);
                     Animation textAnim29 = loadAnimation(getApplicationContext(), R.anim.alpha22);

                     Animation butAnim = loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation butAnim2 = loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation butAnim3 = loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation butAnim4 = loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation butAnim5 = loadAnimation(getApplicationContext(), R.anim.alpha14);
                     Animation butAnim6 = loadAnimation(getApplicationContext(), R.anim.alpha14);
                     Animation butAnim7 = loadAnimation(getApplicationContext(), R.anim.alpha15);
                     Animation butAnim8 = loadAnimation(getApplicationContext(), R.anim.alpha15);
                     Animation butAnim9 = loadAnimation(getApplicationContext(), R.anim.alpha17);
                     Animation butAnim10 = loadAnimation(getApplicationContext(), R.anim.alpha17);
                     Animation butAnim11 = loadAnimation(getApplicationContext(), R.anim.alpha18);
                     Animation butAnim12 = loadAnimation(getApplicationContext(), R.anim.alpha18);
                     Animation butAnim13 = loadAnimation(getApplicationContext(), R.anim.alpha19);
                     Animation butAnim14 = loadAnimation(getApplicationContext(), R.anim.alpha19);
                     Animation butAnim15 = loadAnimation(getApplicationContext(), R.anim.alpha20);
                     Animation butAnim16 = loadAnimation(getApplicationContext(), R.anim.alpha20);
                     Animation butAnim17 = loadAnimation(getApplicationContext(), R.anim.alpha20);

                     Animation imageAnim1 = loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation imageAnim2 = loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation imageAnim3 = loadAnimation(getApplicationContext(), R.anim.alpha4);
                     Animation imageAnim4 = loadAnimation(getApplicationContext(), R.anim.alpha5);
                     Animation imageAnim5 = loadAnimation(getApplicationContext(), R.anim.alpha6);
                     Animation imageAnim6 = loadAnimation(getApplicationContext(), R.anim.alpha6);
                     Animation imageAnim7 = loadAnimation(getApplicationContext(), R.anim.alpha7);
                     Animation imageAnim8 = loadAnimation(getApplicationContext(), R.anim.alpha9);
                     Animation imageAnim9 = loadAnimation(getApplicationContext(), R.anim.alpha11);
                     Animation imageAnim10 = loadAnimation(getApplicationContext(), R.anim.alpha13);
                     Animation imageAnim11 = loadAnimation(getApplicationContext(), R.anim.alpha13);
                     Animation imageAnim12 = loadAnimation(getApplicationContext(), R.anim.alpha16);
                     Animation imageAnim13 = loadAnimation(getApplicationContext(), R.anim.alpha17);
                     Animation imageAnim14 = loadAnimation(getApplicationContext(), R.anim.alpha17);
                     Animation imageAnim15 = loadAnimation(getApplicationContext(), R.anim.alpha20);
                     Animation imageAnim16 = loadAnimation(getApplicationContext(), R.anim.alpha21);
                     Animation imageAnim17 = loadAnimation(getApplicationContext(), R.anim.alpha22);

                          for (int i = 0; i < d.length; i++) {
                         {
                             String buttonID = "imageView" + (i + 1);
                             int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                             d[i] = (findViewById(resID));
                            }
                         }
                         for (int i = 0; i < b.length; i++) {
                             {
                                 String buttonID = "button" + (i + 1);
                                 int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                                 b[i] = (findViewById(resID));
                             }
                         }
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
                                 t[0].startAnimation(textAnim1);
                                 break;
                             case 2:
                                 d[0].setVisibility(View.VISIBLE);
                                 d[0].startAnimation(imageAnim1);
                                 break;
                             case 3:
                                 b[0].setVisibility(View.VISIBLE);
                                 b[0].startAnimation(butAnim);
                                 b[0].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[1].setVisibility(View.VISIBLE);
                                             t[1].startAnimation(textAnim1000);
                                             t[2].setVisibility(View.GONE);
                                         } catch (Exception ignored) {
                                         }
                                     }
                                 });
                                 b[1].setVisibility(View.VISIBLE);
                                 b[1].startAnimation(butAnim2);
                                 b[1].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[2].setVisibility(View.VISIBLE);
                                             t[2].startAnimation(textAnim1000);
                                             t[1].setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 4:
                                 t[3].setVisibility(View.VISIBLE);
                                 t[3].startAnimation(textAnim2);
                                 break;
                             case 5:
                                 d[1].setVisibility(View.VISIBLE);
                                 d[1].startAnimation(imageAnim2);
                                 break;
                             case 6:
                                 b[2].setVisibility(View.VISIBLE);
                                 b[2].startAnimation(butAnim3);
                                 b[3].setVisibility(View.VISIBLE);
                                 b[3].startAnimation(butAnim4);
                                 b[2].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[4].setVisibility(View.VISIBLE);
                                             t[4].startAnimation(textAnim1000);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[3].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[4].setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 7:
                                 t[5].setVisibility(View.VISIBLE);
                                 t[5].startAnimation(textAnim3);
                                 break;
                             case 8:
                                 d[2].setVisibility(View.VISIBLE);
                                 d[2].startAnimation(imageAnim3);
                                 break;
                             case 9:
                                 t[6].setVisibility(View.VISIBLE);
                                 t[6].startAnimation(textAnim4);
                                 break;
                             case 10:
                                 d[3].setVisibility(View.VISIBLE);
                                 d[3].startAnimation(imageAnim4);
                                 break;
                             case 11:
                                 b[4].setVisibility(View.VISIBLE);
                                 b[4].startAnimation(butAnim5);
                                 b[5].setVisibility(View.VISIBLE);
                                 b[5].startAnimation(butAnim6);
                                 b[4].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[7].setVisibility(View.VISIBLE);
                                             t[7].startAnimation(textAnim1000);
                                             t[8].setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[5].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[8].setVisibility(View.VISIBLE);
                                             t[8].startAnimation(textAnim1000);
                                             t[7].setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 12:
                                 t[9].setVisibility(View.VISIBLE);
                                 t[9].startAnimation(textAnim5);
                                 break;
                             case 13:
                                 d[4].setVisibility(View.VISIBLE);
                                 d[4].startAnimation(imageAnim5);
                                 break;
                             case 14:
                                 t[10].setVisibility(View.VISIBLE);
                                 t[10].startAnimation(textAnim6);
                                 break;
                             case 15:
                                 t[11].setVisibility(View.VISIBLE);
                                 t[11].startAnimation(textAnim7);
                                 break;
                             case 16:
                                 d[5].setVisibility(View.VISIBLE);
                                 d[5].startAnimation(imageAnim6);
                                 break;
                             case 17:
                                 t[12].setVisibility(View.VISIBLE);
                                 t[12].startAnimation(textAnim8);
                                 break;
                             case 18:
                                 d[6].setVisibility(View.VISIBLE);
                                 d[6].startAnimation(imageAnim7);
                                 break;
                             case 19:
                                 t[13].setVisibility(View.VISIBLE);
                                 t[13].startAnimation(textAnim9);
                                 break;
                             case 20:
                                 t[14].setVisibility(View.VISIBLE);
                                 t[14].startAnimation(textAnim10);
                                 break;
                             case 21:
                                 t[15].setVisibility(View.VISIBLE);
                                 t[15].startAnimation(textAnim11);
                                 break;
                             case 22:
                                 d[7].setVisibility(View.VISIBLE);
                                 d[7].startAnimation(imageAnim8);
                                 break;
                             case 23:
                                 t[16].setVisibility(View.VISIBLE);
                                 t[16].startAnimation(textAnim12);
                                 break;
                             case 24:
                                 d[8].setVisibility(View.VISIBLE);
                                 d[8].startAnimation(imageAnim9);
                                 break;
                             case 25:
                                 t[17].setVisibility(View.VISIBLE);
                                 t[17].startAnimation(textAnim13);
                                 break;
                             case 26:
                                 t[18].setVisibility(View.VISIBLE);
                                 t[18].startAnimation(textAnim14);
                                 break;
                             case 27:
                                 t[19].setVisibility(View.VISIBLE);
                                 t[19].startAnimation(textAnim15);
                                 break;
                             case 28:
                                 d[9].setVisibility(View.VISIBLE);
                                 d[9].startAnimation(imageAnim10);
                                 break;
                             case 29:
                                 t[20].setVisibility(View.VISIBLE);
                                 t[20].startAnimation(textAnim16);
                                 break;
                             case 30:
                                 d[10].setVisibility(View.VISIBLE);
                                 d[10].startAnimation(imageAnim11);
                                 break;
                             case 31:
                                 t[21].setVisibility(View.VISIBLE);
                                 t[21].startAnimation(textAnim17);
                                 break;
                             case 32:
                                 b[6].setVisibility(View.VISIBLE);
                                 b[6].startAnimation(butAnim7);
                                 b[7].setVisibility(View.VISIBLE);
                                 b[7].startAnimation(butAnim8);
                                 b[6].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[22].setVisibility(View.VISIBLE);
                                             t[22].startAnimation(textAnim1000);
                                             t[23].setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[7].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[23].setVisibility(View.VISIBLE);
                                             t[23].startAnimation(textAnim1000);
                                             t[22].setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 33:
                                 t[24].setVisibility(View.VISIBLE);
                                 t[24].startAnimation(textAnim18);
                                 break;
                             case 34:
                                 b[8].setVisibility(View.VISIBLE);
                                 b[8].startAnimation(butAnim9);
                                 b[9].setVisibility(View.VISIBLE);
                                 b[9].startAnimation(butAnim10);
                                 b[8].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[25].setVisibility(View.VISIBLE);
                                             t[25].startAnimation(textAnim1000);
                                             t[27].setVisibility(View.VISIBLE);
                                             t[27].startAnimation(textAnim1000);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[9].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[25].setVisibility(View.GONE);
                                             t[27].setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 35:
                                 t[26].setVisibility(View.VISIBLE);
                                 t[26].startAnimation(textAnim19);
                                 break;
                             case 36:
                                 d[11].setVisibility(View.VISIBLE);
                                 d[11].startAnimation(imageAnim12);
                                 break;
                             case 37:
                                 t[28].setVisibility(View.VISIBLE);
                                 t[28].startAnimation(textAnim20);
                                 break;
                             case 38:
                                 t[29].setVisibility(View.VISIBLE);
                                 t[29].startAnimation(textAnim21);
                                 break;
                             case 39:
                                 d[12].setVisibility(View.VISIBLE);
                                 d[12].startAnimation(imageAnim13);
                                 break;
                             case 40:
                                 t[30].setVisibility(View.VISIBLE);
                                 t[30].startAnimation(textAnim22);
                                 break;
                             case 41:
                                 d[13].setVisibility(View.VISIBLE);
                                 d[13].startAnimation(imageAnim14);
                                 break;
                             case 42:
                                 b[10].setVisibility(View.VISIBLE);
                                 b[10].startAnimation(butAnim11);
                                 b[11].setVisibility(View.VISIBLE);
                                 b[11].startAnimation(butAnim12);
                                 b[10].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[31].setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[11].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[31].setVisibility(View.VISIBLE);
                                             t[31].startAnimation(textAnim1000);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 43:
                                 t[32].setVisibility(View.VISIBLE);
                                 t[32].startAnimation(textAnim23);
                                 break;
                             case 44:
                                 b[12].setVisibility(View.VISIBLE);
                                 b[12].startAnimation(butAnim13);
                                 b[13].setVisibility(View.VISIBLE);
                                 b[13].startAnimation(butAnim14);
                                 b[12].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[33].setVisibility(View.VISIBLE);
                                             t[33].startAnimation(textAnim1000);
                                             t[34].setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[13].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[34].setVisibility(View.VISIBLE);
                                             t[34].startAnimation(textAnim1000);
                                             t[33].setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 45:
                                 t[35].setVisibility(View.VISIBLE);
                                 t[35].startAnimation(textAnim24);
                                 break;
                             case 46:
                                 b[14].setVisibility(View.VISIBLE);
                                 b[14].startAnimation(butAnim15);
                                 b[15].setVisibility(View.VISIBLE);
                                 b[15].startAnimation(butAnim16);
                                 b[16].setVisibility(View.VISIBLE);
                                 b[16].startAnimation(butAnim17);
                                 b[14].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[36].setVisibility(View.VISIBLE);
                                             t[36].startAnimation(textAnim1000);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[15].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[36].setVisibility(View.VISIBLE);
                                             t[36].startAnimation(textAnim1000);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[16].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             t[36].setVisibility(View.VISIBLE);
                                             t[36].startAnimation(textAnim1000);
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 47:
                                 t[37].setVisibility(View.VISIBLE);
                                 t[37].startAnimation(textAnim25);
                                 break;
                             case 48:
                                 d[14].setVisibility(View.VISIBLE);
                                 d[14].startAnimation(imageAnim15);
                                 break;
                             case 49:
                                 t[38].setVisibility(View.VISIBLE);
                                 t[38].startAnimation(textAnim26);
                                 break;
                             case 50:
                                 d[15].setVisibility(View.VISIBLE);
                                 d[15].startAnimation(imageAnim16);
                                 break;
                             case 51:
                                 t[39].setVisibility(View.VISIBLE);
                                 t[39].startAnimation(textAnim27);
                                 break;
                             case 52:
                                 t[40].setVisibility(View.VISIBLE);
                                 t[40].startAnimation(textAnim28);
                                 break;
                             case 53:
                                 d[16].setVisibility(View.VISIBLE);
                                 d[16].startAnimation(imageAnim17);
                                 break;
                             case 54:
                                 t[41].setVisibility(View.VISIBLE);
                                 t[41].startAnimation(textAnim29);
                                 break;
                         }
                     }
                 } );
     }
     protected void onPause(){
         super.onPause();
         mySong.release();
     }
 }



