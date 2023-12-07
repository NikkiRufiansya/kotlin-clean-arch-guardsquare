package o;

/* loaded from: classes.dex */
final class getInsetsIgnoringVisibility implements Runnable {
    final /* synthetic */ setAutoSizeTextTypeUniformWithConfiguration MenuHostHelper$$ExternalSyntheticLambda0;
    final /* synthetic */ setEndIconOnLongClickListener MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getInsetsIgnoringVisibility(setEndIconOnLongClickListener setendicononlongclicklistener, setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setendicononlongclicklistener;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setautosizetexttypeuniformwithconfiguration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        setAccessibilityDataSensitive setaccessibilitydatasensitive;
        setAccessibilityDataSensitive setaccessibilitydatasensitive2;
        obj = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
        synchronized (obj) {
            setEndIconOnLongClickListener setendicononlongclicklistener = this.MenuHostHelper$$ExternalSyntheticLambda1;
            setaccessibilitydatasensitive = setendicononlongclicklistener.setIconTintList;
            if (setaccessibilitydatasensitive != null) {
                setaccessibilitydatasensitive2 = setendicononlongclicklistener.setIconTintList;
                setaccessibilitydatasensitive2.MenuHostHelper$$ExternalSyntheticLambda1((Exception) setExpandedTitleMarginBottom.setX(this.MenuHostHelper$$ExternalSyntheticLambda0.setY()));
            }
        }
    }
}