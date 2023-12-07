package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0;
import java.util.HashMap;
import java.util.Map;
import o.FirebaseCommonKtxRegistrar;
import o.R;
import o.setBaselineAlignBottom;
import o.setScrollingTouchSlop;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> MenuHostHelper$$ExternalSyntheticLambda0;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected final FabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList(Context context, boolean z) {
        int i = z ? R.animator.res_0x7f02001e : R.animator.res_0x7f02001d;
        FabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0 fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0 = new FabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0();
        fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = FirebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1(context, i);
        fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 = new setScrollingTouchSlop();
        return fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final boolean setX(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) && (((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) childAt.getLayoutParams()).setUnboundedRipple instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (map != null && map.containsKey(childAt)) {
                            setBaselineAlignBottom.setUnboundedRipple(childAt, this.MenuHostHelper$$ExternalSyntheticLambda0.get(childAt).intValue());
                        }
                    } else {
                        this.MenuHostHelper$$ExternalSyntheticLambda0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        setBaselineAlignBottom.setUnboundedRipple(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            }
        }
        return super.setX(view, view2, z, z2);
    }
}