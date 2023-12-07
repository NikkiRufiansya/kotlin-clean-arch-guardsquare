package o;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class cH {
    private long MenuHostHelper$$ExternalSyntheticLambda1;
    private final C0087cu setIconTintList = C0087cu.setIconTintList();
    private int setX;
    private static final long setY = TimeUnit.HOURS.toMillis(24);
    private static final long MenuHostHelper$$ExternalSyntheticLambda0 = TimeUnit.MINUTES.toMillis(30);

    private static boolean setX(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    public final void setIconTintList(int i) {
        synchronized (this) {
            if (setX(i)) {
                synchronized (this) {
                    this.setX = 0;
                }
                return;
            }
            this.setX++;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.setX() + MenuHostHelper$$ExternalSyntheticLambda1(i);
        }
    }

    private long MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        synchronized (this) {
            if (!(i == 429 || (i >= 500 && i < 600))) {
                return setY;
            }
            return (long) Math.min(Math.pow(2.0d, this.setX) + C0087cu.setX(), MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    public final boolean setIconTintList() {
        boolean z;
        synchronized (this) {
            if (this.setX != 0) {
                z = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.setX() > this.MenuHostHelper$$ExternalSyntheticLambda1;
            }
        }
        return z;
    }
}