package o;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.vq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547vq {
    public static final int setY = 155;
    private ExecutorService setIconTintList;
    private Runnable setUnboundedRipple;
    private int setLayoutAnimation = 64;
    private int setNavigationOnClickListener = 5;
    public final ArrayDeque<vZ$MenuHostHelper$$ExternalSyntheticLambda1> MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayDeque<>();
    public final ArrayDeque<vZ$MenuHostHelper$$ExternalSyntheticLambda1> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayDeque<>();
    public final ArrayDeque<vZ> setX = new ArrayDeque<>();

    private ExecutorService setIconTintList() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.setIconTintList == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                StringBuilder sb = new StringBuilder();
                sb.append(vL.setNavigationOnClickListener);
                sb.append(" Dispatcher");
                this.setIconTintList = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, vL.setIconTintList(sb.toString(), false));
            }
            executorService = this.setIconTintList;
            pN.setX(executorService);
        }
        return executorService;
    }

    public final <T> void setX(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            nX nXVar = nX.setX;
        }
        setX();
    }

    private int setY() {
        int size;
        int size2;
        synchronized (this) {
            size = this.MenuHostHelper$$ExternalSyntheticLambda1.size();
            size2 = this.setX.size();
        }
        return size + size2;
    }

    public final boolean setX() {
        int i;
        boolean z;
        boolean z2 = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<vZ$MenuHostHelper$$ExternalSyntheticLambda1> it = this.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) it, "");
            while (it.hasNext()) {
                vZ$MenuHostHelper$$ExternalSyntheticLambda1 next = it.next();
                if (this.MenuHostHelper$$ExternalSyntheticLambda1.size() >= this.setLayoutAnimation) {
                    break;
                } else if (next.MenuHostHelper$$ExternalSyntheticLambda1.get() < this.setNavigationOnClickListener) {
                    it.remove();
                    next.MenuHostHelper$$ExternalSyntheticLambda1.incrementAndGet();
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) next, "");
                    arrayList.add(next);
                    this.MenuHostHelper$$ExternalSyntheticLambda1.add(next);
                }
            }
            z = setY() > 0;
            nX nXVar = nX.setX;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            vZ$MenuHostHelper$$ExternalSyntheticLambda1 vz_menuhosthelper__externalsyntheticlambda1 = (vZ$MenuHostHelper$$ExternalSyntheticLambda1) arrayList.get(i);
            ExecutorService iconTintList = setIconTintList();
            pN.setY(iconTintList, "");
            C0547vq c0547vq = vz_menuhosthelper__externalsyntheticlambda1.setY.setIconTintList.setOnLongClickListener;
            boolean z3 = vL.MenuHostHelper$$ExternalSyntheticLambda0;
            try {
                try {
                    iconTintList.execute(vz_menuhosthelper__externalsyntheticlambda1);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    vz_menuhosthelper__externalsyntheticlambda1.setY.MenuHostHelper$$ExternalSyntheticLambda0(interruptedIOException);
                    vz_menuhosthelper__externalsyntheticlambda1.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(vz_menuhosthelper__externalsyntheticlambda1.setY, interruptedIOException);
                    C0547vq c0547vq2 = vz_menuhosthelper__externalsyntheticlambda1.setY.setIconTintList.setOnLongClickListener;
                    pN.setY(vz_menuhosthelper__externalsyntheticlambda1, "");
                    vz_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1.decrementAndGet();
                    c0547vq2.setX(c0547vq2.MenuHostHelper$$ExternalSyntheticLambda1, vz_menuhosthelper__externalsyntheticlambda1);
                }
            } catch (Throwable th) {
                C0547vq c0547vq3 = vz_menuhosthelper__externalsyntheticlambda1.setY.setIconTintList.setOnLongClickListener;
                pN.setY(vz_menuhosthelper__externalsyntheticlambda1, "");
                vz_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1.decrementAndGet();
                c0547vq3.setX(c0547vq3.MenuHostHelper$$ExternalSyntheticLambda1, vz_menuhosthelper__externalsyntheticlambda1);
                throw th;
            }
        }
        return z;
    }
}