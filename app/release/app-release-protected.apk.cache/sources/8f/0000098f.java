package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class setBoxBackgroundColorStateList {
    final setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1 = new setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0();
    public final List<View> setX = new ArrayList();
    public final setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setBoxBackgroundColorStateList(setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda1) {
        this.setY = setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(View view, int i, boolean z) {
        int iconTintList;
        if (i < 0) {
            iconTintList = this.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        } else {
            iconTintList = setIconTintList(i);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList, z);
        if (z) {
            this.setX.add(view);
            this.setY.setIconTintList(view);
        }
        this.setY.setX(view, iconTintList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int setIconTintList(int i) {
        if (i < 0) {
            return -1;
        }
        int MenuHostHelper$$ExternalSyntheticLambda0 = this.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        int i2 = i;
        while (i2 < MenuHostHelper$$ExternalSyntheticLambda0) {
            int iconTintList = i - (i2 - this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(i2));
            if (iconTintList == 0) {
                while (this.MenuHostHelper$$ExternalSyntheticLambda1.setX(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iconTintList;
        }
        return -1;
    }

    public final void setX(View view) {
        int MenuHostHelper$$ExternalSyntheticLambda1 = this.setY.MenuHostHelper$$ExternalSyntheticLambda1(view);
        if (MenuHostHelper$$ExternalSyntheticLambda1 < 0) {
            return;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setY(MenuHostHelper$$ExternalSyntheticLambda1) && this.setX.remove(view)) {
            this.setY.setY(view);
        }
        this.setY.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        int iconTintList = setIconTintList(i);
        View MenuHostHelper$$ExternalSyntheticLambda1 = this.setY.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            return;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setY(iconTintList) && this.setX.remove(MenuHostHelper$$ExternalSyntheticLambda1)) {
            this.setY.setY(MenuHostHelper$$ExternalSyntheticLambda1);
        }
        this.setY.setIconTintList(iconTintList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iconTintList;
        if (i < 0) {
            iconTintList = this.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        } else {
            iconTintList = setIconTintList(i);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList, z);
        if (z) {
            this.setX.add(view);
            this.setY.setIconTintList(view);
        }
        this.setY.setX(view, iconTintList, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int setIconTintList(View view) {
        int MenuHostHelper$$ExternalSyntheticLambda1 = this.setY.MenuHostHelper$$ExternalSyntheticLambda1(view);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == -1 || this.MenuHostHelper$$ExternalSyntheticLambda1.setX(MenuHostHelper$$ExternalSyntheticLambda1)) {
            return -1;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1 - this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1.toString());
        sb.append(", hidden list:");
        sb.append(this.setX.size());
        return sb.toString();
    }
}