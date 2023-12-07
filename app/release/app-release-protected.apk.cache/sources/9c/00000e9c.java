package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import o.setEnsureMinTouchTargetSize;
import o.setIconTint;
import o.setPopupTheme;

/* loaded from: classes.dex */
public abstract class setPopupTheme extends FrameLayout {
    private static short[] ViewPager$SavedState$1;
    public final setStatusBarForegroundResource MenuHostHelper$$ExternalSyntheticLambda1;
    private final setExpandedTitleColor setIconTintList;
    private MenuInflater setLayoutAnimation;
    private final writeObject setUnboundedRipple;
    setIconTintList setX;
    setY setY;
    public static final byte[] $$g = {10, Byte.MIN_VALUE, 49, 76};
    public static final int $$h = 159;
    public static final byte[] $$d = {4, -20, -33, -123, -65, 65, 1, -14, 15, -28, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 72, -40, -42, 79, -14, 15, -27};
    public static final int $$e = 197;
    public static final byte[] $$a = {117, -10, 119, -11, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
    public static final int $$b = 0;
    private static byte[] setChipCornerRadius = {112, 31, -51, -82, 21, -2, 22, 5, 2, 3, -46, 61, 20, 7, 14, -7, 17, 14, -62, 29, 52, 7, 14, -7, 27, 4};
    public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 73;
    private static int setUiOptions = 1437176363;
    private static int setOnLongClickListener = 1752554404;
    private static byte[] setCenterIfNoTextEnabled = {-122, -110, -125, -23, -76, -122, -111, -127, -104, -28, -27, 91, -126, -63, 72, -101, -104, -99, -116, -108, -115, -41, -61, -46, -57, -56, -37, 48, -19, -36, -47, -64, -52, -46, -60, 10, 5, 26, 115, 125, 34, 12, 114, 26, 116, 28, 120, 107, 122, -57, 9, 118, 90, 51, 2, 3, 4, 119, 31, 116, 70, 79, 92, -70, 71, 67, 68, 69, 73, -106, 116, 79, -80, 90, 73, 68, -69, 49, 49, 49, 49};
    private static int setNavigationOnClickListener = -383094513;

    /* loaded from: classes.dex */
    public interface setIconTintList {
        boolean MenuHostHelper$$ExternalSyntheticLambda0(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public interface setY {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.setPopupTheme.$$a
            int r8 = r8 * 38
            int r8 = 115 - r8
            int r6 = r6 * 14
            int r6 = 18 - r6
            int r7 = r7 * 25
            int r7 = r7 + 15
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = 0
            r8 = r7
            goto L2e
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r7 = r7 + r3
            int r7 = r7 + (-13)
            int r6 = r6 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupTheme.a(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.setPopupTheme.$$d
            int r8 = 40 - r8
            int r7 = r7 * 3
            int r7 = 48 - r7
            int r6 = r6 * 2
            int r6 = 115 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L35
        L18:
            r3 = 0
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L35:
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupTheme.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.setPopupTheme.$$g
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r8 = r8 + 113
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L1a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L34
        L1a:
            r3 = 0
        L1b:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L34:
            int r7 = -r7
            int r7 = r7 + r9
            int r8 = r8 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupTheme.d(short, short, byte, java.lang.Object[]):void");
    }

    protected abstract setStatusBarForegroundResource MenuHostHelper$$ExternalSyntheticLambda0(Context context);

    public abstract int setIconTintList();

    public setPopupTheme(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C0501u.MenuHostHelper$$ExternalSyntheticLambda0(context, attributeSet, i, i2), attributeSet, i);
        ColorStateList valueOf;
        writeObject writeobject = new writeObject();
        this.setUnboundedRipple = writeobject;
        Context context2 = getContext();
        int[] iArr = setIconTint.setIconTintList.FragmentStateAdapter$5;
        ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(context2, attributeSet, i, i2);
        ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(context2, attributeSet, iArr, i, i2, 10, 9);
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda02 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(context2, attributeSet, iArr, i, i2);
        setExpandedTitleColor setexpandedtitlecolor = new setExpandedTitleColor(context2, getClass(), setIconTintList());
        this.setIconTintList = setexpandedtitlecolor;
        setStatusBarForegroundResource MenuHostHelper$$ExternalSyntheticLambda03 = MenuHostHelper$$ExternalSyntheticLambda0(context2);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda03;
        writeobject.MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda03;
        writeobject.setX = 1;
        MenuHostHelper$$ExternalSyntheticLambda03.setPresenter(writeobject);
        setexpandedtitlecolor.setIconTintList(writeobject, setexpandedtitlecolor.MenuHostHelper$$ExternalSyntheticLambda0);
        writeobject.setX(getContext(), setexpandedtitlecolor);
        if (MenuHostHelper$$ExternalSyntheticLambda02.setLayoutAnimation(5)) {
            MenuHostHelper$$ExternalSyntheticLambda03.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda02.setY(5));
        } else {
            MenuHostHelper$$ExternalSyntheticLambda03.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda03.setX());
        }
        setItemIconSize(MenuHostHelper$$ExternalSyntheticLambda02.setY(4, getResources().getDimensionPixelSize(R.dimen.res_0x7f07020e)));
        if (MenuHostHelper$$ExternalSyntheticLambda02.setLayoutAnimation(10)) {
            setItemTextAppearanceInactive(MenuHostHelper$$ExternalSyntheticLambda02.setNavigationOnClickListener(10, 0));
        }
        if (MenuHostHelper$$ExternalSyntheticLambda02.setLayoutAnimation(9)) {
            setItemTextAppearanceActive(MenuHostHelper$$ExternalSyntheticLambda02.setNavigationOnClickListener(9, 0));
        }
        if (MenuHostHelper$$ExternalSyntheticLambda02.setLayoutAnimation(11)) {
            setItemTextColor(MenuHostHelper$$ExternalSyntheticLambda02.setY(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            setWebViewClient setwebviewclient = new setWebViewClient();
            Drawable background = getBackground();
            if ((background instanceof ColorDrawable) && setwebviewclient.setChipIconTintResource.setX != (valueOf = ColorStateList.valueOf(((ColorDrawable) background).getColor()))) {
                setwebviewclient.setChipIconTintResource.setX = valueOf;
                setwebviewclient.onStateChange(setwebviewclient.getState());
            }
            setwebviewclient.setX(context2);
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(this, setwebviewclient);
        }
        if (MenuHostHelper$$ExternalSyntheticLambda02.setLayoutAnimation(7)) {
            setItemPaddingTop(MenuHostHelper$$ExternalSyntheticLambda02.setY(7, 0));
        }
        if (MenuHostHelper$$ExternalSyntheticLambda02.setLayoutAnimation(6)) {
            setItemPaddingBottom(MenuHostHelper$$ExternalSyntheticLambda02.setY(6, 0));
        }
        if (MenuHostHelper$$ExternalSyntheticLambda02.setLayoutAnimation(1)) {
            setElevation(MenuHostHelper$$ExternalSyntheticLambda02.setY(1, 0));
        }
        setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(getBackground().mutate(), setFastScrollEnabled.setX(context2, MenuHostHelper$$ExternalSyntheticLambda02, 0));
        setLabelVisibilityMode(MenuHostHelper$$ExternalSyntheticLambda02.setIconTintList(12, -1));
        int navigationOnClickListener = MenuHostHelper$$ExternalSyntheticLambda02.setNavigationOnClickListener(3, 0);
        if (navigationOnClickListener != 0) {
            MenuHostHelper$$ExternalSyntheticLambda03.setItemBackgroundRes(navigationOnClickListener);
        } else {
            setItemRippleColor(setFastScrollEnabled.setX(context2, MenuHostHelper$$ExternalSyntheticLambda02, 8));
        }
        int navigationOnClickListener2 = MenuHostHelper$$ExternalSyntheticLambda02.setNavigationOnClickListener(2, 0);
        if (navigationOnClickListener2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(navigationOnClickListener2, setIconTint.setIconTintList.setContentScrimResource);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(setFastScrollEnabled.setX(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(new setScrollBarDefaultDelayBeforeFade(setScrollBarDefaultDelayBeforeFade.MenuHostHelper$$ExternalSyntheticLambda0(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new setActionBarVisibilityCallback(0.0f)), (byte) 0));
            obtainStyledAttributes.recycle();
        }
        if (MenuHostHelper$$ExternalSyntheticLambda02.setLayoutAnimation(13)) {
            int navigationOnClickListener3 = MenuHostHelper$$ExternalSyntheticLambda02.setNavigationOnClickListener(13, 0);
            this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            if (this.setLayoutAnimation == null) {
                this.setLayoutAnimation = new setShrinkMotionSpec(getContext());
            }
            this.setLayoutAnimation.inflate(navigationOnClickListener3, this.setIconTintList);
            this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 = false;
            this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0(true);
        }
        MenuHostHelper$$ExternalSyntheticLambda02.setX();
        addView(MenuHostHelper$$ExternalSyntheticLambda03);
        setexpandedtitlecolor.MenuHostHelper$$ExternalSyntheticLambda1(new setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: o.setPopupTheme.4
            @Override // o.setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0
            public final void setY(setNavigationIconTint setnavigationicontint) {
            }

            @Override // o.setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0
            public final boolean setY(setNavigationIconTint setnavigationicontint, MenuItem menuItem) {
                if (setPopupTheme.this.setY == null || menuItem.getItemId() != setPopupTheme.this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation) {
                    return (setPopupTheme.this.setX == null || setPopupTheme.this.setX.MenuHostHelper$$ExternalSyntheticLambda0(menuItem)) ? false : true;
                }
                setY sety = setPopupTheme.this.setY;
                return true;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof setWebViewClient) {
            setWebViewClient setwebviewclient = (setWebViewClient) background;
            if (setwebviewclient.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0 != null && setwebviewclient.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList) {
                setwebviewclient.ViewPager$SavedState$1(setTitleMargin.setX(this));
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof setWebViewClient) {
            ((setWebViewClient) background).setIconSize(f);
        }
    }

    public void setOnItemSelectedListener(setIconTintList seticontintlist) {
        this.setX = seticontintlist;
    }

    public void setOnItemReselectedListener(setY sety) {
        this.setY = sety;
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(colorStateList);
    }

    public void setItemIconSize(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemTextColor(colorStateList);
    }

    public void setItemBackgroundResource(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemBackgroundRes(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemBackground(drawable);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemRippleColor(colorStateList);
    }

    public void setItemPaddingTop(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemPaddingTop(i);
    }

    public void setItemPaddingBottom(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemPaddingBottom(i);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemActiveIndicatorWidth(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemActiveIndicatorShapeAppearance(setscrollbardefaultdelaybeforefade);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemActiveIndicatorColor(colorStateList);
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.setIconTintList.findItem(i);
        if (findItem == null || this.setIconTintList.setX(findItem, this.setUnboundedRipple, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 != i) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setLabelVisibilityMode(i);
            this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0(false);
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemTextAppearanceInactive(i);
    }

    public void setItemTextAppearanceActive(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemTextAppearanceActive(i);
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setItemOnTouchListener(i, onTouchListener);
    }

    public final writeObject setY() {
        return this.setUnboundedRipple;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onLongClickListener;
        setX setx = new setX(super.onSaveInstanceState());
        setx.setY = new Bundle();
        setExpandedTitleColor setexpandedtitlecolor = this.setIconTintList;
        Bundle bundle = setx.setY;
        if (!setexpandedtitlecolor.setChipCornerRadius.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<setBackgroundTintMode>> it = setexpandedtitlecolor.setChipCornerRadius.iterator();
            while (it.hasNext()) {
                WeakReference<setBackgroundTintMode> next = it.next();
                setBackgroundTintMode setbackgroundtintmode = next.get();
                if (setbackgroundtintmode == null) {
                    setexpandedtitlecolor.setChipCornerRadius.remove(next);
                } else {
                    int MenuHostHelper$$ExternalSyntheticLambda02 = setbackgroundtintmode.MenuHostHelper$$ExternalSyntheticLambda0();
                    if (MenuHostHelper$$ExternalSyntheticLambda02 > 0 && (onLongClickListener = setbackgroundtintmode.setOnLongClickListener()) != null) {
                        sparseArray.put(MenuHostHelper$$ExternalSyntheticLambda02, onLongClickListener);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return setx;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof setX)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setX setx = (setX) parcelable;
        super.onRestoreInstanceState(setx.setUiOptions);
        setExpandedTitleColor setexpandedtitlecolor = this.setIconTintList;
        SparseArray sparseParcelableArray = setx.setY.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || setexpandedtitlecolor.setChipCornerRadius.isEmpty()) {
            return;
        }
        Iterator<WeakReference<setBackgroundTintMode>> it = setexpandedtitlecolor.setChipCornerRadius.iterator();
        while (it.hasNext()) {
            WeakReference<setBackgroundTintMode> next = it.next();
            setBackgroundTintMode setbackgroundtintmode = next.get();
            if (setbackgroundtintmode == null) {
                setexpandedtitlecolor.setChipCornerRadius.remove(next);
            } else {
                int MenuHostHelper$$ExternalSyntheticLambda02 = setbackgroundtintmode.MenuHostHelper$$ExternalSyntheticLambda0();
                if (MenuHostHelper$$ExternalSyntheticLambda02 > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(MenuHostHelper$$ExternalSyntheticLambda02)) != null) {
                    setbackgroundtintmode.setIconTintList(parcelable2);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class setX extends setOrientation {
        public static final Parcelable.Creator<setX> CREATOR = new Parcelable.ClassLoaderCreator<setX>() { // from class: com.google.android.material.navigation.NavigationBarView$SavedState$1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new setPopupTheme.setX(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* synthetic */ setPopupTheme.setX createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new setPopupTheme.setX(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new setPopupTheme.setX[i];
            }
        };
        Bundle setY;

        public setX(Parcelable parcelable) {
            super(parcelable);
        }

        public setX(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.setY = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // o.setOrientation, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.setY);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0232 A[Catch: all -> 0x04c2, TRY_LEAVE, TryCatch #0 {all -> 0x04c2, blocks: (B:16:0x01a2, B:20:0x0228, B:22:0x0232, B:62:0x04af), top: B:75:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0497  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x04b1 -> B:64:0x04b7). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setItemActiveIndicatorHeight(int r37) {
        /*
            Method dump skipped, instructions count: 1243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupTheme.setItemActiveIndicatorHeight(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r18, int r19, int r20, int r21, byte r22, java.lang.Object[] r23) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupTheme.b(short, int, int, int, byte, java.lang.Object[]):void");
    }
}