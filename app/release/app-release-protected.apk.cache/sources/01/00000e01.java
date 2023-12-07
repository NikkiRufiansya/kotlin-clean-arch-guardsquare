package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.HashSet;
import o.setDecorPadding;
import o.setFallbackResource;

/* loaded from: classes.dex */
public final class setOnGenericMotionListener extends setOnInflateListener {
    private static final int setX = 2132083656;
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    setY MenuHostHelper$$ExternalSyntheticLambda1;
    final setFallbackResource<setOnCloseListener> setIconTintList;
    private final int setNavigationOnClickListener;
    private final setIconTintList setUnboundedRipple;
    private int setY;

    /* loaded from: classes.dex */
    public interface setY {
        void MenuHostHelper$$ExternalSyntheticLambda1();
    }

    /* loaded from: classes.dex */
    public static class setX extends ViewGroup.MarginLayoutParams {
        public setX(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public setX(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public setX() {
            super(-2, -2);
        }
    }

    public setOnGenericMotionListener(Context context) {
        this(context, null);
    }

    public setOnGenericMotionListener(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0400ad);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setOnGenericMotionListener(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r6 = o.setOnGenericMotionListener.setX
            android.content.Context r12 = o.C0501u.MenuHostHelper$$ExternalSyntheticLambda0(r12, r13, r14, r6)
            r11.<init>(r12, r13, r14)
            o.setFallbackResource r12 = new o.setFallbackResource
            r12.<init>()
            r11.setIconTintList = r12
            o.setOnGenericMotionListener$setIconTintList r7 = new o.setOnGenericMotionListener$setIconTintList
            r8 = 0
            r7.<init>(r11, r8)
            r11.setUnboundedRipple = r7
            android.content.Context r9 = r11.getContext()
            int[] r10 = o.setIconTint.setIconTintList.setOnLongClickListener
            int[] r5 = new int[r8]
            o.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(r9, r13, r14, r6)
            r0 = r9
            r1 = r13
            r2 = r10
            r3 = r14
            r4 = r6
            o.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r13 = r9.obtainStyledAttributes(r13, r10, r14, r6)
            r14 = 1
            int r0 = r13.getDimensionPixelOffset(r14, r8)
            r1 = 2
            int r1 = r13.getDimensionPixelOffset(r1, r0)
            r11.setChipSpacingHorizontal(r1)
            r1 = 3
            int r0 = r13.getDimensionPixelOffset(r1, r0)
            r11.setChipSpacingVertical(r0)
            r0 = 5
            boolean r0 = r13.getBoolean(r0, r8)
            r11.setSingleLine(r0)
            r0 = 6
            boolean r0 = r13.getBoolean(r0, r8)
            r11.setSingleSelection(r0)
            r0 = 4
            boolean r0 = r13.getBoolean(r0, r8)
            r11.setSelectionRequired(r0)
            r0 = -1
            int r0 = r13.getResourceId(r8, r0)
            r11.setNavigationOnClickListener = r0
            r13.recycle()
            o.setOnGenericMotionListener$4 r13 = new o.setOnGenericMotionListener$4
            r13.<init>()
            r12.MenuHostHelper$$ExternalSyntheticLambda0 = r13
            super.setOnHierarchyChangeListener(r7)
            o.setBaselineAlignBottom.setUnboundedRipple(r11, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnGenericMotionListener.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        setDecorPadding y = setDecorPadding.setY(accessibilityNodeInfo);
        if (super.MenuHostHelper$$ExternalSyntheticLambda1()) {
            i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) instanceof setOnCloseListener) {
                    if (getChildAt(i2).getVisibility() == 0) {
                        i++;
                    }
                }
            }
        } else {
            i = -1;
        }
        y.setX(setDecorPadding.setX.setIconTintList(setY(), i, false, this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1 ? 1 : 2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new setX(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new setX(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new setX();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof setX);
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.setUnboundedRipple.setX = onHierarchyChangeListener;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        setFallbackResource.setIconTintList seticontintlist;
        super.onFinishInflate();
        int i = this.setNavigationOnClickListener;
        if (i != -1) {
            setFallbackResource<setOnCloseListener> setfallbackresource = this.setIconTintList;
            setOnCloseListener setoncloselistener = setfallbackresource.setY.get(Integer.valueOf(i));
            if (setoncloselistener == null || !setfallbackresource.setIconTintList(setoncloselistener) || (seticontintlist = setfallbackresource.MenuHostHelper$$ExternalSyntheticLambda0) == null) {
                return;
            }
            new HashSet(setfallbackresource.setX);
            seticontintlist.setY();
        }
    }

    @Deprecated
    public final void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public final void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public final void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public final void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public final void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public final void setOnCheckedChangeListener(final setOnGenericMotionListener$MenuHostHelper$$ExternalSyntheticLambda1 setongenericmotionlistener_menuhosthelper__externalsyntheticlambda1) {
        if (setongenericmotionlistener_menuhosthelper__externalsyntheticlambda1 == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new setY() { // from class: o.setOnGenericMotionListener.1
                @Override // o.setOnGenericMotionListener.setY
                public final void MenuHostHelper$$ExternalSyntheticLambda1() {
                    if (setOnGenericMotionListener.this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1) {
                        setOnGenericMotionListener.this.setIconTintList.setY();
                    }
                }
            });
        }
    }

    public final void setOnCheckedStateChangeListener(setY sety) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = sety;
    }

