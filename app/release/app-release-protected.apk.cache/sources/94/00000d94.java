package o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import o.setBaselineAlignBottom;
import o.setIconTint;

/* loaded from: classes.dex */
public class setMinFrame extends FrameLayout {
    private static final int setX = 2132083462;
    private int ExtendableSavedState$1;
    int MenuHostHelper$$ExternalSyntheticLambda0;
    WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda1;
    private final Rect SearchView$SavedState$1;
    private int ViewPager$SavedState$1;
    private boolean setAnimationFromJson;
    private int setCenterIfNoTextEnabled;
    private boolean setCheckedIconEnabled;
    private int setChipCornerRadius;
    private View setChipIconTintResource;
    private int setGuidelinePercent;
    private ViewGroup setHasDecor;
    private int setIconSize;
    Drawable setIconTintList;
    private int setIconified;
    private boolean setLayoutAnimation;
    private long setLayoutDirection;
    private AppBarLayout.setUnboundedRipple setMaxEms;
    private int setMinAndMaxProgress;
    private boolean setNavigationOnClickListener;
    private Drawable setOnLongClickListener;
    private int setOnNavigationItemSelectedListener;
    private int setTextAlignment;
    private ValueAnimator setTextAppearanceResource;
    private boolean setTextScaleX;
    private View setUiOptions;
    private setItemBackgroundResource setUnboundedRipple;
    final StaggeredGridLayoutManager setY;
    private boolean setZ;

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    public setMinFrame(Context context) {
        this(context, null);
    }

