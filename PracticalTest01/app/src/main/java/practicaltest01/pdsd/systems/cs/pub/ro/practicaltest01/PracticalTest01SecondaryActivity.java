package practicaltest01.pdsd.systems.cs.pub.ro.practicaltest01;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PracticalTest01SecondaryActivity extends ActionBarActivity {
    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements Button.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.back:
                    Intent intent = new Intent(getApplicationContext(), PracticalTest01MainActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_secondary);

        Button backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener(buttonClickListener);
    }
}
