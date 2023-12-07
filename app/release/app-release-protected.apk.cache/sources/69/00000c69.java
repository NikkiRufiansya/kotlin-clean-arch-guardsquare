package o;

import java.util.Set;
import o.setCompatPressedTranslationZResource;
import o.setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1;

/* loaded from: classes.dex */
public final class setIconTintResource$MenuHostHelper$$ExternalSyntheticLambda1 extends setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1.setX {
    private Long MenuHostHelper$$ExternalSyntheticLambda0;
    public Set<setCompatPressedTranslationZResource.setIconTintList> MenuHostHelper$$ExternalSyntheticLambda1;
    private Long setIconTintList;

    @Override // o.setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1.setX
    public final setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1.setX setY(long j) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = Long.valueOf(j);
        return this;
    }

    @Override // o.setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1.setX
    public final setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1.setX setIconTintList() {
        this.setIconTintList = 86400000L;
        return this;
    }

    @Override // o.setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1.setX
    public final setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1.setX setY(Set<setCompatPressedTranslationZResource.setIconTintList> set) {
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = set;
        return this;
    }

    @Override // o.setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1.setX
    public final setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1 setY() {
        String str = this.MenuHostHelper$$ExternalSyntheticLambda0 == null ? " delta" : "";
        if (this.setIconTintList == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" maxAllowedDelay");
            str = sb.toString();
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" flags");
            str = sb2.toString();
        }
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
        return new setIconTintResource(this.MenuHostHelper$$ExternalSyntheticLambda0.longValue(), this.setIconTintList.longValue(), this.MenuHostHelper$$ExternalSyntheticLambda1, (byte) 0);
    }
}