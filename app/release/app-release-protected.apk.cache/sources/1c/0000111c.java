package o;

/* renamed from: o.sp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0463sp extends rQ {
    boolean MenuHostHelper$$ExternalSyntheticLambda1;
    public long setLayoutAnimation;
    public tU<AbstractC0451sd<?>> setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long setIconTintList(boolean z) {
        return 4294967296L;
    }

    public void setIconTintList() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long setX() {
        tU<AbstractC0451sd<?>> tUVar = this.setX;
        if (tUVar == null) {
            return Long.MAX_VALUE;
        }
        return !(tUVar.MenuHostHelper$$ExternalSyntheticLambda0 == tUVar.MenuHostHelper$$ExternalSyntheticLambda1) ? 0L : Long.MAX_VALUE;
    }

    public final boolean setUiOptions() {
        AbstractC0451sd<?> x;
        tU<AbstractC0451sd<?>> tUVar = this.setX;
        if (tUVar == null || (x = tUVar.setX()) == null) {
            return false;
        }
        x.run();
        return true;
    }

    public final void setY(boolean z) {
        long j = this.setLayoutAnimation - (z ? 4294967296L : 1L);
        this.setLayoutAnimation = j;
        if (j > 0) {
            return;
        }
        rX.setIconTintList();
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            setIconTintList();
        }
    }

    @Override // o.rQ
    public final rQ setIconTintList(int i) {
        C0512ui.setX(i);
        return this;
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(AbstractC0463sp abstractC0463sp) {
        abstractC0463sp.setLayoutAnimation++;
        abstractC0463sp.MenuHostHelper$$ExternalSyntheticLambda1 = true;
    }

    protected boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        tU<AbstractC0451sd<?>> tUVar = this.setX;
        return tUVar == null || tUVar.MenuHostHelper$$ExternalSyntheticLambda0 == tUVar.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public long MenuHostHelper$$ExternalSyntheticLambda0() {
        AbstractC0451sd<?> x;
        tU<AbstractC0451sd<?>> tUVar = this.setX;
        boolean z = false;
        if (tUVar != null && (x = tUVar.setX()) != null) {
            x.run();
            z = true;
        }
        return !z ? Long.MAX_VALUE : 0L;
    }
}