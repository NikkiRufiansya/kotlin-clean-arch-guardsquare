package o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class setButtonTintMode implements computeValue {
    private final Object MenuHostHelper$$ExternalSyntheticLambda0 = new Object();
    private final Executor setIconTintList;
    @Nullable
    private setSelectedTabIndicatorColor setY;

    public setButtonTintMode(Executor executor, setSelectedTabIndicatorColor setselectedtabindicatorcolor) {
        this.setIconTintList = executor;
        this.setY = setselectedtabindicatorcolor;
    }

    @Override // o.computeValue
    public final void setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (this.setY == null) {
                return;
            }
            this.setIconTintList.execute(new setScrimsShown(this, setautosizetexttypeuniformwithconfiguration));
        }
    }
}