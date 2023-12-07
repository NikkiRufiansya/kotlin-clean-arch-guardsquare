package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public class setRowOrderPreserved extends setCallingWorkSourceUid {
    private View ViewPager$SavedState$1;
    private LinearLayout setAnimationFromJson;
    private View setCenterIfNoTextEnabled;
    private int setChipCornerRadius;
    private int setIconSize;
    public CharSequence setLayoutAnimation;
    public CharSequence setNavigationOnClickListener;
    public boolean setOnLongClickListener;
    private int setOnNavigationItemSelectedListener;
    private TextView setTextAlignment;
    private TextView setTextScaleX;
    public View setUiOptions;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // o.setCallingWorkSourceUid, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // o.setCallingWorkSourceUid, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // o.setCallingWorkSourceUid, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // o.setCallingWorkSourceUid
    public final /* bridge */ /* synthetic */ setHeaderDividersEnabled setX(int i, long j) {
        return super.setX(i, j);
    }

    public setRowOrderPreserved(Context context) {
        this(context, null);
    }

    public setRowOrderPreserved(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f04001e);
    }

    public setRowOrderPreserved(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(context, attributeSet, setAnimationFromJson.setY.setMinAndMaxProgress, i, 0);
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(this, MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setLayoutDirection));
        this.setOnNavigationItemSelectedListener = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.ExtendableSavedState$1, 0);
        this.setIconSize = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.setChipIconTintResource, 0);
        this.setX = MenuHostHelper$$ExternalSyntheticLambda0.setX(setAnimationFromJson.setY.SearchView$SavedState$1, 0);
        this.setChipCornerRadius = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.setHasDecor, R.layout.res_0x7f0d0005);
        MenuHostHelper$$ExternalSyntheticLambda0.setX();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY();
        }
    }

    @Override // o.setCallingWorkSourceUid
    public void setContentHeight(int i) {
        this.setX = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.ViewPager$SavedState$1;
        if (view2 != null) {
            removeView(view2);
        }
        this.ViewPager$SavedState$1 = view;
        if (view != null && (linearLayout = this.setAnimationFromJson) != null) {
            removeView(linearLayout);
            this.setAnimationFromJson = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.setLayoutAnimation = charSequence;
        MenuHostHelper$$ExternalSyntheticLambda0();
        setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda0(this, charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.setNavigationOnClickListener = charSequence;
        MenuHostHelper$$ExternalSyntheticLambda0();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setAnimationFromJson == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d0000, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.setAnimationFromJson = linearLayout;
            this.setTextScaleX = (TextView) linearLayout.findViewById(R.id.res_0x7f0a0039);
            this.setTextAlignment = (TextView) this.setAnimationFromJson.findViewById(R.id.res_0x7f0a0038);
            if (this.setOnNavigationItemSelectedListener != 0) {
                this.setTextScaleX.setTextAppearance(getContext(), this.setOnNavigationItemSelectedListener);
            }
            if (this.setIconSize != 0) {
                this.setTextAlignment.setTextAppearance(getContext(), this.setIconSize);
            }
        }
        this.setTextScaleX.setText(this.setLayoutAnimation);
        this.setTextAlignment.setText(this.setNavigationOnClickListener);
        boolean isEmpty = TextUtils.isEmpty(this.setLayoutAnimation);
        boolean z = !TextUtils.isEmpty(this.setNavigationOnClickListener);
        int i = 8;
        this.setTextAlignment.setVisibility(z ? 0 : 8);
        this.setAnimationFromJson.setVisibility(((isEmpty ^ true) || z) ? 0 : 0);
        if (this.setAnimationFromJson.getParent() == null) {
            addView(this.setAnimationFromJson);
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(final setChipIconEnabled setchipiconenabled) {
        View view = this.setUiOptions;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.setChipCornerRadius, (ViewGroup) this, false);
            this.setUiOptions = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.setUiOptions);
        }
        View findViewById = this.setUiOptions.findViewById(R.id.res_0x7f0a0042);
        this.setCenterIfNoTextEnabled = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: o.setRowOrderPreserved.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                setchipiconenabled.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        });
        setNavigationIconTint setnavigationicontint = (setNavigationIconTint) setchipiconenabled.setY();
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new setExpandedTitleTextColor(getContext());
        setExpandedTitleTextColor setexpandedtitletextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1;
        setexpandedtitletextcolor.setCenterIfNoTextEnabled = true;
        setexpandedtitletextcolor.setIconSize = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        setnavigationicontint.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY);
        this.setIconTintList = (setOnSeekBarChangeListener) this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this);
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(this.setIconTintList, (Drawable) null);
        addView(this.setIconTintList, layoutParams);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        removeAllViews();
        this.ViewPager$SavedState$1 = null;
        this.setIconTintList = null;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        View view = this.setCenterIfNoTextEnabled;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // o.setCallingWorkSourceUid
    public final boolean setY() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = this.setX > 0 ? this.setX : View.MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i3 = size2 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            View view = this.setUiOptions;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                int max = Math.max(0, paddingLeft - view.getMeasuredWidth());
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.setUiOptions.getLayoutParams();
                paddingLeft = max - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.setIconTintList != null && this.setIconTintList.getParent() == this) {
                setOnSeekBarChangeListener setonseekbarchangelistener = this.setIconTintList;
                setonseekbarchangelistener.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - setonseekbarchangelistener.getMeasuredWidth());
            }
            LinearLayout linearLayout = this.setAnimationFromJson;
            if (linearLayout != null && this.ViewPager$SavedState$1 == null) {
                if (this.setOnLongClickListener) {
                    this.setAnimationFromJson.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.setAnimationFromJson.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.setAnimationFromJson.setVisibility(z ? 0 : 8);
                } else {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                    paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
                }
            }
            View view2 = this.ViewPager$SavedState$1;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i4 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                int i5 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
                if (layoutParams.height >= 0) {
                    i3 = Math.min(layoutParams.height, i3);
                }
                this.ViewPager$SavedState$1.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(i3, i5));
            }
            if (this.setX <= 0) {
                int childCount = getChildCount();
                int i6 = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i6) {
                        i6 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i6);
                return;
            }
            setMeasuredDimension(size, size2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean MenuHostHelper$$ExternalSyntheticLambda0 = setTabMode.MenuHostHelper$$ExternalSyntheticLambda0(this);
        int paddingRight = MenuHostHelper$$ExternalSyntheticLambda0 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.setUiOptions;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.setUiOptions.getLayoutParams();
            int i5 = MenuHostHelper$$ExternalSyntheticLambda0 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = MenuHostHelper$$ExternalSyntheticLambda0 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = MenuHostHelper$$ExternalSyntheticLambda0 ? paddingRight - i5 : paddingRight + i5;
            int x = i7 + setX(this.setUiOptions, i7, paddingTop, paddingTop2, MenuHostHelper$$ExternalSyntheticLambda0);
            paddingRight = MenuHostHelper$$ExternalSyntheticLambda0 ? x - i6 : x + i6;
        }
        LinearLayout linearLayout = this.setAnimationFromJson;
        if (linearLayout != null && this.ViewPager$SavedState$1 == null && linearLayout.getVisibility() != 8) {
            paddingRight += setX(this.setAnimationFromJson, paddingRight, paddingTop, paddingTop2, MenuHostHelper$$ExternalSyntheticLambda0);
        }
        View view2 = this.ViewPager$SavedState$1;
        if (view2 != null) {
            setX(view2, paddingRight, paddingTop, paddingTop2, MenuHostHelper$$ExternalSyntheticLambda0);
        }
        int paddingLeft = MenuHostHelper$$ExternalSyntheticLambda0 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.setIconTintList != null) {
            setX(this.setIconTintList, paddingLeft, paddingTop, paddingTop2, !MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    public void setTitleOptional(boolean z) {
        if (z != this.setOnLongClickListener) {
            requestLayout();
        }
        this.setOnLongClickListener = z;
    }
}