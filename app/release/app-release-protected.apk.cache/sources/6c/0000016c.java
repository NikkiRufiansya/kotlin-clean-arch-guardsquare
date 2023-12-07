package o;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import o.registerIn;

/* loaded from: classes.dex */
public final class ComponentRegistrar extends Fragment {
    setX setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface setX {
        void MenuHostHelper$$ExternalSyntheticLambda0();

        void setIconTintList();
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public static void setY(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            setY.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ComponentRegistrar(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    static void MenuHostHelper$$ExternalSyntheticLambda0(Activity activity, registerIn.setX setx) {
        if (activity instanceof setTextColor) {
            ((setTextColor) activity).setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1(setx);
        } else if (activity instanceof setTouchDelegate) {
            registerIn MenuHostHelper$$ExternalSyntheticLambda1 = ((setTouchDelegate) activity).MenuHostHelper$$ExternalSyntheticLambda1();
            if (MenuHostHelper$$ExternalSyntheticLambda1 instanceof setAdjustViewBounds) {
                ((setAdjustViewBounds) MenuHostHelper$$ExternalSyntheticLambda1).MenuHostHelper$$ExternalSyntheticLambda1(setx);
            }
        }
    }

    private static void setIconTintList(setX setx) {
        if (setx != null) {
            setx.MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    private static void setX(setX setx) {
        if (setx != null) {
            setx.setIconTintList();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        MenuHostHelper$$ExternalSyntheticLambda0(registerIn.setX.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        setIconTintList(this.setY);
        MenuHostHelper$$ExternalSyntheticLambda0(registerIn.setX.ON_START);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        setX(this.setY);
        MenuHostHelper$$ExternalSyntheticLambda0(registerIn.setX.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        MenuHostHelper$$ExternalSyntheticLambda0(registerIn.setX.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        MenuHostHelper$$ExternalSyntheticLambda0(registerIn.setX.ON_STOP);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        MenuHostHelper$$ExternalSyntheticLambda0(registerIn.setX.ON_DESTROY);
        this.setY = null;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(registerIn.setX setx) {
        if (Build.VERSION.SDK_INT < 29) {
            MenuHostHelper$$ExternalSyntheticLambda0(getActivity(), setx);
        }
    }

    /* loaded from: classes.dex */
    static class setY implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
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

        setY() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new setY());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostCreated(Activity activity, Bundle bundle) {
            ComponentRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(activity, registerIn.setX.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostStarted(Activity activity) {
            ComponentRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(activity, registerIn.setX.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostResumed(Activity activity) {
            ComponentRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(activity, registerIn.setX.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPrePaused(Activity activity) {
            ComponentRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(activity, registerIn.setX.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreStopped(Activity activity) {
            ComponentRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(activity, registerIn.setX.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreDestroyed(Activity activity) {
            ComponentRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(activity, registerIn.setX.ON_DESTROY);
        }
    }
}