package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class getView extends FrameLayout {
    private TypedValue MenuHostHelper$$ExternalSyntheticLambda0;
    private final Rect MenuHostHelper$$ExternalSyntheticLambda1;
    private TypedValue setIconTintList;
    private TypedValue setLayoutAnimation;
    private TypedValue setUiOptions;
    private TypedValue setUnboundedRipple;
    private setY setX;
    private TypedValue setY;

    /* loaded from: classes.dex */
    public interface setY {
        void setIconTintList();

        void setX();
    }

    public getView(Context context) {
        this(context, null);
    }

    public getView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public getView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new Rect();
    }

    public void setAttachListener(setY sety) {
        this.setX = sety;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.set(i, i2, i3, i4);
        if (setBaselineAlignBottom.setConstraintSet(this)) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getView.onMeasure(int, int):void");
    }

    public TypedValue MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setUnboundedRipple == null) {
            this.setUnboundedRipple = new TypedValue();
        }
        return this.setUnboundedRipple;
    }

    public TypedValue setUnboundedRipple() {
        if (this.setUiOptions == null) {
            this.setUiOptions = new TypedValue();
        }
        return this.setUiOptions;
    }

    public TypedValue setIconTintList() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new TypedValue();
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public TypedValue MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setLayoutAnimation == null) {
            this.setLayoutAnimation = new TypedValue();
        }
        return this.setLayoutAnimation;
    }

    public TypedValue setX() {
        if (this.setY == null) {
            this.setY = new TypedValue();
        }
        return this.setY;
    }

    public TypedValue setY() {
        if (this.setIconTintList == null) {
            this.setIconTintList = new TypedValue();
        }
        return this.setIconTintList;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setY sety = this.setX;
        if (sety != null) {
            sety.setIconTintList();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setY sety = this.setX;
        if (sety != null) {
            sety.setX();
        }
    }
}