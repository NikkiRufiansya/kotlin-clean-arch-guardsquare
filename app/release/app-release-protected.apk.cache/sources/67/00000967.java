package o;

import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.setContentHeight;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setBackgroundResource extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled {
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    private final setContentHeight setChipCornerRadius;
    private int setIconSize;
    boolean setIconTintList;
    private final androidx.recyclerview.widget.LinearLayoutManager setLayoutAnimation;
    private int setNavigationOnClickListener;
    private final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 setOnLongClickListener;
    private boolean setTextAlignment;
    private int setUiOptions;
    private boolean setUnboundedRipple;
    setContentHeight.setY setX;
    setIconTintList setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setBackgroundResource(setContentHeight setcontentheight) {
        this.setChipCornerRadius = setcontentheight;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = setcontentheight.setLayoutAnimation;
        this.setOnLongClickListener = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
        this.setLayoutAnimation = (androidx.recyclerview.widget.LinearLayoutManager) windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setGuidelinePercent;
        this.setY = new setIconTintList();
        setX();
    }

    private void setX() {
        this.setNavigationOnClickListener = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        setIconTintList seticontintlist = this.setY;
        seticontintlist.setY = -1;
        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 = 0.0f;
        seticontintlist.setX = 0;
        this.setUiOptions = -1;
        this.setIconSize = -1;
        this.setUnboundedRipple = false;
        this.setTextAlignment = false;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        this.setIconTintList = false;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled
    public final void setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, int i) {
        boolean z = true;
        if ((this.setNavigationOnClickListener != 1 || this.MenuHostHelper$$ExternalSyntheticLambda1 != 1) && i == 1) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            this.setNavigationOnClickListener = 1;
            int i2 = this.setIconSize;
            if (i2 != -1) {
                this.setUiOptions = i2;
                this.setIconSize = -1;
            } else if (this.setUiOptions == -1) {
                this.setUiOptions = this.setLayoutAnimation.setLayoutAnimation();
            }
            MenuHostHelper$$ExternalSyntheticLambda1(1);
            return;
        }
        int i3 = this.setNavigationOnClickListener;
        if ((i3 == 1 || i3 == 4) && i == 2) {
            if (this.setTextAlignment) {
                MenuHostHelper$$ExternalSyntheticLambda1(2);
                this.setUnboundedRipple = true;
                return;
            }
            return;
        }
        int i4 = this.setNavigationOnClickListener;
        if ((i4 == 1 || i4 == 4) && i == 0) {
            setY();
            if (!this.setTextAlignment) {
                if (this.setY.setY != -1) {
                    int i5 = this.setY.setY;
                    setContentHeight.setY sety = this.setX;
                    if (sety != null) {
                        sety.setY(i5, 0.0f, 0);
                    }
                }
            } else if (this.setY.setX != 0) {
                z = false;
            } else if (this.setUiOptions != this.setY.setY) {
                int i6 = this.setY.setY;
                setContentHeight.setY sety2 = this.setX;
                if (sety2 != null) {
                    sety2.MenuHostHelper$$ExternalSyntheticLambda1(i6);
                }
            }
            if (z) {
                MenuHostHelper$$ExternalSyntheticLambda1(0);
                setX();
            }
        }
        if (this.setNavigationOnClickListener == 2 && i == 0 && this.setIconTintList) {
            setY();
            if (this.setY.setX == 0) {
                if (this.setIconSize != this.setY.setY) {
                    int i7 = this.setY.setY == -1 ? 0 : this.setY.setY;
                    setContentHeight.setY sety3 = this.setX;
                    if (sety3 != null) {
                        sety3.MenuHostHelper$$ExternalSyntheticLambda1(i7);
                    }
                }
                MenuHostHelper$$ExternalSyntheticLambda1(0);
                setX();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r6 != (r7 == 1)) goto L14;
     */
    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setX(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.setTextAlignment = r5
            r4.setY()
            boolean r0 = r4.setUnboundedRipple
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L4b
            r4.setUnboundedRipple = r2
            if (r7 > 0) goto L2a
            if (r7 != 0) goto L28
            if (r6 >= 0) goto L16
            r6 = 1
            goto L17
        L16:
            r6 = 0
        L17:
            o.setContentHeight r7 = r4.setChipCornerRadius
            androidx.recyclerview.widget.LinearLayoutManager r7 = r7.setUiOptions
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 r7 = r7.setMaxEms
            int r7 = o.setBaselineAlignBottom.ViewPager$SavedState$1(r7)
            if (r7 == r5) goto L25
            r7 = 0
            goto L26
        L25:
            r7 = 1
        L26:
            if (r6 == r7) goto L2a
        L28:
            r6 = 0
            goto L2b
        L2a:
            r6 = 1
        L2b:
            if (r6 == 0) goto L39
            o.setBackgroundResource$setIconTintList r6 = r4.setY
            int r6 = r6.setX
            if (r6 == 0) goto L39
            o.setBackgroundResource$setIconTintList r6 = r4.setY
            int r6 = r6.setY
            int r6 = r6 + r5
            goto L3d
        L39:
            o.setBackgroundResource$setIconTintList r6 = r4.setY
            int r6 = r6.setY
        L3d:
            r4.setIconSize = r6
            int r7 = r4.setUiOptions
            if (r7 == r6) goto L5d
            o.setContentHeight$setY r7 = r4.setX
            if (r7 == 0) goto L5d
            r7.MenuHostHelper$$ExternalSyntheticLambda1(r6)
            goto L5d
        L4b:
            int r6 = r4.setNavigationOnClickListener
            if (r6 != 0) goto L5d
            o.setBackgroundResource$setIconTintList r6 = r4.setY
            int r6 = r6.setY
            if (r6 != r1) goto L56
            r6 = 0
        L56:
            o.setContentHeight$setY r7 = r4.setX
            if (r7 == 0) goto L5d
            r7.MenuHostHelper$$ExternalSyntheticLambda1(r6)
        L5d:
            o.setBackgroundResource$setIconTintList r6 = r4.setY
            int r6 = r6.setY
            if (r6 != r1) goto L65
            r6 = 0
            goto L69
        L65:
            o.setBackgroundResource$setIconTintList r6 = r4.setY
            int r6 = r6.setY
        L69:
            o.setBackgroundResource$setIconTintList r7 = r4.setY
            float r7 = r7.MenuHostHelper$$ExternalSyntheticLambda0
            o.setBackgroundResource$setIconTintList r0 = r4.setY
            int r0 = r0.setX
            o.setContentHeight$setY r3 = r4.setX
            if (r3 == 0) goto L78
            r3.setY(r6, r7, r0)
        L78:
            o.setBackgroundResource$setIconTintList r6 = r4.setY
            int r6 = r6.setY
            int r7 = r4.setIconSize
            if (r6 == r7) goto L82
            if (r7 != r1) goto L92
        L82:
            o.setBackgroundResource$setIconTintList r6 = r4.setY
            int r6 = r6.setX
            if (r6 != 0) goto L92
            int r6 = r4.MenuHostHelper$$ExternalSyntheticLambda1
            if (r6 == r5) goto L92
            r4.MenuHostHelper$$ExternalSyntheticLambda1(r2)
            r4.setX()
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setBackgroundResource.setX(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0137, code lost:
        if (r5[r2 - 1][1] >= (r6 - r3)) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0160 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setY() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setBackgroundResource.setY():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(int i, boolean z) {
        setContentHeight.setY sety;
        this.setNavigationOnClickListener = z ? 2 : 3;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        boolean z2 = this.setIconSize != i;
        this.setIconSize = i;
        MenuHostHelper$$ExternalSyntheticLambda1(2);
        if (!z2 || (sety = this.setX) == null) {
            return;
        }
        sety.MenuHostHelper$$ExternalSyntheticLambda1(i);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        if ((this.setNavigationOnClickListener == 3 && this.MenuHostHelper$$ExternalSyntheticLambda1 == 0) || this.MenuHostHelper$$ExternalSyntheticLambda1 == i) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        setContentHeight.setY sety = this.setX;
        if (sety != null) {
            sety.MenuHostHelper$$ExternalSyntheticLambda0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        float MenuHostHelper$$ExternalSyntheticLambda0;
        int setX;
        int setY;

        setIconTintList() {
        }
    }
}