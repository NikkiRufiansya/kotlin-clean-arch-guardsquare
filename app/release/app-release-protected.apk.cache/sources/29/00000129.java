package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o.C0024al;
import o.C0037ay;
import o.C0155fi;
import o.C0190gp;
import o.InterfaceC0018af;
import o.InterfaceC0019ag;
import o.InterfaceC0025am;
import o.InterfaceC0027ao;
import o.InterfaceC0073cg;
import o.InterfaceC0083cq;
import o.aL;
import o.pN;
import o.rQ;
import o.setIconPadding;

/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final aL<FirebaseApp> MenuHostHelper$$ExternalSyntheticLambda0;
    private static final aL<setIconPadding> MenuHostHelper$$ExternalSyntheticLambda1;
    private static final aL<rQ> setIconTintList;
    private static final aL<InterfaceC0083cq> setX;
    private static final aL<rQ> setY;

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C0024al<? extends Object>> MenuHostHelper$$ExternalSyntheticLambda0() {
        C0024al.setX setx = new C0024al.setX(C0190gp.class, new Class[0], (byte) 0);
        setx.setX = "fire-sessions";
        C0024al.setX y = setx.setY(new C0037ay(MenuHostHelper$$ExternalSyntheticLambda0, 1, 0)).setY(new C0037ay(setX, 1, 0)).setY(new C0037ay(setY, 1, 0)).setY(new C0037ay(setIconTintList, 1, 0)).setY(new C0037ay(MenuHostHelper$$ExternalSyntheticLambda1, 1, 1));
        y.setIconTintList = new InterfaceC0027ao() { // from class: o.gs
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return com.google.firebase.sessions.FirebaseSessionsRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(interfaceC0025am);
            }
        };
        C0024al[] c0024alArr = {y.MenuHostHelper$$ExternalSyntheticLambda0(), C0155fi.setIconTintList("fire-sessions", "1.1.0")};
        pN.setY(c0024alArr, "");
        pN.setY(c0024alArr, "");
        List<C0024al<? extends Object>> asList = Arrays.asList(c0024alArr);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) asList, "");
        return asList;
    }

    static {
        new FirebaseSessionsRegistrar$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
        MenuHostHelper$$ExternalSyntheticLambda0 = new aL<>(aL.setX.class, FirebaseApp.class);
        setX = new aL<>(aL.setX.class, InterfaceC0083cq.class);
        setY = new aL<>(InterfaceC0018af.class, rQ.class);
        setIconTintList = new aL<>(InterfaceC0019ag.class, rQ.class);
        MenuHostHelper$$ExternalSyntheticLambda1 = new aL<>(aL.setX.class, setIconPadding.class);
    }

    public static /* synthetic */ C0190gp MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0025am interfaceC0025am) {
        Object y = interfaceC0025am.setY(MenuHostHelper$$ExternalSyntheticLambda0);
        pN.MenuHostHelper$$ExternalSyntheticLambda0(y, "");
        FirebaseApp firebaseApp = (FirebaseApp) y;
        Object y2 = interfaceC0025am.setY(setX);
        pN.MenuHostHelper$$ExternalSyntheticLambda0(y2, "");
        InterfaceC0083cq interfaceC0083cq = (InterfaceC0083cq) y2;
        Object y3 = interfaceC0025am.setY(setY);
        pN.MenuHostHelper$$ExternalSyntheticLambda0(y3, "");
        rQ rQVar = (rQ) y3;
        Object y4 = interfaceC0025am.setY(setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0(y4, "");
        rQ rQVar2 = (rQ) y4;
        InterfaceC0073cg MenuHostHelper$$ExternalSyntheticLambda02 = interfaceC0025am.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda02, "");
        return new C0190gp(firebaseApp, interfaceC0083cq, rQVar, rQVar2, MenuHostHelper$$ExternalSyntheticLambda02);
    }
}