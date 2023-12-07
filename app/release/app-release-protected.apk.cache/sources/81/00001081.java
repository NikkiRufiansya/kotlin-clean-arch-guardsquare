package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setTitleEnabled$MenuHostHelper$$ExternalSyntheticLambda1 implements Application.ActivityLifecycleCallbacks {
    private final int MenuHostHelper$$ExternalSyntheticLambda1;
    Object setX;
    private Activity setY;
    private boolean setIconTintList = false;
    private boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
    private boolean setNavigationOnClickListener = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTitleEnabled$MenuHostHelper$$ExternalSyntheticLambda1(Activity activity) {
        this.setY = activity;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.setY == activity) {
            this.setIconTintList = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0 || this.setNavigationOnClickListener || this.setIconTintList || !setTitleEnabled.setIconTintList(this.setX, this.MenuHostHelper$$ExternalSyntheticLambda1, activity)) {
            return;
        }
        this.setNavigationOnClickListener = true;
        this.setX = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.setY == activity) {
            this.setY = null;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        }
    }
}