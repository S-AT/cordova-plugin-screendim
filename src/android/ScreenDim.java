package com.phonegap.build.screendim;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class ScreenDim extends CordovaPlugin {
	private Activity activity;
	private Window window;

	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext)
	throws JSONException {
		switch (action) {
			case "enable":
				cordova.getActivity().runOnUiThread(() -> {
					cordova.getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
				});
				return true;

			case "disable":
				cordova.getActivity().runOnUiThread(() -> {
					cordova.getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
				});
				return true;

			default: return false;
		}
	}
}
