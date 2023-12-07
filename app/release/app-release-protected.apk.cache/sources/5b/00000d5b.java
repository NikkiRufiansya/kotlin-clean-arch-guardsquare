package o;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setMaxFrame {
    private static setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    private static final setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0 = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setIndicatorBounds setIconTintList(setMeasureAllChildren setmeasureallchildren, setBoxStrokeErrorColor setboxstrokeerrorcolor) {
        char c;
        ArrayList arrayList = new ArrayList();
        String str = null;
        setOnReceiveContentListener setonreceivecontentlistener = null;
        setUseCompatPadding setusecompatpadding = null;
        setFirstDayOfWeek setfirstdayofweek = null;
        setOnReceiveContentListener setonreceivecontentlistener2 = null;
        setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda0 setindicatorbounds_menuhosthelper__externalsyntheticlambda0 = null;
        setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda1 setindicatorbounds_menuhosthelper__externalsyntheticlambda1 = null;
        float f = 0.0f;
        boolean z = false;
        while (setmeasureallchildren.setUnboundedRipple()) {
            int i = 1;
            switch (setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList)) {
                case 0:
                    str = setmeasureallchildren.setCenterIfNoTextEnabled();
                    break;
                case 1:
                    setusecompatpadding = new setUseCompatPadding(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, 1.0f, setSuggestionsAdapter.setX));
                    break;
                case 2:
                    setonreceivecontentlistener2 = setTitleMarginStart.setX(setmeasureallchildren, setboxstrokeerrorcolor);
                    break;
                case 3:
                    setfirstdayofweek = new setFirstDayOfWeek(notify.setY(setmeasureallchildren, setboxstrokeerrorcolor, 1.0f, setIsCredential.setX));
                    break;
                case 4:
                    setindicatorbounds_menuhosthelper__externalsyntheticlambda0 = setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda0.values()[setmeasureallchildren.setLayoutAnimation() - 1];
                    break;
                case 5:
                    setindicatorbounds_menuhosthelper__externalsyntheticlambda1 = setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda1.values()[setmeasureallchildren.setLayoutAnimation() - 1];
                    break;
                case 6:
                    f = (float) setmeasureallchildren.setNavigationOnClickListener();
                    break;
                case 7:
                    z = setmeasureallchildren.setUiOptions();
                    break;
                case 8:
                    setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda0();
                    while (setmeasureallchildren.setUnboundedRipple()) {
                        setmeasureallchildren.setX();
                        setOnReceiveContentListener setonreceivecontentlistener3 = null;
                        String str2 = null;
                        while (setmeasureallchildren.setUnboundedRipple()) {
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                                str2 = setmeasureallchildren.setCenterIfNoTextEnabled();
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == i) {
                                setonreceivecontentlistener3 = setTitleMarginStart.setX(setmeasureallchildren, setboxstrokeerrorcolor);
                            } else {
                                setmeasureallchildren.ViewPager$SavedState$1();
                                setmeasureallchildren.setChipCornerRadius();
                            }
                        }
                        setmeasureallchildren.setIconTintList();
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        setOnReceiveContentListener setonreceivecontentlistener4 = setonreceivecontentlistener;
                        if (hashCode == 100) {
                            if (str2.equals("d")) {
                                c = 0;
                            }
                            c = 65535;
                        } else if (hashCode != 103) {
                            if (hashCode == 111 && str2.equals("o")) {
                                c = 2;
                            }
                            c = 65535;
                        } else {
                            if (str2.equals("g")) {
                                c = 1;
                            }
                            c = 65535;
                        }
                        i = 1;
                        if (c == 0 || c == 1) {
                            setboxstrokeerrorcolor.setLayoutAnimation = true;
                            arrayList.add(setonreceivecontentlistener3);
                        } else if (c == 2) {
                            setonreceivecontentlistener = setonreceivecontentlistener3;
                        }
                        setonreceivecontentlistener = setonreceivecontentlistener4;
                    }
                    setOnReceiveContentListener setonreceivecontentlistener5 = setonreceivecontentlistener;
                    setmeasureallchildren.setY();
                    if (arrayList.size() == i) {
                        arrayList.add(arrayList.get(0));
                    }
                    setonreceivecontentlistener = setonreceivecontentlistener5;
                    break;
                default:
                    setmeasureallchildren.setChipCornerRadius();
                    break;
            }
        }
        return new setIndicatorBounds(str, setonreceivecontentlistener, arrayList, setusecompatpadding, setfirstdayofweek, setonreceivecontentlistener2, setindicatorbounds_menuhosthelper__externalsyntheticlambda0, setindicatorbounds_menuhosthelper__externalsyntheticlambda1, f, z);
    }
}