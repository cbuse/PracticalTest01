package practicaltest01.pdsd.systems.cs.pub.ro.practicaltest01;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by cristina on 27.03.2016.
 */
public class PracticalTest01BroadcastReceiver extends BroadcastReceiver {
    private TextView messageTextView;

    public PracticalTest01BroadcastReceiver(TextView messageTextView) {
        this.messageTextView = messageTextView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //super.onReceive(context, intent);
        String action = intent.getAction();
        String data = null;
        //if (Constants.ACTION_STRING.equals(action)) {
            data = intent.getStringExtra(Constants.DATA);
        //}
       // if (messageTextView != null) {
            messageTextView.setText(messageTextView.getText().toString() + "\n" + data);
        Toast.makeText(context, "broascastu",Toast.LENGTH_LONG).show();


            Log.d("trebuie", data);
        //}
    }
}
