package o;

import android.view.View;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
public abstract class setHighlightColor extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener {
    private boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;

    public abstract boolean MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled);

    public abstract boolean setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled);

    public abstract boolean setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled, int i, int i2, int i3, int i4);

    public abstract boolean setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2, int i, int i2, int i3, int i4);

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener
    public final boolean setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 4) != 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener
    public final boolean setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02) {
        int i = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setX;
        int i2 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setY;
        View view = setcheckediconenabled.setIconTintList;
        int left = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02 == null ? view.getLeft() : windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02.setX;
        int top = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02 == null ? view.getTop() : windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02.setY;
        if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0) && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return setY(setcheckediconenabled, i, i2, left, top);
        }
        return setIconTintList(setcheckediconenabled);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02) {
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 != null && (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setX != windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02.setX || windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setY != windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02.setY)) {
            return setY(setcheckediconenabled, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setX, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setY, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02.setX, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02.setY);
        }
        return MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02) {
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setX != windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02.setX || windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setY != windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02.setY) {
            return setY(setcheckediconenabled, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setX, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setY, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02.setX, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02.setY);
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx = this.setUiOptions;
        if (setx != null) {
            setx.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
            return false;
        }
        return false;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02) {
        int i;
        int i2;
        int i3 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setX;
        int i4 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setY;
        if ((setcheckediconenabled2.MenuHostHelper$$ExternalSyntheticLambda1 & 128) != 0) {
            int i5 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setX;
            i2 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0.setY;
            i = i5;
        } else {
            i = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02.setX;
            i2 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02.setY;
        }
        return setY(setcheckediconenabled, setcheckediconenabled2, i3, i4, i, i2);
    }
}