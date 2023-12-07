package o;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

/* loaded from: classes.dex */
public class setMinAndMaxFrame extends setAccessibilityTraversalAfter implements Checkable {
    private static final int[] setY = {16842912};
    private boolean MenuHostHelper$$ExternalSyntheticLambda1;
    boolean setIconTintList;
    private boolean setX;

    public setMinAndMaxFrame(Context context) {
        this(context, null);
    }

    public setMinAndMaxFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0401fb);
    }

    public setMinAndMaxFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setIconTintList = true;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        setBaselineAlignBottom.setX(this, new setCounterOverflowTextColor() { // from class: o.setMinAndMaxFrame.1
            @Override // o.setCounterOverflowTextColor
            public final void setIconTintList(View view, AccessibilityEvent accessibilityEvent) {
                super.setIconTintList(view, accessibilityEvent);
                accessibilityEvent.setChecked(setMinAndMaxFrame.this.isChecked());
            }

            @Override // o.setCounterOverflowTextColor
            public final void setY(View view, setDecorPadding setdecorpadding) {
                super.setY(view, setdecorpadding);
                setdecorpadding.setX(setMinAndMaxFrame.this.setIconTintList);
                setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda1(setMinAndMaxFrame.this.isChecked());
            }
        });
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.setIconTintList || this.setX == z) {
            return;
        }
        this.setX = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.setX;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.setX);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.setX) {
            int[] iArr = setY;
            return mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0 setminandmaxframe_menuhosthelper__externalsyntheticlambda0 = new setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0(super.onSaveInstanceState());
        setminandmaxframe_menuhosthelper__externalsyntheticlambda0.setX = this.setX;
        return setminandmaxframe_menuhosthelper__externalsyntheticlambda0;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0 setminandmaxframe_menuhosthelper__externalsyntheticlambda0 = (setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0) parcelable;
        super.onRestoreInstanceState(setminandmaxframe_menuhosthelper__externalsyntheticlambda0.setUiOptions);
        setChecked(setminandmaxframe_menuhosthelper__externalsyntheticlambda0.setX);
    }

    public void setCheckable(boolean z) {
        if (this.setIconTintList != z) {
            this.setIconTintList = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setPressable(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
    }
}