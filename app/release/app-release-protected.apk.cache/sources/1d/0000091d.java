package o;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class setActionBarVisibilityCallback implements setImageURI {
    private final float setY;

    public setActionBarVisibilityCallback(float f) {
        this.setY = f;
    }

    @Override // o.setImageURI
    public final float setY(RectF rectF) {
        return this.setY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setActionBarVisibilityCallback) && this.setY == ((setActionBarVisibilityCallback) obj).setY;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.setY)});
    }
}