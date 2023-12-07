package o;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C0321ni;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.nb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314nb extends ThreadPoolExecutor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0314nb() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C0321ni.setX());
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        nb$MenuHostHelper$$ExternalSyntheticLambda0 nb_menuhosthelper__externalsyntheticlambda0 = new nb$MenuHostHelper$$ExternalSyntheticLambda0((mE) runnable);
        execute(nb_menuhosthelper__externalsyntheticlambda0);
        return nb_menuhosthelper__externalsyntheticlambda0;
    }
}