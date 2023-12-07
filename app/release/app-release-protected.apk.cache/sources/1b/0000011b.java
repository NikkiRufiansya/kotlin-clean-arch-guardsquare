package com.google.firebase.perf;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import o.C0024al;
import o.C0037ay;
import o.C0096dc;
import o.C0099df;
import o.C0155fi;
import o.C0172fz;
import o.C0190gp;
import o.InterfaceC0017ae;
import o.InterfaceC0025am;
import o.InterfaceC0027ao;
import o.InterfaceC0083cq;
import o.V;
import o.aL;
import o.cI;
import o.cR;
import o.df$MenuHostHelper$$ExternalSyntheticLambda0;
import o.gA;
import o.gC$MenuHostHelper$$ExternalSyntheticLambda1;
import o.nB;
import o.setIconPadding;

/* loaded from: classes.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    public static final byte[] $$a = {4, -20, -33, -123, 60, -59, -4};
    public static final int $$b = 233;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002e -> B:23:0x003b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = com.google.firebase.perf.FirebasePerfRegistrar.$$a
            int r8 = r8 * 2
            int r8 = r8 + 111
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L1d
            r8 = r7
            r3 = r1
            r4 = 0
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L3b
        L1d:
            r3 = 0
            r5 = r8
            r8 = r7
        L20:
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L2e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2e:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L3b:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r9 + 1
            int r8 = r8 + (-5)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.FirebasePerfRegistrar.a(byte, int, short, java.lang.Object[]):void");
    }

    static {
        gA gAVar = gA.setIconTintList;
        gA.MenuHostHelper$$ExternalSyntheticLambda0(gC$MenuHostHelper$$ExternalSyntheticLambda1.PERFORMANCE);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C0024al<?>> MenuHostHelper$$ExternalSyntheticLambda0() {
        final aL aLVar = new aL(InterfaceC0017ae.class, Executor.class);
        C0024al.setX setx = new C0024al.setX(cR.class, new Class[0], (byte) 0);
        setx.setX = "fire-perf";
        C0024al.setX y = setx.setY(new C0037ay(FirebaseApp.class, 1, 0)).setY(new C0037ay(C0172fz.class, 1, 1)).setY(new C0037ay(InterfaceC0083cq.class, 1, 0)).setY(new C0037ay(setIconPadding.class, 1, 1)).setY(new C0037ay(cI.class, 1, 0));
        y.setIconTintList = new InterfaceC0027ao() { // from class: o.cO
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return com.google.firebase.perf.FirebasePerfRegistrar.setIconTintList(interfaceC0025am);
            }
        };
        C0024al.setX setx2 = new C0024al.setX(cI.class, new Class[0], (byte) 0);
        setx2.setX = "fire-perf-early";
        C0024al.setX MenuHostHelper$$ExternalSyntheticLambda1 = setx2.setY(new C0037ay(FirebaseApp.class, 1, 0)).setY(new C0037ay(C0190gp.class, 1, 0)).setY(new C0037ay(V.class, 0, 1)).setY(new C0037ay(aLVar, 1, 0)).MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList = new InterfaceC0027ao() { // from class: o.cP
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return com.google.firebase.perf.FirebasePerfRegistrar.MenuHostHelper$$ExternalSyntheticLambda1(aL.this, interfaceC0025am);
            }
        };
        return Arrays.asList(y.MenuHostHelper$$ExternalSyntheticLambda0(), MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(), C0155fi.setIconTintList("fire-perf", "20.5.0"));
    }

    public static /* synthetic */ cI MenuHostHelper$$ExternalSyntheticLambda1(aL aLVar, InterfaceC0025am interfaceC0025am) {
        return new cI((FirebaseApp) interfaceC0025am.setY(FirebaseApp.class), (C0190gp) interfaceC0025am.setY(C0190gp.class), (V) interfaceC0025am.MenuHostHelper$$ExternalSyntheticLambda1(V.class).MenuHostHelper$$ExternalSyntheticLambda0(), (Executor) interfaceC0025am.setY(aLVar));
    }

    public static /* synthetic */ cR setIconTintList(InterfaceC0025am interfaceC0025am) {
        interfaceC0025am.setY(cI.class);
        df$MenuHostHelper$$ExternalSyntheticLambda0 df_menuhosthelper__externalsyntheticlambda0 = new df$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
        df_menuhosthelper__externalsyntheticlambda0.setIconTintList = new C0096dc((FirebaseApp) interfaceC0025am.setY(FirebaseApp.class), (InterfaceC0083cq) interfaceC0025am.setY(InterfaceC0083cq.class), interfaceC0025am.MenuHostHelper$$ExternalSyntheticLambda1(C0172fz.class), interfaceC0025am.MenuHostHelper$$ExternalSyntheticLambda1(setIconPadding.class));
        C0096dc c0096dc = df_menuhosthelper__externalsyntheticlambda0.setIconTintList;
        byte b = (byte) 0;
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        nB.setIconTintList(c0096dc, Class.forName((String) objArr[0]));
        return new C0099df(df_menuhosthelper__externalsyntheticlambda0.setIconTintList, (byte) 0).setY();
    }
}