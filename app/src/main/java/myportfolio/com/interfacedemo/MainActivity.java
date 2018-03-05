package myportfolio.com.interfacedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AbstractClass implements PassValue {

    private TextView tvValueInterface;
    private TextView tvValueAbstract;
    private TextView tvValueBundle;
    public static PassValue mPassValue;
    public static AbstractClass mAbstractValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPassValue = this;
        mAbstractValue = this;

        tvValueInterface = findViewById(R.id.tv_value_interface);
        tvValueAbstract = findViewById(R.id.tv_value_abstract);
        tvValueBundle = findViewById(R.id.tv_value_bundle);
    }

    public void nextActivity(View view) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivityForResult(i, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 2) {
            String message = data.getStringExtra("MESSAGE");
            tvValueBundle.setText(message);
        }
    }

    @Override
    public void getValue(String value) {
        tvValueInterface.setText(value);
    }


    @Override
    void passValue(String value) {
        tvValueAbstract.setText(value);
    }
}
