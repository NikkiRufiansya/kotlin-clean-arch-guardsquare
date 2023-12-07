package o;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class setEndIconOnClickListener implements getRootAlpha {
    public final String MenuHostHelper$$ExternalSyntheticLambda1;
    public final boolean setX;
    public final List<getRootAlpha> setY;

    public setEndIconOnClickListener(String str, List<getRootAlpha> list, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.setY = list;
        this.setX = z;
    }

    @Override // o.getRootAlpha
    public final setContentInsetStartWithNavigation setIconTintList(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable) {
        return new setFastScrollStyle(setpointericon, setendiconcheckable, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeGroup{name='");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append("' Shapes: ");
        sb.append(Arrays.toString(this.setY.toArray()));
        sb.append('}');
        return sb.toString();
    }
}