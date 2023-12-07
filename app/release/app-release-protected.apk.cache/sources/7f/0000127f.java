package o;

import java.net.SocketTimeoutException;
import o.C0603xp;
import o.wF;

/* loaded from: classes.dex */
public final class wF$MenuHostHelper$$ExternalSyntheticLambda1 implements xK {
    public static final int setIconTintList = 51;
    private final C0602xo MenuHostHelper$$ExternalSyntheticLambda0 = new C0602xo();
    private /* synthetic */ wF MenuHostHelper$$ExternalSyntheticLambda1;
    private C0557vz setLayoutAnimation;
    boolean setX;
    boolean setY;

    public wF$MenuHostHelper$$ExternalSyntheticLambda1(wF wFVar, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = wFVar;
        this.setY = z;
    }

    private final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        boolean z2;
        boolean y;
        long min;
        boolean z3;
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1.setIconTintList();
            while (true) {
                z2 = false;
                if (this.MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener < this.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple || this.setY || this.setX || this.MenuHostHelper$$ExternalSyntheticLambda1.setY() != null) {
                    break;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation();
            }
            wF.setIconTintList seticontintlist = this.MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1;
            if (((C0603xp) seticontintlist).setIconTintList) {
                ((C0603xp) seticontintlist).setIconTintList = false;
                C0603xp.setX setx = C0603xp.setX;
                y = C0603xp.setX.setY(seticontintlist);
            } else {
                y = false;
            }
            if (y) {
                throw new SocketTimeoutException("timeout");
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
            min = Math.min(this.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple - this.MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener, this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0);
            this.MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener += min;
            z3 = z && min == this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
            nX nXVar = nX.setX;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1.setIconTintList();
        try {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setX.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1, z3, this.MenuHostHelper$$ExternalSyntheticLambda0, min);
            wF.setIconTintList seticontintlist2 = this.MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1;
            if (((C0603xp) seticontintlist2).setIconTintList) {
                ((C0603xp) seticontintlist2).setIconTintList = false;
                C0603xp.setX setx2 = C0603xp.setX;
                z2 = C0603xp.setX.setY(seticontintlist2);
            }
            if (z2) {
                throw new SocketTimeoutException("timeout");
            }
        } catch (Throwable th) {
            wF.setIconTintList seticontintlist3 = this.MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1;
            if (((C0603xp) seticontintlist3).setIconTintList) {
                ((C0603xp) seticontintlist3).setIconTintList = false;
                C0603xp.setX setx3 = C0603xp.setX;
                z2 = C0603xp.setX.setY(seticontintlist3);
            }
            if (!z2) {
                throw th;
            }
            throw new SocketTimeoutException("timeout");
        }
    }

    @Override // o.xK
    public final xI setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1;
    }

    @Override // o.xK
    public final void a_(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda0.a_(c0602xo, j);
        while (this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 >= 16384) {
            MenuHostHelper$$ExternalSyntheticLambda0(false);
        }
    }

    @Override // o.xK, java.io.Flushable
    public final void flush() {
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
            nX nXVar = nX.setX;
        }
        while (this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
            MenuHostHelper$$ExternalSyntheticLambda0(false);
            this.MenuHostHelper$$ExternalSyntheticLambda1.setX.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    @Override // o.xK, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            if (this.setX) {
                return;
            }
            boolean z2 = this.MenuHostHelper$$ExternalSyntheticLambda1.setY() == null;
            nX nXVar = nX.setX;
            if (!this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions.setY) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
                    while (this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
                        MenuHostHelper$$ExternalSyntheticLambda0(true);
                    }
                } else if (z2) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.setX.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1, true, null, 0L);
                }
            }
            synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                this.setX = true;
                nX nXVar2 = nX.setX;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.setX.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1();
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }
}