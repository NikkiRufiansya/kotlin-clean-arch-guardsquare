package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class setScrollBarStyle extends setSubtitleTextAppearance<unregisterForContextMenu, Path> {
    private final unregisterForContextMenu setNavigationOnClickListener;
    private final Path setOnLongClickListener;

    public setScrollBarStyle(List<setChildIndicatorBoundsRelative<unregisterForContextMenu>> list) {
        super(list);
        this.setNavigationOnClickListener = new unregisterForContextMenu();
        this.setOnLongClickListener = new Path();
    }

    @Override // o.setSubtitleTextAppearance
    public final /* synthetic */ Path MenuHostHelper$$ExternalSyntheticLambda1(setChildIndicatorBoundsRelative<unregisterForContextMenu> setchildindicatorboundsrelative, float f) {
        unregisterForContextMenu unregisterforcontextmenu = setchildindicatorboundsrelative.setUiOptions;
        unregisterForContextMenu unregisterforcontextmenu2 = setchildindicatorboundsrelative.setIconTintList;
        unregisterForContextMenu unregisterforcontextmenu3 = this.setNavigationOnClickListener;
        if (unregisterforcontextmenu3.setY == null) {
            unregisterforcontextmenu3.setY = new PointF();
        }
        unregisterforcontextmenu3.MenuHostHelper$$ExternalSyntheticLambda0 = unregisterforcontextmenu.MenuHostHelper$$ExternalSyntheticLambda0 || unregisterforcontextmenu2.MenuHostHelper$$ExternalSyntheticLambda0;
        if (unregisterforcontextmenu.setX.size() != unregisterforcontextmenu2.setX.size()) {
            StringBuilder sb = new StringBuilder("Curves must have the same number of control points. Shape 1: ");
            sb.append(unregisterforcontextmenu.setX.size());
            sb.append("\tShape 2: ");
            sb.append(unregisterforcontextmenu2.setX.size());
            setDrawingCacheEnabled.setIconTintList(sb.toString());
        }
        int min = Math.min(unregisterforcontextmenu.setX.size(), unregisterforcontextmenu2.setX.size());
        if (unregisterforcontextmenu3.setX.size() < min) {
            for (int size = unregisterforcontextmenu3.setX.size(); size < min; size++) {
                unregisterforcontextmenu3.setX.add(new setTextSelectHandle());
            }
        } else if (unregisterforcontextmenu3.setX.size() > min) {
            for (int size2 = unregisterforcontextmenu3.setX.size() - 1; size2 >= min; size2--) {
                List<setTextSelectHandle> list = unregisterforcontextmenu3.setX;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = unregisterforcontextmenu.setY;
        PointF pointF2 = unregisterforcontextmenu2.setY;
        float MenuHostHelper$$ExternalSyntheticLambda0 = setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(pointF.x, pointF2.x, f);
        float MenuHostHelper$$ExternalSyntheticLambda02 = setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(pointF.y, pointF2.y, f);
        if (unregisterforcontextmenu3.setY == null) {
            unregisterforcontextmenu3.setY = new PointF();
        }
        unregisterforcontextmenu3.setY.set(MenuHostHelper$$ExternalSyntheticLambda0, MenuHostHelper$$ExternalSyntheticLambda02);
        for (int size3 = unregisterforcontextmenu3.setX.size() - 1; size3 >= 0; size3--) {
            setTextSelectHandle settextselecthandle = unregisterforcontextmenu.setX.get(size3);
            setTextSelectHandle settextselecthandle2 = unregisterforcontextmenu2.setX.get(size3);
            PointF pointF3 = settextselecthandle.MenuHostHelper$$ExternalSyntheticLambda1;
            PointF pointF4 = settextselecthandle.setX;
            PointF pointF5 = settextselecthandle.setIconTintList;
            PointF pointF6 = settextselecthandle2.MenuHostHelper$$ExternalSyntheticLambda1;
            PointF pointF7 = settextselecthandle2.setX;
            PointF pointF8 = settextselecthandle2.setIconTintList;
            unregisterforcontextmenu3.setX.get(size3).MenuHostHelper$$ExternalSyntheticLambda1.set(setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(pointF3.x, pointF6.x, f), setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(pointF3.y, pointF6.y, f));
            unregisterforcontextmenu3.setX.get(size3).setX.set(setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(pointF4.x, pointF7.x, f), setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(pointF4.y, pointF7.y, f));
            unregisterforcontextmenu3.setX.get(size3).setIconTintList.set(setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(pointF5.x, pointF8.x, f), setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(pointF5.y, pointF8.y, f));
        }
        setAnimateOnTouchUp.setIconTintList(this.setNavigationOnClickListener, this.setOnLongClickListener);
        return this.setOnLongClickListener;
    }
}