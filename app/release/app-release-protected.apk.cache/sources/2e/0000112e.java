package o;

import o.nR;

/* loaded from: classes.dex */
public class tD<T> extends tJ<tH> implements InterfaceC0496tv<T>, InterfaceC0491tq<T>, tR<T> {
    long MenuHostHelper$$ExternalSyntheticLambda0;
    private Object[] MenuHostHelper$$ExternalSyntheticLambda1;
    private final int setIconTintList;
    private final EnumC0484tj setNavigationOnClickListener;
    private int setOnLongClickListener;
    private final int setUnboundedRipple;
    private int setX;
    long setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX extends oX {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        Object MenuHostHelper$$ExternalSyntheticLambda1;
        Object setIconTintList;
        private /* synthetic */ tD<T> setUiOptions;
        /* synthetic */ Object setUnboundedRipple;
        Object setX;
        Object setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setX(tD<T> tDVar, oK<? super setX> oKVar) {
            super(oKVar);
            this.setUiOptions = tDVar;
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            this.setUnboundedRipple = obj;
            this.MenuHostHelper$$ExternalSyntheticLambda0 |= Integer.MIN_VALUE;
            return tD.MenuHostHelper$$ExternalSyntheticLambda0(this.setUiOptions, null, this);
        }
    }

    @Override // o.tA, o.InterfaceC0492tr
    public final Object setIconTintList(InterfaceC0498tx<? super T> interfaceC0498tx, oK<?> oKVar) {
        return MenuHostHelper$$ExternalSyntheticLambda0(this, interfaceC0498tx, oKVar);
    }

