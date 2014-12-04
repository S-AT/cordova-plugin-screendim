package com.phonegap.build.screendim;

import org.json.JSONArray;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.apache.cordova.LOG;

import android.app.Activity;
import android.view.WindowManager;
import android.view.Window;
import android.util.Log;

public class ScreenDim extends CordovaPlugin {
    private final String tag= "ScreenDim";

    public PluginResult execute(String action, JSONArray args, String callbackId) {
        if (action.equals("enable")) {
            enable();
        } else if (action.equals("disable")) {
            disable();
        }

        return new PluginResult(PluginResult.Status.OK);
    }

    public void enable() {
        Log.d(this.tag, "Enable screen dimmer");
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    public void disable() {
        Log.d(this.tag, "Disable screen dimmer");
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    protected Window getWindow() {
        return cordova.getActivity().getWindow();
    }
}
