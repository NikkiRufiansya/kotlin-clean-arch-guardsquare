package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public class CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 extends ViewGroup.MarginLayoutParams {
    public int MenuHostHelper$$ExternalSyntheticLambda0;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    boolean ViewPager$SavedState$1;
    private Object setAnimationFromJson;
    boolean setCenterIfNoTextEnabled;
    int setChipCornerRadius;
    boolean setIconSize;
    public int setIconTintList;
    View setLayoutAnimation;
    final Rect setMaxEms;
    public int setNavigationOnClickListener;
    boolean setOnLongClickListener;
    int setOnNavigationItemSelectedListener;
    boolean setTextAlignment;
    View setUiOptions;
    public CoordinatorLayout.setIconTintList setUnboundedRipple;
    public int setX;
    public int setY;

    public CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0() {
        super(-2, -2);
        this.setOnLongClickListener = false;
        this.setX = 0;
        this.setIconTintList = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        this.setNavigationOnClickListener = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        this.setY = 0;
        this.setMaxEms = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setOnLongClickListener = false;
        this.setX = 0;
        this.setIconTintList = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        this.setNavigationOnClickListener = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        this.setY = 0;
        this.setMaxEms = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList);
        this.setX = obtainStyledAttributes.getInteger(onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.setX, 0);
        this.setNavigationOnClickListener = obtainStyledAttributes.getResourceId(onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.setY, -1);
        this.setIconTintList = obtainStyledAttributes.getInteger(onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, 0);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getInteger(onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation, -1);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getInt(onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions, 0);
        this.setY = obtainStyledAttributes.getInt(onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener);
        this.setOnLongClickListener = hasValue;
        if (hasValue) {
            this.setUnboundedRipple = CoordinatorLayout.setY(context, attributeSet, obtainStyledAttributes.getString(onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener));
        }
        obtainStyledAttributes.recycle();
        CoordinatorLayout.setIconTintList seticontintlist = this.setUnboundedRipple;
        if (seticontintlist != null) {
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
    }

    public CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) {
        super((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0);
        this.setOnLongClickListener = false;
        this.setX = 0;
        this.setIconTintList = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        this.setNavigationOnClickListener = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        this.setY = 0;
        this.setMaxEms = new Rect();
    }

    public CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.setOnLongClickListener = false;
        this.setX = 0;
        this.setIconTintList = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        this.setNavigationOnClickListener = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        this.setY = 0;
        this.setMaxEms = new Rect();
    }

    public CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.setOnLongClickListener = false;
        this.setX = 0;
        this.setIconTintList = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        this.setNavigationOnClickListener = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        this.setY = 0;
        this.setMaxEms = new Rect();
    }

    public final void setIconTintList(CoordinatorLayout.setIconTintList seticontintlist) {
        CoordinatorLayout.setIconTintList seticontintlist2 = this.setUnboundedRipple;
        if (seticontintlist2 != seticontintlist) {
            if (seticontintlist2 != null) {
                seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1();
            }
            this.setUnboundedRipple = seticontintlist;
            this.setAnimationFromJson = null;
            this.setOnLongClickListener = true;
            if (seticontintlist != null) {
                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        }
    }
}