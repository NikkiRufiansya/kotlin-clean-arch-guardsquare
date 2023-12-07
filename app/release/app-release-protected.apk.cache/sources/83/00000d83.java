package o;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class setMenuCallbacks extends setFillAlpha {
    private static volatile setMenuCallbacks MenuHostHelper$$ExternalSyntheticLambda0;
    private static final Executor MenuHostHelper$$ExternalSyntheticLambda1;
    setFillAlpha setX;
    private setFillAlpha setY;

    static {
        new Executor() { // from class: o.setMenuCallbacks.4
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                setMenuCallbacks.setY().setX.setIconTintList(runnable);
            }
        };
        MenuHostHelper$$ExternalSyntheticLambda1 = new Executor() { // from class: o.setMenuCallbacks.5
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                setMenuCallbacks.setY().setX.MenuHostHelper$$ExternalSyntheticLambda0(runnable);
            }
        };
    }

    private setMenuCallbacks() {
        setChipMinHeightResource setchipminheightresource = new setChipMinHeightResource();
        this.setY = setchipminheightresource;
        this.setX = setchipminheightresource;
    }

    public static setMenuCallbacks setY() {
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        synchronized (setMenuCallbacks.class) {
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                MenuHostHelper$$ExternalSyntheticLambda0 = new setMenuCallbacks();
            }
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setFillAlpha
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Runnable runnable) {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(runnable);
    }

    @Override // o.setFillAlpha
    public final void setIconTintList(Runnable runnable) {
        this.setX.setIconTintList(runnable);
    }

    public static Executor setX() {
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.setFillAlpha
    public final boolean setIconTintList() {
        return this.setX.setIconTintList();
    }
}