package me.wavever.ganklock.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import me.wavever.ganklock.R;

/**
 * Created by WAVE on 2016/2/22.
 */
public class DialogUtil {

    private static ProgressDialog progressDialog;

    public static void showSingleDialog(Context context, String msg) {
        new AlertDialog.Builder(context)
                .setCancelable(true)
                .setMessage(msg)
                .setTitle(R.string.dialog_tip)
                .setPositiveButton(R.string.dialog_confirm,null)
                .show();
    }

    public static void showSingleDialog(Context context, int msgId) {
        new AlertDialog.Builder(context)
                .setCancelable(true)
                .setMessage(msgId)
                .setTitle(R.string.dialog_tip)
                .setPositiveButton(R.string.dialog_confirm,null)
                .show();
    }

    public static void showLoadingDialog(Context context){
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("主人别急，正在加载");
        progressDialog.show();
    }

    public static void dismissLoadingDialog(Context context){
        if (progressDialog != null){
            progressDialog.dismiss();
        }
    }

}
