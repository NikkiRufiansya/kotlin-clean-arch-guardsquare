package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import o.cS;
import o.eG;
import o.eV;

/* renamed from: o.eg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126eg implements cS.setIconTintList {
    public InterfaceC0073cg<setIconPadding> MenuHostHelper$$ExternalSyntheticLambda1;
    private cR ViewPager$SavedState$1;
    private String setAnimationFromJson;
    private eG.setIconTintList setCenterIfNoTextEnabled;
    private final Map<String, Integer> setChipCornerRadius;
    private cS setIconSize;
    public InterfaceC0083cq setIconTintList;
    public String setLayoutAnimation;
    private C0125ef setMaxEms;
    private Context setNavigationOnClickListener;
    C0129ej setOnLongClickListener;
    private cW setTextAlignment;
    public com.google.firebase.FirebaseApp setX;
    private static final C0106dm setUnboundedRipple = C0106dm.setY();
    private static final C0126eg setUiOptions = new C0126eg();
    private final ConcurrentLinkedQueue<C0128ei> setZ = new ConcurrentLinkedQueue<>();
    private final AtomicBoolean setTextScaleX = new AtomicBoolean(false);
    boolean setY = false;
    public ExecutorService MenuHostHelper$$ExternalSyntheticLambda0 = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private C0126eg() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.setChipCornerRadius = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static C0126eg setIconTintList() {
        return setUiOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void setY(C0128ei c0128ei) {
        setY(c0128ei.MenuHostHelper$$ExternalSyntheticLambda1, c0128ei.setY);
    }

    @Override // o.cS.setIconTintList
    public final void setX(eJ eJVar) {
        this.setY = eJVar == eJ.FOREGROUND;
        if (this.setTextScaleX.get()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.execute(new Runnable() { // from class: o.en
                @Override // java.lang.Runnable
                public final void run() {
                    C0126eg c0126eg = C0126eg.this;
                    C0129ej c0129ej = c0126eg.setOnLongClickListener;
                    boolean z = c0126eg.setY;
                    c0129ej.setY.setX(z);
                    c0129ej.MenuHostHelper$$ExternalSyntheticLambda1.setX(z);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x011c, code lost:
        if (o.C0129ej.setX(r9.setIconTintList().perfSessions_) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011e, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0161, code lost:
        if (o.C0129ej.setX(r9.setIconTintList().perfSessions_) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0185, code lost:
        if (o.C0129ej.setX(r9.setX().perfSessions_) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean setIconTintList(o.eV r9) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0126eg.setIconTintList(o.eV):boolean");
    }

    private static String setX(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return packageInfo.versionName == null ? "" : packageInfo.versionName;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(eV eVVar) {
        if (eVVar.setUnboundedRipple()) {
            this.setIconSize.setY(es$MenuHostHelper$$ExternalSyntheticLambda1.TRACE_EVENT_RATE_LIMITED.toString());
        } else if (eVVar.setOnLongClickListener()) {
            this.setIconSize.setY(es$MenuHostHelper$$ExternalSyntheticLambda1.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
        }
    }

    private static String setY(eT eTVar) {
        if (eTVar.setUnboundedRipple()) {
            C0149fc iconTintList = eTVar.setIconTintList();
            return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", iconTintList.name_, new DecimalFormat("#.####").format(iconTintList.durationUs_ / 1000.0d));
        } else if (eTVar.setOnLongClickListener()) {
            eP x = eTVar.setX();
            return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", x.url_, (x.bitField0_ & 32) != 0 ? String.valueOf(x.httpResponseCode_) : "UNKNOWN", new DecimalFormat("#.####").format(((x.bitField0_ & 1024) != 0 ? x.timeToResponseCompletedUs_ : 0L) / 1000.0d));
        } else if (eTVar.setUiOptions()) {
            eO MenuHostHelper$$ExternalSyntheticLambda1 = eTVar.MenuHostHelper$$ExternalSyntheticLambda1();
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf((MenuHostHelper$$ExternalSyntheticLambda1.bitField0_ & 2) != 0);
            objArr[1] = Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda1.cpuMetricReadings_.size());
            objArr[2] = Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda1.androidMemoryReadings_.size());
            return String.format(locale, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", objArr);
        } else {
            return "log";
        }
    }

    public static /* synthetic */ void setX(C0126eg c0126eg) {
        com.google.firebase.FirebaseApp firebaseApp = c0126eg.setX;
        if (!firebaseApp.setUiOptions.get()) {
            Context context = firebaseApp.setIconTintList;
            c0126eg.setNavigationOnClickListener = context;
            c0126eg.setAnimationFromJson = context.getPackageName();
            c0126eg.setTextAlignment = cW.setY();
            c0126eg.setOnLongClickListener = new C0129ej(c0126eg.setNavigationOnClickListener, new C0144ey(100L, 1L, TimeUnit.MINUTES));
            c0126eg.setIconSize = cS.MenuHostHelper$$ExternalSyntheticLambda1();
            c0126eg.setMaxEms = new C0125ef(c0126eg.MenuHostHelper$$ExternalSyntheticLambda1, c0126eg.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda1());
            cS cSVar = c0126eg.setIconSize;
            WeakReference<cS.setIconTintList> weakReference = new WeakReference<>(setUiOptions);
            synchronized (cSVar.setIconTintList) {
                cSVar.setIconTintList.add(weakReference);
            }
            eG.setIconTintList y = eG.setY();
            c0126eg.setCenterIfNoTextEnabled = y;
            com.google.firebase.FirebaseApp firebaseApp2 = c0126eg.setX;
            if (!firebaseApp2.setUiOptions.get()) {
                y.setX(firebaseApp2.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0).setX(eF.setIconTintList().setIconTintList(c0126eg.setAnimationFromJson).MenuHostHelper$$ExternalSyntheticLambda1(cM.setX).MenuHostHelper$$ExternalSyntheticLambda0(setX(c0126eg.setNavigationOnClickListener)));
                c0126eg.setTextScaleX.set(true);
                while (!c0126eg.setZ.isEmpty()) {
                    final C0128ei poll = c0126eg.setZ.poll();
                    if (poll != null) {
                        c0126eg.MenuHostHelper$$ExternalSyntheticLambda0.execute(new Runnable() { // from class: o.eo
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0126eg.this.setY(poll);
                            }
                        });
                    }
                }
                return;
            }
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }

    private eV setX(eV.setIconTintList seticontintlist, eJ eJVar) {
        Map<String, String> emptyMap;
        setAutoSizeTextTypeUniformWithConfiguration<String> x;
        TimeUnit timeUnit;
        Object x2;
        if (this.setTextAlignment.setOnNavigationItemSelectedListener() && (!this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda1() || this.setY)) {
            String str = null;
            try {
                x = this.setIconTintList.setX();
                timeUnit = TimeUnit.MILLISECONDS;
            } catch (InterruptedException e) {
                C0106dm c0106dm = setUnboundedRipple;
                Object[] objArr = {e.getMessage()};
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setY(String.format(Locale.ENGLISH, "Task to retrieve Installation Id is interrupted: %s", objArr));
                }
            } catch (ExecutionException e2) {
                C0106dm c0106dm2 = setUnboundedRipple;
                Object[] objArr2 = {e2.getMessage()};
                if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setY(String.format(Locale.ENGLISH, "Unable to retrieve Installation Id: %s", objArr2));
                }
            } catch (TimeoutException e3) {
                C0106dm c0106dm3 = setUnboundedRipple;
                Object[] objArr3 = {e3.getMessage()};
                if (c0106dm3.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo3 = c0106dm3.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setY(String.format(Locale.ENGLISH, "Task to retrieve Installation Id is timed out: %s", objArr3));
                }
            }
            if (BottomAppBar$SavedState$1.setIconTintList()) {
                throw new IllegalStateException("Must not be called on the main application thread");
            }
            if (x == null) {
                throw new NullPointerException("Task must not be null");
            }
            if (timeUnit != null) {
                if (x.setX()) {
                    x2 = AppBarLayout$BaseBehavior$SavedState$1.setX(x);
                } else {
                    setEndIconDrawable setendicondrawable = new setEndIconDrawable(null);
                    x.setX(setAccessibilityPaneTitle.setY, (CalendarConstraints$1<? super String>) setendicondrawable);
                    x.setX(setAccessibilityPaneTitle.setY, (setAccessibilityDataSensitive) setendicondrawable);
                    x.setX(setAccessibilityPaneTitle.setY, (getTrimPathStart) setendicondrawable);
                    if (!setendicondrawable.MenuHostHelper$$ExternalSyntheticLambda0(60000L, timeUnit)) {
                        throw new TimeoutException("Timed out waiting for Task");
                    }
                    x2 = AppBarLayout$BaseBehavior$SavedState$1.setX(x);
                }
                str = (String) x2;
                if (!TextUtils.isEmpty(str)) {
                    this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0(str);
                } else {
                    C0106dm c0106dm4 = setUnboundedRipple;
                    if (c0106dm4.MenuHostHelper$$ExternalSyntheticLambda0) {
                        Cdo cdo4 = c0106dm4.MenuHostHelper$$ExternalSyntheticLambda1;
                        Cdo.setX("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                    }
                }
            } else {
                throw new NullPointerException("TimeUnit must not be null");
            }
        }
        eG.setIconTintList iconTintList = this.setCenterIfNoTextEnabled.setIconTintList(eJVar);
        if (seticontintlist.setUnboundedRipple() || seticontintlist.setOnLongClickListener()) {
            eG.setIconTintList centerIfNoTextEnabled = iconTintList.setCenterIfNoTextEnabled();
            if (this.ViewPager$SavedState$1 == null && this.setTextScaleX.get()) {
                this.ViewPager$SavedState$1 = cR.setY();
            }
            cR cRVar = this.ViewPager$SavedState$1;
            if (cRVar == null) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = new HashMap<>(cRVar.setX);
            }
            iconTintList = centerIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0(emptyMap);
        }
        return seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList).ViewPager$SavedState$1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setY(o.eV.setIconTintList r17, o.eJ r18) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0126eg.setY(o.eV$setIconTintList, o.eJ):void");
    }
}