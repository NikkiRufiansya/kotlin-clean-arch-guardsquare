package o;

import javax.annotation.Nonnull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class eZ extends AbstractC0153fg {
    private final String setIconTintList;
    private final String setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eZ(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.setX = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.setIconTintList = str2;
    }

    @Override // o.AbstractC0153fg
    @Nonnull
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX;
    }

    @Override // o.AbstractC0153fg
    @Nonnull
    public final String setX() {
        return this.setIconTintList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.setX);
        sb.append(", version=");
        sb.append(this.setIconTintList);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0153fg) {
            AbstractC0153fg abstractC0153fg = (AbstractC0153fg) obj;
            return this.setX.equals(abstractC0153fg.MenuHostHelper$$ExternalSyntheticLambda0()) && this.setIconTintList.equals(abstractC0153fg.setX());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.setX.hashCode() ^ 1000003) * 1000003) ^ this.setIconTintList.hashCode();
    }
}