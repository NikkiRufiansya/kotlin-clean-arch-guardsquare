package o;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class setCheckedIconMarginResource<TResult, TContinuationResult> implements CalendarConstraints$1<TContinuationResult>, setAccessibilityDataSensitive, getTrimPathStart, computeValue {
    private final getCallingUid MenuHostHelper$$ExternalSyntheticLambda0;
    private final setTitleTextAppearance setIconTintList;
    private final Executor setX;

    public setCheckedIconMarginResource(Executor executor, getCallingUid getcallinguid, setTitleTextAppearance settitletextappearance) {
        this.setX = executor;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = getcallinguid;
        this.setIconTintList = settitletextappearance;
    }

    @Override // o.getTrimPathStart
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setIconTintList.setUiOptions();
    }

    @Override // o.setAccessibilityDataSensitive
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Exception exc) {
        this.setIconTintList.setIconTintList(exc);
    }

    @Override // o.CalendarConstraints$1
    public final void setX(TContinuationResult tcontinuationresult) {
        this.setIconTintList.setIconTintList(tcontinuationresult);
    }

    @Override // o.computeValue
    public final void setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        this.setX.execute(new setShowMotionSpec(this, setautosizetexttypeuniformwithconfiguration));
    }
}