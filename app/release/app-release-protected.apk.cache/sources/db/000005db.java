package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.hy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226hy extends hR {
    public gV MenuHostHelper$$ExternalSyntheticLambda1;
    public final List<gV> setIconTintList;
    private String setUiOptions;
    private static final Writer setUnboundedRipple = new Writer() { // from class: o.hy.4
        public static final byte[] $$g = {42, -75, 2, 31};
        public static final int $$h = 12;
        public static final byte[] $$d = {88, 72, 91, 85, 14, -15, 43, -26, -12, 1, 26, -21, -5, -6, 40, -29, -10, -1, 65, -69, 14, -15, 32, -17, -19, 4, 48, -33, -7, 7, -2, 6, -19, 15, 65, -17, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -72, 40, 42, -79, 14, -15, 27};
        public static final int $$e = 183;
        public static final byte[] $$a = {122, 55, -29, -99, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
        public static final int $$b = 54;
        private static byte[] setIconTintList = {108, 11, -123, -39, 21, -2, 22, 5, 2, 3, -46, 61, 20, 7, 14, -7, 17, 14, -62, 29, 52, 7, 14, -7, 27, 4};
        public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 36;
        private static int MenuHostHelper$$ExternalSyntheticLambda0 = 851212211;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0035). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 25
                int r7 = 40 - r7
                int r8 = r8 * 38
                int r8 = r8 + 77
                int r9 = r9 + 4
                byte[] r0 = o.C0226hy.AnonymousClass4.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L18
                r8 = r7
                r3 = r1
                r5 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                goto L35
            L18:
                r3 = 0
                r6 = r8
                r8 = r7
                r7 = r6
            L1c:
                int r9 = r9 + 1
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L2d
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2d:
                r3 = r0[r9]
                r6 = r10
                r10 = r9
                r9 = r3
                r3 = r1
                r1 = r0
                r0 = r6
            L35:
                int r9 = -r9
                int r7 = r7 + r9
                int r7 = r7 + (-13)
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0226hy.AnonymousClass4.a(int, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(short r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = 40 - r7
                int r9 = r9 + 4
                int r8 = r8 * 2
                int r8 = r8 + 77
                byte[] r0 = o.C0226hy.AnonymousClass4.$$d
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                goto L2d
            L15:
                r3 = 0
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r9]
                r6 = r10
                r10 = r9
                r9 = r3
                r3 = r1
                r1 = r0
                r0 = r6
            L2d:
                int r9 = -r9
                int r8 = r8 + r9
                int r9 = r10 + 1
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0226hy.AnonymousClass4.c(short, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0037). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(short r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 2
                int r8 = 3 - r8
                int r7 = r7 * 3
                int r7 = r7 + 1
                byte[] r0 = o.C0226hy.AnonymousClass4.$$g
                int r9 = r9 * 2
                int r9 = 104 - r9
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L1b
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                goto L37
            L1b:
                r3 = 0
            L1c:
                int r8 = r8 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L2d
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2d:
                r3 = r0[r8]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r6
            L37:
                int r7 = -r7
                int r7 = r7 + r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r8
                r8 = r6
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0226hy.AnonymousClass4.d(short, int, byte, java.lang.Object[]):void");
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0297 A[Catch: all -> 0x0584, TRY_LEAVE, TryCatch #0 {all -> 0x0584, blocks: (B:13:0x01ef, B:17:0x028e, B:19:0x0297, B:58:0x0570), top: B:70:0x01ef }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0428  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x055c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0572 -> B:60:0x0579). Please submit an issue!!! */
        @Override // java.io.Writer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void write(char[] r36, int r37, int r38) {
            /*
                Method dump skipped, instructions count: 1486
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0226hy.AnonymousClass4.write(char[], int, int):void");
        }

        private static void b(int i, char[] cArr, int i2, boolean z, int i3, Object[] objArr) {
            ju juVar = new ju();
            char[] cArr2 = new char[i];
            juVar.setX = 0;
            while (juVar.setX < i) {
                juVar.MenuHostHelper$$ExternalSyntheticLambda0 = cArr[juVar.setX];
                cArr2[juVar.setX] = (char) (i2 + juVar.MenuHostHelper$$ExternalSyntheticLambda0);
                int i4 = juVar.setX;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4]), Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0)};
                    Object obj = jC.setTextScaleX.get(-1875803360);
                    if (obj == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        Object[] objArr3 = new Object[1];
                        d(b, b2, b2, objArr3);
                        obj = ((Class) jC.setY(Color.argb(0, 0, 0, 0) + 341, (char) (KeyEvent.getMaxKeyCode() >> 16), 4 - TextUtils.indexOf("", ""))).getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE);
                        jC.setTextScaleX.put(-1875803360, obj);
                    }
                    cArr2[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr4 = {juVar, juVar};
                        Object obj2 = jC.setTextScaleX.get(-257319855);
                        if (obj2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            Object[] objArr5 = new Object[1];
                            d(b3, b4, (byte) (b4 + 1), objArr5);
                            obj2 = ((Class) jC.setY(205 - Process.getGidForName(""), (char) (Color.rgb(0, 0, 0) + 16842449), 4 - ((Process.getThreadPriority(0) + 20) >> 6))).getMethod((String) objArr5[0], Object.class, Object.class);
                            jC.setTextScaleX.put(-257319855, obj2);
                        }
                        ((Method) obj2).invoke(null, objArr4);
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
            }
            if (i3 > 0) {
                juVar.setIconTintList = i3;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - juVar.setIconTintList, juVar.setIconTintList);
                System.arraycopy(cArr3, juVar.setIconTintList, cArr2, 0, i - juVar.setIconTintList);
            }
            if (z) {
                char[] cArr4 = new char[i];
                juVar.setX = 0;
                while (juVar.setX < i) {
                    cArr4[juVar.setX] = cArr2[(i - juVar.setX) - 1];
                    try {
                        Object[] objArr6 = {juVar, juVar};
                        Object obj3 = jC.setTextScaleX.get(-257319855);
                        if (obj3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            Object[] objArr7 = new Object[1];
                            d(b5, b6, (byte) (b6 + 1), objArr7);
                            obj3 = ((Class) jC.setY(View.getDefaultSize(0, 0) + 206, (char) (65233 - KeyEvent.keyCodeFromString("")), View.MeasureSpec.getSize(0) + 4)).getMethod((String) objArr7[0], Object.class, Object.class);
                            jC.setTextScaleX.put(-257319855, obj3);
                        }
                        ((Method) obj3).invoke(null, objArr6);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }
    };
    private static final C0202ha setNavigationOnClickListener = new C0202ha("closed");

    @Override // o.hR, java.io.Flushable
    public final void flush() {
    }

    public C0226hy() {
        super(setUnboundedRipple);
        this.setIconTintList = new ArrayList();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = gW.setY;
    }

    private void setX(gV gVVar) {
        if (this.setUiOptions == null) {
            if (this.setIconTintList.isEmpty()) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = gVVar;
                return;
            }
            List<gV> list = this.setIconTintList;
            gV gVVar2 = list.get(list.size() - 1);
            if (gVVar2 instanceof gX) {
                gX gXVar = (gX) gVVar2;
                if (gVVar == null) {
                    gVVar = gW.setY;
                }
                gXVar.setY.add(gVVar);
                return;
            }
            throw new IllegalStateException();
        }
        if (!(gVVar instanceof gW) || this.setLayoutAnimation) {
            List<gV> list2 = this.setIconTintList;
            gZ gZVar = (gZ) list2.get(list2.size() - 1);
            String str = this.setUiOptions;
            if (gVVar == null) {
                gVVar = gW.setY;
            }
            gZVar.setIconTintList.put(str, gVVar);
        }
        this.setUiOptions = null;
    }

    @Override // o.hR
    public final hR MenuHostHelper$$ExternalSyntheticLambda0() {
        gX gXVar = new gX();
        setX(gXVar);
        this.setIconTintList.add(gXVar);
        return this;
    }

    @Override // o.hR
    public final hR setIconTintList() {
        if (this.setIconTintList.isEmpty() || this.setUiOptions != null) {
            throw new IllegalStateException();
        }
        List<gV> list = this.setIconTintList;
        if (list.get(list.size() - 1) instanceof gX) {
            List<gV> list2 = this.setIconTintList;
            list2.remove(list2.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // o.hR
    public final hR MenuHostHelper$$ExternalSyntheticLambda1() {
        gZ gZVar = new gZ();
        setX(gZVar);
        this.setIconTintList.add(gZVar);
        return this;
    }

    @Override // o.hR
    public final hR setX() {
        if (this.setIconTintList.isEmpty() || this.setUiOptions != null) {
            throw new IllegalStateException();
        }
        List<gV> list = this.setIconTintList;
        if (list.get(list.size() - 1) instanceof gZ) {
            List<gV> list2 = this.setIconTintList;
            list2.remove(list2.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // o.hR
    public final hR setIconTintList(String str) {
        if (this.setIconTintList.isEmpty() || this.setUiOptions != null) {
            throw new IllegalStateException();
        }
        List<gV> list = this.setIconTintList;
        if (list.get(list.size() - 1) instanceof gZ) {
            this.setUiOptions = str;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // o.hR
    public final hR setY() {
        setX(gW.setY);
        return this;
    }

    @Override // o.hR
    public final hR MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        setX(new C0202ha(Boolean.valueOf(z)));
        return this;
    }

    @Override // o.hR
    public final hR setX(long j) {
        setX(new C0202ha(Long.valueOf(j)));
        return this;
    }

    @Override // o.hR, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.setIconTintList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.setIconTintList.add(setNavigationOnClickListener);
    }

    @Override // o.hR
    public final hR MenuHostHelper$$ExternalSyntheticLambda0(Boolean bool) {
        if (bool != null) {
            setX(new C0202ha(bool));
            return this;
        }
        setX(gW.setY);
        return this;
    }

    @Override // o.hR
    public final hR setIconTintList(Number number) {
        if (number == null) {
            setX(gW.setY);
            return this;
        }
        if (!this.setX) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
                sb.append(number);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        setX(new C0202ha(number));
        return this;
    }

    @Override // o.hR
    public final hR setY(String str) {
        if (str != null) {
            setX(new C0202ha(str));
            return this;
        }
        setX(gW.setY);
        return this;
    }
}