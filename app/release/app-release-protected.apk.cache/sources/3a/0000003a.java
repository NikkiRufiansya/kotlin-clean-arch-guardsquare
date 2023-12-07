package androidx.core.view;

import android.os.Build;
import androidx.core.view.WindowInsetsCompat;
import o.setHelperTextColor;

/* loaded from: classes.dex */
public final class WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1 {
    private final WindowInsetsCompat.setY setY;

    public WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.setY = new WindowInsetsCompat.setLayoutAnimation();
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.setY = new WindowInsetsCompat.setIconTintList();
        } else {
            this.setY = new WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    public WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat windowInsetsCompat) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.setY = new WindowInsetsCompat.setLayoutAnimation(windowInsetsCompat);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.setY = new WindowInsetsCompat.setIconTintList(windowInsetsCompat);
        } else {
            this.setY = new WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda0(windowInsetsCompat);
        }
    }

    @Deprecated
    public final WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1 setX(setHelperTextColor sethelpertextcolor) {
        this.setY.setX(sethelpertextcolor);
        return this;
    }

    @Deprecated
    public final WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1 setY(setHelperTextColor sethelpertextcolor) {
        this.setY.setY(sethelpertextcolor);
        return this;
    }

    public final WindowInsetsCompat setIconTintList() {
        return this.setY.MenuHostHelper$$ExternalSyntheticLambda0();
    }
}