package com.razor.hidetoolbaronscrollsample.behaviour;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.View;

import com.razor.hidetoolbaronscrollsample.utilities.Utility;

/**
 * Created by razor on 4/8/15.
 */
public class ScrollingFabBehavior extends CoordinatorLayout.Behavior<FloatingActionButton>{

    private int toolbarHeight;

    public ScrollingFabBehavior(Context context, AttributeSet attrs) {
        super(context,attrs);
        this.toolbarHeight = Utility.getToolbarHeight(context);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
        return dependency instanceof AppBarLayout;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
        if(dependency instanceof AppBarLayout){
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) child.getLayoutParams();
            int fabBottomMargin = layoutParams.bottomMargin;
            int distanceToScroll = child.getHeight() + fabBottomMargin;
            float ratio = (float)dependency.getY()/(float)toolbarHeight;
            child.setTranslationY(-distanceToScroll * ratio);
        }
        return true;
    }
}
