package o;

import android.util.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.C0053bn;
import o.fN;

/* loaded from: classes.dex */
public final class cY {
    private C0163fq setIconSize;
    private final long setLayoutAnimation;
    private final C0094da setNavigationOnClickListener;
    private final long setOnLongClickListener;
    private final ConcurrentHashMap<String, InterfaceC0171fy> setUiOptions;
    private final Executor setUnboundedRipple;
    long setX;
    public InterfaceC0073cg<C0172fz> setY;
    static final C0106dm MenuHostHelper$$ExternalSyntheticLambda0 = C0106dm.setY();
    private static final cY setIconTintList = new cY();
    private static final long MenuHostHelper$$ExternalSyntheticLambda1 = TimeUnit.HOURS.toMillis(12);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private cY() {
        /*
            r10 = this;
            o.da r1 = o.C0094da.MenuHostHelper$$ExternalSyntheticLambda0()
            java.util.concurrent.ThreadPoolExecutor r9 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            r3 = 0
            r4 = 1
            r5 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r7, r8)
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2 = 25000(0x61a8, float:3.5032E-41)
            int r0 = r0.nextInt(r2)
            long r2 = (long) r0
            com.google.firebase.FirebaseApp r0 = com.google.firebase.FirebaseApp.MenuHostHelper$$ExternalSyntheticLambda0()
            java.lang.Class<o.V> r4 = o.V.class
            java.lang.Object r0 = r0.setY(r4)
            o.V r0 = (o.V) r0
            if (r0 == 0) goto L34
            long r4 = r0.setIconTintList()
            goto L38
        L34:
            long r4 = java.lang.System.currentTimeMillis()
        L38:
            r5 = r4
            r7 = 5000(0x1388, double:2.4703E-320)
            long r3 = r2 + r7
            r0 = r10
            r2 = r9
            r0.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cY.<init>():void");
    }

    private cY(C0094da c0094da, Executor executor, long j, long j2) {
        this.setX = 0L;
        this.setNavigationOnClickListener = c0094da;
        this.setUnboundedRipple = executor;
        this.setIconSize = null;
        this.setUiOptions = new ConcurrentHashMap<>();
        this.setLayoutAnimation = j2;
        this.setOnLongClickListener = j;
    }

    public final C0142ew<Double> setIconTintList(String str) {
        if (str == null) {
            C0106dm c0106dm = MenuHostHelper$$ExternalSyntheticLambda0;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("The key to get Remote Config double value is null.");
            }
            return new C0142ew<>();
        }
        InterfaceC0171fy y = setY(str);
        if (y != null) {
            try {
                return new C0142ew<>(Double.valueOf(y.setIconTintList()));
            } catch (IllegalArgumentException unused) {
                if (!y.setX().isEmpty()) {
                    C0106dm c0106dm2 = MenuHostHelper$$ExternalSyntheticLambda0;
                    Object[] objArr = {y.setX(), str};
                    if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                        Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                        Cdo.setIconTintList(String.format(Locale.ENGLISH, "Could not parse value: '%s' for key: '%s'.", objArr));
                    }
                }
            }
        }
        return new C0142ew<>();
    }

    public final C0142ew<Long> setX(String str) {
        if (str == null) {
            C0106dm c0106dm = MenuHostHelper$$ExternalSyntheticLambda0;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("The key to get Remote Config long value is null.");
            }
            return new C0142ew<>();
        }
        InterfaceC0171fy y = setY(str);
        if (y != null) {
            try {
                return new C0142ew<>(Long.valueOf(y.setY()));
            } catch (IllegalArgumentException unused) {
                if (!y.setX().isEmpty()) {
                    C0106dm c0106dm2 = MenuHostHelper$$ExternalSyntheticLambda0;
                    Object[] objArr = {y.setX(), str};
                    if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                        Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                        Cdo.setIconTintList(String.format(Locale.ENGLISH, "Could not parse value: '%s' for key: '%s'.", objArr));
                    }
                }
            }
        }
        return new C0142ew<>();
    }

    public final C0142ew<Boolean> MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        if (str == null) {
            C0106dm c0106dm = MenuHostHelper$$ExternalSyntheticLambda0;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("The key to get Remote Config boolean value is null.");
            }
            return new C0142ew<>();
        }
        InterfaceC0171fy y = setY(str);
        if (y != null) {
            try {
                return new C0142ew<>(Boolean.valueOf(y.MenuHostHelper$$ExternalSyntheticLambda1()));
            } catch (IllegalArgumentException unused) {
                if (!y.setX().isEmpty()) {
                    C0106dm c0106dm2 = MenuHostHelper$$ExternalSyntheticLambda0;
                    Object[] objArr = {y.setX(), str};
                    if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                        Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                        Cdo.setIconTintList(String.format(Locale.ENGLISH, "Could not parse value: '%s' for key: '%s'.", objArr));
                    }
                }
            }
        }
        return new C0142ew<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Long] */
    public final <T> T setY(String str, T t) {
        InterfaceC0171fy y = setY(str);
        if (y != null) {
            try {
                if (t instanceof Long) {
                    t = Long.valueOf(y.setY());
                } else {
                    String x = y.setX();
                    try {
                        C0106dm c0106dm = MenuHostHelper$$ExternalSyntheticLambda0;
                        Object[] objArr = {t};
                        if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                            Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                            Cdo.setIconTintList(String.format(Locale.ENGLISH, "No matching type found for the defaultValue: '%s', using String.", objArr));
                        }
                        t = (T) x;
                    } catch (IllegalArgumentException unused) {
                        t = (T) x;
                        if (!y.setX().isEmpty()) {
                            C0106dm c0106dm2 = MenuHostHelper$$ExternalSyntheticLambda0;
                            Object[] objArr2 = {y.setX(), str};
                            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                                Cdo.setIconTintList(String.format(Locale.ENGLISH, "Could not parse value: '%s' for key: '%s'.", objArr2));
                            }
                        }
                        return t;
                    }
                }
            } catch (IllegalArgumentException unused2) {
                t = t;
            }
        }
        return t;
    }

    public final InterfaceC0171fy setY(String str) {
        setNavigationOnClickListener();
        if (setUnboundedRipple() && this.setUiOptions.containsKey(str)) {
            InterfaceC0171fy interfaceC0171fy = this.setUiOptions.get(str);
            if (interfaceC0171fy.MenuHostHelper$$ExternalSyntheticLambda0() == 2) {
                C0106dm c0106dm = MenuHostHelper$$ExternalSyntheticLambda0;
                Object[] objArr = {interfaceC0171fy.setX(), str};
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setIconTintList(String.format(Locale.ENGLISH, "Fetched value: '%s' for key: '%s' from Firebase Remote Config.", objArr));
                }
                return interfaceC0171fy;
            }
            return null;
        }
        return null;
    }

    public final boolean setIconTintList() {
        C0163fq c0163fq = this.setIconSize;
        return c0163fq == null || c0163fq.setLayoutAnimation.setX().setIconTintList() == 1 || this.setIconSize.setLayoutAnimation.setX().setIconTintList() == 2;
    }

    private void setNavigationOnClickListener() {
        if (setUnboundedRipple()) {
            if (this.setUiOptions.isEmpty()) {
                this.setUiOptions.putAll(this.setIconSize.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0());
            }
            if (setX()) {
                setY();
            }
        }
    }

    public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1() {
        Map<String, InterfaceC0171fy> MenuHostHelper$$ExternalSyntheticLambda02 = this.setIconSize.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0();
        this.setUiOptions.putAll(MenuHostHelper$$ExternalSyntheticLambda02);
        for (String str : this.setUiOptions.keySet()) {
            if (!MenuHostHelper$$ExternalSyntheticLambda02.containsKey(str)) {
                this.setUiOptions.remove(str);
            }
        }
        cZ$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
        InterfaceC0171fy interfaceC0171fy = this.setUiOptions.get("fpr_experiment_app_start_ttid");
        if (interfaceC0171fy != null) {
            try {
                this.setNavigationOnClickListener.setY("com.google.firebase.perf.ExperimentTTID", interfaceC0171fy.MenuHostHelper$$ExternalSyntheticLambda1());
                return;
            } catch (Exception unused) {
                C0106dm c0106dm = MenuHostHelper$$ExternalSyntheticLambda0;
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setIconTintList("ExperimentTTID remote config flag has invalid value, expected boolean.");
                    return;
                }
                return;
            }
        }
        C0106dm c0106dm2 = MenuHostHelper$$ExternalSyntheticLambda0;
        if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
            Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
            Cdo.setIconTintList("ExperimentTTID remote config flag does not exist.");
        }
    }

    private boolean setUnboundedRipple() {
        InterfaceC0073cg<C0172fz> interfaceC0073cg;
        C0172fz MenuHostHelper$$ExternalSyntheticLambda02;
        if (this.setIconSize == null && (interfaceC0073cg = this.setY) != null && (MenuHostHelper$$ExternalSyntheticLambda02 = interfaceC0073cg.MenuHostHelper$$ExternalSyntheticLambda0()) != null) {
            this.setIconSize = MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0("fireperf");
        }
        return this.setIconSize != null;
    }

    private boolean setX() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.setLayoutAnimation >= this.setOnLongClickListener) {
            if (currentTimeMillis - this.setX > MenuHostHelper$$ExternalSyntheticLambda1) {
                return true;
            }
        }
        return false;
    }

    private void setY() {
        this.setX = System.currentTimeMillis();
        final C0163fq c0163fq = this.setIconSize;
        final fN fNVar = c0163fq.setX;
        final long j = fNVar.setX.setX.getLong("minimum_fetch_interval_in_seconds", fN.setY);
        final HashMap hashMap = new HashMap(fNVar.MenuHostHelper$$ExternalSyntheticLambda0);
        StringBuilder sb = new StringBuilder();
        sb.append(fN$MenuHostHelper$$ExternalSyntheticLambda0.BASE.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append("/1");
        hashMap.put("X-Firebase-RC-Fetch-Type", sb.toString());
        fNVar.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1().setY(fNVar.setIconTintList, new setAllowedHandwritingDelegatePackage() { // from class: o.fM
            @Override // o.setAllowedHandwritingDelegatePackage
            public final Object setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
                return fN.this.setX(setautosizetexttypeuniformwithconfiguration, j, hashMap);
            }
        }).MenuHostHelper$$ExternalSyntheticLambda0(C0053bn.setX.INSTANCE, new getCallingUid() { // from class: o.fo
            @Override // o.getCallingUid
            public final setAutoSizeTextTypeUniformWithConfiguration setIconTintList(Object obj) {
                fN.setX setx = (fN.setX) obj;
                setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
                settitletextappearance.setIconTintList((Object) null);
                return settitletextappearance;
            }
        }).MenuHostHelper$$ExternalSyntheticLambda0(c0163fq.setIconTintList, new getCallingUid() { // from class: o.fp
            @Override // o.getCallingUid
            public final setAutoSizeTextTypeUniformWithConfiguration setIconTintList(Object obj) {
                final C0163fq c0163fq2 = C0163fq.this;
                Void r6 = (Void) obj;
                final setAutoSizeTextTypeUniformWithConfiguration<fP> MenuHostHelper$$ExternalSyntheticLambda12 = c0163fq2.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1();
                final setAutoSizeTextTypeUniformWithConfiguration<fP> MenuHostHelper$$ExternalSyntheticLambda13 = c0163fq2.setY.MenuHostHelper$$ExternalSyntheticLambda1();
                return AppBarLayout$BaseBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda12, MenuHostHelper$$ExternalSyntheticLambda13).setY(c0163fq2.setIconTintList, new setAllowedHandwritingDelegatePackage() { // from class: o.fw
                    @Override // o.setAllowedHandwritingDelegatePackage
                    public final Object setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
                        final C0163fq c0163fq3 = C0163fq.this;
                        setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration2 = MenuHostHelper$$ExternalSyntheticLambda12;
                        setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration3 = MenuHostHelper$$ExternalSyntheticLambda13;
                        boolean MenuHostHelper$$ExternalSyntheticLambda02 = setautosizetexttypeuniformwithconfiguration2.MenuHostHelper$$ExternalSyntheticLambda0();
                        Boolean bool = Boolean.FALSE;
                        if (MenuHostHelper$$ExternalSyntheticLambda02 && setautosizetexttypeuniformwithconfiguration2.MenuHostHelper$$ExternalSyntheticLambda1() != null) {
                            fP fPVar = (fP) setautosizetexttypeuniformwithconfiguration2.MenuHostHelper$$ExternalSyntheticLambda1();
                            if (setautosizetexttypeuniformwithconfiguration3.MenuHostHelper$$ExternalSyntheticLambda0()) {
                                fP fPVar2 = (fP) setautosizetexttypeuniformwithconfiguration3.MenuHostHelper$$ExternalSyntheticLambda1();
                                if (!(fPVar2 == null || !fPVar.MenuHostHelper$$ExternalSyntheticLambda1.equals(fPVar2.MenuHostHelper$$ExternalSyntheticLambda1))) {
                                    setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
                                    settitletextappearance.setIconTintList(bool);
                                    return settitletextappearance;
                                }
                            }
                            return c0163fq3.setY.setX(fPVar).setIconTintList(c0163fq3.setIconTintList, new setAllowedHandwritingDelegatePackage() { // from class: o.fr
                                @Override // o.setAllowedHandwritingDelegatePackage
                                public final Object setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration4) {
                                    boolean z;
                                    C0163fq c0163fq4 = C0163fq.this;
                                    if (setautosizetexttypeuniformwithconfiguration4.MenuHostHelper$$ExternalSyntheticLambda0()) {
                                        fK fKVar = c0163fq4.setOnLongClickListener;
                                        synchronized (fKVar) {
                                            setTitleTextAppearance settitletextappearance2 = new setTitleTextAppearance();
                                            settitletextappearance2.setIconTintList((Object) null);
                                            fKVar.setIconTintList = settitletextappearance2;
                                        }
                                        fKVar.setY.setY();
                                        if (setautosizetexttypeuniformwithconfiguration4.MenuHostHelper$$ExternalSyntheticLambda1() != null) {
                                            c0163fq4.MenuHostHelper$$ExternalSyntheticLambda0(((fP) setautosizetexttypeuniformwithconfiguration4.MenuHostHelper$$ExternalSyntheticLambda1()).MenuHostHelper$$ExternalSyntheticLambda0);
                                        } else {
                                            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
                                        }
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    return Boolean.valueOf(z);
                                }
                            });
                        }
                        setTitleTextAppearance settitletextappearance2 = new setTitleTextAppearance();
                        settitletextappearance2.setIconTintList(bool);
                        return settitletextappearance2;
                    }
                });
            }
        }).setX(this.setUnboundedRipple, new CalendarConstraints$1() { // from class: o.de
            @Override // o.CalendarConstraints$1
            public final void setX(Object obj) {
                Boolean bool = (Boolean) obj;
                cY.this.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        }).setX(this.setUnboundedRipple, new setAccessibilityDataSensitive() { // from class: o.dd
            @Override // o.setAccessibilityDataSensitive
            public final void MenuHostHelper$$ExternalSyntheticLambda1(Exception exc) {
                cY cYVar = cY.this;
                C0106dm c0106dm = cY.MenuHostHelper$$ExternalSyntheticLambda0;
                Object[] objArr = {exc};
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setX(String.format(Locale.ENGLISH, "Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", objArr));
                }
                cYVar.setX = 0L;
            }
        });
    }
}