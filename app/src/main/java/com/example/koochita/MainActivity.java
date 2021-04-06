package com.example.koochita;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ConstraintLayout expandableView;
        Button arrowBtn;
        CardView cardView;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Slider Item                //Slider Item                //Slider Item
        expandableView = findViewById(R.id.expandableView);
        arrowBtn = findViewById(R.id.arrowBtn);
        cardView = findViewById(R.id.cardView);

        arrowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandableView.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.VISIBLE);
//                    arrowBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                } else {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.GONE);
//                    arrowBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
            }
        });

        //Slider Item                //Slider Item                //Slider Item

        // // // // // // // // // // // // // // // // // // // // // //

        ViewPager2 locationViewPager = findViewById(R.id.locationsviewPager);

        List<TravelLocation> travelLocations = new ArrayList<>();

        TravelLocation travelLocationMotionView = new TravelLocation();
        travelLocationMotionView.imageUrl = "https://images.unsplash.com/photo-1511739001486-6bfe10ce785f?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80";
        travelLocationMotionView.title = "testtest";
        travelLocationMotionView.location = "iran \n Item_Profile_MainActivity";
        travelLocationMotionView.starRating = 4.5f;
        travelLocations.add(travelLocationMotionView);


        TravelLocation travelLocationMotionView2 = new TravelLocation();
        travelLocationMotionView2.imageUrl = "https://images.unsplash.com/photo-1511739001486-6bfe10ce785f?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80";
        travelLocationMotionView2.title = "testtest";
        travelLocationMotionView2.location = "iran";
        travelLocationMotionView2.starRating = 4.5f;
        travelLocations.add(travelLocationMotionView2);


        TravelLocation travelLocationMotionView3 = new TravelLocation();
        travelLocationMotionView3.imageUrl = "https://images.unsplash.com/photo-1511739001486-6bfe10ce785f?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80";
        travelLocationMotionView3.title = "testtest";
        travelLocationMotionView3.location = "iran";
        travelLocationMotionView3.starRating = 4.5f;
        travelLocations.add(travelLocationMotionView3);


        TravelLocation travelLocationMotionView4 = new TravelLocation();
        travelLocationMotionView4.imageUrl = "https://images.unsplash.com/photo-1511739001486-6bfe10ce785f?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80";
        travelLocationMotionView4.title = "testtest";
        travelLocationMotionView4.location = "iran";
        travelLocationMotionView4.starRating = 4.5f;
        travelLocations.add(travelLocationMotionView4);


        locationViewPager.setAdapter(new TravelLocationAdapter(travelLocations));


        locationViewPager.setClipToPadding(false);
        locationViewPager.setClipChildren(false);
        locationViewPager.setOffscreenPageLimit(3);
        locationViewPager.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);


        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(20));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.95f+ r * 0.05f);
            }
        });

        locationViewPager.setPageTransformer(compositePageTransformer);

    }
}