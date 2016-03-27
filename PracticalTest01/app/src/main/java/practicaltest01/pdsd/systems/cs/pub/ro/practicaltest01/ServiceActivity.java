package practicaltest01.pdsd.systems.cs.pub.ro.practicaltest01;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ServiceActivity extends ActionBarActivity {
    private TextView messageTextView;
    private BroadcastReceiver broadcastReceiver;
    private IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);



        messageTextView = (TextView) findViewById(R.id.message_text_view);
        broadcastReceiver = new PracticalTest01BroadcastReceiver(messageTextView);
        intentFilter = new IntentFilter();
        intentFilter.addAction(Constants.ACTION_STRING);

        Intent intentService = new Intent();

        intentService.setComponent(new ComponentName("ro.pub.cs.systems.pdsd.practicaltest01", "ro.pub.cs.systems.pdsd.practicaltest01.PracticalTest01Service"));
        startService(intentService);
        Log.d("porneste", "porneste serviciul");

    }
/*
    @Override
    protected void onDestroy() {
        Intent intentService = new Intent();
        intentService.setComponent(new ComponentName("ro.pub.cs.systems.pdsd.practicaltest01", "ro.pub.cs.systems.pdsd.practicaltest01.PracticalTest01Service"));
        startService(intentService);

        super.onDestroy();
    }
*/
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
