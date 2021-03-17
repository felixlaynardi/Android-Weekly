package umn.ac.week07_28641;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button kameraVideo;
    private Button galeriVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kameraVideo = findViewById(R.id.kameraVideo);
        galeriVideo = findViewById(R.id.galeriVideo);


        kameraVideo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KameraVideo.class);
                startActivity(intent);
            }
        });
        galeriVideo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GaleriVideo.class);
                startActivity(intent);
            }
        });
    }
}