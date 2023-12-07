package o;

import java.util.ArrayList;
import o.setBoxStrokeWidthResource;

/* loaded from: classes.dex */
public class setShortcut implements setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0 {
    public setIconTintList setY;
    setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda0 = null;
    public float setX = 0.0f;
    boolean setIconTintList = false;
    private ArrayList<setBoxStrokeWidthResource> setLayoutAnimation = new ArrayList<>();
    boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;

    /* loaded from: classes.dex */
    public interface setIconTintList {
        void MenuHostHelper$$ExternalSyntheticLambda0();

        boolean MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeWidthResource setboxstrokewidthresource);

        float MenuHostHelper$$ExternalSyntheticLambda1(setShortcut setshortcut, boolean z);

        void MenuHostHelper$$ExternalSyntheticLambda1(setBoxStrokeWidthResource setboxstrokewidthresource, float f, boolean z);

        float setIconTintList(int i);

        float setIconTintList(setBoxStrokeWidthResource setboxstrokewidthresource);

        void setIconTintList(float f);

        int setX();

        float setY(setBoxStrokeWidthResource setboxstrokewidthresource, boolean z);

        setBoxStrokeWidthResource setY(int i);

        void setY();

        void setY(setBoxStrokeWidthResource setboxstrokewidthresource, float f);
    }

    public setShortcut() {
    }

    public setShortcut(setCurrentTabByTag setcurrenttabbytag) {
        this.setY = new getLoadPriority(this, setcurrenttabbytag);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        setBoxStrokeWidthResource setboxstrokewidthresource = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return setboxstrokewidthresource != null && (setboxstrokewidthresource.setLayoutAnimation == setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED || this.setX >= 0.0f);
    }

    public final setShortcut setY(setBoxStrokeWidthResource setboxstrokewidthresource, setBoxStrokeWidthResource setboxstrokewidthresource2, setBoxStrokeWidthResource setboxstrokewidthresource3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.setX = i;
        }
        if (!z) {
            this.setY.setY(setboxstrokewidthresource, -1.0f);
            this.setY.setY(setboxstrokewidthresource2, 1.0f);
            this.setY.setY(setboxstrokewidthresource3, 1.0f);
        } else {
            this.setY.setY(setboxstrokewidthresource, 1.0f);
            this.setY.setY(setboxstrokewidthresource2, -1.0f);
            this.setY.setY(setboxstrokewidthresource3, -1.0f);
        }
        return this;
    }

    public final setShortcut setIconTintList(setBoxStrokeWidthResource setboxstrokewidthresource, setBoxStrokeWidthResource setboxstrokewidthresource2, setBoxStrokeWidthResource setboxstrokewidthresource3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.setX = i;
        }
        if (!z) {
            this.setY.setY(setboxstrokewidthresource, -1.0f);
            this.setY.setY(setboxstrokewidthresource2, 1.0f);
            this.setY.setY(setboxstrokewidthresource3, -1.0f);
        } else {
            this.setY.setY(setboxstrokewidthresource, 1.0f);
            this.setY.setY(setboxstrokewidthresource2, -1.0f);
            this.setY.setY(setboxstrokewidthresource3, 1.0f);
        }
        return this;
    }

    public final setShortcut MenuHostHelper$$ExternalSyntheticLambda1(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled, int i) {
        this.setY.setY(setwebcontentsdebuggingenabled.setY(i, "ep"), 1.0f);
        this.setY.setY(setwebcontentsdebuggingenabled.setY(i, "em"), -1.0f);
        return this;
    }

    public final setShortcut setIconTintList(setBoxStrokeWidthResource setboxstrokewidthresource, setBoxStrokeWidthResource setboxstrokewidthresource2, setBoxStrokeWidthResource setboxstrokewidthresource3, setBoxStrokeWidthResource setboxstrokewidthresource4, float f) {
        this.setY.setY(setboxstrokewidthresource, -1.0f);
        this.setY.setY(setboxstrokewidthresource2, 1.0f);
        this.setY.setY(setboxstrokewidthresource3, f);
        this.setY.setY(setboxstrokewidthresource4, -f);
        return this;
    }

    public final setShortcut MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeWidthResource setboxstrokewidthresource, setBoxStrokeWidthResource setboxstrokewidthresource2, setBoxStrokeWidthResource setboxstrokewidthresource3, setBoxStrokeWidthResource setboxstrokewidthresource4, float f) {
        this.setY.setY(setboxstrokewidthresource3, 0.5f);
        this.setY.setY(setboxstrokewidthresource4, 0.5f);
        this.setY.setY(setboxstrokewidthresource, -0.5f);
        this.setY.setY(setboxstrokewidthresource2, -0.5f);
        this.setX = -f;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setBoxStrokeWidthResource setboxstrokewidthresource) {
        setBoxStrokeWidthResource setboxstrokewidthresource2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setboxstrokewidthresource2 != null) {
            this.setY.setY(setboxstrokewidthresource2, -1.0f);
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        }
        float f = -this.setY.setY(setboxstrokewidthresource, true);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setboxstrokewidthresource;
        if (f == 1.0f) {
            return;
        }
        this.setX /= f;
        this.setY.setIconTintList(f);
    }

    @Override // o.setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0
    public boolean setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0 == null && this.setX == 0.0f && this.setY.setX() == 0;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled, setShortcut setshortcut, boolean z) {
        this.setX += setshortcut.setX * this.setY.MenuHostHelper$$ExternalSyntheticLambda1(setshortcut, z);
        if (z) {
            setshortcut.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this);
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null || this.setY.setX() != 0) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0 = true;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled, setBoxStrokeWidthResource setboxstrokewidthresource, boolean z) {
        if (setboxstrokewidthresource == null || !setboxstrokewidthresource.setUnboundedRipple) {
            return;
        }
        this.setX += setboxstrokewidthresource.setIconTintList * this.setY.setIconTintList(setboxstrokewidthresource);
        this.setY.setY(setboxstrokewidthresource, z);
        if (z) {
            setboxstrokewidthresource.setIconTintList(this);
        }
        if (this.setY.setX() == 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setBoxStrokeWidthResource setX(boolean[] zArr, setBoxStrokeWidthResource setboxstrokewidthresource) {
        int x = this.setY.setX();
        setBoxStrokeWidthResource setboxstrokewidthresource2 = null;
        float f = 0.0f;
        for (int i = 0; i < x; i++) {
            float iconTintList = this.setY.setIconTintList(i);
            if (iconTintList < 0.0f) {
                setBoxStrokeWidthResource y = this.setY.setY(i);
                if ((zArr == null || !zArr[y.setY]) && y != setboxstrokewidthresource && ((y.setLayoutAnimation == setBoxStrokeWidthResource.setIconTintList.SLACK || y.setLayoutAnimation == setBoxStrokeWidthResource.setIconTintList.ERROR) && iconTintList < f)) {
                    f = iconTintList;
                    setboxstrokewidthresource2 = y;
                }
            }
        }
        return setboxstrokewidthresource2;
    }

    @Override // o.setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0
    public setBoxStrokeWidthResource setIconTintList(boolean[] zArr) {
        return setX(zArr, null);
    }

    @Override // o.setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0
    public void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        this.setX = 0.0f;
    }

    @Override // o.setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0
    public final void setY(setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0 setwebcontentsdebuggingenabled_menuhosthelper__externalsyntheticlambda0) {
        if (setwebcontentsdebuggingenabled_menuhosthelper__externalsyntheticlambda0 instanceof setShortcut) {
            setShortcut setshortcut = (setShortcut) setwebcontentsdebuggingenabled_menuhosthelper__externalsyntheticlambda0;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            this.setY.MenuHostHelper$$ExternalSyntheticLambda0();
            for (int i = 0; i < setshortcut.setY.setX(); i++) {
                this.setY.MenuHostHelper$$ExternalSyntheticLambda1(setshortcut.setY.setY(i), setshortcut.setY.setIconTintList(i), true);
            }
        }
    }

    @Override // o.setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0
    public void setIconTintList(setBoxStrokeWidthResource setboxstrokewidthresource) {
        float f;
        if (setboxstrokewidthresource.setNavigationOnClickListener != 1) {
            if (setboxstrokewidthresource.setNavigationOnClickListener == 2) {
                f = 1000.0f;
            } else if (setboxstrokewidthresource.setNavigationOnClickListener == 3) {
                f = 1000000.0f;
            } else if (setboxstrokewidthresource.setNavigationOnClickListener == 4) {
                f = 1.0E9f;
            } else if (setboxstrokewidthresource.setNavigationOnClickListener == 5) {
                f = 1.0E12f;
            }
            this.setY.setY(setboxstrokewidthresource, f);
        }
        f = 1.0f;
        this.setY.setY(setboxstrokewidthresource, f);
    }

    @Override // o.setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0
    public final setBoxStrokeWidthResource setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled) {
        if (setwebcontentsdebuggingenabled.setIconTintList.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int x = this.setY.setX();
            for (int i = 0; i < x; i++) {
                setBoxStrokeWidthResource y = this.setY.setY(i);
                if (y.MenuHostHelper$$ExternalSyntheticLambda1 != -1 || y.setUnboundedRipple) {
                    this.setLayoutAnimation.add(y);
                } else {
                    boolean z2 = y.setUiOptions;
                }
            }
            int size = this.setLayoutAnimation.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    setBoxStrokeWidthResource setboxstrokewidthresource = this.setLayoutAnimation.get(i2);
                    if (setboxstrokewidthresource.setUnboundedRipple) {
                        MenuHostHelper$$ExternalSyntheticLambda0(setwebcontentsdebuggingenabled, setboxstrokewidthresource, true);
                    } else {
                        boolean z3 = setboxstrokewidthresource.setUiOptions;
                        MenuHostHelper$$ExternalSyntheticLambda1(setwebcontentsdebuggingenabled, setwebcontentsdebuggingenabled.setIconTintList[setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda1], true);
                    }
                }
                this.setLayoutAnimation.clear();
            } else {
                z = true;
            }
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null || this.setY.setX() != 0) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r11.setTextAlignment > 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        r7 = r10;
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
        if (r11.setTextAlignment > 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005d, code lost:
        if (r11.setTextAlignment > 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
        r8 = r10;
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r11.setTextAlignment > 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setX(o.setWebContentsDebuggingEnabled r15) {
        /*
            r14 = this;
            o.setShortcut$setIconTintList r15 = r14.setY
            int r15 = r15.setX()
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = r0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        Lf:
            r9 = 1
            if (r4 >= r15) goto L74
            o.setShortcut$setIconTintList r10 = r14.setY
            float r10 = r10.setIconTintList(r4)
            o.setShortcut$setIconTintList r11 = r14.setY
            o.setBoxStrokeWidthResource r11 = r11.setY(r4)
            o.setBoxStrokeWidthResource$setIconTintList r12 = r11.setLayoutAnimation
            o.setBoxStrokeWidthResource$setIconTintList r13 = o.setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED
            if (r12 != r13) goto L48
            if (r0 != 0) goto L2d
            int r0 = r11.setTextAlignment
            if (r0 <= r9) goto L2b
        L2a:
            r9 = 0
        L2b:
            r5 = r9
            goto L36
        L2d:
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 <= 0) goto L39
            int r0 = r11.setTextAlignment
            if (r0 <= r9) goto L2b
            goto L2a
        L36:
            r7 = r10
            r0 = r11
            goto L71
        L39:
            if (r5 != 0) goto L71
            int r12 = r11.setTextAlignment
            if (r12 <= r9) goto L41
            r12 = 0
            goto L42
        L41:
            r12 = 1
        L42:
            if (r12 == 0) goto L71
            r7 = r10
            r0 = r11
            r5 = 1
            goto L71
        L48:
            if (r0 != 0) goto L71
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 >= 0) goto L71
            if (r3 != 0) goto L57
            int r3 = r11.setTextAlignment
            if (r3 <= r9) goto L55
        L54:
            r9 = 0
        L55:
            r6 = r9
            goto L60
        L57:
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L63
            int r3 = r11.setTextAlignment
            if (r3 <= r9) goto L55
            goto L54
        L60:
            r8 = r10
            r3 = r11
            goto L71
        L63:
            if (r6 != 0) goto L71
            int r12 = r11.setTextAlignment
            if (r12 <= r9) goto L6b
            r12 = 0
            goto L6c
        L6b:
            r12 = 1
        L6c:
            if (r12 == 0) goto L71
            r8 = r10
            r3 = r11
            r6 = 1
        L71:
            int r4 = r4 + 1
            goto Lf
        L74:
            if (r0 == 0) goto L77
            goto L78
        L77:
            r0 = r3
        L78:
            if (r0 != 0) goto L7c
            r2 = 1
            goto L7f
        L7c:
            r14.MenuHostHelper$$ExternalSyntheticLambda1(r0)
        L7f:
            o.setShortcut$setIconTintList r15 = r14.setY
            int r15 = r15.setX()
            if (r15 != 0) goto L89
            r14.MenuHostHelper$$ExternalSyntheticLambda1 = r9
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setShortcut.setX(o.setWebContentsDebuggingEnabled):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            o.setBoxStrokeWidthResource r0 = r9.MenuHostHelper$$ExternalSyntheticLambda0
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            o.setBoxStrokeWidthResource r1 = r9.MenuHostHelper$$ExternalSyntheticLambda0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.setX
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.setX
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L45
        L44:
            r1 = 0
        L45:
            o.setShortcut$setIconTintList r5 = r9.setY
            int r5 = r5.setX()
        L4b:
            if (r2 >= r5) goto Ld3
            o.setShortcut$setIconTintList r6 = r9.setY
            o.setBoxStrokeWidthResource r6 = r6.setY(r2)
            if (r6 == 0) goto Lcf
            o.setShortcut$setIconTintList r7 = r9.setY
            float r7 = r7.setIconTintList(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 == 0) goto Lcf
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L7b
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto La1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto La0
        L7b:
            if (r8 <= 0) goto L8f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto La1
        L8f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        La0:
            float r7 = -r7
        La1:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto Lce
        Lb7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        Lce:
            r1 = 1
        Lcf:
            int r2 = r2 + 1
            goto L4b
        Ld3:
            if (r1 != 0) goto Le6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setShortcut.toString():java.lang.String");
    }
}