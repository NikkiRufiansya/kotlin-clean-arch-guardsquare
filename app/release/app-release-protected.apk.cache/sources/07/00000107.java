package com.google.firebase;

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
        C0024al.setX setx = new C0024al.setX(new aL(InterfaceC0018af.class, rQ.class), new aL[0], (byte) 0);
        C0037ay c0037ay = new C0037ay(new aL(InterfaceC0018af.class, Executor.class), 1, 0);
        if (!setx.setY.contains(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1)) {
            setx.MenuHostHelper$$ExternalSyntheticLambda0.add(c0037ay);
            InterfaceC0027ao interfaceC0027ao = setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1;
            if (interfaceC0027ao != null) {
                setx.setIconTintList = interfaceC0027ao;
                C0024al MenuHostHelper$$ExternalSyntheticLambda0 = setx.MenuHostHelper$$ExternalSyntheticLambda0();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda0, "");
                c0024alArr[0] = MenuHostHelper$$ExternalSyntheticLambda0;
                C0024al.setX setx2 = new C0024al.setX(new aL(InterfaceC0016ad.class, rQ.class), new aL[0], (byte) 0);
                C0037ay c0037ay2 = new C0037ay(new aL(InterfaceC0016ad.class, Executor.class), 1, 0);
                if (!setx2.setY.contains(c0037ay2.MenuHostHelper$$ExternalSyntheticLambda1)) {
                    setx2.MenuHostHelper$$ExternalSyntheticLambda0.add(c0037ay2);
                    InterfaceC0027ao interfaceC0027ao2 = setX.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (interfaceC0027ao2 != null) {
                        setx2.setIconTintList = interfaceC0027ao2;
                        C0024al MenuHostHelper$$ExternalSyntheticLambda02 = setx2.MenuHostHelper$$ExternalSyntheticLambda0();
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda02, "");
                        c0024alArr[1] = MenuHostHelper$$ExternalSyntheticLambda02;
                        C0024al.setX setx3 = new C0024al.setX(new aL(InterfaceC0019ag.class, rQ.class), new aL[0], (byte) 0);
                        C0037ay c0037ay3 = new C0037ay(new aL(InterfaceC0019ag.class, Executor.class), 1, 0);
                        if (!setx3.setY.contains(c0037ay3.MenuHostHelper$$ExternalSyntheticLambda1)) {
                            setx3.MenuHostHelper$$ExternalSyntheticLambda0.add(c0037ay3);
                            InterfaceC0027ao interfaceC0027ao3 = setY.setX;
                            if (interfaceC0027ao3 != null) {
                                setx3.setIconTintList = interfaceC0027ao3;
                                C0024al MenuHostHelper$$ExternalSyntheticLambda03 = setx3.MenuHostHelper$$ExternalSyntheticLambda0();
                                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda03, "");
                                c0024alArr[2] = MenuHostHelper$$ExternalSyntheticLambda03;
                                C0024al.setX setx4 = new C0024al.setX(new aL(InterfaceC0017ae.class, rQ.class), new aL[0], (byte) 0);
                                C0037ay c0037ay4 = new C0037ay(new aL(InterfaceC0017ae.class, Executor.class), 1, 0);
                                if (!setx4.setY.contains(c0037ay4.MenuHostHelper$$ExternalSyntheticLambda1)) {
                                    setx4.MenuHostHelper$$ExternalSyntheticLambda0.add(c0037ay4);
                                    InterfaceC0027ao interfaceC0027ao4 = new InterfaceC0027ao() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1
                                        @Override // o.InterfaceC0027ao
                                        public final /* synthetic */ Object setX(InterfaceC0025am interfaceC0025am) {
                                            Object y = interfaceC0025am.setY(new aL<>(InterfaceC0017ae.class, Executor.class));
                                            pN.MenuHostHelper$$ExternalSyntheticLambda0(y, "");
                                            return C0467st.setIconTintList((Executor) y);
                                        }
                                    };
                                    if (interfaceC0027ao4 != null) {
                                        setx4.setIconTintList = interfaceC0027ao4;
                                        C0024al MenuHostHelper$$ExternalSyntheticLambda04 = setx4.MenuHostHelper$$ExternalSyntheticLambda0();
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
                                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
                            }
                            throw new NullPointerException("Null factory");
                        }
                        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
                    }
                    throw new NullPointerException("Null factory");
                }
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            throw new NullPointerException("Null factory");
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList<T> implements InterfaceC0027ao {
        public static final setIconTintList<T> MenuHostHelper$$ExternalSyntheticLambda1 = new setIconTintList<>();

        @Override // o.InterfaceC0027ao
        public final /* synthetic */ Object setX(InterfaceC0025am interfaceC0025am) {
            Object y = interfaceC0025am.setY(new aL<>(InterfaceC0018af.class, Executor.class));
            pN.MenuHostHelper$$ExternalSyntheticLambda0(y, "");
            return C0467st.setIconTintList((Executor) y);
        }
    }

    /* loaded from: classes.dex */
    public static final class setX<T> implements InterfaceC0027ao {
        public static final setX<T> MenuHostHelper$$ExternalSyntheticLambda1 = new setX<>();

        @Override // o.InterfaceC0027ao
        public final /* synthetic */ Object setX(InterfaceC0025am interfaceC0025am) {
            Object y = interfaceC0025am.setY(new aL<>(InterfaceC0016ad.class, Executor.class));
            pN.MenuHostHelper$$ExternalSyntheticLambda0(y, "");
            return C0467st.setIconTintList((Executor) y);
        }
    }

    /* loaded from: classes.dex */
    public static final class setY<T> implements InterfaceC0027ao {
        public static final setY<T> setX = new setY<>();

        @Override // o.InterfaceC0027ao
        public final /* synthetic */ Object setX(InterfaceC0025am interfaceC0025am) {
            Object y = interfaceC0025am.setY(new aL<>(InterfaceC0019ag.class, Executor.class));
            pN.MenuHostHelper$$ExternalSyntheticLambda0(y, "");
            return C0467st.setIconTintList((Executor) y);
        }
    }
}