package o;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class setBoxStrokeColor implements computeValue {
    private final setAllowedHandwritingDelegatePackage MenuHostHelper$$ExternalSyntheticLambda1;
    private final Executor setIconTintList;
    private final setTitleTextAppearance setY;

    public setBoxStrokeColor(Executor executor, setAllowedHandwritingDelegatePackage setallowedhandwritingdelegatepackage, setTitleTextAppearance settitletextappearance) {
        this.setIconTintList = executor;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setallowedhandwritingdelegatepackage;
        this.setY = settitletextappearance;
    }

    @Override // o.computeValue
    public final void setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        this.setIconTintList.execute(new BottomSheetBehavior(this, setautosizetexttypeuniformwithconfiguration));
    }
}