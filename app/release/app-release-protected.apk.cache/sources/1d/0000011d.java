package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.FirebaseApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C0106dm;
import o.C0126eg;
import o.C0135ep;
import o.C0138es;
import o.C0149fc;
import o.Cdo;
import o.RunnableC0130ek;
import o.V;
import o.ViewTreeObserver$OnDrawListenerC0137er;
import o.ViewTreeObserver$OnPreDrawListenerC0141ev;
import o.cW;
import o.dO;
import o.dQ;
import o.eA;
import o.eJ;
import o.registerIn;
import o.setIndicatorOptions;
import o.setItemActiveIndicatorColor;
import o.setOnFlingListener;

/* loaded from: classes.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, setOnFlingListener {
    private static final long MenuHostHelper$$ExternalSyntheticLambda1;
    private static volatile AppStartTrace setLayoutAnimation;
    private static ExecutorService setOnLongClickListener;
    private static final eA setUnboundedRipple;
    private final eA ExtendableSavedState$1;
    private dO SearchView$SavedState$1;
    private final C0149fc.setX setCenterIfNoTextEnabled;
    private final cW setChipCornerRadius;
    private WeakReference<Activity> setNavigationOnClickListener;
    private final eA setTextAlignment;
    private WeakReference<Activity> setTextScaleX;
    private final C0135ep setUiOptions;
    public final C0126eg setX;
    public Context setY;
    public boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
    private boolean setOnNavigationItemSelectedListener = false;
    private eA setAnimationFromJson = null;
    private eA setCheckedIconEnabled = null;
    private eA setMinAndMaxProgress = null;
    private eA setIconSize = null;
    private eA ViewPager$SavedState$1 = null;
    private eA setHasDecor = null;
    private eA setTextAppearanceResource = null;
    private eA setLayoutDirection = null;
    private boolean setZ = false;
    private int setMaxEms = 0;
    private final setIconTintList setGuidelinePercent = new setIconTintList(this, (byte) 0);
    public boolean setIconTintList = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    static /* synthetic */ boolean setNavigationOnClickListener(AppStartTrace appStartTrace) {
        appStartTrace.setZ = true;
        return true;
    }

    static /* synthetic */ int setOnLongClickListener(AppStartTrace appStartTrace) {
        int i = appStartTrace.setMaxEms;
        appStartTrace.setMaxEms = i + 1;
        return i;
    }

    static {
        new C0135ep();
        setUnboundedRipple = new eA();
        MenuHostHelper$$ExternalSyntheticLambda1 = TimeUnit.MINUTES.toMicros(1L);
    }

    public static AppStartTrace setY() {
        return setLayoutAnimation != null ? setLayoutAnimation : MenuHostHelper$$ExternalSyntheticLambda0(C0126eg.setIconTintList(), new C0135ep());
    }

    private static AppStartTrace MenuHostHelper$$ExternalSyntheticLambda0(C0126eg c0126eg, C0135ep c0135ep) {
        if (setLayoutAnimation == null) {
            synchronized (AppStartTrace.class) {
                if (setLayoutAnimation == null) {
                    setLayoutAnimation = new AppStartTrace(c0126eg, c0135ep, cW.setY(), new ThreadPoolExecutor(0, 1, 10 + MenuHostHelper$$ExternalSyntheticLambda1, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return setLayoutAnimation;
    }

    private AppStartTrace(C0126eg c0126eg, C0135ep c0135ep, cW cWVar, ExecutorService executorService) {
        C0149fc.setX textAlignment;
        this.setX = c0126eg;
        this.setUiOptions = c0135ep;
        this.setChipCornerRadius = cWVar;
        setOnLongClickListener = executorService;
        textAlignment = C0149fc.DEFAULT_INSTANCE.setTextAlignment();
        this.setCenterIfNoTextEnabled = textAlignment.MenuHostHelper$$ExternalSyntheticLambda0("_experiment_app_start_ttid");
        this.ExtendableSavedState$1 = Build.VERSION.SDK_INT >= 24 ? eA.setIconTintList(Process.getStartElapsedRealtime()) : null;
        V v = (V) FirebaseApp.MenuHostHelper$$ExternalSyntheticLambda0().setY(V.class);
        this.setTextAlignment = v != null ? eA.setIconTintList(v.MenuHostHelper$$ExternalSyntheticLambda0()) : null;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        synchronized (this) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                setIndicatorOptions.setX().MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda1(this);
                ((Application) this.setY).unregisterActivityLifecycleCallbacks(this);
                this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0044 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #0 {, blocks: (B:37:0x0001, B:39:0x0005, B:42:0x000a, B:44:0x000f, B:49:0x001b, B:56:0x0037, B:58:0x0044, B:52:0x0030, B:55:0x0035), top: B:66:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityCreated(android.app.Activity r5, android.os.Bundle r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r6 = r4.setZ     // Catch: java.lang.Throwable -> L4a
            if (r6 != 0) goto L48
            o.eA r6 = r4.setAnimationFromJson     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto La
            goto L48
        La:
            boolean r6 = r4.setIconTintList     // Catch: java.lang.Throwable -> L4a
            r0 = 1
            if (r6 != 0) goto L1a
            android.content.Context r6 = r4.setY     // Catch: java.lang.Throwable -> L4a
            boolean r6 = setY(r6)     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto L18
            goto L1a
        L18:
            r6 = 0
            goto L1b
        L1a:
            r6 = 1
        L1b:
            r4.setIconTintList = r6     // Catch: java.lang.Throwable -> L4a
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L4a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L4a
            r4.setTextScaleX = r6     // Catch: java.lang.Throwable -> L4a
            o.eA r5 = new o.eA     // Catch: java.lang.Throwable -> L4a
            r5.<init>()     // Catch: java.lang.Throwable -> L4a
            r4.setAnimationFromJson = r5     // Catch: java.lang.Throwable -> L4a
            o.eA r5 = r4.ExtendableSavedState$1     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L30
            goto L37
        L30:
            o.eA r5 = r4.setTextAlignment     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L35
            goto L37
        L35:
            o.eA r5 = com.google.firebase.perf.metrics.AppStartTrace.setUnboundedRipple     // Catch: java.lang.Throwable -> L4a
        L37:
            o.eA r6 = r4.setAnimationFromJson     // Catch: java.lang.Throwable -> L4a
            long r1 = r6.setX     // Catch: java.lang.Throwable -> L4a
            long r5 = r5.setX     // Catch: java.lang.Throwable -> L4a
            long r1 = r1 - r5
            long r5 = com.google.firebase.perf.metrics.AppStartTrace.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L4a
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L46
            r4.setOnNavigationItemSelectedListener = r0     // Catch: java.lang.Throwable -> L4a
        L46:
            monitor-exit(r4)
            return
        L48:
            monitor-exit(r4)
            return
        L4a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        synchronized (this) {
            if (!this.setZ && this.setCheckedIconEnabled == null && !this.setOnNavigationItemSelectedListener) {
                this.setCheckedIconEnabled = new eA();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        synchronized (this) {
            if (!this.setZ && !this.setOnNavigationItemSelectedListener) {
                boolean iconTintList = this.setChipCornerRadius.setIconTintList();
                if (iconTintList) {
                    View findViewById = activity.findViewById(16908290);
                    findViewById.getViewTreeObserver().addOnDrawListener(this.setGuidelinePercent);
                    final ViewTreeObserver$OnDrawListenerC0137er viewTreeObserver$OnDrawListenerC0137er = new ViewTreeObserver$OnDrawListenerC0137er(findViewById, new Runnable() { // from class: o.dp
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.firebase.perf.metrics.AppStartTrace.setX(com.google.firebase.perf.metrics.AppStartTrace.this);
                        }
                    });
                    if (Build.VERSION.SDK_INT < 26) {
                        if (!(findViewById.getViewTreeObserver().isAlive() && findViewById.isAttachedToWindow())) {
                            findViewById.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.er.3
                                @Override // android.view.View.OnAttachStateChangeListener
                                public final void onViewAttachedToWindow(View view) {
                                    view.getViewTreeObserver().addOnDrawListener(ViewTreeObserver$OnDrawListenerC0137er.this);
                                    view.removeOnAttachStateChangeListener(this);
                                }

                                @Override // android.view.View.OnAttachStateChangeListener
                                public final void onViewDetachedFromWindow(View view) {
                                    view.removeOnAttachStateChangeListener(this);
                                }
                            });
                            findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC0141ev(findViewById, new Runnable() { // from class: o.ds
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.google.firebase.perf.metrics.AppStartTrace.setY(com.google.firebase.perf.metrics.AppStartTrace.this);
                                }
                            }, new Runnable() { // from class: o.du
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.google.firebase.perf.metrics.AppStartTrace.MenuHostHelper$$ExternalSyntheticLambda0(com.google.firebase.perf.metrics.AppStartTrace.this);
                                }
                            }));
                        }
                    }
                    findViewById.getViewTreeObserver().addOnDrawListener(viewTreeObserver$OnDrawListenerC0137er);
                    findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC0141ev(findViewById, new Runnable() { // from class: o.ds
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.firebase.perf.metrics.AppStartTrace.setY(com.google.firebase.perf.metrics.AppStartTrace.this);
                        }
                    }, new Runnable() { // from class: o.du
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.firebase.perf.metrics.AppStartTrace.MenuHostHelper$$ExternalSyntheticLambda0(com.google.firebase.perf.metrics.AppStartTrace.this);
                        }
                    }));
                }
                if (this.setMinAndMaxProgress != null) {
                    return;
                }
                this.setNavigationOnClickListener = new WeakReference<>(activity);
                this.setMinAndMaxProgress = new eA();
                this.SearchView$SavedState$1 = dQ.setIconTintList().setIconTintList;
                C0106dm y = C0106dm.setY();
                StringBuilder sb = new StringBuilder("onResume(): ");
                sb.append(activity.getClass().getName());
                sb.append(": ");
                eA eAVar = this.setTextAlignment;
                if (eAVar == null) {
                    eAVar = setUnboundedRipple;
                }
                sb.append(this.setMinAndMaxProgress.setX - eAVar.setX);
                sb.append(" microseconds");
                String obj = sb.toString();
                if (y.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo = y.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setIconTintList(obj);
                }
                setOnLongClickListener.execute(new Runnable() { // from class: o.dt
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.firebase.perf.metrics.AppStartTrace.MenuHostHelper$$ExternalSyntheticLambda1(com.google.firebase.perf.metrics.AppStartTrace.this);
                    }
                });
                if (!iconTintList) {
                    MenuHostHelper$$ExternalSyntheticLambda1();
                }
            }
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(final C0149fc.setX setx) {
        if (this.setHasDecor == null || this.setTextAppearanceResource == null || this.setLayoutDirection == null) {
            return;
        }
        setOnLongClickListener.execute(new Runnable() { // from class: o.dv
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.perf.metrics.AppStartTrace appStartTrace = com.google.firebase.perf.metrics.AppStartTrace.this;
                C0149fc.setX setx2 = setx;
                C0126eg c0126eg = appStartTrace.setX;
                c0126eg.MenuHostHelper$$ExternalSyntheticLambda0.execute(new RunnableC0130ek(c0126eg, setx2.ViewPager$SavedState$1(), eJ.FOREGROUND_BACKGROUND));
            }
        });
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.setZ || this.setOnNavigationItemSelectedListener || !this.setChipCornerRadius.setIconTintList()) {
            return;
        }
        activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.setGuidelinePercent);
    }

    @setItemActiveIndicatorColor(setX = registerIn.setX.ON_START)
    public void onAppEnteredForeground() {
        C0149fc.setX textAlignment;
        if (this.setZ || this.setOnNavigationItemSelectedListener || this.setIconSize != null) {
            return;
        }
        this.setIconSize = new eA();
        C0149fc.setX setx = this.setCenterIfNoTextEnabled;
        textAlignment = C0149fc.DEFAULT_INSTANCE.setTextAlignment();
        C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda0 = textAlignment.MenuHostHelper$$ExternalSyntheticLambda0("_experiment_firstForegrounding");
        eA eAVar = this.ExtendableSavedState$1;
        if (eAVar == null && (eAVar = this.setTextAlignment) == null) {
            eAVar = setUnboundedRipple;
        }
        C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(eAVar.MenuHostHelper$$ExternalSyntheticLambda0);
        eA eAVar2 = this.ExtendableSavedState$1;
        if (eAVar2 == null && (eAVar2 = this.setTextAlignment) == null) {
            eAVar2 = setUnboundedRipple;
        }
        setx.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda12.setX(this.setIconSize.setX - eAVar2.setX).ViewPager$SavedState$1());
    }

    @setItemActiveIndicatorColor(setX = registerIn.setX.ON_STOP)
    public void onAppEnteredBackground() {
        C0149fc.setX textAlignment;
        if (this.setZ || this.setOnNavigationItemSelectedListener || this.ViewPager$SavedState$1 != null) {
            return;
        }
        this.ViewPager$SavedState$1 = new eA();
        C0149fc.setX setx = this.setCenterIfNoTextEnabled;
        textAlignment = C0149fc.DEFAULT_INSTANCE.setTextAlignment();
        C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda0 = textAlignment.MenuHostHelper$$ExternalSyntheticLambda0("_experiment_firstBackgrounding");
        eA eAVar = this.ExtendableSavedState$1;
        if (eAVar == null && (eAVar = this.setTextAlignment) == null) {
            eAVar = setUnboundedRipple;
        }
        C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(eAVar.MenuHostHelper$$ExternalSyntheticLambda0);
        eA eAVar2 = this.ExtendableSavedState$1;
        if (eAVar2 == null && (eAVar2 = this.setTextAlignment) == null) {
            eAVar2 = setUnboundedRipple;
        }
        setx.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda12.setX(this.ViewPager$SavedState$1.setX - eAVar2.setX).ViewPager$SavedState$1());
    }

    public static boolean setY(Context context) {
        PowerManager powerManager;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = context.getPackageName();
            StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append(":");
            String obj = sb.toString();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(obj))) {
                    if ((Build.VERSION.SDK_INT >= 23 || (powerManager = (PowerManager) context.getSystemService("power")) == null) ? true : powerManager.isInteractive()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static class setY implements Runnable {
        private final AppStartTrace setX;

        public setY(AppStartTrace appStartTrace) {
            this.setX = appStartTrace;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.setX.setAnimationFromJson == null) {
                AppStartTrace.setNavigationOnClickListener(this.setX);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class setIconTintList implements ViewTreeObserver.OnDrawListener {
        private setIconTintList() {
            AppStartTrace.this = r1;
        }

        /* synthetic */ setIconTintList(AppStartTrace appStartTrace, byte b) {
            this();
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            AppStartTrace.setOnLongClickListener(AppStartTrace.this);
        }
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(AppStartTrace appStartTrace) {
        C0149fc.setX textAlignment;
        if (appStartTrace.setTextAppearanceResource == null) {
            C0135ep c0135ep = appStartTrace.setUiOptions;
            appStartTrace.setTextAppearanceResource = new eA();
            C0149fc.setX setx = appStartTrace.setCenterIfNoTextEnabled;
            textAlignment = C0149fc.DEFAULT_INSTANCE.setTextAlignment();
            C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda0 = textAlignment.MenuHostHelper$$ExternalSyntheticLambda0("_experiment_preDrawFoQ");
            eA eAVar = appStartTrace.ExtendableSavedState$1;
            if (eAVar == null && (eAVar = appStartTrace.setTextAlignment) == null) {
                eAVar = setUnboundedRipple;
            }
            C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(eAVar.MenuHostHelper$$ExternalSyntheticLambda0);
            eA eAVar2 = appStartTrace.ExtendableSavedState$1;
            if (eAVar2 == null && (eAVar2 = appStartTrace.setTextAlignment) == null) {
                eAVar2 = setUnboundedRipple;
            }
            setx.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda12.setX(appStartTrace.setTextAppearanceResource.setX - eAVar2.setX).ViewPager$SavedState$1());
            appStartTrace.MenuHostHelper$$ExternalSyntheticLambda1(appStartTrace.setCenterIfNoTextEnabled);
        }
    }

    public static /* synthetic */ void setX(AppStartTrace appStartTrace) {
        C0149fc.setX textAlignment;
        C0149fc.setX textAlignment2;
        if (appStartTrace.setLayoutDirection == null) {
            C0135ep c0135ep = appStartTrace.setUiOptions;
            appStartTrace.setLayoutDirection = new eA();
            C0149fc.setX setx = appStartTrace.setCenterIfNoTextEnabled;
            textAlignment = C0149fc.DEFAULT_INSTANCE.setTextAlignment();
            C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda0 = textAlignment.MenuHostHelper$$ExternalSyntheticLambda0("_experiment_onDrawFoQ");
            eA eAVar = appStartTrace.ExtendableSavedState$1;
            if (eAVar == null && (eAVar = appStartTrace.setTextAlignment) == null) {
                eAVar = setUnboundedRipple;
            }
            C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(eAVar.MenuHostHelper$$ExternalSyntheticLambda0);
            eA eAVar2 = appStartTrace.ExtendableSavedState$1;
            if (eAVar2 == null && (eAVar2 = appStartTrace.setTextAlignment) == null) {
                eAVar2 = setUnboundedRipple;
            }
            setx.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda12.setX(appStartTrace.setLayoutDirection.setX - eAVar2.setX).ViewPager$SavedState$1());
            if (appStartTrace.ExtendableSavedState$1 != null) {
                C0149fc.setX setx2 = appStartTrace.setCenterIfNoTextEnabled;
                textAlignment2 = C0149fc.DEFAULT_INSTANCE.setTextAlignment();
                C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda02 = textAlignment2.MenuHostHelper$$ExternalSyntheticLambda0("_experiment_procStart_to_classLoad");
                eA eAVar3 = appStartTrace.ExtendableSavedState$1;
                if (eAVar3 == null && (eAVar3 = appStartTrace.setTextAlignment) == null) {
                    eAVar3 = setUnboundedRipple;
                }
                C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda13 = MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda1(eAVar3.MenuHostHelper$$ExternalSyntheticLambda0);
                eA eAVar4 = appStartTrace.ExtendableSavedState$1;
                if (eAVar4 == null && (eAVar4 = appStartTrace.setTextAlignment) == null) {
                    eAVar4 = setUnboundedRipple;
                }
                eA eAVar5 = appStartTrace.setTextAlignment;
                if (eAVar5 == null) {
                    eAVar5 = setUnboundedRipple;
                }
                setx2.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda13.setX(eAVar5.setX - eAVar4.setX).ViewPager$SavedState$1());
            }
            appStartTrace.setCenterIfNoTextEnabled.setX("systemDeterminedForeground", appStartTrace.setIconTintList ? "true" : "false");
            appStartTrace.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda1("onDrawCount", appStartTrace.setMaxEms);
            appStartTrace.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0(appStartTrace.SearchView$SavedState$1.setY());
            appStartTrace.MenuHostHelper$$ExternalSyntheticLambda1(appStartTrace.setCenterIfNoTextEnabled);
        }
    }

    public static /* synthetic */ void setY(AppStartTrace appStartTrace) {
        if (appStartTrace.setHasDecor == null) {
            C0135ep c0135ep = appStartTrace.setUiOptions;
            appStartTrace.setHasDecor = new eA();
            C0149fc.setX setx = appStartTrace.setCenterIfNoTextEnabled;
            eA eAVar = appStartTrace.ExtendableSavedState$1;
            if (eAVar == null && (eAVar = appStartTrace.setTextAlignment) == null) {
                eAVar = setUnboundedRipple;
            }
            C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda12 = setx.MenuHostHelper$$ExternalSyntheticLambda1(eAVar.MenuHostHelper$$ExternalSyntheticLambda0);
            eA eAVar2 = appStartTrace.ExtendableSavedState$1;
            if (eAVar2 == null && (eAVar2 = appStartTrace.setTextAlignment) == null) {
                eAVar2 = setUnboundedRipple;
            }
            MenuHostHelper$$ExternalSyntheticLambda12.setX(appStartTrace.setHasDecor.setX - eAVar2.setX);
            appStartTrace.MenuHostHelper$$ExternalSyntheticLambda1(appStartTrace.setCenterIfNoTextEnabled);
        }
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(AppStartTrace appStartTrace) {
        C0149fc.setX textAlignment;
        C0149fc.setX textAlignment2;
        C0149fc.setX textAlignment3;
        C0149fc.setX textAlignment4;
        textAlignment = C0149fc.DEFAULT_INSTANCE.setTextAlignment();
        C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda0 = textAlignment.MenuHostHelper$$ExternalSyntheticLambda0(C0138es.setX.APP_START_TRACE_NAME.toString());
        eA eAVar = appStartTrace.setTextAlignment;
        if (eAVar == null) {
            eAVar = setUnboundedRipple;
        }
        C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(eAVar.MenuHostHelper$$ExternalSyntheticLambda0);
        eA eAVar2 = appStartTrace.setTextAlignment;
        if (eAVar2 == null) {
            eAVar2 = setUnboundedRipple;
        }
        C0149fc.setX x = MenuHostHelper$$ExternalSyntheticLambda12.setX(appStartTrace.setMinAndMaxProgress.setX - eAVar2.setX);
        ArrayList arrayList = new ArrayList(3);
        textAlignment2 = C0149fc.DEFAULT_INSTANCE.setTextAlignment();
        C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda02 = textAlignment2.MenuHostHelper$$ExternalSyntheticLambda0(C0138es.setX.ON_CREATE_TRACE_NAME.toString());
        eA eAVar3 = appStartTrace.setTextAlignment;
        if (eAVar3 == null) {
            eAVar3 = setUnboundedRipple;
        }
        C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda13 = MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda1(eAVar3.MenuHostHelper$$ExternalSyntheticLambda0);
        eA eAVar4 = appStartTrace.setTextAlignment;
        if (eAVar4 == null) {
            eAVar4 = setUnboundedRipple;
        }
        arrayList.add(MenuHostHelper$$ExternalSyntheticLambda13.setX(appStartTrace.setAnimationFromJson.setX - eAVar4.setX).ViewPager$SavedState$1());
        if (appStartTrace.setCheckedIconEnabled != null) {
            textAlignment3 = C0149fc.DEFAULT_INSTANCE.setTextAlignment();
            textAlignment3.MenuHostHelper$$ExternalSyntheticLambda0(C0138es.setX.ON_START_TRACE_NAME.toString()).MenuHostHelper$$ExternalSyntheticLambda1(appStartTrace.setAnimationFromJson.MenuHostHelper$$ExternalSyntheticLambda0).setX(appStartTrace.setCheckedIconEnabled.setX - appStartTrace.setAnimationFromJson.setX);
            arrayList.add(textAlignment3.ViewPager$SavedState$1());
            textAlignment4 = C0149fc.DEFAULT_INSTANCE.setTextAlignment();
            textAlignment4.MenuHostHelper$$ExternalSyntheticLambda0(C0138es.setX.ON_RESUME_TRACE_NAME.toString()).MenuHostHelper$$ExternalSyntheticLambda1(appStartTrace.setCheckedIconEnabled.MenuHostHelper$$ExternalSyntheticLambda0).setX(appStartTrace.setMinAndMaxProgress.setX - appStartTrace.setCheckedIconEnabled.setX);
            arrayList.add(textAlignment4.ViewPager$SavedState$1());
        }
        x.setIconTintList(arrayList).MenuHostHelper$$ExternalSyntheticLambda0(appStartTrace.SearchView$SavedState$1.setY());
        C0126eg c0126eg = appStartTrace.setX;
        c0126eg.MenuHostHelper$$ExternalSyntheticLambda0.execute(new RunnableC0130ek(c0126eg, x.ViewPager$SavedState$1(), eJ.FOREGROUND_BACKGROUND));
    }
}