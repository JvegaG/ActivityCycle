package pe.com.jvega.activitycycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private final String KEY = "Activy 2 lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i(KEY,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(KEY,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(KEY,"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(KEY,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(KEY,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(KEY,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(KEY,"onDestroy");
    }
}
