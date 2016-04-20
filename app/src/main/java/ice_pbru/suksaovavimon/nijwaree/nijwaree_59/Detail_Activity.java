package ice_pbru.suksaovavimon.nijwaree.nijwaree_59;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ICE on 20/4/2559.
 */
public class Detail_Activity extends AppCompatActivity{

    private TextView titleTextView, detailTextView;
    private ImageView comImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // bind widget
        bindWidget();

        // Show view
        showView();
    }

    private void showView() {
        String strTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Image", R.drawable.computerrrr);
        int intIndex = getIntent().getIntExtra("Index", 0);

        titleTextView.setText(strTitle);
        comImageView.setImageResource(intIcon);

        String[] strDetail = getResources().getStringArray(R.array.com_detail);
        detailTextView.setText(strDetail[intIndex]);
    }

    private void bindWidget() {
        titleTextView = findViewById(R.id.textView4);



    }
}
