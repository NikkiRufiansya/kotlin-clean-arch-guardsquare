package androidx.recyclerview.widget;

import android.view.View;
import o.setOnHoverListener;

/* loaded from: classes.dex */
class LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 {
    setOnHoverListener MenuHostHelper$$ExternalSyntheticLambda1;
    int MenuHostHelper$$ExternalSyntheticLambda0 = -1;
    int setX = Integer.MIN_VALUE;
    boolean setY = false;
    boolean setIconTintList = false;

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", mCoordinate=");
        sb.append(this.setX);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.setY);
        sb.append(", mValid=");
        sb.append(this.setIconTintList);
        sb.append('}');
        return sb.toString();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i) {
        setOnHoverListener setonhoverlistener = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int unboundedRipple = Integer.MIN_VALUE == setonhoverlistener.setY ? 0 : setonhoverlistener.setUnboundedRipple() - setonhoverlistener.setY;
        if (unboundedRipple >= 0) {
            setX(view, i);
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        if (this.setY) {
            int iconTintList = (this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList() - unboundedRipple) - this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(view);
            this.setX = this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList() - iconTintList;
            if (iconTintList > 0) {
                int MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(view);
                int i2 = this.setX;
                int layoutAnimation = this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation();
                int min = (i2 - MenuHostHelper$$ExternalSyntheticLambda1) - (layoutAnimation + Math.min(this.MenuHostHelper$$ExternalSyntheticLambda1.setY(view) - layoutAnimation, 0));
                if (min < 0) {
                    this.setX += Math.min(iconTintList, -min);
                    return;
                }
                return;
            }
            return;
        }
        int y = this.MenuHostHelper$$ExternalSyntheticLambda1.setY(view);
        int layoutAnimation2 = y - this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation();
        this.setX = y;
        if (layoutAnimation2 > 0) {
            int iconTintList2 = (this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList() - Math.min(0, (this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList() - unboundedRipple) - this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(view))) - (y + this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(view));
            if (iconTintList2 < 0) {
                this.setX -= Math.min(layoutAnimation2, -iconTintList2);
            }
        }
    }

    public final void setX(View view, int i) {
        if (this.setY) {
            int MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(view);
            setOnHoverListener setonhoverlistener = this.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setX = MenuHostHelper$$ExternalSyntheticLambda0 + (Integer.MIN_VALUE == setonhoverlistener.setY ? 0 : setonhoverlistener.setUnboundedRipple() - setonhoverlistener.setY);
        } else {
            this.setX = this.MenuHostHelper$$ExternalSyntheticLambda1.setY(view);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }
}