package o;

import android.view.View;

/* loaded from: classes.dex */
public final class onActivityPrePaused {
    final onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0;
    private setY setX = new setY();

    /* JADX INFO: Access modifiers changed from: package-private */
    public onActivityPrePaused(onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1 onactivityprepaused_menuhosthelper__externalsyntheticlambda1) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = onactivityprepaused_menuhosthelper__externalsyntheticlambda1;
    }

    /* loaded from: classes.dex */
    static class setY {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        int setIconTintList = 0;
        int setX;
        int setY;

        setY() {
        }

        final boolean setY() {
            int i = this.setIconTintList;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.setY;
                int i4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if ((i & (i3 > i4 ? 1 : i3 == i4 ? 2 : 4)) == 0) {
                    return false;
                }
            }
            int i5 = this.setIconTintList;
            if ((i5 & 112) != 0) {
                int i6 = this.setY;
                int i7 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if ((i5 & ((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4)) == 0) {
                    return false;
                }
            }
            int i8 = this.setIconTintList;
            if ((i8 & 1792) != 0) {
                int i9 = this.setX;
                int i10 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if ((i8 & ((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 8)) == 0) {
                    return false;
                }
            }
            int i11 = this.setIconTintList;
            if ((i11 & 28672) != 0) {
                int i12 = this.setX;
                int i13 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (i12 > i13) {
                    i2 = 1;
                } else if (i12 != i13) {
                    i2 = 4;
                }
                if ((i11 & (i2 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public final View setX(int i, int i2, int i3, int i4) {
        int MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
        int x = this.MenuHostHelper$$ExternalSyntheticLambda0.setX();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View iconTintList = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(i);
            int x2 = this.MenuHostHelper$$ExternalSyntheticLambda0.setX(iconTintList);
            int y = this.MenuHostHelper$$ExternalSyntheticLambda0.setY(iconTintList);
            setY sety = this.setX;
            sety.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1;
            sety.MenuHostHelper$$ExternalSyntheticLambda0 = x;
            sety.setY = x2;
            sety.setX = y;
            if (i3 != 0) {
                this.setX.setIconTintList = 0;
                this.setX.setIconTintList |= i3;
                if (this.setX.setY()) {
                    return iconTintList;
                }
            }
            if (i4 != 0) {
                this.setX.setIconTintList = 0;
                this.setX.setIconTintList |= i4;
                if (this.setX.setY()) {
                    view = iconTintList;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        setY sety = this.setX;
        int MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
        int x = this.MenuHostHelper$$ExternalSyntheticLambda0.setX();
        int x2 = this.MenuHostHelper$$ExternalSyntheticLambda0.setX(view);
        int y = this.MenuHostHelper$$ExternalSyntheticLambda0.setY(view);
        sety.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1;
        sety.MenuHostHelper$$ExternalSyntheticLambda0 = x;
        sety.setY = x2;
        sety.setX = y;
        this.setX.setIconTintList = 0;
        this.setX.setIconTintList |= 24579;
        return this.setX.setY();
    }
}