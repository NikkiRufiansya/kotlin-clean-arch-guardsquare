package o;

/* loaded from: classes.dex */
final class BottomSheetBehavior implements Runnable {
    final /* synthetic */ setAutoSizeTextTypeUniformWithConfiguration MenuHostHelper$$ExternalSyntheticLambda0;
    final /* synthetic */ setBoxStrokeColor MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BottomSheetBehavior(setBoxStrokeColor setboxstrokecolor, setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setboxstrokecolor;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setautosizetexttypeuniformwithconfiguration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        setTitleTextAppearance settitletextappearance;
        setTitleTextAppearance settitletextappearance2;
        setTitleTextAppearance settitletextappearance3;
        setAllowedHandwritingDelegatePackage setallowedhandwritingdelegatepackage;
        setTitleTextAppearance settitletextappearance4;
        setTitleTextAppearance settitletextappearance5;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList()) {
            settitletextappearance5 = this.MenuHostHelper$$ExternalSyntheticLambda1.setY;
            settitletextappearance5.setUiOptions();
            return;
        }
        try {
            setallowedhandwritingdelegatepackage = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
            Object x = setallowedhandwritingdelegatepackage.setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
            settitletextappearance4 = this.MenuHostHelper$$ExternalSyntheticLambda1.setY;
            settitletextappearance4.setIconTintList(x);
        } catch (setChipIconVisible e) {
            if (!(e.getCause() instanceof Exception)) {
                settitletextappearance2 = this.MenuHostHelper$$ExternalSyntheticLambda1.setY;
                settitletextappearance2.setIconTintList((Exception) e);
                return;
            }
            settitletextappearance3 = this.MenuHostHelper$$ExternalSyntheticLambda1.setY;
            settitletextappearance3.setIconTintList((Exception) e.getCause());
        } catch (Exception e2) {
            settitletextappearance = this.MenuHostHelper$$ExternalSyntheticLambda1.setY;
            settitletextappearance.setIconTintList(e2);
        }
    }
}