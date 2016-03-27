package practicaltest01.pdsd.systems.cs.pub.ro.practicaltest01;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by cristina on 27.03.2016.
 */
public class PracticalTest01Service extends Service {

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d("service", "onUnbind");

        return true;
    }

    @Override
    public void onRebind(Intent intent) {
        Log.d("serviciu", "onRebind");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("serviciu", "onDestroy");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //super.onStartCommand(intent, flags, startId);
        if (intent.getAction().equals(Constants.ACTION_STRING))
            Toast.makeText(getApplicationContext(), "FA CEVA", Toast.LENGTH_LONG).show();

        Log.d("serviciu", "onStartCommand");
        ProcessingThread processingThread = new ProcessingThread(this);
        Log.d("ajunge", "aunge");
        processingThread.start();
        Toast.makeText(getApplicationContext(), "FA CEVA", Toast.LENGTH_LONG).show();

        return START_REDELIVER_INTENT;
    }

    public void onCreate() {
        super.onCreate();
        Log.d("serviciu", "onCreate");

    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("serviciu", "onBind");
        return null;
    }
}
