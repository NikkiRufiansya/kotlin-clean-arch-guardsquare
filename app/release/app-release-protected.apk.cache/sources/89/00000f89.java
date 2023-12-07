package o;

import java.util.ArrayList;
import o.setVisibility;

/* loaded from: classes.dex */
public final class setShowingForActionMode {
    public setButtonTintBlendMode setX;
    public final ArrayList<setVisibility> setY = new ArrayList<>();
    private setX MenuHostHelper$$ExternalSyntheticLambda1 = new setX();

    /* loaded from: classes.dex */
    public static class setX {
        public int MenuHostHelper$$ExternalSyntheticLambda0;
        public setVisibility.setX MenuHostHelper$$ExternalSyntheticLambda1;
        public int setIconTintList;
        public int setLayoutAnimation;
        public boolean setNavigationOnClickListener;
        public setVisibility.setX setOnLongClickListener;
        public int setUiOptions;
        public int setUnboundedRipple;
        public boolean setX;
        public int setY;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setButtonTintBlendMode setbuttontintblendmode) {
        this.setY.clear();
        int size = ((setQueryHint) setbuttontintblendmode).setRowOrderPreserved.size();
        for (int i = 0; i < size; i++) {
            setVisibility setvisibility = ((setQueryHint) setbuttontintblendmode).setRowOrderPreserved.get(i);
            if (setvisibility.setHasDecor[0] == setVisibility.setX.MATCH_CONSTRAINT || setvisibility.setHasDecor[1] == setVisibility.setX.MATCH_CONSTRAINT) {
                this.setY.add(setvisibility);
            }
        }
        setbuttontintblendmode.ActionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 = true;
    }

    public setShowingForActionMode(setButtonTintBlendMode setbuttontintblendmode) {
        this.setX = setbuttontintblendmode;
    }

    public final void setX(setButtonTintBlendMode setbuttontintblendmode, int i, int i2, int i3) {
        int uiOptions = setbuttontintblendmode.setUiOptions();
        int c_ = setbuttontintblendmode.c_();
        setbuttontintblendmode.setOnLongClickListener(0);
        setbuttontintblendmode.setUnboundedRipple(0);
        setbuttontintblendmode.setNavigationOnClickListener(i2);
        setbuttontintblendmode.setY(i3);
        setbuttontintblendmode.setOnLongClickListener(uiOptions);
        setbuttontintblendmode.setUnboundedRipple(c_);
        this.setX.setErrorIconTintList = i;
        this.setX.setIconTintList();
    }

    public final boolean setY(setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setVisibility setvisibility, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = setvisibility.setHasDecor[0];
        this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener = setvisibility.setHasDecor[1];
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 = setvisibility.setFilterRedundantCalls == 8 ? 0 : setvisibility.setHint;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation = setvisibility.setFilterRedundantCalls == 8 ? 0 : setvisibility.setTextScaleX;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener = false;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList = i;
        boolean z = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 == setVisibility.setX.MATCH_CONSTRAINT;
        boolean z2 = this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener == setVisibility.setX.MATCH_CONSTRAINT;
        boolean z3 = z && setvisibility.setZ > 0.0f;
        boolean z4 = z2 && setvisibility.setZ > 0.0f;
        if (z3 && setvisibility.FirebaseRemoteConfigKtxRegistrar[0] == 4) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = setVisibility.setX.FIXED;
        }
        if (z4 && setvisibility.FirebaseRemoteConfigKtxRegistrar[1] == 4) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener = setVisibility.setX.FIXED;
        }
        setshowingforactionmode_menuhosthelper__externalsyntheticlambda1.setY(setvisibility, this.MenuHostHelper$$ExternalSyntheticLambda1);
        setvisibility.setNavigationOnClickListener(this.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple);
        setvisibility.setY(this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions);
        setvisibility.MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.setX;
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1.setY;
        setvisibility.setTextAlignment = i2;
        setvisibility.MenuHostHelper$$ExternalSyntheticLambda0 = i2 > 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList = 0;
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener;
    }
}