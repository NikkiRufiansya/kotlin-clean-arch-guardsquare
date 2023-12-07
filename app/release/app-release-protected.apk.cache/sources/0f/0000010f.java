package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import o.C0024al;
import o.EnumC0051bl;
import o.InterfaceC0016ad;
import o.InterfaceC0017ae;
import o.InterfaceC0018af;
import o.InterfaceC0019ag;
import o.InterfaceC0027ao;
import o.InterfaceC0073cg;
import o.aF;
import o.aL;
import o.aN;
import o.aO;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    private static aF<ScheduledExecutorService> MenuHostHelper$$ExternalSyntheticLambda0 = new aF<>(new InterfaceC0073cg() { // from class: o.bg
        @Override // o.InterfaceC0073cg
        public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
            return com.google.firebase.concurrent.ExecutorsRegistrar.setNavigationOnClickListener();
        }
    });
    private static aF<ScheduledExecutorService> setIconTintList = new aF<>(new InterfaceC0073cg() { // from class: o.bj
        @Override // o.InterfaceC0073cg
        public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
            return com.google.firebase.concurrent.ExecutorsRegistrar.setOnLongClickListener();
        }
    });
    private static aF<ScheduledExecutorService> setY = new aF<>(new InterfaceC0073cg() { // from class: o.bh
        @Override // o.InterfaceC0073cg
        public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
            return com.google.firebase.concurrent.ExecutorsRegistrar.setLayoutAnimation();
        }
    });
    private static aF<ScheduledExecutorService> MenuHostHelper$$ExternalSyntheticLambda1 = new aF<>(new InterfaceC0073cg() { // from class: o.bk
        @Override // o.InterfaceC0073cg
        public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
            return com.google.firebase.concurrent.ExecutorsRegistrar.setUnboundedRipple();
        }
    });

    public static /* synthetic */ ScheduledExecutorService setOnLongClickListener() {
        return new aN(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new aO("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C0024al<?>> MenuHostHelper$$ExternalSyntheticLambda0() {
        C0024al.setX setx = new C0024al.setX(new aL(InterfaceC0018af.class, ScheduledExecutorService.class), new aL[]{new aL(InterfaceC0018af.class, ExecutorService.class), new aL(InterfaceC0018af.class, Executor.class)}, (byte) 0);
        setx.setIconTintList = new InterfaceC0027ao() { // from class: o.be
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return com.google.firebase.concurrent.ExecutorsRegistrar.setX();
            }
        };
        C0024al.setX setx2 = new C0024al.setX(new aL(InterfaceC0019ag.class, ScheduledExecutorService.class), new aL[]{new aL(InterfaceC0019ag.class, ExecutorService.class), new aL(InterfaceC0019ag.class, Executor.class)}, (byte) 0);
        setx2.setIconTintList = new InterfaceC0027ao() { // from class: o.bf
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return com.google.firebase.concurrent.ExecutorsRegistrar.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        };
        C0024al.setX setx3 = new C0024al.setX(new aL(InterfaceC0016ad.class, ScheduledExecutorService.class), new aL[]{new aL(InterfaceC0016ad.class, ExecutorService.class), new aL(InterfaceC0016ad.class, Executor.class)}, (byte) 0);
        setx3.setIconTintList = new InterfaceC0027ao() { // from class: o.bb
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return com.google.firebase.concurrent.ExecutorsRegistrar.setIconTintList();
            }
        };
        C0024al.setX setx4 = new C0024al.setX(new aL(InterfaceC0017ae.class, Executor.class), new aL[0], (byte) 0);
        setx4.setIconTintList = new InterfaceC0027ao() { // from class: o.bi
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return com.google.firebase.concurrent.ExecutorsRegistrar.setY();
            }
        };
        return Arrays.asList(setx.MenuHostHelper$$ExternalSyntheticLambda0(), setx2.MenuHostHelper$$ExternalSyntheticLambda0(), setx3.MenuHostHelper$$ExternalSyntheticLambda0(), setx4.MenuHostHelper$$ExternalSyntheticLambda0());
    }

    public static /* synthetic */ ScheduledExecutorService setX() {
        return MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public static /* synthetic */ ScheduledExecutorService MenuHostHelper$$ExternalSyntheticLambda1() {
        return setY.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public static /* synthetic */ ScheduledExecutorService setIconTintList() {
        return setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public static /* synthetic */ Executor setY() {
        return EnumC0051bl.INSTANCE;
    }

    public static /* synthetic */ ScheduledExecutorService setNavigationOnClickListener() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        if (Build.VERSION.SDK_INT >= 23) {
            detectNetwork.detectResourceMismatches();
            if (Build.VERSION.SDK_INT >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return new aN(Executors.newFixedThreadPool(4, new aO("Firebase Background", 10, detectNetwork.penaltyLog().build())), MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0());
    }

    public static /* synthetic */ ScheduledExecutorService setLayoutAnimation() {
        return new aN(Executors.newCachedThreadPool(new aO("Firebase Blocking", 11, null)), MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0());
    }

    public static /* synthetic */ ScheduledExecutorService setUnboundedRipple() {
        return Executors.newSingleThreadScheduledExecutor(new aO("Firebase Scheduler", 0, null));
    }
}