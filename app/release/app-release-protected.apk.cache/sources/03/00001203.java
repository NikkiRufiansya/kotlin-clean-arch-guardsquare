package o;

/* loaded from: classes.dex */
public abstract class vR {
    vW MenuHostHelper$$ExternalSyntheticLambda1;
    final String setIconTintList;
    final boolean setX;
    long setY;

    public abstract long MenuHostHelper$$ExternalSyntheticLambda1();

    public vR(String str, boolean z) {
        pN.setY(str, "");
        this.setIconTintList = str;
        this.setX = true;
        this.setY = -1L;
    }

    public /* synthetic */ vR(String str) {
        this(str, true);
    }

    public final void setIconTintList(vW vWVar) {
        pN.setY(vWVar, "");
        vW vWVar2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (vWVar2 == vWVar) {
            return;
        }
        if (!(vWVar2 == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = vWVar;
    }

    public String toString() {
        return this.setIconTintList;
    }
}