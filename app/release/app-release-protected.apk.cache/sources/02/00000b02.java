package o;

import java.util.Map;

/* loaded from: classes.dex */
public final class setDragged extends setCompatPressedTranslationZResource {
    private final setSearchableInfo MenuHostHelper$$ExternalSyntheticLambda0;
    private final Map<isBinderAlive, setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1> MenuHostHelper$$ExternalSyntheticLambda1;

    public setDragged(setSearchableInfo setsearchableinfo, Map<isBinderAlive, setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1> map) {
        if (setsearchableinfo == null) {
            throw new NullPointerException("Null clock");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setsearchableinfo;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setCompatPressedTranslationZResource
    public final setSearchableInfo setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setCompatPressedTranslationZResource
    public final Map<isBinderAlive, setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1> setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SchedulerConfig{clock=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", values=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof setCompatPressedTranslationZResource) {
            setCompatPressedTranslationZResource setcompatpressedtranslationzresource = (setCompatPressedTranslationZResource) obj;
            return this.MenuHostHelper$$ExternalSyntheticLambda0.equals(setcompatpressedtranslationzresource.setX()) && this.MenuHostHelper$$ExternalSyntheticLambda1.equals(setcompatpressedtranslationzresource.setIconTintList());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode() ^ 1000003) * 1000003) ^ this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
    }
}