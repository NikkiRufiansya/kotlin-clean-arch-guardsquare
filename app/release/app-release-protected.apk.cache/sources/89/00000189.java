package o;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Locale;
import o.N;
import o.setCheckMarkTintBlendMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class E implements N.setY, G {
    final C0559w MenuHostHelper$$ExternalSyntheticLambda1;
    private final LinearLayout setChipCornerRadius;
    final D setIconTintList;
    private final EditText setNavigationOnClickListener;
    private final F setOnLongClickListener;
    private setCheckMarkTintBlendMode setTextAlignment;
    private final EditText setUnboundedRipple;
    final C0559w setY;
    public static final byte[] $$a = {104, -34, -42, -1};
    public static final int $$b = 41;
    public static final byte[] setX = {65, 51, -100, -34, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12};
    public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 228;
    private static char setIconSize = 25551;
    private static long ViewPager$SavedState$1 = -6862065015268909492L;
    private static int setCenterIfNoTextEnabled = -1287463348;
    private final TextWatcher setUiOptions = new setOnShow() { // from class: o.E.1
        @Override // o.setOnShow, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            try {
                if (!TextUtils.isEmpty(editable)) {
                    E.this.setIconTintList.setY = Integer.parseInt(editable.toString()) % 60;
                    return;
                }
                E.this.setIconTintList.setY = 0;
            } catch (NumberFormatException unused) {
            }
        }
    };
    private final TextWatcher setLayoutAnimation = new setOnShow() { // from class: o.E.4
        @Override // o.setOnShow, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    E.this.setIconTintList.setY(0);
                    return;
                }
                E.this.setIconTintList.setY(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 7
            int r8 = 23 - r8
            byte[] r0 = o.E.setX
            int r7 = 106 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L33
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L33:
            int r8 = r8 - r6
            int r6 = r7 + 1
            int r7 = r8 + (-4)
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.E.b(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 100 - r6
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r8 = r8 + 4
            byte[] r0 = o.E.$$a
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L32
        L17:
            r3 = 0
        L18:
            byte r4 = (byte) r6
            int r8 = r8 + 1
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L32:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.E.c(int, short, short, java.lang.Object[]):void");
    }

    public E(LinearLayout linearLayout, D d) {
        this.setChipCornerRadius = linearLayout;
        this.setIconTintList = d;
        Resources resources = linearLayout.getResources();
        C0559w c0559w = (C0559w) linearLayout.findViewById(R.id.res_0x7f0a011d);
        this.setY = c0559w;
        C0559w c0559w2 = (C0559w) linearLayout.findViewById(R.id.res_0x7f0a011a);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = c0559w2;
        ((TextView) c0559w.findViewById(R.id.res_0x7f0a011c)).setText(resources.getString(R.string.res_0x7f140062));
        ((TextView) c0559w2.findViewById(R.id.res_0x7f0a011c)).setText(resources.getString(R.string.res_0x7f140061));
        c0559w.setTag(R.id.res_0x7f0a01ab, 12);
        c0559w2.setTag(R.id.res_0x7f0a01ab, 10);
        if (d.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
            setCheckMarkTintBlendMode setcheckmarktintblendmode = (setCheckMarkTintBlendMode) this.setChipCornerRadius.findViewById(R.id.res_0x7f0a0119);
            this.setTextAlignment = setcheckmarktintblendmode;
            setcheckmarktintblendmode.MenuHostHelper$$ExternalSyntheticLambda1.add(new setCheckMarkTintBlendMode.setIconTintList() { // from class: o.H
                @Override // o.setCheckMarkTintBlendMode.setIconTintList
                public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, boolean z) {
                    E e = E.this;
                    if (z) {
                        e.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(i == R.id.res_0x7f0a0118 ? 1 : 0);
                    }
                }
            });
            this.setTextAlignment.setVisibility(0);
            setIconTintList();
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.E.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                E.this.setX(((Integer) view.getTag(R.id.res_0x7f0a01ab)).intValue());
            }
        };
        c0559w2.setOnClickListener(onClickListener);
        c0559w.setOnClickListener(onClickListener);
        c0559w2.setIconTintList(d.MenuHostHelper$$ExternalSyntheticLambda1);
        c0559w.setIconTintList(d.setX);
        this.setNavigationOnClickListener = c0559w2.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple;
        this.setUnboundedRipple = c0559w.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple;
        this.setOnLongClickListener = new F(c0559w2, c0559w, d);
        c0559w2.setChipDelegate(new C0587x(linearLayout.getContext(), R.string.res_0x7f140054, d) { // from class: o.E.2
            private /* synthetic */ D setY;

            {
                this.setY = d;
            }

            @Override // o.C0587x, o.setCounterOverflowTextColor
            public final void setY(View view, setDecorPadding setdecorpadding) {
                super.setY(view, setdecorpadding);
                setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(view.getResources().getString(R.string.res_0x7f140055, String.valueOf(this.setY.MenuHostHelper$$ExternalSyntheticLambda0())));
            }
        });
        c0559w.setChipDelegate(new C0587x(linearLayout.getContext(), R.string.res_0x7f140056, d) { // from class: o.E.5
            private /* synthetic */ D setIconTintList;

            {
                this.setIconTintList = d;
            }

            @Override // o.C0587x, o.setCounterOverflowTextColor
            public final void setY(View view, setDecorPadding setdecorpadding) {
                super.setY(view, setdecorpadding);
                setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(view.getResources().getString(R.string.res_0x7f140057, String.valueOf(this.setIconTintList.setY)));
            }
        });
        this.setNavigationOnClickListener.addTextChangedListener(this.setLayoutAnimation);
        this.setUnboundedRipple.addTextChangedListener(this.setUiOptions);
        MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList);
        F f = this.setOnLongClickListener;
        C0447s c0447s = f.setX.MenuHostHelper$$ExternalSyntheticLambda0;
        C0447s c0447s2 = f.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
        EditText editText = c0447s.setUnboundedRipple;
        EditText editText2 = c0447s2.setUnboundedRipple;
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(f);
        editText.setOnKeyListener(f);
        editText2.setOnKeyListener(f);
    }

    private void setIconTintList() {
        setCheckMarkTintBlendMode setcheckmarktintblendmode = this.setTextAlignment;
        if (setcheckmarktintblendmode == null) {
            return;
        }
        setcheckmarktintblendmode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setOnLongClickListener == 0 ? R.id.res_0x7f0a0117 : R.id.res_0x7f0a0118, true);
    }

    @Override // o.N.setY
    public final void setX(int i) {
        this.setIconTintList.setUnboundedRipple = i;
        this.setY.setChecked(i == 12);
        this.MenuHostHelper$$ExternalSyntheticLambda1.setChecked(i == 10);
        setIconTintList();
    }

    @Override // o.G
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setChipCornerRadius.setVisibility(0);
        setX(this.setIconTintList.setUnboundedRipple);
    }

    @Override // o.G
    public final void setX() {
        InputMethodManager inputMethodManager;
        View focusedChild = this.setChipCornerRadius.getFocusedChild();
        if (focusedChild != null && (inputMethodManager = (InputMethodManager) setLineHeight.MenuHostHelper$$ExternalSyntheticLambda1(focusedChild.getContext(), InputMethodManager.class)) != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.setChipCornerRadius.setVisibility(8);
    }

    @Override // o.G
    public final void setY() {
        MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(D d) {
        this.setNavigationOnClickListener.removeTextChangedListener(this.setLayoutAnimation);
        this.setUnboundedRipple.removeTextChangedListener(this.setUiOptions);
        Locale locale = this.setChipCornerRadius.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(d.setY));
        String format2 = String.format(locale, "%02d", Integer.valueOf(d.MenuHostHelper$$ExternalSyntheticLambda0()));
        this.setY.setText(format);
        this.MenuHostHelper$$ExternalSyntheticLambda1.setText(format2);
        this.setNavigationOnClickListener.addTextChangedListener(this.setLayoutAnimation);
        this.setUnboundedRipple.addTextChangedListener(this.setUiOptions);
        setIconTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(char c, char[] cArr, char[] cArr2, char[] cArr3, int i, Object[] objArr) {
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
                    byte b = (byte) ($$a[3] + 1);
                    Object[] objArr3 = new Object[1];
                    c(b, b, $$a[3], objArr3);
                    obj = ((Class) jC.setY(248 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).getMethod((String) objArr3[0], Object.class);
                    jC.setTextScaleX.put(-608911091, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr4 = {jzVar};
                    Object obj2 = jC.setTextScaleX.get(-12754601);
                    if (obj2 == null) {
                        byte b2 = (byte) (-$$a[3]);
                        Object[] objArr5 = new Object[1];
                        c(b2, (byte) (b2 - 1), $$a[3], objArr5);
                        obj2 = ((Class) jC.setY(ExpandableListView.getPackedPositionGroup(0L) + 313, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 4)).getMethod((String) objArr5[0], Object.class);
                        jC.setTextScaleX.put(-12754601, obj2);
                    }
                    int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                    try {
                        Object[] objArr6 = {jzVar, Integer.valueOf(cArr4[jzVar.setX % 4] * 32718), Integer.valueOf(cArr5[intValue])};
                        Object obj3 = jC.setTextScaleX.get(1073727806);
                        if (obj3 == null) {
                            byte b3 = (byte) 2;
                            Object[] objArr7 = new Object[1];
                            c(b3, (byte) (b3 - 2), $$a[3], objArr7);
                            obj3 = ((Class) jC.setY(325 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 61129), 4 - Drawable.resolveOpacity(0, 0))).getMethod((String) objArr7[0], Object.class, Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(1073727806, obj3);
                        }
                        ((Method) obj3).invoke(null, objArr6);
                        try {
                            Object[] objArr8 = {Integer.valueOf(cArr4[intValue2] * 32718), Integer.valueOf(cArr5[intValue])};
                            Object obj4 = jC.setTextScaleX.get(1861722205);
                            if (obj4 == null) {
                                obj4 = ((Class) jC.setY(368 - ExpandableListView.getPackedPositionChild(0L), (char) KeyEvent.getDeadChar(0, 0), 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("a", Integer.TYPE, Integer.TYPE);
                                jC.setTextScaleX.put(1861722205, obj4);
                            }
                            cArr5[intValue2] = ((Character) ((Method) obj4).invoke(null, objArr8)).charValue();
                            cArr4[intValue2] = jzVar.setIconTintList;
                            cArr6[jzVar.setX] = (char) ((((cArr4[intValue2] ^ cArr[jzVar.setX]) ^ (ViewPager$SavedState$1 ^ (-6862065015268909492L))) ^ ((int) (setCenterIfNoTextEnabled ^ (-6862065015268909492L)))) ^ ((char) (setIconSize ^ (-6862065015268909492L))));
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
}