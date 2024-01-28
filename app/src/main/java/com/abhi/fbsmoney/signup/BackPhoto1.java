package com.abhi.fbsmoney.signup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.abhi.fbsmoney.R;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public class BackPhoto1 extends AppCompatActivity {
    /*private ListenableFuture<ProcessCameraProvider> cameraProvider;
    PreviewView previewView;
    ImageCapture imageCapture;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_photo1);

        /*previewView = findViewById(R.id.pre);

        cameraProvider = ProcessCameraProvider.getInstance(this);
        cameraProvider.addListener(() -> {

            try {
                ProcessCameraProvider cameraProvider1 = cameraProvider.get();
                startCameraX(cameraProvider1);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },getExecutor());*/
    }

    /*private Executor getExecutor() {

        return ContextCompat.getMainExecutor(this);
    }*/

    /*private void startCameraX(ProcessCameraProvider cameraProvider1) {

        cameraProvider1.unbindAll();
        CameraSelector cameraSelector = new CameraSelector.Builder()
                .build();

        Preview preview = new Preview.Builder().build();
        preview.setSurfaceProvider(previewView.getSurfaceProvider());

        imageCapture = new ImageCapture.Builder()
                .setCaptureMode(ImageCapture.CAPTURE_MODE_MINIMIZE_LATENCY)
                .build();

        cameraProvider1.bindToLifecycle((LifecycleOwner) this, cameraSelector, preview,imageCapture);
    }*/

    public void submit_btn2(View view) {

        Intent intent = new Intent(getApplicationContext(), VerifyPending.class);
        startActivity(intent);
    }

    public void retake_btn2(View view) {

        Toast.makeText(BackPhoto1.this, "Capture photo !!", Toast.LENGTH_SHORT).show();
    }

    public void back3(View view) {

        Intent intent = new Intent(getApplicationContext(), FrontPhoto1.class);
        startActivity(intent);
    }
}