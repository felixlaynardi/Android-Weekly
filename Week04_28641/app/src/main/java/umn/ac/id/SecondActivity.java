package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button chTulisan;
    private EditText tulisan;
    private TextView initText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        chTulisan = findViewById(R.id.chTulisan);
        tulisan = findViewById(R.id.tulisan);
        initText = findViewById(R.id.initText);

        chTulisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tulisan_edit;
                if(tulisan.getText().length() == 0){
                    tulisan_edit = "";
                }
                else{
                    tulisan_edit = tulisan.getText().toString();
                }
                initText.setText(String.valueOf(tulisan_edit));
            }
        });
    }
}