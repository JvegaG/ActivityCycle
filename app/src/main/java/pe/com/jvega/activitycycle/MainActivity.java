package pe.com.jvega.activitycycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final String KEY = "Activy 1 lifecycle";
    private Button button2second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2second = findViewById(R.id.btn_to_second);

        Log.i(KEY, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(KEY, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(KEY, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(KEY, "onResume");

        button2second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(KEY, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(KEY, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(KEY, "onDestroy");
    }
}
