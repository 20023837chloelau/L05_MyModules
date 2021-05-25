package sg.edu.rp.c346.id20023837.l05mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvC218;
    Button btnBackC218;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvC218 = findViewById(R.id.tvC218);
        btnBackC218 = findViewById(R.id.btnBackC218);

        Intent intentReceived = getIntent();
        String textReceived = intentReceived.getStringExtra("C218");
        tvC218.setText(textReceived);

        btnBackC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}