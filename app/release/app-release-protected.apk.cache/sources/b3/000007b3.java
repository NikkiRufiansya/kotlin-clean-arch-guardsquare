package o;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class oT {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int MenuHostHelper$$ExternalSyntheticLambda1(oR oRVar) {
        try {
            Field declaredField = oRVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(oRVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (-1) + (num != null ? num.intValue() : 0);
        } catch (Exception unused) {
            return -1;
        }
    }
}