package raviparmar21.blogspot.in.secondactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private static Button sav_button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        OnClickButtonListener2();
    }
    public void OnClickButtonListener2()
    {
        sav_button2 = (Button)findViewById(R.id.button2);
        sav_button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                }


        );

    }
}
