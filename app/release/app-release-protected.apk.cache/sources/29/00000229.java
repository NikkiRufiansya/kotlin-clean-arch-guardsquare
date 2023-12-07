package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recreator {
    private static setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setItemActiveIndicatorHeight setY(setMeasureAllChildren setmeasureallchildren, setBoxStrokeErrorColor setboxstrokeerrorcolor) {
        String str = null;
        setOnReceiveContentListener setonreceivecontentlistener = null;
        setOnReceiveContentListener setonreceivecontentlistener2 = null;
        setup setupVar = null;
        boolean z = false;
        while (setmeasureallchildren.setUnboundedRipple()) {
            int MenuHostHelper$$ExternalSyntheticLambda1 = setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList);
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                str = setmeasureallchildren.setCenterIfNoTextEnabled();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                setonreceivecontentlistener = new setOnReceiveContentListener(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, 1.0f, setSingleSelection.MenuHostHelper$$ExternalSyntheticLambda0));
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                setonreceivecontentlistener2 = new setOnReceiveContentListener(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, 1.0f, setSingleSelection.MenuHostHelper$$ExternalSyntheticLambda0));
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 3) {
                setupVar = setCheckedIcon.MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren, setboxstrokeerrorcolor);
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 4) {
                z = setmeasureallchildren.setUiOptions();
            } else {
                setmeasureallchildren.setChipCornerRadius();
            }
        }
        return new setItemActiveIndicatorHeight(str, setonreceivecontentlistener, setonreceivecontentlistener2, setupVar, z);
    }
}