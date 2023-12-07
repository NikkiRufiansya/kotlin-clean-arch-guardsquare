package o;

import java.util.Arrays;
import java.util.HashMap;
import o.setBoxStrokeWidthResource;

/* loaded from: classes.dex */
public final class setWebContentsDebuggingEnabled {
    public static boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    private static long setLayoutAnimation = 0;
    private static int setUiOptions = 1000;
    private setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0 ViewPager$SavedState$1;
    setShortcut[] setIconTintList;
    private setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0 setMaxEms;
    public final setCurrentTabByTag setX;
    public boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
    private int setZ = 0;
    private HashMap<String, setBoxStrokeWidthResource> setAnimationFromJson = null;
    private int setUnboundedRipple = 32;
    private int setIconSize = 32;
    public boolean setY = false;
    public boolean setOnLongClickListener = false;
    private boolean[] setNavigationOnClickListener = new boolean[32];
    private int setTextAlignment = 1;
    private int setCenterIfNoTextEnabled = 0;
    private int setChipCornerRadius = 32;
    private setBoxStrokeWidthResource[] setTextScaleX = new setBoxStrokeWidthResource[setUiOptions];
    private int setOnNavigationItemSelectedListener = 0;

    public setWebContentsDebuggingEnabled() {
        this.setIconTintList = null;
        this.setIconTintList = new setShortcut[32];
        setOnLongClickListener();
        setCurrentTabByTag setcurrenttabbytag = new setCurrentTabByTag();
        this.setX = setcurrenttabbytag;
        this.ViewPager$SavedState$1 = new setRootWindowInsets(setcurrenttabbytag);
        this.setMaxEms = new setShortcut(setcurrenttabbytag);
    }

    private void setUiOptions() {
        int i = this.setUnboundedRipple << 1;
        this.setUnboundedRipple = i;
        this.setIconTintList = (setShortcut[]) Arrays.copyOf(this.setIconTintList, i);
        setCurrentTabByTag setcurrenttabbytag = this.setX;
        setcurrenttabbytag.MenuHostHelper$$ExternalSyntheticLambda1 = (setBoxStrokeWidthResource[]) Arrays.copyOf(setcurrenttabbytag.MenuHostHelper$$ExternalSyntheticLambda1, this.setUnboundedRipple);
        int i2 = this.setUnboundedRipple;
        this.setNavigationOnClickListener = new boolean[i2];
        this.setIconSize = i2;
        this.setChipCornerRadius = i2;
    }

