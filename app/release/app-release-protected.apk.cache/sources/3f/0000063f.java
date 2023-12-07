package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.iz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254iz implements iX {
    private static final iD setX = new iD() { // from class: o.iz.4
        @Override // o.iD
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0(Class<?> cls) {
            return false;
        }

        @Override // o.iD
        public final iF setIconTintList(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final iD setY;

    private C0254iz(iD iDVar) {
        this.setY = (iD) C0243ip.setX(iDVar, "messageInfoFactory");
    }

    @Override // o.iX
    public final <T> iY<T> MenuHostHelper$$ExternalSyntheticLambda0(Class<T> cls) {
        iN iNVar;
        je<?, ?> jeVar;
        iN iNVar2;
        je<?, ?> jeVar2;
        iN iNVar3;
        AbstractC0252ix abstractC0252ix;
        iE iEVar;
        iN iNVar4;
        AbstractC0252ix abstractC0252ix2;
        iE iEVar2;
        je<?, ?> jeVar3;
        iZ.setY((Class<?>) cls);
        iF iconTintList = this.setY.setIconTintList(cls);
        if (iconTintList.setX()) {
            if (!AbstractC0239il.class.isAssignableFrom(cls)) {
                jeVar3 = iZ.setY;
                return new iG(jeVar3, C0233ie.setX(), iconTintList.MenuHostHelper$$ExternalSyntheticLambda1());
            }
            return new iG(iZ.setY(), C0233ie.setY(), iconTintList.MenuHostHelper$$ExternalSyntheticLambda1());
        }
        if (AbstractC0239il.class.isAssignableFrom(cls)) {
            if (iconTintList.MenuHostHelper$$ExternalSyntheticLambda0() == iQ.PROTO2) {
                iNVar4 = iL.MenuHostHelper$$ExternalSyntheticLambda0;
                abstractC0252ix2 = AbstractC0252ix.setX;
                je<?, ?> y = iZ.setY();
                AbstractC0231ic<?> y2 = C0233ie.setY();
                iEVar2 = iC.MenuHostHelper$$ExternalSyntheticLambda1;
                return iH.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList, iNVar4, abstractC0252ix2, y, y2, iEVar2);
            }
            iNVar3 = iL.MenuHostHelper$$ExternalSyntheticLambda0;
            abstractC0252ix = AbstractC0252ix.setX;
            je<?, ?> y3 = iZ.setY();
            iEVar = iC.MenuHostHelper$$ExternalSyntheticLambda1;
            return iH.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList, iNVar3, abstractC0252ix, y3, null, iEVar);
        }
        if (iconTintList.MenuHostHelper$$ExternalSyntheticLambda0() == iQ.PROTO2) {
            iNVar2 = iL.setIconTintList;
            AbstractC0252ix x = AbstractC0252ix.setX();
            jeVar2 = iZ.setY;
            return iH.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList, iNVar2, x, jeVar2, C0233ie.setX(), iC.setX());
        }
        iNVar = iL.setIconTintList;
        AbstractC0252ix x2 = AbstractC0252ix.setX();
        jeVar = iZ.MenuHostHelper$$ExternalSyntheticLambda1;
        return iH.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList, iNVar, x2, jeVar, null, iC.setX());
    }

    private static iD setY() {
        try {
            return (iD) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return setX;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0254iz() {
        /*
            r3 = this;
            r0 = 2
            o.iD[] r0 = new o.iD[r0]
            o.ih r1 = o.C0235ih.MenuHostHelper$$ExternalSyntheticLambda1()
            r2 = 0
            r0[r2] = r1
            o.iD r1 = setY()
            r2 = 1
            r0[r2] = r1
            o.iz$MenuHostHelper$$ExternalSyntheticLambda1 r1 = new o.iz$MenuHostHelper$$ExternalSyntheticLambda1
            r1.<init>(r0)
            r3.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0254iz.<init>():void");
    }
}