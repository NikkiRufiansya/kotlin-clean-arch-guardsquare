package o;

import androidx.lifecycle.LifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class setFabAnimationMode {
    public static final setInsetTop setX(setTouchDelegate settouchdelegate) {
        androidx.lifecycle.LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z;
        pN.setY(settouchdelegate, "");
        registerIn MenuHostHelper$$ExternalSyntheticLambda1 = settouchdelegate.MenuHostHelper$$ExternalSyntheticLambda1();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda1, "");
        pN.setY(MenuHostHelper$$ExternalSyntheticLambda1, "");
        do {
            androidx.lifecycle.LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (androidx.lifecycle.LifecycleCoroutineScopeImpl) MenuHostHelper$$ExternalSyntheticLambda1.setY.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new androidx.lifecycle.LifecycleCoroutineScopeImpl(MenuHostHelper$$ExternalSyntheticLambda1, new sR(null).plus(C0457sj.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda0()));
            AtomicReference<Object> atomicReference = MenuHostHelper$$ExternalSyntheticLambda1.setY;
            while (true) {
                if (!atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        continue;
                        break;
                    }
                } else {
                    z = true;
                    continue;
                    break;
                }
            }
        } while (!z);
        C0435ro.MenuHostHelper$$ExternalSyntheticLambda1(lifecycleCoroutineScopeImpl, C0457sj.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda0(), null, new LifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1(lifecycleCoroutineScopeImpl, null), 2);
        return lifecycleCoroutineScopeImpl;
    }
}