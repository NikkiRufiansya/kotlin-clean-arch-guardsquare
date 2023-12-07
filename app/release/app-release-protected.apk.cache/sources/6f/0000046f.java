package o;

import android.content.Context;
import o.C0024al;

/* renamed from: o.fi */
/* loaded from: classes.dex */
public final class C0155fi {
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda1 = {30, 119, -63, 113, -21, 2, -22, -5, -2, -3, 46, -61, -20, -7, -14, 7, -17, -14, 62, -29, -52, -7, -14, 7, -27, -4};
    public static final int setX = 251;

    /* renamed from: o.fi$setX */
    /* loaded from: classes.dex */
    public interface setX<T> {
        String setY(T t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0021 -> B:23:0x0027). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.Object[] r10) {
        /*
            byte[] r0 = o.C0155fi.MenuHostHelper$$ExternalSyntheticLambda1
            r1 = 23
            byte[] r2 = new byte[r1]
            r3 = 4
            r4 = 97
            r5 = 0
            if (r0 != 0) goto L11
            r4 = 4
            r6 = 97
            r7 = 0
            goto L27
        L11:
            r6 = 0
        L12:
            int r7 = r6 + 1
            byte r8 = (byte) r4
            r2[r6] = r8
            if (r7 != r1) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r5)
            r10[r5] = r0
            return
        L21:
            r6 = r0[r3]
            r9 = r4
            r4 = r3
            r3 = r6
            r6 = r9
        L27:
            int r3 = -r3
            int r4 = r4 + 1
            int r6 = r6 + r3
            int r3 = r6 + (-8)
            r6 = r7
            r9 = r4
            r4 = r3
            r3 = r9
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0155fi.a(java.lang.Object[]):void");
    }

    public static C0024al<?> setIconTintList(String str, String str2) {
        return C0024al.setY(AbstractC0153fg.MenuHostHelper$$ExternalSyntheticLambda1(str, str2), AbstractC0153fg.class);
    }

    public static C0024al<?> setIconTintList(final String str, final setX<Context> setx) {
        C0024al.setX setx2 = new C0024al.setX(AbstractC0153fg.class, new Class[0], (byte) 0);
        setx2.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
        Object[] objArr = new Object[1];
        a(objArr);
        C0024al.setX y = setx2.setY(new C0037ay(Class.forName((String) objArr[0]), 1, 0));
        y.setIconTintList = new InterfaceC0027ao() { // from class: o.fj
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return C0155fi.MenuHostHelper$$ExternalSyntheticLambda1(str, setx, interfaceC0025am);
            }
        };
        return y.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public static /* synthetic */ AbstractC0153fg MenuHostHelper$$ExternalSyntheticLambda1(String str, setX setx, InterfaceC0025am interfaceC0025am) {
        Object[] objArr = new Object[1];
        a(objArr);
        return AbstractC0153fg.MenuHostHelper$$ExternalSyntheticLambda1(str, setx.setY(interfaceC0025am.setY(Class.forName((String) objArr[0]))));
    }
}