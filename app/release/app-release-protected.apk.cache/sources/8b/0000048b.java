package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C0447s;
import o.setBaselineAlignBottom;
import o.setEnsureMinTouchTargetSize;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174g extends LinearLayout {
    final TextWatcher MenuHostHelper$$ExternalSyntheticLambda0;
    final g$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    final setMinAndMaxFrame ViewPager$SavedState$1;
    final TextView setAnimationFromJson;
    PorterDuff.Mode setCenterIfNoTextEnabled;
    View.OnLongClickListener setChipCornerRadius;
    private final s$MenuHostHelper$$ExternalSyntheticLambda1 setGuidelinePercent;
    ColorStateList setIconSize;
    final AccessibilityManager setIconTintList;
    int setLayoutAnimation;
    setCloseIconEnabledResource$MenuHostHelper$$ExternalSyntheticLambda1 setMaxEms;
    private final LinkedHashSet<C0447s.setX> setMinAndMaxProgress;
    View.OnLongClickListener setNavigationOnClickListener;
    final setMinAndMaxFrame setOnLongClickListener;
    CharSequence setOnNavigationItemSelectedListener;
    boolean setTextAlignment;
    ColorStateList setUiOptions;
    PorterDuff.Mode setUnboundedRipple;
    EditText setX;
    final FrameLayout setY;
    final C0447s setZ;
    public static final byte[] $$g = {49, 16, -25, 45};
    public static final int $$h = 181;
    public static final byte[] $$d = {83, -75, 7, 97, 65, -63, -1, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 48, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -72, 40, 42, -79, 14, -15, 27};
    public static final int $$e = 78;
    public static final byte[] $$a = {116, 39, -17, 64, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
    public static final int $$b = 61;
    private static byte[] setCheckedIconEnabled = {64, 19, 79, -17, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
    public static final int setTextScaleX = 121;
    private static long setLayoutDirection = -5630915343155721564L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r8, byte r9, int r10, java.lang.Object[] r11) {
        /*
            int r8 = r8 * 38
            int r8 = r8 + 77
            int r10 = r10 * 25
            int r10 = r10 + 15
            int r9 = r9 + 4
            byte[] r0 = o.C0174g.$$a
            byte[] r1 = new byte[r10]
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r9
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r11
            r11 = r10
            goto L35
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r8
            int r9 = r9 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r10) goto L2a
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1, r2)
            r11[r2] = r8
            return
        L2a:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = r11
            r11 = r10
            r10 = r3
            r3 = r1
            r1 = r0
            r0 = r7
        L35:
            int r9 = r9 + r10
            int r9 = r9 + (-13)
            r10 = r11
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0174g.a(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r7 = r7 * 7
            int r7 = r7 + 16
            int r8 = r8 + 97
            byte[] r0 = o.C0174g.setCheckedIconEnabled
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L31
        L15:
            r3 = 0
        L16:
            r6 = r9
            r9 = r8
            r8 = r6
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
            int r9 = r9 + 1
            int r10 = r10 + r8
            int r8 = r10 + (-4)
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0174g.c(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 34
            int r6 = 111 - r6
            int r8 = r8 + 4
            byte[] r0 = o.C0174g.$$d
            int r7 = 40 - r7
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
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r8 = r8 + 1
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
        throw new UnsupportedOperationException("Method not decompiled: o.C0174g.d(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x003a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r0 = o.C0174g.$$g
            int r6 = r6 * 5
            int r6 = 112 - r6
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L1c
            r6 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L3a
        L1c:
            r3 = 0
            r5 = r8
            r8 = r6
            r6 = r5
        L20:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2d:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L3a:
            int r8 = r8 + 1
            int r7 = r7 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0174g.e(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0174g(C0447s c0447s, setExpandedHintEnabled setexpandedhintenabled) {
        super(c0447s.getContext());
        CharSequence unboundedRipple;
        this.setLayoutAnimation = 0;
        this.setMinAndMaxProgress = new LinkedHashSet<>();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnShow() { // from class: o.g.3
            @Override // o.setOnShow, android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C0174g c0174g = C0174g.this;
                c0174g.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(c0174g.setLayoutAnimation).setTextScaleX();
            }

            @Override // o.setOnShow, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                C0174g c0174g = C0174g.this;
                c0174g.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(c0174g.setLayoutAnimation).setIconTintList();
            }
        };
        s$MenuHostHelper$$ExternalSyntheticLambda1 s_menuhosthelper__externalsyntheticlambda1 = new s$MenuHostHelper$$ExternalSyntheticLambda1() { // from class: o.g.1
            @Override // o.s$MenuHostHelper$$ExternalSyntheticLambda1
            public final void MenuHostHelper$$ExternalSyntheticLambda0(C0447s c0447s2) {
                if (C0174g.this.setX == c0447s2.setUnboundedRipple) {
                    return;
                }
                if (C0174g.this.setX != null) {
                    C0174g.this.setX.removeTextChangedListener(C0174g.this.MenuHostHelper$$ExternalSyntheticLambda0);
                    View.OnFocusChangeListener onFocusChangeListener = C0174g.this.setX.getOnFocusChangeListener();
                    C0174g c0174g = C0174g.this;
                    if (onFocusChangeListener == c0174g.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(c0174g.setLayoutAnimation).setY()) {
                        C0174g.this.setX.setOnFocusChangeListener(null);
                    }
                }
                C0174g.this.setX = c0447s2.setUnboundedRipple;
                if (C0174g.this.setX != null) {
                    C0174g.this.setX.addTextChangedListener(C0174g.this.MenuHostHelper$$ExternalSyntheticLambda0);
                }
                C0174g c0174g2 = C0174g.this;
                c0174g2.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(c0174g2.setLayoutAnimation).setIconTintList(C0174g.this.setX);
                C0174g c0174g3 = C0174g.this;
                c0174g3.MenuHostHelper$$ExternalSyntheticLambda1(c0174g3.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(c0174g3.setLayoutAnimation));
            }
        };
        this.setGuidelinePercent = s_menuhosthelper__externalsyntheticlambda1;
        this.setIconTintList = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.setZ = c0447s;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.setY = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        setMinAndMaxFrame MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(this, from, R.id.res_0x7f0a01f0);
        this.ViewPager$SavedState$1 = MenuHostHelper$$ExternalSyntheticLambda0;
        setMinAndMaxFrame MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(frameLayout, from, R.id.res_0x7f0a01ef);
        this.setOnLongClickListener = MenuHostHelper$$ExternalSyntheticLambda02;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new g$MenuHostHelper$$ExternalSyntheticLambda1(this, setexpandedhintenabled);
        getStableInsets getstableinsets = new getStableInsets(getContext());
        this.setAnimationFromJson = getstableinsets;
        if (setexpandedhintenabled.setLayoutAnimation(33)) {
            this.setIconSize = setFastScrollEnabled.setX(getContext(), setexpandedhintenabled, 33);
        }
        if (setexpandedhintenabled.setLayoutAnimation(34)) {
            this.setCenterIfNoTextEnabled = setTitleMargin.setY(setexpandedhintenabled.MenuHostHelper$$ExternalSyntheticLambda0(34, -1), null);
        }
        if (setexpandedhintenabled.setLayoutAnimation(32)) {
            this.ViewPager$SavedState$1.setImageDrawable(setexpandedhintenabled.MenuHostHelper$$ExternalSyntheticLambda0(32));
            setIconTintList();
            C0146f.setX(this.setZ, this.ViewPager$SavedState$1, this.setIconSize, this.setCenterIfNoTextEnabled);
        }
        this.ViewPager$SavedState$1.setContentDescription(getResources().getText(R.string.res_0x7f140033));
        setBaselineAlignBottom.setUnboundedRipple(this.ViewPager$SavedState$1, 2);
        this.ViewPager$SavedState$1.setClickable(false);
        this.ViewPager$SavedState$1.setPressable(false);
        this.ViewPager$SavedState$1.setFocusable(false);
        if (!setexpandedhintenabled.setLayoutAnimation(48)) {
            if (setexpandedhintenabled.setLayoutAnimation(28)) {
                this.setUiOptions = setFastScrollEnabled.setX(getContext(), setexpandedhintenabled, 28);
            }
            if (setexpandedhintenabled.setLayoutAnimation(29)) {
                this.setUnboundedRipple = setTitleMargin.setY(setexpandedhintenabled.MenuHostHelper$$ExternalSyntheticLambda0(29, -1), null);
            }
        }
        if (setexpandedhintenabled.setLayoutAnimation(27)) {
            setIconTintList(setexpandedhintenabled.MenuHostHelper$$ExternalSyntheticLambda0(27, 0));
            if (setexpandedhintenabled.setLayoutAnimation(25) && MenuHostHelper$$ExternalSyntheticLambda0() != (unboundedRipple = setexpandedhintenabled.setUnboundedRipple(25))) {
                this.setOnLongClickListener.setContentDescription(unboundedRipple);
            }
            this.setOnLongClickListener.setCheckable(setexpandedhintenabled.setIconTintList(24, true));
        } else if (setexpandedhintenabled.setLayoutAnimation(48)) {
            if (setexpandedhintenabled.setLayoutAnimation(49)) {
                this.setUiOptions = setFastScrollEnabled.setX(getContext(), setexpandedhintenabled, 49);
            }
            if (setexpandedhintenabled.setLayoutAnimation(50)) {
                this.setUnboundedRipple = setTitleMargin.setY(setexpandedhintenabled.MenuHostHelper$$ExternalSyntheticLambda0(50, -1), null);
            }
            setIconTintList(setexpandedhintenabled.setIconTintList(48, false) ? 1 : 0);
            CharSequence unboundedRipple2 = setexpandedhintenabled.setUnboundedRipple(46);
            if (MenuHostHelper$$ExternalSyntheticLambda0() != unboundedRipple2) {
                this.setOnLongClickListener.setContentDescription(unboundedRipple2);
            }
        }
        this.setAnimationFromJson.setVisibility(8);
        this.setAnimationFromJson.setId(R.id.res_0x7f0a01f7);
        this.setAnimationFromJson.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.setAnimationFromJson.setAccessibilityLiveRegion(1);
        setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(this.setAnimationFromJson, setexpandedhintenabled.setNavigationOnClickListener(65, 0));
        if (setexpandedhintenabled.setLayoutAnimation(66)) {
            this.setAnimationFromJson.setTextColor(setexpandedhintenabled.setY(66));
        }
        CharSequence unboundedRipple3 = setexpandedhintenabled.setUnboundedRipple(64);
        this.setOnNavigationItemSelectedListener = TextUtils.isEmpty(unboundedRipple3) ? null : unboundedRipple3;
        this.setAnimationFromJson.setText(unboundedRipple3);
        setY();
        frameLayout.addView(MenuHostHelper$$ExternalSyntheticLambda02);
        addView(getstableinsets);
        addView(frameLayout);
        addView(MenuHostHelper$$ExternalSyntheticLambda0);
        c0447s.setUiOptions.add(s_menuhosthelper__externalsyntheticlambda1);
        if (c0447s.setUnboundedRipple != null) {
            s_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0(c0447s);
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.g.5
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                C0174g.this.MenuHostHelper$$ExternalSyntheticLambda1();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                AccessibilityManager accessibilityManager;
                C0174g c0174g = C0174g.this;
                setCloseIconEnabledResource$MenuHostHelper$$ExternalSyntheticLambda1 setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1 = c0174g.setMaxEms;
                if (setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1 == null || (accessibilityManager = c0174g.setIconTintList) == null) {
                    return;
                }
                setCloseIconEnabledResource.setIconTintList(accessibilityManager, setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1);
            }
        });
    }

    private setMinAndMaxFrame MenuHostHelper$$ExternalSyntheticLambda0(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        setMinAndMaxFrame setminandmaxframe = (setMinAndMaxFrame) layoutInflater.inflate(R.layout.res_0x7f0d002e, viewGroup, false);
        setminandmaxframe.setId(i);
        C0146f.setIconTintList(setminandmaxframe);
        if (getContext().getResources().getConfiguration().fontScale >= 1.3f) {
            setImeHintLocales.setIconTintList((ViewGroup.MarginLayoutParams) setminandmaxframe.getLayoutParams(), 0);
        }
        return setminandmaxframe;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(int i) {
        int i2 = this.setLayoutAnimation;
        if (i2 == i) {
            return;
        }
        setY(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(i2));
        this.setLayoutAnimation = i;
        setLayoutAnimation();
        setY(i != 0);
        AbstractC0201h MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation);
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i3 == 0) {
            i3 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        MenuHostHelper$$ExternalSyntheticLambda0(i3 != 0 ? setFilterTouchesWhenObscured.setIconTintList(getContext(), i3) : null);
        setY(MenuHostHelper$$ExternalSyntheticLambda0.setX());
        this.setOnLongClickListener.setCheckable(MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled());
        if (!MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(this.setZ.setY)) {
            StringBuilder sb = new StringBuilder("The current box background mode ");
            sb.append(this.setZ.setY);
            sb.append(" is not supported by the end icon mode ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple();
        this.setMaxEms = MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation();
        MenuHostHelper$$ExternalSyntheticLambda1();
        View.OnClickListener navigationOnClickListener = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener();
        setMinAndMaxFrame setminandmaxframe = this.setOnLongClickListener;
        View.OnLongClickListener onLongClickListener = this.setNavigationOnClickListener;
        setminandmaxframe.setOnClickListener(navigationOnClickListener);
        C0146f.setY(setminandmaxframe, onLongClickListener);
        EditText editText = this.setX;
        if (editText != null) {
            MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(editText);
            MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0);
        }
        C0146f.setX(this.setZ, this.setOnLongClickListener, this.setUiOptions, this.setUnboundedRipple);
        setX(true);
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setMaxEms == null || this.setIconTintList == null || !setBaselineAlignBottom.setChipIconTintResource(this)) {
            return;
        }
        setCloseIconEnabledResource.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList, this.setMaxEms);
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1(AbstractC0201h abstractC0201h) {
        if (this.setX == null) {
            return;
        }
        if (abstractC0201h.setY() != null) {
            this.setX.setOnFocusChangeListener(abstractC0201h.setY());
        }
        if (abstractC0201h.setOnLongClickListener() != null) {
            this.setOnLongClickListener.setOnFocusChangeListener(abstractC0201h.setOnLongClickListener());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable) {
        this.setOnLongClickListener.setImageDrawable(drawable);
        if (drawable != null) {
            C0146f.setX(this.setZ, this.setOnLongClickListener, this.setUiOptions, this.setUnboundedRipple);
            C0146f.MenuHostHelper$$ExternalSyntheticLambda1(this.setZ, this.setOnLongClickListener, this.setUiOptions);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(int i) {
        CharSequence text = i != 0 ? getResources().getText(i) : null;
        if (MenuHostHelper$$ExternalSyntheticLambda0() != text) {
            this.setOnLongClickListener.setContentDescription(text);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0439  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence MenuHostHelper$$ExternalSyntheticLambda0() {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0174g.MenuHostHelper$$ExternalSyntheticLambda0():java.lang.CharSequence");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setUiOptions() {
        setIconTintList();
        C0146f.MenuHostHelper$$ExternalSyntheticLambda1(this.setZ, this.ViewPager$SavedState$1, this.setIconSize);
        C0146f.MenuHostHelper$$ExternalSyntheticLambda1(this.setZ, this.setOnLongClickListener, this.setUiOptions);
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation).setChipCornerRadius()) {
            if (this.setZ.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1() && this.setOnLongClickListener.getDrawable() != null) {
                Drawable mutate = setEnsureMinTouchTargetSize.setNavigationOnClickListener(this.setOnLongClickListener.getDrawable()).mutate();
                TextView textView = this.setZ.setChipCornerRadius.setUiOptions;
                setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(mutate, textView != null ? textView.getCurrentTextColor() : -1);
                this.setOnLongClickListener.setImageDrawable(mutate);
                return;
            }
            C0146f.setX(this.setZ, this.setOnLongClickListener, this.setUiOptions, this.setUnboundedRipple);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY() {
        int visibility = this.setAnimationFromJson.getVisibility();
        int i = (this.setOnNavigationItemSelectedListener == null || this.setTextAlignment) ? 8 : 0;
        if (visibility != i) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation).MenuHostHelper$$ExternalSyntheticLambda1(i == 0);
        }
        setNavigationOnClickListener();
        this.setAnimationFromJson.setVisibility(i);
        this.setZ.setIconTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setOnLongClickListener() {
        if (this.setZ.setUnboundedRipple == null) {
            return;
        }
        int i = 0;
        if (!(this.setY.getVisibility() == 0 && this.setOnLongClickListener.getVisibility() == 0)) {
            if (!(this.ViewPager$SavedState$1.getVisibility() == 0)) {
                i = setBaselineAlignBottom.setOnNavigationItemSelectedListener(this.setZ.setUnboundedRipple);
            }
        }
        setBaselineAlignBottom.setX.setX(this.setAnimationFromJson, getContext().getResources().getDimensionPixelSize(R.dimen.res_0x7f070189), this.setZ.setUnboundedRipple.getPaddingTop(), i, this.setZ.setUnboundedRipple.getPaddingBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setNavigationOnClickListener() {
        /*
            r5 = this;
            android.widget.FrameLayout r0 = r5.setY
            o.setMinAndMaxFrame r1 = r5.setOnLongClickListener
            int r1 = r1.getVisibility()
            r2 = 8
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L1d
            o.setMinAndMaxFrame r1 = r5.ViewPager$SavedState$1
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 != 0) goto L1d
            r1 = 0
            goto L1f
        L1d:
            r1 = 8
        L1f:
            r0.setVisibility(r1)
            java.lang.CharSequence r0 = r5.setOnNavigationItemSelectedListener
            if (r0 == 0) goto L2c
            boolean r0 = r5.setTextAlignment
            if (r0 != 0) goto L2c
            r0 = 0
            goto L2e
        L2c:
            r0 = 8
        L2e:
            android.widget.FrameLayout r1 = r5.setY
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L40
            o.setMinAndMaxFrame r1 = r5.setOnLongClickListener
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L40
            r1 = 1
            goto L41
        L40:
            r1 = 0
        L41:
            if (r1 != 0) goto L53
            o.setMinAndMaxFrame r1 = r5.ViewPager$SavedState$1
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L4d
            r1 = 1
            goto L4e
        L4d:
            r1 = 0
        L4e:
            if (r1 != 0) goto L53
            if (r0 == 0) goto L53
            r3 = 0
        L53:
            if (r3 == 0) goto L56
            r2 = 0
        L56:
            r5.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0174g.setNavigationOnClickListener():void");
    }

    private void setLayoutAnimation() {
        Iterator<C0447s.setX> it = this.setMinAndMaxProgress.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void setY(AbstractC0201h abstractC0201h) {
        AccessibilityManager accessibilityManager;
        setCloseIconEnabledResource$MenuHostHelper$$ExternalSyntheticLambda1 setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1 = this.setMaxEms;
        if (setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1 != null && (accessibilityManager = this.setIconTintList) != null) {
            setCloseIconEnabledResource.setIconTintList(accessibilityManager, setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1);
        }
        this.setMaxEms = null;
        abstractC0201h.setUiOptions();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList() {
        this.ViewPager$SavedState$1.setVisibility(this.ViewPager$SavedState$1.getDrawable() != null && this.setZ.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0 && this.setZ.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1() ? 0 : 8);
        setNavigationOnClickListener();
        setOnLongClickListener();
        if (this.setLayoutAnimation != 0) {
            return;
        }
        this.setZ.setIconTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setMinAndMaxFrame setX() {
        boolean z = true;
        if (this.ViewPager$SavedState$1.getVisibility() == 0) {
            return this.ViewPager$SavedState$1;
        }
        if (this.setLayoutAnimation != 0) {
            if ((this.setY.getVisibility() == 0 && this.setOnLongClickListener.getVisibility() == 0) ? false : false) {
                return this.setOnLongClickListener;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        AbstractC0201h MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation);
        boolean z3 = true;
        if (!MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled() || (isChecked = this.setOnLongClickListener.isChecked()) == MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment()) {
            z2 = false;
        } else {
            this.setOnLongClickListener.setChecked(!isChecked);
            z2 = true;
        }
        if (!MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1() || (isActivated = this.setOnLongClickListener.isActivated()) == MenuHostHelper$$ExternalSyntheticLambda0.setIconSize()) {
            z3 = z2;
        } else {
            this.setOnLongClickListener.setActivated(!isActivated);
        }
        if (z || z3) {
            C0146f.MenuHostHelper$$ExternalSyntheticLambda1(this.setZ, this.setOnLongClickListener, this.setUiOptions);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(boolean z) {
        if ((this.setY.getVisibility() == 0 && this.setOnLongClickListener.getVisibility() == 0) != z) {
            this.setOnLongClickListener.setVisibility(z ? 0 : 8);
            setNavigationOnClickListener();
            setOnLongClickListener();
            this.setZ.setIconTintList();
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        jB jBVar = new jB();
        jBVar.setY = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        jBVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        while (jBVar.MenuHostHelper$$ExternalSyntheticLambda0 < cArr.length) {
            int i2 = jBVar.MenuHostHelper$$ExternalSyntheticLambda0;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[jBVar.MenuHostHelper$$ExternalSyntheticLambda0]), jBVar, jBVar};
                Object obj = jC.setTextScaleX.get(442390202);
                if (obj == null) {
                    byte b = (byte) ($$h & 3);
                    byte b2 = (byte) (b - 1);
                    Object[] objArr3 = new Object[1];
                    e(b, b2, b2, objArr3);
                    obj = ((Class) jC.setY((ViewConfiguration.getJumpTapTimeout() >> 16) + 289, (char) View.resolveSizeAndState(0, 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3)).getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    jC.setTextScaleX.put(442390202, obj);
                }
                jArr[i2] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (setLayoutDirection ^ (-34803645974414051L));
                try {
                    Object[] objArr4 = {jBVar, jBVar};
                    Object obj2 = jC.setTextScaleX.get(-1983260643);
                    if (obj2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        Object[] objArr5 = new Object[1];
                        e(b3, b4, b4, objArr5);
                        obj2 = ((Class) jC.setY(321 - (ViewConfiguration.getTapTimeout() >> 16), (char) (499 - TextUtils.lastIndexOf("", '0', 0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4)).getMethod((String) objArr5[0], Object.class, Object.class);
                        jC.setTextScaleX.put(-1983260643, obj2);
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
        char[] cArr2 = new char[length];
        jBVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        while (jBVar.MenuHostHelper$$ExternalSyntheticLambda0 < cArr.length) {
            cArr2[jBVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) jArr[jBVar.MenuHostHelper$$ExternalSyntheticLambda0];
            try {
                Object[] objArr6 = {jBVar, jBVar};
                Object obj3 = jC.setTextScaleX.get(-1983260643);
                if (obj3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    Object[] objArr7 = new Object[1];
                    e(b5, b6, b6, objArr7);
                    obj3 = ((Class) jC.setY(KeyEvent.getDeadChar(0, 0) + 321, (char) (View.MeasureSpec.getSize(0) + 500), ExpandableListView.getPackedPositionGroup(0L) + 4)).getMethod((String) objArr7[0], Object.class, Object.class);
                    jC.setTextScaleX.put(-1983260643, obj3);
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
        objArr[0] = new String(cArr2);
    }
}