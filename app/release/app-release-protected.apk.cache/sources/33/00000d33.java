package o;

/* loaded from: classes.dex */
public final class setLinksClickable extends setAllowClickWhenDisabled {
    private NavigationBarView$SavedState$1 setIconTintList;
    public setItemRippleColor setX;
    private setRating setY;

    public setLinksClickable() {
        NavigationBarView$SavedState$1 navigationBarView$SavedState$1 = new NavigationBarView$SavedState$1();
        this.setIconTintList = navigationBarView$SavedState$1;
        this.setX = navigationBarView$SavedState$1;
    }

    public final void setIconTintList(float f, float f2, float f3, float f4, float f5, float f6) {
        NavigationBarView$SavedState$1 navigationBarView$SavedState$1 = this.setIconTintList;
        this.setX = navigationBarView$SavedState$1;
        navigationBarView$SavedState$1.setX = false;
        navigationBarView$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 = f;
        boolean z = f > f2;
        navigationBarView$SavedState$1.setIconTintList = z;
        if (z) {
            navigationBarView$SavedState$1.setIconTintList(-f3, f - f2, f5, f6, f4);
        } else {
            navigationBarView$SavedState$1.setIconTintList(f3, f2 - f, f5, f6, f4);
        }
    }

    public final void setIconTintList(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.setY == null) {
            this.setY = new setRating();
        }
        setRating setrating = this.setY;
        this.setX = setrating;
        setrating.setOnLongClickListener = f2;
        setrating.setX = f6;
        setrating.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        setrating.setNavigationOnClickListener = f;
        setrating.setY = f3;
        setrating.setLayoutAnimation = f5;
        setrating.setUiOptions = f4;
        setrating.setUnboundedRipple = f7;
        setrating.setIconTintList = i;
        setrating.MenuHostHelper$$ExternalSyntheticLambda0 = 0.0f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.setX.setIconTintList(f);
    }

    @Override // o.setAllowClickWhenDisabled
    public final float MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setX.setY();
    }
}