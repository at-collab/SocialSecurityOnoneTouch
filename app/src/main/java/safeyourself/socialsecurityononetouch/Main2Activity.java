package safeyourself.socialsecurityononetouch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import safeyourself.socialsecurityononetouch.OnlineFIR.OnlineFIR;

public class Main2Activity extends AppCompatActivity {

    CardView onlineFIR,crimeReporting, trafficUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        onlineFIR=(CardView) findViewById(R.id.onlineFIR);
        onlineFIR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Main2Activity.this,OnlineFIR.class);
                startActivity(i);

            }

    });

        crimeReporting=(CardView) findViewById(R.id.crimeReporting);
        crimeReporting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(i);
            }
        });
        trafficUpdate =(CardView) findViewById(R.id.trafficUpdates);
        trafficUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, MapsActivity.class);
                startActivity(i);
            }


        });
    }
}

