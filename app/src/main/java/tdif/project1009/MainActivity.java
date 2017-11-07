package tdif.project1009;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etId, etName, etAge, etPass, etF1, etF2;
    Button btAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        etId = (EditText) findViewById(R.id.etId);
        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etPass = (EditText) findViewById(R.id.etPass);
        etF1 = (EditText) findViewById(R.id.etF1);
        etF2 = (EditText) findViewById(R.id.etF2);
        btAdd = (Button) findViewById(R.id.btAdd);
        btAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btAdd){
            Bundle bundle = new Bundle();
            bundle.putString("id",etId.getText().toString());
            Intent intent = new Intent(MainActivity.this,ResultActivity.class);
            //intent.putExtra("id",etId.getText().toString());
            //Add all function
            intent.putExtra("bundle",bundle);
            startActivity(intent);
        }
    }
}
