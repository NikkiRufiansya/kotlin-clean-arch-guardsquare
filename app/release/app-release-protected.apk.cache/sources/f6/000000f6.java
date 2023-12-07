package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import o.setBaselineAlignBottom;
import o.setThumbTintBlendMode;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.setIconTintList<View> {
    int setY;

    protected abstract boolean setX(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
        this.setY = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setY = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final setThumbTintBlendMode setthumbtintblendmode;
        if (!setBaselineAlignBottom.setConstraintSet(view)) {
            List<View> MenuHostHelper$$ExternalSyntheticLambda0 = coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0(view);
            int size = MenuHostHelper$$ExternalSyntheticLambda0.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    setthumbtintblendmode = null;
                    break;
                }
                View view2 = MenuHostHelper$$ExternalSyntheticLambda0.get(i2);
                if (setIconTintList(view, view2)) {
                    setthumbtintblendmode = (setThumbTintBlendMode) view2;
                    break;
                }
                i2++;
            }
            if (setthumbtintblendmode != null && MenuHostHelper$$ExternalSyntheticLambda0(setthumbtintblendmode.setIconTintList())) {
                final int i3 = setthumbtintblendmode.setIconTintList() ? 1 : 2;
                this.setY = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (ExpandableBehavior.this.setY == i3) {
                            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                            setThumbTintBlendMode setthumbtintblendmode2 = setthumbtintblendmode;
                            expandableBehavior.setX((View) setthumbtintblendmode2, view, setthumbtintblendmode2.setIconTintList(), false);
                        }
                        return false;
                    }
                });
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, View view, View view2) {
        setThumbTintBlendMode setthumbtintblendmode = (setThumbTintBlendMode) view2;
        if (MenuHostHelper$$ExternalSyntheticLambda0(setthumbtintblendmode.setIconTintList())) {
            this.setY = setthumbtintblendmode.setIconTintList() ? 1 : 2;
            return setX((View) setthumbtintblendmode, view, setthumbtintblendmode.setIconTintList(), true);
        }
        return false;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        if (!z) {
            return this.setY == 1;
        }
        int i = this.setY;
        return i == 0 || i == 2;
    }
}