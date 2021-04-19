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

public class mainMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Slider Item                //Slider Item                //Slider Item


        //Slider Item                //Slider Item                //Slider Item

        // // // // // // // // // // // // // // // // // // // // // //

        ViewPager2 locationViewPager = findViewById(R.id.locationsviewPager);

        List<TravelLocation> travelLocations = new ArrayList<>();

        TravelLocation travelLocationMotionView = new TravelLocation();
        travelLocationMotionView.imageUrl = "https://images.unsplash.com/photo-1511739001486-6bfe10ce785f?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80";
        travelLocationMotionView.title = "آموزش واویشکا";
        travelLocationMotionView.location = " ۱۴ روز پیش";
        travelLocationMotionView.starRating = 4.5f;
        travelLocations.add(travelLocationMotionView);


        TravelLocation travelLocationMotionView2 = new TravelLocation();
        travelLocationMotionView2.imageUrl = "https://images.unsplash.com/photo-1511739001486-6bfe10ce785f?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80";
        travelLocationMotionView2.title = "آموزش واویشکا";
        travelLocationMotionView2.location = "۱۴ روز پیش";
        travelLocationMotionView2.starRating = 4.5f;
        travelLocations.add(travelLocationMotionView2);


        TravelLocation travelLocationMotionView3 = new TravelLocation();
        travelLocationMotionView3.imageUrl = "https://images.unsplash.com/photo-1511739001486-6bfe10ce785f?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80";
        travelLocationMotionView3.title = "آموزش واویشکا";
        travelLocationMotionView3.location = "۱۴ روز پیش";
        travelLocationMotionView3.starRating = 4.5f;
        travelLocations.add(travelLocationMotionView3);


        TravelLocation travelLocationMotionView4 = new TravelLocation();
        travelLocationMotionView4.imageUrl = "https://images.unsplash.com/photo-1511739001486-6bfe10ce785f?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80";
        travelLocationMotionView4.title = "آموزش واویشکا";
        travelLocationMotionView4.location = "۱۴ روز پیش";
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