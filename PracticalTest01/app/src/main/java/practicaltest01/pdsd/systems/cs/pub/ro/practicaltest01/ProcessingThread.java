package practicaltest01.pdsd.systems.cs.pub.ro.practicaltest01;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Random;

/**
 * Created by cristina on 27.03.2016.
 */
public class ProcessingThread extends Thread {

    private Context context;

    ProcessingThread(Context context) {
        this.context = context;
    }

    public void run() {
        sendMessage(Constants.MESSAGE_STRING);
        sleep();
        Log.d("threadulu", "Thread.run() was invoked, PID:" + android.os.Process.myPid() + " TID:" + android.os.Process.myTid());

    }

    private void sleep() {
        try {
            Thread.sleep(Constants.SLEEP_TIME);
        }catch(InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
    private void sendMessage(int messageType) {
        Intent intent = new Intent();
        Random rand = new Random();
        int type = rand.nextInt();

        switch (messageType) {
        case Constants.MESSAGE_STRING:
            intent.setAction(Constants.ACTION_STRING);
            intent.putExtra(Constants.DATA, Constants.STRING_DATA);
        }
        context.sendBroadcast(intent);
    }
}
