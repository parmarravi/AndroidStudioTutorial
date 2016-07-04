package raviparmar21.blogspot.in.calculator1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View v) {

        EditText n1 = (EditText) findViewById(R.id.NumField1);
        EditText n2 = (EditText) findViewById(R.id.NumField2);
        TextView result = (TextView) findViewById(R.id.Result);

        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int sum = num1 + num2;
        String sumresult=(Integer.toString(sum));// convert integer to string
        result.setText(sumresult);

        //Displaying Toast
        Toast myToast=Toast.makeText(getApplicationContext(),sumresult , Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER_HORIZONTAL,0,700);
        myToast.show();
    }
}