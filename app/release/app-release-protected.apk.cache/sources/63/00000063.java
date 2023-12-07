package androidx.lifecycle;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import o.asInterface;
import o.setCheckedIconSize;
import o.setIndicatorOptions;
import o.setItemActiveIndicatorEnabled;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements setItemActiveIndicatorEnabled<setTouchDelegate> {
    @Override // o.setItemActiveIndicatorEnabled
    public final List<Class<? extends setItemActiveIndicatorEnabled<?>>> setX() {
        return Collections.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setItemActiveIndicatorEnabled
    public final /* synthetic */ setTouchDelegate setX(Context context) {
        if (!asInterface.setIconTintList(context).setX(getClass())) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
        }
        setCheckedIconSize.setIconTintList(context);
        setIndicatorOptions.MenuHostHelper$$ExternalSyntheticLambda0(context);
        return setIndicatorOptions.setX();
    }
}