    public setMinFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0400dd);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setMinFrame(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMinFrame.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.setGuidelinePercent == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            setFitsSystemWindows(setBaselineAlignBottom.setTextAlignment(appBarLayout));
            if (this.setMaxEms == null) {
                this.setMaxEms = new setX();
            }
            appBarLayout.MenuHostHelper$$ExternalSyntheticLambda0(this.setMaxEms);
            setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        List<AppBarLayout.setIconTintList> list;
        ViewParent parent = getParent();
        AppBarLayout.setUnboundedRipple setunboundedripple = this.setMaxEms;
        if (setunboundedripple != null && (parent instanceof AppBarLayout) && (list = ((AppBarLayout) parent).MenuHostHelper$$ExternalSyntheticLambda0) != null && setunboundedripple != null) {
            list.remove(setunboundedripple);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        setY();
        if (this.setHasDecor == null && (drawable = this.setOnLongClickListener) != null && this.setOnNavigationItemSelectedListener > 0) {
            drawable.mutate().setAlpha(this.setOnNavigationItemSelectedListener);
            this.setOnLongClickListener.draw(canvas);
        }
        if (this.setNavigationOnClickListener && this.setLayoutAnimation) {
            if (this.setHasDecor != null && this.setOnLongClickListener != null && this.setOnNavigationItemSelectedListener > 0) {
                if ((this.setGuidelinePercent == 1) && this.setY.MenuHostHelper$$ExternalSyntheticLambda0 < this.setY.setCenterIfNoTextEnabled) {
                    int save = canvas.save();
                    canvas.clipRect(this.setOnLongClickListener.getBounds(), Region.Op.DIFFERENCE);
                    this.setY.setIconTintList(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.setY.setIconTintList(canvas);
        }
        if (this.setIconTintList == null || this.setOnNavigationItemSelectedListener <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int uiOptions = windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0;
        if (uiOptions > 0) {
            this.setIconTintList.setBounds(0, -this.MenuHostHelper$$ExternalSyntheticLambda0, getWidth(), uiOptions - this.MenuHostHelper$$ExternalSyntheticLambda0);
            this.setIconTintList.mutate().setAlpha(this.setOnNavigationItemSelectedListener);
            this.setIconTintList.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.setY.setIconTintList(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
        r0 = false;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean drawChild(android.graphics.Canvas r6, android.view.View r7, long r8) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.setOnLongClickListener
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3b
            int r0 = r5.setOnNavigationItemSelectedListener
            if (r0 <= 0) goto L3b
            android.view.View r0 = r5.setChipIconTintResource
            if (r0 == 0) goto L13
            if (r0 == r5) goto L13
            if (r7 != r0) goto L17
            goto L19
        L13:
            android.view.ViewGroup r0 = r5.setHasDecor
            if (r7 == r0) goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L3b
            android.graphics.drawable.Drawable r0 = r5.setOnLongClickListener
            int r3 = r5.getWidth()
            int r4 = r5.getHeight()
            r5.MenuHostHelper$$ExternalSyntheticLambda1(r0, r7, r3, r4)
            android.graphics.drawable.Drawable r0 = r5.setOnLongClickListener
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r5.setOnNavigationItemSelectedListener
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r5.setOnLongClickListener
            r0.draw(r6)
            r0 = 1
            goto L3c
        L3b:
            r0 = 0
        L3c:
            boolean r6 = super.drawChild(r6, r7, r8)
            if (r6 != 0) goto L44
            if (r0 == 0) goto L45
        L44:
            r1 = 1
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMinFrame.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.setOnLongClickListener;
        if (drawable != null) {
            MenuHostHelper$$ExternalSyntheticLambda1(drawable, this.setHasDecor, i, i2);
        }
    }

    private void setY() {
        if (this.setZ) {
            ViewGroup viewGroup = null;
            this.setHasDecor = null;
            this.setChipIconTintResource = null;
            int i = this.setIconified;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.setHasDecor = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.setChipIconTintResource = view;
                }
            }
            if (this.setHasDecor == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof setTranscriptMode) || (childAt instanceof Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i2++;
                }
                this.setHasDecor = viewGroup;
            }
            MenuHostHelper$$ExternalSyntheticLambda1();
            this.setZ = false;
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        View view;
        if (!this.setNavigationOnClickListener && (view = this.setUiOptions) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.setUiOptions);
            }
        }
        if (!this.setNavigationOnClickListener || this.setHasDecor == null) {
            return;
        }
        if (this.setUiOptions == null) {
            this.setUiOptions = new View(getContext());
        }
        if (this.setUiOptions.getParent() == null) {
            this.setHasDecor.addView(this.setUiOptions, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        setY();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        WindowInsetsCompat windowInsetsCompat = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int uiOptions = windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0;
        if ((mode == 0 || this.setTextScaleX) && uiOptions > 0) {
            this.ExtendableSavedState$1 = uiOptions;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + uiOptions, 1073741824));
        }
        if (this.setAnimationFromJson && this.setY.setMaxEms > 1) {
            setX();
            MenuHostHelper$$ExternalSyntheticLambda0(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int i3 = this.setY.setUnboundedRipple;
            if (i3 > 1) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
                TextPaint textPaint = staggeredGridLayoutManager.SearchView$SavedState$1;
                textPaint.setTextSize(staggeredGridLayoutManager.setLayoutAnimation);
                textPaint.setTypeface(staggeredGridLayoutManager.ViewPager$SavedState$1);
                textPaint.setLetterSpacing(staggeredGridLayoutManager.setX);
                this.setTextAlignment = Math.round((-staggeredGridLayoutManager.SearchView$SavedState$1.ascent()) + staggeredGridLayoutManager.SearchView$SavedState$1.descent()) * (i3 - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.setTextAlignment, 1073741824));
            }
        }
        ViewGroup viewGroup = this.setHasDecor;
        if (viewGroup != null) {
            View view = this.setChipIconTintResource;
            if (view == null || view == this) {
                setMinimumHeight(setY(viewGroup));
            } else {
                setMinimumHeight(setY(view));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (windowInsetsCompat != null) {
            int uiOptions = windowInsetsCompat.setUiOptions();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!setBaselineAlignBottom.setTextAlignment(childAt) && childAt.getTop() < uiOptions) {
                    setBaselineAlignBottom.setX(childAt, uiOptions);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            setAppSearchData MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(getChildAt(i6));
            MenuHostHelper$$ExternalSyntheticLambda1.setX = MenuHostHelper$$ExternalSyntheticLambda1.setY.getTop();
            MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1.setY.getLeft();
        }
        MenuHostHelper$$ExternalSyntheticLambda0(i, i2, i3, i4, false);
        setX();
        setIconTintList();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            MenuHostHelper$$ExternalSyntheticLambda1(getChildAt(i7)).setY();
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, int i3, int i4, boolean z) {
        View view;
        int x;
        int i5;
        int i6;
        int i7;
        if (!this.setNavigationOnClickListener || (view = this.setUiOptions) == null) {
            return;
        }
        int i8 = 0;
        boolean z2 = setBaselineAlignBottom.setChipIconTintResource(view) && this.setUiOptions.getVisibility() == 0;
        this.setLayoutAnimation = z2;
        if (z2 || z) {
            x = setBaselineAlignBottom.setX.setX(this);
            boolean z3 = x == 1;
            View view2 = this.setChipIconTintResource;
            if (view2 == null) {
                view2 = this.setHasDecor;
            }
            int iconTintList = setIconTintList(view2);
            View view3 = this.setUiOptions;
            Rect rect = this.SearchView$SavedState$1;
            rect.set(0, 0, view3.getWidth(), view3.getHeight());
            pingBinder.MenuHostHelper$$ExternalSyntheticLambda0(this, view3, rect);
            ViewGroup viewGroup = this.setHasDecor;
            if (viewGroup instanceof setTranscriptMode) {
                setTranscriptMode settranscriptmode = (setTranscriptMode) viewGroup;
                i8 = settranscriptmode.ViewPager$SavedState$1;
                i6 = settranscriptmode.setUiOptions;
                i7 = settranscriptmode.setCenterIfNoTextEnabled;
                i5 = settranscriptmode.setNavigationOnClickListener;
            } else {
                if (Build.VERSION.SDK_INT >= 24) {
                    ViewGroup viewGroup2 = this.setHasDecor;
                    if (viewGroup2 instanceof Toolbar) {
                        Toolbar toolbar = (Toolbar) viewGroup2;
                        i8 = toolbar.getTitleMarginStart();
                        i6 = toolbar.getTitleMarginEnd();
                        i7 = toolbar.getTitleMarginTop();
                        i5 = toolbar.getTitleMarginBottom();
                    }
                }
                i5 = 0;
                i6 = 0;
                i7 = 0;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
            int i9 = this.SearchView$SavedState$1.left;
            int i10 = z3 ? i6 : i8;
            int i11 = this.SearchView$SavedState$1.top;
            int i12 = this.SearchView$SavedState$1.right;
            if (!z3) {
                i8 = i6;
            }
            staggeredGridLayoutManager.setX(i9 + i10, i11 + iconTintList + i7, i12 - i8, (this.SearchView$SavedState$1.bottom + iconTintList) - i5);
            this.setY.MenuHostHelper$$ExternalSyntheticLambda1(z3 ? this.setCenterIfNoTextEnabled : this.setChipCornerRadius, this.SearchView$SavedState$1.top + this.ViewPager$SavedState$1, (i3 - i) - (z3 ? this.setChipCornerRadius : this.setCenterIfNoTextEnabled), (i4 - i2) - this.setIconSize);
            this.setY.setY(z);
        }
    }

    private void setX() {
        CharSequence title;
        if (this.setHasDecor != null && this.setNavigationOnClickListener && TextUtils.isEmpty(this.setY.setMinAndMaxProgress)) {
            ViewGroup viewGroup = this.setHasDecor;
            if (viewGroup instanceof setTranscriptMode) {
                title = ((setTranscriptMode) viewGroup).setOnLongClickListener();
            } else {
                title = viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : null;
            }
            setTitle(title);
        }
    }

    private static int setY(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    static setAppSearchData MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        setAppSearchData setappsearchdata = (setAppSearchData) view.getTag(R.id.res_0x7f0a0213);
        if (setappsearchdata == null) {
            setAppSearchData setappsearchdata2 = new setAppSearchData(view);
            view.setTag(R.id.res_0x7f0a0213, setappsearchdata2);
            return setappsearchdata2;
        }
        return setappsearchdata;
    }

    public void setTitle(CharSequence charSequence) {
        this.setY.setX(charSequence);
        setContentDescription(this.setNavigationOnClickListener ? this.setY.setMinAndMaxProgress : null);
    }

    public void setTitleCollapseMode(int i) {
        this.setGuidelinePercent = i;
        boolean z = i == 1;
        this.setY.setIconSize = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.setGuidelinePercent == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.setOnLongClickListener == null) {
            float dimension = getResources().getDimension(R.dimen.res_0x7f07005e);
            setItemBackgroundResource setitembackgroundresource = this.setUnboundedRipple;
            int i2 = setitembackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setitembackgroundresource.setIconTintList) {
                if (setExtended.setIconTintList(i2, 255) == setitembackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0) {
                    i2 = setitembackgroundresource.MenuHostHelper$$ExternalSyntheticLambda1(i2, dimension);
                }
            }
            setContentScrimColor(i2);
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.setNavigationOnClickListener) {
            this.setNavigationOnClickListener = z;
            setContentDescription(z ? this.setY.setMinAndMaxProgress : null);
            MenuHostHelper$$ExternalSyntheticLambda1();
            requestLayout();
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
        staggeredGridLayoutManager.setGuidelinePercent = truncateAt;
        staggeredGridLayoutManager.setY(false);
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, setBaselineAlignBottom.setConstraintSet(this) && !isInEditMode());
    }

    public void setScrimsShown(boolean z, boolean z2) {
        TimeInterpolator timeInterpolator;
        if (this.setCheckedIconEnabled != z) {
            if (!z2) {
                MenuHostHelper$$ExternalSyntheticLambda1(z ? 255 : 0);
            } else {
                int i = z ? 255 : 0;
                setY();
                ValueAnimator valueAnimator = this.setTextAppearanceResource;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.setTextAppearanceResource = valueAnimator2;
                    if (i > this.setOnNavigationItemSelectedListener) {
                        timeInterpolator = setCardElevation.setX;
                    } else {
                        timeInterpolator = setCardElevation.MenuHostHelper$$ExternalSyntheticLambda1;
                    }
                    valueAnimator2.setInterpolator(timeInterpolator);
                    this.setTextAppearanceResource.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.setMinFrame.2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            setMinFrame.this.MenuHostHelper$$ExternalSyntheticLambda1(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                        }
                    });
                } else if (valueAnimator.isRunning()) {
                    this.setTextAppearanceResource.cancel();
                }
                this.setTextAppearanceResource.setDuration(this.setLayoutDirection);
                this.setTextAppearanceResource.setIntValues(this.setOnNavigationItemSelectedListener, i);
                this.setTextAppearanceResource.start();
            }
            this.setCheckedIconEnabled = z;
        }
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        ViewGroup viewGroup;
        if (i != this.setOnNavigationItemSelectedListener) {
            if (this.setOnLongClickListener != null && (viewGroup = this.setHasDecor) != null) {
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(viewGroup);
            }
            this.setOnNavigationItemSelectedListener = i;
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.setOnLongClickListener;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.setOnLongClickListener = mutate;
            if (mutate != null) {
                MenuHostHelper$$ExternalSyntheticLambda1(mutate, this.setHasDecor, getWidth(), getHeight());
                this.setOnLongClickListener.setCallback(this);
                this.setOnLongClickListener.setAlpha(this.setOnNavigationItemSelectedListener);
            }
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        Drawable drawable;
        drawable = getContext().getDrawable(i);
        setContentScrim(drawable);
    }

    public void setStatusBarScrim(Drawable drawable) {
        int x;
        Drawable drawable2 = this.setIconTintList;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.setIconTintList = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.setIconTintList.setState(getDrawableState());
                }
                Drawable drawable3 = this.setIconTintList;
                x = setBaselineAlignBottom.setX.setX(this);
                setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(drawable3, x);
                this.setIconTintList.setVisible(getVisibility() == 0, false);
                this.setIconTintList.setCallback(this);
                this.setIconTintList.setAlpha(this.setOnNavigationItemSelectedListener);
            }
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.setIconTintList;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState) | false;
        Drawable drawable2 = this.setOnLongClickListener;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
        if (staggeredGridLayoutManager != null) {
            staggeredGridLayoutManager.setTextAppearanceResource = drawableState;
            if (staggeredGridLayoutManager.setY()) {
                staggeredGridLayoutManager.setY(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.setOnLongClickListener || drawable == this.setIconTintList;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.setIconTintList;
        if (drawable != null && drawable.isVisible() != z) {
            this.setIconTintList.setVisible(z, false);
        }
        Drawable drawable2 = this.setOnLongClickListener;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.setOnLongClickListener.setVisible(z, false);
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        Drawable drawable;
        drawable = getContext().getDrawable(i);
        setStatusBarScrim(drawable);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
        if (staggeredGridLayoutManager.setIconTintList != colorStateList) {
            staggeredGridLayoutManager.setIconTintList = colorStateList;
            staggeredGridLayoutManager.setY(false);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
        if (staggeredGridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda1 != i) {
            staggeredGridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            staggeredGridLayoutManager.setY(false);
        }
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.setY.setIconTintList(i);
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
        if (staggeredGridLayoutManager.setNavigationOnClickListener != colorStateList) {
            staggeredGridLayoutManager.setNavigationOnClickListener = colorStateList;
            staggeredGridLayoutManager.setY(false);
        }
    }

    public void setExpandedTitleGravity(int i) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
        if (staggeredGridLayoutManager.setUiOptions != i) {
            staggeredGridLayoutManager.setUiOptions = i;
            staggeredGridLayoutManager.setY(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
        if (staggeredGridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda1(typeface)) {
            staggeredGridLayoutManager.setY(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
        if (staggeredGridLayoutManager.setX(typeface)) {
            staggeredGridLayoutManager.setY(false);
        }
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.setChipCornerRadius = i;
        this.ViewPager$SavedState$1 = i2;
        this.setCenterIfNoTextEnabled = i3;
        this.setIconSize = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.setChipCornerRadius = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.ViewPager$SavedState$1 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.setCenterIfNoTextEnabled = i;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.setIconSize = i;
        requestLayout();
    }

    public void setMaxLines(int i) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
        if (i != staggeredGridLayoutManager.setMaxEms) {
            staggeredGridLayoutManager.setMaxEms = i;
            Bitmap bitmap = staggeredGridLayoutManager.setOnLongClickListener;
            staggeredGridLayoutManager.setY(false);
        }
    }

    public void setLineSpacingAdd(float f) {
        this.setY.setZ = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.setY.setTextScaleX = f;
    }

    public void setHyphenationFrequency(int i) {
        this.setY.setTextAlignment = i;
    }

    public void setStaticLayoutBuilderConfigurer(setMinFrame$MenuHostHelper$$ExternalSyntheticLambda0 setminframe_menuhosthelper__externalsyntheticlambda0) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
        if (staggeredGridLayoutManager.setLayoutDirection != setminframe_menuhosthelper__externalsyntheticlambda0) {
            staggeredGridLayoutManager.setLayoutDirection = setminframe_menuhosthelper__externalsyntheticlambda0;
            staggeredGridLayoutManager.setY(true);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.setY.setOnNavigationItemSelectedListener = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.setTextScaleX = z;
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.setAnimationFromJson = z;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.setMinAndMaxProgress != i) {
            this.setMinAndMaxProgress = i;
            setIconTintList();
        }
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        int i = this.setMinAndMaxProgress;
        if (i >= 0) {
            return i + this.ExtendableSavedState$1 + this.setTextAlignment;
        }
        WindowInsetsCompat windowInsetsCompat = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int uiOptions = windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0;
        int iconSize = setBaselineAlignBottom.setIconSize(this);
        if (iconSize > 0) {
            return Math.min((iconSize << 1) + uiOptions, getHeight());
        }
        return getHeight() / 3;
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.setY;
        staggeredGridLayoutManager.setAnimationFromJson = timeInterpolator;
        staggeredGridLayoutManager.setY(false);
    }

    public void setScrimAnimationDuration(long j) {
        this.setLayoutDirection = j;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof setY;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new setY(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class setY extends FrameLayout.LayoutParams {
        int setIconTintList;
        float setX;

        public setY(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.setIconTintList = 0;
            this.setX = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.setIconSize);
            this.setIconTintList = obtainStyledAttributes.getInt(0, 0);
            this.setX = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public setY() {
            super(-1, -1);
            this.setIconTintList = 0;
            this.setX = 0.5f;
        }

        public setY(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.setIconTintList = 0;
            this.setX = 0.5f;
        }
    }

    final void setIconTintList() {
        if (this.setOnLongClickListener == null && this.setIconTintList == null) {
            return;
        }
        setScrimsShown(getHeight() + this.MenuHostHelper$$ExternalSyntheticLambda0 < MenuHostHelper$$ExternalSyntheticLambda0());
    }

    final int setIconTintList(View view) {
        return ((getHeight() - MenuHostHelper$$ExternalSyntheticLambda1(view).setX) - view.getHeight()) - ((ViewGroup.MarginLayoutParams) ((setY) view.getLayoutParams())).bottomMargin;
    }

    /* loaded from: classes.dex */
    class setX implements AppBarLayout.setUnboundedRipple {
        setX() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.setIconTintList
        public final void setY(int i) {
            setMinFrame.this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            int uiOptions = setMinFrame.this.MenuHostHelper$$ExternalSyntheticLambda1 != null ? setMinFrame.this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions() : 0;
            int childCount = setMinFrame.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = setMinFrame.this.getChildAt(i2);
                setY sety = (setY) childAt.getLayoutParams();
                setAppSearchData MenuHostHelper$$ExternalSyntheticLambda1 = setMinFrame.MenuHostHelper$$ExternalSyntheticLambda1(childAt);
                int i3 = sety.setIconTintList;
                if (i3 == 1) {
                    int i4 = -i;
                    int iconTintList = setMinFrame.this.setIconTintList(childAt);
                    if (i4 < 0) {
                        i4 = 0;
                    } else if (i4 > iconTintList) {
                        i4 = iconTintList;
                    }
                    if (MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 && MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList != i4) {
                        MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList = i4;
                        MenuHostHelper$$ExternalSyntheticLambda1.setY();
                    }
                } else if (i3 == 2) {
                    int round = Math.round((-i) * sety.setX);
                    if (MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 && MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList != round) {
                        MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList = round;
                        MenuHostHelper$$ExternalSyntheticLambda1.setY();
                    }
                }
            }
            setMinFrame.this.setIconTintList();
            if (setMinFrame.this.setIconTintList != null && uiOptions > 0) {
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(setMinFrame.this);
            }
            int height = setMinFrame.this.getHeight();
            int iconSize = (height - setBaselineAlignBottom.setIconSize(setMinFrame.this)) - uiOptions;
            int MenuHostHelper$$ExternalSyntheticLambda0 = setMinFrame.this.MenuHostHelper$$ExternalSyntheticLambda0();
            StaggeredGridLayoutManager staggeredGridLayoutManager = setMinFrame.this.setY;
            float f = height - MenuHostHelper$$ExternalSyntheticLambda0;
            float f2 = iconSize;
            float f3 = 1.0f;
            staggeredGridLayoutManager.setChipCornerRadius = Math.min(1.0f, f / f2);
            float f4 = staggeredGridLayoutManager.setChipCornerRadius;
            staggeredGridLayoutManager.setCenterIfNoTextEnabled = f4 + ((1.0f - f4) * 0.5f);
            setMinFrame.this.setY.setY = setMinFrame.this.MenuHostHelper$$ExternalSyntheticLambda0 + iconSize;
            StaggeredGridLayoutManager staggeredGridLayoutManager2 = setMinFrame.this.setY;
            float abs = Math.abs(i) / f2;
            if (abs < 0.0f) {
                f3 = 0.0f;
            } else if (abs <= 1.0f) {
                f3 = abs;
            }
            if (f3 != staggeredGridLayoutManager2.MenuHostHelper$$ExternalSyntheticLambda0) {
                staggeredGridLayoutManager2.MenuHostHelper$$ExternalSyntheticLambda0 = f3;
                staggeredGridLayoutManager2.setX(staggeredGridLayoutManager2.MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(Drawable drawable, View view, int i, int i2) {
        if ((this.setGuidelinePercent == 1) && view != null && this.setNavigationOnClickListener) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new setY();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new setY();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new setY(layoutParams);
    }
}