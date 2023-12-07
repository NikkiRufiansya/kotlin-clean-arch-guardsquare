package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import o.C0257jc;
import o.hY;

/* loaded from: classes.dex */
public abstract class hY implements Iterable<Byte>, Serializable {
    private int setIconTintList = 0;
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda1 = {97, -108, 86, -98, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 83;
    public static final hY setY = new setLayoutAnimation(C0243ip.setX);

    /* loaded from: classes.dex */
    public interface setY extends Iterator<Byte> {
        byte setIconTintList();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:23:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r7 = 16 - r7
            byte[] r0 = o.hY.MenuHostHelper$$ExternalSyntheticLambda1
            int r8 = r8 + 105
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L32
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L32:
            int r9 = r9 - r7
            int r7 = r9 + 2
            int r6 = r6 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hY.a(byte, int, short, java.lang.Object[]):void");
    }

    static /* synthetic */ int setIconTintList(byte b) {
        return b & 255;
    }

    public abstract hY MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2);

    public abstract boolean MenuHostHelper$$ExternalSyntheticLambda0();

    protected abstract String MenuHostHelper$$ExternalSyntheticLambda1(Charset charset);

    protected abstract int setIconTintList(int i, int i2);

    protected abstract void setIconTintList(byte[] bArr, int i);

    public abstract byte setX(int i);

    public abstract int setX();

    abstract byte setY(int i);

    public abstract void setY(hZ hZVar);

