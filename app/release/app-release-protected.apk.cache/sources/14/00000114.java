package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import o.C0024al;
import o.C0037ay;
import o.C0467st;
import o.InterfaceC0016ad;
import o.InterfaceC0017ae;
import o.InterfaceC0018af;
import o.InterfaceC0019ag;
import o.InterfaceC0025am;
import o.InterfaceC0027ao;
import o.aL;
import o.pN;
import o.rQ;

/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C0024al<?>> MenuHostHelper$$ExternalSyntheticLambda0() {
        C0024al[] c0024alArr = new C0024al[4];
        C0024al.setX y = new C0024al.setX(new aL(InterfaceC0018af.class, rQ.class), new aL[0], (byte) 0).setY(new C0037ay(new aL(InterfaceC0018af.class, Executor.class), 1, 0));
        InterfaceC0027ao interfaceC0027ao = setIconTintList.setX;
        if (interfaceC0027ao != null) {
            y.setIconTintList = interfaceC0027ao;
            C0024al MenuHostHelper$$ExternalSyntheticLambda0 = y.MenuHostHelper$$ExternalSyntheticLambda0();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda0, "");
            c0024alArr[0] = MenuHostHelper$$ExternalSyntheticLambda0;
            C0024al.setX y2 = new C0024al.setX(new aL(InterfaceC0016ad.class, rQ.class), new aL[0], (byte) 0).setY(new C0037ay(new aL(InterfaceC0016ad.class, Executor.class), 1, 0));
            InterfaceC0027ao interfaceC0027ao2 = new InterfaceC0027ao() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1
                @Override // o.InterfaceC0027ao
                public final /* synthetic */ Object setX(InterfaceC0025am interfaceC0025am) {
                    Object y3 = interfaceC0025am.setY(new aL<>(InterfaceC0016ad.class, Executor.class));
                    pN.MenuHostHelper$$ExternalSyntheticLambda0(y3, "");
                    return C0467st.setIconTintList((Executor) y3);
                }
            };
            if (interfaceC0027ao2 != null) {
                y2.setIconTintList = interfaceC0027ao2;
                C0024al MenuHostHelper$$ExternalSyntheticLambda02 = y2.MenuHostHelper$$ExternalSyntheticLambda0();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda02, "");
                c0024alArr[1] = MenuHostHelper$$ExternalSyntheticLambda02;
                C0024al.setX y3 = new C0024al.setX(new aL(InterfaceC0019ag.class, rQ.class), new aL[0], (byte) 0).setY(new C0037ay(new aL(InterfaceC0019ag.class, Executor.class), 1, 0));
                InterfaceC0027ao interfaceC0027ao3 = setY.setIconTintList;
                if (interfaceC0027ao3 != null) {
                    y3.setIconTintList = interfaceC0027ao3;
                    C0024al MenuHostHelper$$ExternalSyntheticLambda03 = y3.MenuHostHelper$$ExternalSyntheticLambda0();
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda03, "");
                    c0024alArr[2] = MenuHostHelper$$ExternalSyntheticLambda03;
                    C0024al.setX y4 = new C0024al.setX(new aL(InterfaceC0017ae.class, rQ.class), new aL[0], (byte) 0).setY(new C0037ay(new aL(InterfaceC0017ae.class, Executor.class), 1, 0));
                    InterfaceC0027ao interfaceC0027ao4 = setX.setIconTintList;
                    if (interfaceC0027ao4 != null) {
                        y4.setIconTintList = interfaceC0027ao4;
                        C0024al MenuHostHelper$$ExternalSyntheticLambda04 = y4.MenuHostHelper$$ExternalSyntheticLambda0();
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda04, "");
                        c0024alArr[3] = MenuHostHelper$$ExternalSyntheticLambda04;
                        pN.setY(c0024alArr, "");
                        pN.setY(c0024alArr, "");
                        List<C0024al<?>> asList = Arrays.asList(c0024alArr);
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) asList, "");
                        return asList;
                    }
                    throw new NullPointerException("Null factory");
                }
                throw new NullPointerException("Null factory");
            }
            throw new NullPointerException("Null factory");
        }
        throw new NullPointerException("Null factory");
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList<T> implements InterfaceC0027ao {
        public static final setIconTintList<T> setX = new setIconTintList<>();

        @Override // o.InterfaceC0027ao
        public final /* synthetic */ Object setX(InterfaceC0025am interfaceC0025am) {
            Object y = interfaceC0025am.setY(new aL<>(InterfaceC0018af.class, Executor.class));
            pN.MenuHostHelper$$ExternalSyntheticLambda0(y, "");
            return C0467st.setIconTintList((Executor) y);
        }
    }

    /* loaded from: classes.dex */
    public static final class setX<T> implements InterfaceC0027ao {
        public static final setX<T> setIconTintList = new setX<>();

        @Override // o.InterfaceC0027ao
        public final /* synthetic */ Object setX(InterfaceC0025am interfaceC0025am) {
            Object y = interfaceC0025am.setY(new aL<>(InterfaceC0017ae.class, Executor.class));
            pN.MenuHostHelper$$ExternalSyntheticLambda0(y, "");
            return C0467st.setIconTintList((Executor) y);
        }
    }

    /* loaded from: classes.dex */
    public static final class setY<T> implements InterfaceC0027ao {
        public static final setY<T> setIconTintList = new setY<>();

        @Override // o.InterfaceC0027ao
        public final /* synthetic */ Object setX(InterfaceC0025am interfaceC0025am) {
            Object y = interfaceC0025am.setY(new aL<>(InterfaceC0019ag.class, Executor.class));
            pN.MenuHostHelper$$ExternalSyntheticLambda0(y, "");
            return C0467st.setIconTintList((Executor) y);
        }
    }
}