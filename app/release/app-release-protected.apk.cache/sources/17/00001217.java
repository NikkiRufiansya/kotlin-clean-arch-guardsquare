package o;

/* loaded from: classes.dex */
final class valueOf implements Runnable {
    final /* synthetic */ setAutoSizeTextTypeUniformWithConfiguration MenuHostHelper$$ExternalSyntheticLambda0;
    final /* synthetic */ setCloseIconEndPaddingResource setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public valueOf(setCloseIconEndPaddingResource setcloseiconendpaddingresource, setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        this.setX = setcloseiconendpaddingresource;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setautosizetexttypeuniformwithconfiguration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        CalendarConstraints$1 calendarConstraints$1;
        CalendarConstraints$1 calendarConstraints$12;
        obj = this.setX.MenuHostHelper$$ExternalSyntheticLambda1;
        synchronized (obj) {
            setCloseIconEndPaddingResource setcloseiconendpaddingresource = this.setX;
            calendarConstraints$1 = setcloseiconendpaddingresource.setY;
            if (calendarConstraints$1 != null) {
                calendarConstraints$12 = setcloseiconendpaddingresource.setY;
                calendarConstraints$12.setX(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1());
            }
        }
    }
}