package o;

import java.util.List;

/* loaded from: classes.dex */
public final class setImageBitmap {
    public final List<setEndIconOnClickListener> MenuHostHelper$$ExternalSyntheticLambda0;
    private final double MenuHostHelper$$ExternalSyntheticLambda1;
    private final char setIconTintList;
    private final String setUnboundedRipple;
    public final double setX;
    private final String setY;

    public setImageBitmap(List<setEndIconOnClickListener> list, char c, double d, double d2, String str, String str2) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = list;
        this.setIconTintList = c;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = d;
        this.setX = d2;
        this.setUnboundedRipple = str;
        this.setY = str2;
    }

    public final int hashCode() {
        char c = this.setIconTintList;
        return (((c * 31) + this.setY.hashCode()) * 31) + this.setUnboundedRipple.hashCode();
    }
}