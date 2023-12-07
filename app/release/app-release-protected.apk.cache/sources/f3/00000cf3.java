package o;

/* loaded from: classes.dex */
public final class setJustificationMode {
    public final float MenuHostHelper$$ExternalSyntheticLambda0;
    public final setX MenuHostHelper$$ExternalSyntheticLambda1;
    public final int ViewPager$SavedState$1;
    public final int setIconTintList;
    public final boolean setLayoutAnimation;
    public final float setNavigationOnClickListener;
    public final float setOnLongClickListener;
    public final String setUiOptions;
    public final int setUnboundedRipple;
    public final String setX;
    public final float setY;

    /* loaded from: classes.dex */
    public enum setX {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public setJustificationMode(String str, String str2, float f, setX setx, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.setUiOptions = str;
        this.setX = str2;
        this.setOnLongClickListener = f;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setx;
        this.ViewPager$SavedState$1 = i;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = f2;
        this.setY = f3;
        this.setIconTintList = i2;
        this.setUnboundedRipple = i3;
        this.setNavigationOnClickListener = f4;
        this.setLayoutAnimation = z;
    }

    public final int hashCode() {
        int ordinal = this.MenuHostHelper$$ExternalSyntheticLambda1.ordinal();
        int i = this.ViewPager$SavedState$1;
        long floatToRawIntBits = Float.floatToRawIntBits(this.MenuHostHelper$$ExternalSyntheticLambda0);
        return (((((((((int) ((((this.setUiOptions.hashCode() * 31) + this.setX.hashCode()) * 31) + this.setOnLongClickListener)) * 31) + ordinal) * 31) + i) * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.setIconTintList;
    }
}