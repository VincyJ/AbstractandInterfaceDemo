package myportfolio.com.interfacedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import static myportfolio.com.interfacedemo.MainActivity.mAbstractValue;
import static myportfolio.com.interfacedemo.MainActivity.mPassValue;

public class SecondActivity extends AppCompatActivity {

    private EditText etValue;


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
                mPassValue.getValue(etValue.getText().toString());
                mAbstractValue.passValue(etValue.getText().toString());
            }
        });
    }

}
