package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o.C0024al;
import o.C0037ay;
import o.C0155fi;
import o.InterfaceC0020ah;
import o.InterfaceC0025am;
import o.InterfaceC0027ao;
import o.Y;

/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static byte[] setY = {68, -4, -93, 76, -21, 2, -22, -5, -2, -3, 46, -61, -20, -7, -14, 7, -17, -14, 62, -29, -52, -7, -14, 7, -27, -4};
    public static final int setX = 173;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:23:0x0028). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.firebase.abt.component.AbtRegistrar.setY
            r1 = 23
            byte[] r1 = new byte[r1]
            r2 = 22
            r3 = 4
            r4 = 0
            if (r0 != 0) goto L11
            r5 = 4
            r6 = 0
            r7 = 22
            goto L28
        L11:
            r5 = 97
            r3 = 97
            r5 = 4
            r6 = 0
        L17:
            byte r7 = (byte) r3
            r1[r6] = r7
            if (r6 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r4)
            r8[r4] = r0
            return
        L24:
            int r6 = r6 + 1
            r7 = r0[r5]
        L28:
            int r3 = r3 - r7
            int r3 = r3 + (-8)
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.abt.component.AbtRegistrar.a(java.lang.Object[]):void");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C0024al<?>> MenuHostHelper$$ExternalSyntheticLambda0() {
        C0024al[] c0024alArr = new C0024al[2];
        C0024al.setX setx = new C0024al.setX(Y.class, new Class[0], (byte) 0);
        setx.setX = "fire-abt";
        Object[] objArr = new Object[1];
        a(objArr);
        C0037ay c0037ay = new C0037ay(Class.forName((String) objArr[0]), 1, 0);
        if (!setx.setY.contains(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1)) {
            setx.MenuHostHelper$$ExternalSyntheticLambda0.add(c0037ay);
            C0037ay c0037ay2 = new C0037ay(InterfaceC0020ah.class, 0, 1);
            if (!setx.setY.contains(c0037ay2.MenuHostHelper$$ExternalSyntheticLambda1)) {
                setx.MenuHostHelper$$ExternalSyntheticLambda0.add(c0037ay2);
                setx.setIconTintList = new InterfaceC0027ao() { // from class: o.ab
                    @Override // o.InterfaceC0027ao
                    public final Object setX(InterfaceC0025am interfaceC0025am) {
                        return com.google.firebase.abt.component.AbtRegistrar.MenuHostHelper$$ExternalSyntheticLambda1(interfaceC0025am);
                    }
                };
                c0024alArr[0] = setx.MenuHostHelper$$ExternalSyntheticLambda0();
                c0024alArr[1] = C0155fi.setIconTintList("fire-abt", "21.1.1");
                return Arrays.asList(c0024alArr);
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public static /* synthetic */ Y MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0025am interfaceC0025am) {
        Object[] objArr = new Object[1];
        a(objArr);
        return new Y((Context) interfaceC0025am.setY(Class.forName((String) objArr[0])), interfaceC0025am.MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0020ah.class));
    }
}