package o;

/* loaded from: classes.dex */
final class setOnItemLongClickListener implements Runnable {
    final /* synthetic */ setImportantForAccessibility MenuHostHelper$$ExternalSyntheticLambda0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnItemLongClickListener(setImportantForAccessibility setimportantforaccessibility) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setimportantforaccessibility;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        getTrimPathStart gettrimpathstart;
        getTrimPathStart gettrimpathstart2;
        obj = this.MenuHostHelper$$ExternalSyntheticLambda0.setX;
        synchronized (obj) {
            setImportantForAccessibility setimportantforaccessibility = this.MenuHostHelper$$ExternalSyntheticLambda0;
            gettrimpathstart = setimportantforaccessibility.MenuHostHelper$$ExternalSyntheticLambda1;
            if (gettrimpathstart != null) {
                gettrimpathstart2 = setimportantforaccessibility.MenuHostHelper$$ExternalSyntheticLambda1;
                gettrimpathstart2.MenuHostHelper$$ExternalSyntheticLambda0();
            }
        }
    }
}