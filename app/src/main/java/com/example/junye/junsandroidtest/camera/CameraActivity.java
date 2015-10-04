package com.example.junye.junsandroidtest.camera;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by junye on 10/4/15.
 */
public class CameraActivity  extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new CameraPreview(this));
    }
}
