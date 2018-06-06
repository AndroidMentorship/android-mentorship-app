package com.am.fdamilola.bankingapp.base.classes;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.utils.DrawablesFactory;

public class TButtonView extends AppCompatButton {

    public TButtonView(Context context) {
        super(context);
        init(null, 0);
    }

    public TButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public TButtonView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {

        final TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.TButtonView, defStyle, 0);

        int baseColor = a.getColor(R.styleable.TButtonView_baseColor, Color.parseColor("#4BB14E"));
        this.setBackgroundDrawable(DrawablesFactory.makeDrawableSelector(getContext(), baseColor));

        this.setTextColor(Color.parseColor("#333333"));

        this.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/nats-regular.ttf"));

        a.recycle();
    }
}
