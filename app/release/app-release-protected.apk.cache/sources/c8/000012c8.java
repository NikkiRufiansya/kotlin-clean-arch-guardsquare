package o;

/* renamed from: o.wo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575wo extends vH {
    private final InterfaceC0607xr MenuHostHelper$$ExternalSyntheticLambda1;
    private final String setX;
    private final long setY;

    public C0575wo(String str, long j, InterfaceC0607xr interfaceC0607xr) {
        pN.setY(interfaceC0607xr, "");
        this.setX = str;
        this.setY = j;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0607xr;
    }

    @Override // o.vH
    public final long setIconTintList() {
        return this.setY;
    }

    @Override // o.vH
    public final vA MenuHostHelper$$ExternalSyntheticLambda0() {
        String str = this.setX;
        if (str != null) {
            return vA.setY.MenuHostHelper$$ExternalSyntheticLambda0(str);
        }
        return null;
    }

    @Override // o.vH
    public final InterfaceC0607xr MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }
}