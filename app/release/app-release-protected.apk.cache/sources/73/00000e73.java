package o;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class setPasswordVisibilityToggleTintList {
    final long setIconTintList;
    setWindowCallback setX;
    final Executor setY;
    setImageResource MenuHostHelper$$ExternalSyntheticLambda0 = null;
    private final Handler setIconSize = new Handler(Looper.getMainLooper());
    Runnable setLayoutAnimation = null;
    final Object setNavigationOnClickListener = new Object();
    int setOnLongClickListener = 0;
    long setUnboundedRipple = SystemClock.uptimeMillis();
    boolean setUiOptions = false;
    private final Runnable setChipCornerRadius = new Runnable() { // from class: o.setPasswordVisibilityToggleTintList.1
        @Override // java.lang.Runnable
        public final void run() {
            setPasswordVisibilityToggleTintList.this.setY.execute(setPasswordVisibilityToggleTintList.this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
    };
    final Runnable MenuHostHelper$$ExternalSyntheticLambda1 = new Runnable() { // from class: o.setPasswordVisibilityToggleTintList.4
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (setPasswordVisibilityToggleTintList.this.setNavigationOnClickListener) {
                if (SystemClock.uptimeMillis() - setPasswordVisibilityToggleTintList.this.setUnboundedRipple < setPasswordVisibilityToggleTintList.this.setIconTintList) {
                    return;
                }
                if (setPasswordVisibilityToggleTintList.this.setOnLongClickListener != 0) {
                    return;
                }
                if (setPasswordVisibilityToggleTintList.this.setLayoutAnimation != null) {
                    setPasswordVisibilityToggleTintList.this.setLayoutAnimation.run();
                    if (setPasswordVisibilityToggleTintList.this.setX != null && setPasswordVisibilityToggleTintList.this.setX.setNavigationOnClickListener()) {
                        try {
                            setPasswordVisibilityToggleTintList.this.setX.close();
                            setPasswordVisibilityToggleTintList.this.setX = null;
                        } catch (IOException e) {
                            throw e;
                        }
                    }
                    return;
                }
                throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
        }
    };

    public setPasswordVisibilityToggleTintList(long j, TimeUnit timeUnit, Executor executor) {
        this.setIconTintList = timeUnit.toMillis(j);
        this.setY = executor;
    }

    public final <V> V setY(setIndeterminateDrawableTiled<setWindowCallback, V> setindeterminatedrawabletiled) {
        try {
            return setindeterminatedrawabletiled.MenuHostHelper$$ExternalSyntheticLambda1(setX());
        } finally {
            setIconTintList();
        }
    }

    public final setWindowCallback setX() {
        synchronized (this.setNavigationOnClickListener) {
            this.setIconSize.removeCallbacks(this.setChipCornerRadius);
            this.setOnLongClickListener++;
            if (this.setUiOptions) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            setWindowCallback setwindowcallback = this.setX;
            if (setwindowcallback != null && setwindowcallback.setNavigationOnClickListener()) {
                return this.setX;
            }
            setImageResource setimageresource = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setimageresource != null) {
                setWindowCallback MenuHostHelper$$ExternalSyntheticLambda0 = setimageresource.MenuHostHelper$$ExternalSyntheticLambda0();
                this.setX = MenuHostHelper$$ExternalSyntheticLambda0;
                return MenuHostHelper$$ExternalSyntheticLambda0;
            }
            throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        }
    }

    public final void setIconTintList() {
        synchronized (this.setNavigationOnClickListener) {
            int i = this.setOnLongClickListener;
            if (i <= 0) {
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
            }
            int i2 = i - 1;
            this.setOnLongClickListener = i2;
            if (i2 == 0) {
                if (this.setX == null) {
                    return;
                }
                this.setIconSize.postDelayed(this.setChipCornerRadius, this.setIconTintList);
            }
        }
    }

    public final setWindowCallback setY() {
        setWindowCallback setwindowcallback;
        synchronized (this.setNavigationOnClickListener) {
            setwindowcallback = this.setX;
        }
        return setwindowcallback;
    }
}