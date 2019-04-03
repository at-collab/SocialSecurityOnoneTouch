package safeyourself.socialsecurityononetouch.OnlineFIR;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import safeyourself.socialsecurityononetouch.Common.Common;
import safeyourself.socialsecurityononetouch.DataBaseClasses.FIR;
import safeyourself.socialsecurityononetouch.R;

public class PreviousFIR extends AppCompatActivity {

    RecyclerView recyclerView;
    FirebaseDatabase database ;
    DatabaseReference reference;

    FirebaseRecyclerAdapter<FIR, PreviousFIRViewHolder> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_fir);

        recyclerView = findViewById(R.id.previousRecycle);

        database = FirebaseDatabase.getInstance();
        reference = database.getReference("FirTable");


        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        loadPreviousFIR();


    }

    private void loadPreviousFIR() {

        adapter = new FirebaseRecyclerAdapter<FIR, PreviousFIRViewHolder>(FIR.class,
                R.layout.previous_cardview,
                PreviousFIRViewHolder.class,
                reference.orderByChild("email").equalTo(Common.getCurrentUser())) {
            @Override
            protected void populateViewHolder(PreviousFIRViewHolder viewHolder, FIR model, int position) {
                viewHolder.namePre.setText(model.getFull_name());
                viewHolder.addressPre.setText(model.getAddress());
                viewHolder.complainPre.setText(model.getComplain());
                viewHolder.contactPre.setText(model.getContact());
                viewHolder.cnicPre.setText(model.getCnic());
            }
        };

        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
    }
}
