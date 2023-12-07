package o;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: o.xu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0610xu implements Serializable, Comparable<C0610xu> {
    public static final setX MenuHostHelper$$ExternalSyntheticLambda0;
    private static boolean setNavigationOnClickListener;
    private static int setOnLongClickListener;
    private static boolean setUiOptions;
    private static char[] setUnboundedRipple;
    public static final C0610xu setY;
    public final byte[] setIconTintList;
    private transient int setLayoutAnimation;
    public transient String setX;
    public static final byte[] $$g = {42, -75, 2, 31};
    public static final int $$h = 142;
    public static final byte[] $$d = {51, 112, -114, 9, 11, -18, 40, -29, -15, -2, 23, -24, -8, -9, 37, -32, -13, -4, 11, -18, 24, 62, -65, 38, 62, -75, 1, 75, -44, -27, -12, -10, 42, -42, -7, -4, 41, -32, -10, -7, 8, -16, 75, -3, -36, -54, 1, 12, -16, 1, 10, -14, 22, -41, 8, -9, 9, 0, -18, 8, 3, 20, -24, -15, 8, -5, 0, 46};
    public static final int $$e = 34;
    public static final byte[] $$a = {44, 104, -53, -66, -1, 28, -14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
    public static final int $$b = 226;
    private static byte[] setCenterIfNoTextEnabled = {107, 3, 14, 112, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 168;

    private static void a(int i, byte b, byte b2, Object[] objArr) {
        int i2 = b2 + 4;
        byte[] bArr = $$a;
        int i3 = (b * 38) + 77;
        int i4 = (i * 36) + 4;
        byte[] bArr2 = new byte[i4];
        int i5 = -1;
        int i6 = i4 - 1;
        if (bArr == null) {
            i3 = (i6 + i3) - 13;
            i6 = i6;
        }
        while (true) {
            i2++;
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3;
            int i8 = i6;
            i3 = (i7 + bArr[i2]) - 13;
            i6 = i8;
        }
    }

    private static void c(int i, short s, byte b, Object[] objArr) {
        byte[] bArr = setCenterIfNoTextEnabled;
        int i2 = 106 - b;
        int i3 = (s * 2) + 16;
        int i4 = 19 - (i * 15);
        byte[] bArr2 = new byte[i3];
        int i5 = -1;
        int i6 = i3 - 1;
        if (bArr == null) {
            i2 = (i4 - i2) + 2;
            i4++;
            i6 = i6;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i6;
            int i8 = i4;
            i2 = (i2 - bArr[i4]) + 2;
            i4 = i8 + 1;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = o.C0610xu.$$d
            int r8 = r8 * 4
            int r8 = r8 + 111
            int r7 = 24 - r7
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
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
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L32:
            int r7 = -r7
            int r8 = r8 + 1
            int r9 = r9 + r7
            int r7 = r9 + (-3)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0610xu.d(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r0 = o.C0610xu.$$g
            int r8 = r8 * 2
            int r8 = r8 + 66
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = 0
            r8 = r7
            goto L2e
        L17:
            r3 = 0
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0610xu.e(short, byte, byte, java.lang.Object[]):void");
    }

    static void setLayoutAnimation() {
        setUnboundedRipple = new char[]{34041, 34036, 34046, 33800, 33803, 34033, 33972, 33807, 34031, 33793, 33806, 34045, 34037, 34015, 34038, 34047, 34039, 33802, 34024, 34009, 33804, 34030, 34034, 33805};
        setUiOptions = true;
        setNavigationOnClickListener = true;
        setOnLongClickListener = -1400798054;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ int compareTo(o.C0610xu r8) {
        /*
            r7 = this;
            o.xu r8 = (o.C0610xu) r8
            java.lang.String r0 = ""
            o.pN.setY(r8, r0)
            int r0 = r7.MenuHostHelper$$ExternalSyntheticLambda0()
            int r1 = r8.MenuHostHelper$$ExternalSyntheticLambda0()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L15:
            if (r4 >= r2) goto L2b
            byte r5 = r7.setY(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.setY(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L28
            int r4 = r4 + 1
            goto L15
        L28:
            if (r5 >= r6) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0610xu.compareTo(java.lang.Object):int");
    }

    public C0610xu(byte[] bArr) {
        pN.setY(bArr, "");
        this.setIconTintList = bArr;
    }

    public final void setIconTintList(int i) {
        this.setLayoutAnimation = i;
    }

    public final int setY() {
        return this.setLayoutAnimation;
    }

    public C0610xu MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        pN.setY(str, "");
        byte[] digest = MessageDigest.getInstance(str).digest(this.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) digest, "");
        return new C0610xu(digest);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(C0602xo c0602xo, int i, int i2) {
        pN.setY(c0602xo, "");
        xL.setIconTintList(this, c0602xo, 0, i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        ObjectInputStream objectInputStream2 = objectInputStream;
        pN.setY(objectInputStream2, "");
        int i = 0;
        if (!(readInt >= 0)) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(readInt);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        byte[] bArr = new byte[readInt];
        while (i < readInt) {
            int read = objectInputStream2.read(bArr, i, readInt - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
        C0610xu c0610xu = new C0610xu(bArr);
        Field declaredField = C0610xu.class.getDeclaredField("setIconTintList");
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) declaredField, "");
        declaredField.setAccessible(true);
        declaredField.set(this, c0610xu.setIconTintList);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.setIconTintList.length);
        objectOutputStream.write(this.setIconTintList);
    }

    /* renamed from: o.xu$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        private setX() {
        }

        public /* synthetic */ setX(byte b) {
            this();
        }

        public static C0610xu setY(String str) {
            pN.setY(str, "");
            if (!(str.length() % 2 == 0)) {
                StringBuilder sb = new StringBuilder("Unexpected hex string: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i << 1;
                bArr[i] = (byte) ((xL.setX(str.charAt(i2)) << 4) + xL.setX(str.charAt(i2 + 1)));
            }
            return new C0610xu(bArr);
        }
    }

    static {
        setLayoutAnimation();
        MenuHostHelper$$ExternalSyntheticLambda0 = new setX((byte) 0);
        setY = new C0610xu(new byte[0]);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C0610xu)) {
                return false;
            }
            C0610xu c0610xu = (C0610xu) obj;
            int MenuHostHelper$$ExternalSyntheticLambda02 = c0610xu.MenuHostHelper$$ExternalSyntheticLambda0();
            byte[] bArr = this.setIconTintList;
            if (MenuHostHelper$$ExternalSyntheticLambda02 != bArr.length || !c0610xu.MenuHostHelper$$ExternalSyntheticLambda1(0, bArr, 0, bArr.length)) {
                return false;
            }
        }
        return true;
    }

    public static final C0610xu setIconTintList(String str) {
        pN.setY(str, "");
        pN.setY(str, "");
        byte[] bytes = str.getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes, "");
        C0610xu c0610xu = new C0610xu(bytes);
        c0610xu.setX = str;
        return c0610xu;
    }

    public String MenuHostHelper$$ExternalSyntheticLambda1() {
        return C0596xi.setIconTintList(this.setIconTintList);
    }

    public int MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setIconTintList.length;
    }

    public int hashCode() {
        int i = this.setLayoutAnimation;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.setIconTintList);
            this.setLayoutAnimation = hashCode;
            return hashCode;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0467 A[LOOP:0: B:45:0x0465->B:46:0x0467, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String setIconTintList() {
        /*
            Method dump skipped, instructions count: 1201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0610xu.setIconTintList():java.lang.String");
    }

    public byte[] setX() {
        return this.setIconTintList;
    }

    public byte setY(int i) {
        return this.setIconTintList[i];
    }

    public boolean setX(int i, C0610xu c0610xu, int i2) {
        pN.setY(c0610xu, "");
        return c0610xu.MenuHostHelper$$ExternalSyntheticLambda1(0, this.setIconTintList, 0, i2);
    }

    public boolean MenuHostHelper$$ExternalSyntheticLambda1(int i, byte[] bArr, int i2, int i3) {
        pN.setY(bArr, "");
        if (i >= 0) {
            byte[] bArr2 = this.setIconTintList;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C0601xn.setIconTintList(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(o.C0610xu r32) {
        /*
            Method dump skipped, instructions count: 1105
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0610xu.MenuHostHelper$$ExternalSyntheticLambda1(o.xu):boolean");
    }

    public C0610xu setUiOptions() {
        int i = 0;
        while (true) {
            byte[] bArr = this.setIconTintList;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) copyOf, "");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C0610xu(copyOf);
            }
            i++;
        }
    }

    public byte[] setOnLongClickListener() {
        byte[] bArr = this.setIconTintList;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) copyOf, "");
        return copyOf;
    }

    public String toString() {
        if (this.setIconTintList.length == 0) {
            return "[size=0]";
        }
        int MenuHostHelper$$ExternalSyntheticLambda12 = xL.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList);
        if (MenuHostHelper$$ExternalSyntheticLambda12 == -1) {
            if (this.setIconTintList.length <= 64) {
                StringBuilder sb = new StringBuilder("[hex=");
                sb.append(setIconTintList());
                sb.append(']');
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("[size=");
            sb2.append(this.setIconTintList.length);
            sb2.append(" hex=");
            if (64 <= this.setIconTintList.length) {
                sb2.append((64 == this.setIconTintList.length ? this : new C0610xu(C0342oc.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, 0, 64))).setIconTintList());
                sb2.append("…]");
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder("endIndex > length(");
            sb3.append(this.setIconTintList.length);
            sb3.append(')');
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        String str = this.setX;
        if (str == null) {
            byte[] x = setX();
            pN.setY(x, "");
            String str2 = new String(x, qQ.setIconTintList);
            this.setX = str2;
            str = str2;
        }
        if (str != null) {
            String substring = str.substring(0, MenuHostHelper$$ExternalSyntheticLambda12);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            String MenuHostHelper$$ExternalSyntheticLambda02 = qR.MenuHostHelper$$ExternalSyntheticLambda0(qR.MenuHostHelper$$ExternalSyntheticLambda0(qR.MenuHostHelper$$ExternalSyntheticLambda0(substring, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (MenuHostHelper$$ExternalSyntheticLambda12 < str.length()) {
                StringBuilder sb4 = new StringBuilder("[size=");
                sb4.append(this.setIconTintList.length);
                sb4.append(" text=");
                sb4.append(MenuHostHelper$$ExternalSyntheticLambda02);
                sb4.append("…]");
                return sb4.toString();
            }
            StringBuilder sb5 = new StringBuilder("[text=");
            sb5.append(MenuHostHelper$$ExternalSyntheticLambda02);
            sb5.append(']');
            return sb5.toString();
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) {
        jt jtVar = new jt();
        char[] cArr2 = setUnboundedRipple;
        int i2 = -1;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object obj = jC.setTextScaleX.get(-2024796271);
                    if (obj == null) {
                        byte b = (byte) i2;
                        byte b2 = (byte) (b + 1);
                        Object[] objArr3 = new Object[1];
                        e(b, b2, (byte) (b2 + 1), objArr3);
                        obj = ((Class) jC.setY(TextUtils.indexOf((CharSequence) "", '0', i3) + 233, (char) View.combineMeasuredStates(i3, i3), 5 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-2024796271, obj);
                    }
                    cArr3[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = -1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(setOnLongClickListener)};
            Object obj2 = jC.setTextScaleX.get(-192560398);
            float f = 0.0f;
            if (obj2 == null) {
                obj2 = ((Class) jC.setY((ViewConfiguration.getKeyRepeatDelay() >> 16) + 357, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31791), 4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("C", Integer.TYPE);
                jC.setTextScaleX.put(-192560398, obj2);
            }
            int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
            if (setNavigationOnClickListener) {
                jtVar.setIconTintList = bArr.length;
                char[] cArr4 = new char[jtVar.setIconTintList];
                jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                    cArr4[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[bArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] + i] - intValue);
                    try {
                        Object[] objArr5 = {jtVar, jtVar};
                        Object obj3 = jC.setTextScaleX.get(258277102);
                        if (obj3 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            Object[] objArr6 = new Object[1];
                            e(b3, b4, b4, objArr6);
                            obj3 = ((Class) jC.setY(210 - View.combineMeasuredStates(0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16), 4 - View.resolveSizeAndState(0, 0, 0))).getMethod((String) objArr6[0], Object.class, Object.class);
                            jC.setTextScaleX.put(258277102, obj3);
                        }
                        ((Method) obj3).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr4);
            } else if (setUiOptions) {
                jtVar.setIconTintList = cArr.length;
                char[] cArr5 = new char[jtVar.setIconTintList];
                jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                    cArr5[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[cArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i] - intValue);
                    try {
                        Object[] objArr7 = {jtVar, jtVar};
                        Object obj4 = jC.setTextScaleX.get(258277102);
                        if (obj4 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 1);
                            Object[] objArr8 = new Object[1];
                            e(b5, b6, b6, objArr8);
                            obj4 = ((Class) jC.setY(210 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), 4 - TextUtils.indexOf("", "", 0, 0))).getMethod((String) objArr8[0], Object.class, Object.class);
                            jC.setTextScaleX.put(258277102, obj4);
                        }
                        ((Method) obj4).invoke(null, objArr7);
                        f = 0.0f;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                objArr[0] = new String(cArr5);
            } else {
                int i5 = 0;
                jtVar.setIconTintList = iArr.length;
                char[] cArr6 = new char[jtVar.setIconTintList];
                while (true) {
                    jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = i5;
                    if (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                        cArr6[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[iArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i] - intValue);
                        i5 = jtVar.MenuHostHelper$$ExternalSyntheticLambda1 + 1;
                    } else {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                }
            }
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }
}