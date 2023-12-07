package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class FullLifecycleObserverAdapter {
    public final Runnable MenuHostHelper$$ExternalSyntheticLambda0;
    public final CopyOnWriteArrayList<setMenuAlignmentMode> setY = new CopyOnWriteArrayList<>();
    private final Map<setMenuAlignmentMode, setIconTintList> setIconTintList = new HashMap();

    /* loaded from: classes.dex */
    static class setIconTintList {
        setCheckable MenuHostHelper$$ExternalSyntheticLambda0;
        final registerIn setX;
    }

    public FullLifecycleObserverAdapter(Runnable runnable) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = runnable;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        Iterator<setMenuAlignmentMode> it = this.setY.iterator();
        while (it.hasNext()) {
            if (it.next().MenuHostHelper$$ExternalSyntheticLambda0()) {
                return true;
            }
        }
        return false;
    }

    public final void setIconTintList(setMenuAlignmentMode setmenualignmentmode) {
        this.setY.remove(setmenualignmentmode);
        setIconTintList remove = this.setIconTintList.remove(setmenualignmentmode);
        if (remove != null) {
            remove.setX.MenuHostHelper$$ExternalSyntheticLambda1(remove.MenuHostHelper$$ExternalSyntheticLambda0);
            remove.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.run();
    }
}