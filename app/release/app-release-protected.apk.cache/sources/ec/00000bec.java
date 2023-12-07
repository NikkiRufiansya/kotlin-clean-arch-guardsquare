package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
class setForceShowIcon extends PopupWindow {
    private static final boolean setY = false;
    private boolean MenuHostHelper$$ExternalSyntheticLambda1;

    public setForceShowIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setY(context, attributeSet, i, 0);
    }

    public setForceShowIcon(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setY(context, attributeSet, i, i2);
    }

    private void setY(Context context, AttributeSet attributeSet, int i, int i2) {
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(context, attributeSet, setAnimationFromJson.setY.setFillAlpha, i, i2);
        if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(setAnimationFromJson.setY.AbtRegistrar)) {
            MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setAnimationFromJson.setY.AbtRegistrar, setY));
        }
        setBackgroundDrawable(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setScrimVisibleHeightTrigger));
        MenuHostHelper$$ExternalSyntheticLambda0.setX();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (setY && this.MenuHostHelper$$ExternalSyntheticLambda1) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (setY && this.MenuHostHelper$$ExternalSyntheticLambda1) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (setY && this.MenuHostHelper$$ExternalSyntheticLambda1) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        if (setY) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
        } else {
            setRightEdgeEffectColor.setIconTintList(this, z);
        }
    }
}