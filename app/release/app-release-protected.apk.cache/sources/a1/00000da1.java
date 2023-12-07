package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.setAnimateShowBeforeLayout;
import o.setBaselineAlignBottom;
import o.setDecorPadding;
import o.setErrorAccessibilityLabelResource;
import o.setImeHintLocales;

@setErrorAccessibilityLabelResource.setY
/* loaded from: classes.dex */
public class setMinuteHourDelegate extends HorizontalScrollView {
    private static final int setChipIconTintResource = 2132083467;
    private static final setAnimateShowBeforeLayout.setY<setUnboundedRipple> setIconified = new setAnimateShowBeforeLayout.setX(16);
    private int ExtendableSavedState$1;
    private setUiOptions FloatingActionButton$BaseBehavior;
    private final int FragmentStateAdapter$2;
    private DataSetObserver FragmentStateAdapter$5;
    int MenuHostHelper$$ExternalSyntheticLambda0;
    public final ArrayList<setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1> MenuHostHelper$$ExternalSyntheticLambda1;
    private int RecyclerView$SavedState$1;
    private setY SearchView$SavedState$1;
    int ViewPager$SavedState$1;
    private final int setAdapter;
    ColorStateList setAnimationFromJson;
    int setCenterIfNoTextEnabled;
    boolean setCheckedIconEnabled;
    setSupportBackgroundTintMode setChipCornerRadius;
    private int setChipIconEnabled;
    private setSelected setConstraintSet;
    private final int setContentScrimResource;
    private ValueAnimator setFilterTouchesWhenObscured;
    private final setAnimateShowBeforeLayout.setY<setOnLongClickListener> setFloatValues;
    public final ArrayList<setUnboundedRipple> setGuidelinePercent;
    private setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1 setHasDecor;
    int setIconSize;
    final int setIconTintList;
    private int setImageTintMode;
    int setLayoutAnimation;
    float setLayoutDirection;
    ColorStateList setMaxEms;
    float setMinAndMaxProgress;
    PorterDuff.Mode setNavigationOnClickListener;
    private boolean setObjectValues;
    boolean setOnLongClickListener;
    int setOnNavigationItemSelectedListener;
    private int setSelectedChildViewEnabled;
    private setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1 setSuffixText;
    int setTextAlignment;
    setErrorAccessibilityLabelResource setTextAppearanceResource;
    int setTextScaleX;
    ColorStateList setUiOptions;
    int setUnboundedRipple;
    private setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda0 setViewTranslationCallback;
    boolean setX;
    setUnboundedRipple setY;
    Drawable setZ;

    /* loaded from: classes.dex */
    public interface setIconTintList extends setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1<setUnboundedRipple> {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    public setMinuteHourDelegate(Context context) {
        this(context, null);
    }

