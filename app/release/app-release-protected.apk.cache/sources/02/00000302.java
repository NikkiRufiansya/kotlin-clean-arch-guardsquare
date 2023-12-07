package o;

import java.util.List;

/* loaded from: classes.dex */
final class bP extends AbstractC0074ch {
    private final String setIconTintList;
    private final List<String> setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bP(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.setIconTintList = str;
        this.setX = list;
    }

    @Override // o.AbstractC0074ch
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setIconTintList;
    }

    @Override // o.AbstractC0074ch
    public final List<String> setIconTintList() {
        return this.setX;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{userAgent=");
        sb.append(this.setIconTintList);
        sb.append(", usedDates=");
        sb.append(this.setX);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0074ch) {
            AbstractC0074ch abstractC0074ch = (AbstractC0074ch) obj;
            return this.setIconTintList.equals(abstractC0074ch.MenuHostHelper$$ExternalSyntheticLambda0()) && this.setX.equals(abstractC0074ch.setIconTintList());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.setIconTintList.hashCode() ^ 1000003) * 1000003) ^ this.setX.hashCode();
    }
}