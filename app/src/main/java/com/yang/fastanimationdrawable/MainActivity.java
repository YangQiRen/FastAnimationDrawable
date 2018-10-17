package com.yang.fastanimationdrawable;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{

    private static Context mContext;

    ImageView imageView;
    Button button;

    boolean start = false;

    AnimationsContainer.FramesSequenceAnimation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( animation == null ) {
                    animation = AnimationsContainer.getInstance(R.array.bullet_anim, 12, true).createProgressDialogAnim(imageView);
                }

                if ( switchBtn() ) {
                    animation.start();
                } else {
                    animation.stop();
                }

            }
        });

    }

    public static Context getAppContext() {
        return MainActivity.mContext;
    }

    //控制开关
    private boolean switchBtn(){
        start = !start;

        button.setText(!start ? "START" : "STOP");
        return start;
    }
}
