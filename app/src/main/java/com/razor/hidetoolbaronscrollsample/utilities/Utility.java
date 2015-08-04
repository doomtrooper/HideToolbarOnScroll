package com.razor.hidetoolbaronscrollsample.utilities;

import android.content.Context;
import android.content.res.TypedArray;

import com.razor.hidetoolbaronscrollsample.R;

/**
 * Created by razor on 4/8/15.
 */
public class Utility {
    public static int getToolbarHeight(Context context) {
        final TypedArray styledAttributes = context.getTheme().obtainStyledAttributes(
                new int[]{R.attr.actionBarSize});
        int toolbarHeight = (int) styledAttributes.getDimension(0, 0);
        styledAttributes.recycle();

        return toolbarHeight;
    }
}
