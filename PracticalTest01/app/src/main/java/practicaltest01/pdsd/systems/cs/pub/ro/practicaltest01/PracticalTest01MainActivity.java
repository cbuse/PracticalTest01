package practicaltest01.pdsd.systems.cs.pub.ro.practicaltest01;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PracticalTest01MainActivity extends ActionBarActivity {
    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements Button.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.navigate_to_secondary_activity:


                    //startActivity(intent1);
                    Intent intent2 = new Intent(getApplicationContext(), PracticalTest01SecondaryActivity.class);
                    intent2.putExtra("ora_exacta", "Ora exacta este: ");

                    startActivityForResult(intent2, Constants.SECONDARY_ACTIVITY_REQUEST_CODE);

                    break;
                //ma duc direct in activtatea cu service
                case R.id.buton2:
                    Intent intent22 = new Intent(getApplicationContext(), ServiceActivity.class);
                    startActivity(intent22);
            }

        }
    }


    private EditText editTextLeft;
    private EditText editTextRight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_main);

        Button navigateButton = (Button) findViewById(R.id.navigate_to_secondary_activity);
        Button button2 = (Button) findViewById(R.id.buton2);

        navigateButton.setOnClickListener(buttonClickListener);
        button2.setOnClickListener(buttonClickListener);

        TextView left_text = (TextView)findViewById(R.id.left_text);
        left_text.setText("zero");

        editTextLeft = (EditText) findViewById(R.id.edit_text_left);
        editTextRight = (EditText) findViewById(R.id.edit_text_right);
        editTextLeft.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() != 0)
                    editTextRight.setText("");
                //Toast.makeText(getApplicationContext(), "schimbare", Toast.LENGTH_LONG).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editTextRight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() != 0)
                    editTextLeft.setText("");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        //poate ici trebuie altceva
        if (requestCode == Constants.SECONDARY_ACTIVITY_REQUEST_CODE) {
            Toast.makeText(getApplicationContext(),  resultCode + "", Toast.LENGTH_LONG).show();
        }
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