package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setAnimationCacheEnabled extends GridView {
    private static short[] setUnboundedRipple;
    private final Calendar MenuHostHelper$$ExternalSyntheticLambda0;
    private final boolean setIconTintList;
    public static final byte[] $$g = {104, -34, -42, -1};
    public static final int $$h = 34;
    public static final byte[] $$d = {15, -40, -114, -21, 65, -65, -1, 14, -15, 28, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -72, 40, 42, -79, 14, -15, 27};
    public static final int $$e = 241;
    public static final byte[] $$a = {97, -108, 86, -98, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
    public static final int $$b = 119;
    private static byte[] setUiOptions = {25, -104, -116, 103, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
    public static final int setX = 224;
    private static int MenuHostHelper$$ExternalSyntheticLambda1 = 1437176431;
    private static int setOnLongClickListener = 115864480;
    private static byte[] setNavigationOnClickListener = {-119, 33, -51, 58, 0, -17, 33, -56, 56, 51, 31, 28, -14, 61, 120, -29, 50, 51, 52, 39, -49, 36, Byte.MIN_VALUE, -17, -37, -22, -33, -64, -45, -56, -27, -44, -23, -40, -60, -22, -36, -115, 60, 55, -52, 37, 47, -44, 62, 36, -52, 38, -50, 42, 29, 44, -7, 59, 40, 12, -27, 52, 53, 54, 41, 49, 38, -123, -64, -55, -42, 52, -63, -35, -34, -33, -61, 16, -114, -55, -54, -44, -61, -34, 53};
    private static int setY = -1681801592;

    private static void a(short s, byte b, int i, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 17 - (s * 14);
        int i3 = (b * 38) + 77;
        int i4 = (i * 25) + 15;
        byte[] bArr2 = new byte[i4];
        int i5 = -1;
        int i6 = i4 - 1;
        if (bArr == null) {
            i3 = (i6 + i3) - 13;
            i6 = i6;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i3;
            i2++;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i6;
            i3 = (i3 + bArr[i2]) - 13;
            i6 = i8;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 7
            int r7 = 23 - r7
            int r9 = 106 - r9
            byte[] r0 = o.setAnimationCacheEnabled.setUiOptions
            int r8 = 41 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r9 = r8
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r7
            goto L32
        L16:
            r3 = 0
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
            r6 = r10
            r10 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L32:
            int r7 = r7 + r8
            int r7 = r7 + (-4)
            int r9 = r9 + 1
            r8 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAnimationCacheEnabled.c(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r8 = 115 - r8
            int r7 = r7 + 4
            byte[] r0 = o.setAnimationCacheEnabled.$$d
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L16
            r8 = r7
            r4 = r8
            r3 = 0
            r7 = r6
            goto L2e
        L16:
            r3 = 0
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAnimationCacheEnabled.d(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r8, byte r9, byte r10, java.lang.Object[] r11) {
        /*
            int r10 = r10 * 3
            int r10 = r10 + 4
            int r9 = 115 - r9
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = o.setAnimationCacheEnabled.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r9 = r8
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r11
            r11 = r10
            goto L33
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L28
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1, r2)
            r11[r2] = r8
            return
        L28:
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
            int r8 = r8 + r10
            int r10 = r11 + 1
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAnimationCacheEnabled.e(int, byte, byte, java.lang.Object[]):void");
    }

    @Override // android.widget.AdapterView
    public final /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
        setAdapter(listAdapter);
    }

    public setAnimationCacheEnabled(Context context) {
        this(context, null);
    }

    public setAnimationCacheEnabled(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public setAnimationCacheEnabled(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = calendar;
        if (setTranslationZ.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), 16843277)) {
            setNextFocusLeftId(R.id.res_0x7f0a006d);
            setNextFocusRightId(R.id.res_0x7f0a0089);
        }
        this.setIconTintList = setTranslationZ.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), R.attr.res_0x7f040323);
        setBaselineAlignBottom.setX(this, new setCounterOverflowTextColor() { // from class: o.setAnimationCacheEnabled.1
            @Override // o.setCounterOverflowTextColor
            public final void setY(View view, setDecorPadding setdecorpadding) {
                super.setY(view, setdecorpadding);
                setdecorpadding.setX((Object) null);
            }
        });
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((AppBarLayout$Behavior) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() != -1) {
                int selectedItemPosition = getSelectedItemPosition();
                AppBarLayout$Behavior appBarLayout$Behavior = (AppBarLayout$Behavior) super.getAdapter();
                if (selectedItemPosition < appBarLayout$Behavior.MenuHostHelper$$ExternalSyntheticLambda0.setY(appBarLayout$Behavior.setIconTintList.setY)) {
                    if (19 == i) {
                        AppBarLayout$Behavior appBarLayout$Behavior2 = (AppBarLayout$Behavior) super.getAdapter();
                        setSelection(appBarLayout$Behavior2.MenuHostHelper$$ExternalSyntheticLambda0.setY(appBarLayout$Behavior2.setIconTintList.setY));
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final AppBarLayout$Behavior setY() {
        return (AppBarLayout$Behavior) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter  reason: avoid collision after fix types in other method */
    public final void setAdapter2(ListAdapter listAdapter) {
        if (!(listAdapter instanceof AppBarLayout$Behavior)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", setAnimationCacheEnabled.class.getCanonicalName(), AppBarLayout$Behavior.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0503  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onDraw(android.graphics.Canvas r36) {
        /*
            Method dump skipped, instructions count: 1729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAnimationCacheEnabled.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.setIconTintList) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final /* bridge */ /* synthetic */ ListAdapter getAdapter() {
        return (AppBarLayout$Behavior) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter  reason: avoid collision after fix types in other method */
    public final /* bridge */ /* synthetic */ ListAdapter getAdapter2() {
        return (AppBarLayout$Behavior) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            AppBarLayout$Behavior appBarLayout$Behavior = (AppBarLayout$Behavior) super.getAdapter();
            setSelection((appBarLayout$Behavior.MenuHostHelper$$ExternalSyntheticLambda0.setY(appBarLayout$Behavior.setIconTintList.setY) + appBarLayout$Behavior.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1) - 1);
        } else if (i != 130) {
            super.onFocusChanged(true, i, rect);
        } else {
            AppBarLayout$Behavior appBarLayout$Behavior2 = (AppBarLayout$Behavior) super.getAdapter();
            setSelection(appBarLayout$Behavior2.MenuHostHelper$$ExternalSyntheticLambda0.setY(appBarLayout$Behavior2.setIconTintList.setY));
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        AppBarLayout$Behavior appBarLayout$Behavior = (AppBarLayout$Behavior) super.getAdapter();
        if (i >= appBarLayout$Behavior.MenuHostHelper$$ExternalSyntheticLambda0.setY(appBarLayout$Behavior.setIconTintList.setY)) {
            super.setSelection(i);
            return;
        }
        AppBarLayout$Behavior appBarLayout$Behavior2 = (AppBarLayout$Behavior) super.getAdapter();
        super.setSelection(appBarLayout$Behavior2.MenuHostHelper$$ExternalSyntheticLambda0.setY(appBarLayout$Behavior2.setIconTintList.setY));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r19, int r20, int r21, int r22, byte r23, java.lang.Object[] r24) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAnimationCacheEnabled.b(short, int, int, int, byte, java.lang.Object[]):void");
    }
}