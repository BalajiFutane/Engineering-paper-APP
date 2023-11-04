package com.example.dbatupyq;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class TOC_2022_PAPER extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toc2022_paper);


        PDFView pdfView;
        pdfView=findViewById(R.id.pdfview);
        pdfView.fromAsset("TOC.pdf").load();



    }
}