package o;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class qB<T> implements qD<T> {
    final qC<T> MenuHostHelper$$ExternalSyntheticLambda1;
    final int setX;

    /* JADX WARN: Multi-variable type inference failed */
    public qB(qC<? extends T> qCVar, int i) {
        pN.setY(qCVar, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = qCVar;
        this.setX = i;
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("count must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // o.qD
    public final qC<T> setX(int i) {
        int i2 = this.setX + i;
        return i2 < 0 ? new qB(this, i) : new qB(this.MenuHostHelper$$ExternalSyntheticLambda1, i2);
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList implements Iterator<T>, InterfaceC0395qb {
        private int MenuHostHelper$$ExternalSyntheticLambda1;
        private final Iterator<T> setIconTintList;
        public static final byte[] $$g = {120, 42, -65, -64};
        public static final int $$h = 70;
        public static final byte[] $$d = {105, 42, 72, -81, 14, -15, 43, -26, -12, 1, 26, -21, -5, -6, 40, -29, -10, -1, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -64, -12, 65, -72, 40, 42, -79, 14, -15, 27};
        public static final int $$e = 86;
        public static final byte[] $$a = {59, -54, -26, -72, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
        public static final int $$b = 204;
        private static byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {63, 26, 111, -17, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12};
        public static final int setX = 162;
        private static int setY = 851212135;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0036). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 + 4
                int r6 = r6 * 38
                int r6 = r6 + 77
                int r7 = r7 * 25
                int r7 = 40 - r7
                byte[] r0 = o.qB.setIconTintList.$$a
                byte[] r1 = new byte[r7]
                int r7 = r7 + (-1)
                r2 = 0
                if (r0 != 0) goto L1a
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                goto L36
            L1a:
                r3 = 0
            L1b:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                int r3 = r3 + 1
                int r8 = r8 + 1
                r4 = r0[r8]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r5
            L36:
                int r7 = -r7
                int r6 = r6 + r7
                int r6 = r6 + (-13)
                r7 = r8
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.qB.setIconTintList.a(int, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0032). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 4
                byte[] r0 = o.qB.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0
                int r8 = 106 - r8
                int r7 = r7 * 7
                int r7 = r7 + 16
                byte[] r1 = new byte[r7]
                int r7 = r7 + (-1)
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
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                int r3 = r3 + 1
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
                int r7 = r9 + (-4)
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
            throw new UnsupportedOperationException("Method not decompiled: o.qB.setIconTintList.c(short, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 2
                int r6 = 115 - r6
                byte[] r0 = o.qB.setIconTintList.$$d
                int r8 = 59 - r8
                int r7 = r7 + 4
                byte[] r1 = new byte[r7]
                int r7 = r7 + (-1)
                r2 = 0
                if (r0 != 0) goto L18
                r6 = r7
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                goto L34
            L18:
                r3 = 0
            L19:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                int r8 = r8 + 1
                if (r3 != r7) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                r3 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r7
                r7 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r5
            L34:
                int r7 = -r7
                int r7 = r7 + r8
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.qB.setIconTintList.d(int, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0036). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void e(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = o.qB.setIconTintList.$$g
                int r7 = r7 * 4
                int r7 = 1 - r7
                int r8 = r8 * 2
                int r8 = r8 + 102
                int r6 = r6 * 2
                int r6 = r6 + 4
                byte[] r1 = new byte[r7]
                int r7 = r7 + (-1)
                r2 = 0
                if (r0 != 0) goto L1c
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                goto L36
            L1c:
                r3 = 0
            L1d:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r5
            L36:
                int r7 = r7 + r9
                int r6 = r6 + 1
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: o.qB.setIconTintList.e(byte, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0429  */
        @Override // java.util.Iterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void remove() {
            /*
                Method dump skipped, instructions count: 1446
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.qB.setIconTintList.remove():void");
        }

        setIconTintList(qB<T> qBVar) {
            this.setIconTintList = qBVar.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = qBVar.setX;
        }

        private final void setIconTintList() {
            while (this.MenuHostHelper$$ExternalSyntheticLambda1 > 0 && this.setIconTintList.hasNext()) {
                this.setIconTintList.next();
                this.MenuHostHelper$$ExternalSyntheticLambda1--;
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            setIconTintList();
            return this.setIconTintList.next();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            setIconTintList();
            return this.setIconTintList.hasNext();
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
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4]), Integer.valueOf(setY)};
                    Object obj = jC.setTextScaleX.get(-1875803360);
                    if (obj == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        Object[] objArr3 = new Object[1];
                        e(b, b2, (byte) (b2 + 1), objArr3);
                        obj = ((Class) jC.setY(TextUtils.getOffsetBefore("", 0) + 341, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4)).getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE);
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
                            e(b3, b4, b4, objArr5);
                            obj2 = ((Class) jC.setY((ViewConfiguration.getWindowTouchSlop() >> 8) + 206, (char) (65233 - (ViewConfiguration.getLongPressTimeout() >> 16)), ((byte) KeyEvent.getModifierMetaStateMask()) + 5)).getMethod((String) objArr5[0], Object.class, Object.class);
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
                            e(b5, b6, b6, objArr7);
                            obj3 = ((Class) jC.setY(206 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (KeyEvent.getDeadChar(0, 0) + 65233), 4 - View.MeasureSpec.getMode(0))).getMethod((String) objArr7[0], Object.class, Object.class);
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
    }

    @Override // o.qC
    public final Iterator<T> MenuHostHelper$$ExternalSyntheticLambda0() {
        return new setIconTintList(this);
    }
}