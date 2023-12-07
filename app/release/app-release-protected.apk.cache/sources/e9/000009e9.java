package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setBackgroundTintMode;
import o.setBaselineAlignBottom;

/* loaded from: classes.dex */
public class setCheckedIconEnabledResource extends ViewGroup implements setStrokeColorResource, queryLocalInterface {
    private final Rect ExtendableSavedState$1;
    private final Runnable FragmentStateAdapter$5;
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    final AnimatorListenerAdapter MenuHostHelper$$ExternalSyntheticLambda1;
    private int SearchView$SavedState$1;
    private WindowInsetsCompat ViewPager$SavedState$1;
    private boolean setAnimationFromJson;
    private getView setCenterIfNoTextEnabled;
    private final Rect setCheckedIconEnabled;
    private final Rect setChipCornerRadius;
    private WindowInsetsCompat setChipIconTintResource;
    private Drawable setConstraintSet;
    private int setContentScrimResource;
    private boolean setGuidelinePercent;
    private final Rect setHasDecor;
    private final Rect setIconSize;
    setOnScrollChangeListener setIconTintList;
    private final handleException setIconified;
    private setY setLayoutAnimation;
    private WindowInsetsCompat setLayoutDirection;
    private boolean setMaxEms;
    private WindowInsetsCompat setMinAndMaxProgress;
    private final Runnable setNavigationOnClickListener;
    private int setOnLongClickListener;
    private OverScroller setOnNavigationItemSelectedListener;
    private final Rect setTextAlignment;
    private final Rect setTextAppearanceResource;
    private int setTextScaleX;
    public boolean setX;
    ViewPropertyAnimator setY;
    private setTransformationMethod setZ;
    private static byte[] FloatingActionButton$BaseBehavior = {108, -22, 67, 3, 21, -2, 22, 5, 2, 3, -46, 61, 20, 7, 14, -7, 17, 14, -62, 29, 52, 7, 14, -7, 27, 4, 6, 23, -43, 55, 8, 4, 5, 2, 6, 27, -3, 14, 7, -29, 45, 0, 17};
    public static final int setUnboundedRipple = 169;
    private static int[] setUiOptions = {R.attr.res_0x7f040005, 16842841};

    /* loaded from: classes.dex */
    public interface setY {
        void MenuHostHelper$$ExternalSyntheticLambda0(boolean z);

        void setCenterIfNoTextEnabled();

        void setIconSize();

        void setUiOptions();

        void setX(int i);
    }

