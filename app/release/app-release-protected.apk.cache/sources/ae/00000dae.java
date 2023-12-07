package o;

/* loaded from: classes.dex */
final class setMotionEventSplittingEnabled {
    private static final setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setThumbOffset MenuHostHelper$$ExternalSyntheticLambda0(setMeasureAllChildren setmeasureallchildren) {
        setmeasureallchildren.setX();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (setmeasureallchildren.setUnboundedRipple()) {
            int MenuHostHelper$$ExternalSyntheticLambda1 = setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList);
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                str = setmeasureallchildren.setCenterIfNoTextEnabled();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                str2 = setmeasureallchildren.setCenterIfNoTextEnabled();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                str3 = setmeasureallchildren.setCenterIfNoTextEnabled();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 3) {
                f = (float) setmeasureallchildren.setNavigationOnClickListener();
            } else {
                setmeasureallchildren.ViewPager$SavedState$1();
                setmeasureallchildren.setChipCornerRadius();
            }
        }
        setmeasureallchildren.setIconTintList();
        return new setThumbOffset(str, str2, str3, f);
    }
}