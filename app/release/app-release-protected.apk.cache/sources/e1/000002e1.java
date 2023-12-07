package o;

/* loaded from: classes.dex */
final class asBinder extends setSelection {
    private final long setIconTintList;
    private final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 setX;
    private final setPaddingRelative setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public asBinder(long j, StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, setPaddingRelative setpaddingrelative) {
        this.setIconTintList = j;
        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.setX = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;
        if (setpaddingrelative == null) {
            throw new NullPointerException("Null event");
        }
        this.setY = setpaddingrelative;
    }

    @Override // o.setSelection
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setIconTintList;
    }

    @Override // o.setSelection
    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 setY() {
        return this.setX;
    }

    @Override // o.setSelection
    public final setPaddingRelative setIconTintList() {
        return this.setY;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedEvent{id=");
        sb.append(this.setIconTintList);
        sb.append(", transportContext=");
        sb.append(this.setX);
        sb.append(", event=");
        sb.append(this.setY);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof setSelection) {
            setSelection setselection = (setSelection) obj;
            return this.setIconTintList == setselection.MenuHostHelper$$ExternalSyntheticLambda0() && this.setX.equals(setselection.setY()) && this.setY.equals(setselection.setIconTintList());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.setIconTintList;
        int i = (int) (j ^ (j >>> 32));
        return ((this.setX.hashCode() ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ this.setY.hashCode();
    }
}