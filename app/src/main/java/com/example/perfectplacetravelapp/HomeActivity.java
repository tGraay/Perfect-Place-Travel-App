package com.example.perfectplacetravelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.perfectplacetravelapp.Fragments.HomeFragment;
import com.example.perfectplacetravelapp.Fragments.MyTripsFragment;
import com.example.perfectplacetravelapp.Fragments.ProfileFragment;

import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class HomeActivity extends AppCompatActivity{


    private SmoothBottomBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        replace(new HomeFragment());
        bottomBar = findViewById(R.id.smooth_bottom_bar);
        bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                switch (i){
                    case 0:
                        replace(new HomeFragment());
                        break;
                    case 1:
                        Toast.makeText(HomeActivity.this, "NEW", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        replace(new MyTripsFragment());
                        break;
                    case 3:
                        replace(new ProfileFragment());
                        break;
                }
                return true;
            }
        });




//        setupTripsViewPager();
    }

    private void replace(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,fragment);
        transaction.commit();
    }

//    private void setupTripsViewPager()
//    {
//        ViewPager2 viewPager2  = findViewById(R.id.place_view_pager);
//        viewPager2.setClipToPadding(false);
//        viewPager2.setClipChildren(false);
//        viewPager2.setOffscreenPageLimit(3);
//        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
//        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
//        compositePageTransformer.addTransformer(new MarginPageTransformer(10));
//        compositePageTransformer.addTransformer((page, position) ->
//        {
//            float r = 1-Math.abs(position);
//            page.setScaleY(0.85f + r + 0.15f);
//        });
//        viewPager2.setPageTransformer(compositePageTransformer);
//        viewPager2.setAdapter(new TripsAdapter(getTrip()));
//    }
//
//    private List<Trips> getTrip()
//    {
//        List<Trips> trips = new ArrayList<>();
//
//        Trips trips1 = new Trips();
//        trips1.poster = R.drawable.card1;
//        trips1.name = "King’s Plambeac...";
//        trips1.place = "Hawaii, AS";
//        trips1.rating = 5f;
//        trips.add(trips1);
//
//        Trips trips2 = new Trips();
//        trips2.poster = R.drawable.card1;
//        trips2.name = "Greogeus Water...";
//        trips2.place = "Rome, Italy";
//        trips2.rating = 5f;
//        trips.add(trips2);
//
//        return trips;
//    }
}