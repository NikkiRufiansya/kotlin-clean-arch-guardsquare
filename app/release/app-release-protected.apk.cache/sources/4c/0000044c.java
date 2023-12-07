package o;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
class fK$MenuHostHelper$$ExternalSyntheticLambda1<TResult> implements CalendarConstraints$1<TResult>, setAccessibilityDataSensitive, getTrimPathStart {
    final CountDownLatch setY;

    private fK$MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setY = new CountDownLatch(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ fK$MenuHostHelper$$ExternalSyntheticLambda1(byte b) {
        this();
    }

    @Override // o.CalendarConstraints$1
    public final void setX(TResult tresult) {
        this.setY.countDown();
    }

    @Override // o.setAccessibilityDataSensitive
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Exception exc) {
        this.setY.countDown();
    }

    @Override // o.getTrimPathStart
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setY.countDown();
    }
}