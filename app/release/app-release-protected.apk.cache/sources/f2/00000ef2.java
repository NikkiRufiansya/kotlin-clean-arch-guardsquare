package o;

/* loaded from: classes.dex */
public final class setRenderMode {
    private boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private setY setIconTintList;
    private boolean setX;
    private Object setY;

    /* loaded from: classes.dex */
    public interface setY {
        void MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        synchronized (this) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            this.setX = true;
            setY sety = this.setIconTintList;
            if (sety != null) {
                try {
                    sety.MenuHostHelper$$ExternalSyntheticLambda1();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.setX = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.setX = false;
                notifyAll();
            }
        }
    }

    public final void setX(setY sety) {
        synchronized (this) {
            while (this.setX) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.setIconTintList == sety) {
                return;
            }
            this.setIconTintList = sety;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                sety.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        }
    }
}