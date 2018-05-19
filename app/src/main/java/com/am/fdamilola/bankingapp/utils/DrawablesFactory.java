package com.am.fdamilola.bankingapp.utils;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;

import com.am.fdamilola.bankingapp.R;

public class DrawablesFactory {

    public static StateListDrawable makeDrawableSelector(Context context, int baseColor) {
        StateListDrawable res = new StateListDrawable();
        int baseColorDarker = ColorManipulator.makeDarker(baseColor, 0.8f);
        GradientDrawable normalState = createShapeDrawable(context, baseColor);
        GradientDrawable pressedState = createShapeDrawable(context, baseColorDarker);
        res.setExitFadeDuration(400);
        res.addState(new int[]{android.R.attr.state_pressed}, pressedState);
        res.addState(new int[]{}, normalState);
        return res;
    }

    private static GradientDrawable createShapeDrawable(Context context, int baseColor) {
        GradientDrawable shape = (GradientDrawable) context.getResources().getDrawable(R.drawable.tbutton_shape);
        shape.mutate();
        shape.setColor(baseColor);
        return shape;
    }

}
