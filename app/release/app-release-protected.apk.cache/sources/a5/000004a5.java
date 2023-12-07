package o;

import android.content.Context;

/* loaded from: classes.dex */
public final class gJ {
    @Deprecated
    private static final InterfaceC0398qe<Context, setSecondaryProgressTintBlendMode<setCropToPadding>> MenuHostHelper$$ExternalSyntheticLambda0;
    private static final gJ$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1 = new gJ$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    public final gL setX;
    public final gL setY;

    private gJ(gL gLVar, gL gLVar2) {
        pN.setY(gLVar, "");
        pN.setY(gLVar2, "");
        this.setY = gLVar;
        this.setX = gLVar2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gJ(Context context, oM oMVar, oM oMVar2, InterfaceC0083cq interfaceC0083cq, C0181gg c0181gg) {
        this(new gG(context), new gI(oMVar2, interfaceC0083cq, c0181gg, new gH(c0181gg, oMVar), gJ$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(context)));
        pN.setY(context, "");
        pN.setY(oMVar, "");
        pN.setY(oMVar2, "");
        pN.setY(interfaceC0083cq, "");
        pN.setY(c0181gg, "");
    }

    public final double setY() {
        Double iconTintList = this.setY.setIconTintList();
        boolean z = true;
        if (iconTintList != null) {
            double doubleValue = iconTintList.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double iconTintList2 = this.setX.setIconTintList();
        if (iconTintList2 != null) {
            double doubleValue2 = iconTintList2.doubleValue();
            if ((0.0d > doubleValue2 || doubleValue2 > 1.0d) ? false : false) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    public static boolean setX(long j) {
        return C0429ri.MenuHostHelper$$ExternalSyntheticLambda1(j) && C0429ri.setY(j);
    }

    static {
        setActiveSelection$MenuHostHelper$$ExternalSyntheticLambda1 setactiveselection_menuhosthelper__externalsyntheticlambda1 = setActiveSelection$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        C0457sj c0457sj = C0457sj.MenuHostHelper$$ExternalSyntheticLambda0;
        rU x = rS.setX(C0457sj.setY().plus(new sR(null)));
        pN.setY("firebase_session_settings", "");
        pN.setY(setactiveselection_menuhosthelper__externalsyntheticlambda1, "");
        pN.setY(x, "");
        MenuHostHelper$$ExternalSyntheticLambda0 = new setPopupBackgroundDrawable("firebase_session_settings", null, setactiveselection_menuhosthelper__externalsyntheticlambda1, x);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setIconTintList(o.oK<? super o.nX> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o.gJ$MenuHostHelper$$ExternalSyntheticLambda0
            if (r0 == 0) goto L14
            r0 = r6
            o.gJ$MenuHostHelper$$ExternalSyntheticLambda0 r0 = (o.gJ$MenuHostHelper$$ExternalSyntheticLambda0) r0
            int r1 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            int r6 = r6 + r2
            r0.MenuHostHelper$$ExternalSyntheticLambda0 = r6
            goto L19
        L14:
            o.gJ$MenuHostHelper$$ExternalSyntheticLambda0 r0 = new o.gJ$MenuHostHelper$$ExternalSyntheticLambda0
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r6 = r0.setIconTintList
            o.oJ r1 = o.oJ.COROUTINE_SUSPENDED
            int r2 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            boolean r0 = r6 instanceof o.nR.setX
            if (r0 != 0) goto L2c
            goto L67
        L2c:
            o.nR$setX r6 = (o.nR.setX) r6
            java.lang.Throwable r6 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            throw r6
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            java.lang.Object r2 = r0.setY
            o.gJ r2 = (o.gJ) r2
            boolean r4 = r6 instanceof o.nR.setX
            if (r4 != 0) goto L42
            goto L59
        L42:
            o.nR$setX r6 = (o.nR.setX) r6
            java.lang.Throwable r6 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            throw r6
        L47:
            boolean r2 = r6 instanceof o.nR.setX
            if (r2 != 0) goto L6a
            o.gL r6 = r5.setY
            r0.setY = r5
            r0.MenuHostHelper$$ExternalSyntheticLambda0 = r4
            java.lang.Object r6 = r6.setX(r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            r2 = r5
        L59:
            o.gL r6 = r2.setX
            r2 = 0
            r0.setY = r2
            r0.MenuHostHelper$$ExternalSyntheticLambda0 = r3
            java.lang.Object r6 = r6.setX(r0)
            if (r6 != r1) goto L67
            return r1
        L67:
            o.nX r6 = o.nX.setX
            return r6
        L6a:
            o.nR$setX r6 = (o.nR.setX) r6
            java.lang.Throwable r6 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.gJ.setIconTintList(o.oK):java.lang.Object");
    }
}