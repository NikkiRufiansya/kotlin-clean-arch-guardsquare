package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import o.setAnimationFromJson;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class setCallingWorkSourceUid extends ViewGroup {
    protected final setCallingWorkSourceUid$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0;
    protected setExpandedTitleTextColor MenuHostHelper$$ExternalSyntheticLambda1;
    protected setOnSeekBarChangeListener setIconTintList;
    private boolean setLayoutAnimation;
    private boolean setUiOptions;
    protected setHeaderDividersEnabled setUnboundedRipple;
    protected int setX;
    protected final Context setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCallingWorkSourceUid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new setCallingWorkSourceUid$MenuHostHelper$$ExternalSyntheticLambda1(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.res_0x7f040004, typedValue, true) && typedValue.resourceId != 0) {
            this.setY = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.setY = context;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, setAnimationFromJson.setY.setIconTintList, R.attr.res_0x7f040007, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(setAnimationFromJson.setY.ViewPager$SavedState$1, 0));
        obtainStyledAttributes.recycle();
        setExpandedTitleTextColor setexpandedtitletextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setexpandedtitletextcolor != null) {
            setexpandedtitletextcolor.setLayoutAnimation();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.setLayoutAnimation = false;
        }
        if (!this.setLayoutAnimation) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.setLayoutAnimation = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.setLayoutAnimation = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.setUiOptions = false;
        }
        if (!this.setUiOptions) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.setUiOptions = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.setUiOptions = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.setX = i;
        requestLayout();
    }

    public setHeaderDividersEnabled setX(int i, long j) {
        setHeaderDividersEnabled setheaderdividersenabled = this.setUnboundedRipple;
        if (setheaderdividersenabled != null) {
            setheaderdividersenabled.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            setHeaderDividersEnabled x = setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(this).setX(1.0f);
            x.MenuHostHelper$$ExternalSyntheticLambda1(j);
            x.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(x, i));
            return x;
        }
        setHeaderDividersEnabled x2 = setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(this).setX(0.0f);
        x2.MenuHostHelper$$ExternalSyntheticLambda1(j);
        x2.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(x2, i));
        return x2;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            setHeaderDividersEnabled setheaderdividersenabled = this.setUnboundedRipple;
            if (setheaderdividersenabled != null) {
                setheaderdividersenabled.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            super.setVisibility(i);
        }
    }

    public boolean setY() {
        setExpandedTitleTextColor setexpandedtitletextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setexpandedtitletextcolor != null) {
            return setexpandedtitletextcolor.setNavigationOnClickListener();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int setX(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}