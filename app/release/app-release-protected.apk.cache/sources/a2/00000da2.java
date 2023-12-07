package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import o.lC;
import o.setMinuteHourDelegate;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda0 extends LinearLayout {
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    ValueAnimator setIconTintList;
    private /* synthetic */ setMinuteHourDelegate setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda0(setMinuteHourDelegate setminutehourdelegate, Context context) {
        super(context);
        this.setY = setminutehourdelegate;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        Rect bounds = this.setY.setZ.getBounds();
        this.setY.setZ.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT >= 23 || this.MenuHostHelper$$ExternalSyntheticLambda1 == i) {
            return;
        }
        requestLayout();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        boolean z = true;
        if (this.setY.setUnboundedRipple == 1 || this.setY.MenuHostHelper$$ExternalSyntheticLambda0 == 2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (((int) TypedValue.applyDimension(1, 16.0f, getContext().getResources().getDisplayMetrics())) << 1)) {
                boolean z2 = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (((ViewGroup.LayoutParams) layoutParams).width != i3 || layoutParams.weight != 0.0f) {
                        ((ViewGroup.LayoutParams) layoutParams).width = i3;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                this.setY.setUnboundedRipple = 0;
                this.setY.setY(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.setIconTintList;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            setIconTintList();
            return;
        }
        setMinuteHourDelegate.setUnboundedRipple setunboundedripple = this.setY.setY;
        setY(false, setunboundedripple != null ? setunboundedripple.setUiOptions : -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList() {
        setMinuteHourDelegate.setUnboundedRipple setunboundedripple = this.setY.setY;
        View childAt = getChildAt(setunboundedripple != null ? setunboundedripple.setUiOptions : -1);
        setSupportBackgroundTintMode setsupportbackgroundtintmode = this.setY.setChipCornerRadius;
        setMinuteHourDelegate setminutehourdelegate = this.setY;
        setSupportBackgroundTintMode.MenuHostHelper$$ExternalSyntheticLambda1(setminutehourdelegate, childAt, setminutehourdelegate.setZ);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(View view, View view2, float f) {
        if (!(view != null && view.getWidth() > 0)) {
            this.setY.setZ.setBounds(-1, this.setY.setZ.getBounds().top, -1, this.setY.setZ.getBounds().bottom);
        } else {
            setSupportBackgroundTintMode setsupportbackgroundtintmode = this.setY.setChipCornerRadius;
            setMinuteHourDelegate setminutehourdelegate = this.setY;
            setsupportbackgroundtintmode.MenuHostHelper$$ExternalSyntheticLambda0(setminutehourdelegate, view, view2, f, setminutehourdelegate.setZ);
        }
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(boolean z, int i, int i2) {
        setMinuteHourDelegate.setUnboundedRipple setunboundedripple = this.setY.setY;
        final View childAt = getChildAt(setunboundedripple != null ? setunboundedripple.setUiOptions : -1);
        final View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            setIconTintList();
            return;
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: o.setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda0.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda0.this.setX(childAt, childAt2, valueAnimator.getAnimatedFraction());
            }

            private static void MenuHostHelper$$ExternalSyntheticLambda0() {
                String str;
                String str2;
                lC.setY sety = lC.MenuHostHelper$$ExternalSyntheticLambda0;
                lC.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                pN.setY("root Detected", "");
                lC.setY = "root Detected";
                str = lC.setIconTintList;
                str2 = lC.setY;
                Log.d(str, str2);
            }
        };
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.setIconTintList = valueAnimator;
            valueAnimator.setInterpolator(setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(animatorUpdateListener);
            valueAnimator.start();
            return;
        }
        this.setIconTintList.removeAllUpdateListeners();
        this.setIconTintList.addUpdateListener(animatorUpdateListener);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height = this.setY.setZ.getBounds().height();
        if (height < 0) {
            height = this.setY.setZ.getIntrinsicHeight();
        }
        int i = this.setY.setLayoutAnimation;
        int i2 = 0;
        if (i == 0) {
            i2 = getHeight() - height;
            height = getHeight();
        } else if (i == 1) {
            i2 = (getHeight() - height) / 2;
            height = (getHeight() + height) / 2;
        } else if (i != 2) {
            height = i != 3 ? 0 : getHeight();
        }
        if (this.setY.setZ.getBounds().width() > 0) {
            Rect bounds = this.setY.setZ.getBounds();
            this.setY.setZ.setBounds(bounds.left, i2, bounds.right, height);
            this.setY.setZ.draw(canvas);
        }
        super.draw(canvas);
    }
}