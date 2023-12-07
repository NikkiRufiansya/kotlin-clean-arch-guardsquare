package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class setErrorContentDescription extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> MenuHostHelper$$ExternalSyntheticLambda1 = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> setY = new CopyOnWriteArraySet();
    public static final byte[] $$g = {27, -74, -29, -66};
    public static final int $$h = 217;
    public static final byte[] $$d = {18, -87, -121, -123, 14, -15, 43, -26, -12, 1, 26, -21, -5, -6, 40, -29, -10, -1, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -64, -12, 65, -72, 40, 42, -79, 14, -15, 27};
    public static final int $$e = 152;
    public static final byte[] $$a = {8, 17, -121, -18, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
    public static final int $$b = 120;
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {113, 46, 115, -60, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12};
    public static final int setX = 17;
    private static char[] setIconTintList = {41008, 41066, 41040, 41055, 41070, 41067, 41076, 41073, 41057, 41031, 41047, 41078, 41033, 41038, 41057, 41067, 41079, 41068, 41070, 41056, 41057, 41056, 41095, 41218, 41220, 41223, 41209, 41213, 41210, 41212, 41210, 41217, 41222, 41214, 41207, 41207, 41215, 41018, 41086, 41085, 41093, 41091, 41074, 41082, 41098, 41090, 41089, 41089, 41090, 41093, 41070, 41033, 41057, 41088, 41080, 41049, 41063, 41082, 41092, 41088, 41093, 41095, 41081, 41008, 41065, 41067, 41065, 41069, 41061, 41057, 41069, 41065, 41079, 41055, 41053, 41078, 41070, 41068, 41077, 41076, 41067};

    private static void a(short s, byte b, short s2, Object[] objArr) {
        int i = (s2 * 38) + 77;
        int i2 = 40 - (s * 25);
        int i3 = 17 - (b * 14);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2];
        int i4 = -1;
        int i5 = i2 - 1;
        if (bArr == null) {
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i4 = -1;
            i = (i + i5) - 13;
            i5 = i5;
            i3 = i3;
        }
        while (true) {
            int i6 = i4 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3 + 1;
            byte b2 = bArr[i7];
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i4 = i6;
            i = (i + b2) - 13;
            i5 = i5;
            i3 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 7
            int r7 = 23 - r7
            int r9 = 106 - r9
            byte[] r0 = o.setErrorContentDescription.MenuHostHelper$$ExternalSyntheticLambda0
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L31
        L16:
            r3 = 0
        L17:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L31:
            int r10 = r10 - r8
            int r8 = r10 + (-4)
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setErrorContentDescription.c(byte, byte, short, java.lang.Object[]):void");
    }

    private static void d(short s, short s2, int i, Object[] objArr) {
        int i2 = 40 - i;
        int i3 = 115 - (s2 * 2);
        byte[] bArr = $$d;
        int i4 = s + 4;
        byte[] bArr2 = new byte[i2];
        int i5 = -1;
        int i6 = i2 - 1;
        if (bArr == null) {
            i4++;
            i3 += -i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i4];
            i4++;
            i3 += -b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = o.setErrorContentDescription.$$g
            int r9 = 111 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r10
            r10 = r8
            goto L32
        L17:
            r3 = 0
            r6 = r9
            r9 = r8
            r8 = r6
        L1b:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r7]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L32:
            int r9 = -r9
            int r8 = r8 + r9
            int r7 = r7 + 1
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setErrorContentDescription.e(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x036b  */
    @Override // android.animation.ValueAnimator, android.animation.Animator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ android.animation.Animator setDuration(long r26) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setErrorContentDescription.setDuration(long):android.animation.Animator");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.clear();
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.setY.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.setY.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.setY.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.setY) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY() {
        for (Animator.AnimatorListener animatorListener : this.setY) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.setY) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        for (Animator.AnimatorListener animatorListener : this.setY) {
            animatorListener.onAnimationCancel(this);
        }
    }

    public final void setX() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.MenuHostHelper$$ExternalSyntheticLambda1) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    private static void b(int[] iArr, byte[] bArr, boolean z, Object[] objArr) {
        int i;
        jx jxVar = new jx();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = setIconTintList;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i2] = Integer.valueOf(cArr[i7]);
                    Object obj = jC.setTextScaleX.get(-2065108825);
                    if (obj == null) {
                        byte b = (byte) i2;
                        byte b2 = b;
                        Object[] objArr3 = new Object[1];
                        e(b, b2, (byte) (b2 + 3), objArr3);
                        obj = ((Class) jC.setY((-16777176) - Color.rgb(i2, i2, i2), (char) (35090 - (ViewConfiguration.getLongPressTimeout() >> 16)), 6 - (TypedValue.complexToFraction(i2, f, f) > f ? 1 : (TypedValue.complexToFraction(i2, f, f) == f ? 0 : -1)))).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-2065108825, obj);
                    }
                    cArr2[i7] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    i2 = 0;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            char c = 0;
            while (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 < i4) {
                if (bArr[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] == 1) {
                    int i8 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c)};
                        Object obj2 = jC.setTextScaleX.get(1237805447);
                        if (obj2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            Object[] objArr5 = new Object[1];
                            e(b3, b4, (byte) (b4 + 2), objArr5);
                            obj2 = ((Class) jC.setY((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 272, (char) TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0, 0) + 4)).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(1237805447, obj2);
                        }
                        cArr4[i8] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i9 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                    try {
                        Object[] objArr6 = {Integer.valueOf(cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c)};
                        Object obj3 = jC.setTextScaleX.get(997913035);
                        if (obj3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            Object[] objArr7 = new Object[1];
                            e(b5, b6, (byte) (b6 + 1), objArr7);
                            obj3 = ((Class) jC.setY(269 - View.resolveSize(0, 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(997913035, obj3);
                        }
                        cArr4[i9] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c = cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0];
                try {
                    Object[] objArr8 = {jxVar, jxVar};
                    Object obj4 = jC.setTextScaleX.get(1233791110);
                    if (obj4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        Object[] objArr9 = new Object[1];
                        e(b7, b8, b8, objArr9);
                        obj4 = ((Class) jC.setY(236 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.getTrimmedLength(""), 4 - KeyEvent.keyCodeFromString(""))).getMethod((String) objArr9[0], Object.class, Object.class);
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
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i10 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i10, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i10);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i4];
            while (true) {
                jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i4) {
                    break;
                }
                cArr6[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr3[(i4 - jxVar.MenuHostHelper$$ExternalSyntheticLambda0) - 1];
                i = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i11 = 0;
            while (true) {
                jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i11;
                if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i4) {
                    break;
                }
                cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] - iArr[2]);
                i11 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }
}