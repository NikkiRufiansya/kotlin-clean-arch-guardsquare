package o;

import o.nR;
import o.setCropToPadding;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class gN {
    @Deprecated
    static final setCropToPadding.setY<Boolean> MenuHostHelper$$ExternalSyntheticLambda0;
    @Deprecated
    static final setCropToPadding.setY<Integer> MenuHostHelper$$ExternalSyntheticLambda1;
    @Deprecated
    static final setCropToPadding.setY<Integer> setIconTintList;
    @Deprecated
    static final setCropToPadding.setY<Long> setX;
    @Deprecated
    static final setCropToPadding.setY<Double> setY;
    gF setOnLongClickListener;
    private final setSecondaryProgressTintBlendMode<setCropToPadding> setUnboundedRipple;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setY<T> extends oX {
        int MenuHostHelper$$ExternalSyntheticLambda1;
        private /* synthetic */ gN setX;
        /* synthetic */ Object setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setY(gN gNVar, oK<? super setY> oKVar) {
            super(oKVar);
            this.setX = gNVar;
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            this.setY = obj;
            this.MenuHostHelper$$ExternalSyntheticLambda1 |= Integer.MIN_VALUE;
            return this.setX.MenuHostHelper$$ExternalSyntheticLambda0(null, null, this);
        }
    }

    public gN(setSecondaryProgressTintBlendMode<setCropToPadding> setsecondaryprogresstintblendmode) {
        pN.setY(setsecondaryprogresstintblendmode, "");
        this.setUnboundedRipple = setsecondaryprogresstintblendmode;
        C0438rr.MenuHostHelper$$ExternalSyntheticLambda0(oL.setX, new AnonymousClass5(null));
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        gF gFVar = this.setOnLongClickListener;
        gF gFVar2 = null;
        if (gFVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            gFVar = null;
        }
        Long l = gFVar.MenuHostHelper$$ExternalSyntheticLambda1;
        gF gFVar3 = this.setOnLongClickListener;
        if (gFVar3 == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        } else {
            gFVar2 = gFVar3;
        }
        Integer num = gFVar2.setY;
        return l == null || num == null || (System.currentTimeMillis() - l.longValue()) / 1000 >= ((long) num.intValue());
    }

    static {
        new gN$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
        pN.setY("firebase_sessions_enabled", "");
        MenuHostHelper$$ExternalSyntheticLambda0 = new setCropToPadding.setY<>("firebase_sessions_enabled");
        pN.setY("firebase_sessions_sampling_rate", "");
        setY = new setCropToPadding.setY<>("firebase_sessions_sampling_rate");
        pN.setY("firebase_sessions_restart_timeout", "");
        MenuHostHelper$$ExternalSyntheticLambda1 = new setCropToPadding.setY<>("firebase_sessions_restart_timeout");
        pN.setY("firebase_sessions_cache_duration", "");
        setIconTintList = new setCropToPadding.setY<>("firebase_sessions_cache_duration");
        pN.setY("firebase_sessions_cache_updated_time", "");
        setX = new setCropToPadding.setY<>("firebase_sessions_cache_updated_time");
    }

    /* renamed from: o.gN$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
        private int MenuHostHelper$$ExternalSyntheticLambda0;
        private Object setY;

        AnonymousClass5(oK<? super AnonymousClass5> oKVar) {
            super(2, oKVar);
        }

        @Override // o.oR
        public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
            return new AnonymousClass5(oKVar);
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, oK<? super nX> oKVar) {
            return new AnonymousClass5(oKVar).setY(nX.setX);
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            gN gNVar;
            oJ oJVar = oJ.COROUTINE_SUSPENDED;
            int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gNVar = (gN) this.setY;
                if (obj instanceof nR.setX) {
                    throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                }
            } else if (obj instanceof nR.setX) {
                throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
            } else {
                gN gNVar2 = gN.this;
                this.setY = gNVar2;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = 1;
                Object y = C0499ty.setY(gNVar2.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0(), this);
                if (y == oJVar) {
                    return oJVar;
                }
                gNVar = gNVar2;
                obj = y;
            }
            gN.setY(gNVar, ((setCropToPadding) obj).MenuHostHelper$$ExternalSyntheticLambda0());
            return nX.setX;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX extends AbstractC0368pb implements InterfaceC0389pw<setRepeatMode, oK<? super nX>, Object> {
        private /* synthetic */ T MenuHostHelper$$ExternalSyntheticLambda0;
        private /* synthetic */ setCropToPadding.setY<T> MenuHostHelper$$ExternalSyntheticLambda1;
        private /* synthetic */ Object setIconTintList;
        private int setX;
        private /* synthetic */ gN setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setX(T t, setCropToPadding.setY<T> sety, gN gNVar, oK<? super setX> oKVar) {
            super(2, oKVar);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = t;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = sety;
            this.setY = gNVar;
        }

        @Override // o.oR
        public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
            setX setx = new setX(this.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY, oKVar);
            setx.setIconTintList = obj;
            return setx;
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(setRepeatMode setrepeatmode, oK<? super nX> oKVar) {
            setX setx = new setX(this.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY, oKVar);
            setx.setIconTintList = setrepeatmode;
            return setx.setY(nX.setX);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.oR
        public final Object setY(Object obj) {
            oJ oJVar = oJ.COROUTINE_SUSPENDED;
            if (!(obj instanceof nR.setX)) {
                setRepeatMode setrepeatmode = (setRepeatMode) this.setIconTintList;
                Object obj2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (obj2 != null) {
                    setCropToPadding.setY<T> sety = this.MenuHostHelper$$ExternalSyntheticLambda1;
                    pN.setY(sety, "");
                    setrepeatmode.MenuHostHelper$$ExternalSyntheticLambda1(sety, obj2);
                } else {
                    setrepeatmode.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                }
                gN.setY(this.setY, setrepeatmode);
                return nX.setX;
            }
            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
        }
    }

    public static final /* synthetic */ void setY(gN gNVar, setCropToPadding setcroptopadding) {
        gNVar.setOnLongClickListener = new gF((Boolean) setcroptopadding.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0), (Double) setcroptopadding.setIconTintList(setY), (Integer) setcroptopadding.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1), (Integer) setcroptopadding.setIconTintList(setIconTintList), (Long) setcroptopadding.setIconTintList(setX));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(2:10|(1:12)(2:16|17))(2:18|19))(2:20|(2:22|(1:24))(2:25|26))|13|14))|29|6|7|(0)(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        r7 = new java.lang.StringBuilder("Failed to update cache config value: ");
        r7.append(r6);
        android.util.Log.w("SettingsCache", r7.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object MenuHostHelper$$ExternalSyntheticLambda0(o.setCropToPadding.setY<T> r6, T r7, o.oK<? super o.nX> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof o.gN.setY
            if (r0 == 0) goto L14
            r0 = r8
            o.gN$setY r0 = (o.gN.setY) r0
            int r1 = r0.MenuHostHelper$$ExternalSyntheticLambda1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.MenuHostHelper$$ExternalSyntheticLambda1
            int r8 = r8 + r2
            r0.MenuHostHelper$$ExternalSyntheticLambda1 = r8
            goto L19
        L14:
            o.gN$setY r0 = new o.gN$setY
            r0.<init>(r5, r8)
        L19:
            java.lang.Object r8 = r0.setY
            o.oJ r1 = o.oJ.COROUTINE_SUSPENDED
            int r2 = r0.MenuHostHelper$$ExternalSyntheticLambda1
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r6 = r8 instanceof o.nR.setX     // Catch: java.io.IOException -> L54
            if (r6 != 0) goto L29
            goto L68
        L29:
            o.nR$setX r8 = (o.nR.setX) r8     // Catch: java.io.IOException -> L54
            java.lang.Throwable r6 = r8.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.io.IOException -> L54
            throw r6     // Catch: java.io.IOException -> L54
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            boolean r2 = r8 instanceof o.nR.setX
            if (r2 != 0) goto L6b
            o.setSecondaryProgressTintBlendMode<o.setCropToPadding> r8 = r5.setUnboundedRipple     // Catch: java.io.IOException -> L54
            o.gN$setX r2 = new o.gN$setX     // Catch: java.io.IOException -> L54
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L54
            o.pw r2 = (o.InterfaceC0389pw) r2     // Catch: java.io.IOException -> L54
            r0.MenuHostHelper$$ExternalSyntheticLambda1 = r3     // Catch: java.io.IOException -> L54
            o.setImportantForAutofill$MenuHostHelper$$ExternalSyntheticLambda0 r6 = new o.setImportantForAutofill$MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.io.IOException -> L54
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L54
            o.pw r6 = (o.InterfaceC0389pw) r6     // Catch: java.io.IOException -> L54
            java.lang.Object r6 = r8.MenuHostHelper$$ExternalSyntheticLambda0(r6, r0)     // Catch: java.io.IOException -> L54
            if (r6 != r1) goto L68
            return r1
        L54:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L68:
            o.nX r6 = o.nX.setX
            return r6
        L6b:
            o.nR$setX r8 = (o.nR.setX) r8
            java.lang.Throwable r6 = r8.MenuHostHelper$$ExternalSyntheticLambda0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.gN.MenuHostHelper$$ExternalSyntheticLambda0(o.setCropToPadding$setY, java.lang.Object, o.oK):java.lang.Object");
    }
}