package safeyourself.socialsecurityononetouch.OnlineFIR;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import safeyourself.socialsecurityononetouch.Common.Common;
import safeyourself.socialsecurityononetouch.DataBaseClasses.FIR;
import safeyourself.socialsecurityononetouch.Main2Activity;
import safeyourself.socialsecurityononetouch.R;

public class Main4Activity extends AppCompatActivity {


    EditText nameC,emailC,address,cnic,comp,phone;
    Button enter;
    FirebaseDatabase database ;
    DatabaseReference fir_table;
    FIR obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);






        nameC = (EditText)findViewById(R.id.name_com);
        address = (EditText)findViewById(R.id.address_com);
        cnic = (EditText)findViewById(R.id.cnic_com);
        comp = (EditText)findViewById(R.id.com_com);
        phone = (EditText)findViewById(R.id.contact_com);

        enter = (Button)findViewById(R.id.submit_com);

        database =FirebaseDatabase.getInstance();
        fir_table = database.getReference("FirTable");


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nameC.getText().toString().isEmpty()  || address.getText().toString().isEmpty()
                        || cnic.getText().toString().isEmpty() || comp.getText().toString().isEmpty() || phone.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), " Please fill full fields", Toast.LENGTH_LONG).show();
                }
                else {

                    obj =new FIR();
                    obj.setFull_name(nameC.getText().toString());
                    obj.setAddress(address.getText().toString());
                    obj.setCnic(cnic.getText().toString());
                    obj.setComplain(comp.getText().toString());
                    obj.setContact(phone.getText().toString());



                        obj.setEmail(Common.getCurrentUser());
                        fir_table.push().setValue(obj);
                        Toast.makeText(getApplicationContext(), " Save Table", Toast.LENGTH_LONG).show();                        Intent i = new Intent(Main4Activity.this,OnlineFIR.class);
                        startActivity(i);



                }
            }
        });



    }


}
