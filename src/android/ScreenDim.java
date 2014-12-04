package com.phonegap.build.screendim;

import org.json.JSONArray;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.view.WindowManager;
import android.view.Window;
import android.util.Log;

public class ScreenDim extends CordovaPlugin {
    public final static String TAG = "ScreenDim";

    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext)
    throws JSONException {
        if (action.equals("enable")) {
            enable();
        } else if (action.equals("disable")) {
            disable();
        } else {
          // Returning false results in a "MethodNotFound" error.
          return false;
        }

        return true;
    }

    public void enable() {
        Log.d(TAG, "Enable screen dimmer");
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    public void disable() {
        Log.d(TAG, "Disable screen dimmer");
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    protected Window getWindow() {
        return cordova.getActivity().getWindow();
    }
}
