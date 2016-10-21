package com.example.iuliu.aa;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by Iuliu on 2016-09-23.
 */
public class BeforeLogin extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

      /* create a full screen window */
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.before_login_activity);

    /* adapt the image to the size of the display */
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        Bitmap bmp = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(
                getResources(), R.drawable.active_ageing_image1),size.x,size.y,true);

    /* fill the background ImageView with the resized image */
        ImageView iv_background = (ImageView) findViewById(R.id.imageView);
        iv_background.setImageBitmap(bmp);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BeforeLogin.this, MainActivity.class);
                startActivity(intent);
                BeforeLogin.this.finish();}
        },3000);

    }
}
