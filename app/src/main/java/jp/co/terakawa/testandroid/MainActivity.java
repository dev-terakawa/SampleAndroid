package jp.co.terakawa.testandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

//TODO
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //FIXME
        setContentView(R.layout.activity_main);
        try {
            String text = null;
            System.out.println("text.length=" + text.length());
        } catch (NullPointerException ne) {
            Log.e("TA", ne.getMessage());
        }
    }
}
