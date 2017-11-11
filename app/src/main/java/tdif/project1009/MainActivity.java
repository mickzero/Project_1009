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
            Intent intent = new Intent(MainActivity.this,ResultActivity.class);
            intent.putExtra("pass",etPass.getText().toString());
            intent.putExtra("name",etName.getText().toString());
            intent.putExtra("id",etId.getText().toString());
            intent.putExtra("age",etAge.getText().toString());

            float f1,f2,fres;
            f1 = Float.parseFloat(etF1.getText().toString());
            f2 = Float.parseFloat(etF2.getText().toString());
            fres = f1+f2;

            intent.putExtra("fres",""+fres);

            startActivity(intent);
        }
    }
}
