package o;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class setAllowsGoneWidget extends setRippleColor {
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, ByteBuffer byteBuffer) {
        setIconTintList(i, byteBuffer);
    }

    public final int setY() {
        int iconTintList = setIconTintList(4);
        if (iconTintList != 0) {
            return this.setIconTintList.getInt(iconTintList + this.setX);
        }
        return 0;
    }

    public final setAutofillHints MenuHostHelper$$ExternalSyntheticLambda0(setAutofillHints setautofillhints, int i) {
        int iconTintList = setIconTintList(6);
        if (iconTintList != 0) {
            return setautofillhints.setY(MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1(iconTintList) + (i << 2)), this.setIconTintList);
        }
        return null;
    }

    public final int setIconTintList() {
        int iconTintList = setIconTintList(6);
        if (iconTintList != 0) {
            return setX(iconTintList);
        }
        return 0;
    }
}