package o;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o.cA;
import o.cD;
import o.cE;

/* renamed from: o.cn */
/* loaded from: classes.dex */
public final class C0080cn implements InterfaceC0083cq {
    static final Object setX = new Object();
    final com.google.firebase.FirebaseApp MenuHostHelper$$ExternalSyntheticLambda0;
    Set<InterfaceC0086ct> MenuHostHelper$$ExternalSyntheticLambda1;
    private final Object ViewPager$SavedState$1;
    private final List<InterfaceC0088cv> setChipCornerRadius;
    final aF<C0092cz> setIconTintList;
    private final ExecutorService setLayoutAnimation;
    final C0087cu setNavigationOnClickListener;
    final cG setOnLongClickListener;
    private final Executor setTextAlignment;
    final cA setUiOptions;
    private final C0090cx setUnboundedRipple;
    String setY;

    static {
        new ThreadFactory() { // from class: o.cn.3
            private final AtomicInteger MenuHostHelper$$ExternalSyntheticLambda0 = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0.getAndIncrement())));
            }
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0080cn(final com.google.firebase.FirebaseApp firebaseApp, InterfaceC0073cg<bZ> interfaceC0073cg, ExecutorService executorService, Executor executor) {
        this(executorService, executor, firebaseApp, new cG(firebaseApp.setIconTintList, interfaceC0073cg), new cA(firebaseApp), C0087cu.setIconTintList(), new aF(new InterfaceC0073cg() { // from class: o.ck
            @Override // o.InterfaceC0073cg
            public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
                return C0080cn.setX(com.google.firebase.FirebaseApp.this);
            }
        }), new C0090cx());
        if (!firebaseApp.setUiOptions.get()) {
            return;
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }

    public static /* synthetic */ C0092cz setX(com.google.firebase.FirebaseApp firebaseApp) {
        return new C0092cz(firebaseApp);
    }

    private C0080cn(ExecutorService executorService, Executor executor, com.google.firebase.FirebaseApp firebaseApp, cG cGVar, cA cAVar, C0087cu c0087cu, aF<C0092cz> aFVar, C0090cx c0090cx) {
        this.ViewPager$SavedState$1 = new Object();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new HashSet();
        this.setChipCornerRadius = new ArrayList();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = firebaseApp;
        this.setOnLongClickListener = cGVar;
        this.setUiOptions = cAVar;
        this.setNavigationOnClickListener = c0087cu;
        this.setIconTintList = aFVar;
        this.setUnboundedRipple = c0090cx;
        this.setLayoutAnimation = executorService;
        this.setTextAlignment = executor;
    }

    public final String setIconTintList() {
        com.google.firebase.FirebaseApp firebaseApp = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!(!firebaseApp.setUiOptions.get())) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        return firebaseApp.setNavigationOnClickListener.setX;
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        com.google.firebase.FirebaseApp firebaseApp = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!(!firebaseApp.setUiOptions.get())) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        return firebaseApp.setNavigationOnClickListener.setY;
    }

    @Override // o.InterfaceC0083cq
    public final setAutoSizeTextTypeUniformWithConfiguration<String> setX() {
        setNavigationOnClickListener();
        String unboundedRipple = setUnboundedRipple();
        if (unboundedRipple == null) {
            setAutoSizeTextTypeUniformWithConfiguration<String> uiOptions = setUiOptions();
            this.setLayoutAnimation.execute(new Runnable() { // from class: o.cj
                @Override // java.lang.Runnable
                public final void run() {
                    C0080cn.this.setY(false);
                }
            });
            return uiOptions;
        }
        setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
        settitletextappearance.setIconTintList(unboundedRipple);
        return settitletextappearance;
    }

    @Override // o.InterfaceC0083cq
    public final setAutoSizeTextTypeUniformWithConfiguration<AbstractC0089cw> MenuHostHelper$$ExternalSyntheticLambda1() {
        setNavigationOnClickListener();
        setAutoSizeTextTypeUniformWithConfiguration<AbstractC0089cw> layoutAnimation = setLayoutAnimation();
        this.setLayoutAnimation.execute(new Runnable(false) { // from class: o.cl
            private /* synthetic */ boolean setIconTintList = false;

            @Override // java.lang.Runnable
            public final void run() {
                C0080cn.this.setY(this.setIconTintList);
            }
        });
        return layoutAnimation;
    }

    private setAutoSizeTextTypeUniformWithConfiguration<String> setUiOptions() {
        setVerticalScrollbarOverlay setverticalscrollbaroverlay = new setVerticalScrollbarOverlay();
        C0081co c0081co = new C0081co(setverticalscrollbaroverlay);
        synchronized (this.ViewPager$SavedState$1) {
            this.setChipCornerRadius.add(c0081co);
        }
        return setverticalscrollbaroverlay.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    private setAutoSizeTextTypeUniformWithConfiguration<AbstractC0089cw> setLayoutAnimation() {
        setVerticalScrollbarOverlay setverticalscrollbaroverlay = new setVerticalScrollbarOverlay();
        C0085cs c0085cs = new C0085cs(this.setNavigationOnClickListener, setverticalscrollbaroverlay);
        synchronized (this.ViewPager$SavedState$1) {
            this.setChipCornerRadius.add(c0085cs);
        }
        return setverticalscrollbaroverlay.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(AbstractC0091cy abstractC0091cy) {
        synchronized (this.ViewPager$SavedState$1) {
            Iterator<InterfaceC0088cv> it = this.setChipCornerRadius.iterator();
            while (it.hasNext()) {
                if (it.next().setY(abstractC0091cy)) {
                    it.remove();
                }
            }
        }
    }

    public final void setX(Exception exc) {
        synchronized (this.ViewPager$SavedState$1) {
            Iterator<InterfaceC0088cv> it = this.setChipCornerRadius.iterator();
            while (it.hasNext()) {
                if (it.next().setX(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void setIconTintList(String str) {
        synchronized (this) {
            this.setY = null;
        }
    }

    private String setUnboundedRipple() {
        String str;
        synchronized (this) {
            str = this.setY;
        }
        return str;
    }

    public final void setY(final boolean z) {
        AbstractC0091cy onLongClickListener = setOnLongClickListener();
        if (z) {
            onLongClickListener = onLongClickListener.setOnLongClickListener().MenuHostHelper$$ExternalSyntheticLambda0(null).MenuHostHelper$$ExternalSyntheticLambda1();
        }
        MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener);
        this.setTextAlignment.execute(new Runnable() { // from class: o.cm
            /* JADX WARN: Removed duplicated region for block: B:122:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 600
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.RunnableC0079cm.run():void");
            }
        });
    }

    private AbstractC0091cy setOnLongClickListener() {
        AbstractC0091cy x;
        String MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (setX) {
            com.google.firebase.FirebaseApp firebaseApp = this.MenuHostHelper$$ExternalSyntheticLambda0;
            boolean z = true;
            if (!firebaseApp.setUiOptions.get()) {
                C0072cf iconTintList = C0072cf.setIconTintList(firebaseApp.setIconTintList, "generatefid.lock");
                x = this.setUiOptions.setX();
                if (x.setUiOptions() == cA.setIconTintList.NOT_GENERATED || x.setUiOptions() == cA.setIconTintList.ATTEMPT_MIGRATION) {
                    com.google.firebase.FirebaseApp firebaseApp2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (!firebaseApp2.setUiOptions.get()) {
                        if (!firebaseApp2.setOnLongClickListener.equals("CHIME_ANDROID_SDK")) {
                            com.google.firebase.FirebaseApp firebaseApp3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                            if (!firebaseApp3.setUiOptions.get()) {
                                if ("[DEFAULT]".equals(firebaseApp3.setOnLongClickListener)) {
                                }
                                MenuHostHelper$$ExternalSyntheticLambda0 = C0090cx.MenuHostHelper$$ExternalSyntheticLambda0();
                                x = this.setUiOptions.setY(x.setOnLongClickListener().setY(MenuHostHelper$$ExternalSyntheticLambda0).setX(cA.setIconTintList.UNREGISTERED).MenuHostHelper$$ExternalSyntheticLambda1());
                            } else {
                                throw new IllegalStateException("FirebaseApp was deleted");
                            }
                        }
                        if (x.setUiOptions() != cA.setIconTintList.ATTEMPT_MIGRATION) {
                            z = false;
                        }
                        if (z) {
                            MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0();
                            if (TextUtils.isEmpty(MenuHostHelper$$ExternalSyntheticLambda0)) {
                                MenuHostHelper$$ExternalSyntheticLambda0 = C0090cx.MenuHostHelper$$ExternalSyntheticLambda0();
                            }
                            x = this.setUiOptions.setY(x.setOnLongClickListener().setY(MenuHostHelper$$ExternalSyntheticLambda0).setX(cA.setIconTintList.UNREGISTERED).MenuHostHelper$$ExternalSyntheticLambda1());
                        }
                        MenuHostHelper$$ExternalSyntheticLambda0 = C0090cx.MenuHostHelper$$ExternalSyntheticLambda0();
                        x = this.setUiOptions.setY(x.setOnLongClickListener().setY(MenuHostHelper$$ExternalSyntheticLambda0).setX(cA.setIconTintList.UNREGISTERED).MenuHostHelper$$ExternalSyntheticLambda1());
                    } else {
                        throw new IllegalStateException("FirebaseApp was deleted");
                    }
                }
                if (iconTintList != null) {
                    try {
                        iconTintList.setY.release();
                        iconTintList.setIconTintList.close();
                    } catch (IOException e) {
                        Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
                    }
                }
            } else {
                throw new IllegalStateException("FirebaseApp was deleted");
            }
        }
        return x;
    }

    /* renamed from: o.cn$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setX;
        static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[cE.setY.values().length];
            setX = iArr;
            try {
                iArr[cE.setY.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setX[cE.setY.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setX[cE.setY.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[cD.setY.values().length];
            setY = iArr2;
            try {
                iArr2[cD.setY.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setY[cD.setY.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final AbstractC0091cy setY() {
        AbstractC0091cy x;
        synchronized (setX) {
            com.google.firebase.FirebaseApp firebaseApp = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (!firebaseApp.setUiOptions.get()) {
                C0072cf iconTintList = C0072cf.setIconTintList(firebaseApp.setIconTintList, "generatefid.lock");
                x = this.setUiOptions.setX();
                if (iconTintList != null) {
                    try {
                        iconTintList.setY.release();
                        iconTintList.setIconTintList.close();
                    } catch (IOException e) {
                        Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
                    }
                }
            } else {
                throw new IllegalStateException("FirebaseApp was deleted");
            }
        }
        return x;
    }

    private void setNavigationOnClickListener() {
        com.google.firebase.FirebaseApp firebaseApp = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!(!firebaseApp.setUiOptions.get())) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        if (TextUtils.isEmpty(firebaseApp.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0)) {
            throw new IllegalArgumentException("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        }
        com.google.firebase.FirebaseApp firebaseApp2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!(!firebaseApp2.setUiOptions.get())) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        if (TextUtils.isEmpty(firebaseApp2.setNavigationOnClickListener.setX)) {
            throw new IllegalArgumentException("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        }
        com.google.firebase.FirebaseApp firebaseApp3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!(!firebaseApp3.setUiOptions.get())) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        if (TextUtils.isEmpty(firebaseApp3.setNavigationOnClickListener.setY)) {
            throw new IllegalArgumentException("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        }
        com.google.firebase.FirebaseApp firebaseApp4 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!firebaseApp4.setUiOptions.get()) {
            if (!C0087cu.setIconTintList(firebaseApp4.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0)) {
                throw new IllegalArgumentException("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
            }
            com.google.firebase.FirebaseApp firebaseApp5 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (!firebaseApp5.setUiOptions.get()) {
                if (!C0087cu.setX(firebaseApp5.setNavigationOnClickListener.setY)) {
                    throw new IllegalArgumentException("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
                }
                return;
            }
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }
}