package com.example.engineeringpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class TOC_CSE_DBATU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toc_cse_dbatu);
        PDFView pdfView;
        pdfView=findViewById(R.id.pdfview);
        pdfView.fromAsset("TOC.pdf").load();
    }
}