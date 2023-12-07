package o;

/* loaded from: classes.dex */
public abstract class pS extends pF implements InterfaceC0416qw {
    public pS() {
    }

    public pS(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC0416qw setNavigationOnClickListener() {
        return (InterfaceC0416qw) super.setUiOptions();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pS) {
            pS pSVar = (pS) obj;
            return setLayoutAnimation().equals(pSVar.setLayoutAnimation()) && MenuHostHelper$$ExternalSyntheticLambda1().equals(pSVar.MenuHostHelper$$ExternalSyntheticLambda1()) && setUnboundedRipple().equals(pSVar.setUnboundedRipple()) && pN.MenuHostHelper$$ExternalSyntheticLambda0(setY(), pSVar.setY());
        } else if (obj instanceof InterfaceC0416qw) {
            return obj.equals(setX());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((setLayoutAnimation().hashCode() * 31) + MenuHostHelper$$ExternalSyntheticLambda1().hashCode()) * 31) + setUnboundedRipple().hashCode();
    }

    public String toString() {
        InterfaceC0411qr x = setX();
        if (x != this) {
            return x.toString();
        }
        StringBuilder sb = new StringBuilder("property ");
        sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    @Override // o.pF
    protected final /* bridge */ /* synthetic */ InterfaceC0411qr setUiOptions() {
        return (InterfaceC0416qw) super.setUiOptions();
    }
}