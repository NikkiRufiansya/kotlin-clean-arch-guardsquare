package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import o.C0259k;
import o.C0366p;
import o.FabTransformationSheetBehavior;
import o.GridLayoutManager;
import o.SearchView$SavedState$1;
import o.getStableInsets;
import o.setCalendarViewShown;
import o.setCheckableResource;
import o.setClipBounds;
import o.setOnDateChangedListener;
import o.setTabSelected;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends SearchView$SavedState$1 {
    @Override // o.SearchView$SavedState$1
    public setCalendarViewShown setX(Context context, AttributeSet attributeSet) {
        return new FabTransformationSheetBehavior(context, attributeSet);
    }

    @Override // o.SearchView$SavedState$1
    public setCheckableResource MenuHostHelper$$ExternalSyntheticLambda1(Context context, AttributeSet attributeSet) {
        return new setTabSelected(context, attributeSet);
    }

    @Override // o.SearchView$SavedState$1
    public setClipBounds setLayoutAnimation(Context context, AttributeSet attributeSet) {
        return new setOnDateChangedListener(context, attributeSet);
    }

    @Override // o.SearchView$SavedState$1
    public getStableInsets ViewPager$SavedState$1(Context context, AttributeSet attributeSet) {
        return new C0366p(context, attributeSet);
    }

    @Override // o.SearchView$SavedState$1
    public GridLayoutManager setIconTintList(Context context, AttributeSet attributeSet) {
        return new C0259k(context, attributeSet);
    }
}