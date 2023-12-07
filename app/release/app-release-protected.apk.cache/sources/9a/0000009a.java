package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import o.setIconTint;

/* loaded from: classes.dex */
public class AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 extends LinearLayout.LayoutParams {
    int MenuHostHelper$$ExternalSyntheticLambda1;
    AppBarLayout.setY setIconTintList;
    Interpolator setY;

    public AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getInt(1, 0);
        this.setIconTintList = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new AppBarLayout.setX();
        if (obtainStyledAttributes.hasValue(2)) {
            this.setY = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1() {
        super(-1, -2);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
    }

    public AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
    }

    public AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
    }

    public AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
    }
}