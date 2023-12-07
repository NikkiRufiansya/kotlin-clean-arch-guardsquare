package o;

import java.util.List;

/* loaded from: classes.dex */
public class pZ {
    private static void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        throw ((ClassCastException) pN.setY(new ClassCastException(sb.toString()), pZ.class.getName()));
    }

    public static List setX(Object obj) {
        if ((obj instanceof InterfaceC0395qb) && !(obj instanceof InterfaceC0397qd)) {
            MenuHostHelper$$ExternalSyntheticLambda0(obj, "kotlin.collections.MutableList");
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(obj);
    }

    private static List MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) pN.setY(e, pZ.class.getName()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00b9, code lost:
        if (r0 == r4) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object setIconTintList(java.lang.Object r3, int r4) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pZ.setIconTintList(java.lang.Object, int):java.lang.Object");
    }
}