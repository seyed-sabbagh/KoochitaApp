package com.example.koochita;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;


public class ElamMosaferActivity extends AppCompatActivity {

    private static final String TAG = "ElamMosaferActivity";
    Button btn, btn_emal, btnButtom;
    ConstraintLayout layout;
    GridView gridView;
    Button textViews;

    int[] gridViewImage = {
            R.drawable.keshti_banner, R.drawable.keshti_banner, R.drawable.keshti_banner, R.drawable.keshti_banner, R.drawable.keshti_banner
    };

    String[] gridViewText = {
            "نام اتاق: شماره یک", "نام اتاق: شماره یک", "نام اتاق: شماره یک", "نام اتاق: شماره یک", "نام اتاق: شماره یک"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elam_mosafer);


        CustomGridView customGridView = new CustomGridView(ElamMosaferActivity.this, gridViewImage, gridViewText);
        gridView = (GridView) findViewById(R.id.gridview21);
        textViews = (Button) findViewById(R.id.btn_elame_mosafer123);



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                        ElamMosaferActivity.this, R.style.BottomSheetDialogTheme);
                @SuppressLint("WrongViewCast") View bottomSheetView = LayoutInflater.from(getApplicationContext())
                        .inflate(
                                R.layout.layout_bottom_sheet_joziyat_mosafer,
                                (ConstraintLayout) findViewById(R.id.bottomSheetContainer2)
                        );

                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();


            }
        });



        gridView.setAdapter(customGridView);





/*

                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                        ElamMosaferActivity.this, R.style.BottomSheetDialogTheme);
                @SuppressLint("WrongViewCast") View bottomSheetView = LayoutInflater.from(getApplicationContext())
                        .inflate(
                                R.layout.layout_bottom_sheet_joziyat_mosafer,
                                (ConstraintLayout) findViewById(R.id.bottomSheetContainer2)
                        );

                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
*/


    }


}