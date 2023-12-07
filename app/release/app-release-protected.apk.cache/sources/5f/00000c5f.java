package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class setIconResource implements setScaleY<unregisterForContextMenu> {
    public static final setIconResource MenuHostHelper$$ExternalSyntheticLambda0 = new setIconResource();
    private static final setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setY = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("c", "v", "i", "o");

    private setIconResource() {
    }

    @Override // o.setScaleY
    public final /* synthetic */ unregisterForContextMenu setX(setMeasureAllChildren setmeasureallchildren, float f) {
        if (setmeasureallchildren.setTextAlignment() == setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.BEGIN_ARRAY) {
            setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        setmeasureallchildren.setX();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (setmeasureallchildren.setUnboundedRipple()) {
            int MenuHostHelper$$ExternalSyntheticLambda1 = setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setY);
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                z = setmeasureallchildren.setUiOptions();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                list = AppDatabase_Impl.setIconTintList(setmeasureallchildren, f);
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                list2 = AppDatabase_Impl.setIconTintList(setmeasureallchildren, f);
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 3) {
                list3 = AppDatabase_Impl.setIconTintList(setmeasureallchildren, f);
            } else {
                setmeasureallchildren.ViewPager$SavedState$1();
                setmeasureallchildren.setChipCornerRadius();
            }
        }
        setmeasureallchildren.setIconTintList();
        if (setmeasureallchildren.setTextAlignment() == setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.END_ARRAY) {
            setmeasureallchildren.setY();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new unregisterForContextMenu(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = list.get(i);
            int i2 = i - 1;
            arrayList.add(new setTextSelectHandle(setAnimateOnTouchUp.setIconTintList(list.get(i2), list3.get(i2)), setAnimateOnTouchUp.setIconTintList(pointF2, list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = list.get(0);
            int i3 = size - 1;
            arrayList.add(new setTextSelectHandle(setAnimateOnTouchUp.setIconTintList(list.get(i3), list3.get(i3)), setAnimateOnTouchUp.setIconTintList(pointF3, list2.get(0)), pointF3));
        }
        return new unregisterForContextMenu(pointF, z, arrayList);
    }
}