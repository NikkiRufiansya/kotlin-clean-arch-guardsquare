package o;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class setImportantForContentCapture<T> {
    private static Executor MenuHostHelper$$ExternalSyntheticLambda1 = Executors.newCachedThreadPool();
    private final Set<setTitleOptional<T>> MenuHostHelper$$ExternalSyntheticLambda0;
    private volatile setPersistentDrawingCache<T> setIconTintList;
    private final Set<setTitleOptional<Throwable>> setX;
    private final Handler setY;

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(setImportantForContentCapture setimportantforcontentcapture, Throwable th) {
        synchronized (setimportantforcontentcapture) {
            ArrayList<setTitleOptional> arrayList = new ArrayList(setimportantforcontentcapture.setX);
            if (arrayList.isEmpty()) {
                setDrawingCacheEnabled.setIconTintList("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            for (setTitleOptional settitleoptional : arrayList) {
                settitleoptional.MenuHostHelper$$ExternalSyntheticLambda0(th);
            }
        }
    }

    static /* synthetic */ void setIconTintList(setImportantForContentCapture setimportantforcontentcapture, Object obj) {
        synchronized (setimportantforcontentcapture) {
            for (setTitleOptional settitleoptional : new ArrayList(setimportantforcontentcapture.MenuHostHelper$$ExternalSyntheticLambda0)) {
                settitleoptional.MenuHostHelper$$ExternalSyntheticLambda0(obj);
            }
        }
    }

    public setImportantForContentCapture(Callable<setPersistentDrawingCache<T>> callable) {
        this(callable, (byte) 0);
    }

    private setImportantForContentCapture(Callable<setPersistentDrawingCache<T>> callable, byte b) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new LinkedHashSet(1);
        this.setX = new LinkedHashSet(1);
        this.setY = new Handler(Looper.getMainLooper());
        this.setIconTintList = null;
        MenuHostHelper$$ExternalSyntheticLambda1.execute(new setIconTintList(callable));
    }

    public final setImportantForContentCapture<T> setY(setTitleOptional<T> settitleoptional) {
        synchronized (this) {
            if (this.setIconTintList != null && this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                settitleoptional.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.add(settitleoptional);
        }
        return this;
    }

    public final setImportantForContentCapture<T> MenuHostHelper$$ExternalSyntheticLambda1(setTitleOptional<T> settitleoptional) {
        synchronized (this) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.remove(settitleoptional);
        }
        return this;
    }

    public final setImportantForContentCapture<T> setIconTintList(setTitleOptional<Throwable> settitleoptional) {
        synchronized (this) {
            if (this.setIconTintList != null && this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                settitleoptional.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            this.setX.add(settitleoptional);
        }
        return this;
    }

    public final setImportantForContentCapture<T> MenuHostHelper$$ExternalSyntheticLambda0(setTitleOptional<Throwable> settitleoptional) {
        synchronized (this) {
            this.setX.remove(settitleoptional);
        }
        return this;
    }

    /* loaded from: classes.dex */
    class setIconTintList extends FutureTask<setPersistentDrawingCache<T>> {
        setIconTintList(Callable<setPersistentDrawingCache<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected final void done() {
            if (isCancelled()) {
                return;
            }
            try {
                setImportantForContentCapture.setIconTintList(setImportantForContentCapture.this, (setPersistentDrawingCache) get());
            } catch (InterruptedException | ExecutionException e) {
                setImportantForContentCapture.setIconTintList(setImportantForContentCapture.this, new setPersistentDrawingCache(e));
            }
        }
    }

    static /* synthetic */ void setIconTintList(setImportantForContentCapture setimportantforcontentcapture, setPersistentDrawingCache setpersistentdrawingcache) {
        if (setimportantforcontentcapture.setIconTintList != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        setimportantforcontentcapture.setIconTintList = setpersistentdrawingcache;
        setimportantforcontentcapture.setY.post(new Runnable() { // from class: o.setImportantForContentCapture.5
            @Override // java.lang.Runnable
            public final void run() {
                if (setImportantForContentCapture.this.setIconTintList == null) {
                    return;
                }
                setPersistentDrawingCache setpersistentdrawingcache2 = setImportantForContentCapture.this.setIconTintList;
                if (setpersistentdrawingcache2.MenuHostHelper$$ExternalSyntheticLambda1 != 0) {
                    setImportantForContentCapture.setIconTintList(setImportantForContentCapture.this, setpersistentdrawingcache2.MenuHostHelper$$ExternalSyntheticLambda1);
                } else {
                    setImportantForContentCapture.MenuHostHelper$$ExternalSyntheticLambda0(setImportantForContentCapture.this, setpersistentdrawingcache2.MenuHostHelper$$ExternalSyntheticLambda0);
                }
            }
        });
    }
}