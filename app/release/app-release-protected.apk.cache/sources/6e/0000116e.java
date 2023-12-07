package o;

/* renamed from: o.tu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class C0495tu {

    /* renamed from: o.tu$setY */
    /* loaded from: classes.dex */
    static final class setY<T> implements InterfaceC0498tx {
        private /* synthetic */ InterfaceC0389pw<T, oK<? super Boolean>, Object> MenuHostHelper$$ExternalSyntheticLambda1;
        private /* synthetic */ pY$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList;
        private /* synthetic */ InterfaceC0498tx<T> setX;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.tu$setY$setX */
        /* loaded from: classes.dex */
        public static final class setX extends oX {
            private /* synthetic */ setY<T> MenuHostHelper$$ExternalSyntheticLambda0;
            int MenuHostHelper$$ExternalSyntheticLambda1;
            Object setIconTintList;
            /* synthetic */ Object setX;
            Object setY;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            setX(setY<? super T> sety, oK<? super setX> oKVar) {
                super(oKVar);
                this.MenuHostHelper$$ExternalSyntheticLambda0 = sety;
            }

            @Override // o.oR
            public final Object setY(Object obj) {
                this.setX = obj;
                this.MenuHostHelper$$ExternalSyntheticLambda1 |= Integer.MIN_VALUE;
                return this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        public setY(pY$MenuHostHelper$$ExternalSyntheticLambda1 py_menuhosthelper__externalsyntheticlambda1, InterfaceC0498tx<? super T> interfaceC0498tx, InterfaceC0389pw<? super T, ? super oK<? super Boolean>, ? extends Object> interfaceC0389pw) {
            this.setIconTintList = py_menuhosthelper__externalsyntheticlambda1;
            this.setX = interfaceC0498tx;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0389pw;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
        @Override // o.InterfaceC0498tx
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object setIconTintList(T r7, o.oK<? super o.nX> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o.C0495tu.setY.setX
                if (r0 == 0) goto L14
                r0 = r8
                o.tu$setY$setX r0 = (o.C0495tu.setY.setX) r0
                int r1 = r0.MenuHostHelper$$ExternalSyntheticLambda1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r8 = r0.MenuHostHelper$$ExternalSyntheticLambda1
                int r8 = r8 + r2
                r0.MenuHostHelper$$ExternalSyntheticLambda1 = r8
                goto L19
            L14:
                o.tu$setY$setX r0 = new o.tu$setY$setX
                r0.<init>(r6, r8)
            L19:
                java.lang.Object r8 = r0.setX
                o.oJ r1 = o.oJ.COROUTINE_SUSPENDED
                int r2 = r0.MenuHostHelper$$ExternalSyntheticLambda1
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L56
                if (r2 == r5) goto L4c
                if (r2 == r4) goto L3c
                if (r2 != r3) goto L34
                boolean r7 = r8 instanceof o.nR.setX
                if (r7 != 0) goto L2f
                goto L9a
            L2f:
                o.nR$setX r8 = (o.nR.setX) r8
                java.lang.Throwable r7 = r8.MenuHostHelper$$ExternalSyntheticLambda0
                throw r7
            L34:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3c:
                java.lang.Object r7 = r0.setIconTintList
                java.lang.Object r2 = r0.setY
                o.tu$setY r2 = (o.C0495tu.setY) r2
                boolean r4 = r8 instanceof o.nR.setX
                if (r4 != 0) goto L47
                goto L7e
            L47:
                o.nR$setX r8 = (o.nR.setX) r8
                java.lang.Throwable r7 = r8.MenuHostHelper$$ExternalSyntheticLambda0
                throw r7
            L4c:
                boolean r7 = r8 instanceof o.nR.setX
                if (r7 != 0) goto L51
                goto L6b
            L51:
                o.nR$setX r8 = (o.nR.setX) r8
                java.lang.Throwable r7 = r8.MenuHostHelper$$ExternalSyntheticLambda0
                throw r7
            L56:
                boolean r2 = r8 instanceof o.nR.setX
                if (r2 != 0) goto La0
                o.pY$MenuHostHelper$$ExternalSyntheticLambda1 r8 = r6.setIconTintList
                boolean r8 = r8.setX
                if (r8 == 0) goto L6e
                o.tx<T> r8 = r6.setX
                r0.MenuHostHelper$$ExternalSyntheticLambda1 = r5
                java.lang.Object r7 = r8.setIconTintList(r7, r0)
                if (r7 != r1) goto L6b
                return r1
            L6b:
                o.nX r7 = o.nX.setX
                return r7
            L6e:
                o.pw<T, o.oK<? super java.lang.Boolean>, java.lang.Object> r8 = r6.MenuHostHelper$$ExternalSyntheticLambda1
                r0.setY = r6
                r0.setIconTintList = r7
                r0.MenuHostHelper$$ExternalSyntheticLambda1 = r4
                java.lang.Object r8 = r8.MenuHostHelper$$ExternalSyntheticLambda0(r7, r0)
                if (r8 != r1) goto L7d
                return r1
            L7d:
                r2 = r6
            L7e:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L9d
                o.pY$MenuHostHelper$$ExternalSyntheticLambda1 r8 = r2.setIconTintList
                r8.setX = r5
                o.tx<T> r8 = r2.setX
                r2 = 0
                r0.setY = r2
                r0.setIconTintList = r2
                r0.MenuHostHelper$$ExternalSyntheticLambda1 = r3
                java.lang.Object r7 = r8.setIconTintList(r7, r0)
                if (r7 != r1) goto L9a
                return r1
            L9a:
                o.nX r7 = o.nX.setX
                return r7
            L9d:
                o.nX r7 = o.nX.setX
                return r7
            La0:
                o.nR$setX r8 = (o.nR.setX) r8
                java.lang.Throwable r7 = r8.MenuHostHelper$$ExternalSyntheticLambda0
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0495tu.setY.setIconTintList(java.lang.Object, o.oK):java.lang.Object");
        }
    }
}