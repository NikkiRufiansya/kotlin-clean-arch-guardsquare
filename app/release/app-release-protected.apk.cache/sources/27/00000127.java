package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import o.C0024al;
import o.C0037ay;
import o.C0155fi;
import o.C0172fz;
import o.InterfaceC0019ag;
import o.InterfaceC0020ah;
import o.InterfaceC0025am;
import o.InterfaceC0027ao;
import o.InterfaceC0083cq;
import o.Y;
import o.aL;

/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static byte[] setY = {104, -68, 0, 44, -21, 2, -22, -5, -2, -3, 46, -61, -20, -7, -14, 7, -17, -14, 62, -29, -52, -7, -14, 7, -27, -4};
    public static final int setIconTintList = 131;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002c -> B:23:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = 97 - r7
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r8 = r8 * 4
            int r8 = r8 + 23
            byte[] r0 = com.google.firebase.remoteconfig.RemoteConfigRegistrar.setY
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1c
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L36
        L1c:
            r3 = 0
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L36:
            int r8 = r8 - r6
            int r6 = r7 + 1
            int r7 = r8 + (-8)
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.RemoteConfigRegistrar.a(byte, short, int, java.lang.Object[]):void");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C0024al<?>> MenuHostHelper$$ExternalSyntheticLambda0() {
        final aL aLVar = new aL(InterfaceC0019ag.class, ScheduledExecutorService.class);
        C0024al.setX setx = new C0024al.setX(C0172fz.class, new Class[0], (byte) 0);
        setx.setX = "fire-rc";
        byte b = setY[2];
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        C0024al.setX y = setx.setY(new C0037ay(Class.forName((String) objArr[0]), 1, 0)).setY(new C0037ay(aLVar, 1, 0)).setY(new C0037ay(FirebaseApp.class, 1, 0)).setY(new C0037ay(InterfaceC0083cq.class, 1, 0)).setY(new C0037ay(Y.class, 1, 0)).setY(new C0037ay(InterfaceC0020ah.class, 0, 1));
        y.setIconTintList = new InterfaceC0027ao() { // from class: o.fC
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return com.google.firebase.remoteconfig.RemoteConfigRegistrar.setIconTintList(aL.this, interfaceC0025am);
            }
        };
        return Arrays.asList(y.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0(), C0155fi.setIconTintList("fire-rc", "21.5.0"));
    }

    public static /* synthetic */ C0172fz setIconTintList(aL aLVar, InterfaceC0025am interfaceC0025am) {
        byte b = setY[2];
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        return new C0172fz((Context) interfaceC0025am.setY(Class.forName((String) objArr[0])), (ScheduledExecutorService) interfaceC0025am.setY(aLVar), (FirebaseApp) interfaceC0025am.setY(FirebaseApp.class), (InterfaceC0083cq) interfaceC0025am.setY(InterfaceC0083cq.class), ((Y) interfaceC0025am.setY(Y.class)).MenuHostHelper$$ExternalSyntheticLambda1("frc"), interfaceC0025am.MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0020ah.class));
    }
}