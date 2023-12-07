package o;

import java.util.Objects;

/* loaded from: classes.dex */
public class setAllowStacking {
    public static <T> T setIconTintList(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean setX(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int setX(Object... objArr) {
            return Objects.hash(objArr);
        }
    }
}