package com.example.a2017270030_210922_10_1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondActivity7 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second7);

        Button btnGoGo = findViewById(R.id.btnGoGo);
        btnGoGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=VtCGHITZu_8");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        Button btnGoGo2 = findViewById(R.id.btnGoGo2);
        btnGoGo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri2 = Uri.parse("https://www.youtube.com/watch?v=qkQdIMW1xlw");
                Intent intent2 = new Intent(Intent.ACTION_VIEW,uri2);
                startActivity(intent2);
            }
        });
        Button btnGoGo3 = findViewById(R.id.btnGoGo3);
        btnGoGo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri3 = Uri.parse("https://www.youtube.com/watch?v=jj6ze_eqmYI");
                Intent intent3 = new Intent(Intent.ACTION_VIEW,uri3);
                startActivity(intent3);
            }
        });
        Button btnGoGo4 = findViewById(R.id.btnGoGo4);
        btnGoGo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri4 = Uri.parse("https://www.youtube.com/watch?v=oSXhsSUaXTU&list" +
                        "=PLBiHEzQDHfrjh86I8VHzonHyPDAY9II6N&index=7");
                Intent intent4 = new Intent(Intent.ACTION_VIEW,uri4);
                startActivity(intent4);
            }
        });
        Button btnGoGo5 = findViewById(R.id.btnGoGo5);
        btnGoGo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri5 = Uri.parse("https://www.youtube.com/watch?v=KXYi6bI-UPE&list" +
                        "=PLBiHEzQDHfrjh86I8VHzonHyPDAY9II6N&index=19");
                Intent intent5 = new Intent(Intent.ACTION_VIEW,uri5);
                startActivity(intent5);
            }
        });
        Button btnGoGo6 = findViewById(R.id.btnGoGo6);
        btnGoGo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri6 = Uri.parse("https://www.youtube.com/watch?v=DJPBglSOC88&list" +
                        "=PLBiHEzQDHfrjh86I8VHzonHyPDAY9II6N&index=3");
                Intent intent6 = new Intent(Intent.ACTION_VIEW,uri6);
                startActivity(intent6);
            }
        });
        Button btnGoGo7 = findViewById(R.id.btnGoGo7);
        btnGoGo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri7 = Uri.parse("https://www.youtube.com/watch?v=uTmsvZOAh5U&li" +
                        "st=PLBiHEzQDHfrjh86I8VHzonHyPDAY9II6N&index=8");
                Intent intent7 = new Intent(Intent.ACTION_VIEW,uri7);
                startActivity(intent7);
            }
        });
        Button btnGoGo8 = findViewById(R.id.btnGoGo8);
        btnGoGo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri8 = Uri.parse("https://www.youtube.com/watch?v=yka0VGRh1oc&list=P" +
                        "LBiHEzQDHfrjh86I8VHzonHyPDAY9II6N&index=17");
                Intent intent8 = new Intent(Intent.ACTION_VIEW,uri8);
                startActivity(intent8);
            }
        });
        Button btnGoGo9 = findViewById(R.id.btnGoGo9);
        btnGoGo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri9 = Uri.parse("https://www.youtube.com/watch?v=7SpV_ZJue68&list=PLBi" +
                        "HEzQDHfrjh86I8VHzonHyPDAY9II6N&index=21");
                Intent intent9 = new Intent(Intent.ACTION_VIEW,uri9);
                startActivity(intent9);
            }
        });
        Button btnGoGo10 = findViewById(R.id.btnGoGo10);
        btnGoGo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri10 = Uri.parse("https://www.youtube.com/watch?v=LK9e6mg4cmQ");
                Intent intent10 = new Intent(Intent.ACTION_VIEW,uri10);
                startActivity(intent10);
            }
        });
        Button btnGoGo11 = findViewById(R.id.btnGoGo11);
        btnGoGo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri11 = Uri.parse("https://www.youtube.com/watch?v=0L5gAT1fJaM");
                Intent intent11 = new Intent(Intent.ACTION_VIEW,uri11);
                startActivity(intent11);
            }
        });
        Button btnGoGo12 = findViewById(R.id.btnGoGo12);
        btnGoGo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri12 = Uri.parse("https://www.youtube.com/watch?v=gMaB-fG4u4g");
                Intent intent12 = new Intent(Intent.ACTION_VIEW,uri12);
                startActivity(intent12);
            }
        });
        Button btnGoGo13 = findViewById(R.id.btnGoGo9);
        btnGoGo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri13 = Uri.parse("https://www.youtube.com/watch?v=QqqZH3j_vH0");
                Intent intent13 = new Intent(Intent.ACTION_VIEW,uri13);
                startActivity(intent13);
            }
        });
        Button btnGoGo14 = findViewById(R.id.btnGoGo14);
        btnGoGo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri14 = Uri.parse("https://www.youtube.com/watch?v=PjGcOP-TQPE");
                Intent intent14 = new Intent(Intent.ACTION_VIEW,uri14);
                startActivity(intent14);
            }
        });
        Button btnGoGo15 = findViewById(R.id.btnGoGo15);
        btnGoGo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri15 = Uri.parse("https://www.youtube.com/watch?v=CTojmKLkWTo");
                Intent intent15 = new Intent(Intent.ACTION_VIEW,uri15);
                startActivity(intent15);
            }
        });
        Button btnGoGo16 = findViewById(R.id.btnGoGo16);
        btnGoGo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri16 = Uri.parse("https://www.youtube.com/watch?v=2Uv1B3kjCOI");
                Intent intent16 = new Intent(Intent.ACTION_VIEW,uri16);
                startActivity(intent16);
            }
        });
        Button btnGoGo17 = findViewById(R.id.btnGoGo17);
        btnGoGo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri17 = Uri.parse("https://www.youtube.com/watch?v=nOGT4lXlSHw");
                Intent intent17 = new Intent(Intent.ACTION_VIEW,uri17);
                startActivity(intent17);
            }
        });
        Button btnGoGo18 = findViewById(R.id.btnGoGo18);
        btnGoGo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=54tTYO-vU2E");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnGo = findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=XBVrElltXr8");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnGo2 = findViewById(R.id.btnGo2);
        btnGo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=sqC5a78NfQw");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnGo3 = findViewById(R.id.btnGo3);
        btnGo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=js8z5wIZ0wg");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnGo4 = findViewById(R.id.btnGo5);
        btnGo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=J4VDzPw2MK8");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnGo5 = findViewById(R.id.btnGo5);
        btnGo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=TBdRZiSHDwA");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnGo6 = findViewById(R.id.btnGo6);
        btnGo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=-V-Rdcn_ok8");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnGo7 = findViewById(R.id.btnGo7);
        btnGo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=Th2u76bWHnI");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnGo8 = findViewById(R.id.btnGo8);
        btnGo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=x8lFFXFuZ9U");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnGo9 = findViewById(R.id.btnGo9);
        btnGo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=QSZ0mUGO_CA");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });

        Button btnn = findViewById(R.id.btnn);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=j3rWWBlsJdo");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnn2 = findViewById(R.id.btnn2);
        btnn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=Avsqd_ZZ7LM");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnn3 = findViewById(R.id.btnn3);
        btnn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=uXOUG_VfS78");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnn4 = findViewById(R.id.btnn4);
        btnn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=3NlIO4PN-ic");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnn5 = findViewById(R.id.btnn5);
        btnn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=JpNW0HLSsIs");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnn6 = findViewById(R.id.btnn6);
        btnGo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=OGcw3gnFhsU");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnn7 = findViewById(R.id.btnn7);
        btnGo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=h7cZIEcqB10");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnn8 = findViewById(R.id.btnn8);
        btnn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=OGXmWvetAlo");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });
        Button btnn9 = findViewById(R.id.btnn9);
        btnn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri18 = Uri.parse("https://www.youtube.com/watch?v=Mb7aiodU7yM");
                Intent intent18 = new Intent(Intent.ACTION_VIEW,uri18);
                startActivity(intent18);
            }
        });




    }


}