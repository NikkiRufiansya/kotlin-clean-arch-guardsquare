package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import o.setBackgroundTintMode;
import o.setExpandedTitleTextColor;
import o.setNavigationIconTint;
import o.setTabRippleColor;

/* loaded from: classes.dex */
public class setOnSeekBarChangeListener extends setTabRippleColor implements setNavigationIconTint.setIconTintList, TextInputLayout$SavedState$1 {
    setExpandedTitleTextColor MenuHostHelper$$ExternalSyntheticLambda0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private Context setIconSize;
    setY setIconTintList;
    private int setLayoutAnimation;
    private setNavigationIconTint setNavigationOnClickListener;
    private int setOnLongClickListener;
    private int setTextAlignment;
    private int setUiOptions;
    private boolean setUnboundedRipple;
    setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0 setX;
    private setBackgroundTintMode.setY setY;

    /* loaded from: classes.dex */
    public interface setX {
        boolean MenuHostHelper$$ExternalSyntheticLambda0();

        boolean setX();
    }

    /* loaded from: classes.dex */
    public interface setY {
        boolean MenuHostHelper$$ExternalSyntheticLambda0(MenuItem menuItem);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // o.setTabRippleColor, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return setIconTintList(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setTabRippleColor
    public /* synthetic */ setTabRippleColor.setY setY(ViewGroup.LayoutParams layoutParams) {
        return setIconTintList(layoutParams);
    }

    public setOnSeekBarChangeListener(Context context) {
        this(context, null);
    }

    public setOnSeekBarChangeListener(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.setLayoutAnimation = (int) (56.0f * f);
        this.setUiOptions = (int) (f * 4.0f);
        this.setIconSize = context;
        this.setTextAlignment = 0;
    }

