package o;

import java.util.Set;
import o.setCompatPressedTranslationZResource;

/* loaded from: classes.dex */
final class setIconTintResource extends setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1 {
    private final Set<setCompatPressedTranslationZResource.setIconTintList> setIconTintList;
    private final long setX;
    private final long setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setIconTintResource(long j, long j2, Set set, byte b) {
        this(j, j2, set);
    }

    private setIconTintResource(long j, long j2, Set<setCompatPressedTranslationZResource.setIconTintList> set) {
        this.setY = j;
        this.setX = j2;
        this.setIconTintList = set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1
    public final long setY() {
        return this.setX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1
    public final Set<setCompatPressedTranslationZResource.setIconTintList> MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setIconTintList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigValue{delta=");
        sb.append(this.setY);
        sb.append(", maxAllowedDelay=");
        sb.append(this.setX);
        sb.append(", flags=");
        sb.append(this.setIconTintList);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1) {
            setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1 setcompatpressedtranslationzresource_menuhosthelper__externalsyntheticlambda1 = (setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1) obj;
            return this.setY == setcompatpressedtranslationzresource_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0() && this.setX == setcompatpressedtranslationzresource_menuhosthelper__externalsyntheticlambda1.setY() && this.setIconTintList.equals(setcompatpressedtranslationzresource_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.setY;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.setX;
        return ((((int) ((j2 >>> 32) ^ j2)) ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ this.setIconTintList.hashCode();
    }
}