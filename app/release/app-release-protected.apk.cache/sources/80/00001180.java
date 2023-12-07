package o;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Iterator;
import o.nR;

/* loaded from: classes.dex */
public final class uB {
    private static final String MenuHostHelper$$ExternalSyntheticLambda0;
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda1 = {123, 85, -72, 69, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -31, 21, 0, -6, 25, -28, 19, 0, 0, 34, -37, 9, -6, 10, -7, -4, 4, -13, 51, -39, 13, -16, 2, 39, -17, -10, 10};
    public static final int setX = 197;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0039). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 103
            int r7 = r7 * 15
            int r7 = 27 - r7
            int r6 = r6 * 26
            int r6 = 29 - r6
            byte[] r0 = o.uB.MenuHostHelper$$ExternalSyntheticLambda1
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L1d
            r8 = r7
            r3 = r1
            r4 = 0
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L39
        L1d:
            r3 = 0
        L1e:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2d:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L39:
            int r8 = r8 - r6
            int r8 = r8 + 2
            r6 = r7
            r7 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.uB.a(short, short, byte, java.lang.Object[]):void");
    }

    static {
        Object obj;
        Object obj2;
        try {
            nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            obj = nR.setX(Class.forName("o.oR").getCanonicalName());
        } catch (Throwable th) {
            nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY((Object) th, "");
            obj = nR.setX(new nR.setX(th));
        }
        MenuHostHelper$$ExternalSyntheticLambda0 = (String) (nR.setIconTintList(obj) == null ? obj : "o.oR");
        try {
            nR.setIconTintList seticontintlist3 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            obj2 = nR.setX(Class.forName("o.uB").getCanonicalName());
        } catch (Throwable th2) {
            nR.setIconTintList seticontintlist4 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY((Object) th2, "");
            obj2 = nR.setX(new nR.setX(th2));
        }
        String str = (String) (nR.setIconTintList(obj2) == null ? obj2 : "o.uB");
    }

    public static final <E extends Throwable> E setIconTintList(E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && pN.MenuHostHelper$$ExternalSyntheticLambda0(e2.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (MenuHostHelper$$ExternalSyntheticLambda0(stackTrace[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return e2;
            }
        }
        return e;
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda0(StackTraceElement stackTraceElement) {
        try {
            byte b = MenuHostHelper$$ExternalSyntheticLambda1[16];
            Object[] objArr = new Object[1];
            a((byte) (setX & 3), b, (byte) (b + 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = MenuHostHelper$$ExternalSyntheticLambda1[16];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 + 1), MenuHostHelper$$ExternalSyntheticLambda1[16], objArr2);
            return qR.setX((String) cls.getMethod((String) objArr2[0], null).invoke(stackTraceElement, null), "\b\b\b", false);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final boolean MenuHostHelper$$ExternalSyntheticLambda0(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) stackTraceElement.getMethodName(), (Object) stackTraceElement2.getMethodName()) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) stackTraceElement.getFileName(), (Object) stackTraceElement2.getFileName())) {
            try {
                byte b = MenuHostHelper$$ExternalSyntheticLambda1[16];
                Object[] objArr = new Object[1];
                a((byte) (setX & 3), b, (byte) (b + 1), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                byte b2 = MenuHostHelper$$ExternalSyntheticLambda1[16];
                Object[] objArr2 = new Object[1];
                a(b2, (byte) (b2 + 1), MenuHostHelper$$ExternalSyntheticLambda1[16], objArr2);
                Object invoke = cls.getMethod((String) objArr2[0], null).invoke(stackTraceElement, null);
                try {
                    byte b3 = MenuHostHelper$$ExternalSyntheticLambda1[16];
                    Object[] objArr3 = new Object[1];
                    a((byte) (setX & 3), b3, (byte) (b3 + 1), objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    byte b4 = MenuHostHelper$$ExternalSyntheticLambda1[16];
                    Object[] objArr4 = new Object[1];
                    a(b4, (byte) (b4 + 1), MenuHostHelper$$ExternalSyntheticLambda1[16], objArr4);
                    return pN.MenuHostHelper$$ExternalSyntheticLambda0(invoke, cls2.getMethod((String) objArr4[0], null).invoke(stackTraceElement2, null));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        return false;
    }

    private static final int setIconTintList(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            try {
                byte b = MenuHostHelper$$ExternalSyntheticLambda1[16];
                Object[] objArr = new Object[1];
                a((byte) (setX & 3), b, (byte) (b + 1), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                byte b2 = MenuHostHelper$$ExternalSyntheticLambda1[16];
                Object[] objArr2 = new Object[1];
                a(b2, (byte) (b2 + 1), MenuHostHelper$$ExternalSyntheticLambda1[16], objArr2);
                if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, cls.getMethod((String) objArr2[0], null).invoke(stackTraceElement, null))) {
                    return i;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return -1;
    }

    public static final /* synthetic */ Throwable setIconTintList(Throwable th, oW oWVar) {
        nT nTVar;
        StackTraceElement[] stackTraceElementArr;
        boolean z;
        Throwable cause = th.getCause();
        int i = 0;
        if (cause != null && pN.MenuHostHelper$$ExternalSyntheticLambda0(cause.getClass(), th.getClass())) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (MenuHostHelper$$ExternalSyntheticLambda0(stackTrace[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                byte b = MenuHostHelper$$ExternalSyntheticLambda1[16];
                Object[] objArr = new Object[1];
                a((byte) (setX & 3), b, (byte) (b + 1), objArr);
                nTVar = new nT(th, (Object[]) Array.newInstance(Class.forName((String) objArr[0]), 0));
            } else {
                nTVar = new nT(cause, stackTrace);
            }
        } else {
            byte b2 = MenuHostHelper$$ExternalSyntheticLambda1[16];
            Object[] objArr2 = new Object[1];
            a((byte) (setX & 3), b2, (byte) (b2 + 1), objArr2);
            nTVar = new nT(th, (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 0));
        }
        Throwable th2 = (Throwable) nTVar.MenuHostHelper$$ExternalSyntheticLambda0;
        StackTraceElement[] stackTraceElementArr2 = (StackTraceElement[]) nTVar.setX;
        Throwable y = C0505ud.setY(th2);
        if (y == null || (!(th2 instanceof rK) && !pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) y.getMessage(), (Object) th2.getMessage()))) {
            y = null;
        }
        if (y == null) {
            return th;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        StackTraceElement MenuHostHelper$$ExternalSyntheticLambda12 = oWVar.MenuHostHelper$$ExternalSyntheticLambda1();
        if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
            arrayDeque.add(MenuHostHelper$$ExternalSyntheticLambda12);
        }
        while (true) {
            if (!(oWVar instanceof oW)) {
                oWVar = null;
            }
            if (oWVar == null || (oWVar = oWVar.setY()) == null) {
                break;
            }
            StackTraceElement MenuHostHelper$$ExternalSyntheticLambda13 = oWVar.MenuHostHelper$$ExternalSyntheticLambda1();
            if (MenuHostHelper$$ExternalSyntheticLambda13 != null) {
                arrayDeque.add(MenuHostHelper$$ExternalSyntheticLambda13);
            }
        }
        if (arrayDeque.isEmpty()) {
            return th;
        }
        if (th2 != th) {
            int length2 = stackTraceElementArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    i3 = -1;
                    break;
                } else if (MenuHostHelper$$ExternalSyntheticLambda0(stackTraceElementArr2[i3])) {
                    break;
                } else {
                    i3++;
                }
            }
            int i4 = i3 + 1;
            int length3 = stackTraceElementArr2.length - 1;
            if (i4 <= length3) {
                while (true) {
                    if (MenuHostHelper$$ExternalSyntheticLambda0(stackTraceElementArr2[length3], (StackTraceElement) arrayDeque.getLast())) {
                        arrayDeque.removeLast();
                    }
                    arrayDeque.addFirst(stackTraceElementArr2[length3]);
                    if (length3 == i4) {
                        break;
                    }
                    length3--;
                }
            }
        }
        StringBuilder sb = new StringBuilder("\b\b\b(");
        sb.append("Coroutine boundary");
        arrayDeque.addFirst(new StackTraceElement(sb.toString(), "\b", "\b", -1));
        StackTraceElement[] stackTrace2 = th2.getStackTrace();
        int iconTintList = setIconTintList(stackTrace2, MenuHostHelper$$ExternalSyntheticLambda0);
        if (iconTintList != -1) {
            byte b3 = MenuHostHelper$$ExternalSyntheticLambda1[16];
            Object[] objArr3 = new Object[1];
            a((byte) (setX & 3), b3, (byte) (b3 + 1), objArr3);
            StackTraceElement[] stackTraceElementArr3 = (StackTraceElement[]) Array.newInstance(Class.forName((String) objArr3[0]), arrayDeque.size() + iconTintList);
            for (int i5 = 0; i5 < iconTintList; i5++) {
                stackTraceElementArr3[i5] = stackTrace2[i5];
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                stackTraceElementArr3[i + iconTintList] = it.next();
                i++;
            }
            stackTraceElementArr = stackTraceElementArr3;
        } else {
            byte b4 = MenuHostHelper$$ExternalSyntheticLambda1[16];
            Object[] objArr4 = new Object[1];
            a((byte) (setX & 3), b4, (byte) (b4 + 1), objArr4);
            Object[] array = arrayDeque.toArray((Object[]) Array.newInstance(Class.forName((String) objArr4[0]), 0));
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            stackTraceElementArr = (StackTraceElement[]) array;
        }
        y.setStackTrace(stackTraceElementArr);
        return y;
    }
}