package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setPrivateImeOptions {
    private static setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setNavigationIcon MenuHostHelper$$ExternalSyntheticLambda0(setMeasureAllChildren setmeasureallchildren, setBoxStrokeErrorColor setboxstrokeerrorcolor) {
        int i = 0;
        String str = null;
        NavigationBarPresenter$SavedState$1 navigationBarPresenter$SavedState$1 = null;
        boolean z = false;
        while (setmeasureallchildren.setUnboundedRipple()) {
            int MenuHostHelper$$ExternalSyntheticLambda1 = setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList);
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                str = setmeasureallchildren.setCenterIfNoTextEnabled();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                i = setmeasureallchildren.setLayoutAnimation();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                navigationBarPresenter$SavedState$1 = new NavigationBarPresenter$SavedState$1(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0(), setIconResource.MenuHostHelper$$ExternalSyntheticLambda0));
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 3) {
                z = setmeasureallchildren.setUiOptions();
            } else {
                setmeasureallchildren.setChipCornerRadius();
            }
        }
        return new setNavigationIcon(str, i, navigationBarPresenter$SavedState$1, z);
    }
}