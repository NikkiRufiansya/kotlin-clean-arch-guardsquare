package o;

import android.util.Log;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public class WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1 {
    int MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    int setNavigationOnClickListener;
    private int setUiOptions;
    boolean setX;
    Interpolator setY;

    public WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1() {
        this(0, 0);
    }

    private WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        this.setNavigationOnClickListener = -1;
        this.setX = false;
        this.setUiOptions = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        this.setIconTintList = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = Integer.MIN_VALUE;
        this.setY = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) {
        int i = this.setNavigationOnClickListener;
        if (i >= 0) {
            this.setNavigationOnClickListener = -1;
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setX(i);
            this.setX = false;
        } else if (this.setX) {
            MenuHostHelper$$ExternalSyntheticLambda0();
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setSelectedChildViewEnabled.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY);
            int i2 = this.setUiOptions + 1;
            this.setUiOptions = i2;
            if (i2 > 10) {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            this.setX = false;
        } else {
            this.setUiOptions = 0;
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setY != null && this.MenuHostHelper$$ExternalSyntheticLambda1 <= 0) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 <= 0) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
    }
}