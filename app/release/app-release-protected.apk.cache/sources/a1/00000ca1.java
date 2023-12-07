package o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class setImportantForAccessibility implements computeValue {
    @Nullable
    private getTrimPathStart MenuHostHelper$$ExternalSyntheticLambda1;
    private final Object setX = new Object();
    private final Executor setY;

    public setImportantForAccessibility(Executor executor, getTrimPathStart gettrimpathstart) {
        this.setY = executor;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = gettrimpathstart;
    }

    @Override // o.computeValue
    public final void setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        if (setautosizetexttypeuniformwithconfiguration.setIconTintList()) {
            synchronized (this.setX) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                    return;
                }
                this.setY.execute(new setOnItemLongClickListener(this));
            }
        }
    }
}