    public final void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public final void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public final void setChipSpacingHorizontal(int i) {
        if (this.setY != i) {
            this.setY = i;
            setX(i);
            requestLayout();
        }
    }

    public final void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public final void setChipSpacingVertical(int i) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != i) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            setIconTintList(i);
            requestLayout();
        }
    }

    public final void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Override // o.setOnInflateListener
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return super.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.setOnInflateListener
    public final void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public final void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public final void setSingleSelection(boolean z) {
        setFallbackResource.setIconTintList seticontintlist;
        setFallbackResource<setOnCloseListener> setfallbackresource = this.setIconTintList;
        if (setfallbackresource.MenuHostHelper$$ExternalSyntheticLambda1 != z) {
            setfallbackresource.MenuHostHelper$$ExternalSyntheticLambda1 = z;
            boolean isEmpty = setfallbackresource.setX.isEmpty();
            for (setOnCloseListener setoncloselistener : setfallbackresource.setY.values()) {
                setfallbackresource.setY(setoncloselistener, false);
            }
            if (!(!isEmpty) || (seticontintlist = setfallbackresource.MenuHostHelper$$ExternalSyntheticLambda0) == null) {
                return;
            }
            new HashSet(setfallbackresource.setX);
            seticontintlist.setY();
        }
    }

    public final void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public final void setSelectionRequired(boolean z) {
        this.setIconTintList.setIconTintList = z;
    }

    /* loaded from: classes.dex */
    class setIconTintList implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup.OnHierarchyChangeListener setX;
        public static final byte[] $$g = {63, 26, 111, -17};
        public static final int $$h = 218;
        public static final byte[] $$d = {15, -40, -114, -21, -11, 18, -24, -62, 75, -1, -75, 44, 27, 12, 10, -42, 42, 7, 4, -41, 32, 10, 7, -8, 16, -75, 3, 36, 54, -1, -12, 16, -1, -10, 14, -22, 41, -8, 9, -9, 0, 18, -8, -3, -20, 24, 15, -8, 5, 0, -46};
        public static final int $$e = 171;
        public static final byte[] $$a = {51, 112, -114, 9, -1, 28, -14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
        public static final int $$b = 220;
        private static byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {111, -54, 77, -36, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
        public static final int setY = 221;
        private static char[] MenuHostHelper$$ExternalSyntheticLambda1 = {41079, 41178, 41176, 41188, 41162, 41161, 41176, 41189, 41198, 41195, 41179, 41137, 41153, 41184, 41155, 41144, 41179, 41189, 41185, 41190, 41176, 41178, 41013, 41071, 41057, 41071, 41078, 41067, 41059, 41052, 41052, 41060, 41057, 41079, 41065, 41068, 41070};

        private static void a(byte b, int i, int i2, Object[] objArr) {
            int i3 = (i2 * 38) + 77;
            int i4 = (b * 36) + 4;
            int i5 = 9 - (i * 3);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i4];
            int i6 = -1;
            int i7 = i4 - 1;
            if (bArr == null) {
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i6 = -1;
                i3 = (i3 + i5) - 13;
                i5 = i5;
            }
            while (true) {
                int i8 = i6 + 1;
                bArr2[i8] = (byte) i3;
                if (i8 == i7) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i9 = i5 + 1;
                byte b2 = bArr[i9];
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i6 = i8;
                i3 = (i3 + b2) - 13;
                i5 = i9;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0034). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 + 105
                int r7 = r7 * 4
                int r7 = r7 + 16
                int r6 = r6 * 15
                int r6 = 19 - r6
                byte[] r0 = o.setOnGenericMotionListener.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0
                byte[] r1 = new byte[r7]
                int r7 = r7 + (-1)
                r2 = 0
                if (r0 != 0) goto L1b
                r8 = r7
                r3 = r1
                r4 = 0
                r7 = r6
                r1 = r0
                r0 = r9
                r9 = r8
                goto L34
            L1b:
                r3 = 0
            L1c:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L2b
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2b:
                r3 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r5
            L34:
                int r8 = r8 - r6
                int r8 = r8 + 2
                int r6 = r7 + 1
                r7 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setOnGenericMotionListener.setIconTintList.c(byte, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 4
                int r8 = r8 + 111
                int r7 = r7 * 41
                int r7 = 45 - r7
                byte[] r0 = o.setOnGenericMotionListener.setIconTintList.$$d
                int r6 = r6 * 3
                int r6 = 6 - r6
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r8
                r3 = 0
                r8 = r7
                goto L2e
            L17:
                r3 = 0
            L18:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                int r6 = r6 + 1
                if (r3 != r7) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                r4 = r0[r6]
                r5 = r8
                r8 = r7
                r7 = r5
            L2e:
                int r7 = r7 + r4
                int r7 = r7 + (-3)
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setOnGenericMotionListener.setIconTintList.d(short, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void e(short r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 3
                int r8 = 4 - r8
                byte[] r0 = o.setOnGenericMotionListener.setIconTintList.$$g
                int r9 = 111 - r9
                int r7 = r7 * 2
                int r7 = 1 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                goto L31
            L18:
                r3 = 0
            L19:
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
                int r8 = r8 + r10
                int r9 = r9 + 1
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setOnGenericMotionListener.setIconTintList.e(short, int, short, java.lang.Object[]):void");
        }

        private setIconTintList() {
        }

        /* synthetic */ setIconTintList(setOnGenericMotionListener setongenericmotionlistener, byte b) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0348  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x03ea  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x040b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x041a  */
        /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onChildViewAdded(android.view.View r29, android.view.View r30) {
            /*
                Method dump skipped, instructions count: 1084
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setOnGenericMotionListener.setIconTintList.onChildViewAdded(android.view.View, android.view.View):void");
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.this;
            if (view == setongenericmotionlistener && (view2 instanceof setOnCloseListener)) {
                setFallbackResource<setOnCloseListener> setfallbackresource = setongenericmotionlistener.setIconTintList;
                setOnCloseListener setoncloselistener = (setOnCloseListener) view2;
                setoncloselistener.setInternalOnCheckedChangeListener(null);
                setfallbackresource.setY.remove(Integer.valueOf(setoncloselistener.getId()));
                setfallbackresource.setX.remove(Integer.valueOf(setoncloselistener.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.setX;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        private static void b(int[] iArr, byte[] bArr, boolean z, Object[] objArr) {
            int i;
            char[] cArr;
            jx jxVar = new jx();
            int i2 = 0;
            int i3 = iArr[0];
            int i4 = 1;
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr2 = MenuHostHelper$$ExternalSyntheticLambda1;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = new Object[i4];
                        objArr2[i2] = Integer.valueOf(cArr2[i8]);
                        Object obj = jC.setTextScaleX.get(-2065108825);
                        if (obj != null) {
                            cArr = cArr2;
                        } else {
                            byte b = (byte) i2;
                            byte b2 = b;
                            cArr = cArr2;
                            Object[] objArr3 = new Object[1];
                            e(b, b2, (byte) (b2 + 3), objArr3);
                            obj = ((Class) jC.setY((ExpandableListView.getPackedPositionForChild(i2, i2) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i2, i2) == j ? 0 : -1)) + 41, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35090), 6 - TextUtils.getOffsetBefore("", i2))).getMethod((String) objArr3[0], Integer.TYPE);
                            jC.setTextScaleX.put(-2065108825, obj);
                        }
                        cArr3[i8] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        i8++;
                        cArr2 = cArr;
                        i2 = 0;
                        i4 = 1;
                        j = 0;
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
            char[] cArr4 = new char[i5];
            System.arraycopy(cArr2, i3, cArr4, 0, i5);
            if (bArr != null) {
                char[] cArr5 = new char[i5];
                jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                char c = 0;
                while (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 < i5) {
                    if (bArr[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] == 1) {
                        int i9 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c)};
                            Object obj2 = jC.setTextScaleX.get(1237805447);
                            if (obj2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                Object[] objArr5 = new Object[1];
                                e(b3, b4, (byte) (b4 + 2), objArr5);
                                obj2 = ((Class) jC.setY((ViewConfiguration.getScrollDefaultDelay() >> 16) + 273, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4)).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE);
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
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                Object[] objArr7 = new Object[1];
                                e(b5, b6, (byte) (b6 + 1), objArr7);
                                obj3 = ((Class) jC.setY(269 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE);
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
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            Object[] objArr9 = new Object[1];
                            e(b7, b8, b8, objArr9);
                            obj4 = ((Class) jC.setY((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 236, (char) KeyEvent.keyCodeFromString(""), TextUtils.lastIndexOf("", '0', 0, 0) + 5)).getMethod((String) objArr9[0], Object.class, Object.class);
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
            if (i7 > 0) {
                char[] cArr6 = new char[i5];
                i = 0;
                System.arraycopy(cArr4, 0, cArr6, 0, i5);
                int i11 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr4, i11, i7);
                System.arraycopy(cArr6, i7, cArr4, 0, i11);
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr7 = new char[i5];
                while (true) {
                    jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                    if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i5) {
                        break;
                    }
                    cArr7[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr4[(i5 - jxVar.MenuHostHelper$$ExternalSyntheticLambda0) - 1];
                    i = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
                }
                cArr4 = cArr7;
            }
            if (i6 > 0) {
                int i12 = 0;
                while (true) {
                    jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i12;
                    if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i5) {
                        break;
                    }
                    cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] - iArr[2]);
                    i12 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }
    }
}