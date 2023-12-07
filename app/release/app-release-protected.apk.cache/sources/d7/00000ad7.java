package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import o.TextInputLayout$SavedState$1;
import o.setDecorPadding;
import o.setEnsureMinTouchTargetSize;

/* loaded from: classes.dex */
public abstract class setCounterTextColor extends FrameLayout implements TextInputLayout$SavedState$1.setY {
    private float ExtendableSavedState$1;
    private Drawable FloatingActionButton$BaseBehavior;
    private final TextView FragmentStateAdapter$5;
    final ImageView MenuHostHelper$$ExternalSyntheticLambda0;
    setIconTintList MenuHostHelper$$ExternalSyntheticLambda1;
    private final TextView SearchView$SavedState$1;
    private boolean ViewPager$SavedState$1;
    private boolean setAnimationFromJson;
    private ValueAnimator setCenterIfNoTextEnabled;
    private int setCheckedIconEnabled;
    private int setChipCornerRadius;
    private int setChipIconTintResource;
    private float setContentScrimResource;
    private int setGuidelinePercent;
    private float setHasDecor;
    private int setIconSize;
    setIconGravity setIconTintList;
    private Drawable setIconified;
    private final ViewGroup setLayoutDirection;
    private boolean setMaxEms;
    private int setMinAndMaxProgress;
    ActionMenuPresenter$SavedState$1 setOnLongClickListener;
    private Drawable setOnNavigationItemSelectedListener;
    private int setTextAlignment;
    private ColorStateList setTextAppearanceResource;
    private ColorStateList setTextScaleX;
    boolean setUiOptions;
    float setX;
    final View setY;
    private final FrameLayout setZ;
    private static final int[] setUnboundedRipple = {16842912};
    private static final setIconTintList setLayoutAnimation = new setIconTintList((byte) 0);
    private static final setIconTintList setNavigationOnClickListener = new setCounterTextColor$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);

    protected abstract int MenuHostHelper$$ExternalSyntheticLambda0();

    @Override // o.TextInputLayout$SavedState$1.setY
    public final boolean setIconTintList() {
        return false;
    }

    public void setShortcut(boolean z, char c) {
    }

    protected int setX() {
        return R.dimen.res_0x7f07020f;
    }

    public setCounterTextColor(Context context) {
        super(context);
        this.setUiOptions = false;
        this.setCheckedIconEnabled = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setLayoutAnimation;
        this.setX = 0.0f;
        this.ViewPager$SavedState$1 = false;
        this.setTextAlignment = 0;
        this.setIconSize = 0;
        this.setMaxEms = false;
        this.setChipCornerRadius = 0;
        LayoutInflater.from(context).inflate(MenuHostHelper$$ExternalSyntheticLambda0(), (ViewGroup) this, true);
        this.setZ = (FrameLayout) findViewById(R.id.res_0x7f0a014c);
        this.setY = findViewById(R.id.res_0x7f0a014b);
        ImageView imageView = (ImageView) findViewById(R.id.res_0x7f0a014d);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.res_0x7f0a014e);
        this.setLayoutDirection = viewGroup;
        TextView textView = (TextView) findViewById(R.id.res_0x7f0a0150);
        this.FragmentStateAdapter$5 = textView;
        TextView textView2 = (TextView) findViewById(R.id.res_0x7f0a014f);
        this.SearchView$SavedState$1 = textView2;
        setBackgroundResource(R.drawable.res_0x7f0800c6);
        this.setMinAndMaxProgress = getResources().getDimensionPixelSize(setX());
        this.setGuidelinePercent = viewGroup.getPaddingBottom();
        setBaselineAlignBottom.setUnboundedRipple(textView, 2);
        setBaselineAlignBottom.setUnboundedRipple(textView2, 2);
        setFocusable(true);
        float textSize = textView.getTextSize();
        float textSize2 = textView2.getTextSize();
        this.setContentScrimResource = textSize - textSize2;
        this.ExtendableSavedState$1 = textSize2 / textSize;
        this.setHasDecor = textSize / textSize2;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.setCounterTextColor.3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (setCounterTextColor.this.MenuHostHelper$$ExternalSyntheticLambda0.getVisibility() == 0) {
                        setCounterTextColor setcountertextcolor = setCounterTextColor.this;
                        ImageView imageView2 = setcountertextcolor.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (setcountertextcolor.setIconTintList != null) {
                            setIconGravity seticongravity = setcountertextcolor.setIconTintList;
                            ImageView imageView3 = setcountertextcolor.MenuHostHelper$$ExternalSyntheticLambda0;
                            Rect rect = new Rect();
                            imageView2.getDrawingRect(rect);
                            seticongravity.setBounds(rect);
                            seticongravity.MenuHostHelper$$ExternalSyntheticLambda1(imageView2, null);
                        }
                    }
                }
            });
        }
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.setLayoutDirection.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int measuredWidth = this.setLayoutDirection.getMeasuredWidth();
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        setIconGravity seticongravity = this.setIconTintList;
        int minimumWidth = seticongravity == null ? 0 : seticongravity.getMinimumWidth() - this.setIconTintList.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled.intValue();
        View view = this.setZ;
        if (view == null) {
            view = this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
        return Math.max(Math.max(minimumWidth, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) + this.MenuHostHelper$$ExternalSyntheticLambda0.getMeasuredWidth() + Math.max(minimumWidth, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin), i + measuredWidth + i2);
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.setLayoutDirection.getLayoutParams();
        setIconGravity seticongravity = this.setIconTintList;
        int minimumHeight = seticongravity != null ? seticongravity.getMinimumHeight() / 2 : 0;
        View view = this.setZ;
        if (view == null) {
            view = this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return Math.max(minimumHeight, ((ViewGroup.MarginLayoutParams) ((FrameLayout.LayoutParams) view.getLayoutParams())).topMargin) + this.MenuHostHelper$$ExternalSyntheticLambda0.getMeasuredWidth() + minimumHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.setLayoutDirection.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // o.TextInputLayout$SavedState$1.setY
    public final void setIconTintList(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        CharSequence title;
        this.setOnLongClickListener = actionMenuPresenter$SavedState$1;
        setCheckable(actionMenuPresenter$SavedState$1.isCheckable());
        setChecked(actionMenuPresenter$SavedState$1.isChecked());
        setEnabled(actionMenuPresenter$SavedState$1.isEnabled());
        setIcon(actionMenuPresenter$SavedState$1.getIcon());
        setTitle(actionMenuPresenter$SavedState$1.getTitle());
        setId(actionMenuPresenter$SavedState$1.getItemId());
        if (!TextUtils.isEmpty(actionMenuPresenter$SavedState$1.getContentDescription())) {
            setContentDescription(actionMenuPresenter$SavedState$1.getContentDescription());
        }
        if (!TextUtils.isEmpty(actionMenuPresenter$SavedState$1.getTooltipText())) {
            title = actionMenuPresenter$SavedState$1.getTooltipText();
        } else {
            title = actionMenuPresenter$SavedState$1.getTitle();
        }
        if (Build.VERSION.SDK_INT > 23) {
            transact.setIconTintList(this, title);
        }
        setVisibility(actionMenuPresenter$SavedState$1.isVisible() ? 0 : 8);
        this.setUiOptions = true;
    }

    public void setItemPosition(int i) {
        this.setCheckedIconEnabled = i;
    }

    public void setShifting(boolean z) {
        if (this.setAnimationFromJson != z) {
            this.setAnimationFromJson = z;
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setOnLongClickListener;
            if (actionMenuPresenter$SavedState$1 != null) {
                setChecked(actionMenuPresenter$SavedState$1.isChecked());
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        if (this.setChipIconTintResource != i) {
            this.setChipIconTintResource = i;
            if (this.setMaxEms && i == 2) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = setNavigationOnClickListener;
            } else {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = setLayoutAnimation;
            }
            MenuHostHelper$$ExternalSyntheticLambda0(getWidth());
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setOnLongClickListener;
            if (actionMenuPresenter$SavedState$1 != null) {
                setChecked(actionMenuPresenter$SavedState$1.isChecked());
            }
        }
    }

    @Override // o.TextInputLayout$SavedState$1.setY
    public final ActionMenuPresenter$SavedState$1 setY() {
        return this.setOnLongClickListener;
    }

    public void setTitle(CharSequence charSequence) {
        this.FragmentStateAdapter$5.setText(charSequence);
        this.SearchView$SavedState$1.setText(charSequence);
        ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setOnLongClickListener;
        if (actionMenuPresenter$SavedState$1 == null || TextUtils.isEmpty(actionMenuPresenter$SavedState$1.getContentDescription())) {
            setContentDescription(charSequence);
        }
        ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$12 = this.setOnLongClickListener;
        if (actionMenuPresenter$SavedState$12 != null && !TextUtils.isEmpty(actionMenuPresenter$SavedState$12.getTooltipText())) {
            charSequence = this.setOnLongClickListener.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            transact.setIconTintList(this, charSequence);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    @Override // android.view.View
    protected void onSizeChanged(final int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new Runnable() { // from class: o.setCounterTextColor.5
            @Override // java.lang.Runnable
            public final void run() {
                setCounterTextColor.this.MenuHostHelper$$ExternalSyntheticLambda0(i);
            }
        });
    }

    public void setChecked(boolean z) {
        TextView textView = this.SearchView$SavedState$1;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.SearchView$SavedState$1;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.FragmentStateAdapter$5;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.FragmentStateAdapter$5;
        textView4.setPivotY(textView4.getBaseline());
        final float f = z ? 1.0f : 0.0f;
        if (this.ViewPager$SavedState$1 && this.setUiOptions && setBaselineAlignBottom.setChipIconTintResource(this)) {
            ValueAnimator valueAnimator = this.setCenterIfNoTextEnabled;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.setCenterIfNoTextEnabled = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.setX, f);
            this.setCenterIfNoTextEnabled = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.setCounterTextColor.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    setCounterTextColor setcountertextcolor = setCounterTextColor.this;
                    float f2 = f;
                    View view = setcountertextcolor.setY;
                    if (view != null) {
                        setcountertextcolor.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(floatValue, f2, view);
                    }
                    setcountertextcolor.setX = floatValue;
                }
            });
            this.setCenterIfNoTextEnabled.setInterpolator(setChipMinHeight.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), R.attr.res_0x7f040302, setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0));
            ValueAnimator valueAnimator2 = this.setCenterIfNoTextEnabled;
            Context context = getContext();
            getResources();
            valueAnimator2.setDuration(setChipMinHeight.setX(context, R.attr.res_0x7f0402f2, 300));
            this.setCenterIfNoTextEnabled.start();
        } else {
            View view = this.setY;
            if (view != null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(f, f, view);
            }
            this.setX = f;
        }
        int i = this.setChipIconTintResource;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    View view2 = this.setZ;
                    if (view2 == null) {
                        view2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                    int i2 = this.setMinAndMaxProgress;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i2;
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i2;
                    layoutParams.gravity = 49;
                    view2.setLayoutParams(layoutParams);
                    ViewGroup viewGroup = this.setLayoutDirection;
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), this.setGuidelinePercent);
                    this.SearchView$SavedState$1.setVisibility(0);
                } else {
                    View view3 = this.setZ;
                    if (view3 == null) {
                        view3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                    int i3 = this.setMinAndMaxProgress;
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view3.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i3;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i3;
                    layoutParams2.gravity = 17;
                    view3.setLayoutParams(layoutParams2);
                    ViewGroup viewGroup2 = this.setLayoutDirection;
                    viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), viewGroup2.getPaddingRight(), 0);
                    this.SearchView$SavedState$1.setVisibility(4);
                }
                this.FragmentStateAdapter$5.setVisibility(4);
            } else if (i == 1) {
                ViewGroup viewGroup3 = this.setLayoutDirection;
                viewGroup3.setPadding(viewGroup3.getPaddingLeft(), viewGroup3.getPaddingTop(), viewGroup3.getPaddingRight(), this.setGuidelinePercent);
                if (z) {
                    View view4 = this.setZ;
                    if (view4 == null) {
                        view4 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                    int i4 = (int) (this.setMinAndMaxProgress + this.setContentScrimResource);
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view4.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = i4;
                    ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = i4;
                    layoutParams3.gravity = 49;
                    view4.setLayoutParams(layoutParams3);
                    TextView textView5 = this.SearchView$SavedState$1;
                    textView5.setScaleX(1.0f);
                    textView5.setScaleY(1.0f);
                    textView5.setVisibility(0);
                    TextView textView6 = this.FragmentStateAdapter$5;
                    float f2 = this.ExtendableSavedState$1;
                    textView6.setScaleX(f2);
                    textView6.setScaleY(f2);
                    textView6.setVisibility(4);
                } else {
                    View view5 = this.setZ;
                    if (view5 == null) {
                        view5 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                    int i5 = this.setMinAndMaxProgress;
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view5.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = i5;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = i5;
                    layoutParams4.gravity = 49;
                    view5.setLayoutParams(layoutParams4);
                    TextView textView7 = this.SearchView$SavedState$1;
                    float f3 = this.setHasDecor;
                    textView7.setScaleX(f3);
                    textView7.setScaleY(f3);
                    textView7.setVisibility(4);
                    TextView textView8 = this.FragmentStateAdapter$5;
                    textView8.setScaleX(1.0f);
                    textView8.setScaleY(1.0f);
                    textView8.setVisibility(0);
                }
            } else if (i == 2) {
                View view6 = this.setZ;
                if (view6 == null) {
                    view6 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                }
                int i6 = this.setMinAndMaxProgress;
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view6.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = i6;
                ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = i6;
                layoutParams5.gravity = 17;
                view6.setLayoutParams(layoutParams5);
                this.SearchView$SavedState$1.setVisibility(8);
                this.FragmentStateAdapter$5.setVisibility(8);
            }
        } else if (this.setAnimationFromJson) {
            if (z) {
                View view7 = this.setZ;
                if (view7 == null) {
                    view7 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                }
                int i7 = this.setMinAndMaxProgress;
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) view7.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = i7;
                ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = i7;
                layoutParams6.gravity = 49;
                view7.setLayoutParams(layoutParams6);
                ViewGroup viewGroup4 = this.setLayoutDirection;
                viewGroup4.setPadding(viewGroup4.getPaddingLeft(), viewGroup4.getPaddingTop(), viewGroup4.getPaddingRight(), this.setGuidelinePercent);
                this.SearchView$SavedState$1.setVisibility(0);
            } else {
                View view8 = this.setZ;
                if (view8 == null) {
                    view8 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                }
                int i8 = this.setMinAndMaxProgress;
                FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) view8.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = i8;
                ((ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin = i8;
                layoutParams7.gravity = 17;
                view8.setLayoutParams(layoutParams7);
                ViewGroup viewGroup5 = this.setLayoutDirection;
                viewGroup5.setPadding(viewGroup5.getPaddingLeft(), viewGroup5.getPaddingTop(), viewGroup5.getPaddingRight(), 0);
                this.SearchView$SavedState$1.setVisibility(4);
            }
            this.FragmentStateAdapter$5.setVisibility(4);
        } else {
            ViewGroup viewGroup6 = this.setLayoutDirection;
            viewGroup6.setPadding(viewGroup6.getPaddingLeft(), viewGroup6.getPaddingTop(), viewGroup6.getPaddingRight(), this.setGuidelinePercent);
            if (z) {
                View view9 = this.setZ;
                if (view9 == null) {
                    view9 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                }
                int i9 = (int) (this.setMinAndMaxProgress + this.setContentScrimResource);
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) view9.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = i9;
                ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = i9;
                layoutParams8.gravity = 49;
                view9.setLayoutParams(layoutParams8);
                TextView textView9 = this.SearchView$SavedState$1;
                textView9.setScaleX(1.0f);
                textView9.setScaleY(1.0f);
                textView9.setVisibility(0);
                TextView textView10 = this.FragmentStateAdapter$5;
                float f4 = this.ExtendableSavedState$1;
                textView10.setScaleX(f4);
                textView10.setScaleY(f4);
                textView10.setVisibility(4);
            } else {
                View view10 = this.setZ;
                if (view10 == null) {
                    view10 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                }
                int i10 = this.setMinAndMaxProgress;
                FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) view10.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin = i10;
                ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin = i10;
                layoutParams9.gravity = 49;
                view10.setLayoutParams(layoutParams9);
                TextView textView11 = this.SearchView$SavedState$1;
                float f5 = this.setHasDecor;
                textView11.setScaleX(f5);
                textView11.setScaleY(f5);
                textView11.setVisibility(4);
                TextView textView12 = this.FragmentStateAdapter$5;
                textView12.setScaleX(1.0f);
                textView12.setScaleY(1.0f);
                textView12.setVisibility(0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        setIconGravity seticongravity = this.setIconTintList;
        if (seticongravity != null && seticongravity.isVisible()) {
            CharSequence title = this.setOnLongClickListener.getTitle();
            if (!TextUtils.isEmpty(this.setOnLongClickListener.getContentDescription())) {
                title = this.setOnLongClickListener.getContentDescription();
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) title);
            sb.append(", ");
            setIconGravity seticongravity2 = this.setIconTintList;
            Object obj = null;
            if (seticongravity2.isVisible()) {
                if (seticongravity2.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize != -1) {
                    if (seticongravity2.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions != 0 && (context = seticongravity2.MenuHostHelper$$ExternalSyntheticLambda1.get()) != null) {
                        if (seticongravity2.setX() <= seticongravity2.MenuHostHelper$$ExternalSyntheticLambda0) {
                            obj = context.getResources().getQuantityString(seticongravity2.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions, seticongravity2.setX(), Integer.valueOf(seticongravity2.setX()));
                        } else {
                            obj = context.getString(seticongravity2.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener, Integer.valueOf(seticongravity2.MenuHostHelper$$ExternalSyntheticLambda0));
                        }
                    }
                } else {
                    obj = seticongravity2.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener;
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        setDecorPadding y = setDecorPadding.setY(accessibilityNodeInfo);
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof setCounterTextColor) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        y.setY(setDecorPadding.setY.MenuHostHelper$$ExternalSyntheticLambda0(0, 1, i, 1, false, isSelected()));
        if (isSelected()) {
            y.setIconTintList(false);
            y.setX(setDecorPadding.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        y.setOnLongClickListener(getResources().getString(R.string.res_0x7f140045));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.FragmentStateAdapter$5.setEnabled(z);
        this.SearchView$SavedState$1.setEnabled(z);
        this.MenuHostHelper$$ExternalSyntheticLambda0.setEnabled(z);
        if (z) {
            setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(this, setVerticalScrollbarThumbDrawable.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), 1002));
        } else {
            setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(this, (setVerticalScrollbarThumbDrawable) null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setOnLongClickListener;
        if (actionMenuPresenter$SavedState$1 != null && actionMenuPresenter$SavedState$1.isCheckable() && this.setOnLongClickListener.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, setUnboundedRipple);
        }
        return onCreateDrawableState;
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.setIconified) {
            return;
        }
        this.setIconified = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable).mutate();
            this.FloatingActionButton$BaseBehavior = drawable;
            ColorStateList colorStateList = this.setTextScaleX;
            if (colorStateList != null) {
                setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, colorStateList);
            }
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.setImageDrawable(drawable);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.setTextScaleX = colorStateList;
        if (this.setOnLongClickListener == null || (drawable = this.FloatingActionButton$BaseBehavior) == null) {
            return;
        }
        setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, colorStateList);
        this.FloatingActionButton$BaseBehavior.invalidateSelf();
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.MenuHostHelper$$ExternalSyntheticLambda0.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).width = i;
        ((ViewGroup.LayoutParams) layoutParams).height = i;
        this.MenuHostHelper$$ExternalSyntheticLambda0.setLayoutParams(layoutParams);
    }

    public void setTextAppearanceInactive(int i) {
        setY(this.FragmentStateAdapter$5, i);
        float textSize = this.FragmentStateAdapter$5.getTextSize();
        float textSize2 = this.SearchView$SavedState$1.getTextSize();
        this.setContentScrimResource = textSize - textSize2;
        this.ExtendableSavedState$1 = textSize2 / textSize;
        this.setHasDecor = textSize / textSize2;
    }

    public void setTextAppearanceActive(int i) {
        setY(this.SearchView$SavedState$1, i);
        float textSize = this.FragmentStateAdapter$5.getTextSize();
        float textSize2 = this.SearchView$SavedState$1.getTextSize();
        this.setContentScrimResource = textSize - textSize2;
        this.ExtendableSavedState$1 = textSize2 / textSize;
        this.setHasDecor = textSize / textSize2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void setY(android.widget.TextView r4, int r5) {
        /*
            o.setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(r4, r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = 0
            goto L58
        Lc:
            int[] r2 = o.setIconTint.setIconTintList.setAdapter
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
            goto La
        L21:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            if (r5 < r3) goto L2c
            int r5 = o.setCradleVerticalOffset.setY(r2)
            goto L30
        L2c:
            int r5 = r2.data
            r5 = r5 & 15
        L30:
            r3 = 2
            if (r5 != r3) goto L4a
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L58
        L4a:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L58:
            if (r5 == 0) goto L5e
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCounterTextColor.setY(android.widget.TextView, int):void");
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.FragmentStateAdapter$5.setTextColor(colorStateList);
            this.SearchView$SavedState$1.setTextColor(colorStateList);
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.setOnNavigationItemSelectedListener = drawable;
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.setTextAppearanceResource = colorStateList;
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        Drawable drawable = this.setOnNavigationItemSelectedListener;
        boolean z = true;
        RippleDrawable rippleDrawable = null;
        if (this.setTextAppearanceResource != null) {
            View view = this.setY;
            Drawable background = view == null ? null : view.getBackground();
            if (this.ViewPager$SavedState$1) {
                View view2 = this.setY;
                if ((view2 == null ? null : view2.getBackground()) != null && this.setZ != null && background != null) {
                    z = false;
                    rippleDrawable = new RippleDrawable(setChipText.setY(this.setTextAppearanceResource), null, background);
                }
            }
            if (drawable == null) {
                drawable = new RippleDrawable(setChipText.setX(this.setTextAppearanceResource), null, null);
            }
        }
        FrameLayout frameLayout = this.setZ;
        if (frameLayout != null) {
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(frameLayout, rippleDrawable);
        }
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.setMinAndMaxProgress != i) {
            this.setMinAndMaxProgress = i;
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setOnLongClickListener;
            if (actionMenuPresenter$SavedState$1 != null) {
                setChecked(actionMenuPresenter$SavedState$1.isChecked());
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.setGuidelinePercent != i) {
            this.setGuidelinePercent = i;
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setOnLongClickListener;
            if (actionMenuPresenter$SavedState$1 != null) {
                setChecked(actionMenuPresenter$SavedState$1.isChecked());
            }
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.ViewPager$SavedState$1 = z;
        MenuHostHelper$$ExternalSyntheticLambda1();
        View view = this.setY;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorWidth(int i) {
        this.setTextAlignment = i;
        MenuHostHelper$$ExternalSyntheticLambda0(getWidth());
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (this.setY == null) {
            return;
        }
        boolean z = true;
        int min = Math.min(this.setTextAlignment, i - (this.setChipCornerRadius << 1));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.setY.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).height = (this.setMaxEms && this.setChipIconTintResource == 2) ? false : false ? min : this.setIconSize;
        ((ViewGroup.LayoutParams) layoutParams).width = min;
        this.setY.setLayoutParams(layoutParams);
    }

    public void setActiveIndicatorHeight(int i) {
        this.setIconSize = i;
        MenuHostHelper$$ExternalSyntheticLambda0(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.setChipCornerRadius = i;
        MenuHostHelper$$ExternalSyntheticLambda0(getWidth());
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.setY;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.setZ;
        if (frameLayout != null && this.ViewPager$SavedState$1) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.setMaxEms = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(setIconGravity seticongravity) {
        setIconGravity seticongravity2 = this.setIconTintList;
        if (seticongravity2 == seticongravity) {
            return;
        }
        if ((seticongravity2 != null) && this.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        this.setIconTintList = seticongravity;
        ImageView imageView = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (imageView != null) {
            if (!(seticongravity != null) || imageView == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            setIconGravity seticongravity3 = this.setIconTintList;
            Rect rect = new Rect();
            imageView.getDrawingRect(rect);
            seticongravity3.setBounds(rect);
            seticongravity3.MenuHostHelper$$ExternalSyntheticLambda1(imageView, null);
            WeakReference<FrameLayout> weakReference = seticongravity3.setY;
            if ((weakReference != null ? weakReference.get() : null) == null) {
                imageView.getOverlay().add(seticongravity3);
                return;
            }
            WeakReference<FrameLayout> weakReference2 = seticongravity3.setY;
            (weakReference2 != null ? weakReference2.get() : null).setForeground(seticongravity3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        protected float setY(float f) {
            return 1.0f;
        }

        private setIconTintList() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda0(float f, float f2, View view) {
            view.setScaleX((0.6f * f) + 0.4f);
            view.setScaleY(setY(f));
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            view.setAlpha(setCardElevation.setX(0.0f, 1.0f, i == 0 ? 0.8f : 0.0f, i == 0 ? 1.0f : 0.2f, f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(View view) {
        if (this.setIconTintList != null) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                setIconGravity seticongravity = this.setIconTintList;
                if (seticongravity != null) {
                    WeakReference<FrameLayout> weakReference = seticongravity.setY;
                    if ((weakReference != null ? weakReference.get() : null) == null) {
                        view.getOverlay().remove(seticongravity);
                    } else {
                        WeakReference<FrameLayout> weakReference2 = seticongravity.setY;
                        (weakReference2 != null ? weakReference2.get() : null).setForeground(null);
                    }
                }
            }
            this.setIconTintList = null;
        }
    }
}