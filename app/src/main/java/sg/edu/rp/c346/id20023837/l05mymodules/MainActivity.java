package sg.edu.rp.c346.id20023837.l05mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvInfoC346;
    TextView tvInfoC203;
    TextView tvInfoC218;
    Button btnQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfoC346 = findViewById(R.id.textViewC346);
        tvInfoC203 = findViewById(R.id.textViewC203);
        tvInfoC218 = findViewById(R.id.textViewC218);
        btnQuit = findViewById(R.id.btnQuit);

        tvInfoC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("C346", "Module Code: C346\nModule Name: Android Programming\nAcademic Year: 2021\nSemester Year: 1\nModule Credit: 4\nVenue: E62E");
                startActivity(intent);
            }
        });

        tvInfoC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("C203", "Module Code: C203\nModule Name: Web AppIn Development in php\nAcademic Year: 2021\nSemester Year: 1\nModule Credit: 4\nVenue: W67N");
                startActivity(intent);
            }
        });

        tvInfoC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("C218", "Module Code: C218\nModule Name: UI/UX Design for Apps\nAcademic Year: 2021\nSemester Year: 1\nModule Credit: 4\nVenue: W64G");
                startActivity(intent);
            }
        });

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}