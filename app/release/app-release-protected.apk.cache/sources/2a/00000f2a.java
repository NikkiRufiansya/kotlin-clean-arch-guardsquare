package o;

/* loaded from: classes.dex */
final class setScrimsShown implements Runnable {
    final /* synthetic */ setButtonTintMode setIconTintList;
    final /* synthetic */ setAutoSizeTextTypeUniformWithConfiguration setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setScrimsShown(setButtonTintMode setbuttontintmode, setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        this.setIconTintList = setbuttontintmode;
        this.setX = setautosizetexttypeuniformwithconfiguration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        setSelectedTabIndicatorColor setselectedtabindicatorcolor;
        setSelectedTabIndicatorColor setselectedtabindicatorcolor2;
        obj = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (obj) {
            setButtonTintMode setbuttontintmode = this.setIconTintList;
            setselectedtabindicatorcolor = setbuttontintmode.setY;
            if (setselectedtabindicatorcolor != null) {
                setselectedtabindicatorcolor2 = setbuttontintmode.setY;
                setselectedtabindicatorcolor2.MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
            }
        }
    }
}