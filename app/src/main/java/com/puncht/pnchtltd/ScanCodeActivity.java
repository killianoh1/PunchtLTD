package com.puncht.pnchtltd;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import net.glxn.qrgen.android.QRCode;
import net.glxn.qrgen.core.scheme.VCard;

public class ScanCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_code);



        VCard killian = new VCard("QRCode1")


                .setTitle("Code scanned, Thank you!");

        Bitmap myBitmap = QRCode.from(killian).withSize(250, 250).bitmap();
        ImageView myImage = (ImageView) findViewById(R.id.imageView);
        myImage.setImageBitmap(myBitmap);
        myBitmap=QRCode.from(killian)
                .withColor(0xFFFF0000, 0xFFFFFFAA).bitmap();


        VCard zuha = new VCard("QRCode2")


                .setTitle("Code scanned, Thank you!");

        Bitmap myBitmap2 = QRCode.from(zuha).withSize(250, 250).bitmap();
        ImageView myImage2 = (ImageView) findViewById(R.id.imageView2);
        myImage2.setImageBitmap(myBitmap);
        myBitmap2=QRCode.from(zuha)
                .withColor(0xFFFF0000, 0xFFFFFFAA).bitmap();
    }
}