    public setMinuteHourDelegate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0403fd);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setMinuteHourDelegate(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMinuteHourDelegate.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.setSelectedChildViewEnabled = i;
        AppCompatSpinner$SavedState$1.setX(this.setZ, i);
        setY(false);
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.setChipIconEnabled = i;
        this.setViewTranslationCallback.MenuHostHelper$$ExternalSyntheticLambda1(i);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.setViewTranslationCallback.getChildCount()) {
            return;
        }
        if (z2) {
            setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda0 setminutehourdelegate_menuhosthelper__externalsyntheticlambda0 = this.setViewTranslationCallback;
            ValueAnimator valueAnimator = setminutehourdelegate_menuhosthelper__externalsyntheticlambda0.setIconTintList;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                setminutehourdelegate_menuhosthelper__externalsyntheticlambda0.setIconTintList.cancel();
            }
            setminutehourdelegate_menuhosthelper__externalsyntheticlambda0.setX(setminutehourdelegate_menuhosthelper__externalsyntheticlambda0.getChildAt(i), setminutehourdelegate_menuhosthelper__externalsyntheticlambda0.getChildAt(i + 1), f);
        }
        ValueAnimator valueAnimator2 = this.setFilterTouchesWhenObscured;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.setFilterTouchesWhenObscured.cancel();
        }
        scrollTo(i < 0 ? 0 : setX(i, f), 0);
        if (z) {
            setX(round);
        }
    }

    public final void setX(setUnboundedRipple setunboundedripple, int i, boolean z) {
        if (setunboundedripple.setUnboundedRipple != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        MenuHostHelper$$ExternalSyntheticLambda1(setunboundedripple, i);
        setY(setunboundedripple);
        if (z) {
            setMinuteHourDelegate setminutehourdelegate = setunboundedripple.setUnboundedRipple;
            if (setminutehourdelegate == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            setminutehourdelegate.setIconTintList(setunboundedripple, true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8) {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (!(i == 0 || i == 2)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Deprecated
    public void setOnTabSelectedListener(setIconTintList seticontintlist) {
        setOnTabSelectedListener((setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1) seticontintlist);
    }

    @Deprecated
    public void setOnTabSelectedListener(setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1 setminutehourdelegate_menuhosthelper__externalsyntheticlambda1) {
        setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1 setminutehourdelegate_menuhosthelper__externalsyntheticlambda12 = this.setSuffixText;
        if (setminutehourdelegate_menuhosthelper__externalsyntheticlambda12 != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.remove(setminutehourdelegate_menuhosthelper__externalsyntheticlambda12);
        }
        this.setSuffixText = setminutehourdelegate_menuhosthelper__externalsyntheticlambda1;
        if (setminutehourdelegate_menuhosthelper__externalsyntheticlambda1 == null || this.MenuHostHelper$$ExternalSyntheticLambda1.contains(setminutehourdelegate_menuhosthelper__externalsyntheticlambda1)) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.add(setminutehourdelegate_menuhosthelper__externalsyntheticlambda1);
    }

    public void setTabMode(int i) {
        if (i != this.MenuHostHelper$$ExternalSyntheticLambda0) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public void setTabGravity(int i) {
        if (this.setUnboundedRipple != i) {
            this.setUnboundedRipple = i;
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.setLayoutAnimation != i) {
            this.setLayoutAnimation = i;
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this.setViewTranslationCallback);
        }
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.setImageTintMode = i;
        if (i == 0) {
            this.setChipCornerRadius = new setSupportBackgroundTintMode();
        } else if (i == 1) {
            this.setChipCornerRadius = new setupWithViewPager();
        } else if (i == 2) {
            this.setChipCornerRadius = new setInflatedId();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is not a valid TabIndicatorAnimationMode");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.setOnLongClickListener = z;
        this.setViewTranslationCallback.setIconTintList();
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this.setViewTranslationCallback);
    }

    public void setInlineLabel(boolean z) {
        if (this.setX != z) {
            this.setX = z;
            for (int i = 0; i < this.setViewTranslationCallback.getChildCount(); i++) {
                View childAt = this.setViewTranslationCallback.getChildAt(i);
                if (childAt instanceof setOnLongClickListener) {
                    setOnLongClickListener setonlongclicklistener = (setOnLongClickListener) childAt;
                    setonlongclicklistener.setOrientation(!setMinuteHourDelegate.this.setX ? 1 : 0);
                    TextView textView = setonlongclicklistener.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (textView != null || setonlongclicklistener.setX != null) {
                        setonlongclicklistener.setX(textView, setonlongclicklistener.setX);
                    } else {
                        setonlongclicklistener.setX(setonlongclicklistener.setNavigationOnClickListener, setonlongclicklistener.MenuHostHelper$$ExternalSyntheticLambda1);
                    }
                }
            }
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setUnboundedRipple(boolean z) {
        if (this.setCheckedIconEnabled != z) {
            this.setCheckedIconEnabled = z;
            for (int i = 0; i < this.setViewTranslationCallback.getChildCount(); i++) {
                View childAt = this.setViewTranslationCallback.getChildAt(i);
                if (childAt instanceof setOnLongClickListener) {
                    ((setOnLongClickListener) childAt).MenuHostHelper$$ExternalSyntheticLambda1(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.setMaxEms != colorStateList) {
            this.setMaxEms = colorStateList;
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(MenuHostHelper$$ExternalSyntheticLambda0(i, i2));
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.setUiOptions != colorStateList) {
            this.setUiOptions = colorStateList;
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), i));
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.setAnimationFromJson != colorStateList) {
            this.setAnimationFromJson = colorStateList;
            for (int i = 0; i < this.setViewTranslationCallback.getChildCount(); i++) {
                View childAt = this.setViewTranslationCallback.getChildAt(i);
                if (childAt instanceof setOnLongClickListener) {
                    ((setOnLongClickListener) childAt).MenuHostHelper$$ExternalSyntheticLambda1(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), i));
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable).mutate();
        this.setZ = mutate;
        AppCompatSpinner$SavedState$1.setX(mutate, this.setSelectedChildViewEnabled);
        int i = this.setChipIconEnabled;
        if (i == -1) {
            i = this.setZ.getIntrinsicHeight();
        }
        this.setViewTranslationCallback.MenuHostHelper$$ExternalSyntheticLambda1(i);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(setFilterTouchesWhenObscured.setIconTintList(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setupWithViewPager(setErrorAccessibilityLabelResource seterroraccessibilitylabelresource) {
        setupWithViewPager(seterroraccessibilitylabelresource, true);
    }

    public void setupWithViewPager(setErrorAccessibilityLabelResource seterroraccessibilitylabelresource, boolean z) {
        setY(seterroraccessibilitylabelresource, z, false);
    }

    private void setY(setErrorAccessibilityLabelResource seterroraccessibilitylabelresource, boolean z, boolean z2) {
        List<setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda1> list;
        List<setErrorAccessibilityLabelResource.setOnLongClickListener> list2;
        setErrorAccessibilityLabelResource seterroraccessibilitylabelresource2 = this.setTextAppearanceResource;
        if (seterroraccessibilitylabelresource2 != null) {
            setUiOptions setuioptions = this.FloatingActionButton$BaseBehavior;
            if (setuioptions != null && (list2 = seterroraccessibilitylabelresource2.setX) != null) {
                list2.remove(setuioptions);
            }
            setY sety = this.SearchView$SavedState$1;
            if (sety != null && (list = this.setTextAppearanceResource.setIconTintList) != null) {
                list.remove(sety);
            }
        }
        setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1 setminutehourdelegate_menuhosthelper__externalsyntheticlambda1 = this.setHasDecor;
        if (setminutehourdelegate_menuhosthelper__externalsyntheticlambda1 != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.remove(setminutehourdelegate_menuhosthelper__externalsyntheticlambda1);
            this.setHasDecor = null;
        }
        if (seterroraccessibilitylabelresource != null) {
            this.setTextAppearanceResource = seterroraccessibilitylabelresource;
            if (this.FloatingActionButton$BaseBehavior == null) {
                this.FloatingActionButton$BaseBehavior = new setUiOptions(this);
            }
            setUiOptions setuioptions2 = this.FloatingActionButton$BaseBehavior;
            setuioptions2.setY = 0;
            setuioptions2.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            setUiOptions setuioptions3 = this.FloatingActionButton$BaseBehavior;
            if (seterroraccessibilitylabelresource.setX == null) {
                seterroraccessibilitylabelresource.setX = new ArrayList();
            }
            seterroraccessibilitylabelresource.setX.add(setuioptions3);
            setLayoutAnimation setlayoutanimation = new setLayoutAnimation(seterroraccessibilitylabelresource);
            this.setHasDecor = setlayoutanimation;
            if (!this.MenuHostHelper$$ExternalSyntheticLambda1.contains(setlayoutanimation)) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.add(setlayoutanimation);
            }
            setSelected setselected = seterroraccessibilitylabelresource.setY;
            if (setselected != null) {
                setIconTintList(setselected, z);
            }
            if (this.SearchView$SavedState$1 == null) {
                this.SearchView$SavedState$1 = new setY();
            }
            this.SearchView$SavedState$1.setX = z;
            setY sety2 = this.SearchView$SavedState$1;
            if (seterroraccessibilitylabelresource.setIconTintList == null) {
                seterroraccessibilitylabelresource.setIconTintList = new ArrayList();
            }
            seterroraccessibilitylabelresource.setIconTintList.add(sety2);
            setScrollPosition(seterroraccessibilitylabelresource.MenuHostHelper$$ExternalSyntheticLambda1, 0.0f, true);
        } else {
            this.setTextAppearanceResource = null;
            setIconTintList((setSelected) null, false);
        }
        this.setObjectValues = z2;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(setSelected setselected) {
        setIconTintList(setselected, false);
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
        if (this.setTextAppearanceResource == null) {
            ViewParent parent = getParent();
            if (parent instanceof setErrorAccessibilityLabelResource) {
                setY((setErrorAccessibilityLabelResource) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setObjectValues) {
            setupWithViewPager(null);
            this.setObjectValues = false;
        }
    }

    final void setIconTintList(setSelected setselected, boolean z) {
        DataSetObserver dataSetObserver;
        setSelected setselected2 = this.setConstraintSet;
        if (setselected2 != null && (dataSetObserver = this.FragmentStateAdapter$5) != null) {
            setselected2.setIconTintList.unregisterObserver(dataSetObserver);
        }
        this.setConstraintSet = setselected;
        if (z && setselected != null) {
            if (this.FragmentStateAdapter$5 == null) {
                this.FragmentStateAdapter$5 = new setX();
            }
            setselected.setIconTintList.registerObserver(this.FragmentStateAdapter$5);
        }
        setX();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        int size = this.setGuidelinePercent.size();
        for (int i = 0; i < size; i++) {
            setOnLongClickListener setonlongclicklistener = this.setGuidelinePercent.get(i).setLayoutAnimation;
            if (setonlongclicklistener != null) {
                setonlongclicklistener.setY();
            }
        }
    }

    private setOnLongClickListener setIconTintList(setUnboundedRipple setunboundedripple) {
        setAnimateShowBeforeLayout.setY<setOnLongClickListener> sety = this.setFloatValues;
        setOnLongClickListener MenuHostHelper$$ExternalSyntheticLambda0 = sety != null ? sety.MenuHostHelper$$ExternalSyntheticLambda0() : null;
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            MenuHostHelper$$ExternalSyntheticLambda0 = new setOnLongClickListener(getContext());
        }
        if (setunboundedripple != MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple) {
            MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple = setunboundedripple;
            MenuHostHelper$$ExternalSyntheticLambda0.setY();
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setFocusable(true);
        MenuHostHelper$$ExternalSyntheticLambda0.setMinimumWidth(setY());
        if (TextUtils.isEmpty(setunboundedripple.setY)) {
            MenuHostHelper$$ExternalSyntheticLambda0.setContentDescription(setunboundedripple.setOnLongClickListener);
        } else {
            MenuHostHelper$$ExternalSyntheticLambda0.setContentDescription(setunboundedripple.setY);
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    private void setY(setUnboundedRipple setunboundedripple) {
        setOnLongClickListener setonlongclicklistener = setunboundedripple.setLayoutAnimation;
        setonlongclicklistener.setSelected(false);
        setonlongclicklistener.setActivated(false);
        setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda0 setminutehourdelegate_menuhosthelper__externalsyntheticlambda0 = this.setViewTranslationCallback;
        int i = setunboundedripple.setUiOptions;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        setY(layoutParams);
        setminutehourdelegate_menuhosthelper__externalsyntheticlambda0.addView(setonlongclicklistener, i, layoutParams);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        setX(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        setX(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        setX(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        setX(view);
    }

    private void setX(View view) {
        if (view instanceof setQueryRefinementEnabled) {
            setQueryRefinementEnabled setqueryrefinementenabled = (setQueryRefinementEnabled) view;
            setUnboundedRipple iconTintList = setIconTintList();
            if (setqueryrefinementenabled.setX != null) {
                iconTintList.setY(setqueryrefinementenabled.setX);
            }
            if (setqueryrefinementenabled.setIconTintList != null) {
                iconTintList.setIconTintList = setqueryrefinementenabled.setIconTintList;
                if (iconTintList.setUnboundedRipple.setUnboundedRipple == 1 || iconTintList.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0 == 2) {
                    iconTintList.setUnboundedRipple.setY(true);
                }
                setOnLongClickListener setonlongclicklistener = iconTintList.setLayoutAnimation;
                if (setonlongclicklistener != null) {
                    setonlongclicklistener.setY();
                }
            }
            if (setqueryrefinementenabled.MenuHostHelper$$ExternalSyntheticLambda0 != 0) {
                iconTintList.MenuHostHelper$$ExternalSyntheticLambda0 = LayoutInflater.from(iconTintList.setLayoutAnimation.getContext()).inflate(setqueryrefinementenabled.MenuHostHelper$$ExternalSyntheticLambda0, (ViewGroup) iconTintList.setLayoutAnimation, false);
                setOnLongClickListener setonlongclicklistener2 = iconTintList.setLayoutAnimation;
                if (setonlongclicklistener2 != null) {
                    setonlongclicklistener2.setY();
                }
            }
            if (!TextUtils.isEmpty(setqueryrefinementenabled.getContentDescription())) {
                iconTintList.setY = setqueryrefinementenabled.getContentDescription();
                setOnLongClickListener setonlongclicklistener3 = iconTintList.setLayoutAnimation;
                if (setonlongclicklistener3 != null) {
                    setonlongclicklistener3.setY();
                }
            }
            setX(iconTintList, this.setGuidelinePercent.size(), this.setGuidelinePercent.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void setY(LinearLayout.LayoutParams layoutParams) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 1 && this.setUnboundedRipple == 0) {
            ((ViewGroup.LayoutParams) layoutParams).width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        ((ViewGroup.LayoutParams) layoutParams).width = -2;
        layoutParams.weight = 0.0f;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof setWebViewClient) {
            ((setWebViewClient) background).setIconSize(f);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        setDecorPadding.setY(accessibilityNodeInfo).setX(setDecorPadding.setX.setIconTintList(1, this.setGuidelinePercent.size(), false, 1));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        setOnLongClickListener setonlongclicklistener;
        Drawable drawable;
        for (int i = 0; i < this.setViewTranslationCallback.getChildCount(); i++) {
            View childAt = this.setViewTranslationCallback.getChildAt(i);
            if ((childAt instanceof setOnLongClickListener) && (drawable = (setonlongclicklistener = (setOnLongClickListener) childAt).setY) != null) {
                drawable.setBounds(setonlongclicklistener.getLeft(), setonlongclicklistener.getTop(), setonlongclicklistener.getRight(), setonlongclicklistener.getBottom());
                setonlongclicklistener.setY.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
        if (r0 != 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
        if (r8.getMeasuredWidth() != getMeasuredWidth()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c5, code lost:
        if (r8.getMeasuredWidth() >= getMeasuredWidth()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
        r2 = true;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            android.content.Context r0 = r7.getContext()
            java.util.ArrayList<o.setMinuteHourDelegate$setUnboundedRipple> r1 = r7.setGuidelinePercent
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        Lc:
            r4 = 1
            if (r3 >= r1) goto L2a
            java.util.ArrayList<o.setMinuteHourDelegate$setUnboundedRipple> r5 = r7.setGuidelinePercent
            java.lang.Object r5 = r5.get(r3)
            o.setMinuteHourDelegate$setUnboundedRipple r5 = (o.setMinuteHourDelegate.setUnboundedRipple) r5
            if (r5 == 0) goto L27
            android.graphics.drawable.Drawable r6 = r5.setIconTintList
            if (r6 == 0) goto L27
            java.lang.CharSequence r5 = r5.setOnLongClickListener
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L27
            r1 = 1
            goto L2b
        L27:
            int r3 = r3 + 1
            goto Lc
        L2a:
            r1 = 0
        L2b:
            if (r1 == 0) goto L34
            boolean r1 = r7.setX
            if (r1 != 0) goto L34
            r1 = 72
            goto L36
        L34:
            r1 = 48
        L36:
            android.content.res.Resources r0 = r0.getResources()
            float r1 = (float) r1
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r4, r1, r0)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L63
            if (r1 == 0) goto L54
            goto L76
        L54:
            int r9 = r7.getPaddingTop()
            int r1 = r7.getPaddingBottom()
            int r0 = r0 + r9
            int r0 = r0 + r1
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            goto L76
        L63:
            int r1 = r7.getChildCount()
            if (r1 != r4) goto L76
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            if (r1 < r0) goto L76
            android.view.View r1 = r7.getChildAt(r2)
            r1.setMinimumHeight(r0)
        L76:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            if (r1 == 0) goto L9b
            int r1 = r7.setContentScrimResource
            if (r1 > 0) goto L99
            float r0 = (float) r0
            android.content.Context r1 = r7.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 1113587712(0x42600000, float:56.0)
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r4, r3, r1)
            float r0 = r0 - r1
            int r1 = (int) r0
        L99:
            r7.ViewPager$SavedState$1 = r1
        L9b:
            super.onMeasure(r8, r9)
            int r8 = r7.getChildCount()
            if (r8 != r4) goto Le9
            android.view.View r8 = r7.getChildAt(r2)
            int r0 = r7.MenuHostHelper$$ExternalSyntheticLambda0
            if (r0 == 0) goto Lbd
            if (r0 == r4) goto Lb2
            r1 = 2
            if (r0 == r1) goto Lbd
            goto Lc9
        Lb2:
            int r0 = r8.getMeasuredWidth()
            int r1 = r7.getMeasuredWidth()
            if (r0 == r1) goto Lc9
            goto Lc8
        Lbd:
            int r0 = r8.getMeasuredWidth()
            int r1 = r7.getMeasuredWidth()
            if (r0 < r1) goto Lc8
            goto Lc9
        Lc8:
            r2 = 1
        Lc9:
            if (r2 == 0) goto Le9
            int r0 = r7.getPaddingTop()
            int r1 = r7.getPaddingBottom()
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            int r2 = r2.height
            int r0 = r0 + r1
            int r9 = getChildMeasureSpec(r9, r0, r2)
            int r0 = r7.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r8.measure(r0, r9)
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMinuteHourDelegate.onMeasure(int, int):void");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        boolean z;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && setBaselineAlignBottom.setConstraintSet(this)) {
            setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda0 setminutehourdelegate_menuhosthelper__externalsyntheticlambda0 = this.setViewTranslationCallback;
            int childCount = setminutehourdelegate_menuhosthelper__externalsyntheticlambda0.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    z = false;
                    break;
                } else if (setminutehourdelegate_menuhosthelper__externalsyntheticlambda0.getChildAt(i2).getWidth() <= 0) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                int scrollX = getScrollX();
                int x = setX(i, 0.0f);
                if (scrollX != x) {
                    if (this.setFilterTouchesWhenObscured == null) {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        this.setFilterTouchesWhenObscured = valueAnimator;
                        valueAnimator.setInterpolator(setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0);
                        this.setFilterTouchesWhenObscured.setDuration(this.RecyclerView$SavedState$1);
                        this.setFilterTouchesWhenObscured.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.setMinuteHourDelegate.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                setMinuteHourDelegate.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                            }
                        });
                    }
                    this.setFilterTouchesWhenObscured.setIntValues(scrollX, x);
                    this.setFilterTouchesWhenObscured.start();
                }
                setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda0 setminutehourdelegate_menuhosthelper__externalsyntheticlambda02 = this.setViewTranslationCallback;
                int i3 = this.RecyclerView$SavedState$1;
                ValueAnimator valueAnimator2 = setminutehourdelegate_menuhosthelper__externalsyntheticlambda02.setIconTintList;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    setminutehourdelegate_menuhosthelper__externalsyntheticlambda02.setIconTintList.cancel();
                }
                setminutehourdelegate_menuhosthelper__externalsyntheticlambda02.setY(true, i, i3);
                return;
            }
        }
        setScrollPosition(i, 0.0f, true);
    }

    private void setX(int i) {
        int childCount = this.setViewTranslationCallback.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.setViewTranslationCallback.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public final void setIconTintList(setUnboundedRipple setunboundedripple, boolean z) {
        setUnboundedRipple setunboundedripple2 = this.setY;
        if (setunboundedripple2 == setunboundedripple) {
            if (setunboundedripple2 != null) {
                MenuHostHelper$$ExternalSyntheticLambda0(setunboundedripple);
                MenuHostHelper$$ExternalSyntheticLambda1(setunboundedripple.setUiOptions);
                return;
            }
            return;
        }
        int i = setunboundedripple != null ? setunboundedripple.setUiOptions : -1;
        if (z) {
            if ((setunboundedripple2 == null || setunboundedripple2.setUiOptions == -1) && i != -1) {
                setScrollPosition(i, 0.0f, true);
            } else {
                MenuHostHelper$$ExternalSyntheticLambda1(i);
            }
            if (i != -1) {
                setX(i);
            }
        }
        this.setY = setunboundedripple;
        if (setunboundedripple2 != null) {
            setX(setunboundedripple2);
        }
        if (setunboundedripple != null) {
            MenuHostHelper$$ExternalSyntheticLambda1(setunboundedripple);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(setUnboundedRipple setunboundedripple) {
        for (int size = this.MenuHostHelper$$ExternalSyntheticLambda1.size() - 1; size >= 0; size--) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.get(size).MenuHostHelper$$ExternalSyntheticLambda0(setunboundedripple);
        }
    }

    private void setX(setUnboundedRipple setunboundedripple) {
        for (int size = this.MenuHostHelper$$ExternalSyntheticLambda1.size() - 1; size >= 0; size--) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.get(size).setY(setunboundedripple);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(setUnboundedRipple setunboundedripple) {
        for (int size = this.MenuHostHelper$$ExternalSyntheticLambda1.size() - 1; size >= 0; size--) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.get(size).setIconTintList(setunboundedripple);
        }
    }

    private int setX(int i, float f) {
        View childAt;
        int x;
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if ((i2 == 0 || i2 == 2) && (childAt = this.setViewTranslationCallback.getChildAt(i)) != null) {
            int i3 = i + 1;
            View childAt2 = i3 < this.setViewTranslationCallback.getChildCount() ? this.setViewTranslationCallback.getChildAt(i3) : null;
            int width = childAt.getWidth();
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i4 = (int) ((width + width2) * 0.5f * f);
            x = setBaselineAlignBottom.setX.setX(this);
            return x == 0 ? left + i4 : left - i4;
        }
        return 0;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        setBaselineAlignBottom.setX.setX(this.setViewTranslationCallback, (i == 0 || i == 2) ? Math.max(0, this.ExtendableSavedState$1 - this.setIconSize) : 0, 0, 0, 0);
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i2 == 0) {
            setY(this.setUnboundedRipple);
        } else if (i2 == 1 || i2 == 2) {
            if (this.setUnboundedRipple == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.setViewTranslationCallback.setGravity(1);
        }
        setY(true);
    }

    private void setY(int i) {
        if (i == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.setViewTranslationCallback.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.setViewTranslationCallback.setGravity(8388611);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(boolean z) {
        for (int i = 0; i < this.setViewTranslationCallback.getChildCount(); i++) {
            View childAt = this.setViewTranslationCallback.getChildAt(i);
            childAt.setMinimumWidth(setY());
            setY((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class setUnboundedRipple {
        public View MenuHostHelper$$ExternalSyntheticLambda0;
        Drawable setIconTintList;
        public setOnLongClickListener setLayoutAnimation;
        Object setNavigationOnClickListener;
        CharSequence setOnLongClickListener;
        public setMinuteHourDelegate setUnboundedRipple;
        CharSequence setY;
        public int setUiOptions = -1;
        int setX = 1;
        int MenuHostHelper$$ExternalSyntheticLambda1 = -1;

        public final setUnboundedRipple setY(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.setY) && !TextUtils.isEmpty(charSequence)) {
                this.setLayoutAnimation.setContentDescription(charSequence);
            }
            this.setOnLongClickListener = charSequence;
            setOnLongClickListener setonlongclicklistener = this.setLayoutAnimation;
            if (setonlongclicklistener != null) {
                setonlongclicklistener.setY();
            }
            return this;
        }

        public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            setMinuteHourDelegate setminutehourdelegate = this.setUnboundedRipple;
            if (setminutehourdelegate == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            setUnboundedRipple setunboundedripple = setminutehourdelegate.setY;
            int i = setunboundedripple != null ? setunboundedripple.setUiOptions : -1;
            return i != -1 && i == this.setUiOptions;
        }
    }

    /* loaded from: classes.dex */
    public final class setOnLongClickListener extends LinearLayout {
        TextView MenuHostHelper$$ExternalSyntheticLambda0;
        ImageView MenuHostHelper$$ExternalSyntheticLambda1;
        View setIconTintList;
        TextView setNavigationOnClickListener;
        private setIconGravity setOnLongClickListener;
        private int setUiOptions;
        setUnboundedRipple setUnboundedRipple;
        ImageView setX;
        Drawable setY;

        public setOnLongClickListener(Context context) {
            super(context);
            this.setUiOptions = 2;
            MenuHostHelper$$ExternalSyntheticLambda1(context);
            setBaselineAlignBottom.setX.setX(this, setMinuteHourDelegate.this.setIconSize, setMinuteHourDelegate.this.setTextScaleX, setMinuteHourDelegate.this.setCenterIfNoTextEnabled, setMinuteHourDelegate.this.setTextAlignment);
            setGravity(17);
            setOrientation(!setMinuteHourDelegate.this.setX ? 1 : 0);
            setClickable(true);
            setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(this, setVerticalScrollbarThumbDrawable.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), 1002));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [android.graphics.drawable.RippleDrawable] */
        final void MenuHostHelper$$ExternalSyntheticLambda1(Context context) {
            if (setMinuteHourDelegate.this.setIconTintList != 0) {
                Drawable iconTintList = setFilterTouchesWhenObscured.setIconTintList(context, setMinuteHourDelegate.this.setIconTintList);
                this.setY = iconTintList;
                if (iconTintList != null && iconTintList.isStateful()) {
                    this.setY.setState(getDrawableState());
                }
            } else {
                this.setY = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (setMinuteHourDelegate.this.setAnimationFromJson != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList x = setChipText.setX(setMinuteHourDelegate.this.setAnimationFromJson);
                if (setMinuteHourDelegate.this.setCheckedIconEnabled) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(x, gradientDrawable, setMinuteHourDelegate.this.setCheckedIconEnabled ? null : gradientDrawable2);
            }
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(this, gradientDrawable);
            setMinuteHourDelegate.this.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.setY;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.setY.setState(drawableState);
            }
            if (z) {
                invalidate();
                setMinuteHourDelegate.this.invalidate();
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.setUnboundedRipple != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                setUnboundedRipple setunboundedripple = this.setUnboundedRipple;
                setMinuteHourDelegate setminutehourdelegate = setunboundedripple.setUnboundedRipple;
                if (setminutehourdelegate == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                setminutehourdelegate.setIconTintList(setunboundedripple, true);
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        public final void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.setNavigationOnClickListener;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.setIconTintList;
            if (view != null) {
                view.setSelected(z);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            setDecorPadding y = setDecorPadding.setY(accessibilityNodeInfo);
            y.setY(setDecorPadding.setY.MenuHostHelper$$ExternalSyntheticLambda0(0, 1, this.setUnboundedRipple.setUiOptions, 1, false, isSelected()));
            if (isSelected()) {
                y.setIconTintList(false);
                y.setX(setDecorPadding.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            y.setOnLongClickListener(getResources().getString(R.string.res_0x7f140045));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int i3 = setMinuteHourDelegate.this.ViewPager$SavedState$1;
            if (i3 > 0 && (mode == 0 || size > i3)) {
                i = View.MeasureSpec.makeMeasureSpec(setMinuteHourDelegate.this.ViewPager$SavedState$1, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.setNavigationOnClickListener != null) {
                float f = setMinuteHourDelegate.this.setMinAndMaxProgress;
                int i4 = this.setUiOptions;
                ImageView imageView = this.MenuHostHelper$$ExternalSyntheticLambda1;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.setNavigationOnClickListener;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = setMinuteHourDelegate.this.setLayoutDirection;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.setNavigationOnClickListener.getTextSize();
                int lineCount = this.setNavigationOnClickListener.getLineCount();
                int MenuHostHelper$$ExternalSyntheticLambda0 = setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda0(this.setNavigationOnClickListener);
                int i5 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i5 != 0 || (MenuHostHelper$$ExternalSyntheticLambda0 >= 0 && i4 != MenuHostHelper$$ExternalSyntheticLambda0)) {
                    if (setMinuteHourDelegate.this.MenuHostHelper$$ExternalSyntheticLambda0 == 1 && i5 > 0 && lineCount == 1 && ((layout = this.setNavigationOnClickListener.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.setNavigationOnClickListener.setTextSize(0, f);
                        this.setNavigationOnClickListener.setMaxLines(i4);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public final void setY() {
            setUnboundedRipple setunboundedripple = this.setUnboundedRipple;
            View view = setunboundedripple != null ? setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda0 : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.setIconTintList = view;
                TextView textView = this.setNavigationOnClickListener;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.MenuHostHelper$$ExternalSyntheticLambda1.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.MenuHostHelper$$ExternalSyntheticLambda0 = textView2;
                if (textView2 != null) {
                    this.setUiOptions = setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda0(textView2);
                }
                this.setX = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.setIconTintList;
                if (view2 != null) {
                    removeView(view2);
                    this.setIconTintList = null;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
                this.setX = null;
            }
            boolean z = false;
            if (this.setIconTintList == null) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                    setX();
                }
                if (this.setNavigationOnClickListener == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d0026, (ViewGroup) this, false);
                    this.setNavigationOnClickListener = textView3;
                    addView(textView3);
                    this.setUiOptions = setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda0(this.setNavigationOnClickListener);
                }
                setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener, setMinuteHourDelegate.this.setOnNavigationItemSelectedListener);
                if (setMinuteHourDelegate.this.setMaxEms != null) {
                    this.setNavigationOnClickListener.setTextColor(setMinuteHourDelegate.this.setMaxEms);
                }
                setX(this.setNavigationOnClickListener, this.MenuHostHelper$$ExternalSyntheticLambda1);
                final ImageView imageView2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (imageView2 != null) {
                    imageView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.setMinuteHourDelegate.setOnLongClickListener.4
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            imageView2.getVisibility();
                        }
                    });
                }
                final TextView textView4 = this.setNavigationOnClickListener;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.setMinuteHourDelegate.setOnLongClickListener.4
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            textView4.getVisibility();
                        }
                    });
                }
            } else {
                TextView textView5 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (textView5 != null || this.setX != null) {
                    setX(textView5, this.setX);
                }
            }
            if (setunboundedripple != null && !TextUtils.isEmpty(setunboundedripple.setY)) {
                setContentDescription(setunboundedripple.setY);
            }
            if (setunboundedripple != null && setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda1()) {
                z = true;
            }
            setSelected(z);
        }

        private void setX() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d0025, (ViewGroup) this, false);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = imageView;
            addView(imageView, 0);
        }

        final void setX(TextView textView, ImageView imageView) {
            int x;
            setUnboundedRipple setunboundedripple = this.setUnboundedRipple;
            Drawable mutate = (setunboundedripple == null || setunboundedripple.setIconTintList == null) ? null : setEnsureMinTouchTargetSize.setNavigationOnClickListener(this.setUnboundedRipple.setIconTintList).mutate();
            if (mutate != null) {
                setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda1(mutate, setMinuteHourDelegate.this.setUiOptions);
                if (setMinuteHourDelegate.this.setNavigationOnClickListener != null) {
                    setEnsureMinTouchTargetSize.setX(mutate, setMinuteHourDelegate.this.setNavigationOnClickListener);
                }
            }
            setUnboundedRipple setunboundedripple2 = this.setUnboundedRipple;
            CharSequence charSequence = setunboundedripple2 != null ? setunboundedripple2.setOnLongClickListener : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    if (this.setUnboundedRipple.setX == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int applyDimension = (z && imageView.getVisibility() == 0) ? (int) TypedValue.applyDimension(1, 8.0f, getContext().getResources().getDisplayMetrics()) : 0;
                if (setMinuteHourDelegate.this.setX) {
                    x = setImeHintLocales.setY.setX(marginLayoutParams);
                    if (applyDimension != x) {
                        setImeHintLocales.setX(marginLayoutParams, applyDimension);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (applyDimension != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = applyDimension;
                    setImeHintLocales.setX(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            setUnboundedRipple setunboundedripple3 = this.setUnboundedRipple;
            CharSequence charSequence2 = setunboundedripple3 != null ? setunboundedripple3.setY : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (!z) {
                    charSequence = charSequence2;
                }
                transact.setIconTintList(this, charSequence);
            }
        }
    }

    private static ColorStateList MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private int setY() {
        int i = this.FragmentStateAdapter$2;
        if (i != -1) {
            return i;
        }
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i2 == 0 || i2 == 2) {
            return this.setAdapter;
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* loaded from: classes.dex */
    public static class setUiOptions implements setErrorAccessibilityLabelResource.setOnLongClickListener {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        private final WeakReference<setMinuteHourDelegate> MenuHostHelper$$ExternalSyntheticLambda1;
        int setY;

        public setUiOptions(setMinuteHourDelegate setminutehourdelegate) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new WeakReference<>(setminutehourdelegate);
        }

        @Override // o.setErrorAccessibilityLabelResource.setOnLongClickListener
        public final void setIconTintList(int i) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = this.setY;
            this.setY = i;
        }

        @Override // o.setErrorAccessibilityLabelResource.setOnLongClickListener
        public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, float f) {
            setMinuteHourDelegate setminutehourdelegate = this.MenuHostHelper$$ExternalSyntheticLambda1.get();
            if (setminutehourdelegate != null) {
                int i2 = this.setY;
                boolean z = false;
                setminutehourdelegate.setScrollPosition(i, f, i2 != 2 || this.MenuHostHelper$$ExternalSyntheticLambda0 == 1, (i2 == 2 && this.MenuHostHelper$$ExternalSyntheticLambda0 == 0) ? true : true);
            }
        }

        @Override // o.setErrorAccessibilityLabelResource.setOnLongClickListener
        public final void setY(int i) {
            setMinuteHourDelegate setminutehourdelegate = this.MenuHostHelper$$ExternalSyntheticLambda1.get();
            if (setminutehourdelegate != null) {
                setUnboundedRipple setunboundedripple = setminutehourdelegate.setY;
                if ((setunboundedripple != null ? setunboundedripple.setUiOptions : -1) == i || i >= setminutehourdelegate.setGuidelinePercent.size()) {
                    return;
                }
                int i2 = this.setY;
                setminutehourdelegate.setIconTintList(setminutehourdelegate.MenuHostHelper$$ExternalSyntheticLambda0(i), i2 == 0 || (i2 == 2 && this.MenuHostHelper$$ExternalSyntheticLambda0 == 0));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class setLayoutAnimation implements setIconTintList {
        private final setErrorAccessibilityLabelResource setY;

        @Override // o.setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1
        public final void setIconTintList(setUnboundedRipple setunboundedripple) {
        }

        @Override // o.setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1
        public final void setY(setUnboundedRipple setunboundedripple) {
        }

        public setLayoutAnimation(setErrorAccessibilityLabelResource seterroraccessibilitylabelresource) {
            this.setY = seterroraccessibilitylabelresource;
        }

        @Override // o.setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1
        public final void MenuHostHelper$$ExternalSyntheticLambda0(setUnboundedRipple setunboundedripple) {
            this.setY.setCurrentItem(setunboundedripple.setUiOptions);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setX extends DataSetObserver {
        setX() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            setMinuteHourDelegate.this.setX();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            setMinuteHourDelegate.this.setX();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setY implements setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda1 {
        boolean setX;

        setY() {
        }

        @Override // o.setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda1
        public final void setIconTintList(setErrorAccessibilityLabelResource seterroraccessibilitylabelresource, setSelected setselected) {
            if (setMinuteHourDelegate.this.setTextAppearanceResource == seterroraccessibilitylabelresource) {
                setMinuteHourDelegate.this.setIconTintList(setselected, this.setX);
            }
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(setUnboundedRipple setunboundedripple, int i) {
        setunboundedripple.setUiOptions = i;
        this.setGuidelinePercent.add(i, setunboundedripple);
        int size = this.setGuidelinePercent.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            }
            this.setGuidelinePercent.get(i).setUiOptions = i;
        }
    }

    public final setUnboundedRipple MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (i < 0 || i >= this.setGuidelinePercent.size()) {
            return null;
        }
        return this.setGuidelinePercent.get(i);
    }

    public final setUnboundedRipple setIconTintList() {
        setUnboundedRipple MenuHostHelper$$ExternalSyntheticLambda0 = setIconified.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            MenuHostHelper$$ExternalSyntheticLambda0 = new setUnboundedRipple();
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple = this;
        MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation = setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0);
        if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 != -1) {
            MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation.setId(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return (i == 0 || i == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    final void setX() {
        for (int childCount = this.setViewTranslationCallback.getChildCount() - 1; childCount >= 0; childCount--) {
            setOnLongClickListener setonlongclicklistener = (setOnLongClickListener) this.setViewTranslationCallback.getChildAt(childCount);
            this.setViewTranslationCallback.removeViewAt(childCount);
            if (setonlongclicklistener != null) {
                if (setonlongclicklistener.setUnboundedRipple != null) {
                    setonlongclicklistener.setUnboundedRipple = null;
                    setonlongclicklistener.setY();
                }
                setonlongclicklistener.setSelected(false);
                this.setFloatValues.setIconTintList(setonlongclicklistener);
            }
            requestLayout();
        }
        Iterator<setUnboundedRipple> it = this.setGuidelinePercent.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            setUnboundedRipple next = it.next();
            it.remove();
            next.setUnboundedRipple = null;
            next.setLayoutAnimation = null;
            next.setNavigationOnClickListener = null;
            next.setIconTintList = null;
            next.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
            next.setOnLongClickListener = null;
            next.setY = null;
            next.setUiOptions = -1;
            next.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            setIconified.setIconTintList(next);
        }
        this.setY = null;
        setSelected setselected = this.setConstraintSet;
        if (setselected != null) {
            int iconTintList = setselected.setIconTintList();
            for (int i = 0; i < iconTintList; i++) {
                setX(setIconTintList().setY(setSelected.MenuHostHelper$$ExternalSyntheticLambda0()), this.setGuidelinePercent.size(), false);
            }
            setErrorAccessibilityLabelResource seterroraccessibilitylabelresource = this.setTextAppearanceResource;
            if (seterroraccessibilitylabelresource == null || iconTintList <= 0) {
                return;
            }
            int i2 = seterroraccessibilitylabelresource.MenuHostHelper$$ExternalSyntheticLambda1;
            setUnboundedRipple setunboundedripple = this.setY;
            if (i2 == (setunboundedripple != null ? setunboundedripple.setUiOptions : -1) || i2 >= this.setGuidelinePercent.size()) {
                return;
            }
            setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0(i2), true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.setViewTranslationCallback.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }
}