    public void setPopupTheme(int i) {
        if (this.setTextAlignment != i) {
            this.setTextAlignment = i;
            if (i == 0) {
                this.setIconSize = getContext();
            } else {
                this.setIconSize = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(setExpandedTitleTextColor setexpandedtitletextcolor) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setexpandedtitletextcolor;
        setexpandedtitletextcolor.setY(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setExpandedTitleTextColor setexpandedtitletextcolor = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setexpandedtitletextcolor != null) {
            setexpandedtitletextcolor.MenuHostHelper$$ExternalSyntheticLambda0(false);
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
                this.MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener();
            }
        }
    }

    public void setOnMenuItemClickListener(setY sety) {
        this.setIconTintList = sety;
    }

    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v39 */
    @Override // o.setTabRippleColor, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        ?? r6;
        int i7;
        int i8;
        int i9;
        setNavigationIconTint setnavigationicontint;
        boolean z2 = this.setUnboundedRipple;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.setUnboundedRipple = z3;
        if (z2 != z3) {
            this.setOnLongClickListener = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.setUnboundedRipple && (setnavigationicontint = this.setNavigationOnClickListener) != null && size != this.setOnLongClickListener) {
            this.setOnLongClickListener = size;
            setnavigationicontint.setIconTintList(true);
        }
        int childCount = getChildCount();
        if (!this.setUnboundedRipple || childCount <= 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1 = (setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) getChildAt(i10).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i11 = size2 - (paddingLeft + paddingRight);
        int i12 = this.setLayoutAnimation;
        int i13 = i11 / i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i14 = i12 + ((i11 % i12) / i13);
        int childCount2 = getChildCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z4 = false;
        long j = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < childCount2) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                i8 = mode;
                i7 = i11;
                i6 = size3;
            } else {
                boolean z5 = childAt instanceof setTooltipText;
                int i20 = i15 + 1;
                if (z5) {
                    int i21 = this.setUiOptions;
                    i6 = size3;
                    r6 = 0;
                    childAt.setPadding(i21, 0, i21, 0);
                } else {
                    i6 = size3;
                    r6 = 0;
                }
                setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12 = (setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) childAt.getLayoutParams();
                setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12.setY = r6;
                setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1 = r6;
                setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda0 = r6;
                setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12.setIconTintList = r6;
                ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12).leftMargin = r6;
                ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12).rightMargin = r6;
                setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12.setNavigationOnClickListener = z5 && (TextUtils.isEmpty(((setTooltipText) childAt).getText()) ^ true);
                int i22 = setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12.setX ? 1 : i13;
                setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda13 = (setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) childAt.getLayoutParams();
                i7 = i11;
                i8 = mode;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                setTooltipText settooltiptext = z5 ? (setTooltipText) childAt : null;
                boolean z6 = settooltiptext != null && (TextUtils.isEmpty(settooltiptext.getText()) ^ true);
                if (i22 <= 0 || (z6 && i22 < 2)) {
                    i9 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i22 * i14, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i9 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i9++;
                    }
                    if (z6 && i9 < 2) {
                        i9 = 2;
                    }
                }
                setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda13.setIconTintList = !setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda13.setX && z6;
                setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda13.MenuHostHelper$$ExternalSyntheticLambda0 = i9;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i9, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i9);
                if (setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12.setIconTintList) {
                    i16++;
                }
                if (setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12.setX) {
                    z4 = true;
                }
                i13 -= i9;
                i18 = Math.max(i18, childAt.getMeasuredHeight());
                if (i9 == 1) {
                    j |= 1 << i17;
                }
                i15 = i20;
            }
            i17++;
            size3 = i6;
            i11 = i7;
            mode = i8;
        }
        int i23 = mode;
        int i24 = i11;
        int i25 = size3;
        int i26 = i18;
        int i27 = i19;
        boolean z7 = z4 && i15 == 2;
        boolean z8 = false;
        while (i16 > 0 && i13 > 0) {
            int i28 = Integer.MAX_VALUE;
            int i29 = 0;
            int i30 = 0;
            long j2 = 0;
            while (i29 < childCount2) {
                setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda14 = (setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) getChildAt(i29).getLayoutParams();
                int i31 = i26;
                if (setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda14.setIconTintList) {
                    if (setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda14.MenuHostHelper$$ExternalSyntheticLambda0 < i28) {
                        j2 = 1 << i29;
                        i28 = setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda14.MenuHostHelper$$ExternalSyntheticLambda0;
                        i30 = 1;
                    } else if (setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda14.MenuHostHelper$$ExternalSyntheticLambda0 == i28) {
                        j2 |= 1 << i29;
                        i30++;
                    }
                }
                i29++;
                i26 = i31;
            }
            i3 = i26;
            j |= j2;
            if (i30 > i13) {
                break;
            }
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda15 = (setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) childAt2.getLayoutParams();
                int i33 = i16;
                long j3 = 1 << i32;
                if ((j2 & j3) == 0) {
                    if (setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda15.MenuHostHelper$$ExternalSyntheticLambda0 == i28 + 1) {
                        j |= j3;
                    }
                    z = z7;
                } else {
                    if (z7 && setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda15.setNavigationOnClickListener && i13 == 1) {
                        int i34 = this.setUiOptions;
                        z = z7;
                        childAt2.setPadding(i34 + i14, 0, i34, 0);
                    } else {
                        z = z7;
                    }
                    setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda15.MenuHostHelper$$ExternalSyntheticLambda0++;
                    setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda15.setY = true;
                    i13--;
                }
                i32++;
                i16 = i33;
                z7 = z;
            }
            i26 = i3;
            z8 = true;
        }
        i3 = i26;
        boolean z9 = !z4 && i15 == 1;
        if (i13 > 0 && j != 0 && (i13 < i15 - 1 || z9 || i27 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z9) {
                if ((j & 1) != 0 && !((setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) getChildAt(0).getLayoutParams()).setNavigationOnClickListener) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount2 - 1;
                if ((j & (1 << i35)) != 0 && !((setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) getChildAt(i35).getLayoutParams()).setNavigationOnClickListener) {
                    bitCount -= 0.5f;
                }
            }
            int i36 = bitCount > 0.0f ? (int) ((i13 * i14) / bitCount) : 0;
            for (int i37 = 0; i37 < childCount2; i37++) {
                if ((j & (1 << i37)) != 0) {
                    View childAt3 = getChildAt(i37);
                    setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda16 = (setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) childAt3.getLayoutParams();
                    if (childAt3 instanceof setTooltipText) {
                        setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda16.MenuHostHelper$$ExternalSyntheticLambda1 = i36;
                        setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda16.setY = true;
                        if (i37 == 0 && !setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda16.setNavigationOnClickListener) {
                            ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda16).leftMargin = (-i36) / 2;
                        }
                    } else if (setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda16.setX) {
                        setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda16.MenuHostHelper$$ExternalSyntheticLambda1 = i36;
                        setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda16.setY = true;
                        ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda16).rightMargin = (-i36) / 2;
                    } else {
                        if (i37 != 0) {
                            ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda16).leftMargin = i36 / 2;
                        }
                        if (i37 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda16).rightMargin = i36 / 2;
                        }
                    }
                    z8 = true;
                }
            }
        }
        if (z8) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                View childAt4 = getChildAt(i38);
                setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda17 = (setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) childAt4.getLayoutParams();
                if (setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda17.setY) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda17.MenuHostHelper$$ExternalSyntheticLambda0 * i14) + setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda17.MenuHostHelper$$ExternalSyntheticLambda1, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i23 == 1073741824) {
            i5 = i25;
            i4 = i24;
        } else {
            i4 = i24;
            i5 = i3;
        }
        setMeasuredDimension(i4, i5);
    }

    @Override // o.setTabRippleColor, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.setUnboundedRipple) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int layoutAnimation = setLayoutAnimation();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean MenuHostHelper$$ExternalSyntheticLambda0 = setTabMode.MenuHostHelper$$ExternalSyntheticLambda0(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1 = (setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) childAt.getLayoutParams();
                if (setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1.setX) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (setX(i10)) {
                        measuredWidth += layoutAnimation;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (MenuHostHelper$$ExternalSyntheticLambda0) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1).leftMargin) + ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1).rightMargin;
                    setX(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (MenuHostHelper$$ExternalSyntheticLambda0) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12 = (setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12.setX) {
                    int i16 = width2 - ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda13 = (setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda13.setX) {
                int i19 = paddingLeft + ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda13).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda13).rightMargin + max;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setX();
    }

    public void setOverflowIcon(Drawable drawable) {
        MenuHostHelper$$ExternalSyntheticLambda1();
        setExpandedTitleTextColor setexpandedtitletextcolor = this.MenuHostHelper$$ExternalSyntheticLambda0;
        setExpandedTitleTextColor.setY sety = setexpandedtitletextcolor.setUiOptions;
        if (sety != null) {
            sety.setImageDrawable(drawable);
            return;
        }
        setexpandedtitletextcolor.setChipCornerRadius = true;
        setexpandedtitletextcolor.setNavigationOnClickListener = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
    }

    public static setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList(ViewGroup.LayoutParams layoutParams) {
        setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1;
        if (layoutParams != null) {
            if (layoutParams instanceof setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) {
                setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1 = new setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1((setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1) layoutParams);
            } else {
                setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1 = new setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1(layoutParams);
            }
            if (((LinearLayout.LayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1).gravity <= 0) {
                ((LinearLayout.LayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1).gravity = 16;
            }
            return setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1;
        }
        setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12 = new setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1();
        ((LinearLayout.LayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12).gravity = 16;
        return setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda12;
    }

    @Override // o.setTabRippleColor, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.setNavigationIconTint.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        return this.setNavigationOnClickListener.setX(actionMenuPresenter$SavedState$1, null, 0);
    }

    @Override // o.TextInputLayout$SavedState$1
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint) {
        this.setNavigationOnClickListener = setnavigationicontint;
    }

    public final Menu MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setNavigationOnClickListener == null) {
            Context context = getContext();
            setNavigationIconTint setnavigationicontint = new setNavigationIconTint(context);
            this.setNavigationOnClickListener = setnavigationicontint;
            setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda1(new setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: o.setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda0
                @Override // o.setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0
                public final boolean setY(setNavigationIconTint setnavigationicontint2, MenuItem menuItem) {
                    return setOnSeekBarChangeListener.this.setIconTintList != null && setOnSeekBarChangeListener.this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(menuItem);
                }

                @Override // o.setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0
                public final void setY(setNavigationIconTint setnavigationicontint2) {
                    if (setOnSeekBarChangeListener.this.setX != null) {
                        setOnSeekBarChangeListener.this.setX.setY(setnavigationicontint2);
                    }
                }
            });
            setExpandedTitleTextColor setexpandedtitletextcolor = new setExpandedTitleTextColor(context);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setexpandedtitletextcolor;
            setexpandedtitletextcolor.setCenterIfNoTextEnabled = true;
            setexpandedtitletextcolor.setIconSize = true;
            setExpandedTitleTextColor setexpandedtitletextcolor2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            setBackgroundTintMode.setY sety = this.setY;
            if (sety == null) {
                sety = new setIconTintList();
            }
            setexpandedtitletextcolor2.MenuHostHelper$$ExternalSyntheticLambda1(sety);
            this.setNavigationOnClickListener.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconSize);
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(this);
        }
        return this.setNavigationOnClickListener;
    }

    public void setMenuCallbacks(setBackgroundTintMode.setY sety, setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0 setnavigationicontint_menuhosthelper__externalsyntheticlambda0) {
        this.setY = sety;
        this.setX = setnavigationicontint_menuhosthelper__externalsyntheticlambda0;
    }

    public final setNavigationIconTint setIconTintList() {
        return this.setNavigationOnClickListener;
    }

    public final void setX() {
        setExpandedTitleTextColor setexpandedtitletextcolor = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setexpandedtitletextcolor != null) {
            setexpandedtitletextcolor.setIconTintList();
        }
    }

    private boolean setX(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof setX)) {
            z = false | ((setX) childAt).MenuHostHelper$$ExternalSyntheticLambda0();
        }
        return (i <= 0 || !(childAt2 instanceof setX)) ? z : z | ((setX) childAt2).setX();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(z);
    }

    /* loaded from: classes.dex */
    public static class setIconTintList implements setBackgroundTintMode.setY {
        @Override // o.setBackgroundTintMode.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint, boolean z) {
        }

        @Override // o.setBackgroundTintMode.setY
        public final boolean setY(setNavigationIconTint setnavigationicontint) {
            return false;
        }

        setIconTintList() {
        }
    }

    @Override // o.setTabRippleColor, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1 = new setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1();
        ((LinearLayout.LayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1).gravity = 16;
        return setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setTabRippleColor
    public /* synthetic */ setTabRippleColor.setY setY() {
        setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1 = new setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1();
        ((LinearLayout.LayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1).gravity = 16;
        return setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1;
    }

    @Override // o.setTabRippleColor, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1(getContext(), attributeSet);
    }

    @Override // o.setTabRippleColor
    public /* synthetic */ setTabRippleColor.setY setY(AttributeSet attributeSet) {
        return new setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1(getContext(), attributeSet);
    }

    public static setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0() {
        setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1 setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1 = new setOnSeekBarChangeListener$MenuHostHelper$$ExternalSyntheticLambda1();
        ((LinearLayout.LayoutParams) setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1).gravity = 16;
        setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1.setX = true;
        return setonseekbarchangelistener_menuhosthelper__externalsyntheticlambda1;
    }
}