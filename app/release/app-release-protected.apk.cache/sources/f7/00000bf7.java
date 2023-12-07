package o;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setFreezesText {
    public static int setIconTintList;
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private int setUiOptions;
    private setSupportButtonTintList setUnboundedRipple;
    setSupportButtonTintList setY;
    private int setNavigationOnClickListener = 0;
    public boolean setX = false;
    ArrayList<setSupportButtonTintList> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();

    public setFreezesText(setSupportButtonTintList setsupportbuttontintlist, int i) {
        this.setUnboundedRipple = null;
        this.setY = null;
        int i2 = setIconTintList;
        this.setUiOptions = i2;
        setIconTintList = i2 + 1;
        this.setUnboundedRipple = setsupportbuttontintlist;
        this.setY = setsupportbuttontintlist;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }

    private long setX(setLastBaselineToBottomHeight setlastbaselinetobottomheight, long j) {
        setSupportButtonTintList setsupportbuttontintlist = setlastbaselinetobottomheight.setUnboundedRipple;
        if (setsupportbuttontintlist instanceof loadReflectionField) {
            return j;
        }
        int size = setlastbaselinetobottomheight.setIconTintList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            getPropertyName getpropertyname = setlastbaselinetobottomheight.setIconTintList.get(i);
            if (getpropertyname instanceof setLastBaselineToBottomHeight) {
                setLastBaselineToBottomHeight setlastbaselinetobottomheight2 = (setLastBaselineToBottomHeight) getpropertyname;
                if (setlastbaselinetobottomheight2.setUnboundedRipple != setsupportbuttontintlist) {
                    j2 = Math.max(j2, setX(setlastbaselinetobottomheight2, setlastbaselinetobottomheight2.MenuHostHelper$$ExternalSyntheticLambda0 + j));
                }
            }
        }
        if (setlastbaselinetobottomheight == setsupportbuttontintlist.setCenterIfNoTextEnabled) {
            long MenuHostHelper$$ExternalSyntheticLambda0 = j + setsupportbuttontintlist.MenuHostHelper$$ExternalSyntheticLambda0();
            return Math.max(Math.max(j2, setX(setsupportbuttontintlist.setIconTintList, MenuHostHelper$$ExternalSyntheticLambda0)), MenuHostHelper$$ExternalSyntheticLambda0 - setsupportbuttontintlist.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        return j2;
    }

    private long MenuHostHelper$$ExternalSyntheticLambda0(setLastBaselineToBottomHeight setlastbaselinetobottomheight, long j) {
        setSupportButtonTintList setsupportbuttontintlist = setlastbaselinetobottomheight.setUnboundedRipple;
        if (setsupportbuttontintlist instanceof loadReflectionField) {
            return j;
        }
        int size = setlastbaselinetobottomheight.setIconTintList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            getPropertyName getpropertyname = setlastbaselinetobottomheight.setIconTintList.get(i);
            if (getpropertyname instanceof setLastBaselineToBottomHeight) {
                setLastBaselineToBottomHeight setlastbaselinetobottomheight2 = (setLastBaselineToBottomHeight) getpropertyname;
                if (setlastbaselinetobottomheight2.setUnboundedRipple != setsupportbuttontintlist) {
                    j2 = Math.min(j2, MenuHostHelper$$ExternalSyntheticLambda0(setlastbaselinetobottomheight2, setlastbaselinetobottomheight2.MenuHostHelper$$ExternalSyntheticLambda0 + j));
                }
            }
        }
        if (setlastbaselinetobottomheight == setsupportbuttontintlist.setIconTintList) {
            long MenuHostHelper$$ExternalSyntheticLambda0 = j - setsupportbuttontintlist.MenuHostHelper$$ExternalSyntheticLambda0();
            return Math.min(Math.min(j2, MenuHostHelper$$ExternalSyntheticLambda0(setsupportbuttontintlist.setCenterIfNoTextEnabled, MenuHostHelper$$ExternalSyntheticLambda0)), MenuHostHelper$$ExternalSyntheticLambda0 - setsupportbuttontintlist.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        return j2;
    }

    public final long setX(setButtonTintBlendMode setbuttontintblendmode, int i) {
        long MenuHostHelper$$ExternalSyntheticLambda0;
        int i2;
        float f;
        setSupportButtonTintList setsupportbuttontintlist = this.setUnboundedRipple;
        if (setsupportbuttontintlist instanceof zza) {
            if (((zza) setsupportbuttontintlist).setOnLongClickListener != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(setsupportbuttontintlist instanceof setExtractedText)) {
                return 0L;
            }
        } else if (!(setsupportbuttontintlist instanceof setIndeterminateTintBlendMode)) {
            return 0L;
        }
        setLastBaselineToBottomHeight setlastbaselinetobottomheight = (i == 0 ? setbuttontintblendmode.setNavigationOnClickListener : setbuttontintblendmode.setNavigationIconTint).setCenterIfNoTextEnabled;
        setLastBaselineToBottomHeight setlastbaselinetobottomheight2 = (i == 0 ? setbuttontintblendmode.setNavigationOnClickListener : setbuttontintblendmode.setNavigationIconTint).setIconTintList;
        boolean contains = this.setUnboundedRipple.setCenterIfNoTextEnabled.setNavigationOnClickListener.contains(setlastbaselinetobottomheight);
        boolean contains2 = this.setUnboundedRipple.setIconTintList.setNavigationOnClickListener.contains(setlastbaselinetobottomheight2);
        long MenuHostHelper$$ExternalSyntheticLambda02 = this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0();
        if (contains && contains2) {
            long x = setX(this.setUnboundedRipple.setCenterIfNoTextEnabled, 0L);
            long MenuHostHelper$$ExternalSyntheticLambda03 = MenuHostHelper$$ExternalSyntheticLambda0(this.setUnboundedRipple.setIconTintList, 0L);
            long j = x - MenuHostHelper$$ExternalSyntheticLambda02;
            if (j >= (-this.setUnboundedRipple.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0)) {
                j += this.setUnboundedRipple.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            long j2 = ((-MenuHostHelper$$ExternalSyntheticLambda03) - MenuHostHelper$$ExternalSyntheticLambda02) - this.setUnboundedRipple.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0;
            if (j2 >= this.setUnboundedRipple.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0) {
                j2 -= this.setUnboundedRipple.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            setVisibility setvisibility = this.setUnboundedRipple.setIconSize;
            if (i == 0) {
                f = setvisibility.setGuidelinePercent;
            } else {
                f = i == 1 ? setvisibility.setTitleMarginEnd : -1.0f;
            }
            float f2 = (float) (f > 0.0f ? (((float) j2) / f) + (((float) j) / (1.0f - f)) : 0L);
            MenuHostHelper$$ExternalSyntheticLambda0 = this.setUnboundedRipple.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0 + (f2 * f) + 0.5f + MenuHostHelper$$ExternalSyntheticLambda02 + (f2 * (1.0f - f)) + 0.5f;
            i2 = this.setUnboundedRipple.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
        } else if (contains) {
            return Math.max(setX(this.setUnboundedRipple.setCenterIfNoTextEnabled, this.setUnboundedRipple.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0), this.setUnboundedRipple.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0 + MenuHostHelper$$ExternalSyntheticLambda02);
        } else {
            if (contains2) {
                return Math.max(-MenuHostHelper$$ExternalSyntheticLambda0(this.setUnboundedRipple.setIconTintList, this.setUnboundedRipple.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0), (-this.setUnboundedRipple.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0) + MenuHostHelper$$ExternalSyntheticLambda02);
            }
            MenuHostHelper$$ExternalSyntheticLambda0 = this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0() + this.setUnboundedRipple.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0;
            i2 = this.setUnboundedRipple.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return MenuHostHelper$$ExternalSyntheticLambda0 - i2;
    }
}