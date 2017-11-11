package tdif.project1009;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView tvId,tvName,tvPass,tvAge,tvFres;
    float fres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        init();

    }

    private void init() {
        tvId = (TextView) findViewById(R.id.tvId);
        tvPass = (TextView) findViewById(R.id.tvPass);
        tvName = (TextView) findViewById(R.id.tvName);
        tvAge = (TextView) findViewById(R.id.tvAge);
        tvFres = (TextView) findViewById(R.id.tvFresult);
        Intent intent = getIntent();
        tvId.setText(intent.getStringExtra("id"));
        tvName.setText(intent.getStringExtra("name"));
        tvPass.setText(intent.getStringExtra("pass"));
        tvAge.setText(intent.getStringExtra("age"));
        fres = intent.getFloatExtra("fres",0);
        tvFres.setText(String.valueOf(fres));

    }
}
