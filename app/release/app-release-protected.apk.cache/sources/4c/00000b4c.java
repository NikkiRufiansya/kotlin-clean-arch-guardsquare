package o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class setEndIconOnLongClickListener implements computeValue {
    private final Executor MenuHostHelper$$ExternalSyntheticLambda0;
    private final Object MenuHostHelper$$ExternalSyntheticLambda1 = new Object();
    @Nullable
    private setAccessibilityDataSensitive setIconTintList;

    public setEndIconOnLongClickListener(Executor executor, setAccessibilityDataSensitive setaccessibilitydatasensitive) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = executor;
        this.setIconTintList = setaccessibilitydatasensitive;
    }

    @Override // o.computeValue
    public final void setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        if (setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda0() || setautosizetexttypeuniformwithconfiguration.setIconTintList()) {
            return;
        }
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            if (this.setIconTintList == null) {
                return;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.execute(new getInsetsIgnoringVisibility(this, setautosizetexttypeuniformwithconfiguration));
        }
    }
}