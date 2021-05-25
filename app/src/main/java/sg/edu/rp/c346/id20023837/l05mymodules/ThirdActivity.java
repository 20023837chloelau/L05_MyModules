package sg.edu.rp.c346.id20023837.l05mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvC203;
    Button btnBackC203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvC203 = findViewById(R.id.tvC203);
        btnBackC203 = findViewById(R.id.btnBackC203);

        Intent intentReceived = getIntent();
        String textReceived = intentReceived.getStringExtra("C203");
        tvC203.setText(textReceived);

        btnBackC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}