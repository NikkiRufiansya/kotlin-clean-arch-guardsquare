package o;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.setHorizontalScrollBarEnabled;

/* renamed from: o.bd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ScheduledFutureC0043bd<V> extends setHorizontalScrollBarEnabled<V> implements ScheduledFuture<V> {
    private final ScheduledFuture<?> setNavigationOnClickListener;

    /* renamed from: o.bd$setIconTintList */
    /* loaded from: classes.dex */
    interface setIconTintList<T> {
        ScheduledFuture<?> setIconTintList(bd$MenuHostHelper$$ExternalSyntheticLambda1<T> bd_menuhosthelper__externalsyntheticlambda1);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.setNavigationOnClickListener.compareTo(delayed);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScheduledFutureC0043bd(setIconTintList<V> seticontintlist) {
        this.setNavigationOnClickListener = seticontintlist.setIconTintList(new bd$MenuHostHelper$$ExternalSyntheticLambda1<V>() { // from class: o.bd.1
            @Override // o.bd$MenuHostHelper$$ExternalSyntheticLambda1
            public final void setIconTintList(V v) {
                ScheduledFutureC0043bd.this.MenuHostHelper$$ExternalSyntheticLambda0((ScheduledFutureC0043bd) v);
            }

            @Override // o.bd$MenuHostHelper$$ExternalSyntheticLambda1
            public final void setX(Throwable th) {
                ScheduledFutureC0043bd.this.setIconTintList(th);
            }
        });
    }

    @Override // o.setHorizontalScrollBarEnabled
    public final void setX() {
        ScheduledFuture<?> scheduledFuture = this.setNavigationOnClickListener;
        Object obj = this.MenuHostHelper$$ExternalSyntheticLambda0;
        scheduledFuture.cancel((obj instanceof setHorizontalScrollBarEnabled.setIconTintList) && ((setHorizontalScrollBarEnabled.setIconTintList) obj).setX);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.setNavigationOnClickListener.getDelay(timeUnit);
    }
}