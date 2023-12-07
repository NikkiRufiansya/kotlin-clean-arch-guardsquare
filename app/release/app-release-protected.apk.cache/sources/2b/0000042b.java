package o;

import android.graphics.Path;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class equals {
    private static final setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setX = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setTextStartPadding MenuHostHelper$$ExternalSyntheticLambda0(setMeasureAllChildren setmeasureallchildren, setBoxStrokeErrorColor setboxstrokeerrorcolor) {
        String str = null;
        setUseCompatPadding setusecompatpadding = null;
        setFirstDayOfWeek setfirstdayofweek = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (setmeasureallchildren.setUnboundedRipple()) {
            int MenuHostHelper$$ExternalSyntheticLambda1 = setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setX);
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                str = setmeasureallchildren.setCenterIfNoTextEnabled();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                setusecompatpadding = new setUseCompatPadding(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, 1.0f, setSuggestionsAdapter.setX));
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                setfirstdayofweek = new setFirstDayOfWeek(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, 1.0f, setIsCredential.setX));
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 3) {
                z = setmeasureallchildren.setUiOptions();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 4) {
                i = setmeasureallchildren.setLayoutAnimation();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 5) {
                z2 = setmeasureallchildren.setUiOptions();
            } else {
                setmeasureallchildren.ViewPager$SavedState$1();
                setmeasureallchildren.setChipCornerRadius();
            }
        }
        return new setTextStartPadding(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, setusecompatpadding, setfirstdayofweek, z2);
    }
}