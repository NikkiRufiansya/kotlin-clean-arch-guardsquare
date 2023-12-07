package o;

import o.C0286m;

/* loaded from: classes.dex */
final class setImageLevel extends C0286m.AnonymousClass6 {
    private final attachInterface MenuHostHelper$$ExternalSyntheticLambda0;
    private final setBottomEdgeEffectColor<?> MenuHostHelper$$ExternalSyntheticLambda1;
    private final setChecked<?, byte[]> setIconTintList;
    private final String setX;
    private final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setImageLevel(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, String str, setBottomEdgeEffectColor setbottomedgeeffectcolor, setChecked setchecked, attachInterface attachinterface, byte b) {
        this(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, str, setbottomedgeeffectcolor, setchecked, attachinterface);
    }

    private setImageLevel(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, String str, setBottomEdgeEffectColor<?> setbottomedgeeffectcolor, setChecked<?, byte[]> setchecked, attachInterface attachinterface) {
        this.setY = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;
        this.setX = str;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setbottomedgeeffectcolor;
        this.setIconTintList = setchecked;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = attachinterface;
    }

    @Override // o.C0286m.AnonymousClass6
    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }

    @Override // o.C0286m.AnonymousClass6
    public final String setY() {
        return this.setX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.C0286m.AnonymousClass6
    public final setBottomEdgeEffectColor<?> setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.C0286m.AnonymousClass6
    public final setChecked<?, byte[]> MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setIconTintList;
    }

    @Override // o.C0286m.AnonymousClass6
    public final attachInterface setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendRequest{transportContext=");
        sb.append(this.setY);
        sb.append(", transportName=");
        sb.append(this.setX);
        sb.append(", event=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", transformer=");
        sb.append(this.setIconTintList);
        sb.append(", encoding=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0286m.AnonymousClass6) {
            C0286m.AnonymousClass6 anonymousClass6 = (C0286m.AnonymousClass6) obj;
            return this.setY.equals(anonymousClass6.MenuHostHelper$$ExternalSyntheticLambda0()) && this.setX.equals(anonymousClass6.setY()) && this.MenuHostHelper$$ExternalSyntheticLambda1.equals(anonymousClass6.setX()) && this.setIconTintList.equals(anonymousClass6.MenuHostHelper$$ExternalSyntheticLambda1()) && this.MenuHostHelper$$ExternalSyntheticLambda0.equals(anonymousClass6.setIconTintList());
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.setY.hashCode();
        int hashCode2 = this.setX.hashCode();
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode()) * 1000003) ^ this.setIconTintList.hashCode()) * 1000003) ^ this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode();
    }
}