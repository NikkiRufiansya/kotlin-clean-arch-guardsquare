package o;

import android.os.Build;
import android.view.DisplayCutout;
import o.setAllowStacking;

/* loaded from: classes.dex */
public final class setCompoundDrawableTintMode {
    private final DisplayCutout setX;

    private setCompoundDrawableTintMode(DisplayCutout displayCutout) {
        this.setX = displayCutout;
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return setY.setY(this.setX);
        }
        return 0;
    }

    public final int setX() {
        if (Build.VERSION.SDK_INT >= 28) {
            return setY.setX(this.setX);
        }
        return 0;
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.setX.getSafeInsetLeft();
        }
        return 0;
    }

    public final int setIconTintList() {
        if (Build.VERSION.SDK_INT >= 28) {
            return setY.setIconTintList(this.setX);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean x;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x = setAllowStacking.setX.setX(this.setX, ((setCompoundDrawableTintMode) obj).setX);
        return x;
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.setX;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayCutoutCompat{");
        sb.append(this.setX);
        sb.append("}");
        return sb.toString();
    }

    public static setCompoundDrawableTintMode setIconTintList(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new setCompoundDrawableTintMode(displayCutout);
    }

    /* loaded from: classes.dex */
    static class setY {
        static int setY(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        static int setX(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int setIconTintList(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }
    }
}