package practicaltest01.pdsd.systems.cs.pub.ro.practicaltest01;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PracticalTest01MainActivity extends ActionBarActivity {
    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements Button.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.navigate_to_secondary_activity:
                    Intent intent = new Intent(getApplicationContext(), PracticalTest01SecondaryActivity.class);
                    startActivity(intent);


                    break;
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_main);

        Button backButton = (Button) findViewById(R.id.navigate_to_secondary_activity);
        backButton.setOnClickListener(buttonClickListener);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Cristina", "onStart");
        // ...
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Cristina", "onResume");

        // ...
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Cristina", "onPause");

        // ...
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Cristina", "onStop");

        // ...
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Cristina", "onDestroy");

        // ...
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Cristina", "onRestart");
        // ...
    }

    // metode folosite pentru salvarea si restaurarea starii

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        // apelarea metodei din activitatea parinte este recomandata, dar nu obligatorie
        super.onSaveInstanceState(savedInstanceState);
        Log.d("Cristina", "onSaveInstanceState");

        // ...
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // apelarea metodei din activitatea parinte este recomandata, dar nu obligatorie
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Cristina", "onRestoreInstanceState");

        // ...
    }
}