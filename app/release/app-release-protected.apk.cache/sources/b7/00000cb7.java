package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import o.ComponentRegistrar;
import o.registerIn;

/* loaded from: classes.dex */
public class setIndicatorOptions implements setTouchDelegate {
    private static final setIndicatorOptions setOnLongClickListener = new setIndicatorOptions();
    Handler setX;
    int setUiOptions = 0;
    int setUnboundedRipple = 0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;
    boolean setNavigationOnClickListener = true;
    final setAdjustViewBounds setY = new setAdjustViewBounds(this);
    Runnable MenuHostHelper$$ExternalSyntheticLambda0 = new Runnable() { // from class: o.setIndicatorOptions.3
        @Override // java.lang.Runnable
        public final void run() {
            setIndicatorOptions setindicatoroptions = setIndicatorOptions.this;
            if (setindicatoroptions.setUnboundedRipple == 0) {
                setindicatoroptions.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                setindicatoroptions.setY.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_PAUSE);
            }
            setIndicatorOptions setindicatoroptions2 = setIndicatorOptions.this;
            if (setindicatoroptions2.setUiOptions == 0 && setindicatoroptions2.MenuHostHelper$$ExternalSyntheticLambda1) {
                setindicatoroptions2.setY.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_STOP);
                setindicatoroptions2.setNavigationOnClickListener = true;
            }
        }
    };
    ComponentRegistrar.setX setIconTintList = new ComponentRegistrar.setX() { // from class: o.setIndicatorOptions.5
        @Override // o.ComponentRegistrar.setX
        public final void MenuHostHelper$$ExternalSyntheticLambda0() {
            setIndicatorOptions.this.MenuHostHelper$$ExternalSyntheticLambda0();
        }

        @Override // o.ComponentRegistrar.setX
        public final void setIconTintList() {
            setIndicatorOptions.this.setY();
        }
    };

    public static setTouchDelegate setX() {
        return setOnLongClickListener;
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
        setIndicatorOptions setindicatoroptions = setOnLongClickListener;
        setindicatoroptions.setX = new Handler();
        setindicatoroptions.setY.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new setId() { // from class: o.setIndicatorOptions.2
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPreCreated(Activity activity, Bundle bundle) {
                activity.registerActivityLifecycleCallbacks(new setId() { // from class: o.setIndicatorOptions.2.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPostStarted(Activity activity2) {
                        setIndicatorOptions.this.MenuHostHelper$$ExternalSyntheticLambda0();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPostResumed(Activity activity2) {
                        setIndicatorOptions.this.setY();
                    }
                });
            }

            @Override // o.setId, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (Build.VERSION.SDK_INT < 29) {
                    ((ComponentRegistrar) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).setY = setIndicatorOptions.this.setIconTintList;
                }
            }

            @Override // o.setId, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                setIndicatorOptions setindicatoroptions2 = setIndicatorOptions.this;
                int i = setindicatoroptions2.setUnboundedRipple - 1;
                setindicatoroptions2.setUnboundedRipple = i;
                if (i == 0) {
                    setindicatoroptions2.setX.postDelayed(setindicatoroptions2.MenuHostHelper$$ExternalSyntheticLambda0, 700L);
                }
            }

            @Override // o.setId, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                setIndicatorOptions setindicatoroptions2 = setIndicatorOptions.this;
                setindicatoroptions2.setUiOptions--;
                if (setindicatoroptions2.setUiOptions == 0 && setindicatoroptions2.MenuHostHelper$$ExternalSyntheticLambda1) {
                    setindicatoroptions2.setY.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_STOP);
                    setindicatoroptions2.setNavigationOnClickListener = true;
                }
            }
        });
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0() {
        int i = this.setUiOptions + 1;
        this.setUiOptions = i;
        if (i == 1 && this.setNavigationOnClickListener) {
            this.setY.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_START);
            this.setNavigationOnClickListener = false;
        }
    }

    final void setY() {
        int i = this.setUnboundedRipple + 1;
        this.setUnboundedRipple = i;
        if (i == 1) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                this.setY.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_RESUME);
                this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
                return;
            }
            this.setX.removeCallbacks(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    private setIndicatorOptions() {
    }

    @Override // o.setTouchDelegate
    public registerIn MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setY;
    }
}