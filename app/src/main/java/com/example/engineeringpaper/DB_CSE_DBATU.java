package com.example.engineeringpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DB_CSE_DBATU extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db_cse_dbatu);
        PDFView pdfView;
        pdfView=findViewById(R.id.pdfview);
        pdfView.fromAsset("dbms.pdf").load();
    }
}