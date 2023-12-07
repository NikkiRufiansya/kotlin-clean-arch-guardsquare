package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class setCheckedIconSize {
    private static AtomicBoolean MenuHostHelper$$ExternalSyntheticLambda1 = new AtomicBoolean(false);

    public static void setIconTintList(Context context) {
        if (MenuHostHelper$$ExternalSyntheticLambda1.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new setX());
    }

    /* loaded from: classes.dex */
    static class setX extends setId {
        @Override // o.setId, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // o.setId, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        setX() {
        }

        @Override // o.setId, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            ComponentRegistrar.setY(activity);
        }
    }
}