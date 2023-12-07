package o;

/* renamed from: o.eq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0136eq implements Runnable {
    private /* synthetic */ eO MenuHostHelper$$ExternalSyntheticLambda0;
    private /* synthetic */ eJ setIconTintList;
    private /* synthetic */ C0126eg setY;

    public /* synthetic */ RunnableC0136eq(C0126eg c0126eg, eO eOVar, eJ eJVar) {
        this.setY = c0126eg;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = eOVar;
        this.setIconTintList = eJVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0126eg c0126eg = this.setY;
        eO eOVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
        c0126eg.setY(eV.setY().MenuHostHelper$$ExternalSyntheticLambda1(eOVar), this.setIconTintList);
    }
}