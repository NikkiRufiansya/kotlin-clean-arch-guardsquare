package o;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class setSuffixTextAppearance implements setImageURI {
    private final float MenuHostHelper$$ExternalSyntheticLambda1;

    public setSuffixTextAppearance(float f) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = f;
    }

    @Override // o.setImageURI
    public final float setY(RectF rectF) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1 * rectF.height();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setSuffixTextAppearance) && this.MenuHostHelper$$ExternalSyntheticLambda1 == ((setSuffixTextAppearance) obj).MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda1)});
    }
}