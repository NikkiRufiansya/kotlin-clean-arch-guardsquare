package o;

import o.setVisibility;

/* loaded from: classes.dex */
public final class setFilterText {
    static boolean[] MenuHostHelper$$ExternalSyntheticLambda0 = new boolean[3];

    public static final boolean MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        return (i & i2) == i2;
    }

    public static void setX(setButtonTintBlendMode setbuttontintblendmode, setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled, setVisibility setvisibility) {
        setvisibility.setTextAppearanceResource = -1;
        setvisibility.onActivityResumed = -1;
        if (setbuttontintblendmode.setHasDecor[0] != setVisibility.setX.WRAP_CONTENT && setvisibility.setHasDecor[0] == setVisibility.setX.MATCH_PARENT) {
            int i = setvisibility.setIconified.MenuHostHelper$$ExternalSyntheticLambda1;
            int i2 = (setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setHint) - setvisibility.setShrinkMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1;
            setvisibility.setIconified.setUiOptions = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(setvisibility.setIconified);
            setvisibility.setShrinkMotionSpec.setUiOptions = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(setvisibility.setShrinkMotionSpec);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(setvisibility.setIconified.setUiOptions, i);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(setvisibility.setShrinkMotionSpec.setUiOptions, i2);
            setvisibility.setTextAppearanceResource = 2;
            setvisibility.setY(i, i2);
        }
        if (setbuttontintblendmode.setHasDecor[1] == setVisibility.setX.WRAP_CONTENT || setvisibility.setHasDecor[1] != setVisibility.setX.MATCH_PARENT) {
            return;
        }
        int i3 = setvisibility.setChipSpacingVertical.MenuHostHelper$$ExternalSyntheticLambda1;
        int i4 = (setbuttontintblendmode.setFilterRedundantCalls != 8 ? setbuttontintblendmode.setTextScaleX : 0) - setvisibility.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1;
        setvisibility.setChipSpacingVertical.setUiOptions = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(setvisibility.setChipSpacingVertical);
        setvisibility.setIconSize.setUiOptions = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(setvisibility.setIconSize);
        setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(setvisibility.setChipSpacingVertical.setUiOptions, i3);
        setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(setvisibility.setIconSize.setUiOptions, i4);
        if (setvisibility.setTextAlignment > 0 || setvisibility.setFilterRedundantCalls == 8) {
            setvisibility.ViewPager$SavedState$1.setUiOptions = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(setvisibility.ViewPager$SavedState$1);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(setvisibility.ViewPager$SavedState$1.setUiOptions, setvisibility.setTextAlignment + i3);
        }
        setvisibility.onActivityResumed = 2;
        setvisibility.setNavigationOnClickListener(i3, i4);
    }
}