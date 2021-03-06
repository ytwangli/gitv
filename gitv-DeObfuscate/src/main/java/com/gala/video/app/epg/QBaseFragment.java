package com.gala.video.app.epg;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.gala.video.lib.framework.core.utils.LogUtils;

public class QBaseFragment extends Fragment {
    private static final String TAG = "QBaseFragment";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.m1568d(TAG, "Fragment onCreate() " + this);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
        LogUtils.m1568d(TAG, "Fragment onResume() " + this);
    }

    public void onPause() {
        super.onPause();
        LogUtils.m1568d(TAG, "Fragment onPause() " + this);
    }

    public void onStop() {
        super.onStop();
        LogUtils.m1568d(TAG, "Fragment onStop() " + this);
    }

    public void onDestroy() {
        super.onDestroy();
        LogUtils.m1568d(TAG, "Fragment onDestroy() " + this);
    }
}
