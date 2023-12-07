package o;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class setAutofillHints extends setRippleColor {
    public final int setX() {
        int iconTintList = setIconTintList(4);
        if (iconTintList != 0) {
            return this.setIconTintList.getInt(iconTintList + this.setX);
        }
        return 0;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        int iconTintList = setIconTintList(6);
        return (iconTintList == 0 || this.setIconTintList.get(iconTintList + this.setX) == 0) ? false : true;
    }

    public final short MenuHostHelper$$ExternalSyntheticLambda1() {
        int iconTintList = setIconTintList(8);
        if (iconTintList != 0) {
            return this.setIconTintList.getShort(iconTintList + this.setX);
        }
        return (short) 0;
    }

    public final short setUnboundedRipple() {
        int iconTintList = setIconTintList(12);
        if (iconTintList != 0) {
            return this.setIconTintList.getShort(iconTintList + this.setX);
        }
        return (short) 0;
    }

    public final short setY() {
        int iconTintList = setIconTintList(14);
        if (iconTintList != 0) {
            return this.setIconTintList.getShort(iconTintList + this.setX);
        }
        return (short) 0;
    }

    public final int setY(int i) {
        int iconTintList = setIconTintList(16);
        if (iconTintList != 0) {
            return this.setIconTintList.getInt(MenuHostHelper$$ExternalSyntheticLambda1(iconTintList) + (i << 2));
        }
        return 0;
    }

    public final int setIconTintList() {
        int iconTintList = setIconTintList(16);
        if (iconTintList != 0) {
            return setX(iconTintList);
        }
        return 0;
    }

    public final setAutofillHints setY(int i, ByteBuffer byteBuffer) {
        setIconTintList(i, byteBuffer);
        return this;
    }
}