package o;

/* loaded from: classes.dex */
public class uA<T> extends AbstractC0430rj<T> implements oW {
    public final oK<T> setY;

    @Override // o.oW
    public final StackTraceElement MenuHostHelper$$ExternalSyntheticLambda1() {
        return null;
    }

    @Override // o.sK
    public final boolean r_() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uA(oM oMVar, oK<? super T> oKVar) {
        super(oMVar, true);
        this.setY = oKVar;
    }

    @Override // o.oW
    public final oW setY() {
        oK<T> oKVar = this.setY;
        if (oKVar instanceof oW) {
            return (oW) oKVar;
        }
        return null;
    }

    @Override // o.sK
    public void setIconTintList(Object obj) {
        C0510ug.setIconTintList(oP.setY(this.setY), rJ.MenuHostHelper$$ExternalSyntheticLambda0(obj, this.setY), null);
    }

    @Override // o.AbstractC0430rj
    public void MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        oK<T> oKVar = this.setY;
        oKVar.MenuHostHelper$$ExternalSyntheticLambda0(rJ.MenuHostHelper$$ExternalSyntheticLambda0(obj, oKVar));
    }
}