    private static void a(byte b, int i, short s, Object[] objArr) {
        int i2 = 103 - (s * 6);
        int i3 = 26 - (i * 22);
        int i4 = 23 - (b * 5);
        byte[] bArr = FloatingActionButton$BaseBehavior;
        byte[] bArr2 = new byte[i4];
        int i5 = -1;
        int i6 = i4 - 1;
        if (bArr == null) {
            int i7 = i2 + i3;
            i3++;
            i2 = i7 - 8;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = -1;
        }
        while (true) {
            int i8 = i5 + 1;
            bArr2[i8] = (byte) i2;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i3];
            i3++;
            i2 = (i2 + b2) - 8;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = i8;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public setCheckedIconEnabledResource(Context context) {
        this(context, null);
    }

    public setCheckedIconEnabledResource(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setContentScrimResource = 0;
        this.setTextAlignment = new Rect();
        this.setTextAppearanceResource = new Rect();
        this.setIconSize = new Rect();
        this.setChipCornerRadius = new Rect();
        this.ExtendableSavedState$1 = new Rect();
        this.setCheckedIconEnabled = new Rect();
        this.setHasDecor = new Rect();
        this.ViewPager$SavedState$1 = WindowInsetsCompat.setX;
        this.setMinAndMaxProgress = WindowInsetsCompat.setX;
        this.setLayoutDirection = WindowInsetsCompat.setX;
        this.setChipIconTintResource = WindowInsetsCompat.setX;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new AnimatorListenerAdapter() { // from class: o.setCheckedIconEnabledResource.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                setCheckedIconEnabledResource.this.setY = null;
                setCheckedIconEnabledResource.this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                setCheckedIconEnabledResource.this.setY = null;
                setCheckedIconEnabledResource.this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            }
        };
        this.FragmentStateAdapter$5 = new Runnable() { // from class: o.setCheckedIconEnabledResource.2
            @Override // java.lang.Runnable
            public final void run() {
                setCheckedIconEnabledResource.this.MenuHostHelper$$ExternalSyntheticLambda0();
                setCheckedIconEnabledResource setcheckediconenabledresource = setCheckedIconEnabledResource.this;
                setcheckediconenabledresource.setY = setcheckediconenabledresource.setIconTintList.animate().translationY(0.0f).setListener(setCheckedIconEnabledResource.this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        };
        this.setNavigationOnClickListener = new Runnable() { // from class: o.setCheckedIconEnabledResource.4
            @Override // java.lang.Runnable
            public final void run() {
                setCheckedIconEnabledResource.this.MenuHostHelper$$ExternalSyntheticLambda0();
                setCheckedIconEnabledResource setcheckediconenabledresource = setCheckedIconEnabledResource.this;
                setcheckediconenabledresource.setY = setcheckediconenabledresource.setIconTintList.animate().translationY(-setCheckedIconEnabledResource.this.setIconTintList.getHeight()).setListener(setCheckedIconEnabledResource.this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        };
        setX(context);
        this.setIconified = new handleException();
    }

    private void setX(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(setUiOptions);
        this.setOnLongClickListener = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.setConstraintSet = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        try {
            byte b = FloatingActionButton$BaseBehavior[41];
            byte b2 = (byte) (b + 1);
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = FloatingActionButton$BaseBehavior[41];
            Object[] objArr2 = new Object[1];
            a((byte) (setUnboundedRipple & 7), b3, b3, objArr2);
            this.setGuidelinePercent = ((ApplicationInfo) cls.getMethod((String) objArr2[0], null).invoke(context, null)).targetSdkVersion < 19;
            this.setOnNavigationItemSelectedListener = new OverScroller(context);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public void setActionBarVisibilityCallback(setY sety) {
        this.setLayoutAnimation = sety;
        if (getWindowToken() != null) {
            this.setLayoutAnimation.setX(this.setContentScrimResource);
            int i = this.SearchView$SavedState$1;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.setX = z;
        boolean z2 = false;
        if (z) {
            Context context = getContext();
            try {
                byte b = FloatingActionButton$BaseBehavior[41];
                byte b2 = (byte) (b + 1);
                Object[] objArr = new Object[1];
                a(b, b2, b2, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                byte b3 = FloatingActionButton$BaseBehavior[41];
                Object[] objArr2 = new Object[1];
                a((byte) (setUnboundedRipple & 7), b3, b3, objArr2);
                if (((ApplicationInfo) cls.getMethod((String) objArr2[0], null).invoke(context, null)).targetSdkVersion < 19) {
                    z2 = true;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        this.setGuidelinePercent = z2;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.setAnimationFromJson = z;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setX(getContext());
        setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(this);
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        setUiOptions();
        int i2 = this.SearchView$SavedState$1;
        this.SearchView$SavedState$1 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        setY sety = this.setLayoutAnimation;
        if (sety != null) {
            sety.MenuHostHelper$$ExternalSyntheticLambda0(!z2);
            if (z || !z2) {
                this.setLayoutAnimation.setCenterIfNoTextEnabled();
            } else {
                this.setLayoutAnimation.setUiOptions();
            }
        }
        if (((i ^ i2) & 256) == 0 || this.setLayoutAnimation == null) {
            return;
        }
        setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.setContentScrimResource = i;
        setY sety = this.setLayoutAnimation;
        if (sety != null) {
            sety.setX(i);
        }
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, Rect rect, boolean z) {
        boolean z2;
        setIconTintList seticontintlist = (setIconTintList) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin != rect.left) {
            ((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (((ViewGroup.MarginLayoutParams) seticontintlist).topMargin != rect.top) {
            ((ViewGroup.MarginLayoutParams) seticontintlist).topMargin = rect.top;
            z2 = true;
        }
        if (((ViewGroup.MarginLayoutParams) seticontintlist).rightMargin != rect.right) {
            ((ViewGroup.MarginLayoutParams) seticontintlist).rightMargin = rect.right;
            z2 = true;
        }
        if (!z || ((ViewGroup.MarginLayoutParams) seticontintlist).bottomMargin == rect.bottom) {
            return z2;
        }
        ((ViewGroup.MarginLayoutParams) seticontintlist).bottomMargin = rect.bottom;
        return true;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        setUiOptions();
        WindowInsetsCompat y = WindowInsetsCompat.setY(windowInsets, this);
        boolean MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList, new Rect(y.setNavigationOnClickListener(), y.setUiOptions(), y.setOnLongClickListener(), y.setUnboundedRipple()), false);
        setBaselineAlignBottom.setUnboundedRipple.setIconTintList(this, y, this.setTextAlignment);
        WindowInsetsCompat iconTintList = y.setIconTintList(this.setTextAlignment.left, this.setTextAlignment.top, this.setTextAlignment.right, this.setTextAlignment.bottom);
        this.ViewPager$SavedState$1 = iconTintList;
        boolean z = true;
        if (!this.setMinAndMaxProgress.equals(iconTintList)) {
            this.setMinAndMaxProgress = this.ViewPager$SavedState$1;
            MenuHostHelper$$ExternalSyntheticLambda1 = true;
        }
        if (this.setTextAppearanceResource.equals(this.setTextAlignment)) {
            z = MenuHostHelper$$ExternalSyntheticLambda1;
        } else {
            this.setTextAppearanceResource.set(this.setTextAlignment);
        }
        if (z) {
            requestLayout();
        }
        return y.setX().MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda1().setIconSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.view.ViewGroup
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
    public setIconTintList generateLayoutParams(AttributeSet attributeSet) {
        return new setIconTintList(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new setIconTintList(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof setIconTintList;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        setUiOptions();
        measureChildWithMargins(this.setIconTintList, i, 0, i2, 0);
        setIconTintList seticontintlist = (setIconTintList) this.setIconTintList.getLayoutParams();
        int max = Math.max(0, this.setIconTintList.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin + ((ViewGroup.MarginLayoutParams) seticontintlist).rightMargin);
        int max2 = Math.max(0, this.setIconTintList.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) seticontintlist).topMargin + ((ViewGroup.MarginLayoutParams) seticontintlist).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.setIconTintList.getMeasuredState());
        boolean z = (setBaselineAlignBottom.setMinAndMaxProgress(this) & 256) != 0;
        if (z) {
            measuredHeight = this.setOnLongClickListener;
            if (this.setAnimationFromJson && this.setIconTintList.setOnLongClickListener != null) {
                measuredHeight += this.setOnLongClickListener;
            }
        } else {
            measuredHeight = this.setIconTintList.getVisibility() != 8 ? this.setIconTintList.getMeasuredHeight() : 0;
        }
        this.setIconSize.set(this.setTextAlignment);
        this.setLayoutDirection = this.ViewPager$SavedState$1;
        if (!this.setX && !z) {
            this.setIconSize.top += measuredHeight;
            Rect rect = this.setIconSize;
            rect.bottom = rect.bottom;
            this.setLayoutDirection = this.setLayoutDirection.setIconTintList(0, measuredHeight, 0, 0);
        } else {
            this.setLayoutDirection = new WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1(this.setLayoutDirection).setX(setHelperTextColor.setY(this.setLayoutDirection.setNavigationOnClickListener(), this.setLayoutDirection.setUiOptions() + measuredHeight, this.setLayoutDirection.setOnLongClickListener(), this.setLayoutDirection.setUnboundedRipple())).setIconTintList();
        }
        MenuHostHelper$$ExternalSyntheticLambda1(this.setCenterIfNoTextEnabled, this.setIconSize, true);
        if (!this.setChipIconTintResource.equals(this.setLayoutDirection)) {
            WindowInsetsCompat windowInsetsCompat = this.setLayoutDirection;
            this.setChipIconTintResource = windowInsetsCompat;
            setBaselineAlignBottom.setX(this.setCenterIfNoTextEnabled, windowInsetsCompat);
        }
        measureChildWithMargins(this.setCenterIfNoTextEnabled, i, 0, i2, 0);
        setIconTintList seticontintlist2 = (setIconTintList) this.setCenterIfNoTextEnabled.getLayoutParams();
        int max3 = Math.max(max, this.setCenterIfNoTextEnabled.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) seticontintlist2).leftMargin + ((ViewGroup.MarginLayoutParams) seticontintlist2).rightMargin);
        int max4 = Math.max(max2, this.setCenterIfNoTextEnabled.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) seticontintlist2).topMargin + ((ViewGroup.MarginLayoutParams) seticontintlist2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.setCenterIfNoTextEnabled.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                setIconTintList seticontintlist = (setIconTintList) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) seticontintlist).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.setConstraintSet == null || this.setGuidelinePercent) {
            return;
        }
        int bottom = this.setIconTintList.getVisibility() == 0 ? (int) (this.setIconTintList.getBottom() + this.setIconTintList.getTranslationY() + 0.5f) : 0;
        this.setConstraintSet.setBounds(0, bottom, getWidth(), this.setConstraintSet.getIntrinsicHeight() + bottom);
        this.setConstraintSet.draw(canvas);
    }

    @Override // o.setDropDownVerticalOffset
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // o.setDropDownVerticalOffset
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // o.setDropDownVerticalOffset
    public final void setY(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // o.setDropDownVerticalOffset
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // o.setDropDownVerticalOffset
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.setIconTintList.getVisibility() != 0) {
            return false;
        }
        return this.setMaxEms;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.setIconified.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        setOnScrollChangeListener setonscrollchangelistener = this.setIconTintList;
        this.setTextScaleX = setonscrollchangelistener != null ? -((int) setonscrollchangelistener.getTranslationY()) : 0;
        MenuHostHelper$$ExternalSyntheticLambda0();
        setY sety = this.setLayoutAnimation;
        if (sety != null) {
            sety.setIconSize();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.setTextScaleX + i2;
        this.setTextScaleX = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (!this.setMaxEms || this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return;
        }
        if (this.setTextScaleX <= this.setIconTintList.getHeight()) {
            MenuHostHelper$$ExternalSyntheticLambda0();
            postDelayed(this.FragmentStateAdapter$5, 600L);
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda0();
        postDelayed(this.setNavigationOnClickListener, 600L);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.setMaxEms && z) {
            this.setOnNavigationItemSelectedListener.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.setOnNavigationItemSelectedListener.getFinalY() > this.setIconTintList.getHeight()) {
                MenuHostHelper$$ExternalSyntheticLambda0();
                this.setNavigationOnClickListener.run();
            } else {
                MenuHostHelper$$ExternalSyntheticLambda0();
                this.FragmentStateAdapter$5.run();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        handleException handleexception = this.setIconified;
        return handleexception.MenuHostHelper$$ExternalSyntheticLambda1 | handleexception.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    private void setUiOptions() {
        if (this.setCenterIfNoTextEnabled == null) {
            this.setCenterIfNoTextEnabled = (getView) findViewById(R.id.res_0x7f0a0034);
            this.setIconTintList = (setOnScrollChangeListener) findViewById(R.id.res_0x7f0a0035);
            this.setZ = setIconTintList(findViewById(R.id.res_0x7f0a0033));
        }
    }

    private static setTransformationMethod setIconTintList(View view) {
        if (view instanceof setTransformationMethod) {
            return (setTransformationMethod) view;
        }
        if (view instanceof setTranscriptMode) {
            return ((setTranscriptMode) view).setNavigationOnClickListener();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.setMaxEms) {
            this.setMaxEms = z;
            if (z) {
                return;
            }
            MenuHostHelper$$ExternalSyntheticLambda0();
            setActionBarHideOffset(0);
        }
    }

    public void setActionBarHideOffset(int i) {
        MenuHostHelper$$ExternalSyntheticLambda0();
        this.setIconTintList.setTranslationY(-Math.max(0, Math.min(i, this.setIconTintList.getHeight())));
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0() {
        removeCallbacks(this.FragmentStateAdapter$5);
        removeCallbacks(this.setNavigationOnClickListener);
        ViewPropertyAnimator viewPropertyAnimator = this.setY;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // o.setStrokeColorResource
    public void setWindowCallback(Window.Callback callback) {
        setUiOptions();
        this.setZ.MenuHostHelper$$ExternalSyntheticLambda0(callback);
    }

    @Override // o.setStrokeColorResource
    public void setWindowTitle(CharSequence charSequence) {
        setUiOptions();
        this.setZ.MenuHostHelper$$ExternalSyntheticLambda1(charSequence);
    }

    @Override // o.setStrokeColorResource
    public final void setX(int i) {
        setUiOptions();
        if (i == 2) {
            this.setZ.ViewPager$SavedState$1();
        } else if (i == 5) {
            this.setZ.setCenterIfNoTextEnabled();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public void setIcon(int i) {
        setUiOptions();
        this.setZ.MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    public void setIcon(Drawable drawable) {
        setUiOptions();
        this.setZ.MenuHostHelper$$ExternalSyntheticLambda1(drawable);
    }

    public void setLogo(int i) {
        setUiOptions();
        this.setZ.setX(i);
    }

    @Override // o.setStrokeColorResource
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        setUiOptions();
        return this.setZ.setIconTintList();
    }

    @Override // o.setStrokeColorResource
    public final boolean setNavigationOnClickListener() {
        setUiOptions();
        return this.setZ.setChipCornerRadius();
    }

    @Override // o.setStrokeColorResource
    public final boolean setIconTintList() {
        setUiOptions();
        return this.setZ.setIconSize();
    }

    @Override // o.setStrokeColorResource
    public final boolean setUnboundedRipple() {
        setUiOptions();
        return this.setZ.setOnNavigationItemSelectedListener();
    }

    @Override // o.setStrokeColorResource
    public final boolean setX() {
        setUiOptions();
        return this.setZ.setLayoutAnimation();
    }

    @Override // o.setStrokeColorResource
    public void setMenuPrepared() {
        setUiOptions();
        this.setZ.setTextAlignment();
    }

    @Override // o.setStrokeColorResource
    public void setMenu(Menu menu, setBackgroundTintMode.setY sety) {
        setUiOptions();
        this.setZ.MenuHostHelper$$ExternalSyntheticLambda1(menu, sety);
    }

    @Override // o.setStrokeColorResource
    public final void setY() {
        setUiOptions();
        this.setZ.setY();
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends ViewGroup.MarginLayoutParams {
        public setIconTintList(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public setIconTintList() {
            super(-1, -1);
        }

        public setIconTintList(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new setIconTintList();
    }

    @Override // o.queryLocalInterface
    public final void setY(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }
}