package com.example.StrongPrimaryPasswordGenerator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.DownloadManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DownloaderActivity extends AppCompatActivity {
    private static final int PERMISSION_STORAGE_CODE = 1000;
    EditText mUrlEt;
    Button mDownloadUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downloader);


//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
        mUrlEt = findViewById(R.id.urlEt);
        mDownloadUrl = findViewById(R.id.downloadUrl);
        mDownloadUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mUrlEt.getText() != null && !mUrlEt.getText().toString().equals("")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                            //permission is denied, request it.
                            String[] permissions = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                            //show popup for run time permission
                            requestPermissions(permissions, PERMISSION_STORAGE_CODE);
                        } else {
                            //permission is granted, start download
                            startDownloading();
                        }
                    } else {
                        //OS is lower than marshmallow, start download
                        startDownloading();
                    }
                } else{
                    Toast.makeText(DownloaderActivity.this, "ابتدا لینک را وارد کنید", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void startDownloading() {
        //get URL from edit text
        String url = mUrlEt.getText().toString().trim();

        //create download request
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        //allow network types
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle("download title");
        request.setDescription("download description");
//        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "" + System.currentTimeMillis());

        //get download service AND nque file
        DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
    }
    //handle permission result

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PERMISSION_STORAGE_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    //permission granted from popup. Start download.
                    startDownloading();
                } else {
                    //permission denied. Show error message.
                    Toast.makeText(this, "مجوز داده نشد", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
