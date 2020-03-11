package pt.iscte.operacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected EditText valueA, valueB;
    protected TextView result;
    protected RadioButton add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueA = (EditText) findViewById(R.id.et_ValueA);
        valueB = (EditText) findViewById(R.id.et_ValueB);
        result = (TextView) findViewById(R.id.tvResultado);

        add = (RadioButton) findViewById(R.id.rbAdd);
        add.setChecked(true);
        subtract = (RadioButton) findViewById(R.id.rbSubtract);
        multiply = (RadioButton) findViewById(R.id.rbMultiply);
        divide = (RadioButton) findViewById(R.id.rbDivide);
    }

    public void performOperation(View v) {
        int va = 0, vb = 0;
        String s_va = valueA.getText().toString();
        String s_vb = valueB.getText().toString();
        if(!s_va.isEmpty() || !s_vb.isEmpty()){
            va = Integer.parseInt(s_va);
            vb = Integer.parseInt(s_vb);
        }

        if(add.isChecked()) result.setText("The result of " + va + " + " + vb + " is " + (va + vb));
        if(subtract.isChecked()) result.setText("The result of " + va + " - " + vb + " is " + (va - vb));
        if(multiply.isChecked()) result.setText("The result of " + va + " x " + vb + " is " +  (va * vb));
        if(divide.isChecked()) result.setText("The result of " + va + " / " + vb + " is " +  (va / vb));
    }
}
