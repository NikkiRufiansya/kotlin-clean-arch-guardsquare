package o;

/* loaded from: classes.dex */
final class setCornerRadius implements Runnable {
    final /* synthetic */ getLocalMatrix MenuHostHelper$$ExternalSyntheticLambda1;
    final /* synthetic */ setAutoSizeTextTypeUniformWithConfiguration setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCornerRadius(getLocalMatrix getlocalmatrix, setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = getlocalmatrix;
        this.setIconTintList = setautosizetexttypeuniformwithconfiguration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        setTitleTextAppearance settitletextappearance;
        setTitleTextAppearance settitletextappearance2;
        setTitleTextAppearance settitletextappearance3;
        setAllowedHandwritingDelegatePackage setallowedhandwritingdelegatepackage;
        try {
            setallowedhandwritingdelegatepackage = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
            setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration = (setAutoSizeTextTypeUniformWithConfiguration) setallowedhandwritingdelegatepackage.setX(this.setIconTintList);
            if (setautosizetexttypeuniformwithconfiguration == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(new NullPointerException("Continuation returned null"));
                return;
            }
            setautosizetexttypeuniformwithconfiguration.setX(setAccessibilityPaneTitle.setY, (CalendarConstraints$1) this.MenuHostHelper$$ExternalSyntheticLambda1);
            setautosizetexttypeuniformwithconfiguration.setX(setAccessibilityPaneTitle.setY, (setAccessibilityDataSensitive) this.MenuHostHelper$$ExternalSyntheticLambda1);
            setautosizetexttypeuniformwithconfiguration.setX(setAccessibilityPaneTitle.setY, (getTrimPathStart) this.MenuHostHelper$$ExternalSyntheticLambda1);
        } catch (setChipIconVisible e) {
            if (!(e.getCause() instanceof Exception)) {
                settitletextappearance2 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
                settitletextappearance2.setIconTintList((Exception) e);
                return;
            }
            settitletextappearance3 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
            settitletextappearance3.setIconTintList((Exception) e.getCause());
        } catch (Exception e2) {
            settitletextappearance = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
            settitletextappearance.setIconTintList(e2);
        }
    }
}