package o;

import java.util.HashMap;
import o.setVisibility;

/* loaded from: classes.dex */
public final class zzB extends setForceApplySystemWindowInsetTop {
    public int setY = 0;
    public boolean setIconTintList = true;
    public int setX = 0;
    private boolean setEmptyView = false;

    @Override // o.setVisibility
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return true;
    }

    @Override // o.setVisibility
    public final boolean setX() {
        return this.setEmptyView;
    }

    @Override // o.setVisibility
    public final boolean setY() {
        return this.setEmptyView;
    }

    @Override // o.setForceApplySystemWindowInsetTop, o.setVisibility
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setVisibility setvisibility, HashMap<setVisibility, setVisibility> hashMap) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(setvisibility, hashMap);
        zzB zzb = (zzB) setvisibility;
        this.setY = zzb.setY;
        this.setIconTintList = zzb.setIconTintList;
        this.setX = zzb.setX;
    }

    @Override // o.setVisibility
    public final String toString() {
        StringBuilder sb = new StringBuilder("[Barrier] ");
        sb.append(this.setOnNavigationItemSelectedListener);
        sb.append(" {");
        String obj = sb.toString();
        for (int i = 0; i < ((setForceApplySystemWindowInsetTop) this).setLineBreakStyle; i++) {
            setVisibility setvisibility = ((setForceApplySystemWindowInsetTop) this).ActionMenuPresenter$SavedState$1[i];
            if (i > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(", ");
                obj = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(setvisibility.setOnNavigationItemSelectedListener);
            obj = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj);
        sb4.append("}");
        return sb4.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setIconTintList() {
        for (int i = 0; i < ((setForceApplySystemWindowInsetTop) this).setLineBreakStyle; i++) {
            setVisibility setvisibility = ((setForceApplySystemWindowInsetTop) this).ActionMenuPresenter$SavedState$1[i];
            if (this.setIconTintList || setvisibility.MenuHostHelper$$ExternalSyntheticLambda1()) {
                int i2 = this.setY;
                if (i2 == 0 || i2 == 1) {
                    setvisibility.setLayoutDirection[0] = true;
                } else if (i2 == 2 || i2 == 3) {
                    setvisibility.setLayoutDirection[1] = true;
                }
            }
        }
    }

    @Override // o.setVisibility
    public final void setX(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled, boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        this.setChipIconTintResource[0] = this.setIconified;
        this.setChipIconTintResource[2] = this.setChipSpacingVertical;
        this.setChipIconTintResource[1] = this.setShrinkMotionSpec;
        this.setChipIconTintResource[3] = this.setIconSize;
        for (int i4 = 0; i4 < this.setChipIconTintResource.length; i4++) {
            this.setChipIconTintResource[i4].setUiOptions = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipIconTintResource[i4]);
        }
        int i5 = this.setY;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        zzD zzd = this.setChipIconTintResource[this.setY];
        if (!this.setEmptyView) {
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
        if (this.setEmptyView) {
            this.setEmptyView = false;
            int i6 = this.setY;
            if (i6 == 0 || i6 == 1) {
                setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconified.setUiOptions, this.Fragment$5);
                setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(this.setShrinkMotionSpec.setUiOptions, this.Fragment$5);
                return;
            } else if (i6 == 2 || i6 == 3) {
                setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(this.setChipSpacingVertical.setUiOptions, this.setRevealInfo);
                setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconSize.setUiOptions, this.setRevealInfo);
                return;
            } else {
                return;
            }
        }
        for (int i7 = 0; i7 < ((setForceApplySystemWindowInsetTop) this).setLineBreakStyle; i7++) {
            setVisibility setvisibility = ((setForceApplySystemWindowInsetTop) this).ActionMenuPresenter$SavedState$1[i7];
            if ((this.setIconTintList || setvisibility.MenuHostHelper$$ExternalSyntheticLambda1()) && ((((i2 = this.setY) == 0 || i2 == 1) && setvisibility.setHasDecor[0] == setVisibility.setX.MATCH_CONSTRAINT && setvisibility.setIconified.setLayoutAnimation != null && setvisibility.setShrinkMotionSpec.setLayoutAnimation != null) || (((i3 = this.setY) == 2 || i3 == 3) && setvisibility.setHasDecor[1] == setVisibility.setX.MATCH_CONSTRAINT && setvisibility.setChipSpacingVertical.setLayoutAnimation != null && setvisibility.setIconSize.setLayoutAnimation != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.setIconified.setIconTintList() || this.setShrinkMotionSpec.setIconTintList();
        boolean z4 = this.setChipSpacingVertical.setIconTintList() || this.setIconSize.setIconTintList();
        int i8 = !(!z2 && (((i = this.setY) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        for (int i9 = 0; i9 < ((setForceApplySystemWindowInsetTop) this).setLineBreakStyle; i9++) {
            setVisibility setvisibility2 = ((setForceApplySystemWindowInsetTop) this).ActionMenuPresenter$SavedState$1[i9];
            if (this.setIconTintList || setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1()) {
                setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda0 = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(setvisibility2.setChipIconTintResource[this.setY]);
                setvisibility2.setChipIconTintResource[this.setY].setUiOptions = MenuHostHelper$$ExternalSyntheticLambda0;
                int i10 = (setvisibility2.setChipIconTintResource[this.setY].setLayoutAnimation == null || setvisibility2.setChipIconTintResource[this.setY].setLayoutAnimation.setIconTintList != this) ? 0 : setvisibility2.setChipIconTintResource[this.setY].MenuHostHelper$$ExternalSyntheticLambda1;
                int i11 = this.setY;
                if (i11 != 0 && i11 != 2) {
                    setShortcut y = setwebcontentsdebuggingenabled.setY();
                    setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda1 = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1();
                    MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener = 0;
                    y.setY(zzd.setUiOptions, MenuHostHelper$$ExternalSyntheticLambda0, MenuHostHelper$$ExternalSyntheticLambda1, this.setX + i10);
                    setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(y);
                } else {
                    setShortcut y2 = setwebcontentsdebuggingenabled.setY();
                    setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda12 = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1();
                    MenuHostHelper$$ExternalSyntheticLambda12.setNavigationOnClickListener = 0;
                    y2.setIconTintList(zzd.setUiOptions, MenuHostHelper$$ExternalSyntheticLambda0, MenuHostHelper$$ExternalSyntheticLambda12, this.setX - i10);
                    setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(y2);
                }
                setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(zzd.setUiOptions, MenuHostHelper$$ExternalSyntheticLambda0, this.setX + i10, i8);
            }
        }
        int i12 = this.setY;
        if (i12 == 0) {
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setShrinkMotionSpec.setUiOptions, this.setIconified.setUiOptions, 0, 8);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconified.setUiOptions, this.RecyclerView$SavedState$1.setShrinkMotionSpec.setUiOptions, 0, 4);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconified.setUiOptions, this.RecyclerView$SavedState$1.setIconified.setUiOptions, 0, 0);
        } else if (i12 == 1) {
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconified.setUiOptions, this.setShrinkMotionSpec.setUiOptions, 0, 8);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconified.setUiOptions, this.RecyclerView$SavedState$1.setIconified.setUiOptions, 0, 4);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconified.setUiOptions, this.RecyclerView$SavedState$1.setShrinkMotionSpec.setUiOptions, 0, 0);
        } else if (i12 == 2) {
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconSize.setUiOptions, this.setChipSpacingVertical.setUiOptions, 0, 8);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipSpacingVertical.setUiOptions, this.RecyclerView$SavedState$1.setIconSize.setUiOptions, 0, 4);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipSpacingVertical.setUiOptions, this.RecyclerView$SavedState$1.setChipSpacingVertical.setUiOptions, 0, 0);
        } else if (i12 == 3) {
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipSpacingVertical.setUiOptions, this.setIconSize.setUiOptions, 0, 8);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipSpacingVertical.setUiOptions, this.RecyclerView$SavedState$1.setChipSpacingVertical.setUiOptions, 0, 4);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipSpacingVertical.setUiOptions, this.RecyclerView$SavedState$1.setIconSize.setUiOptions, 0, 0);
        }
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        int i;
        int i2;
        boolean z = true;
        for (int i3 = 0; i3 < ((setForceApplySystemWindowInsetTop) this).setLineBreakStyle; i3++) {
            setVisibility setvisibility = ((setForceApplySystemWindowInsetTop) this).ActionMenuPresenter$SavedState$1[i3];
            if ((this.setIconTintList || setvisibility.MenuHostHelper$$ExternalSyntheticLambda1()) && ((((i = this.setY) == 0 || i == 1) && !setvisibility.setX()) || (((i2 = this.setY) == 2 || i2 == 3) && !setvisibility.setY()))) {
                z = false;
            }
        }
        if (!z || ((setForceApplySystemWindowInsetTop) this).setLineBreakStyle <= 0) {
            return false;
        }
        int i4 = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < ((setForceApplySystemWindowInsetTop) this).setLineBreakStyle; i5++) {
            setVisibility setvisibility2 = ((setForceApplySystemWindowInsetTop) this).ActionMenuPresenter$SavedState$1[i5];
            if (this.setIconTintList || setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1()) {
                if (!z2) {
                    int i6 = this.setY;
                    if (i6 == 0) {
                        zzD MenuHostHelper$$ExternalSyntheticLambda1 = setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT);
                        if (MenuHostHelper$$ExternalSyntheticLambda1.setX) {
                            i4 = MenuHostHelper$$ExternalSyntheticLambda1.setY;
                            z2 = true;
                        }
                        i4 = 0;
                        z2 = true;
                    } else if (i6 == 1) {
                        zzD MenuHostHelper$$ExternalSyntheticLambda12 = setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT);
                        if (MenuHostHelper$$ExternalSyntheticLambda12.setX) {
                            i4 = MenuHostHelper$$ExternalSyntheticLambda12.setY;
                            z2 = true;
                        }
                        i4 = 0;
                        z2 = true;
                    } else if (i6 == 2) {
                        zzD MenuHostHelper$$ExternalSyntheticLambda13 = setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP);
                        if (MenuHostHelper$$ExternalSyntheticLambda13.setX) {
                            i4 = MenuHostHelper$$ExternalSyntheticLambda13.setY;
                            z2 = true;
                        }
                        i4 = 0;
                        z2 = true;
                    } else {
                        if (i6 == 3) {
                            zzD MenuHostHelper$$ExternalSyntheticLambda14 = setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM);
                            if (MenuHostHelper$$ExternalSyntheticLambda14.setX) {
                                i4 = MenuHostHelper$$ExternalSyntheticLambda14.setY;
                            }
                            i4 = 0;
                        }
                        z2 = true;
                    }
                }
                int i7 = this.setY;
                if (i7 == 0) {
                    zzD MenuHostHelper$$ExternalSyntheticLambda15 = setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT);
                    i4 = Math.min(i4, !MenuHostHelper$$ExternalSyntheticLambda15.setX ? 0 : MenuHostHelper$$ExternalSyntheticLambda15.setY);
                } else if (i7 == 1) {
                    zzD MenuHostHelper$$ExternalSyntheticLambda16 = setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT);
                    i4 = Math.max(i4, !MenuHostHelper$$ExternalSyntheticLambda16.setX ? 0 : MenuHostHelper$$ExternalSyntheticLambda16.setY);
                } else if (i7 == 2) {
                    zzD MenuHostHelper$$ExternalSyntheticLambda17 = setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP);
                    i4 = Math.min(i4, !MenuHostHelper$$ExternalSyntheticLambda17.setX ? 0 : MenuHostHelper$$ExternalSyntheticLambda17.setY);
                } else if (i7 == 3) {
                    zzD MenuHostHelper$$ExternalSyntheticLambda18 = setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM);
                    i4 = Math.max(i4, !MenuHostHelper$$ExternalSyntheticLambda18.setX ? 0 : MenuHostHelper$$ExternalSyntheticLambda18.setY);
                }
            }
        }
        int i8 = i4 + this.setX;
        int i9 = this.setY;
        if (i9 == 0 || i9 == 1) {
            MenuHostHelper$$ExternalSyntheticLambda1(i8, i8);
        } else {
            setX(i8, i8);
        }
        this.setEmptyView = true;
        return true;
    }
}