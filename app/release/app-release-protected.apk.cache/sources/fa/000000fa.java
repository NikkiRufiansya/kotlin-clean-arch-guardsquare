package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import o.FragmentManager$6;
import o.setCardElevation;
import o.setScrollingTouchSlop;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private float MenuHostHelper$$ExternalSyntheticLambda0;
    private float setIconTintList;
    private final Rect setLayoutAnimation;
    private final RectF setNavigationOnClickListener;
    private final RectF setOnLongClickListener;
    private final int[] setX;

    protected abstract FabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList(Context context, boolean z);

    public FabTransformationBehavior() {
        this.setLayoutAnimation = new Rect();
        this.setOnLongClickListener = new RectF();
        this.setNavigationOnClickListener = new RectF();
        this.setX = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setLayoutAnimation = new Rect();
        this.setOnLongClickListener = new RectF();
        this.setNavigationOnClickListener = new RectF();
        this.setX = new int[2];
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean setIconTintList(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (view2 instanceof FloatingActionButton) {
            int i = ((FloatingActionButton) view2).MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
            return i == 0 || i == view.getId();
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final void MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) {
        if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setY == 0) {
            coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setY = 80;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03c8 A[LOOP:0: B:99:0x03c6->B:100:0x03c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0373  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final android.animation.AnimatorSet setY(final android.view.View r28, final android.view.View r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.setY(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    private static Pair<FragmentManager$6, FragmentManager$6> MenuHostHelper$$ExternalSyntheticLambda1(float f, float f2, boolean z, FabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0 fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0) {
        FragmentManager$6 iconTintList;
        FragmentManager$6 iconTintList2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            iconTintList = fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("translationXLinear");
            iconTintList2 = fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("translationYLinear");
        } else if ((z && f2 < 0.0f) || (!z && i > 0)) {
            iconTintList = fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("translationXCurveUpwards");
            iconTintList2 = fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("translationYCurveUpwards");
        } else {
            iconTintList = fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("translationXCurveDownwards");
            iconTintList2 = fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("translationYCurveDownwards");
        }
        return new Pair<>(iconTintList, iconTintList2);
    }

    private float MenuHostHelper$$ExternalSyntheticLambda1(View view, View view2, setScrollingTouchSlop setscrollingtouchslop) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.setOnLongClickListener;
        RectF rectF2 = this.setNavigationOnClickListener;
        setIconTintList(view, rectF);
        rectF.offset(this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda0);
        setIconTintList(view2, rectF2);
        int i = setscrollingtouchslop.MenuHostHelper$$ExternalSyntheticLambda0 & 7;
        if (i == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i == 5) {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        } else {
            f = 0.0f;
            return f + setscrollingtouchslop.setY;
        }
        f = centerX - centerX2;
        return f + setscrollingtouchslop.setY;
    }

    private float setX(View view, View view2, setScrollingTouchSlop setscrollingtouchslop) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.setOnLongClickListener;
        RectF rectF2 = this.setNavigationOnClickListener;
        setIconTintList(view, rectF);
        rectF.offset(this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda0);
        setIconTintList(view2, rectF2);
        int i = setscrollingtouchslop.MenuHostHelper$$ExternalSyntheticLambda0 & 112;
        if (i == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i == 80) {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        } else {
            f = 0.0f;
            return f + setscrollingtouchslop.setIconTintList;
        }
        f = centerY - centerY2;
        return f + setscrollingtouchslop.setIconTintList;
    }

    private void setIconTintList(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.setX;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private static void setX(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private static float setY(FabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0 fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0, FragmentManager$6 fragmentManager$6, float f, float f2) {
        long j = fragmentManager$6.setY;
        long j2 = fragmentManager$6.setX;
        FragmentManager$6 iconTintList = fabTransformationBehavior$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("expansion");
        float f3 = ((float) (((iconTintList.setY + iconTintList.setX) + 17) - j)) / ((float) j2);
        TimeInterpolator timeInterpolator = fragmentManager$6.MenuHostHelper$$ExternalSyntheticLambda0;
        if (timeInterpolator == null) {
            timeInterpolator = setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return f + (timeInterpolator.getInterpolation(f3) * (0.0f - f));
    }
}