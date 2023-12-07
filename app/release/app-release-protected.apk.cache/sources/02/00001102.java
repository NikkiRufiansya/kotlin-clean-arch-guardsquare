package o;

import o.ExpandableTransformationBehavior;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setWidth {
    private static setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1 = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExpandableTransformationBehavior MenuHostHelper$$ExternalSyntheticLambda0(setMeasureAllChildren setmeasureallchildren, setBoxStrokeErrorColor setboxstrokeerrorcolor) {
        String str = null;
        ExpandableTransformationBehavior.setX setx = null;
        setOnReceiveContentListener setonreceivecontentlistener = null;
        setOnReceiveContentListener setonreceivecontentlistener2 = null;
        setOnReceiveContentListener setonreceivecontentlistener3 = null;
        boolean z = false;
        while (setmeasureallchildren.setUnboundedRipple()) {
            int MenuHostHelper$$ExternalSyntheticLambda12 = setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                setonreceivecontentlistener = new setOnReceiveContentListener(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, 1.0f, setSingleSelection.MenuHostHelper$$ExternalSyntheticLambda0));
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 1) {
                setonreceivecontentlistener2 = new setOnReceiveContentListener(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, 1.0f, setSingleSelection.MenuHostHelper$$ExternalSyntheticLambda0));
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                setonreceivecontentlistener3 = new setOnReceiveContentListener(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, 1.0f, setSingleSelection.MenuHostHelper$$ExternalSyntheticLambda0));
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 3) {
                str = setmeasureallchildren.setCenterIfNoTextEnabled();
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 4) {
                setx = ExpandableTransformationBehavior.setX.setY(setmeasureallchildren.setLayoutAnimation());
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 5) {
                z = setmeasureallchildren.setUiOptions();
            } else {
                setmeasureallchildren.setChipCornerRadius();
            }
        }
        return new ExpandableTransformationBehavior(str, setx, setonreceivecontentlistener, setonreceivecontentlistener2, setonreceivecontentlistener3, z);
    }
}