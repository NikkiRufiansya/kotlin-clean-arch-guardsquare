package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class setForceApplySystemWindowInsetTop extends setVisibility implements setSoundEffectsEnabled {
    public setVisibility[] ActionMenuPresenter$SavedState$1 = new setVisibility[4];
    public int setLineBreakStyle = 0;

    public void setUnboundedRipple() {
    }

    @Override // o.setSoundEffectsEnabled
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setVisibility setvisibility) {
        if (setvisibility == this || setvisibility == null) {
            return;
        }
        int i = this.setLineBreakStyle;
        setVisibility[] setvisibilityArr = this.ActionMenuPresenter$SavedState$1;
        if (i + 1 > setvisibilityArr.length) {
            this.ActionMenuPresenter$SavedState$1 = (setVisibility[]) Arrays.copyOf(setvisibilityArr, setvisibilityArr.length << 1);
        }
        setVisibility[] setvisibilityArr2 = this.ActionMenuPresenter$SavedState$1;
        int i2 = this.setLineBreakStyle;
        setvisibilityArr2[i2] = setvisibility;
        this.setLineBreakStyle = i2 + 1;
    }

    @Override // o.setVisibility
    public void MenuHostHelper$$ExternalSyntheticLambda0(setVisibility setvisibility, HashMap<setVisibility, setVisibility> hashMap) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(setvisibility, hashMap);
        setForceApplySystemWindowInsetTop setforceapplysystemwindowinsettop = (setForceApplySystemWindowInsetTop) setvisibility;
        this.setLineBreakStyle = 0;
        int i = setforceapplysystemwindowinsettop.setLineBreakStyle;
        for (int i2 = 0; i2 < i; i2++) {
            MenuHostHelper$$ExternalSyntheticLambda0(hashMap.get(setforceapplysystemwindowinsettop.ActionMenuPresenter$SavedState$1[i2]));
        }
    }

    @Override // o.setSoundEffectsEnabled
    public final void setNavigationOnClickListener() {
        this.setLineBreakStyle = 0;
        Arrays.fill(this.ActionMenuPresenter$SavedState$1, (Object) null);
    }

    public final void setX(ArrayList<setOnGroupExpandListener> arrayList, int i, setOnGroupExpandListener setongroupexpandlistener) {
        for (int i2 = 0; i2 < this.setLineBreakStyle; i2++) {
            setVisibility setvisibility = this.ActionMenuPresenter$SavedState$1[i2];
            if (!setongroupexpandlistener.MenuHostHelper$$ExternalSyntheticLambda0.contains(setvisibility)) {
                setongroupexpandlistener.MenuHostHelper$$ExternalSyntheticLambda0.add(setvisibility);
            }
        }
        for (int i3 = 0; i3 < this.setLineBreakStyle; i3++) {
            setActionBarHideOffset.setY(this.ActionMenuPresenter$SavedState$1[i3], i, arrayList, setongroupexpandlistener);
        }
    }

    public final int setChipCornerRadius(int i) {
        for (int i2 = 0; i2 < this.setLineBreakStyle; i2++) {
            setVisibility setvisibility = this.ActionMenuPresenter$SavedState$1[i2];
            if (i == 0 && setvisibility.setLayoutAnimation != -1) {
                return setvisibility.setLayoutAnimation;
            }
            if (i == 1 && setvisibility.createDispatcher != -1) {
                return setvisibility.createDispatcher;
            }
        }
        return -1;
    }
}