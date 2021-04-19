package com.example.koochita;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class ActivityFragment1_ListKasbOkar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1__list_kasb_okar);

        ConstraintLayout layout;
        Button btn, btn_emal;
        
        btn = findViewById(R.id.btn_elame_mosafer);
        layout = findViewById(R.id.bottomSheetContainer2);
        btn_emal = findViewById(R.id.btn_emal);


        Button button = findViewById(R.id.button1002);

      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                      ActivityFragment1_ListKasbOkar.this, R.style.BottomSheetDialogTheme);
              @SuppressLint("WrongViewCast") View bottomSheetView = LayoutInflater.from(getApplicationContext())
                      .inflate(
                              R.layout.activityfragment1_listkasbokar_buttombar,
                              (ConstraintLayout) findViewById(R.id.bottomSheetContainer2)
                      );

              bottomSheetDialog.setContentView(bottomSheetView);
              bottomSheetDialog.show();
          }
      });
    }

}