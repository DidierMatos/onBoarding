package com.ndevelopers.onboardingapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
        //this.layoutInflater = layoutInflater;
    }

    public int[] slide_images = {
            R.drawable.eat_icon,
            R.drawable.sleep_icon,
            R.drawable.code_icon,
            R.drawable.eat_icon,
            R.drawable.sleep_icon
    };

    public String [] slide_headings = {
            "EAT",
            "SLEEP",
            "CODE",
            "EAT2",
            "SLEEP"
    };

    public String[] slide_descs = {
            "a asda asd wet grth tjuyuk gfbfk luikfv bdfgdf ng gvxg etdhg xfb",
            "b asda asd wet grth tjuyuk gfbfk luikfv bdfgdf ng gvxg etdhg xfb",
            "c asda asd wet grth tjuyuk gfbfk luikfv bdfgdf ng gvxg etdhg xfb",
            "d asda asd wet grth tjuyuk gfbfk luikfv bdfgdf ng gvxg etdhg xfb",
            "e asda asd wet grth tjuyuk gfbfk luikfv bdfgdf ng gvxg etdhg xfb"
    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (ConstraintLayout) o;
    }

    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        //return super.instantiateItem(container, position);
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = view.findViewById(R.id.slide_image);
        TextView slideHeading = view.findViewById(R.id.slide_heading);
        TextView slideDescription = view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);

        return view;
    };

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        //super.destroyItem(container, position, object);
        container.removeView((ConstraintLayout)object);



    }
}
