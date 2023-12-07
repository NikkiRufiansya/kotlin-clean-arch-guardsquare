package o;

/* renamed from: o.df  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099df implements InterfaceC0100dg {
    private nF<cW> MenuHostHelper$$ExternalSyntheticLambda0;
    private nF<cR> MenuHostHelper$$ExternalSyntheticLambda1;
    private nF<InterfaceC0073cg<C0172fz>> setIconTintList;
    private nF<cY> setLayoutAnimation;
    private nF<InterfaceC0073cg<setIconPadding>> setNavigationOnClickListener;
    private nF<dQ> setOnLongClickListener;
    private nF<InterfaceC0083cq> setX;
    private nF<com.google.firebase.FirebaseApp> setY;

    public /* synthetic */ C0099df(C0096dc c0096dc, byte b) {
        this(c0096dc);
    }

    private C0099df(C0096dc c0096dc) {
        this.setY = new C0104dk(c0096dc);
        this.setIconTintList = new C0105dl(c0096dc);
        this.setX = new C0103dj(c0096dc);
        this.setNavigationOnClickListener = new C0109dq(c0096dc);
        this.setLayoutAnimation = new C0101dh(c0096dc);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new C0102di(c0096dc);
        C0107dn c0107dn = new C0107dn(c0096dc);
        this.setOnLongClickListener = c0107dn;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = C0335nw.setX(new cN(this.setY, this.setIconTintList, this.setX, this.setNavigationOnClickListener, this.setLayoutAnimation, this.MenuHostHelper$$ExternalSyntheticLambda0, c0107dn));
    }

    @Override // o.InterfaceC0100dg
    public final cR setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
    }
}