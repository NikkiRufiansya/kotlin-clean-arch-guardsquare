package o;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class setShadowEffect {
    private static final setShadowEffect MenuHostHelper$$ExternalSyntheticLambda1;
    private static char setIconTintList;
    private static char[] setX;
    public final setStepSize<String, setBoxStrokeErrorColor> MenuHostHelper$$ExternalSyntheticLambda0 = new setStepSize<>(20);
    public static final byte[] $$g = {75, -120, 119, 39};
    public static final int $$h = 20;
    public static final byte[] $$d = {10, -99, -17, -84, -11, 18, -24, -62, 75, -1, -75, 44, 27, 12, 10, -42, 42, 7, 4, -41, 32, 10, 7, -8, 16, -75, 3, 36, 54, -1, -12, 16, -1, -10, 14, -22, 41, -8, 9, -9, 0, 18, -8, -3, -20, 24, 15, -8, 5, 0, -46};
    public static final int $$e = 240;
    public static final byte[] $$a = {2, -87, 98, 54, -1, 28, -14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
    public static final int $$b = 87;

    static void MenuHostHelper$$ExternalSyntheticLambda1() {
        setIconTintList = (char) 63084;
        setX = new char[]{50070, 50079, 50074, 50076, 50141, 50051, 50049, 49256, 49261, 50072, 50096, 49257, 50066, 49259, 50081, 50078, 50048, 50058, 50055, 50064, 50071, 50080, 49260, 50077, 49258};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 36
            int r7 = r7 + 4
            byte[] r0 = o.setShadowEffect.$$a
            int r9 = r9 + 4
            int r8 = r8 * 38
            int r8 = 115 - r8
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L1a
            r8 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L37
        L1a:
            r3 = 0
        L1b:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            int r9 = r9 + 1
            r3 = r0[r9]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L37:
            int r7 = r7 + r9
            int r7 = r7 + (-13)
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setShadowEffect.a(int, int, short, java.lang.Object[]):void");
    }

    private static void c(short s, int i, byte b, Object[] objArr) {
        int i2 = 115 - (i * 4);
        byte[] bArr = $$d;
        int i3 = (b * 41) + 4;
        int i4 = 6 - (s * 3);
        byte[] bArr2 = new byte[i3];
        int i5 = -1;
        int i6 = i3 - 1;
        if (bArr == null) {
            i6 = i6;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = -1;
            i2 = (i2 + i4) - 3;
            i4 = i4;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i2;
            int i8 = i4 + 1;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i8];
            i6 = i6;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = i7;
            i2 = (i2 + b2) - 3;
            i4 = i8;
        }
    }

    private static void d(byte b, short s, byte b2, Object[] objArr) {
        int i = 1 - (b2 * 2);
        byte[] bArr = $$g;
        int i2 = 106 - s;
        int i3 = (b * 3) + 4;
        byte[] bArr2 = new byte[i];
        int i4 = -1;
        int i5 = i - 1;
        if (bArr == null) {
            i3++;
            i2 += -i5;
            i5 = i5;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i4 = -1;
        }
        while (true) {
            int i6 = i4 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i3];
            i3++;
            i2 += -b3;
            i5 = i5;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i4 = i6;
        }
    }

    static {
        MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda1 = new setShadowEffect();
    }

    setShadowEffect() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.setBoxStrokeErrorColor MenuHostHelper$$ExternalSyntheticLambda0(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setShadowEffect.MenuHostHelper$$ExternalSyntheticLambda0(java.lang.String):o.setBoxStrokeErrorColor");
    }

    private static void b(char[] cArr, int i, byte b, Object[] objArr) {
        int i2;
        Object obj;
        jr jrVar = new jr();
        char[] cArr2 = setX;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object obj3 = jC.setTextScaleX.get(1058594953);
                    if (obj3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        Object[] objArr3 = new Object[1];
                        d(b2, b3, (byte) (b3 - 1), objArr3);
                        obj3 = ((Class) jC.setY((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 167, (char) ExpandableListView.getPackedPositionGroup(0L), 20 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(1058594953, obj3);
                    }
                    cArr3[i3] = ((Character) ((Method) obj3).invoke(null, objArr2)).charValue();
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
            Object[] objArr4 = {Integer.valueOf(setIconTintList)};
            Object obj4 = jC.setTextScaleX.get(1058594953);
            if (obj4 == null) {
                byte b4 = (byte) 0;
                byte b5 = (byte) (b4 + 1);
                Object[] objArr5 = new Object[1];
                d(b4, b5, (byte) (b5 - 1), objArr5);
                obj4 = ((Class) jC.setY(((byte) KeyEvent.getModifierMetaStateMask()) + 167, (char) View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "", 0, 0) + 20)).getMethod((String) objArr5[0], Integer.TYPE);
                jC.setTextScaleX.put(1058594953, obj4);
            }
            char charValue = ((Character) ((Method) obj4).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                jrVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                while (jrVar.MenuHostHelper$$ExternalSyntheticLambda0 < i2) {
                    jrVar.MenuHostHelper$$ExternalSyntheticLambda1 = cArr[jrVar.MenuHostHelper$$ExternalSyntheticLambda0];
                    jrVar.setX = cArr[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1];
                    if (jrVar.MenuHostHelper$$ExternalSyntheticLambda1 == jrVar.setX) {
                        cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (jrVar.MenuHostHelper$$ExternalSyntheticLambda1 - b);
                        cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = (char) (jrVar.setX - b);
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr6 = {jrVar, jrVar, Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), jrVar};
                            Object obj5 = jC.setTextScaleX.get(23685139);
                            if (obj5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 3);
                                Object[] objArr7 = new Object[1];
                                d(b6, b7, (byte) (b7 - 3), objArr7);
                                obj5 = ((Class) jC.setY(252 - TextUtils.indexOf("", ""), (char) (13825 - AndroidCharacter.getMirror('0')), 9 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod((String) objArr7[0], Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class);
                                jC.setTextScaleX.put(23685139, obj5);
                            }
                            if (((Integer) ((Method) obj5).invoke(null, objArr6)).intValue() == jrVar.setLayoutAnimation) {
                                try {
                                    Object[] objArr8 = {jrVar, jrVar, Integer.valueOf(charValue), Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), Integer.valueOf(charValue), jrVar, Integer.valueOf(charValue), jrVar};
                                    Object obj6 = jC.setTextScaleX.get(-1549003164);
                                    if (obj6 == null) {
                                        byte b8 = (byte) 0;
                                        byte b9 = b8;
                                        Object[] objArr9 = new Object[1];
                                        d(b8, b9, b9, objArr9);
                                        obj6 = ((Class) jC.setY(235 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5)).getMethod((String) objArr9[0], Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class);
                                        jC.setTextScaleX.put(-1549003164, obj6);
                                    }
                                    obj = null;
                                    int intValue = ((Integer) ((Method) obj6).invoke(null, objArr8)).intValue();
                                    int i4 = (jrVar.setY * charValue) + jrVar.setLayoutAnimation;
                                    cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr2[intValue];
                                    cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = cArr2[i4];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                obj = null;
                                if (jrVar.setIconTintList == jrVar.setY) {
                                    jrVar.setOnLongClickListener = ((jrVar.setOnLongClickListener + charValue) - 1) % charValue;
                                    jrVar.setLayoutAnimation = ((jrVar.setLayoutAnimation + charValue) - 1) % charValue;
                                    int i5 = (jrVar.setIconTintList * charValue) + jrVar.setOnLongClickListener;
                                    int i6 = (jrVar.setY * charValue) + jrVar.setLayoutAnimation;
                                    cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr2[i5];
                                    cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = cArr2[i6];
                                } else {
                                    int i7 = (jrVar.setIconTintList * charValue) + jrVar.setLayoutAnimation;
                                    int i8 = (jrVar.setY * charValue) + jrVar.setOnLongClickListener;
                                    cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr2[i7];
                                    cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = cArr2[i8];
                                }
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    jrVar.MenuHostHelper$$ExternalSyntheticLambda0 += 2;
                    obj2 = obj;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr4[i9] = (char) (cArr4[i9] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }
}