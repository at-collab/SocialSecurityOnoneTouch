package safeyourself.socialsecurityononetouch.OnlineFIR;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import safeyourself.socialsecurityononetouch.R;

public class OnlineFIR extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_fir);

    }

    public void previous_fir(View view){
        startActivity(new Intent(OnlineFIR.this, PreviousFIR.class));
    }

    public void new_fir(View view){
            startActivity(new Intent(OnlineFIR.this, Main4Activity.class));
    }



}
