package o;

import o.setRootViewData;

/* loaded from: classes.dex */
final class setTextMetricsParamsCompat {
    private static final setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1 = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setRootViewData setIconTintList(setMeasureAllChildren setmeasureallchildren) {
        String str = null;
        setRootViewData.setY sety = null;
        boolean z = false;
        while (setmeasureallchildren.setUnboundedRipple()) {
            int MenuHostHelper$$ExternalSyntheticLambda12 = setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                str = setmeasureallchildren.setCenterIfNoTextEnabled();
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 1) {
                sety = setRootViewData.setY.MenuHostHelper$$ExternalSyntheticLambda0(setmeasureallchildren.setLayoutAnimation());
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                z = setmeasureallchildren.setUiOptions();
            } else {
                setmeasureallchildren.ViewPager$SavedState$1();
                setmeasureallchildren.setChipCornerRadius();
            }
        }
        return new setRootViewData(str, sety, z);
    }
}