package o;

import java.util.ArrayList;
import o.setVisibility;

/* loaded from: classes.dex */
public final class setActionBarHideOffset {
    public static boolean setIconTintList(setVisibility.setX setx, setVisibility.setX setx2, setVisibility.setX setx3, setVisibility.setX setx4) {
        return (setx3 == setVisibility.setX.FIXED || setx3 == setVisibility.setX.WRAP_CONTENT || (setx3 == setVisibility.setX.MATCH_PARENT && setx != setVisibility.setX.WRAP_CONTENT)) || (setx4 == setVisibility.setX.FIXED || setx4 == setVisibility.setX.WRAP_CONTENT || (setx4 == setVisibility.setX.MATCH_PARENT && setx2 != setVisibility.setX.WRAP_CONTENT));
    }

    public static setOnGroupExpandListener setIconTintList(ArrayList<setOnGroupExpandListener> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            setOnGroupExpandListener setongroupexpandlistener = arrayList.get(i2);
            if (i == setongroupexpandlistener.setX) {
                return setongroupexpandlistener;
            }
        }
        return null;
    }

    public static setOnGroupExpandListener setY(setVisibility setvisibility, int i, ArrayList<setOnGroupExpandListener> arrayList, setOnGroupExpandListener setongroupexpandlistener) {
        int i2;
        boolean z;
        int chipCornerRadius;
        if (i == 0) {
            i2 = setvisibility.setLayoutAnimation;
        } else {
            i2 = setvisibility.createDispatcher;
        }
        if (i2 != -1 && (setongroupexpandlistener == null || i2 != setongroupexpandlistener.setX)) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                setOnGroupExpandListener setongroupexpandlistener2 = arrayList.get(i3);
                if (setongroupexpandlistener2.setX == i2) {
                    if (setongroupexpandlistener != null) {
                        setongroupexpandlistener.setX(i, setongroupexpandlistener2);
                        arrayList.remove(setongroupexpandlistener);
                    }
                    setongroupexpandlistener = setongroupexpandlistener2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return setongroupexpandlistener;
        }
        if (setongroupexpandlistener == null) {
            if ((setvisibility instanceof setForceApplySystemWindowInsetTop) && (chipCornerRadius = ((setForceApplySystemWindowInsetTop) setvisibility).setChipCornerRadius(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    setOnGroupExpandListener setongroupexpandlistener3 = arrayList.get(i4);
                    if (setongroupexpandlistener3.setX == chipCornerRadius) {
                        setongroupexpandlistener = setongroupexpandlistener3;
                        break;
                    }
                    i4++;
                }
            }
            if (setongroupexpandlistener == null) {
                setongroupexpandlistener = new setOnGroupExpandListener(i);
            }
            arrayList.add(setongroupexpandlistener);
        }
        if (setongroupexpandlistener.MenuHostHelper$$ExternalSyntheticLambda0.contains(setvisibility)) {
            z = false;
        } else {
            setongroupexpandlistener.MenuHostHelper$$ExternalSyntheticLambda0.add(setvisibility);
            z = true;
        }
        if (z) {
            if (setvisibility instanceof SwipeDismissBehavior) {
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) setvisibility;
                swipeDismissBehavior.setX.setIconTintList(swipeDismissBehavior.setY == 0 ? 1 : 0, arrayList, setongroupexpandlistener);
            }
            if (i == 0) {
                setvisibility.setLayoutAnimation = setongroupexpandlistener.setX;
                setvisibility.setIconified.setIconTintList(i, arrayList, setongroupexpandlistener);
                setvisibility.setShrinkMotionSpec.setIconTintList(i, arrayList, setongroupexpandlistener);
            } else {
                setvisibility.createDispatcher = setongroupexpandlistener.setX;
                setvisibility.setChipSpacingVertical.setIconTintList(i, arrayList, setongroupexpandlistener);
                setvisibility.ViewPager$SavedState$1.setIconTintList(i, arrayList, setongroupexpandlistener);
                setvisibility.setIconSize.setIconTintList(i, arrayList, setongroupexpandlistener);
            }
            setvisibility.setCenterIfNoTextEnabled.setIconTintList(i, arrayList, setongroupexpandlistener);
        }
        return setongroupexpandlistener;
    }
}