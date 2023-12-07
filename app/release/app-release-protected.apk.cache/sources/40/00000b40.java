package o;

/* loaded from: classes.dex */
public final class setEnabled {
    private static setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("a");
    private static setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setY = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("fc", "sc", "sw", "t");

    public static setLines MenuHostHelper$$ExternalSyntheticLambda1(setMeasureAllChildren setmeasureallchildren, setBoxStrokeErrorColor setboxstrokeerrorcolor) {
        setmeasureallchildren.setX();
        setLines setlines = null;
        while (setmeasureallchildren.setUnboundedRipple()) {
            if (setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList) != 0) {
                setmeasureallchildren.ViewPager$SavedState$1();
                setmeasureallchildren.setChipCornerRadius();
            } else {
                setmeasureallchildren.setX();
                setUseCompatPadding setusecompatpadding = null;
                setUseCompatPadding setusecompatpadding2 = null;
                setOnReceiveContentListener setonreceivecontentlistener = null;
                setOnReceiveContentListener setonreceivecontentlistener2 = null;
                while (setmeasureallchildren.setUnboundedRipple()) {
                    int MenuHostHelper$$ExternalSyntheticLambda1 = setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setY);
                    if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                        setusecompatpadding = new setUseCompatPadding(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, 1.0f, setSuggestionsAdapter.setX));
                    } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                        setusecompatpadding2 = new setUseCompatPadding(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, 1.0f, setSuggestionsAdapter.setX));
                    } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                        setonreceivecontentlistener = new setOnReceiveContentListener(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0(), setSingleSelection.MenuHostHelper$$ExternalSyntheticLambda0));
                    } else if (MenuHostHelper$$ExternalSyntheticLambda1 != 3) {
                        setmeasureallchildren.ViewPager$SavedState$1();
                        setmeasureallchildren.setChipCornerRadius();
                    } else {
                        setonreceivecontentlistener2 = new setOnReceiveContentListener(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0(), setSingleSelection.MenuHostHelper$$ExternalSyntheticLambda0));
                    }
                }
                setmeasureallchildren.setIconTintList();
                setlines = new setLines(setusecompatpadding, setusecompatpadding2, setonreceivecontentlistener, setonreceivecontentlistener2);
            }
        }
        setmeasureallchildren.setIconTintList();
        return setlines == null ? new setLines(null, null, null, null) : setlines;
    }
}