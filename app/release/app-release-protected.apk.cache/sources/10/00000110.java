package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import o.C0024al;
import o.C0037ay;
import o.C0155fi;
import o.C0286m;
import o.InterfaceC0025am;
import o.InterfaceC0027ao;
import o.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;
import o.attachInterface;
import o.setFabCradleMargin;
import o.setIconPadding;
import o.setLengthCounter;
import o.setSmoothScrollingEnabled;
import o.setStackedBackground;

/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static byte[] setIconTintList = {56, 110, 47, 101, 21, -2, 22, 5, 2, 3, -46, 61, 20, 7, 14, -7, 17, 14, -62, 29, 52, 7, 14, -7, 27, 4};
    public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 3;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:23:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 2
            int r8 = 97 - r8
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r9 = r9 * 4
            int r9 = 23 - r9
            byte[] r0 = com.google.firebase.datatransport.TransportRegistrar.setIconTintList
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L34
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2b:
            r3 = r0[r7]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L34:
            int r9 = r9 + r8
            int r8 = r9 + (-8)
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.datatransport.TransportRegistrar.a(short, byte, short, java.lang.Object[]):void");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C0024al<?>> MenuHostHelper$$ExternalSyntheticLambda0() {
        C0024al.setX setx = new C0024al.setX(setIconPadding.class, new Class[0], (byte) 0);
        setx.setX = "fire-transport";
        byte b = (byte) (MenuHostHelper$$ExternalSyntheticLambda1 - 3);
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        C0024al.setX y = setx.setY(new C0037ay(Class.forName((String) objArr[0]), 1, 0));
        y.setIconTintList = new InterfaceC0027ao() { // from class: o.bp
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return com.google.firebase.datatransport.TransportRegistrar.setX(interfaceC0025am);
            }
        };
        return Arrays.asList(y.MenuHostHelper$$ExternalSyntheticLambda0(), C0155fi.setIconTintList("fire-transport", "18.1.8"));
    }

    public static /* synthetic */ setIconPadding setX(InterfaceC0025am interfaceC0025am) {
        Set singleton;
        byte b = (byte) (MenuHostHelper$$ExternalSyntheticLambda1 - 3);
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        setLengthCounter.setY((Context) interfaceC0025am.setY(Class.forName((String) objArr[0])));
        setStackedBackground setstackedbackground = setLengthCounter.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setstackedbackground == null) {
            throw new IllegalStateException("Not initialized!");
        }
        setLengthCounter y = setstackedbackground.setY();
        setSmoothScrollingEnabled setsmoothscrollingenabled = setSmoothScrollingEnabled.setY;
        if (setsmoothscrollingenabled instanceof C0286m.AnonymousClass2) {
            singleton = Collections.unmodifiableSet(setsmoothscrollingenabled.MenuHostHelper$$ExternalSyntheticLambda0());
        } else {
            singleton = Collections.singleton(new attachInterface("proto"));
        }
        return new setFabCradleMargin(singleton, StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setIconTintList().setIconTintList(setsmoothscrollingenabled.setY()).MenuHostHelper$$ExternalSyntheticLambda0(setsmoothscrollingenabled.setIconTintList()).setY(), y);
    }
}