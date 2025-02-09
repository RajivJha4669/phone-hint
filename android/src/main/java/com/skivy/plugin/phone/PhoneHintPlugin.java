package com.skivy.plugin.phone;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;

import com.getcapacitor.BridgeActivity;

import com.google.android.gms.auth.api.phone.PhoneAuthOptions;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;

@CapacitorPlugin(name = "PhoneHint")
public class PhoneHintPlugin extends Plugin {

   private static final int REQUEST_PHONE_PICKER = 1001;
    
    @PluginMethod
    public void getPhoneNumber(com.getcapacitor.PluginCall call) {
        Activity activity = getActivity();

        Intent intent = SmsRetriever.getClient(activity).getHintPickerIntent(
            new PhoneAuthOptions.Builder()
        );

        startActivityForResult(call, intent, REQUEST_PHONE_PICKER);
    }

    @Override
    protected void handleOnActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_PHONE_PICKER) {
            if (resultCode == Activity.RESULT_OK && data != null) {
                String phoneNumber = data.getStringExtra("phone");
                JSObject ret = new JSObject();
                ret.put("phoneNumber", phoneNumber);
                notifyListeners("onPhoneNumberFetched", ret);
            } else {
                notifyListeners("onPhoneNumberFetched", null);
            }
        }
    }
}
