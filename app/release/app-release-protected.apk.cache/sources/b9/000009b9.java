package o;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setButtonIcon {
    private static setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setX = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setEndIconOnClickListener setIconTintList(setMeasureAllChildren setmeasureallchildren, setBoxStrokeErrorColor setboxstrokeerrorcolor) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (setmeasureallchildren.setUnboundedRipple()) {
            int MenuHostHelper$$ExternalSyntheticLambda1 = setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setX);
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                str = setmeasureallchildren.setCenterIfNoTextEnabled();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                z = setmeasureallchildren.setUiOptions();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda0();
                while (setmeasureallchildren.setUnboundedRipple()) {
                    getRootAlpha x = setCollapsedTitleTextAppearance.setX(setmeasureallchildren, setboxstrokeerrorcolor);
                    if (x != null) {
                        arrayList.add(x);
                    }
                }
                setmeasureallchildren.setY();
            } else {
                setmeasureallchildren.setChipCornerRadius();
            }
        }
        return new setEndIconOnClickListener(str, arrayList, z);
    }
}