package o;

import java.util.Arrays;
import java.util.Comparator;
import o.setShortcut;

/* loaded from: classes.dex */
public final class setRootWindowInsets extends setShortcut {
    private setBoxStrokeWidthResource[] setIconSize;
    private setY setLayoutAnimation;
    private int setNavigationOnClickListener;
    private setCurrentTabByTag setOnLongClickListener;
    private setBoxStrokeWidthResource[] setUiOptions;
    private int setUnboundedRipple;

    /* loaded from: classes.dex */
    class setY {
        setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda0;
        private setRootWindowInsets setX;

        public setY(setRootWindowInsets setrootwindowinsets) {
            this.setX = setrootwindowinsets;
        }

        public final String toString() {
            String str = "[ ";
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0[i]);
                    sb.append(" ");
                    str = sb.toString();
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("] ");
            sb2.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            return sb2.toString();
        }
    }

    @Override // o.setShortcut, o.setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setUnboundedRipple = 0;
        this.setX = 0.0f;
    }

    public setRootWindowInsets(setCurrentTabByTag setcurrenttabbytag) {
        super(setcurrenttabbytag);
        this.setNavigationOnClickListener = 128;
        this.setUiOptions = new setBoxStrokeWidthResource[128];
        this.setIconSize = new setBoxStrokeWidthResource[128];
        this.setUnboundedRipple = 0;
        this.setLayoutAnimation = new setY(this);
        this.setOnLongClickListener = setcurrenttabbytag;
    }

    @Override // o.setShortcut, o.setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0
    public final boolean setY() {
        return this.setUnboundedRipple == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        if (r9 < r8) goto L33;
     */
    @Override // o.setShortcut, o.setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.setBoxStrokeWidthResource setIconTintList(boolean[] r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = -1
        L4:
            int r4 = r11.setUnboundedRipple
            if (r2 >= r4) goto L5c
            o.setBoxStrokeWidthResource[] r4 = r11.setUiOptions
            r4 = r4[r2]
            int r5 = r4.setY
            boolean r5 = r12[r5]
            if (r5 == 0) goto L13
            goto L59
        L13:
            o.setRootWindowInsets$setY r5 = r11.setLayoutAnimation
            r5.MenuHostHelper$$ExternalSyntheticLambda0 = r4
            r4 = 8
            r5 = 1
            if (r3 != r1) goto L37
            o.setRootWindowInsets$setY r6 = r11.setLayoutAnimation
        L1e:
            if (r4 < 0) goto L33
            o.setBoxStrokeWidthResource r7 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            float[] r7 = r7.MenuHostHelper$$ExternalSyntheticLambda0
            r7 = r7[r4]
            r8 = 0
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 > 0) goto L33
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L30
            goto L34
        L30:
            int r4 = r4 + (-1)
            goto L1e
        L33:
            r5 = 0
        L34:
            if (r5 == 0) goto L59
            goto L58
        L37:
            o.setRootWindowInsets$setY r6 = r11.setLayoutAnimation
            o.setBoxStrokeWidthResource[] r7 = r11.setUiOptions
            r7 = r7[r3]
        L3d:
            if (r4 < 0) goto L55
            float[] r8 = r7.MenuHostHelper$$ExternalSyntheticLambda0
            r8 = r8[r4]
            o.setBoxStrokeWidthResource r9 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            float[] r9 = r9.MenuHostHelper$$ExternalSyntheticLambda0
            r9 = r9[r4]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L50
            int r4 = r4 + (-1)
            goto L3d
        L50:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L55
            goto L56
        L55:
            r5 = 0
        L56:
            if (r5 == 0) goto L59
        L58:
            r3 = r2
        L59:
            int r2 = r2 + 1
            goto L4
        L5c:
            if (r3 != r1) goto L60
            r12 = 0
            return r12
        L60:
            o.setBoxStrokeWidthResource[] r12 = r11.setUiOptions
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setRootWindowInsets.setIconTintList(boolean[]):o.setBoxStrokeWidthResource");
    }

    @Override // o.setShortcut, o.setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0
    public final void setIconTintList(setBoxStrokeWidthResource setboxstrokewidthresource) {
        this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 = setboxstrokewidthresource;
        Arrays.fill(this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0, 0.0f);
        setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda0[setboxstrokewidthresource.setNavigationOnClickListener] = 1.0f;
        setY(setboxstrokewidthresource);
    }

    private final void setY(setBoxStrokeWidthResource setboxstrokewidthresource) {
        int i;
        int i2 = this.setUnboundedRipple;
        setBoxStrokeWidthResource[] setboxstrokewidthresourceArr = this.setUiOptions;
        if (i2 + 1 > setboxstrokewidthresourceArr.length) {
            setBoxStrokeWidthResource[] setboxstrokewidthresourceArr2 = (setBoxStrokeWidthResource[]) Arrays.copyOf(setboxstrokewidthresourceArr, setboxstrokewidthresourceArr.length << 1);
            this.setUiOptions = setboxstrokewidthresourceArr2;
            this.setIconSize = (setBoxStrokeWidthResource[]) Arrays.copyOf(setboxstrokewidthresourceArr2, setboxstrokewidthresourceArr2.length << 1);
        }
        setBoxStrokeWidthResource[] setboxstrokewidthresourceArr3 = this.setUiOptions;
        int i3 = this.setUnboundedRipple;
        setboxstrokewidthresourceArr3[i3] = setboxstrokewidthresource;
        int i4 = i3 + 1;
        this.setUnboundedRipple = i4;
        if (i4 > 1 && setboxstrokewidthresourceArr3[i4 - 1].setY > setboxstrokewidthresource.setY) {
            int i5 = 0;
            while (true) {
                i = this.setUnboundedRipple;
                if (i5 >= i) {
                    break;
                }
                this.setIconSize[i5] = this.setUiOptions[i5];
                i5++;
            }
            Arrays.sort(this.setIconSize, 0, i, new Comparator<setBoxStrokeWidthResource>() { // from class: o.setRootWindowInsets.2
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(setBoxStrokeWidthResource setboxstrokewidthresource2, setBoxStrokeWidthResource setboxstrokewidthresource3) {
                    return setboxstrokewidthresource2.setY - setboxstrokewidthresource3.setY;
                }
            });
            for (int i6 = 0; i6 < this.setUnboundedRipple; i6++) {
                this.setUiOptions[i6] = this.setIconSize[i6];
            }
        }
        setboxstrokewidthresource.setOnLongClickListener = true;
        setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda0(this);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeWidthResource setboxstrokewidthresource) {
        int i = 0;
        while (i < this.setUnboundedRipple) {
            if (this.setUiOptions[i] == setboxstrokewidthresource) {
                while (true) {
                    int i2 = this.setUnboundedRipple - 1;
                    if (i < i2) {
                        setBoxStrokeWidthResource[] setboxstrokewidthresourceArr = this.setUiOptions;
                        int i3 = i + 1;
                        setboxstrokewidthresourceArr[i] = setboxstrokewidthresourceArr[i3];
                        i = i3;
                    } else {
                        this.setUnboundedRipple = i2;
                        setboxstrokewidthresource.setOnLongClickListener = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // o.setShortcut
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled, setShortcut setshortcut, boolean z) {
        setBoxStrokeWidthResource setboxstrokewidthresource = setshortcut.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setboxstrokewidthresource == null) {
            return;
        }
        setShortcut.setIconTintList seticontintlist = setshortcut.setY;
        int x = seticontintlist.setX();
        for (int i = 0; i < x; i++) {
            setBoxStrokeWidthResource y = seticontintlist.setY(i);
            float iconTintList = seticontintlist.setIconTintList(i);
            this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 = y;
            setY sety = this.setLayoutAnimation;
            boolean z2 = true;
            if (sety.MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr = sety.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                    fArr[i2] = fArr[i2] + (setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda0[i2] * iconTintList);
                    if (Math.abs(sety.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0[i2]) < 1.0E-4f) {
                        sety.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    setRootWindowInsets.this.MenuHostHelper$$ExternalSyntheticLambda0(sety.MenuHostHelper$$ExternalSyntheticLambda0);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f = setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda0[i3];
                    if (f != 0.0f) {
                        float f2 = f * iconTintList;
                        if (Math.abs(f2) < 1.0E-4f) {
                            f2 = 0.0f;
                        }
                        sety.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0[i3] = f2;
                    } else {
                        sety.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0[i3] = 0.0f;
                    }
                }
            }
            if (z2) {
                setY(y);
            }
            this.setX += setshortcut.setX * iconTintList;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(setboxstrokewidthresource);
    }

    @Override // o.setShortcut
    public final String toString() {
        StringBuilder sb = new StringBuilder(" goal -> (");
        sb.append(this.setX);
        sb.append(") : ");
        String obj = sb.toString();
        for (int i = 0; i < this.setUnboundedRipple; i++) {
            this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 = this.setUiOptions[i];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(this.setLayoutAnimation);
            sb2.append(" ");
            obj = sb2.toString();
        }
        return obj;
    }
}