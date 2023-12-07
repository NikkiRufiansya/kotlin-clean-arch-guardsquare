package o;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class setContentInsetsAbsolute {
    public final List<setSubtitleTextAppearance<unregisterForContextMenu, Path>> MenuHostHelper$$ExternalSyntheticLambda0;
    public final List<setScrollIndicators> MenuHostHelper$$ExternalSyntheticLambda1;
    public final List<setSubtitleTextAppearance<Integer, Integer>> setX;

    public setContentInsetsAbsolute(List<setScrollIndicators> list) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = list;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList(list.size());
        this.setX = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.add(new setScrollBarStyle(list.get(i).setX.MenuHostHelper$$ExternalSyntheticLambda1));
            this.setX.add(new hashCode(list.get(i).MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1));
        }
    }
}