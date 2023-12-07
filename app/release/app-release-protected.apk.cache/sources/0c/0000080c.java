package o;

/* loaded from: classes.dex */
public class pP extends pF implements pJ, InterfaceC0415qv {
    private final int MenuHostHelper$$ExternalSyntheticLambda0;
    private final int setY;

    public pP(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, false);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.setY = 0;
    }

    @Override // o.pJ
    public final int setOnLongClickListener() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.pF
    protected final InterfaceC0411qr MenuHostHelper$$ExternalSyntheticLambda0() {
        return C0394qa.MenuHostHelper$$ExternalSyntheticLambda0(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pP) {
            pP pPVar = (pP) obj;
            return MenuHostHelper$$ExternalSyntheticLambda1().equals(pPVar.MenuHostHelper$$ExternalSyntheticLambda1()) && setUnboundedRipple().equals(pPVar.setUnboundedRipple()) && this.setY == pPVar.setY && this.MenuHostHelper$$ExternalSyntheticLambda0 == pPVar.MenuHostHelper$$ExternalSyntheticLambda0 && pN.MenuHostHelper$$ExternalSyntheticLambda0(setY(), pPVar.setY()) && pN.MenuHostHelper$$ExternalSyntheticLambda0(setLayoutAnimation(), pPVar.setLayoutAnimation());
        } else if (obj instanceof InterfaceC0415qv) {
            return obj.equals(setX());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((setLayoutAnimation() == null ? 0 : setLayoutAnimation().hashCode() * 31) + MenuHostHelper$$ExternalSyntheticLambda1().hashCode()) * 31) + setUnboundedRipple().hashCode();
    }

    public String toString() {
        InterfaceC0411qr x = setX();
        if (x != this) {
            return x.toString();
        }
        if ("<init>".equals(MenuHostHelper$$ExternalSyntheticLambda1())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder sb = new StringBuilder("function ");
        sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.pF
    public final /* bridge */ /* synthetic */ InterfaceC0411qr setUiOptions() {
        return (InterfaceC0415qv) super.setUiOptions();
    }
}