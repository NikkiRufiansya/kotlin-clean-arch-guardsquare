package o;

import o.setPlaceholderTextColor;

/* loaded from: classes.dex */
public final class setChipIconSize extends setPlaceholderTextColor {
    public setChipIconSize() {
        this((byte) 0);
    }

    private /* synthetic */ setChipIconSize(byte b) {
        this(setPlaceholderTextColor.setX.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    public setChipIconSize(setPlaceholderTextColor setplaceholdertextcolor) {
        pN.setY(setplaceholdertextcolor, "");
        this.setX.putAll(setplaceholdertextcolor.setX);
    }

    @Override // o.setPlaceholderTextColor
    public final <T> T setIconTintList(setPlaceholderTextColor.setY<T> sety) {
        pN.setY(sety, "");
        return (T) this.setX.get(sety);
    }
}