package o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: o.sb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0449sb extends AbstractC0462so implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    private static final long setOnLongClickListener;
    public static final RunnableC0449sb setY;

    private RunnableC0449sb() {
    }

    static {
        Long l;
        RunnableC0449sb runnableC0449sb = new RunnableC0449sb();
        setY = runnableC0449sb;
        RunnableC0449sb runnableC0449sb2 = runnableC0449sb;
        runnableC0449sb2.setLayoutAnimation++;
        runnableC0449sb2.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        setOnLongClickListener = timeUnit.toNanos(l.longValue());
    }

    @Override // o.AbstractC0464sq
    protected final Thread setY() {
        Thread thread = _thread;
        return thread == null ? setChipCornerRadius() : thread;
    }

    @Override // o.AbstractC0462so, o.AbstractC0463sp
    public final void setIconTintList() {
        debugStatus = 4;
        super.setIconTintList();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean MenuHostHelper$$ExternalSyntheticLambda1;
        Thread thread;
        sT sTVar = sT.MenuHostHelper$$ExternalSyntheticLambda1;
        sT.setY(this);
        try {
            if (!setTextAlignment()) {
                if (MenuHostHelper$$ExternalSyntheticLambda1) {
                    return;
                }
                if (thread == null) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
                if (MenuHostHelper$$ExternalSyntheticLambda0 == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = setOnLongClickListener + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        setOnLongClickListener();
                        if (MenuHostHelper$$ExternalSyntheticLambda1() || _thread != null) {
                            return;
                        }
                        setChipCornerRadius();
                        return;
                    } else if (MenuHostHelper$$ExternalSyntheticLambda0 > j2) {
                        MenuHostHelper$$ExternalSyntheticLambda0 = j2;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
                    int i = debugStatus;
                    if (i == 2 || i == 3) {
                        _thread = null;
                        setOnLongClickListener();
                        if (MenuHostHelper$$ExternalSyntheticLambda1() || _thread != null) {
                            return;
                        }
                        setChipCornerRadius();
                        return;
                    }
                    LockSupport.parkNanos(this, MenuHostHelper$$ExternalSyntheticLambda0);
                }
            }
        } finally {
            _thread = null;
            setOnLongClickListener();
            if (!MenuHostHelper$$ExternalSyntheticLambda1() && _thread == null) {
                setChipCornerRadius();
            }
        }
    }

    private final Thread setChipCornerRadius() {
        Thread thread;
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    private final void setOnLongClickListener() {
        synchronized (this) {
            int i = debugStatus;
            if (i == 2 || i == 3) {
                debugStatus = 3;
                setNavigationOnClickListener();
                notifyAll();
            }
        }
    }

    private final boolean setTextAlignment() {
        synchronized (this) {
            int i = debugStatus;
            if (i == 2 || i == 3) {
                return false;
            }
            debugStatus = 1;
            notifyAll();
            return true;
        }
    }

    @Override // o.AbstractC0462so
    public final void setIconTintList(Runnable runnable) {
        if (!(debugStatus == 4)) {
            super.setIconTintList(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // o.AbstractC0464sq
    protected final void setIconTintList(long j, so$MenuHostHelper$$ExternalSyntheticLambda1 so_menuhosthelper__externalsyntheticlambda1) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}