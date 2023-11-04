package com.example.engineeringpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class NM_CSE_DBATU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nm_cse_dbatu);
        PDFView pdfView;
        pdfView=findViewById(R.id.pdfview);
        pdfView.fromAsset("Nm.pdf").load();
    }
}