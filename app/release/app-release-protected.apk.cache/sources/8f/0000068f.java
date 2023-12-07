package o;

/* loaded from: classes.dex */
public final class lB {
    final kS setIconTintList;
    public final kO setX;

    @nE
    public lB(kS kSVar, kO kOVar) {
        pN.setY(kSVar, "");
        pN.setY(kOVar, "");
        this.setIconTintList = kSVar;
        this.setX = kOVar;
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList extends AbstractC0368pb implements InterfaceC0389pw<InterfaceC0498tx<? super C0622yf<kT>>, oK<? super nX>, Object> {
        private /* synthetic */ lB MenuHostHelper$$ExternalSyntheticLambda0;
        private /* synthetic */ String MenuHostHelper$$ExternalSyntheticLambda1;
        private int setIconTintList;
        private /* synthetic */ String setX;
        private /* synthetic */ Object setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setIconTintList(String str, lB lBVar, String str2, oK<? super setIconTintList> oKVar) {
            super(2, oKVar);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = lBVar;
            this.setX = str2;
        }

        @Override // o.oR
        public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
            setIconTintList seticontintlist = new setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setX, oKVar);
            seticontintlist.setY = obj;
            return seticontintlist;
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0498tx<? super C0622yf<kT>> interfaceC0498tx, oK<? super nX> oKVar) {
            setIconTintList seticontintlist = new setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setX, oKVar);
            seticontintlist.setY = interfaceC0498tx;
            return seticontintlist.setY(nX.setX);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b1 A[RETURN] */
        @Override // o.oR
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object setY(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                o.oJ r2 = o.oJ.COROUTINE_SUSPENDED
                int r3 = r0.setIconTintList
                r4 = 4
                r5 = 0
                r6 = 3
                r7 = 2
                r8 = 1
                if (r3 == 0) goto L48
                if (r3 == r8) goto L3a
                if (r3 == r7) goto L2f
                if (r3 == r6) goto L20
                if (r3 != r4) goto L18
                goto L2f
            L18:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L20:
                java.lang.Object r3 = r0.setY
                o.tx r3 = (o.InterfaceC0498tx) r3
                boolean r6 = r1 instanceof o.nR.setX
                if (r6 != 0) goto L2a
                goto La4
            L2a:
                o.nR$setX r1 = (o.nR.setX) r1
                java.lang.Throwable r1 = r1.MenuHostHelper$$ExternalSyntheticLambda0
                throw r1
            L2f:
                boolean r2 = r1 instanceof o.nR.setX
                if (r2 != 0) goto L35
                goto Lb2
            L35:
                o.nR$setX r1 = (o.nR.setX) r1
                java.lang.Throwable r1 = r1.MenuHostHelper$$ExternalSyntheticLambda0
                throw r1
            L3a:
                java.lang.Object r3 = r0.setY
                o.tx r3 = (o.InterfaceC0498tx) r3
                boolean r4 = r1 instanceof o.nR.setX
                if (r4 != 0) goto L43
                goto L79
            L43:
                o.nR$setX r1 = (o.nR.setX) r1
                java.lang.Throwable r1 = r1.MenuHostHelper$$ExternalSyntheticLambda0
                throw r1
            L48:
                boolean r3 = r1 instanceof o.nR.setX
                if (r3 != 0) goto Lb5
                java.lang.Object r1 = r0.setY
                r3 = r1
                o.tx r3 = (o.InterfaceC0498tx) r3
                java.lang.String r1 = r0.MenuHostHelper$$ExternalSyntheticLambda1
                java.lang.String r9 = "cn"
                boolean r1 = r1.equals(r9)
                if (r1 == 0) goto L87
                o.lB r1 = r0.MenuHostHelper$$ExternalSyntheticLambda0
                o.kS r9 = r1.setIconTintList
                java.lang.String r11 = r0.setX
                r16 = r0
                o.oK r16 = (o.oK) r16
                r0.setY = r3
                r0.setIconTintList = r8
                r15 = 1
                java.lang.String r13 = "zh"
                java.lang.String r10 = "H1J12hztuqaZiKQgJMUvDyCfyIX1VvMuDfbYIdnE"
                java.lang.String r12 = "eu"
                java.lang.String r14 = "published_at"
                java.lang.Object r1 = r9.setX(r10, r11, r12, r13, r14, r15, r16)
                if (r1 != r2) goto L79
                return r2
            L79:
                r4 = r0
                o.oK r4 = (o.oK) r4
                r0.setY = r5
                r0.setIconTintList = r7
                java.lang.Object r1 = r3.setIconTintList(r1, r4)
                if (r1 != r2) goto Lb2
                return r2
            L87:
                o.lB r1 = r0.MenuHostHelper$$ExternalSyntheticLambda0
                o.kS r7 = r1.setIconTintList
                java.lang.String r9 = r0.setX
                java.lang.String r11 = r0.MenuHostHelper$$ExternalSyntheticLambda1
                r14 = r0
                o.oK r14 = (o.oK) r14
                r0.setY = r3
                r0.setIconTintList = r6
                r13 = 1
                java.lang.String r8 = "H1J12hztuqaZiKQgJMUvDyCfyIX1VvMuDfbYIdnE"
                java.lang.String r10 = "eu"
                java.lang.String r12 = "published_at"
                java.lang.Object r1 = r7.setX(r8, r9, r10, r11, r12, r13, r14)
                if (r1 != r2) goto La4
                return r2
            La4:
                r6 = r0
                o.oK r6 = (o.oK) r6
                r0.setY = r5
                r0.setIconTintList = r4
                java.lang.Object r1 = r3.setIconTintList(r1, r6)
                if (r1 != r2) goto Lb2
                return r2
            Lb2:
                o.nX r1 = o.nX.setX
                return r1
            Lb5:
                o.nR$setX r1 = (o.nR.setX) r1
                java.lang.Throwable r1 = r1.MenuHostHelper$$ExternalSyntheticLambda0
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.lB.setIconTintList.setY(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class setX extends AbstractC0368pb implements InterfaceC0389pw<InterfaceC0498tx<? super C0622yf<kT>>, oK<? super nX>, Object> {
        private int MenuHostHelper$$ExternalSyntheticLambda0;
        private /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1;
        private /* synthetic */ lB setIconTintList;
        private /* synthetic */ String setX;
        private /* synthetic */ String setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setX(String str, lB lBVar, String str2, oK<? super setX> oKVar) {
            super(2, oKVar);
            this.setY = str;
            this.setIconTintList = lBVar;
            this.setX = str2;
        }

        @Override // o.oR
        public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
            setX setx = new setX(this.setY, this.setIconTintList, this.setX, oKVar);
            setx.MenuHostHelper$$ExternalSyntheticLambda1 = obj;
            return setx;
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0498tx<? super C0622yf<kT>> interfaceC0498tx, oK<? super nX> oKVar) {
            setX setx = new setX(this.setY, this.setIconTintList, this.setX, oKVar);
            setx.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0498tx;
            return setx.setY(nX.setX);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a8 A[RETURN] */
        @Override // o.oR
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object setY(java.lang.Object r15) {
            /*
                r14 = this;
                o.oJ r0 = o.oJ.COROUTINE_SUSPENDED
                int r1 = r14.MenuHostHelper$$ExternalSyntheticLambda0
                r2 = 4
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L44
                if (r1 == r6) goto L36
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L1c
                if (r1 != r2) goto L14
                goto L2b
            L14:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1c:
                java.lang.Object r1 = r14.MenuHostHelper$$ExternalSyntheticLambda1
                o.tx r1 = (o.InterfaceC0498tx) r1
                boolean r4 = r15 instanceof o.nR.setX
                if (r4 != 0) goto L26
                goto L9b
            L26:
                o.nR$setX r15 = (o.nR.setX) r15
                java.lang.Throwable r15 = r15.MenuHostHelper$$ExternalSyntheticLambda0
                throw r15
            L2b:
                boolean r0 = r15 instanceof o.nR.setX
                if (r0 != 0) goto L31
                goto La9
            L31:
                o.nR$setX r15 = (o.nR.setX) r15
                java.lang.Throwable r15 = r15.MenuHostHelper$$ExternalSyntheticLambda0
                throw r15
            L36:
                java.lang.Object r1 = r14.MenuHostHelper$$ExternalSyntheticLambda1
                o.tx r1 = (o.InterfaceC0498tx) r1
                boolean r2 = r15 instanceof o.nR.setX
                if (r2 != 0) goto L3f
                goto L72
            L3f:
                o.nR$setX r15 = (o.nR.setX) r15
                java.lang.Throwable r15 = r15.MenuHostHelper$$ExternalSyntheticLambda0
                throw r15
            L44:
                boolean r1 = r15 instanceof o.nR.setX
                if (r1 != 0) goto Lac
                java.lang.Object r15 = r14.MenuHostHelper$$ExternalSyntheticLambda1
                r1 = r15
                o.tx r1 = (o.InterfaceC0498tx) r1
                java.lang.String r15 = r14.setY
                java.lang.String r7 = "cn"
                boolean r15 = r15.equals(r7)
                if (r15 == 0) goto L80
                o.lB r15 = r14.setIconTintList
                o.kS r7 = r15.setIconTintList
                java.lang.String r9 = r14.setX
                r13 = r14
                o.oK r13 = (o.oK) r13
                r14.MenuHostHelper$$ExternalSyntheticLambda1 = r1
                r14.MenuHostHelper$$ExternalSyntheticLambda0 = r6
                r12 = 1
                java.lang.String r11 = "zh"
                java.lang.String r8 = "H1J12hztuqaZiKQgJMUvDyCfyIX1VvMuDfbYIdnE"
                java.lang.String r10 = "eu"
                java.lang.Object r15 = r7.MenuHostHelper$$ExternalSyntheticLambda1(r8, r9, r10, r11, r12, r13)
                if (r15 != r0) goto L72
                return r0
            L72:
                r2 = r14
                o.oK r2 = (o.oK) r2
                r14.MenuHostHelper$$ExternalSyntheticLambda1 = r3
                r14.MenuHostHelper$$ExternalSyntheticLambda0 = r5
                java.lang.Object r15 = r1.setIconTintList(r15, r2)
                if (r15 != r0) goto La9
                return r0
            L80:
                o.lB r15 = r14.setIconTintList
                o.kS r5 = r15.setIconTintList
                java.lang.String r7 = r14.setX
                java.lang.String r9 = r14.setY
                r11 = r14
                o.oK r11 = (o.oK) r11
                r14.MenuHostHelper$$ExternalSyntheticLambda1 = r1
                r14.MenuHostHelper$$ExternalSyntheticLambda0 = r4
                r10 = 1
                java.lang.String r6 = "H1J12hztuqaZiKQgJMUvDyCfyIX1VvMuDfbYIdnE"
                java.lang.String r8 = "eu"
                java.lang.Object r15 = r5.MenuHostHelper$$ExternalSyntheticLambda1(r6, r7, r8, r9, r10, r11)
                if (r15 != r0) goto L9b
                return r0
            L9b:
                r4 = r14
                o.oK r4 = (o.oK) r4
                r14.MenuHostHelper$$ExternalSyntheticLambda1 = r3
                r14.MenuHostHelper$$ExternalSyntheticLambda0 = r2
                java.lang.Object r15 = r1.setIconTintList(r15, r4)
                if (r15 != r0) goto La9
                return r0
            La9:
                o.nX r15 = o.nX.setX
                return r15
            Lac:
                o.nR$setX r15 = (o.nR.setX) r15
                java.lang.Throwable r15 = r15.MenuHostHelper$$ExternalSyntheticLambda0
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.lB.setX.setY(java.lang.Object):java.lang.Object");
        }
    }
}