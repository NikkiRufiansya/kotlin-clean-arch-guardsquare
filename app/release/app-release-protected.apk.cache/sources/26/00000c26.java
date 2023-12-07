package o;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class setHelperTextColor {
    public static final setHelperTextColor MenuHostHelper$$ExternalSyntheticLambda0 = new setHelperTextColor(0, 0, 0, 0);
    public final int MenuHostHelper$$ExternalSyntheticLambda1;
    public final int setIconTintList;
    public final int setX;
    public final int setY;

    private setHelperTextColor(int i, int i2, int i3, int i4) {
        this.setY = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
        this.setX = i3;
        this.setIconTintList = i4;
    }

    public static setHelperTextColor setY(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return new setHelperTextColor(i, i2, i3, i4);
    }

    public static setHelperTextColor setIconTintList(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return new setHelperTextColor(i, i2, i3, i4);
    }

    public static setHelperTextColor setY(setHelperTextColor sethelpertextcolor, setHelperTextColor sethelpertextcolor2) {
        int max = Math.max(sethelpertextcolor.setY, sethelpertextcolor2.setY);
        int max2 = Math.max(sethelpertextcolor.MenuHostHelper$$ExternalSyntheticLambda1, sethelpertextcolor2.MenuHostHelper$$ExternalSyntheticLambda1);
        int max3 = Math.max(sethelpertextcolor.setX, sethelpertextcolor2.setX);
        int max4 = Math.max(sethelpertextcolor.setIconTintList, sethelpertextcolor2.setIconTintList);
        if (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) {
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return new setHelperTextColor(max, max2, max3, max4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setHelperTextColor sethelpertextcolor = (setHelperTextColor) obj;
        return this.setIconTintList == sethelpertextcolor.setIconTintList && this.setY == sethelpertextcolor.setY && this.setX == sethelpertextcolor.setX && this.MenuHostHelper$$ExternalSyntheticLambda1 == sethelpertextcolor.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final int hashCode() {
        int i = this.setY;
        return (((((i * 31) + this.MenuHostHelper$$ExternalSyntheticLambda1) * 31) + this.setX) * 31) + this.setIconTintList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.setY);
        sb.append(", top=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", right=");
        sb.append(this.setX);
        sb.append(", bottom=");
        sb.append(this.setIconTintList);
        sb.append('}');
        return sb.toString();
    }

    public static setHelperTextColor setIconTintList(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return new setHelperTextColor(i, i2, i3, i4);
    }

    /* loaded from: classes.dex */
    public static class setX {
        public static Insets setY(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }
}