package o;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* renamed from: o.ut  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523ut {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> uF MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0377pk<? super E, nX> interfaceC0377pk, E e, uF uFVar) {
        try {
            interfaceC0377pk.setX(e);
            return null;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception in undelivered element handler for ");
            sb.append(e);
            return new uF(sb.toString(), th);
        }
    }

    /* renamed from: o.ut$setY */
    /* loaded from: classes.dex */
    public static final class setY extends pO implements InterfaceC0377pk<Throwable, nX> {
        private /* synthetic */ E MenuHostHelper$$ExternalSyntheticLambda1;
        private /* synthetic */ InterfaceC0377pk<E, nX> setX;
        private /* synthetic */ oM setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public setY(InterfaceC0377pk<? super E, nX> interfaceC0377pk, E e, oM oMVar) {
            super(1);
            this.setX = interfaceC0377pk;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = e;
            this.setY = oMVar;
        }

        @Override // o.InterfaceC0377pk
        public final /* synthetic */ nX setX(Throwable th) {
            InterfaceC0377pk<E, nX> interfaceC0377pk = this.setX;
            E e = this.MenuHostHelper$$ExternalSyntheticLambda1;
            oM oMVar = this.setY;
            uF MenuHostHelper$$ExternalSyntheticLambda0 = C0523ut.MenuHostHelper$$ExternalSyntheticLambda0(interfaceC0377pk, e, null);
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                rP.setIconTintList(oMVar, MenuHostHelper$$ExternalSyntheticLambda0);
            }
            return nX.setX;
        }
    }
}