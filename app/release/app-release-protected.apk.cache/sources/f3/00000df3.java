package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class setOnDateChangedListener extends setClipBounds {
    private static final int setIconTintList = 2132083663;
    private static final int[][] setX = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setY;

    public setOnDateChangedListener(Context context) {
        this(context, null);
    }

    public setOnDateChangedListener(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f04035d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setOnDateChangedListener(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r6 = o.setOnDateChangedListener.setIconTintList
            android.content.Context r10 = o.C0501u.MenuHostHelper$$ExternalSyntheticLambda0(r10, r11, r12, r6)
            r9.<init>(r10, r11, r12)
            android.content.Context r10 = r9.getContext()
            int[] r7 = o.setIconTint.setIconTintList.setIconified
            r8 = 0
            int[] r5 = new int[r8]
            o.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(r10, r11, r12, r6)
            r0 = r10
            r1 = r11
            r2 = r7
            r3 = r12
            r4 = r6
            o.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r11 = r10.obtainStyledAttributes(r11, r7, r12, r6)
            boolean r12 = r11.hasValue(r8)
            if (r12 == 0) goto L2e
            android.content.res.ColorStateList r10 = o.setFastScrollEnabled.setX(r10, r11, r8)
            o.getCallingUserHandle.MenuHostHelper$$ExternalSyntheticLambda1(r9, r10)
        L2e:
            r10 = 1
            boolean r10 = r11.getBoolean(r10, r8)
            r9.setY = r10
            r11.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnDateChangedListener.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.setY && getCallingUserHandle.setY(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final void setUseMaterialThemeColors(boolean z) {
        this.setY = z;
        if (!z) {
            getCallingUserHandle$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this, null);
            return;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            int MenuHostHelper$$ExternalSyntheticLambda1 = setIndeterminateDrawable.MenuHostHelper$$ExternalSyntheticLambda1(this, R.attr.res_0x7f0400e3);
            int MenuHostHelper$$ExternalSyntheticLambda12 = setIndeterminateDrawable.MenuHostHelper$$ExternalSyntheticLambda1(this, R.attr.res_0x7f0400f2);
            int MenuHostHelper$$ExternalSyntheticLambda13 = setIndeterminateDrawable.MenuHostHelper$$ExternalSyntheticLambda1(this, R.attr.res_0x7f040101);
            int[][] iArr = setX;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = setExtended.setY(setExtended.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1, Math.round(Color.alpha(MenuHostHelper$$ExternalSyntheticLambda1))), MenuHostHelper$$ExternalSyntheticLambda13);
            iArr2[1] = setExtended.setY(setExtended.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12, Math.round(Color.alpha(MenuHostHelper$$ExternalSyntheticLambda12) * 0.54f)), MenuHostHelper$$ExternalSyntheticLambda13);
            iArr2[2] = setExtended.setY(setExtended.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12, Math.round(Color.alpha(MenuHostHelper$$ExternalSyntheticLambda12) * 0.38f)), MenuHostHelper$$ExternalSyntheticLambda13);
            iArr2[3] = setExtended.setY(setExtended.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12, Math.round(Color.alpha(MenuHostHelper$$ExternalSyntheticLambda12) * 0.38f)), MenuHostHelper$$ExternalSyntheticLambda13);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new ColorStateList(iArr, iArr2);
        }
        getCallingUserHandle$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this, this.MenuHostHelper$$ExternalSyntheticLambda1);
    }
}