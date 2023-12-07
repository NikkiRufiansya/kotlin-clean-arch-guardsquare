package com.google.firebase.installations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.C0024al;
import o.C0037ay;
import o.C0080cn;
import o.C0155fi;
import o.ExecutorC0052bm;
import o.InterfaceC0018af;
import o.InterfaceC0019ag;
import o.InterfaceC0025am;
import o.InterfaceC0027ao;
import o.InterfaceC0068cb;
import o.InterfaceC0083cq;
import o.aL;
import o.bZ;

/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C0024al<?>> MenuHostHelper$$ExternalSyntheticLambda0() {
        C0024al.setX setx = new C0024al.setX(InterfaceC0083cq.class, new Class[0], (byte) 0);
        setx.setX = "fire-installations";
        C0024al.setX y = setx.setY(new C0037ay(FirebaseApp.class, 1, 0)).setY(new C0037ay(bZ.class, 0, 1)).setY(new C0037ay(new aL(InterfaceC0018af.class, ExecutorService.class), 1, 0)).setY(new C0037ay(new aL(InterfaceC0019ag.class, Executor.class), 1, 0));
        y.setIconTintList = new InterfaceC0027ao() { // from class: o.cp
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return com.google.firebase.installations.FirebaseInstallationsRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(interfaceC0025am);
            }
        };
        return Arrays.asList(y.MenuHostHelper$$ExternalSyntheticLambda0(), C0024al.setY(new InterfaceC0068cb() { // from class: o.cd.2
        }, InterfaceC0068cb.class), C0155fi.setIconTintList("fire-installations", "17.2.0"));
    }

    public static /* synthetic */ InterfaceC0083cq MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0025am interfaceC0025am) {
        return new C0080cn((FirebaseApp) interfaceC0025am.setY(FirebaseApp.class), interfaceC0025am.MenuHostHelper$$ExternalSyntheticLambda1(bZ.class), (ExecutorService) interfaceC0025am.setY(new aL(InterfaceC0018af.class, ExecutorService.class)), new ExecutorC0052bm((Executor) interfaceC0025am.setY(new aL(InterfaceC0019ag.class, Executor.class))));
    }
}