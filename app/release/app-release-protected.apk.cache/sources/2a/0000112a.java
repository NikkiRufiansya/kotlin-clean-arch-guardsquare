package o;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Method;
import o.setBaselineAlignBottom;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474t extends LinearLayout {
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    View.OnLongClickListener MenuHostHelper$$ExternalSyntheticLambda1;
    final TextView setIconTintList;
    PorterDuff.Mode setOnLongClickListener;
    final setMinAndMaxFrame setUiOptions;
    final C0447s setUnboundedRipple;
    CharSequence setX;
    ColorStateList setY;
    public static final byte[] $$a = {96, 83, 72, -80};
    public static final int $$b = 145;
    public static final byte[] setNavigationOnClickListener = {27, 47, 26, 29, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setLayoutAnimation = 143;
    private static char[] setTextAlignment = {41040, 41132, 41130, 41142, 41116, 41115, 41130, 41143, 41136, 41149, 41133, 41091, 41107, 41138, 41109, 41098, 41133, 41143, 41139, 41128, 41130, 41132, 41041, 41132, 41125, 41127, 41125, 41112, 41124, 41122, 41135, 41133, 41127, 41114, 41106, 41106, 41113, 41108, 41251, 41250, 41258, 41256, 41255, 41263, 41279, 41271, 41270, 41270, 41271, 41258, 41235, 41214, 41238, 41269, 41261, 41230, 41228, 41263, 41257, 41269, 41258, 41260, 41262, 40999, 41055, 41079, 41065, 41069, 41057, 41061, 41069, 41065, 41067, 41065, 41071, 41067, 41076, 41077, 41068, 41070, 41078};

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r6 = r6 + 108
            byte[] r0 = o.C0474t.$$a
            int r7 = r7 * 2
            int r7 = 1 - r7
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
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L36:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0474t.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 106 - r6
            byte[] r0 = o.C0474t.setNavigationOnClickListener
            int r8 = r8 * 2
            int r8 = 16 - r8
            int r7 = r7 * 15
            int r7 = 19 - r7
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L32
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L32:
            int r6 = r6 + r8
            int r6 = r6 + 2
            int r7 = r7 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0474t.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0474t(C0447s c0447s, setExpandedHintEnabled setexpandedhintenabled) {
        super(c0447s.getContext());
        CharSequence unboundedRipple;
        this.setUnboundedRipple = c0447s;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        setMinAndMaxFrame setminandmaxframe = (setMinAndMaxFrame) LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d002f, (ViewGroup) this, false);
        this.setUiOptions = setminandmaxframe;
        C0146f.setIconTintList(setminandmaxframe);
        getStableInsets getstableinsets = new getStableInsets(getContext());
        this.setIconTintList = getstableinsets;
        if (getContext().getResources().getConfiguration().fontScale >= 1.3f) {
            setImeHintLocales.setX((ViewGroup.MarginLayoutParams) this.setUiOptions.getLayoutParams(), 0);
        }
        setMinAndMaxFrame setminandmaxframe2 = this.setUiOptions;
        View.OnLongClickListener onLongClickListener = this.MenuHostHelper$$ExternalSyntheticLambda1;
        setminandmaxframe2.setOnClickListener(null);
        C0146f.setY(setminandmaxframe2, onLongClickListener);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        setMinAndMaxFrame setminandmaxframe3 = this.setUiOptions;
        setminandmaxframe3.setOnLongClickListener(null);
        C0146f.setY(setminandmaxframe3, (View.OnLongClickListener) null);
        if (setexpandedhintenabled.setLayoutAnimation(62)) {
            this.setY = setFastScrollEnabled.setX(getContext(), setexpandedhintenabled, 62);
        }
        if (setexpandedhintenabled.setLayoutAnimation(63)) {
            this.setOnLongClickListener = setTitleMargin.setY(setexpandedhintenabled.MenuHostHelper$$ExternalSyntheticLambda0(63, -1), null);
        }
        if (setexpandedhintenabled.setLayoutAnimation(61)) {
            setIconTintList(setexpandedhintenabled.MenuHostHelper$$ExternalSyntheticLambda0(61));
            if (setexpandedhintenabled.setLayoutAnimation(60) && this.setUiOptions.getContentDescription() != (unboundedRipple = setexpandedhintenabled.setUnboundedRipple(60))) {
                this.setUiOptions.setContentDescription(unboundedRipple);
            }
            this.setUiOptions.setCheckable(setexpandedhintenabled.setIconTintList(59, true));
        }
        this.setIconTintList.setVisibility(8);
        this.setIconTintList.setId(R.id.res_0x7f0a01f6);
        this.setIconTintList.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.setIconTintList.setAccessibilityLiveRegion(1);
        setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList, setexpandedhintenabled.setNavigationOnClickListener(55, 0));
        if (setexpandedhintenabled.setLayoutAnimation(56)) {
            this.setIconTintList.setTextColor(setexpandedhintenabled.setY(56));
        }
        CharSequence unboundedRipple2 = setexpandedhintenabled.setUnboundedRipple(54);
        this.setX = TextUtils.isEmpty(unboundedRipple2) ? null : unboundedRipple2;
        this.setIconTintList.setText(unboundedRipple2);
        setIconTintList();
        addView(setminandmaxframe);
        addView(getstableinsets);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setY();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(Drawable drawable) {
        this.setUiOptions.setImageDrawable(drawable);
        if (drawable != null) {
            C0146f.setX(this.setUnboundedRipple, this.setUiOptions, this.setY, this.setOnLongClickListener);
            setY(true);
            C0146f.MenuHostHelper$$ExternalSyntheticLambda1(this.setUnboundedRipple, this.setUiOptions, this.setY);
            return;
        }
        setY(false);
        setMinAndMaxFrame setminandmaxframe = this.setUiOptions;
        View.OnLongClickListener onLongClickListener = this.MenuHostHelper$$ExternalSyntheticLambda1;
        setminandmaxframe.setOnClickListener(null);
        C0146f.setY(setminandmaxframe, onLongClickListener);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        setMinAndMaxFrame setminandmaxframe2 = this.setUiOptions;
        setminandmaxframe2.setOnLongClickListener(null);
        C0146f.setY(setminandmaxframe2, (View.OnLongClickListener) null);
        if (this.setUiOptions.getContentDescription() != null) {
            this.setUiOptions.setContentDescription(null);
        }
    }

    private void setY() {
        EditText editText = this.setUnboundedRipple.setUnboundedRipple;
        if (editText == null) {
            return;
        }
        setBaselineAlignBottom.setX.setX(this.setIconTintList, this.setUiOptions.getVisibility() == 0 ? 0 : setBaselineAlignBottom.setAnimationFromJson(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.res_0x7f070189), editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList() {
        int i = (this.setX == null || this.MenuHostHelper$$ExternalSyntheticLambda0) ? 8 : 0;
        setVisibility(this.setUiOptions.getVisibility() == 0 || i == 0 ? 0 : 8);
        this.setIconTintList.setVisibility(i);
        this.setUnboundedRipple.setIconTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(boolean z) {
        if ((this.setUiOptions.getVisibility() == 0) != z) {
            this.setUiOptions.setVisibility(z ? 0 : 8);
            setY();
            setIconTintList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int[] iArr, byte[] bArr, boolean z, Object[] objArr) {
        int i;
        jx jxVar = new jx();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = setTextAlignment;
        long j = 0;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i4];
                    objArr2[i2] = Integer.valueOf(cArr[i8]);
                    Object obj = jC.setTextScaleX.get(-2065108825);
                    if (obj == null) {
                        byte b = (byte) i2;
                        byte b2 = b;
                        Object[] objArr3 = new Object[1];
                        a(b, b2, b2, objArr3);
                        obj = ((Class) jC.setY((AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 40, (char) (35090 - (TypedValue.complexToFraction(i2, f, f) > f ? 1 : (TypedValue.complexToFraction(i2, f, f) == f ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(i2, i2) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i2, i2) == j ? 0 : -1)) + 7)).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-2065108825, obj);
                    }
                    cArr2[i8] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 0;
                    i4 = 1;
                    j = 0;
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            char c = 0;
            while (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 < i5) {
                if (bArr[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] == 1) {
                    int i9 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c)};
                        Object obj2 = jC.setTextScaleX.get(1237805447);
                        if (obj2 == null) {
                            byte b3 = (byte) ($$b & 7);
                            byte b4 = (byte) (b3 - 1);
                            Object[] objArr5 = new Object[1];
                            a(b3, b4, b4, objArr5);
                            obj2 = ((Class) jC.setY(273 - Color.alpha(0), (char) TextUtils.getOffsetAfter("", 0), 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(1237805447, obj2);
                        }
                        cArr4[i9] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
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
                        Object[] objArr6 = {Integer.valueOf(cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c)};
                        Object obj3 = jC.setTextScaleX.get(997913035);
                        if (obj3 == null) {
                            byte b5 = (byte) 2;
                            byte b6 = (byte) (b5 - 2);
                            Object[] objArr7 = new Object[1];
                            a(b5, b6, b6, objArr7);
                            obj3 = ((Class) jC.setY(270 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 4)).getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(997913035, obj3);
                        }
                        cArr4[i10] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
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
                        byte b7 = (byte) 3;
                        byte b8 = (byte) (b7 - 3);
                        Object[] objArr9 = new Object[1];
                        a(b7, b8, b8, objArr9);
                        obj4 = ((Class) jC.setY(235 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), KeyEvent.normalizeMetaState(0) + 4)).getMethod((String) objArr9[0], Object.class, Object.class);
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
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i11 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i11, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i11);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i5) {
                    break;
                }
                cArr6[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr3[(i5 - jxVar.MenuHostHelper$$ExternalSyntheticLambda0) - 1];
                i = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i12 = 0;
            while (true) {
                jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i12;
                if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i5) {
                    break;
                }
                cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] - iArr[2]);
                i12 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }
}