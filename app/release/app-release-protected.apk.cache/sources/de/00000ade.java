package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class setCropToPadding {

    /* loaded from: classes.dex */
    public static final class setX<T> {
        final setY<T> MenuHostHelper$$ExternalSyntheticLambda1;
        final T setY;
    }

    public abstract <T> T setIconTintList(setY<T> sety);

    public abstract Map<setY<?>, Object> setY();

    /* loaded from: classes.dex */
    public static final class setY<T> {
        final String setX;

        public setY(String str) {
            pN.setY(str, "");
            this.setX = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof setY) {
                return pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.setX, (Object) ((setY) obj).setX);
            }
            return false;
        }

        public final int hashCode() {
            return this.setX.hashCode();
        }

        public final String toString() {
            return this.setX;
        }
    }

    public final setCropToPadding MenuHostHelper$$ExternalSyntheticLambda0() {
        Map<setY<?>, Object> y = setY();
        pN.setY(y, "");
        return new setRepeatMode(new LinkedHashMap(y), true);
    }
}