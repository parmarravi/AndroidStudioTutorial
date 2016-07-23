package in.blogspot.raviparmar21.fragmentexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeFragments(View view){

        Fragment fragment;
        if(view ==findViewById(R.id.button))
        {
            fragment=new FragmentOne(); //calling fragment one class
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.frag_place,fragment);
            ft.commit();
        }
        if(view == findViewById(R.id.button2))
        {
            fragment = new Fragmenttwo();
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.frag_place,fragment);
            ft.commit();
        }
    }
}
