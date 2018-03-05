package myportfolio.com.interfacedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import static myportfolio.com.interfacedemo.MainActivity.mAbstractValue;
import static myportfolio.com.interfacedemo.MainActivity.mPassValue;

public class SecondActivity extends AppCompatActivity {

    private EditText etValue;
    private String value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etValue = findViewById(R.id.et_value);
        etValue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                value = etValue.getText().toString();
                mPassValue.getValue(value);
                mAbstractValue.passValue(value);

            }
        });
    }

    public void close(View view) {
        Intent intent = new Intent();
        intent.putExtra("MESSAGE", value);
        setResult(2, intent);
        finish();//finishing activity
    }
}