    static {
        if (hV.setX()) {
            new setNavigationOnClickListener((byte) 0);
        } else {
            new setIconTintList((byte) 0);
        }
        new Comparator<hY>() { // from class: o.hY.1
            public static final byte[] $$g = {95, 85, -94, 50};
            public static final int $$h = 19;
            public static final byte[] $$d = {90, -83, 93, -67, -65, 63, 1, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -48, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 72, -40, -42, 79, -14, 15, -27};
            public static final int $$e = 243;
            public static final byte[] $$a = {116, 44, -28, -115, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
            public static final int $$b = 243;
            private static byte[] MenuHostHelper$$ExternalSyntheticLambda1 = {77, -56, -115, -110, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
            public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 44;
            private static char setY = 56908;
            private static long setIconTintList = 369143787101356136L;
            private static int setX = -1287463348;

            private static void a(int i, byte b, int i2, Object[] objArr) {
                int i3 = 18 - (b * 14);
                int i4 = 115 - (i2 * 38);
                int i5 = 40 - (i * 25);
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i5];
                int i6 = -1;
                int i7 = i5 - 1;
                if (bArr == null) {
                    i3++;
                    i4 = (i3 + i4) - 13;
                }
                while (true) {
                    int i8 = i4;
                    int i9 = i3;
                    i6++;
                    bArr2[i6] = (byte) i8;
                    if (i6 == i7) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i3 = i9 + 1;
                        i4 = (i8 + bArr[i9]) - 13;
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:23:0x002f). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void c(int r7, int r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 + 97
                    int r9 = r9 * 7
                    int r9 = r9 + 16
                    byte[] r0 = o.hY.AnonymousClass1.MenuHostHelper$$ExternalSyntheticLambda1
                    int r8 = r8 + 4
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r1
                    r4 = 0
                    r1 = r0
                    r0 = r10
                    r10 = r9
                    goto L2f
                L15:
                    r3 = 0
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    int r8 = r8 + 1
                    if (r4 != r9) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r8]
                    r6 = r10
                    r10 = r9
                    r9 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r6
                L2f:
                    int r7 = r7 + r9
                    int r7 = r7 + (-4)
                    r9 = r10
                    r10 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.hY.AnonymousClass1.c(int, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:23:0x0034). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = o.hY.AnonymousClass1.$$d
                    int r6 = r6 * 34
                    int r6 = 111 - r6
                    int r8 = 40 - r8
                    int r7 = r7 * 3
                    int r7 = 84 - r7
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L18
                    r3 = r1
                    r4 = 0
                    r1 = r0
                    r0 = r9
                    r9 = r8
                    r8 = r7
                    goto L34
                L18:
                    r3 = 0
                L19:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r8) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L28:
                    int r7 = r7 + 1
                    r4 = r0[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r9
                    r9 = r5
                L34:
                    int r6 = r6 + r7
                    r7 = r8
                    r8 = r9
                    r9 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: o.hY.AnonymousClass1.d(int, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:23:0x002f). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void e(short r7, short r8, short r9, java.lang.Object[] r10) {
                /*
                    int r8 = 100 - r8
                    byte[] r0 = o.hY.AnonymousClass1.$$g
                    int r7 = r7 + 4
                    int r9 = r9 * 2
                    int r9 = 1 - r9
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r1
                    r4 = 0
                    r1 = r0
                    r0 = r10
                    r10 = r9
                    goto L2f
                L15:
                    r3 = 0
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r9) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L25:
                    int r7 = r7 + 1
                    r3 = r0[r7]
                    r6 = r10
                    r10 = r9
                    r9 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r6
                L2f:
                    int r8 = r8 + r9
                    r9 = r10
                    r10 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.hY.AnonymousClass1.e(short, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:115:0x054c  */
            /* JADX WARN: Removed duplicated region for block: B:185:0x06c0 A[SYNTHETIC] */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final /* synthetic */ int compare(o.hY r31, o.hY r32) {
                /*
                    Method dump skipped, instructions count: 1840
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.hY.AnonymousClass1.compare(java.lang.Object, java.lang.Object):int");
            }

            private static void b(char c, char[] cArr, char[] cArr2, char[] cArr3, int i, Object[] objArr) {
                jz jzVar = new jz();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr3.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr3, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr.length;
                char[] cArr6 = new char[length3];
                jzVar.setX = 0;
                while (jzVar.setX < length3) {
                    try {
                        Object[] objArr2 = {jzVar};
                        Object obj = jC.setTextScaleX.get(-608911091);
                        if (obj == null) {
                            byte b = (byte) (-1);
                            byte b2 = (byte) (b + 1);
                            Object[] objArr3 = new Object[1];
                            e(b, b2, b2, objArr3);
                            obj = ((Class) jC.setY(249 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) View.getDefaultSize(0, 0), (-16777212) - Color.rgb(0, 0, 0))).getMethod((String) objArr3[0], Object.class);
                            jC.setTextScaleX.put(-608911091, obj);
                        }
                        int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                        try {
                            Object[] objArr4 = {jzVar};
                            Object obj2 = jC.setTextScaleX.get(-12754601);
                            if (obj2 == null) {
                                byte b3 = (byte) (-1);
                                byte b4 = (byte) (-b3);
                                Object[] objArr5 = new Object[1];
                                e(b3, b4, (byte) (b4 - 1), objArr5);
                                obj2 = ((Class) jC.setY((ViewConfiguration.getJumpTapTimeout() >> 16) + 313, (char) (ViewConfiguration.getEdgeSlop() >> 16), 3 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getMethod((String) objArr5[0], Object.class);
                                jC.setTextScaleX.put(-12754601, obj2);
                            }
                            int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                            try {
                                Object[] objArr6 = {jzVar, Integer.valueOf(cArr4[jzVar.setX % 4] * 32718), Integer.valueOf(cArr5[intValue])};
                                Object obj3 = jC.setTextScaleX.get(1073727806);
                                if (obj3 == null) {
                                    byte b5 = (byte) (-1);
                                    byte b6 = (byte) (b5 + 3);
                                    Object[] objArr7 = new Object[1];
                                    e(b5, b6, (byte) (b6 - 2), objArr7);
                                    obj3 = ((Class) jC.setY(325 - (ViewConfiguration.getTouchSlop() >> 8), (char) (View.MeasureSpec.getSize(0) + 61129), (ViewConfiguration.getJumpTapTimeout() >> 16) + 4)).getMethod((String) objArr7[0], Object.class, Integer.TYPE, Integer.TYPE);
                                    jC.setTextScaleX.put(1073727806, obj3);
                                }
                                ((Method) obj3).invoke(null, objArr6);
                                try {
                                    Object[] objArr8 = {Integer.valueOf(cArr4[intValue2] * 32718), Integer.valueOf(cArr5[intValue])};
                                    Object obj4 = jC.setTextScaleX.get(1861722205);
                                    if (obj4 == null) {
                                        obj4 = ((Class) jC.setY(369 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getMode(0) + 4)).getMethod("a", Integer.TYPE, Integer.TYPE);
                                        jC.setTextScaleX.put(1861722205, obj4);
                                    }
                                    cArr5[intValue2] = ((Character) ((Method) obj4).invoke(null, objArr8)).charValue();
                                    cArr4[intValue2] = jzVar.setIconTintList;
                                    cArr6[jzVar.setX] = (char) ((((cArr4[intValue2] ^ cArr[jzVar.setX]) ^ (setIconTintList ^ (-6862065015268909492L))) ^ ((int) (setX ^ (-6862065015268909492L)))) ^ ((char) (setY ^ (-6862065015268909492L))));
                                    jzVar.setX++;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                objArr[0] = new String(cArr6);
            }
        };
    }

    /* loaded from: classes.dex */
    static final class setNavigationOnClickListener {
        private setNavigationOnClickListener() {
        }

        /* synthetic */ setNavigationOnClickListener(byte b) {
            this();
        }
    }

    /* loaded from: classes.dex */
    static final class setIconTintList {
        private setIconTintList() {
        }

        /* synthetic */ setIconTintList(byte b) {
            this();
        }
    }

    hY() {
    }

    /* renamed from: o.hY$4 */
    /* loaded from: classes.dex */
    final class AnonymousClass4 extends setX {
        private int MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        private final int MenuHostHelper$$ExternalSyntheticLambda1;

        AnonymousClass4() {
            hY.this = r2;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = r2.setX();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0 < this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        @Override // o.hY.setY
        public final byte setIconTintList() {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i >= this.MenuHostHelper$$ExternalSyntheticLambda1) {
                throw new NoSuchElementException();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i + 1;
            return hY.this.setY(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class setX implements setY {
        setX() {
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public /* synthetic */ Byte next() {
            return Byte.valueOf(setIconTintList());
        }
    }

    public static hY setX(String str) {
        return new setLayoutAnimation(str.getBytes(C0243ip.setIconTintList));
    }

    public final byte[] setIconTintList() {
        int x = setX();
        if (x == 0) {
            return C0243ip.setX;
        }
        byte[] bArr = new byte[x];
        setIconTintList(bArr, x);
        return bArr;
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        return setX() == 0 ? "" : MenuHostHelper$$ExternalSyntheticLambda1(C0243ip.setIconTintList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class setOnLongClickListener extends hY {
        setOnLongClickListener() {
        }

        @Override // o.hY, java.lang.Iterable
        public /* synthetic */ Iterator<Byte> iterator() {
            return new AnonymousClass4();
        }
    }

    public final int hashCode() {
        int i = this.setIconTintList;
        if (i == 0) {
            int x = setX();
            i = setIconTintList(x, x);
            if (i == 0) {
                i = 1;
            }
            this.setIconTintList = i;
        }
        return i;
    }

    public static hY$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return new hY$MenuHostHelper$$ExternalSyntheticLambda0(i, (byte) 0);
    }

    protected final int setY() {
        return this.setIconTintList;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder("Beginning index larger than ending index: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder("End index: ");
                sb3.append(i2);
                sb3.append(" >= ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        return i4;
    }

    public final String toString() {
        String obj;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        try {
            Object[] objArr2 = {this};
            byte b = MenuHostHelper$$ExternalSyntheticLambda1[5];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b - 1), MenuHostHelper$$ExternalSyntheticLambda1[5], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = (byte) (MenuHostHelper$$ExternalSyntheticLambda1[5] - 1);
            byte b3 = b2;
            Object[] objArr4 = new Object[1];
            a(b2, b3, b3, objArr4);
            objArr[0] = Integer.toHexString(((Integer) cls.getMethod((String) objArr4[0], Object.class).invoke(null, objArr2)).intValue());
            objArr[1] = Integer.valueOf(setX());
            if (setX() > 50) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0257jc.setIconTintList(new C0257jc.AnonymousClass5(MenuHostHelper$$ExternalSyntheticLambda0(0, 47))));
                sb.append("...");
                obj = sb.toString();
            } else {
                obj = C0257jc.setIconTintList(new C0257jc.AnonymousClass5(this));
            }
            objArr[2] = obj;
            return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* loaded from: classes.dex */
    public static class setLayoutAnimation extends setOnLongClickListener {
        protected final byte[] MenuHostHelper$$ExternalSyntheticLambda1;

        protected int setUiOptions() {
            return 0;
        }

        public setLayoutAnimation(byte[] bArr) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = bArr;
        }

        @Override // o.hY
        public byte setX(int i) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1[i];
        }

        @Override // o.hY
        byte setY(int i) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1[i];
        }

        @Override // o.hY
        public int setX() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.length;
        }

        @Override // o.hY
        public final hY MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
            int MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(0, i2, setX());
            if (MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
                return hY.setY;
            }
            return new setLayoutAnimation(this.MenuHostHelper$$ExternalSyntheticLambda1, setUiOptions(), MenuHostHelper$$ExternalSyntheticLambda0) { // from class: o.hY$MenuHostHelper$$ExternalSyntheticLambda1
                private final int setIconTintList;
                private final int setX;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(r2);
                    MenuHostHelper$$ExternalSyntheticLambda0(r3, r3 + MenuHostHelper$$ExternalSyntheticLambda0, r2.length);
                    this.setIconTintList = r3;
                    this.setX = MenuHostHelper$$ExternalSyntheticLambda0;
                }

                @Override // o.hY.setLayoutAnimation, o.hY
                final byte setY(int i3) {
                    return this.MenuHostHelper$$ExternalSyntheticLambda1[this.setIconTintList + i3];
                }

                @Override // o.hY.setLayoutAnimation, o.hY
                public final int setX() {
                    return this.setX;
                }

                @Override // o.hY.setLayoutAnimation
                protected final int setUiOptions() {
                    return this.setIconTintList;
                }

                @Override // o.hY.setLayoutAnimation, o.hY
                protected final void setIconTintList(byte[] bArr, int i3) {
                    System.arraycopy(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, bArr, 0, i3);
                }

                final Object writeReplace() {
                    return new hY.setLayoutAnimation(setIconTintList());
                }

                private void readObject(ObjectInputStream objectInputStream) {
                    throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
                }

                @Override // o.hY.setLayoutAnimation, o.hY
                public final byte setX(int i3) {
                    int i4 = this.setX;
                    if (((i4 - (i3 + 1)) | i3) < 0) {
                        if (i3 < 0) {
                            StringBuilder sb = new StringBuilder("Index < 0: ");
                            sb.append(i3);
                            throw new ArrayIndexOutOfBoundsException(sb.toString());
                        }
                        StringBuilder sb2 = new StringBuilder("Index > length: ");
                        sb2.append(i3);
                        sb2.append(", ");
                        sb2.append(i4);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    return this.MenuHostHelper$$ExternalSyntheticLambda1[this.setIconTintList + i3];
                }
            };
        }

        @Override // o.hY
        protected void setIconTintList(byte[] bArr, int i) {
            System.arraycopy(this.MenuHostHelper$$ExternalSyntheticLambda1, 0, bArr, 0, i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.hY
        public final void setY(hZ hZVar) {
            hZVar.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, setUiOptions(), setX());
        }

        @Override // o.hY
        protected final String MenuHostHelper$$ExternalSyntheticLambda1(Charset charset) {
            return new String(this.MenuHostHelper$$ExternalSyntheticLambda1, setUiOptions(), setX(), charset);
        }

        @Override // o.hY
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            int uiOptions = setUiOptions();
            return jf.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, uiOptions, setX() + uiOptions);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof hY) && setX() == ((hY) obj).setX()) {
                if (setX() == 0) {
                    return true;
                }
                if (obj instanceof setLayoutAnimation) {
                    setLayoutAnimation setlayoutanimation = (setLayoutAnimation) obj;
                    int y = setY();
                    int y2 = setlayoutanimation.setY();
                    if (y == 0 || y2 == 0 || y == y2) {
                        int x = setX();
                        if (x > setlayoutanimation.setX()) {
                            StringBuilder sb = new StringBuilder("Length too large: ");
                            sb.append(x);
                            sb.append(setX());
                            throw new IllegalArgumentException(sb.toString());
                        } else if (x > setlayoutanimation.setX()) {
                            StringBuilder sb2 = new StringBuilder("Ran off end of other: ");
                            sb2.append(0);
                            sb2.append(", ");
                            sb2.append(x);
                            sb2.append(", ");
                            sb2.append(setlayoutanimation.setX());
                            throw new IllegalArgumentException(sb2.toString());
                        } else if (setlayoutanimation instanceof setLayoutAnimation) {
                            setLayoutAnimation setlayoutanimation2 = setlayoutanimation;
                            byte[] bArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
                            byte[] bArr2 = setlayoutanimation2.MenuHostHelper$$ExternalSyntheticLambda1;
                            int uiOptions = setUiOptions();
                            int uiOptions2 = setUiOptions();
                            int uiOptions3 = setlayoutanimation2.setUiOptions();
                            while (uiOptions2 < uiOptions + x) {
                                if (bArr[uiOptions2] != bArr2[uiOptions3]) {
                                    return false;
                                }
                                uiOptions2++;
                                uiOptions3++;
                            }
                            return true;
                        } else {
                            return setlayoutanimation.MenuHostHelper$$ExternalSyntheticLambda0(0, x).equals(MenuHostHelper$$ExternalSyntheticLambda0(0, x));
                        }
                    }
                    return false;
                }
                return obj.equals(this);
            }
            return false;
        }

        @Override // o.hY
        protected final int setIconTintList(int i, int i2) {
            return C0243ip.MenuHostHelper$$ExternalSyntheticLambda1(i, this.MenuHostHelper$$ExternalSyntheticLambda1, setUiOptions(), i2);
        }
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new AnonymousClass4();
    }
}