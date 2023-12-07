package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class setAnimateOnTouchUp {
    private static PointF setY = new PointF();

    public static float MenuHostHelper$$ExternalSyntheticLambda0(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static double setX(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static boolean setX(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static PointF setIconTintList(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void setIconTintList(unregisterForContextMenu unregisterforcontextmenu, Path path) {
        path.reset();
        PointF pointF = unregisterforcontextmenu.setY;
        path.moveTo(pointF.x, pointF.y);
        setY.set(pointF.x, pointF.y);
        for (int i = 0; i < unregisterforcontextmenu.setX.size(); i++) {
            setTextSelectHandle settextselecthandle = unregisterforcontextmenu.setX.get(i);
            PointF pointF2 = settextselecthandle.MenuHostHelper$$ExternalSyntheticLambda1;
            PointF pointF3 = settextselecthandle.setX;
            PointF pointF4 = settextselecthandle.setIconTintList;
            if (pointF2.equals(setY) && pointF3.equals(pointF4)) {
                path.lineTo(pointF4.x, pointF4.y);
            } else {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            }
            setY.set(pointF4.x, pointF4.y);
        }
        if (unregisterforcontextmenu.MenuHostHelper$$ExternalSyntheticLambda0) {
            path.close();
        }
    }

    public static float setIconTintList(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(setSupportBackgroundTintList setsupportbackgroundtintlist, int i, List<setSupportBackgroundTintList> list, setSupportBackgroundTintList setsupportbackgroundtintlist2, setOnScrollListener setonscrolllistener) {
        if (setsupportbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda0(setonscrolllistener.MenuHostHelper$$ExternalSyntheticLambda0(), i)) {
            String MenuHostHelper$$ExternalSyntheticLambda0 = setonscrolllistener.MenuHostHelper$$ExternalSyntheticLambda0();
            setSupportBackgroundTintList setsupportbackgroundtintlist3 = new setSupportBackgroundTintList(setsupportbackgroundtintlist2);
            setsupportbackgroundtintlist3.setIconTintList.add(MenuHostHelper$$ExternalSyntheticLambda0);
            setSupportBackgroundTintList setsupportbackgroundtintlist4 = new setSupportBackgroundTintList(setsupportbackgroundtintlist3);
            setsupportbackgroundtintlist4.MenuHostHelper$$ExternalSyntheticLambda1 = setonscrolllistener;
            list.add(setsupportbackgroundtintlist4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int MenuHostHelper$$ExternalSyntheticLambda0(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        if (!((i ^ i2) >= 0) && i % i2 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }
}