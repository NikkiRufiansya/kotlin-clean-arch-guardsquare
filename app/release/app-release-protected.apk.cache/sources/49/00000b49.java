package o;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class setEndIconDrawable<T> implements setMapTrackballToArrowKeys<T> {
    private final CountDownLatch setIconTintList = new CountDownLatch(1);

    private setEndIconDrawable() {
    }

    @Override // o.getTrimPathStart
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setIconTintList.countDown();
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(long j, TimeUnit timeUnit) {
        return this.setIconTintList.await(j, timeUnit);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setIconTintList.await();
    }

    @Override // o.setAccessibilityDataSensitive
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Exception exc) {
        this.setIconTintList.countDown();
    }

    @Override // o.CalendarConstraints$1
    public final void setX(T t) {
        this.setIconTintList.countDown();
    }

    public /* synthetic */ setEndIconDrawable(setSystemGestureExclusionRects setsystemgestureexclusionrects) {
    }
}