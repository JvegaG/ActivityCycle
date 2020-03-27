package pe.com.jvega.activitycycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String KEY = "Ciclo de Vida";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.wtf(KEY, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf(KEY, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.wtf(KEY, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf(KEY, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf(KEY, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf(KEY, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf(KEY, "onDestroy");
    }
}
