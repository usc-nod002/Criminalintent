package com.bignerdranch.android.MyReceipts;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;


import java.util.UUID;

public class ReceiptActivity extends SingleFragmentActivity {

    private static final String EXTRA_RECEIPT_ID =
            "com.bignerdranch.android.MyReceipts.receipt_id";

    public static Intent newIntent(Context packageContext, UUID receiptId) {
        Intent intent = new Intent(packageContext, ReceiptActivity.class);
        intent.putExtra(EXTRA_RECEIPT_ID, receiptId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        UUID receiptId = (UUID) getIntent()
                .getSerializableExtra(EXTRA_RECEIPT_ID);
        return ReceiptFragment.newInstance(receiptId);
    }

//    @Override
//    protected  void onResume() {
//        super.onResume();
//
//        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
//        int errorCode = apiAvailability.isGooglePlayServicesAvailable(this);
//
//        if (errorCode != ConnectionResult.SUCCESS) {
//            Dialog errorDialog = apiAvailability.getErrorDialog(this), errorCode, REQUEST_ERROR,
//            new DialogInterface.OnCancelListener() {
//                @Override
//                Public void onCancel(DialogInterface dialog){
//                finish();
//                }
//            });
//             errorDialog.show();
//        }
//
//
    }
//


