package vaksys.in.seatbooking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton seatOne, seatTwo;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seatOne = (ToggleButton) findViewById(R.id.seatOne);
        seatTwo = (ToggleButton) findViewById(R.id.seatTwo);

        seatOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Seat one is book", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Seat one cancel", Toast.LENGTH_SHORT).show();
                }
            }
        });

        seatTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Seat two is book", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Seat two cancel", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
