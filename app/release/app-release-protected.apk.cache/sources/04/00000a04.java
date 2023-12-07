package o;

import o.setChildIndicator;

/* loaded from: classes.dex */
class setChildIndicator$MenuHostHelper$$ExternalSyntheticLambda0 extends setTitleMarginTop {
    private static final setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0 setY = new setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: o.setChildIndicator$MenuHostHelper$$ExternalSyntheticLambda0.2
        @Override // o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0
        public final /* synthetic */ setTitleMarginTop setIconTintList(Class cls, setPlaceholderTextColor setplaceholdertextcolor) {
            return setSubtitleTextColor.MenuHostHelper$$ExternalSyntheticLambda1(this, cls, setplaceholdertextcolor);
        }

        @Override // o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0
        public final <T extends setTitleMarginTop> T setIconTintList(Class<T> cls) {
            return new setChildIndicator$MenuHostHelper$$ExternalSyntheticLambda0();
        }
    };
    onAppEnteredBackground<setChildIndicator.setY> setX = new onAppEnteredBackground<>();
    private boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;

    setChildIndicator$MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setChildIndicator$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0(setTabRippleColorResource settabripplecolorresource) {
        return (setChildIndicator$MenuHostHelper$$ExternalSyntheticLambda0) new setEndIconTintMode(settabripplecolorresource, setY).setY(setChildIndicator$MenuHostHelper$$ExternalSyntheticLambda0.class);
    }

    @Override // o.setTitleMarginTop
    public final void setIconTintList() {
        super.setIconTintList();
        if (this.setX.setY() > 0) {
            setChildIndicator.setY y = this.setX.setY(0);
            boolean z = setChildIndicator.setX;
            Object obj = y.setNavigationOnClickListener;
            y.setNavigationOnClickListener.setY = true;
            setOverlayMode setoverlaymode = y.setLayoutAnimation;
            Object obj2 = y.setNavigationOnClickListener.setIconTintList;
            throw new IllegalStateException("No listener register");
        }
        this.setX.setX();
    }
}