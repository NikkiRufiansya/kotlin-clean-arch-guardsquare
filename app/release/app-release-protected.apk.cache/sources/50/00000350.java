package o;

import java.lang.ref.WeakReference;
import o.cS;

/* loaded from: classes.dex */
public abstract class cV implements cS.setIconTintList {
    private final cS MenuHostHelper$$ExternalSyntheticLambda0;
    private final WeakReference<cS.setIconTintList> MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setIconTintList;
    private eJ setX;

    protected cV() {
        this(cS.MenuHostHelper$$ExternalSyntheticLambda1());
    }

    public cV(cS cSVar) {
        this.setIconTintList = false;
        this.setX = eJ.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = cSVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new WeakReference<>(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setIconTintList() {
        if (this.setIconTintList) {
            return;
        }
        this.setX = this.MenuHostHelper$$ExternalSyntheticLambda0.setX;
        cS cSVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
        WeakReference<cS.setIconTintList> weakReference = this.MenuHostHelper$$ExternalSyntheticLambda1;
        synchronized (cSVar.setIconTintList) {
            cSVar.setIconTintList.add(weakReference);
        }
        this.setIconTintList = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setY() {
        if (this.setIconTintList) {
            cS cSVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
            WeakReference<cS.setIconTintList> weakReference = this.MenuHostHelper$$ExternalSyntheticLambda1;
            synchronized (cSVar.setIconTintList) {
                cSVar.setIconTintList.remove(weakReference);
            }
            this.setIconTintList = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setY.addAndGet(1);
    }

    @Override // o.cS.setIconTintList
    public final void setX(eJ eJVar) {
        if (this.setX == eJ.APPLICATION_PROCESS_STATE_UNKNOWN) {
            this.setX = eJVar;
        } else if (this.setX == eJVar || eJVar == eJ.APPLICATION_PROCESS_STATE_UNKNOWN) {
        } else {
            this.setX = eJ.FOREGROUND_BACKGROUND;
        }
    }

    public final eJ setX() {
        return this.setX;
    }
}