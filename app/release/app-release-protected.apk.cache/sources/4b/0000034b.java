package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.C0116dx;
import o.C0138es;
import o.C0149fc;
import o.setCornerRadiusResource;

/* loaded from: classes.dex */
public class cS implements Application.ActivityLifecycleCallbacks {
    private static final C0106dm setLayoutAnimation = C0106dm.setY();
    private static volatile cS setOnLongClickListener;
    public Set<setY> MenuHostHelper$$ExternalSyntheticLambda0;
    public boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private final C0135ep ViewPager$SavedState$1;
    private boolean setCenterIfNoTextEnabled;
    private final WeakHashMap<Activity, C0118dz> setChipCornerRadius;
    private final cW setIconSize;
    public final Set<WeakReference<setIconTintList>> setIconTintList;
    private eA setMaxEms;
    private final WeakHashMap<Activity, cU> setNavigationOnClickListener;
    private final C0126eg setOnNavigationItemSelectedListener;
    private final Map<String, Long> setTextAlignment;
    private final boolean setTextScaleX;
    private final WeakHashMap<Activity, Boolean> setUiOptions;
    private final WeakHashMap<Activity, cT> setUnboundedRipple;
    public eJ setX;
    final AtomicInteger setY;
    private eA setZ;

    /* loaded from: classes.dex */
    public interface setIconTintList {
        void setX(eJ eJVar);
    }

    /* loaded from: classes.dex */
    public interface setY {
        void setIconTintList();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static cS MenuHostHelper$$ExternalSyntheticLambda1() {
        if (setOnLongClickListener == null) {
            synchronized (cS.class) {
                if (setOnLongClickListener == null) {
                    setOnLongClickListener = new cS(C0126eg.setIconTintList(), new C0135ep());
                }
            }
        }
        return setOnLongClickListener;
    }

    private cS(C0126eg c0126eg, C0135ep c0135ep) {
        this(c0126eg, c0135ep, cW.setY(), cT.setY());
    }

    private cS(C0126eg c0126eg, C0135ep c0135ep, cW cWVar, boolean z) {
        this.setUiOptions = new WeakHashMap<>();
        this.setUnboundedRipple = new WeakHashMap<>();
        this.setNavigationOnClickListener = new WeakHashMap<>();
        this.setChipCornerRadius = new WeakHashMap<>();
        this.setTextAlignment = new HashMap();
        this.setIconTintList = new HashSet();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new HashSet();
        this.setY = new AtomicInteger(0);
        this.setX = eJ.BACKGROUND;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        this.setCenterIfNoTextEnabled = true;
        this.setOnNavigationItemSelectedListener = c0126eg;
        this.ViewPager$SavedState$1 = c0135ep;
        this.setIconSize = cWVar;
        this.setTextScaleX = z;
    }

