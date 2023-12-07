package o;

import android.graphics.PointF;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setItemIconTintList {
    private static setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setY = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setChipSpacing setIconTintList(setMeasureAllChildren setmeasureallchildren, setBoxStrokeErrorColor setboxstrokeerrorcolor, int i) {
        boolean z = i == 3;
        String str = null;
        FirebaseSessionsRegistrar<PointF, PointF> firebaseSessionsRegistrar = null;
        setTokenizer settokenizer = null;
        boolean z2 = false;
        while (setmeasureallchildren.setUnboundedRipple()) {
            int MenuHostHelper$$ExternalSyntheticLambda1 = setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setY);
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                str = setmeasureallchildren.setCenterIfNoTextEnabled();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                firebaseSessionsRegistrar = setOnNavigationItemReselectedListener.MenuHostHelper$$ExternalSyntheticLambda0(setmeasureallchildren, setboxstrokeerrorcolor);
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                settokenizer = new setTokenizer(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0(), setContentScrim.setY));
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 3) {
                z2 = setmeasureallchildren.setUiOptions();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 4) {
                z = setmeasureallchildren.setLayoutAnimation() == 3;
            } else {
                setmeasureallchildren.ViewPager$SavedState$1();
                setmeasureallchildren.setChipCornerRadius();
            }
        }
        return new setChipSpacing(str, firebaseSessionsRegistrar, settokenizer, z, z2);
    }
}