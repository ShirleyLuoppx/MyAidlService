package com.ppx.dailystudy.myaidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/**
 * @author LuoXia
 */
public class StudentService extends Service {

    private String TAG = "StudentService";

    public StudentService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return stub;
    }

    private IStudent.Stub stub = new IStudent.Stub() {
        @Override
        public void setName(String name) throws RemoteException {
            Log.d(TAG, "setName: 服务端收到的name：" + name);
        }
    };
}