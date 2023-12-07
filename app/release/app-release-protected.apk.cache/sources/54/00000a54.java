package o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class setCloseIconEndPaddingResource implements computeValue {
    private final Executor MenuHostHelper$$ExternalSyntheticLambda0;
    private final Object MenuHostHelper$$ExternalSyntheticLambda1 = new Object();
    @Nullable
    private CalendarConstraints$1 setY;

    public setCloseIconEndPaddingResource(Executor executor, CalendarConstraints$1 calendarConstraints$1) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = executor;
        this.setY = calendarConstraints$1;
    }

    @Override // o.computeValue
    public final void setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        if (setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda0()) {
            synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                if (this.setY == null) {
                    return;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0.execute(new valueOf(this, setautosizetexttypeuniformwithconfiguration));
            }
        }
    }
}