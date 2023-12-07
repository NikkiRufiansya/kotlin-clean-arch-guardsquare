package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class notify {
    private static setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<setChildIndicatorBoundsRelative<T>> setY(setMeasureAllChildren setmeasureallchildren, setBoxStrokeErrorColor setboxstrokeerrorcolor, float f, setScaleY<T> setscaley) {
        ArrayList arrayList = new ArrayList();
        if (setmeasureallchildren.setTextAlignment() != setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.STRING) {
            setmeasureallchildren.setX();
            while (setmeasureallchildren.setUnboundedRipple()) {
                if (setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList) == 0) {
                    if (setmeasureallchildren.setTextAlignment() == setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.BEGIN_ARRAY) {
                        setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda0();
                        if (setmeasureallchildren.setTextAlignment() == setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.NUMBER) {
                            arrayList.add(setChipSpacingVerticalResource.MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren, setboxstrokeerrorcolor, f, setscaley, false));
                        } else {
                            while (setmeasureallchildren.setUnboundedRipple()) {
                                arrayList.add(setChipSpacingVerticalResource.MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren, setboxstrokeerrorcolor, f, setscaley, true));
                            }
                        }
                        setmeasureallchildren.setY();
                    } else {
                        arrayList.add(setChipSpacingVerticalResource.MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren, setboxstrokeerrorcolor, f, setscaley, false));
                    }
                } else {
                    setmeasureallchildren.setChipCornerRadius();
                }
            }
            setmeasureallchildren.setIconTintList();
            setX(arrayList);
            return arrayList;
        }
        setDrawingCacheEnabled.setIconTintList("Lottie doesn't support expressions.");
        setboxstrokeerrorcolor.setTextAlignment.add("Lottie doesn't support expressions.");
        return arrayList;
    }

    public static <T> void setX(List<? extends setChildIndicatorBoundsRelative<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            setChildIndicatorBoundsRelative<T> setchildindicatorboundsrelative = list.get(i2);
            i2++;
            setChildIndicatorBoundsRelative<T> setchildindicatorboundsrelative2 = list.get(i2);
            setchildindicatorboundsrelative.setX = Float.valueOf(setchildindicatorboundsrelative2.setOnLongClickListener);
            if (setchildindicatorboundsrelative.setIconTintList == null && setchildindicatorboundsrelative2.setUiOptions != null) {
                setchildindicatorboundsrelative.setIconTintList = setchildindicatorboundsrelative2.setUiOptions;
                if (setchildindicatorboundsrelative instanceof onActivityPostStarted) {
                    ((onActivityPostStarted) setchildindicatorboundsrelative).setY();
                }
            }
        }
        setChildIndicatorBoundsRelative<T> setchildindicatorboundsrelative3 = list.get(i);
        if ((setchildindicatorboundsrelative3.setUiOptions == null || setchildindicatorboundsrelative3.setIconTintList == null) && list.size() > 1) {
            list.remove(setchildindicatorboundsrelative3);
        }
    }
}