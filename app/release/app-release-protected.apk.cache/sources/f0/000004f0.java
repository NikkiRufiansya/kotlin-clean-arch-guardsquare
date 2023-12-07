package o;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class getLocalMatrix<TResult, TContinuationResult> implements CalendarConstraints$1<TContinuationResult>, setAccessibilityDataSensitive, getTrimPathStart, computeValue {
    private final setTitleTextAppearance MenuHostHelper$$ExternalSyntheticLambda0;
    private final setAllowedHandwritingDelegatePackage MenuHostHelper$$ExternalSyntheticLambda1;
    private final Executor setY;

    public getLocalMatrix(Executor executor, setAllowedHandwritingDelegatePackage setallowedhandwritingdelegatepackage, setTitleTextAppearance settitletextappearance) {
        this.setY = executor;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setallowedhandwritingdelegatepackage;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = settitletextappearance;
    }

    @Override // o.getTrimPathStart
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions();
    }

    @Override // o.setAccessibilityDataSensitive
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Exception exc) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(exc);
    }

    @Override // o.CalendarConstraints$1
    public final void setX(TContinuationResult tcontinuationresult) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(tcontinuationresult);
    }

    @Override // o.computeValue
    public final void setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        this.setY.execute(new setCornerRadius(this, setautosizetexttypeuniformwithconfiguration));
    }
}