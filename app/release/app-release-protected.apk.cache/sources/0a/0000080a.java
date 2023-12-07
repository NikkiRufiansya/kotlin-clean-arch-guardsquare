package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public class pN {
    private static byte[] setY = {42, -48, 107, -19, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -4, 13, -35, 31, -21, 0, 6, -25, 28, -19, 0, 0, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 31, -21, 0, 6, -25, 28, -19, 0, 0, -34, 37, -9, 6, -10, 7, 4, -4, 13, -51, 39, -13, 16, -2, -39, 17, 10, -10};
    public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 89;

    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0021 -> B:23:0x0023). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 12
            int r7 = 106 - r7
            int r6 = 69 - r6
            byte[] r0 = o.pN.setY
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r5 = 0
            r3 = r7
            r7 = r6
            goto L23
        L11:
            r3 = 0
        L12:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r6]
        L23:
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + 2
            r3 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pN.a(byte, byte, short, java.lang.Object[]):void");
    }

    private pN() {
    }

    public static String MenuHostHelper$$ExternalSyntheticLambda0(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static void setY() {
        throw ((nL) MenuHostHelper$$ExternalSyntheticLambda1(new nL()));
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        StringBuilder sb = new StringBuilder("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        throw ((nZ) setY(new nZ(sb.toString()), pN.class.getName()));
    }

    public static void setIconTintList(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw ((IllegalStateException) setY(new IllegalStateException(sb.toString()), pN.class.getName()));
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw ((NullPointerException) setY(new NullPointerException(sb.toString()), pN.class.getName()));
    }

    private static String setX(String str) {
        try {
            Object[] objArr = new Object[1];
            a((byte) (setY[0] - 1), setY[21], setY[9], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((byte) (MenuHostHelper$$ExternalSyntheticLambda0 & 487), setY[8], setY[15], objArr2);
            Object invoke = cls.getMethod((String) objArr2[0], null).invoke(null, null);
            try {
                Object[] objArr3 = new Object[1];
                a((byte) (setY[0] - 1), setY[21], setY[9], objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a((byte) (-setY[31]), (byte) (setY[9] - 1), setY[15], objArr4);
                StackTraceElement stackTraceElement = ((StackTraceElement[]) cls2.getMethod((String) objArr4[0], null).invoke(invoke, null))[4];
                try {
                    Object[] objArr5 = new Object[1];
                    a((byte) 26, setY[21], (byte) (-setY[7]), objArr5);
                    Class<?> cls3 = Class.forName((String) objArr5[0]);
                    byte b = setY[21];
                    Object[] objArr6 = new Object[1];
                    a(b, (byte) (b + 3), setY[21], objArr6);
                    String str2 = (String) cls3.getMethod((String) objArr6[0], null).invoke(stackTraceElement, null);
                    String methodName = stackTraceElement.getMethodName();
                    StringBuilder sb = new StringBuilder("Parameter specified as non-null is null: method ");
                    sb.append(str2);
                    sb.append(".");
                    sb.append(methodName);
                    sb.append(", parameter ");
                    sb.append(str);
                    return sb.toString();
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
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static <T extends Throwable> T MenuHostHelper$$ExternalSyntheticLambda1(T t) {
        return (T) setY((Throwable) t, pN.class.getName());
    }

    public static <T extends Throwable> T setY(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            try {
                Object[] objArr = new Object[1];
                a((byte) 26, setY[21], (byte) (-setY[7]), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                byte b = setY[21];
                Object[] objArr2 = new Object[1];
                a(b, (byte) (b + 3), setY[21], objArr2);
                if (str.equals(cls.getMethod((String) objArr2[0], null).invoke(stackTraceElement, null))) {
                    i = i2;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void setX(Object obj) {
        if (obj == null) {
            throw ((NullPointerException) setY(new NullPointerException(), pN.class.getName()));
        }
    }

    public static void setY(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) setY(new NullPointerException(setX(str)), pN.class.getName()));
        }
    }

    public static void setX(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalArgumentException) setY(new IllegalArgumentException(setX(str)), pN.class.getName()));
        }
    }
}