package o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class setOnTabSelectedListener<T> {
    final rU MenuHostHelper$$ExternalSyntheticLambda0;
    final AtomicInteger MenuHostHelper$$ExternalSyntheticLambda1;
    final InterfaceC0480tf<T> setIconTintList;
    final InterfaceC0389pw<T, oK<? super nX>, Object> setY;

    /* JADX WARN: Multi-variable type inference failed */
    public setOnTabSelectedListener(rU rUVar, InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk, InterfaceC0389pw<? super T, ? super Throwable, nX> interfaceC0389pw, InterfaceC0389pw<? super T, ? super oK<? super nX>, ? extends Object> interfaceC0389pw2) {
        pN.setY(rUVar, "");
        pN.setY(interfaceC0377pk, "");
        pN.setY(interfaceC0389pw, "");
        pN.setY(interfaceC0389pw2, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = rUVar;
        this.setY = interfaceC0389pw2;
        EnumC0484tj enumC0484tj = EnumC0484tj.SUSPEND;
        this.setIconTintList = new C0485tk(null);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new AtomicInteger(0);
        sB sBVar = (sB) rUVar.setIconTintList().get(sB.MenuHostHelper$$ExternalSyntheticLambda1);
        if (sBVar != null) {
            sBVar.setIconTintList(new AnonymousClass3(interfaceC0377pk, this, interfaceC0389pw));
        }
    }

    /* renamed from: o.setOnTabSelectedListener$3  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends pO implements InterfaceC0377pk<Throwable, nX> {
        final /* synthetic */ setOnTabSelectedListener<T> MenuHostHelper$$ExternalSyntheticLambda0;
        final /* synthetic */ InterfaceC0389pw<T, Throwable, nX> MenuHostHelper$$ExternalSyntheticLambda1;
        final /* synthetic */ InterfaceC0377pk<Throwable, nX> setIconTintList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk, setOnTabSelectedListener<T> setontabselectedlistener, InterfaceC0389pw<? super T, ? super Throwable, nX> interfaceC0389pw) {
            super(1);
            this.setIconTintList = interfaceC0377pk;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setontabselectedlistener;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0389pw;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC0377pk
        public final /* synthetic */ nX setX(Throwable th) {
            nX nXVar;
            Throwable th2 = th;
            this.setIconTintList.setX(th2);
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.setIconTintList(th2);
            do {
                Object y = C0483ti.setY(this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0());
                if (y == null) {
                    nXVar = null;
                    continue;
                } else {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(y, th2);
                    nXVar = nX.setX;
                    continue;
                }
            } while (nXVar != null);
            return nX.setX;
        }
    }

    public final void setY(T t) {
        Object x = this.setIconTintList.setX((InterfaceC0480tf<T>) t);
        if (x instanceof ti$MenuHostHelper$$ExternalSyntheticLambda0) {
            Throwable MenuHostHelper$$ExternalSyntheticLambda1 = C0483ti.MenuHostHelper$$ExternalSyntheticLambda1(x);
            if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                throw MenuHostHelper$$ExternalSyntheticLambda1;
            }
            throw new C0488tn("Channel was closed normally");
        } else if (!C0483ti.setIconTintList(x)) {
            throw new IllegalStateException("Check failed.".toString());
        } else {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.getAndIncrement() == 0) {
                C0435ro.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0, null, null, new setY(this, null), 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setY extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
        final /* synthetic */ setOnTabSelectedListener<T> MenuHostHelper$$ExternalSyntheticLambda0;
        private Object MenuHostHelper$$ExternalSyntheticLambda1;
        private int setX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setY(setOnTabSelectedListener<T> setontabselectedlistener, oK<? super setY> oKVar) {
            super(2, oKVar);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setontabselectedlistener;
        }

        @Override // o.oR
        public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
            return new setY(this.MenuHostHelper$$ExternalSyntheticLambda0, oKVar);
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, oK<? super nX> oKVar) {
            return new setY(this.MenuHostHelper$$ExternalSyntheticLambda0, oKVar).setY(nX.setX);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0085 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0083 -> B:39:0x0086). Please submit an issue!!! */
        @Override // o.oR
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object setY(java.lang.Object r7) {
            /*
                r6 = this;
                o.oJ r0 = o.oJ.COROUTINE_SUSPENDED
                int r1 = r6.setX
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                boolean r1 = r7 instanceof o.nR.setX
                if (r1 != 0) goto L13
                r7 = r6
                goto L86
            L13:
                o.nR$setX r7 = (o.nR.setX) r7
                java.lang.Throwable r7 = r7.MenuHostHelper$$ExternalSyntheticLambda0
                throw r7
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                java.lang.Object r1 = r6.MenuHostHelper$$ExternalSyntheticLambda1
                o.pw r1 = (o.InterfaceC0389pw) r1
                boolean r4 = r7 instanceof o.nR.setX
                if (r4 != 0) goto L2b
                r4 = r7
                r7 = r6
                goto L7a
            L2b:
                o.nR$setX r7 = (o.nR.setX) r7
                java.lang.Throwable r7 = r7.MenuHostHelper$$ExternalSyntheticLambda0
                throw r7
            L30:
                boolean r1 = r7 instanceof o.nR.setX
                if (r1 != 0) goto La1
                o.setOnTabSelectedListener<T> r7 = r6.MenuHostHelper$$ExternalSyntheticLambda0
                java.util.concurrent.atomic.AtomicInteger r7 = r7.MenuHostHelper$$ExternalSyntheticLambda1
                int r7 = r7.get()
                if (r7 <= 0) goto L40
                r7 = 1
                goto L41
            L40:
                r7 = 0
            L41:
                if (r7 == 0) goto L93
                r7 = r6
            L44:
                o.setOnTabSelectedListener<T> r1 = r7.MenuHostHelper$$ExternalSyntheticLambda0
                o.rU r1 = r1.MenuHostHelper$$ExternalSyntheticLambda0
                o.oM r1 = r1.setIconTintList()
                o.sB$setY r4 = o.sB.MenuHostHelper$$ExternalSyntheticLambda1
                o.oM$MenuHostHelper$$ExternalSyntheticLambda0 r4 = (o.oM$MenuHostHelper$$ExternalSyntheticLambda0) r4
                o.oM$MenuHostHelper$$ExternalSyntheticLambda1 r1 = r1.get(r4)
                o.sB r1 = (o.sB) r1
                if (r1 == 0) goto L64
                boolean r4 = r1.setNavigationOnClickListener()
                if (r4 == 0) goto L5f
                goto L64
            L5f:
                java.util.concurrent.CancellationException r7 = r1.setLayoutAnimation()
                throw r7
            L64:
                o.setOnTabSelectedListener<T> r1 = r7.MenuHostHelper$$ExternalSyntheticLambda0
                o.pw<T, o.oK<? super o.nX>, java.lang.Object> r1 = r1.setY
                o.setOnTabSelectedListener<T> r4 = r7.MenuHostHelper$$ExternalSyntheticLambda0
                o.tf<T> r4 = r4.setIconTintList
                r5 = r7
                o.oK r5 = (o.oK) r5
                r7.MenuHostHelper$$ExternalSyntheticLambda1 = r1
                r7.setX = r3
                java.lang.Object r4 = r4.setX(r5)
                if (r4 != r0) goto L7a
                return r0
            L7a:
                r5 = 0
                r7.MenuHostHelper$$ExternalSyntheticLambda1 = r5
                r7.setX = r2
                java.lang.Object r1 = r1.MenuHostHelper$$ExternalSyntheticLambda0(r4, r7)
                if (r1 != r0) goto L86
                return r0
            L86:
                o.setOnTabSelectedListener<T> r1 = r7.MenuHostHelper$$ExternalSyntheticLambda0
                java.util.concurrent.atomic.AtomicInteger r1 = r1.MenuHostHelper$$ExternalSyntheticLambda1
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L44
                o.nX r7 = o.nX.setX
                return r7
            L93:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                throw r7
            La1:
                o.nR$setX r7 = (o.nR.setX) r7
                java.lang.Throwable r7 = r7.MenuHostHelper$$ExternalSyntheticLambda0
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setOnTabSelectedListener.setY.setY(java.lang.Object):java.lang.Object");
        }
    }
}