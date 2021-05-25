package sg.edu.rp.c346.id20023837.l05mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvC346;
    Button btnBackC346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvC346 = findViewById(R.id.tvC346);
        btnBackC346 = findViewById(R.id.btnBackC346);

        Intent intentReceived = getIntent();
        String textReceived = intentReceived.getStringExtra("C346");
        tvC346.setText(textReceived);

        btnBackC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}