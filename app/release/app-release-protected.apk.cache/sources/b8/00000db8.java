package o;

/* loaded from: classes.dex */
public final class setNavigationIcon implements getRootAlpha {
    private final int MenuHostHelper$$ExternalSyntheticLambda0;
    public final String MenuHostHelper$$ExternalSyntheticLambda1;
    public final NavigationBarPresenter$SavedState$1 setIconTintList;
    public final boolean setY;

    public setNavigationIcon(String str, int i, NavigationBarPresenter$SavedState$1 navigationBarPresenter$SavedState$1, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.setIconTintList = navigationBarPresenter$SavedState$1;
        this.setY = z;
    }

    @Override // o.getRootAlpha
    public final setContentInsetStartWithNavigation setIconTintList(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable) {
        return new setChipIconTint(setpointericon, setendiconcheckable, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", index=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append('}');
        return sb.toString();
    }
}