package practicaltest01.pdsd.systems.cs.pub.ro.practicaltest01;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PracticalTest01SecondaryActivity extends ActionBarActivity {
    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements Button.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.back:
                    setResult(RESULT_OK, new Intent());
                    finish();
                    //Intent intent = new Intent(getApplicationContext(), PracticalTest01MainActivity.class);
                    //startActivity(intent);
                    break;
            }
        }
    }

    public PracticalTest01SecondaryActivity() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_secondary);

        Intent intent = getIntent();
        if (intent != null) {
            //am luat datele transmise prin intentie
            String ora = intent.getStringExtra("ora_exacta");

            DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm");
            String date = df.format(Calendar.getInstance().getTime());

            Log.d("data", date);
            Toast.makeText(getApplicationContext(),ora + date, Toast.LENGTH_LONG).show();




        }

        Button backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener(buttonClickListener);
    }
}
