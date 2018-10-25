//package com.bignerdranch.android.MyReceipts;
//
//import android.app.Dialog;
//import android.support.v4.app.Fragment;
//
//public class LocatrActivity extends SingleFragmentActivity {
//
//    @Override
//    protected Fragment createFragment() {
//        return LocatrFragment.newInstance();
//    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
//        int errorCode = apiAvailability.isGooglePlayServicesAvailable(this);
//        if (errorCode != ConnectionResult.SUCCESS) {
//            Dialog errorDialog = apiAvailability
//                    .getErrorDialog(this, errorCode, REQUEST_ERROR,
//                            new DialogInterface.OnCancelListener() {
//                                @Override
//                                public void onCancel(DialogInterface dialog) {
//                                    // Leave if services are unavailable.
//                                    finish(); }
//                            });
//            errorDialog.show();
//        }
//    }
//}
