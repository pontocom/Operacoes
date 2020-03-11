package pt.iscte.operacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    protected EditText valueA, valueB, result;
    protected RadioButton add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueA = (EditText) findViewById(R.id.et_ValueA);
        valueB = (EditText) findViewById(R.id.et_ValueB);
        result = (EditText) findViewById(R.id.et_Result);

        add = (RadioButton) findViewById(R.id.rbAdd);
        add.setChecked(true);
        subtract = (RadioButton) findViewById(R.id.rbSubtract);
        multiply = (RadioButton) findViewById(R.id.rbMultiply);
        divide = (RadioButton) findViewById(R.id.rbDivide);
    }

    public void performOperation(View v) {
        int va = Integer.parseInt(valueA.getText().toString());
        int vb = Integer.parseInt(valueB.getText().toString());

        if(add.isChecked()) result.setText("" + (va + vb));
        if(subtract.isChecked()) result.setText("" + (va - vb));
        if(multiply.isChecked()) result.setText("" + (va * vb));
        if(divide.isChecked()) result.setText("" + (va / vb));
    }
}
