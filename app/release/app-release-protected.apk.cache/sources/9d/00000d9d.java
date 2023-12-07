package o;

/* loaded from: classes.dex */
public final class setMinWidth<T> extends setBottomEdgeEffectColor<T> {
    private final Integer MenuHostHelper$$ExternalSyntheticLambda0 = null;
    private final isBinderAlive setIconTintList;
    private final T setX;

    public setMinWidth(T t, isBinderAlive isbinderalive) {
        if (t == null) {
            throw new NullPointerException("Null payload");
        }
        this.setX = t;
        if (isbinderalive == null) {
            throw new NullPointerException("Null priority");
        }
        this.setIconTintList = isbinderalive;
    }

    @Override // o.setBottomEdgeEffectColor
    public final Integer setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setBottomEdgeEffectColor
    public final T MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX;
    }

    @Override // o.setBottomEdgeEffectColor
    public final isBinderAlive setY() {
        return this.setIconTintList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event{code=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", payload=");
        sb.append(this.setX);
        sb.append(", priority=");
        sb.append(this.setIconTintList);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof setBottomEdgeEffectColor) {
            setBottomEdgeEffectColor setbottomedgeeffectcolor = (setBottomEdgeEffectColor) obj;
            return setbottomedgeeffectcolor.setX() == null && this.setX.equals(setbottomedgeeffectcolor.MenuHostHelper$$ExternalSyntheticLambda0()) && this.setIconTintList.equals(setbottomedgeeffectcolor.setY());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.setX.hashCode() ^ (-721379959)) * 1000003) ^ this.setIconTintList.hashCode();
    }
}