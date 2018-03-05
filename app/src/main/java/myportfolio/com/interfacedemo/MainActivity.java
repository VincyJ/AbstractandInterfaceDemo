package myportfolio.com.interfacedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AbstractClass implements PassValue {

    private TextView tvValue;
    private TextView tvValue2;
    public static PassValue mPassValue;
    public static AbstractClass mAbstractValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPassValue = this;
        mAbstractValue = this;

        tvValue = findViewById(R.id.tv_value);
        tvValue2 = findViewById(R.id.tv_value2);
    }

    public void nextActivity(View view) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
    }


    @Override
    public void getValue(String value) {
        tvValue.setText(value);
    }


    @Override
    void passValue(String value) {
        tvValue2.setText(value);
    }
}
