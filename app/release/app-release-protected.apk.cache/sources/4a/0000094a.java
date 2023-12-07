package o;

/* loaded from: classes.dex */
final class setAlpha {
    private int setNavigationOnClickListener = 0;
    private int setLayoutAnimation = 0;
    private int setUiOptions = Integer.MIN_VALUE;
    private int MenuHostHelper$$ExternalSyntheticLambda1 = Integer.MIN_VALUE;
    private int MenuHostHelper$$ExternalSyntheticLambda0 = 0;
    private int setY = 0;
    private boolean setIconTintList = false;
    private boolean setX = false;

    public final int setIconTintList() {
        return this.setIconTintList ? this.setLayoutAnimation : this.setNavigationOnClickListener;
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setIconTintList ? this.setNavigationOnClickListener : this.setLayoutAnimation;
    }

    public final void setX(int i, int i2) {
        this.setUiOptions = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
        this.setX = true;
        if (this.setIconTintList) {
            if (i2 != Integer.MIN_VALUE) {
                this.setNavigationOnClickListener = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.setLayoutAnimation = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.setNavigationOnClickListener = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.setLayoutAnimation = i2;
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        this.setX = false;
        if (i != Integer.MIN_VALUE) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            this.setNavigationOnClickListener = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.setY = i2;
            this.setLayoutAnimation = i2;
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        if (z == this.setIconTintList) {
            return;
        }
        this.setIconTintList = z;
        if (!this.setX) {
            this.setNavigationOnClickListener = this.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setLayoutAnimation = this.setY;
        } else if (z) {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i == Integer.MIN_VALUE) {
                i = this.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            this.setNavigationOnClickListener = i;
            int i2 = this.setUiOptions;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.setY;
            }
            this.setLayoutAnimation = i2;
        } else {
            int i3 = this.setUiOptions;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            this.setNavigationOnClickListener = i3;
            int i4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.setY;
            }
            this.setLayoutAnimation = i4;
        }
    }
}