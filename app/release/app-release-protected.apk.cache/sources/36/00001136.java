package o;

/* loaded from: classes.dex */
public final class tH extends tP<tD<?>> {
    public oK<? super nX> MenuHostHelper$$ExternalSyntheticLambda1;
    public long setY = -1;

    @Override // o.tP
    public final /* bridge */ /* synthetic */ boolean setIconTintList(tD<?> tDVar) {
        tD<?> tDVar2 = tDVar;
        if (this.setY >= 0) {
            return false;
        }
        long j = tDVar2.MenuHostHelper$$ExternalSyntheticLambda0;
        if (j < tDVar2.setY) {
            tDVar2.setY = j;
        }
        this.setY = j;
        return true;
    }

    @Override // o.tP
    public final /* synthetic */ oK[] setX(tD<?> tDVar) {
        rX.setIconTintList();
        long j = this.setY;
        this.setY = -1L;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        return tDVar.setX(j);
    }
}