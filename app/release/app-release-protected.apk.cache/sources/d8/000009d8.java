package o;

import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setCheckMarkTintList<T> implements setMapTrackballToArrowKeys<T> {
    private final Object MenuHostHelper$$ExternalSyntheticLambda0 = new Object();
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private int setIconTintList;
    private boolean setLayoutAnimation;
    private Exception setOnLongClickListener;
    private int setUiOptions;
    private final setTitleTextAppearance setX;
    private final int setY;

    public setCheckMarkTintList(int i, setTitleTextAppearance settitletextappearance) {
        this.setY = i;
        this.setX = settitletextappearance;
    }

    private final void MenuHostHelper$$ExternalSyntheticLambda1() {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i2 = this.setIconTintList;
        int i3 = i + i2 + this.setUiOptions;
        int i4 = this.setY;
        if (i3 == i4) {
            if (this.setOnLongClickListener == null) {
                if (this.setLayoutAnimation) {
                    this.setX.setUiOptions();
                    return;
                } else {
                    this.setX.setIconTintList((Object) null);
                    return;
                }
            }
            setTitleTextAppearance settitletextappearance = this.setX;
            settitletextappearance.setIconTintList((Exception) new ExecutionException(i2 + " out of " + i4 + " underlying tasks failed", this.setOnLongClickListener));
        }
    }

    @Override // o.getTrimPathStart
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            this.setUiOptions++;
            this.setLayoutAnimation = true;
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    @Override // o.setAccessibilityDataSensitive
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Exception exc) {
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            this.setIconTintList++;
            this.setOnLongClickListener = exc;
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    @Override // o.CalendarConstraints$1
    public final void setX(T t) {
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1++;
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }
}