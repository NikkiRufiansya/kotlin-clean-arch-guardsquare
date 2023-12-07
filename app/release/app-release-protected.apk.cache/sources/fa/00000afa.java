package o;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class setDividerDrawable implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final setDividerDrawable setX = new setDividerDrawable();
    public final AtomicBoolean MenuHostHelper$$ExternalSyntheticLambda0 = new AtomicBoolean();
    private final AtomicBoolean MenuHostHelper$$ExternalSyntheticLambda1 = new AtomicBoolean();
    public final ArrayList setY = new ArrayList();
    private boolean setIconTintList = false;

    /* loaded from: classes.dex */
    public interface setX {
        void MenuHostHelper$$ExternalSyntheticLambda1(boolean z);
    }

    private setDividerDrawable() {
    }

    private final void setIconTintList(boolean z) {
        synchronized (setX) {
            Iterator it = this.setY.iterator();
            while (it.hasNext()) {
                ((setX) it.next()).MenuHostHelper$$ExternalSyntheticLambda1(z);
            }
        }
    }

    public static void setX(Application application) {
        setDividerDrawable setdividerdrawable = setX;
        synchronized (setdividerdrawable) {
            if (!setdividerdrawable.setIconTintList) {
                application.registerActivityLifecycleCallbacks(setdividerdrawable);
                application.registerComponentCallbacks(setdividerdrawable);
                setdividerdrawable.setIconTintList = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.MenuHostHelper$$ExternalSyntheticLambda0.compareAndSet(true, false);
        this.MenuHostHelper$$ExternalSyntheticLambda1.set(true);
        if (compareAndSet) {
            setIconTintList(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.MenuHostHelper$$ExternalSyntheticLambda0.compareAndSet(true, false);
        this.MenuHostHelper$$ExternalSyntheticLambda1.set(true);
        if (compareAndSet) {
            setIconTintList(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.MenuHostHelper$$ExternalSyntheticLambda0.compareAndSet(false, true)) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.set(true);
            setIconTintList(true);
        }
    }
}