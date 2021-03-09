package umn.ac.week06_28641;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button propertyAnimation;
    private Button drawableAnimation;
    private Button physicsAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        propertyAnimation = (Button) findViewById(R.id.propertyAnimation);
        drawableAnimation = (Button) findViewById(R.id.drawableAnimation);
        physicsAnimation = (Button) findViewById(R.id.physicsAnimation);
        propertyAnimation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PropertyAnimation.class);
                startActivity(intent);
            }
        });
        drawableAnimation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, DrawableAnimation.class);
                startActivity(intent2);
            }
        });
        physicsAnimation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, PhysicsAnimation.class);
                startActivity(intent3);
            }
        });


    }


}