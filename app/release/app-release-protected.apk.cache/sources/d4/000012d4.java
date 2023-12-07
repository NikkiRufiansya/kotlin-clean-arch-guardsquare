package o;

/* renamed from: o.wt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580wt {
    final InterfaceC0607xr setIconTintList;
    long setY;

    static {
        new setY((byte) 0);
    }

    public C0580wt(InterfaceC0607xr interfaceC0607xr) {
        pN.setY(interfaceC0607xr, "");
        this.setIconTintList = interfaceC0607xr;
        this.setY = 262144L;
    }

    public final C0557vz MenuHostHelper$$ExternalSyntheticLambda1() {
        C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda0 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
        while (true) {
            String x = this.setIconTintList.setX(this.setY);
            this.setY -= x.length();
            if (!(x.length() == 0)) {
                c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(x);
            } else {
                return c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.setX();
            }
        }
    }

    /* renamed from: o.wt$setY */
    /* loaded from: classes.dex */
    public static final class setY {
        private setY() {
        }

        public /* synthetic */ setY(byte b) {
            this();
        }
    }
}