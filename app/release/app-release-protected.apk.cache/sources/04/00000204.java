package o;

import android.content.Context;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Checkable;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
import o.setBaselineAlignBottom;
import o.setCheckMarkTintBlendMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class N extends setMIndicatorOptions {
    setIconTintList MenuHostHelper$$ExternalSyntheticLambda0;
    final C0530v MenuHostHelper$$ExternalSyntheticLambda1;
    final setOnCloseListener setIconTintList;
    final setCheckMarkTintBlendMode setLayoutAnimation;
    private final C0616y setNavigationOnClickListener;
    private final View.OnClickListener setOnLongClickListener;
    setY setUiOptions;
    N$MenuHostHelper$$ExternalSyntheticLambda1 setX;
    final setOnCloseListener setY;

    /* loaded from: classes.dex */
    interface setIconTintList {
        void setMinEms();
    }

    /* loaded from: classes.dex */
    interface setY {
        void setX(int i);
    }

    public N(Context context) {
        this(context, null);
    }

    public N(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public N(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setOnLongClickListener = new View.OnClickListener() { // from class: o.N.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (N.this.setUiOptions != null) {
                    N.this.setUiOptions.setX(((Integer) view.getTag(R.id.res_0x7f0a01ab)).intValue());
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.res_0x7f0d004f, this);
        this.setNavigationOnClickListener = (C0616y) findViewById(R.id.res_0x7f0a0115);
        setCheckMarkTintBlendMode setcheckmarktintblendmode = (setCheckMarkTintBlendMode) findViewById(R.id.res_0x7f0a0119);
        this.setLayoutAnimation = setcheckmarktintblendmode;
        setcheckmarktintblendmode.MenuHostHelper$$ExternalSyntheticLambda1.add(new setCheckMarkTintBlendMode.setIconTintList() { // from class: o.K
            public static final byte[] $$g = {18, 119, 36, -59};
            public static final int $$h = 123;
            public static final byte[] $$d = {42, -75, 2, 31, 14, -15, 43, -26, -12, 1, 26, -21, -5, -6, 40, -29, -10, -1, 65, -69, 14, -15, 32, -17, -19, 4, 48, -33, -7, 7, -2, 6, -19, 15, 65, -17, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -72, 40, 42, -79, 14, -15, 27};
            public static final int $$e = 97;
            public static final byte[] $$a = {82, -89, -124, -60, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
            public static final int $$b = 230;
            private static byte[] setNavigationOnClickListener = {120, 42, -65, -64, 21, -2, 22, 5, 2, 3, -46, 61, 20, 7, 14, -7, 17, 14, -62, 29, 52, 7, 14, -7, 27, 4};
            public static final int setY = 71;
            private static char[] setX = {34056, 34075, 34061, 34079, 34074, 34048, 34267, 34078, 34302, 34064, 34077, 34060, 34052, 34286, 34053, 34062, 34054, 34073, 34303, 34280, 34067, 34301, 34049, 34076};
            private static boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
            private static boolean setUnboundedRipple = true;
            private static int setIconTintList = -1400797783;

            /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void a(int r7, int r8, short r9, java.lang.Object[] r10) {
                /*
                    byte[] r0 = o.K.$$a
                    int r7 = r7 * 25
                    int r7 = 40 - r7
                    int r9 = r9 * 38
                    int r9 = r9 + 77
                    int r8 = r8 + 4
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L19
                    r3 = r1
                    r5 = 0
                    r1 = r0
                    r0 = r10
                    r10 = r9
                    r9 = r8
                    r8 = r7
                    goto L35
                L19:
                    r3 = 0
                L1a:
                    byte r4 = (byte) r9
                    int r5 = r3 + 1
                    r1[r3] = r4
                    int r8 = r8 + 1
                    if (r5 != r7) goto L2b
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L2b:
                    r3 = r0[r8]
                    r6 = r8
                    r8 = r7
                    r7 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r10
                    r10 = r9
                    r9 = r6
                L35:
                    int r10 = r10 + r7
                    int r7 = r10 + (-13)
                    r10 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r5
                    r6 = r9
                    r9 = r7
                    r7 = r8
                    r8 = r6
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: o.K.a(int, int, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0033). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void c(byte r8, short r9, byte r10, java.lang.Object[] r11) {
                /*
                    int r8 = r8 * 2
                    int r8 = r8 + 77
                    byte[] r0 = o.K.$$d
                    int r10 = 74 - r10
                    int r9 = r9 + 9
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r8 = r9
                    r3 = r1
                    r4 = 0
                    r1 = r0
                    r0 = r11
                    r11 = r10
                    goto L33
                L16:
                    r3 = 0
                L17:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r9) goto L26
                    java.lang.String r8 = new java.lang.String
                    r8.<init>(r1, r2)
                    r11[r2] = r8
                    return
                L26:
                    int r10 = r10 + 1
                    r3 = r0[r10]
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    r7 = r11
                    r11 = r10
                    r10 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r7
                L33:
                    int r10 = -r10
                    int r9 = r9 + r10
                    r10 = r11
                    r11 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: o.K.c(byte, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0030 -> B:11:0x0038). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void d(byte r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 2
                    int r7 = 1 - r7
                    int r6 = r6 * 2
                    int r6 = r6 + 4
                    int r8 = r8 * 2
                    int r8 = r8 + 66
                    byte[] r0 = o.K.$$g
                    byte[] r1 = new byte[r7]
                    int r7 = r7 + (-1)
                    r2 = 0
                    if (r0 != 0) goto L1c
                    r3 = r1
                    r4 = 0
                    r1 = r0
                    r0 = r9
                    r9 = r7
                    r7 = r6
                    goto L38
                L1c:
                    r3 = 0
                    r5 = r7
                    r7 = r6
                    r6 = r8
                    r8 = r5
                L21:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L30
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L30:
                    r3 = r0[r7]
                    r5 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r5
                L38:
                    int r8 = -r8
                    int r6 = r6 + r8
                    int r7 = r7 + 1
                    r8 = r9
                    r9 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: o.K.d(byte, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x025f A[Catch: all -> 0x0547, TRY_LEAVE, TryCatch #4 {all -> 0x0547, blocks: (B:13:0x01c6, B:17:0x0258, B:19:0x025f, B:59:0x053c), top: B:87:0x01c6 }] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x03eb  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0525  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x055a  */
            /* JADX WARN: Removed duplicated region for block: B:91:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x053c -> B:60:0x053e). Please submit an issue!!! */
            @Override // o.setCheckMarkTintBlendMode.setIconTintList
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void MenuHostHelper$$ExternalSyntheticLambda1(int r37, boolean r38) {
                /*
                    Method dump skipped, instructions count: 1425
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.K.MenuHostHelper$$ExternalSyntheticLambda1(int, boolean):void");
            }

            private static void b(char[] cArr, int i2, byte[] bArr, int[] iArr, Object[] objArr) {
                jt jtVar = new jt();
                char[] cArr2 = setX;
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
                                byte b = (byte) i3;
                                byte b2 = b;
                                Object[] objArr3 = new Object[1];
                                d(b, b2, (byte) (b2 + 1), objArr3);
                                obj = ((Class) jC.setY(TextUtils.indexOf("", "", i3, i3) + 232, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 4 - (ViewConfiguration.getEdgeSlop() >> 16))).getMethod((String) objArr3[0], Integer.TYPE);
                                jC.setTextScaleX.put(-2024796271, obj);
                            }
                            cArr3[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                            i4++;
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
                    Object[] objArr4 = {Integer.valueOf(setIconTintList)};
                    Object obj2 = jC.setTextScaleX.get(-192560398);
                    float f = 0.0f;
                    if (obj2 == null) {
                        obj2 = ((Class) jC.setY((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 357, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31792), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5)).getMethod("C", Integer.TYPE);
                        jC.setTextScaleX.put(-192560398, obj2);
                    }
                    int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                    if (setUnboundedRipple) {
                        jtVar.setIconTintList = bArr.length;
                        char[] cArr4 = new char[jtVar.setIconTintList];
                        jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                        while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                            cArr4[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[bArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] + i2] - intValue);
                            try {
                                Object[] objArr5 = {jtVar, jtVar};
                                Object obj3 = jC.setTextScaleX.get(258277102);
                                if (obj3 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    Object[] objArr6 = new Object[1];
                                    d(b3, b4, b4, objArr6);
                                    obj3 = ((Class) jC.setY(210 - (ViewConfiguration.getTouchSlop() >> 8), (char) TextUtils.getOffsetAfter("", 0), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 4)).getMethod((String) objArr6[0], Object.class, Object.class);
                                    jC.setTextScaleX.put(258277102, obj3);
                                }
                                ((Method) obj3).invoke(null, objArr5);
                                f = 0.0f;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        objArr[0] = new String(cArr4);
                    } else if (MenuHostHelper$$ExternalSyntheticLambda0) {
                        jtVar.setIconTintList = cArr.length;
                        char[] cArr5 = new char[jtVar.setIconTintList];
                        jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                        while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                            cArr5[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[cArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i2] - intValue);
                            try {
                                Object[] objArr7 = {jtVar, jtVar};
                                Object obj4 = jC.setTextScaleX.get(258277102);
                                if (obj4 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    Object[] objArr8 = new Object[1];
                                    d(b5, b6, b6, objArr8);
                                    obj4 = ((Class) jC.setY((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 210, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 4)).getMethod((String) objArr8[0], Object.class, Object.class);
                                    jC.setTextScaleX.put(258277102, obj4);
                                }
                                ((Method) obj4).invoke(null, objArr7);
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
                                cArr6[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[iArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i2] - intValue);
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
        });
        this.setIconTintList = (setOnCloseListener) findViewById(R.id.res_0x7f0a011e);
        this.setY = (setOnCloseListener) findViewById(R.id.res_0x7f0a011b);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = (C0530v) findViewById(R.id.res_0x7f0a0116);
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: o.N.5
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                setIconTintList seticontintlist = N.this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (seticontintlist != null) {
                    seticontintlist.setMinEms();
                    return true;
                }
                return false;
            }
        });
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: o.N.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.setIconTintList.setOnTouchListener(onTouchListener);
        this.setY.setOnTouchListener(onTouchListener);
        this.setIconTintList.setTag(R.id.res_0x7f0a01ab, 12);
        this.setY.setTag(R.id.res_0x7f0a01ab, 10);
        this.setIconTintList.setOnClickListener(this.setOnLongClickListener);
        this.setY.setOnClickListener(this.setOnLongClickListener);
        this.setIconTintList.setAccessibilityClassName("android.view.View");
        this.setY.setAccessibilityClassName("android.view.View");
    }

    public void setMinuteHourDelegate(setCounterOverflowTextColor setcounteroverflowtextcolor) {
        setBaselineAlignBottom.setX(this.setY, setcounteroverflowtextcolor);
    }

    public void setHourClickDelegate(setCounterOverflowTextColor setcounteroverflowtextcolor) {
        setBaselineAlignBottom.setX(this.setIconTintList, setcounteroverflowtextcolor);
    }

    public void setValues(String[] strArr, int i) {
        this.setNavigationOnClickListener.setValues(strArr, i);
    }

    public void setHandRotation(float f) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setHandRotation(f);
    }

    public void setHandRotation(float f, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setHandRotation(f, z);
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setAnimateOnTouchUp(z);
    }

    public void setActiveSelection(int i) {
        setOnCloseListener setoncloselistener = this.setIconTintList;
        boolean z = i == 12;
        setoncloselistener.setChecked(z);
        setoncloselistener.setAccessibilityLiveRegion(z ? 2 : 0);
        setOnCloseListener setoncloselistener2 = this.setY;
        boolean z2 = i == 10;
        setoncloselistener2.setChecked(z2);
        setoncloselistener2.setAccessibilityLiveRegion(z2 ? 2 : 0);
    }

    public void setOnActionUpListener(v$MenuHostHelper$$ExternalSyntheticLambda1 v_menuhosthelper__externalsyntheticlambda1) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setOnActionUpListener(v_menuhosthelper__externalsyntheticlambda1);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        int x;
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx;
        if (this.setLayoutAnimation.getVisibility() == 0) {
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1();
            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY(this);
            x = setBaselineAlignBottom.setX.setX(this);
            char c = x == 0 ? (char) 2 : (char) 1;
            if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.containsKey(Integer.valueOf((int) R.id.res_0x7f0a0114)) && (setx = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.get(Integer.valueOf((int) R.id.res_0x7f0a0114))) != null) {
                if (c == 1) {
                    setx.setY.setObjectValues = -1;
                    setx.setY.setFilterTouchesWhenObscured = -1;
                    setx.setY.setAdapter = -1;
                    setx.setY.setGuidelinePercent = Integer.MIN_VALUE;
                } else {
                    setx.setY.setTooltipText = -1;
                    setx.setY.getCallingPid = -1;
                    setx.setY.onActivityResumed = -1;
                    setx.setY.setMinAndMaxProgress = Integer.MIN_VALUE;
                }
            }
            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList(this);
        }
    }
}