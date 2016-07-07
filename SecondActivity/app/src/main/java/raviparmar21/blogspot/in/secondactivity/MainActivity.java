package raviparmar21.blogspot.in.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private static Button sav_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
    }
    public void OnClickButtonListener()
    {
    sav_button = (Button)findViewById(R.id.button);
        sav_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("raviparmar21.blogspot.in.secondactivity.SecondActivity");
                        startActivity(intent);
                    }
                }


        );

    }
}
