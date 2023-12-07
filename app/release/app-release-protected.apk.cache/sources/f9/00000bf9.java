package o;

import java.util.List;
import o.nR;

/* loaded from: classes.dex */
public final class setGravity<T> {
    public static final setX setX = new setX((byte) 0);

    /* loaded from: classes.dex */
    public static final class setX {
        public /* synthetic */ setX(byte b) {
            this();
        }

        private setX() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
        /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Throwable, T, java.lang.Object] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object setIconTintList(java.util.List<? extends o.setDescendantFocusability<T>> r7, o.setImageAlpha<T> r8, o.oK<? super o.nX> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof o.setGravity$setX$MenuHostHelper$$ExternalSyntheticLambda1
                if (r0 == 0) goto L14
                r0 = r9
                o.setGravity$setX$MenuHostHelper$$ExternalSyntheticLambda1 r0 = (o.setGravity$setX$MenuHostHelper$$ExternalSyntheticLambda1) r0
                int r1 = r0.MenuHostHelper$$ExternalSyntheticLambda0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r9 = r0.MenuHostHelper$$ExternalSyntheticLambda0
                int r9 = r9 + r2
                r0.MenuHostHelper$$ExternalSyntheticLambda0 = r9
                goto L19
            L14:
                o.setGravity$setX$MenuHostHelper$$ExternalSyntheticLambda1 r0 = new o.setGravity$setX$MenuHostHelper$$ExternalSyntheticLambda1
                r0.<init>(r6, r9)
            L19:
                java.lang.Object r9 = r0.setY
                o.oJ r1 = o.oJ.COROUTINE_SUSPENDED
                int r2 = r0.MenuHostHelper$$ExternalSyntheticLambda0
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L51
                if (r2 == r4) goto L43
                if (r2 != r3) goto L3b
                java.lang.Object r7 = r0.MenuHostHelper$$ExternalSyntheticLambda1
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.setX
                o.pY$setX r8 = (o.pY.setX) r8
                boolean r2 = r9 instanceof o.nR.setX     // Catch: java.lang.Throwable -> L39
                if (r2 != 0) goto L34
                goto L7b
            L34:
                o.nR$setX r9 = (o.nR.setX) r9     // Catch: java.lang.Throwable -> L39
                java.lang.Throwable r9 = r9.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L39
                throw r9     // Catch: java.lang.Throwable -> L39
            L39:
                r9 = move-exception
                goto L94
            L3b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L43:
                java.lang.Object r7 = r0.setX
                java.util.List r7 = (java.util.List) r7
                boolean r8 = r9 instanceof o.nR.setX
                if (r8 != 0) goto L4c
                goto L70
            L4c:
                o.nR$setX r9 = (o.nR.setX) r9
                java.lang.Throwable r7 = r9.MenuHostHelper$$ExternalSyntheticLambda0
                throw r7
            L51:
                boolean r2 = r9 instanceof o.nR.setX
                if (r2 != 0) goto Lbe
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.List r9 = (java.util.List) r9
                o.setGravity$setX$setIconTintList r2 = new o.setGravity$setX$setIconTintList
                r5 = 0
                r2.<init>(r7, r9, r5)
                o.pw r2 = (o.InterfaceC0389pw) r2
                r0.setX = r9
                r0.MenuHostHelper$$ExternalSyntheticLambda0 = r4
                java.lang.Object r7 = r8.setIconTintList(r2, r0)
                if (r7 != r1) goto L6f
                return r1
            L6f:
                r7 = r9
            L70:
                o.pY$setX r8 = new o.pY$setX
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L7b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto Lb4
                java.lang.Object r9 = r7.next()
                o.pk r9 = (o.InterfaceC0377pk) r9
                r0.setX = r8     // Catch: java.lang.Throwable -> L39
                r0.MenuHostHelper$$ExternalSyntheticLambda1 = r7     // Catch: java.lang.Throwable -> L39
                r0.MenuHostHelper$$ExternalSyntheticLambda0 = r3     // Catch: java.lang.Throwable -> L39
                java.lang.Object r9 = r9.setX(r0)     // Catch: java.lang.Throwable -> L39
                if (r9 != r1) goto L7b
                return r1
            L94:
                T r2 = r8.setX
                if (r2 != 0) goto L9b
                r8.setX = r9
                goto L7b
            L9b:
                T r2 = r8.setX
                o.pN.setX(r2)
                T r2 = r8.setX
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                java.lang.String r4 = ""
                o.pN.setY(r2, r4)
                o.pN.setY(r9, r4)
                if (r2 == r9) goto L7b
                o.oY r4 = o.C0369pc.setX
                r4.setX(r2, r9)
                goto L7b
            Lb4:
                T r7 = r8.setX
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto Lbd
                o.nX r7 = o.nX.setX
                return r7
            Lbd:
                throw r7
            Lbe:
                o.nR$setX r9 = (o.nR.setX) r9
                java.lang.Throwable r7 = r9.MenuHostHelper$$ExternalSyntheticLambda0
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setGravity.setX.setIconTintList(java.util.List, o.setImageAlpha, o.oK):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class setIconTintList extends AbstractC0368pb implements InterfaceC0389pw<T, oK<? super T>, Object> {
            final /* synthetic */ List<InterfaceC0377pk<oK<? super nX>, Object>> MenuHostHelper$$ExternalSyntheticLambda0;
            private Object MenuHostHelper$$ExternalSyntheticLambda1;
            private /* synthetic */ Object setIconTintList;
            private Object setNavigationOnClickListener;
            private int setOnLongClickListener;
            final /* synthetic */ List<setDescendantFocusability<T>> setX;
            private Object setY;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            setIconTintList(List<? extends setDescendantFocusability<T>> list, List<InterfaceC0377pk<oK<? super nX>, Object>> list2, oK<? super setIconTintList> oKVar) {
                super(2, oKVar);
                this.setX = list;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = list2;
            }

            @Override // o.oR
            public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
                setIconTintList seticontintlist = new setIconTintList(this.setX, this.MenuHostHelper$$ExternalSyntheticLambda0, oKVar);
                seticontintlist.setIconTintList = obj;
                return seticontintlist;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: o.setGravity$setX$setIconTintList$setIconTintList  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0001setIconTintList extends AbstractC0368pb implements InterfaceC0377pk<oK<? super nX>, Object> {
                final /* synthetic */ setDescendantFocusability<T> MenuHostHelper$$ExternalSyntheticLambda1;
                private int setX;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0001setIconTintList(setDescendantFocusability<T> setdescendantfocusability, oK<? super C0001setIconTintList> oKVar) {
                    super(1, oKVar);
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = setdescendantfocusability;
                }

                @Override // o.InterfaceC0377pk
                public final /* synthetic */ Object setX(oK<? super nX> oKVar) {
                    return new C0001setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, oKVar).setY(nX.setX);
                }

                @Override // o.oR
                public final Object setY(Object obj) {
                    oJ oJVar = oJ.COROUTINE_SUSPENDED;
                    int i = this.setX;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        if (obj instanceof nR.setX) {
                            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                        }
                    } else if (!(obj instanceof nR.setX)) {
                        setDescendantFocusability<T> setdescendantfocusability = this.MenuHostHelper$$ExternalSyntheticLambda1;
                        this.setX = 1;
                        if (setdescendantfocusability.setX() == oJVar) {
                            return oJVar;
                        }
                    } else {
                        throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                    return nX.setX;
                }
            }

            @Override // o.InterfaceC0389pw
            public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(Object obj, Object obj2) {
                setIconTintList seticontintlist = new setIconTintList(this.setX, this.MenuHostHelper$$ExternalSyntheticLambda0, (oK) obj2);
                seticontintlist.setIconTintList = obj;
                return seticontintlist.setY(nX.setX);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0098 -> B:22:0x0053). Please submit an issue!!! */
            @Override // o.oR
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object setY(java.lang.Object r10) {
                /*
                    r9 = this;
                    o.oJ r0 = o.oJ.COROUTINE_SUSPENDED
                    int r1 = r9.setOnLongClickListener
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L42
                    if (r1 == r3) goto L26
                    if (r1 != r2) goto L1e
                    java.lang.Object r1 = r9.MenuHostHelper$$ExternalSyntheticLambda1
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.setIconTintList
                    java.util.List r4 = (java.util.List) r4
                    boolean r5 = r10 instanceof o.nR.setX
                    if (r5 != 0) goto L19
                    goto L52
                L19:
                    o.nR$setX r10 = (o.nR.setX) r10
                    java.lang.Throwable r10 = r10.MenuHostHelper$$ExternalSyntheticLambda0
                    throw r10
                L1e:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L26:
                    java.lang.Object r1 = r9.setNavigationOnClickListener
                    java.lang.Object r4 = r9.setY
                    o.setDescendantFocusability r4 = (o.setDescendantFocusability) r4
                    java.lang.Object r5 = r9.MenuHostHelper$$ExternalSyntheticLambda1
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.setIconTintList
                    java.util.List r6 = (java.util.List) r6
                    boolean r7 = r10 instanceof o.nR.setX
                    if (r7 != 0) goto L3d
                    r7 = r9
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L75
                L3d:
                    o.nR$setX r10 = (o.nR.setX) r10
                    java.lang.Throwable r10 = r10.MenuHostHelper$$ExternalSyntheticLambda0
                    throw r10
                L42:
                    boolean r1 = r10 instanceof o.nR.setX
                    if (r1 != 0) goto L9c
                    java.lang.Object r10 = r9.setIconTintList
                    java.util.List<o.setDescendantFocusability<T>> r1 = r9.setX
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<o.pk<o.oK<? super o.nX>, java.lang.Object>> r4 = r9.MenuHostHelper$$ExternalSyntheticLambda0
                    java.util.Iterator r1 = r1.iterator()
                L52:
                    r5 = r9
                L53:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L9b
                    java.lang.Object r6 = r1.next()
                    o.setDescendantFocusability r6 = (o.setDescendantFocusability) r6
                    r5.setIconTintList = r4
                    r5.MenuHostHelper$$ExternalSyntheticLambda1 = r1
                    r5.setY = r6
                    r5.setNavigationOnClickListener = r10
                    r5.setOnLongClickListener = r3
                    java.lang.Object r7 = r6.MenuHostHelper$$ExternalSyntheticLambda1()
                    if (r7 != r0) goto L70
                    return r0
                L70:
                    r8 = r1
                    r1 = r10
                    r10 = r7
                    r7 = r5
                    r5 = r8
                L75:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L97
                    o.setGravity$setX$setIconTintList$setIconTintList r10 = new o.setGravity$setX$setIconTintList$setIconTintList
                    r1 = 0
                    r10.<init>(r6, r1)
                    r4.add(r10)
                    r7.setIconTintList = r4
                    r7.MenuHostHelper$$ExternalSyntheticLambda1 = r5
                    r7.setY = r1
                    r7.setNavigationOnClickListener = r1
                    r7.setOnLongClickListener = r2
                    java.lang.Object r10 = r6.setIconTintList()
                    if (r10 != r0) goto L98
                    return r0
                L97:
                    r10 = r1
                L98:
                    r1 = r5
                    r5 = r7
                    goto L53
                L9b:
                    return r10
                L9c:
                    o.nR$setX r10 = (o.nR.setX) r10
                    java.lang.Throwable r10 = r10.MenuHostHelper$$ExternalSyntheticLambda0
                    throw r10
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setGravity.setX.setIconTintList.setY(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class setY extends AbstractC0368pb implements InterfaceC0389pw<setImageAlpha<T>, oK<? super nX>, Object> {
            private /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1;
            final /* synthetic */ List<setDescendantFocusability<T>> setIconTintList;
            private int setY;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public setY(List<? extends setDescendantFocusability<T>> list, oK<? super setY> oKVar) {
                super(2, oKVar);
                this.setIconTintList = list;
            }

            @Override // o.oR
            /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0  reason: avoid collision after fix types in other method */
            public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda02(Object obj, oK<?> oKVar) {
                setY sety = new setY(this.setIconTintList, oKVar);
                sety.MenuHostHelper$$ExternalSyntheticLambda1 = obj;
                return sety;
            }

            @Override // o.InterfaceC0389pw
            public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<? super nX> oKVar) {
                setY sety = new setY(this.setIconTintList, oKVar);
                sety.MenuHostHelper$$ExternalSyntheticLambda1 = (setImageAlpha) obj;
                return sety.setY(nX.setX);
            }

            @Override // o.oR
            public final Object setY(Object obj) {
                oJ oJVar = oJ.COROUTINE_SUSPENDED;
                int i = this.setY;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (obj instanceof nR.setX) {
                        throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                } else if (!(obj instanceof nR.setX)) {
                    setX setx = setGravity.setX;
                    List<setDescendantFocusability<T>> list = this.setIconTintList;
                    this.setY = 1;
                    if (setx.setIconTintList(list, (setImageAlpha) this.MenuHostHelper$$ExternalSyntheticLambda1, this) == oJVar) {
                        return oJVar;
                    }
                } else {
                    throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                }
                return nX.setX;
            }
        }
    }
}