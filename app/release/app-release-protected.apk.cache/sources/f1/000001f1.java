package o;

/* loaded from: classes.dex */
final class LottieAnimationView$SavedState$1 extends setChipSpacingHorizontalResource {
    private final int MenuHostHelper$$ExternalSyntheticLambda0;
    private final int MenuHostHelper$$ExternalSyntheticLambda1;
    private final int setIconTintList;
    private final long setUiOptions;
    private final long setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ LottieAnimationView$SavedState$1(long j, int i, int i2, long j2, int i3, byte b) {
        this(j, i, i2, j2, i3);
    }

    private LottieAnimationView$SavedState$1(long j, int i, int i2, long j2, int i3) {
        this.setUiOptions = j;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
        this.setY = j2;
        this.setIconTintList = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setChipSpacingHorizontalResource
    public final long setY() {
        return this.setUiOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setChipSpacingHorizontalResource
    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setChipSpacingHorizontalResource
    public final int setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setChipSpacingHorizontalResource
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setChipSpacingHorizontalResource
    public final int setIconTintList() {
        return this.setIconTintList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.setUiOptions);
        sb.append(", loadBatchSize=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", eventCleanUpAge=");
        sb.append(this.setY);
        sb.append(", maxBlobByteSizePerRow=");
        sb.append(this.setIconTintList);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof setChipSpacingHorizontalResource) {
            setChipSpacingHorizontalResource setchipspacinghorizontalresource = (setChipSpacingHorizontalResource) obj;
            return this.setUiOptions == setchipspacinghorizontalresource.setY() && this.MenuHostHelper$$ExternalSyntheticLambda0 == setchipspacinghorizontalresource.MenuHostHelper$$ExternalSyntheticLambda1() && this.MenuHostHelper$$ExternalSyntheticLambda1 == setchipspacinghorizontalresource.setX() && this.setY == setchipspacinghorizontalresource.MenuHostHelper$$ExternalSyntheticLambda0() && this.setIconTintList == setchipspacinghorizontalresource.setIconTintList();
        }
        return false;
    }

    public final int hashCode() {
        long j = this.setUiOptions;
        int i = (int) (j ^ (j >>> 32));
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        long j2 = this.setY;
        return ((((((i2 ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.setIconTintList;
    }
}