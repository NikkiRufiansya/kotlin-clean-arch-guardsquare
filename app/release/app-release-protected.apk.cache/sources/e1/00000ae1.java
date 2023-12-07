package o;

/* loaded from: classes.dex */
public final class setCurrentItem implements setTag<setPivotY> {
    private final nF<setSearchableInfo> MenuHostHelper$$ExternalSyntheticLambda0;
    private final nF<setMaxImageSize> MenuHostHelper$$ExternalSyntheticLambda1;
    private final nF<setChipSpacingHorizontalResource> setIconTintList;
    private final nF<setSearchableInfo> setX;
    private final nF<String> setY;

    public setCurrentItem(nF<setSearchableInfo> nFVar, nF<setSearchableInfo> nFVar2, nF<setChipSpacingHorizontalResource> nFVar3, nF<setMaxImageSize> nFVar4, nF<String> nFVar5) {
        this.setX = nFVar;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = nFVar2;
        this.setIconTintList = nFVar3;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = nFVar4;
        this.setY = nFVar5;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        setSearchableInfo iconTintList = this.setX.setIconTintList();
        setSearchableInfo iconTintList2 = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
        setChipSpacingHorizontalResource iconTintList3 = this.setIconTintList.setIconTintList();
        return new setPivotY(iconTintList, iconTintList2, iconTintList3, this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(), this.setY);
    }
}