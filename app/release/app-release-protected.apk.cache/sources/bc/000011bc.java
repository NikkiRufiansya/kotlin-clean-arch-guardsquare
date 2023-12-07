package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class unregisterForContextMenu {
    public boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public final List<setTextSelectHandle> setX;
    public PointF setY;

    public unregisterForContextMenu(PointF pointF, boolean z, List<setTextSelectHandle> list) {
        this.setY = pointF;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        this.setX = new ArrayList(list);
    }

    public unregisterForContextMenu() {
        this.setX = new ArrayList();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.setX.size());
        sb.append("closed=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append('}');
        return sb.toString();
    }
}