package o;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class setOnLongClickListener {
    private CopyOnWriteArrayList<MenuHostHelper$$ExternalSyntheticLambda1> setX = new CopyOnWriteArrayList<>();
    private boolean setY = false;

    public abstract void setX();

    public setOnLongClickListener(boolean z) {
    }

    public final void setIconTintList(boolean z) {
        this.setY = z;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setY;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        Iterator<MenuHostHelper$$ExternalSyntheticLambda1> it = this.setX.iterator();
        while (it.hasNext()) {
            it.next().setY();
        }
    }

    public final void setX(MenuHostHelper$$ExternalSyntheticLambda1 menuHostHelper$$ExternalSyntheticLambda1) {
        this.setX.add(menuHostHelper$$ExternalSyntheticLambda1);
    }

    public final void setY(MenuHostHelper$$ExternalSyntheticLambda1 menuHostHelper$$ExternalSyntheticLambda1) {
        this.setX.remove(menuHostHelper$$ExternalSyntheticLambda1);
    }
}