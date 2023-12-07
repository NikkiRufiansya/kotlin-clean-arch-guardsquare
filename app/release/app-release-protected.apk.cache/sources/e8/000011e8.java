package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class vH implements Closeable {
    public static final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = new setIconTintList((byte) 0);
    public Reader setIconTintList;

    public abstract vA MenuHostHelper$$ExternalSyntheticLambda0();

    public abstract InterfaceC0607xr MenuHostHelper$$ExternalSyntheticLambda1();

    public abstract long setIconTintList();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        vL.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1());
    }

    /* loaded from: classes.dex */
    public static final class setY extends Reader {
        private final InterfaceC0607xr MenuHostHelper$$ExternalSyntheticLambda0;
        private Reader MenuHostHelper$$ExternalSyntheticLambda1;
        private final Charset setIconTintList;
        private boolean setY;

        public setY(InterfaceC0607xr interfaceC0607xr, Charset charset) {
            pN.setY(interfaceC0607xr, "");
            pN.setY(charset, "");
            this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0607xr;
            this.setIconTintList = charset;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            pN.setY(cArr, "");
            if (this.setY) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener(), vL.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconTintList));
                this.MenuHostHelper$$ExternalSyntheticLambda1 = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.setY = true;
            Reader reader = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (reader != null) {
                reader.close();
            } else {
                this.MenuHostHelper$$ExternalSyntheticLambda0.close();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        public static final byte[] $$g = {79, 20, 25, -22};
        public static final int $$h = 165;
        public static final byte[] $$d = {8, -125, -40, -38, -65, 65, 1, -14, 15, -28, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 72, -40, -42, 79, -14, 15, -27};
        public static final int $$e = 143;
        public static final byte[] $$a = {95, 98, 60, -42, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
        public static final int $$b = 200;
        private static byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {23, -59, 18, 83, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
        public static final int setX = 112;
        private static char[] MenuHostHelper$$ExternalSyntheticLambda1 = {41015, 41056, 41070, 41068, 41079, 41067, 41057, 41038, 41033, 41078, 41047, 41031, 41057, 41073, 41076, 41067, 41070, 41055, 41040, 41066, 41070, 41056, 41013, 41070, 41068, 41065, 41079, 41057, 41060, 41052, 41052, 41059, 41067, 41078, 41071, 41057, 41071, 41022, 41066, 41049, 41057, 41073, 41065, 41064, 41064, 41065, 41068, 41045, 41008, 41032, 41079, 41071, 41024, 41038, 41057, 41067, 41079, 41068, 41070, 41056, 41061, 41061, 41060, 41008, 41065, 41067, 41065, 41069, 41061, 41057, 41069, 41065, 41079, 41055, 41053, 41078, 41070, 41068, 41077, 41076, 41067};

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0037). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 25
                int r6 = 40 - r6
                byte[] r0 = o.vH.setIconTintList.$$a
                int r8 = r8 * 38
                int r8 = r8 + 77
                int r7 = r7 + 4
                byte[] r1 = new byte[r6]
                int r6 = r6 + (-1)
                r2 = 0
                if (r0 != 0) goto L1b
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                goto L37
            L1b:
                r3 = 0
            L1c:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L2b
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2b:
                int r7 = r7 + 1
                r3 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r5
            L37:
                int r6 = -r6
                int r9 = r9 + r6
                int r6 = r9 + (-13)
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r7
                r7 = r5
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.vH.setIconTintList.a(short, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = 106 - r6
                int r8 = 41 - r8
                byte[] r0 = o.vH.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0
                int r7 = r7 * 7
                int r7 = r7 + 16
                byte[] r1 = new byte[r7]
                int r7 = r7 + (-1)
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                goto L30
            L17:
                r3 = 0
            L18:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                r4 = r0[r8]
                int r3 = r3 + 1
                r5 = r9
                r9 = r6
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L30:
                int r8 = r8 + 1
                int r9 = r9 + r6
                int r6 = r9 + (-4)
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.vH.setIconTintList.c(short, byte, byte, java.lang.Object[]):void");
        }

        private static void d(byte b, short s, int i, Object[] objArr) {
            int i2 = 115 - (s * 2);
            byte[] bArr = $$d;
            int i3 = 48 - (b * 3);
            int i4 = 40 - i;
            byte[] bArr2 = new byte[i4];
            int i5 = -1;
            int i6 = i4 - 1;
            if (bArr == null) {
                i2 = i3 + i2;
                i3 = i3;
            }
            while (true) {
                i5++;
                int i7 = i3 + 1;
                bArr2[i5] = (byte) i2;
                if (i5 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i2 += bArr[i7];
                    i3 = i7;
                }
            }
        }

        private static void e(short s, int i, byte b, Object[] objArr) {
            int i2 = 111 - b;
            int i3 = 1 - (i * 4);
            int i4 = s + 4;
            byte[] bArr = $$g;
            byte[] bArr2 = new byte[i3];
            int i5 = -1;
            int i6 = i3 - 1;
            if (bArr == null) {
                i2 = i4 + (-i2);
                i4 = i4;
                i6 = i6;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                if (i5 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i7 = i4 + 1;
                i2 += -bArr[i7];
                i4 = i7;
                i6 = i6;
            }
        }

        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        public static /* synthetic */ vH MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList seticontintlist, byte[] bArr) {
            pN.setY(bArr, "");
            C0602xo c0602xo = new C0602xo();
            pN.setY(bArr, "");
            int length = bArr.length;
            return seticontintlist.setX(c0602xo.setY(bArr, 0, bArr.length), null, 0L);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0381  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.vH setX(final o.InterfaceC0607xr r27, final o.vA r28, final long r29) {
            /*
                Method dump skipped, instructions count: 1293
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.vH.setIconTintList.setX(o.xr, o.vA, long):o.vH");
        }

        private static void b(int[] iArr, byte[] bArr, boolean z, Object[] objArr) {
            int i;
            char[] cArr;
            jx jxVar = new jx();
            int i2 = 0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr2 = MenuHostHelper$$ExternalSyntheticLambda1;
            int i7 = -1;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i2] = Integer.valueOf(cArr2[i8]);
                        Object obj = jC.setTextScaleX.get(-2065108825);
                        if (obj != null) {
                            cArr = cArr2;
                        } else {
                            byte b = (byte) i7;
                            byte b2 = (byte) (b + 1);
                            cArr = cArr2;
                            Object[] objArr3 = new Object[1];
                            e(b, b2, (byte) (b2 + 3), objArr3);
                            obj = ((Class) jC.setY(40 - TextUtils.indexOf("", "", i2, i2), (char) (35090 - Color.green(i2)), View.getDefaultSize(i2, i2) + 6)).getMethod((String) objArr3[0], Integer.TYPE);
                            jC.setTextScaleX.put(-2065108825, obj);
                        }
                        cArr3[i8] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        i8++;
                        cArr2 = cArr;
                        i2 = 0;
                        i7 = -1;
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
            char[] cArr4 = new char[i4];
            System.arraycopy(cArr2, i3, cArr4, 0, i4);
            if (bArr != null) {
                char[] cArr5 = new char[i4];
                jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                char c = 0;
                while (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 < i4) {
                    if (bArr[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] == 1) {
                        int i9 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c)};
                            Object obj2 = jC.setTextScaleX.get(1237805447);
                            if (obj2 == null) {
                                byte b3 = (byte) (-1);
                                byte b4 = (byte) (b3 + 1);
                                Object[] objArr5 = new Object[1];
                                e(b3, b4, (byte) (b4 + 2), objArr5);
                                obj2 = ((Class) jC.setY(273 - (Process.myPid() >> 22), (char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.lastIndexOf("", '0', 0) + 5)).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE);
                                jC.setTextScaleX.put(1237805447, obj2);
                            }
                            cArr5[i9] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i10 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                        try {
                            Object[] objArr6 = {Integer.valueOf(cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c)};
                            Object obj3 = jC.setTextScaleX.get(997913035);
                            if (obj3 == null) {
                                byte b5 = (byte) (-1);
                                byte b6 = (byte) (b5 + 1);
                                Object[] objArr7 = new Object[1];
                                e(b5, b6, (byte) (b6 + 1), objArr7);
                                obj3 = ((Class) jC.setY(Color.blue(0) + 269, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4)).getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE);
                                jC.setTextScaleX.put(997913035, obj3);
                            }
                            cArr5[i10] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    c = cArr5[jxVar.MenuHostHelper$$ExternalSyntheticLambda0];
                    try {
                        Object[] objArr8 = {jxVar, jxVar};
                        Object obj4 = jC.setTextScaleX.get(1233791110);
                        if (obj4 == null) {
                            byte b7 = (byte) (-1);
                            byte b8 = (byte) (b7 + 1);
                            Object[] objArr9 = new Object[1];
                            e(b7, b8, b8, objArr9);
                            obj4 = ((Class) jC.setY(TextUtils.lastIndexOf("", '0') + 237, (char) KeyEvent.keyCodeFromString(""), 4 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod((String) objArr9[0], Object.class, Object.class);
                            jC.setTextScaleX.put(1233791110, obj4);
                        }
                        ((Method) obj4).invoke(null, objArr8);
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                cArr4 = cArr5;
            }
            if (i6 > 0) {
                char[] cArr6 = new char[i4];
                i = 0;
                System.arraycopy(cArr4, 0, cArr6, 0, i4);
                int i11 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr4, i11, i6);
                System.arraycopy(cArr6, i6, cArr4, 0, i11);
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr7 = new char[i4];
                while (true) {
                    jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                    if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i4) {
                        break;
                    }
                    cArr7[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr4[(i4 - jxVar.MenuHostHelper$$ExternalSyntheticLambda0) - 1];
                    i = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
                }
                cArr4 = cArr7;
            }
            if (i5 > 0) {
                int i12 = 0;
                while (true) {
                    jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i12;
                    if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i4) {
                        break;
                    }
                    cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] - iArr[2]);
                    i12 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }
    }

    public static final vH MenuHostHelper$$ExternalSyntheticLambda1(vA vAVar, long j, InterfaceC0607xr interfaceC0607xr) {
        setIconTintList seticontintlist = MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY(interfaceC0607xr, "");
        return seticontintlist.setX(interfaceC0607xr, vAVar, j);
    }
}