    public final void setY(String str) {
        synchronized (this.setTextAlignment) {
            Long l = this.setTextAlignment.get(str);
            if (l == null) {
                this.setTextAlignment.put(str, 1L);
            } else {
                this.setTextAlignment.put(str, Long.valueOf(l.longValue() + 1));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        setY(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.setUnboundedRipple.remove(activity);
        if (this.setNavigationOnClickListener.containsKey(activity)) {
            ((setEndIconContentDescription) activity).setOnNavigationItemSelectedListener().setY(this.setNavigationOnClickListener.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        synchronized (this) {
            if (this.setUiOptions.isEmpty()) {
                this.setMaxEms = new eA();
                this.setUiOptions.put(activity, Boolean.TRUE);
                if (this.setCenterIfNoTextEnabled) {
                    setY(eJ.FOREGROUND);
                    synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                        for (setY sety : this.MenuHostHelper$$ExternalSyntheticLambda0) {
                            if (sety != null) {
                                sety.setIconTintList();
                            }
                        }
                    }
                    this.setCenterIfNoTextEnabled = false;
                } else {
                    setY(C0138es.setX.BACKGROUND_TRACE_NAME.toString(), this.setZ, this.setMaxEms);
                    setY(eJ.FOREGROUND);
                }
            } else {
                this.setUiOptions.put(activity, Boolean.TRUE);
            }
        }
    }

    private void setY(eJ eJVar) {
        this.setX = eJVar;
        synchronized (this.setIconTintList) {
            Iterator<WeakReference<setIconTintList>> it = this.setIconTintList.iterator();
            while (it.hasNext()) {
                setIconTintList seticontintlist = it.next().get();
                if (seticontintlist != null) {
                    seticontintlist.setX(this.setX);
                } else {
                    it.remove();
                }
            }
        }
    }

    private void setY(String str, eA eAVar, eA eAVar2) {
        C0149fc.setX textAlignment;
        if (this.setIconSize.setOnNavigationItemSelectedListener()) {
            textAlignment = C0149fc.DEFAULT_INSTANCE.setTextAlignment();
            C0149fc.setX MenuHostHelper$$ExternalSyntheticLambda0 = textAlignment.MenuHostHelper$$ExternalSyntheticLambda0(str).MenuHostHelper$$ExternalSyntheticLambda1(eAVar.MenuHostHelper$$ExternalSyntheticLambda0).setX(eAVar2.setX - eAVar.setX).MenuHostHelper$$ExternalSyntheticLambda0(dQ.setIconTintList().setIconTintList.setY());
            int andSet = this.setY.getAndSet(0);
            synchronized (this.setTextAlignment) {
                MenuHostHelper$$ExternalSyntheticLambda0.setX(this.setTextAlignment);
                if (andSet != 0) {
                    MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(es$MenuHostHelper$$ExternalSyntheticLambda1.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                this.setTextAlignment.clear();
            }
            C0126eg c0126eg = this.setOnNavigationItemSelectedListener;
            c0126eg.MenuHostHelper$$ExternalSyntheticLambda0.execute(new RunnableC0130ek(c0126eg, MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1(), eJ.FOREGROUND_BACKGROUND));
        }
    }

    private void setY(Activity activity) {
        if (this.setTextScaleX && this.setIconSize.setOnNavigationItemSelectedListener()) {
            cT cTVar = new cT(activity);
            this.setUnboundedRipple.put(activity, cTVar);
            if (activity instanceof setEndIconContentDescription) {
                cU cUVar = new cU(this.ViewPager$SavedState$1, this.setOnNavigationItemSelectedListener, this, cTVar);
                this.setNavigationOnClickListener.put(activity, cUVar);
                ((setEndIconContentDescription) activity).setOnNavigationItemSelectedListener().setZ.setX.add(new setCornerRadiusResource.setY(cUVar, true));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        synchronized (this) {
            if (this.setTextScaleX && this.setIconSize.setOnNavigationItemSelectedListener()) {
                if (!this.setUnboundedRipple.containsKey(activity)) {
                    setY(activity);
                }
                cT cTVar = this.setUnboundedRipple.get(activity);
                if (cTVar.MenuHostHelper$$ExternalSyntheticLambda0) {
                    C0106dm c0106dm = cT.setY;
                    Object[] objArr = {cTVar.setX.getClass().getSimpleName()};
                    if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                        Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                        Cdo.setIconTintList(String.format(Locale.ENGLISH, "FrameMetricsAggregator is already recording %s", objArr));
                    }
                } else {
                    cTVar.setIconTintList.setX.MenuHostHelper$$ExternalSyntheticLambda0(cTVar.setX);
                    cTVar.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                }
                StringBuilder sb = new StringBuilder("_st_");
                sb.append(activity.getClass().getSimpleName());
                C0118dz c0118dz = new C0118dz(sb.toString(), this.setOnNavigationItemSelectedListener, this.ViewPager$SavedState$1, this);
                c0118dz.setOnLongClickListener();
                this.setChipCornerRadius.put(activity, c0118dz);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C0118dz c0118dz;
        synchronized (this) {
            if (this.setTextScaleX && (c0118dz = this.setChipCornerRadius.get(activity)) != null) {
                this.setChipCornerRadius.remove(activity);
                C0142ew<C0116dx.setIconTintList> iconTintList = this.setUnboundedRipple.get(activity).setIconTintList();
                if (!(iconTintList.MenuHostHelper$$ExternalSyntheticLambda0 != null)) {
                    C0106dm c0106dm = setLayoutAnimation;
                    Object[] objArr = {activity.getClass().getSimpleName()};
                    if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                        Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                        Cdo.setX(String.format(Locale.ENGLISH, "Failed to record frame data for %s.", objArr));
                    }
                } else {
                    C0116dx.setIconTintList seticontintlist = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (seticontintlist != null) {
                        C0140eu.setIconTintList(c0118dz, seticontintlist);
                        c0118dz.setUnboundedRipple();
                    } else {
                        throw new NoSuchElementException("No value present");
                    }
                }
            }
            if (this.setUiOptions.containsKey(activity)) {
                this.setUiOptions.remove(activity);
                if (this.setUiOptions.isEmpty()) {
                    this.setZ = new eA();
                    setY(C0138es.setX.FOREGROUND_TRACE_NAME.toString(), this.setMaxEms, this.setZ);
                    setY(eJ.BACKGROUND);
                }
            }
        }
    }
}