    @Override // o.tJ
    public final /* bridge */ /* synthetic */ tH[] setX() {
        return new tH[2];
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(T t) {
        int i;
        boolean z;
        oK<nX>[] oKVarArr = tL.MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (this) {
            if (setX((tD<T>) t)) {
                oKVarArr = setX(oKVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (oK<nX> oKVar : oKVarArr) {
            if (oKVar != null) {
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                oKVar.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(nX.setX));
            }
        }
        return z;
    }

    private final boolean setX(T t) {
        if (setY() != 0) {
            if (this.setX >= this.setIconTintList && this.setY <= this.MenuHostHelper$$ExternalSyntheticLambda0) {
                int[] iArr = tD$MenuHostHelper$$ExternalSyntheticLambda0.setY;
                throw null;
            }
            setY(t);
            int i = this.setX + 1;
            this.setX = i;
            if (i > this.setIconTintList) {
                setLayoutAnimation();
            }
            long min = Math.min(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda0) + this.setX;
            long j = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (((int) (min - j)) > this.setUnboundedRipple) {
                long j2 = this.setY;
                MenuHostHelper$$ExternalSyntheticLambda1(j + 1, j2, Math.min(j2, j) + this.setX, Math.min(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda0) + this.setX + this.setOnLongClickListener);
            }
            return true;
        }
        rX.setIconTintList();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
        r2 = ((o.tJ) r2).setY;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setLayoutAnimation() {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.MenuHostHelper$$ExternalSyntheticLambda1
            o.pN.setX(r0)
            long r1 = r11.setY
            long r3 = r11.MenuHostHelper$$ExternalSyntheticLambda0
            long r1 = java.lang.Math.min(r1, r3)
            r3 = 0
            o.tB.MenuHostHelper$$ExternalSyntheticLambda0(r0, r1, r3)
            int r0 = r11.setX
            int r0 = r0 + (-1)
            r11.setX = r0
            long r0 = r11.setY
            long r2 = r11.MenuHostHelper$$ExternalSyntheticLambda0
            long r0 = java.lang.Math.min(r0, r2)
            r2 = 1
            long r0 = r0 + r2
            long r2 = r11.MenuHostHelper$$ExternalSyntheticLambda0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L2a
            r11.MenuHostHelper$$ExternalSyntheticLambda0 = r0
        L2a:
            long r2 = r11.setY
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L5e
            r2 = r11
            o.tJ r2 = (o.tJ) r2
            int r3 = o.tJ.setY(r2)
            if (r3 == 0) goto L5c
            o.tP[] r2 = o.tJ.setIconTintList(r2)
            if (r2 == 0) goto L5c
            int r3 = r2.length
            r4 = 0
        L41:
            if (r4 >= r3) goto L5c
            r5 = r2[r4]
            if (r5 == 0) goto L59
            o.tH r5 = (o.tH) r5
            long r6 = r5.setY
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L59
            long r6 = r5.setY
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 >= 0) goto L59
            r5.setY = r0
        L59:
            int r4 = r4 + 1
            goto L41
        L5c:
            r11.setY = r0
        L5e:
            o.rX.setIconTintList()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tD.setLayoutAnimation():void");
    }

    private final Object[] setY(Object[] objArr, int i, int i2) {
        if (!(i2 > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i2];
        this.MenuHostHelper$$ExternalSyntheticLambda1 = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long min = Math.min(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda0);
        for (int i3 = 0; i3 < i; i3++) {
            long j = i3 + min;
            tB.MenuHostHelper$$ExternalSyntheticLambda0(objArr2, j, tB.MenuHostHelper$$ExternalSyntheticLambda0(objArr, j));
        }
        return objArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        r4 = ((o.tJ) r4).setY;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.oK<o.nX>[] setX(long r22) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tD.setX(long):o.oK[]");
    }

    private final void MenuHostHelper$$ExternalSyntheticLambda1(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        rX.setIconTintList();
        for (long min2 = Math.min(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda0); min2 < min; min2++) {
            Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setX(objArr);
            tB.MenuHostHelper$$ExternalSyntheticLambda0(objArr, min2, null);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = j;
        this.setY = j2;
        this.setX = (int) (j3 - min);
        this.setOnLongClickListener = (int) (j4 - j3);
        rX.setIconTintList();
        rX.setIconTintList();
        rX.setIconTintList();
    }

    private final void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setOnLongClickListener <= 1) {
            return;
        }
        Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setX(objArr);
        while (this.setOnLongClickListener > 0 && tB.MenuHostHelper$$ExternalSyntheticLambda0(objArr, (Math.min(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda0) + (this.setX + this.setOnLongClickListener)) - 1) == tB.setIconTintList) {
            this.setOnLongClickListener--;
            tB.MenuHostHelper$$ExternalSyntheticLambda0(objArr, Math.min(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda0) + this.setX + this.setOnLongClickListener, null);
        }
    }

    private final Object setIconTintList(tH tHVar) {
        Object obj;
        oK<nX>[] oKVarArr = tL.MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (this) {
            long MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(tHVar);
            if (MenuHostHelper$$ExternalSyntheticLambda1 < 0) {
                obj = tB.setIconTintList;
            } else {
                long j = tHVar.setY;
                Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
                pN.setX(objArr);
                Object MenuHostHelper$$ExternalSyntheticLambda0 = tB.MenuHostHelper$$ExternalSyntheticLambda0(objArr, MenuHostHelper$$ExternalSyntheticLambda1);
                if (MenuHostHelper$$ExternalSyntheticLambda0 instanceof setY) {
                    MenuHostHelper$$ExternalSyntheticLambda0 = ((setY) MenuHostHelper$$ExternalSyntheticLambda0).setX;
                }
                tHVar.setY = MenuHostHelper$$ExternalSyntheticLambda1 + 1;
                Object obj2 = MenuHostHelper$$ExternalSyntheticLambda0;
                oKVarArr = setX(j);
                obj = obj2;
            }
        }
        for (oK<nX> oKVar : oKVarArr) {
            if (oKVar != null) {
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                oKVar.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(nX.setX));
            }
        }
        return obj;
    }

    private final long MenuHostHelper$$ExternalSyntheticLambda1(tH tHVar) {
        long j = tHVar.setY;
        if (j < Math.min(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda0) + this.setX) {
            return j;
        }
        if (j <= Math.min(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda0) && this.setOnLongClickListener != 0) {
            return j;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = ((o.tJ) r1).setY;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o.oK<o.nX>[] setX(o.oK<o.nX>[] r12) {
        /*
            r11 = this;
            int r0 = r12.length
            r1 = r11
            o.tJ r1 = (o.tJ) r1
            int r2 = o.tJ.setY(r1)
            if (r2 == 0) goto L4d
            o.tP[] r1 = o.tJ.setIconTintList(r1)
            if (r1 == 0) goto L4d
            int r2 = r1.length
            r3 = 0
        L12:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]
            if (r4 == 0) goto L4a
            o.tH r4 = (o.tH) r4
            o.oK<? super o.nX> r5 = r4.MenuHostHelper$$ExternalSyntheticLambda1
            if (r5 != 0) goto L1f
            goto L4a
        L1f:
            long r6 = r11.MenuHostHelper$$ExternalSyntheticLambda1(r4)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L4a
            r6 = r12
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r7 = r6.length
            if (r0 < r7) goto L40
            r12 = 2
            int r7 = r6.length
            int r7 = r7 << 1
            int r12 = java.lang.Math.max(r12, r7)
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r6, r12)
            java.lang.String r6 = ""
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r12, r6)
        L40:
            r6 = r12
            o.oK[] r6 = (o.oK[]) r6
            r6[r0] = r5
            r5 = 0
            r4.MenuHostHelper$$ExternalSyntheticLambda1 = r5
            int r0 = r0 + 1
        L4a:
            int r3 = r3 + 1
            goto L12
        L4d:
            o.oK[] r12 = (o.oK[]) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tD.setX(o.oK[]):o.oK[]");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setY implements InterfaceC0456si {
        public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda1;
        public long setIconTintList;
        public final Object setX;
        private tD<?> setY;

        /* JADX WARN: Multi-variable type inference failed */
        public setY(tD<?> tDVar, long j, Object obj, oK<? super nX> oKVar) {
            this.setY = tDVar;
            this.setIconTintList = j;
            this.setX = obj;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = oKVar;
        }

        @Override // o.InterfaceC0456si
        public final void MenuHostHelper$$ExternalSyntheticLambda0() {
            tD.setY(this.setY, this);
        }
    }

    private final Object setY(T t, oK<? super nX> oKVar) {
        oK<nX>[] x;
        setY sety;
        C0444rx c0444rx = new C0444rx(oP.setY(oKVar), 1);
        c0444rx.setUnboundedRipple();
        C0444rx c0444rx2 = c0444rx;
        oK<nX>[] oKVarArr = tL.MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (this) {
            if (setX((tD<T>) t)) {
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                c0444rx2.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(nX.setX));
                x = setX(oKVarArr);
                sety = null;
            } else {
                setY sety2 = new setY(this, this.setX + this.setOnLongClickListener + Math.min(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda0), t, c0444rx2);
                setY(sety2);
                this.setOnLongClickListener++;
                x = setX(oKVarArr);
                sety = sety2;
            }
        }
        if (sety != null) {
            c0444rx2.setIconTintList((InterfaceC0377pk<? super Throwable, nX>) new C0459sl(sety));
        }
        for (oK<nX> oKVar2 : x) {
            if (oKVar2 != null) {
                nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                oKVar2.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(nX.setX));
            }
        }
        Object MenuHostHelper$$ExternalSyntheticLambda0 = c0444rx.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == oJ.COROUTINE_SUSPENDED) {
            pN.setY(oKVar, "");
        }
        return MenuHostHelper$$ExternalSyntheticLambda0 == oJ.COROUTINE_SUSPENDED ? MenuHostHelper$$ExternalSyntheticLambda0 : nX.setX;
    }

    private final Object MenuHostHelper$$ExternalSyntheticLambda0(tH tHVar, oK<? super nX> oKVar) {
        C0444rx c0444rx = new C0444rx(oP.setY(oKVar), 1);
        c0444rx.setUnboundedRipple();
        C0444rx c0444rx2 = c0444rx;
        synchronized (this) {
            if (MenuHostHelper$$ExternalSyntheticLambda1(tHVar) < 0) {
                tHVar.MenuHostHelper$$ExternalSyntheticLambda1 = c0444rx2;
                tHVar.MenuHostHelper$$ExternalSyntheticLambda1 = c0444rx2;
            } else {
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                c0444rx2.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(nX.setX));
            }
            nX nXVar = nX.setX;
        }
        Object MenuHostHelper$$ExternalSyntheticLambda0 = c0444rx.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == oJ.COROUTINE_SUSPENDED) {
            pN.setY(oKVar, "");
        }
        return MenuHostHelper$$ExternalSyntheticLambda0 == oJ.COROUTINE_SUSPENDED ? MenuHostHelper$$ExternalSyntheticLambda0 : nX.setX;
    }

    public static final /* synthetic */ void setY(tD tDVar, setY sety) {
        synchronized (tDVar) {
            if (sety.setIconTintList < Math.min(tDVar.setY, tDVar.MenuHostHelper$$ExternalSyntheticLambda0)) {
                return;
            }
            Object[] objArr = tDVar.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setX(objArr);
            if (tB.MenuHostHelper$$ExternalSyntheticLambda0(objArr, sety.setIconTintList) != sety) {
                return;
            }
            tB.MenuHostHelper$$ExternalSyntheticLambda0(objArr, sety.setIconTintList, tB.setIconTintList);
            tDVar.MenuHostHelper$$ExternalSyntheticLambda0();
            nX nXVar = nX.setX;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object MenuHostHelper$$ExternalSyntheticLambda0(o.tD r8, o.InterfaceC0498tx r9, o.oK r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tD.MenuHostHelper$$ExternalSyntheticLambda0(o.tD, o.tx, o.oK):java.lang.Object");
    }

    private final void setY(Object obj) {
        int i = this.setX + this.setOnLongClickListener;
        Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (objArr == null) {
            objArr = setY(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = setY(objArr, i, objArr.length << 1);
        }
        tB.MenuHostHelper$$ExternalSyntheticLambda0(objArr, Math.min(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda0) + i, obj);
    }

    @Override // o.tJ
    public final /* synthetic */ tH setIconTintList() {
        return new tH();
    }

    @Override // o.InterfaceC0498tx
    public final Object setIconTintList(T t, oK<? super nX> oKVar) {
        Object y;
        return (MenuHostHelper$$ExternalSyntheticLambda1((tD<T>) t) || (y = setY((tD<T>) t, oKVar)) != oJ.COROUTINE_SUSPENDED) ? nX.setX : y;
    }
}