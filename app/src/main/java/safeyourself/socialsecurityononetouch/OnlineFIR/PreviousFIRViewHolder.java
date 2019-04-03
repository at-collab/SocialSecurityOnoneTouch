package safeyourself.socialsecurityononetouch.OnlineFIR;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import safeyourself.socialsecurityononetouch.R;

public class PreviousFIRViewHolder extends RecyclerView.ViewHolder {

    TextView addressPre, cnicPre, complainPre, contactPre, namePre ;

    public PreviousFIRViewHolder(View itemView) {
        super(itemView);

        addressPre = itemView.findViewById(R.id.address_previous);
        cnicPre = itemView.findViewById(R.id.cnic_previous);
        complainPre = itemView.findViewById(R.id.complain_previous);
        contactPre = itemView.findViewById(R.id.contact_previous);
        namePre = itemView.findViewById(R.id.name_previous);

    }
}