    private void setOnLongClickListener() {
        for (int i = 0; i < this.setCenterIfNoTextEnabled; i++) {
            setShortcut setshortcut = this.setIconTintList[i];
            if (setshortcut != null) {
                this.setX.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setshortcut);
            }
            this.setIconTintList[i] = null;
        }
    }

    public final void setX() {
        for (int i = 0; i < this.setX.MenuHostHelper$$ExternalSyntheticLambda1.length; i++) {
            setBoxStrokeWidthResource setboxstrokewidthresource = this.setX.MenuHostHelper$$ExternalSyntheticLambda1[i];
            if (setboxstrokewidthresource != null) {
                setboxstrokewidthresource.setX();
            }
        }
        this.setX.setIconTintList.setY(this.setTextScaleX, this.setOnNavigationItemSelectedListener);
        this.setOnNavigationItemSelectedListener = 0;
        Arrays.fill(this.setX.MenuHostHelper$$ExternalSyntheticLambda1, (Object) null);
        this.setZ = 0;
        this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0();
        this.setTextAlignment = 1;
        for (int i2 = 0; i2 < this.setCenterIfNoTextEnabled; i2++) {
            setShortcut setshortcut = this.setIconTintList[i2];
            if (setshortcut != null) {
                setshortcut.setIconTintList = false;
            }
        }
        setOnLongClickListener();
        this.setCenterIfNoTextEnabled = 0;
        this.setMaxEms = new setShortcut(this.setX);
    }

    public final setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        setBoxStrokeWidthResource setboxstrokewidthresource = null;
        if (obj == null) {
            return null;
        }
        if (this.setTextAlignment + 1 >= this.setIconSize) {
            setUiOptions();
        }
        if (obj instanceof zzD) {
            zzD zzd = (zzD) obj;
            setboxstrokewidthresource = zzd.setUiOptions;
            if (setboxstrokewidthresource == null) {
                setBoxStrokeWidthResource setboxstrokewidthresource2 = zzd.setUiOptions;
                if (setboxstrokewidthresource2 == null) {
                    zzd.setUiOptions = new setBoxStrokeWidthResource(setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED);
                } else {
                    setboxstrokewidthresource2.setX();
                }
                setboxstrokewidthresource = zzd.setUiOptions;
            }
            if (setboxstrokewidthresource.setY == -1 || setboxstrokewidthresource.setY > this.setZ || this.setX.MenuHostHelper$$ExternalSyntheticLambda1[setboxstrokewidthresource.setY] == null) {
                if (setboxstrokewidthresource.setY != -1) {
                    setboxstrokewidthresource.setX();
                }
                int i = this.setZ + 1;
                this.setZ = i;
                this.setTextAlignment++;
                setboxstrokewidthresource.setY = i;
                setboxstrokewidthresource.setLayoutAnimation = setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED;
                this.setX.MenuHostHelper$$ExternalSyntheticLambda1[this.setZ] = setboxstrokewidthresource;
            }
        }
        return setboxstrokewidthresource;
    }

    public final setShortcut setY() {
        setShortcut y = this.setX.MenuHostHelper$$ExternalSyntheticLambda0.setY();
        if (y == null) {
            y = new setShortcut(this.setX);
            setLayoutAnimation++;
        } else {
            y.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            y.setY.MenuHostHelper$$ExternalSyntheticLambda0();
            y.setX = 0.0f;
            y.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        }
        setBoxStrokeWidthResource.setX++;
        return y;
    }

    public final setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setTextAlignment + 1 >= this.setIconSize) {
            setUiOptions();
        }
        setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeWidthResource.setIconTintList.SLACK);
        int i = this.setZ + 1;
        this.setZ = i;
        this.setTextAlignment++;
        MenuHostHelper$$ExternalSyntheticLambda0.setY = i;
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1[this.setZ] = MenuHostHelper$$ExternalSyntheticLambda0;
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    private setBoxStrokeWidthResource setLayoutAnimation() {
        if (this.setTextAlignment + 1 >= this.setIconSize) {
            setUiOptions();
        }
        setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeWidthResource.setIconTintList.SLACK);
        int i = this.setZ + 1;
        this.setZ = i;
        this.setTextAlignment++;
        MenuHostHelper$$ExternalSyntheticLambda0.setY = i;
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1[this.setZ] = MenuHostHelper$$ExternalSyntheticLambda0;
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final setBoxStrokeWidthResource setY(int i, String str) {
        if (this.setTextAlignment + 1 >= this.setIconSize) {
            setUiOptions();
        }
        setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeWidthResource.setIconTintList.ERROR);
        int i2 = this.setZ + 1;
        this.setZ = i2;
        this.setTextAlignment++;
        MenuHostHelper$$ExternalSyntheticLambda0.setY = i2;
        MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener = i;
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1[this.setZ] = MenuHostHelper$$ExternalSyntheticLambda0;
        this.ViewPager$SavedState$1.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0);
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    private setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeWidthResource.setIconTintList seticontintlist) {
        setBoxStrokeWidthResource y = this.setX.setIconTintList.setY();
        if (y == null) {
            y = new setBoxStrokeWidthResource(seticontintlist);
            y.setLayoutAnimation = seticontintlist;
        } else {
            y.setX();
            y.setLayoutAnimation = seticontintlist;
        }
        int i = this.setOnNavigationItemSelectedListener;
        int i2 = setUiOptions;
        if (i >= i2) {
            int i3 = i2 << 1;
            setUiOptions = i3;
            this.setTextScaleX = (setBoxStrokeWidthResource[]) Arrays.copyOf(this.setTextScaleX, i3);
        }
        setBoxStrokeWidthResource[] setboxstrokewidthresourceArr = this.setTextScaleX;
        int i4 = this.setOnNavigationItemSelectedListener;
        this.setOnNavigationItemSelectedListener = i4 + 1;
        setboxstrokewidthresourceArr[i4] = y;
        return y;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.ViewPager$SavedState$1.setY()) {
            setIconTintList();
        } else if (!this.setOnLongClickListener) {
            setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0 setwebcontentsdebuggingenabled_menuhosthelper__externalsyntheticlambda0 = this.ViewPager$SavedState$1;
            setUnboundedRipple();
            setX(setwebcontentsdebuggingenabled_menuhosthelper__externalsyntheticlambda0);
            setIconTintList();
        } else {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.setCenterIfNoTextEnabled) {
                    z = true;
                    break;
                } else if (!this.setIconTintList[i].MenuHostHelper$$ExternalSyntheticLambda1) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0 setwebcontentsdebuggingenabled_menuhosthelper__externalsyntheticlambda02 = this.ViewPager$SavedState$1;
                setUnboundedRipple();
                setX(setwebcontentsdebuggingenabled_menuhosthelper__externalsyntheticlambda02);
                setIconTintList();
                return;
            }
            setIconTintList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(o.setShortcut r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.setCenterIfNoTextEnabled
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.setChipCornerRadius
            if (r0 >= r2) goto L12
            int r0 = r5.setTextAlignment
            int r0 = r0 + r1
            int r2 = r5.setIconSize
            if (r0 < r2) goto L15
        L12:
            r5.setUiOptions()
        L15:
            boolean r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            r2 = 0
            if (r0 != 0) goto L85
            r6.MenuHostHelper$$ExternalSyntheticLambda0(r5)
            boolean r0 = r6.setY()
            if (r0 == 0) goto L24
            return
        L24:
            float r0 = r6.setX
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L33
            float r0 = -r0
            r6.setX = r0
            o.setShortcut$setIconTintList r0 = r6.setY
            r0.setY()
        L33:
            boolean r0 = r6.setX(r5)
            if (r0 == 0) goto L7c
            o.setBoxStrokeWidthResource r0 = r5.setLayoutAnimation()
            r6.MenuHostHelper$$ExternalSyntheticLambda0 = r0
            int r3 = r5.setCenterIfNoTextEnabled
            r5.setX(r6)
            int r4 = r5.setCenterIfNoTextEnabled
            int r3 = r3 + r1
            if (r4 != r3) goto L7c
            o.setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0 r2 = r5.setMaxEms
            r2.setY(r6)
            o.setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0 r2 = r5.setMaxEms
            r5.setX(r2)
            int r2 = r0.MenuHostHelper$$ExternalSyntheticLambda1
            r3 = -1
            if (r2 != r3) goto L7d
            o.setBoxStrokeWidthResource r2 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            if (r2 != r0) goto L66
            r2 = 0
            o.setBoxStrokeWidthResource r0 = r6.setX(r2, r0)
            if (r0 == 0) goto L66
            r6.MenuHostHelper$$ExternalSyntheticLambda1(r0)
        L66:
            boolean r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            if (r0 != 0) goto L6f
            o.setBoxStrokeWidthResource r0 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            r0.setX(r5, r6)
        L6f:
            o.setCurrentTabByTag r0 = r5.setX
            o.setHapticFeedbackEnabled$MenuHostHelper$$ExternalSyntheticLambda0<o.setShortcut> r0 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            r0.MenuHostHelper$$ExternalSyntheticLambda1(r6)
            int r0 = r5.setCenterIfNoTextEnabled
            int r0 = r0 - r1
            r5.setCenterIfNoTextEnabled = r0
            goto L7d
        L7c:
            r1 = 0
        L7d:
            boolean r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1()
            if (r0 != 0) goto L84
            return
        L84:
            r2 = r1
        L85:
            if (r2 != 0) goto L8a
            r5.setX(r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setWebContentsDebuggingEnabled.MenuHostHelper$$ExternalSyntheticLambda1(o.setShortcut):void");
    }

    private final void setX(setShortcut setshortcut) {
        int i;
        if (setshortcut.MenuHostHelper$$ExternalSyntheticLambda1) {
            setshortcut.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this, setshortcut.setX);
        } else {
            this.setIconTintList[this.setCenterIfNoTextEnabled] = setshortcut;
            setshortcut.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = this.setCenterIfNoTextEnabled;
            this.setCenterIfNoTextEnabled++;
            setshortcut.MenuHostHelper$$ExternalSyntheticLambda0.setX(this, setshortcut);
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            int i2 = 0;
            while (i2 < this.setCenterIfNoTextEnabled) {
                if (this.setIconTintList[i2] == null) {
                    System.out.println("WTF");
                }
                setShortcut setshortcut2 = this.setIconTintList[i2];
                if (setshortcut2 != null && setshortcut2.MenuHostHelper$$ExternalSyntheticLambda1) {
                    setShortcut setshortcut3 = this.setIconTintList[i2];
                    setshortcut3.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this, setshortcut3.setX);
                    this.setX.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setshortcut3);
                    this.setIconTintList[i2] = null;
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (true) {
                        i = this.setCenterIfNoTextEnabled;
                        if (i3 >= i) {
                            break;
                        }
                        setShortcut[] setshortcutArr = this.setIconTintList;
                        int i5 = i3 - 1;
                        setShortcut setshortcut4 = setshortcutArr[i3];
                        setshortcutArr[i5] = setshortcut4;
                        if (setshortcut4.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 == i3) {
                            this.setIconTintList[i5].MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = i5;
                        }
                        i4 = i3;
                        i3++;
                    }
                    if (i4 < i) {
                        this.setIconTintList[i4] = null;
                    }
                    this.setCenterIfNoTextEnabled = i - 1;
                    i2--;
                }
                i2++;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        }
    }

    private final int setX(setWebContentsDebuggingEnabled$MenuHostHelper$$ExternalSyntheticLambda0 setwebcontentsdebuggingenabled_menuhosthelper__externalsyntheticlambda0) {
        for (int i = 0; i < this.setTextAlignment; i++) {
            this.setNavigationOnClickListener[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= (this.setTextAlignment << 1)) {
                return i2;
            }
            if (setwebcontentsdebuggingenabled_menuhosthelper__externalsyntheticlambda0.setIconTintList() != null) {
                this.setNavigationOnClickListener[setwebcontentsdebuggingenabled_menuhosthelper__externalsyntheticlambda0.setIconTintList().setY] = true;
            }
            setBoxStrokeWidthResource iconTintList = setwebcontentsdebuggingenabled_menuhosthelper__externalsyntheticlambda0.setIconTintList(this.setNavigationOnClickListener);
            if (iconTintList != null) {
                if (this.setNavigationOnClickListener[iconTintList.setY]) {
                    return i2;
                }
                this.setNavigationOnClickListener[iconTintList.setY] = true;
            }
            if (iconTintList != null) {
                float f = Float.MAX_VALUE;
                int i3 = -1;
                for (int i4 = 0; i4 < this.setCenterIfNoTextEnabled; i4++) {
                    setShortcut setshortcut = this.setIconTintList[i4];
                    if (setshortcut.MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation != setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED && !setshortcut.MenuHostHelper$$ExternalSyntheticLambda1 && setshortcut.setY.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList)) {
                        float iconTintList2 = setshortcut.setY.setIconTintList(iconTintList);
                        if (iconTintList2 < 0.0f) {
                            float f2 = (-setshortcut.setX) / iconTintList2;
                            if (f2 < f) {
                                i3 = i4;
                                f = f2;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    setShortcut setshortcut2 = this.setIconTintList[i3];
                    setshortcut2.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
                    setshortcut2.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList);
                    setshortcut2.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
                    setshortcut2.MenuHostHelper$$ExternalSyntheticLambda0.setX(this, setshortcut2);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    private int setUnboundedRipple() {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.setCenterIfNoTextEnabled) {
                z = false;
                break;
            } else if (this.setIconTintList[i].MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation != setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED && this.setIconTintList[i].setX < 0.0f) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                i2++;
                float f2 = Float.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                while (i3 < this.setCenterIfNoTextEnabled) {
                    setShortcut setshortcut = this.setIconTintList[i3];
                    if (setshortcut.MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation != setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED && !setshortcut.MenuHostHelper$$ExternalSyntheticLambda1 && setshortcut.setX < f) {
                        int x = setshortcut.setY.setX();
                        int i7 = 0;
                        while (i7 < x) {
                            setBoxStrokeWidthResource y = setshortcut.setY.setY(i7);
                            float iconTintList = setshortcut.setY.setIconTintList(y);
                            if (iconTintList > f) {
                                for (int i8 = 0; i8 < 9; i8++) {
                                    float f3 = y.setChipCornerRadius[i8] / iconTintList;
                                    if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                        i5 = y.setY;
                                        i6 = i8;
                                        f2 = f3;
                                        i4 = i3;
                                    }
                                }
                            }
                            i7++;
                            f = 0.0f;
                        }
                    }
                    i3++;
                    f = 0.0f;
                }
                if (i4 != -1) {
                    setShortcut setshortcut2 = this.setIconTintList[i4];
                    setshortcut2.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
                    setshortcut2.MenuHostHelper$$ExternalSyntheticLambda1(this.setX.MenuHostHelper$$ExternalSyntheticLambda1[i5]);
                    setshortcut2.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = i4;
                    setshortcut2.MenuHostHelper$$ExternalSyntheticLambda0.setX(this, setshortcut2);
                } else {
                    z2 = true;
                }
                if (i2 > this.setTextAlignment / 2) {
                    z2 = true;
                }
                f = 0.0f;
            }
            return i2;
        }
        return 0;
    }

    private void setIconTintList() {
        for (int i = 0; i < this.setCenterIfNoTextEnabled; i++) {
            setShortcut setshortcut = this.setIconTintList[i];
            setshortcut.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList = setshortcut.setX;
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(setBoxStrokeWidthResource setboxstrokewidthresource, setBoxStrokeWidthResource setboxstrokewidthresource2, int i, int i2) {
        setShortcut y = setY();
        setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda12.setNavigationOnClickListener = 0;
        y.setY(setboxstrokewidthresource, setboxstrokewidthresource2, MenuHostHelper$$ExternalSyntheticLambda12, i);
        if (i2 != 8) {
            y.setY.setY(setY(i2, null), (int) (-y.setY.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12)));
        }
        MenuHostHelper$$ExternalSyntheticLambda1(y);
    }

    public final void setX(setBoxStrokeWidthResource setboxstrokewidthresource, setBoxStrokeWidthResource setboxstrokewidthresource2, int i, int i2) {
        setShortcut y = setY();
        setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda12.setNavigationOnClickListener = 0;
        y.setIconTintList(setboxstrokewidthresource, setboxstrokewidthresource2, MenuHostHelper$$ExternalSyntheticLambda12, i);
        if (i2 != 8) {
            y.setY.setY(setY(i2, null), (int) (-y.setY.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12)));
        }
        MenuHostHelper$$ExternalSyntheticLambda1(y);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeWidthResource setboxstrokewidthresource, setBoxStrokeWidthResource setboxstrokewidthresource2, int i, float f, setBoxStrokeWidthResource setboxstrokewidthresource3, setBoxStrokeWidthResource setboxstrokewidthresource4, int i2, int i3) {
        setShortcut y = setY();
        if (setboxstrokewidthresource2 == setboxstrokewidthresource3) {
            y.setY.setY(setboxstrokewidthresource, 1.0f);
            y.setY.setY(setboxstrokewidthresource4, 1.0f);
            y.setY.setY(setboxstrokewidthresource2, -2.0f);
        } else if (f == 0.5f) {
            y.setY.setY(setboxstrokewidthresource, 1.0f);
            y.setY.setY(setboxstrokewidthresource2, -1.0f);
            y.setY.setY(setboxstrokewidthresource3, -1.0f);
            y.setY.setY(setboxstrokewidthresource4, 1.0f);
            if (i > 0 || i2 > 0) {
                y.setX = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            y.setY.setY(setboxstrokewidthresource, -1.0f);
            y.setY.setY(setboxstrokewidthresource2, 1.0f);
            y.setX = i;
        } else if (f >= 1.0f) {
            y.setY.setY(setboxstrokewidthresource4, -1.0f);
            y.setY.setY(setboxstrokewidthresource3, 1.0f);
            y.setX = -i2;
        } else {
            float f2 = 1.0f - f;
            y.setY.setY(setboxstrokewidthresource, f2);
            y.setY.setY(setboxstrokewidthresource2, -f2);
            y.setY.setY(setboxstrokewidthresource3, (-1.0f) * f);
            y.setY.setY(setboxstrokewidthresource4, f);
            if (i > 0 || i2 > 0) {
                y.setX = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            y.MenuHostHelper$$ExternalSyntheticLambda1(this, i3);
        }
        MenuHostHelper$$ExternalSyntheticLambda1(y);
    }

    public final setShortcut MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeWidthResource setboxstrokewidthresource, setBoxStrokeWidthResource setboxstrokewidthresource2, int i, int i2) {
        if (i2 == 8 && setboxstrokewidthresource2.setUnboundedRipple && setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
            setboxstrokewidthresource.setIconTintList(this, setboxstrokewidthresource2.setIconTintList + i);
            return null;
        }
        setShortcut y = setY();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            y.setX = i;
        }
        if (!z) {
            y.setY.setY(setboxstrokewidthresource, -1.0f);
            y.setY.setY(setboxstrokewidthresource2, 1.0f);
        } else {
            y.setY.setY(setboxstrokewidthresource, 1.0f);
            y.setY.setY(setboxstrokewidthresource2, -1.0f);
        }
        if (i2 != 8) {
            y.MenuHostHelper$$ExternalSyntheticLambda1(this, i2);
        }
        MenuHostHelper$$ExternalSyntheticLambda1(y);
        return y;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(setBoxStrokeWidthResource setboxstrokewidthresource, int i) {
        if (setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
            setboxstrokewidthresource.setIconTintList(this, i);
            for (int i2 = 0; i2 < this.setZ + 1; i2++) {
                setBoxStrokeWidthResource setboxstrokewidthresource2 = this.setX.MenuHostHelper$$ExternalSyntheticLambda1[i2];
                if (setboxstrokewidthresource2 != null) {
                    boolean z = setboxstrokewidthresource2.setUiOptions;
                }
            }
            return;
        }
        int i3 = setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda1 != -1) {
            setShortcut setshortcut = this.setIconTintList[i3];
            if (setshortcut.MenuHostHelper$$ExternalSyntheticLambda1) {
                setshortcut.setX = i;
                return;
            } else if (setshortcut.setY.setX() == 0) {
                setshortcut.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                setshortcut.setX = i;
                return;
            } else {
                setShortcut y = setY();
                if (i < 0) {
                    y.setX = -i;
                    y.setY.setY(setboxstrokewidthresource, 1.0f);
                } else {
                    y.setX = i;
                    y.setY.setY(setboxstrokewidthresource, -1.0f);
                }
                MenuHostHelper$$ExternalSyntheticLambda1(y);
                return;
            }
        }
        setShortcut y2 = setY();
        y2.MenuHostHelper$$ExternalSyntheticLambda0 = setboxstrokewidthresource;
        float f = i;
        setboxstrokewidthresource.setIconTintList = f;
        y2.setX = f;
        y2.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        MenuHostHelper$$ExternalSyntheticLambda1(y2);
    }
}