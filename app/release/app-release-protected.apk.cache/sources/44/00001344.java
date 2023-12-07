package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Arrays;
import o.C0530v;
import o.setDecorPadding;
import o.setIconTint;

/* renamed from: o.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0616y extends C implements C0530v.setX {
    final C0530v MenuHostHelper$$ExternalSyntheticLambda0;
    final int MenuHostHelper$$ExternalSyntheticLambda1;
    private String[] ViewPager$SavedState$1;
    private final Rect setCenterIfNoTextEnabled;
    private final setCounterOverflowTextColor setChipCornerRadius;
    private float setIconTintList;
    private final float[] setLayoutAnimation;
    private final RectF setNavigationOnClickListener;
    private final int setOnLongClickListener;
    private final ColorStateList setTextAlignment;
    private final int[] setUiOptions;
    private final int setUnboundedRipple;
    private final int setX;
    final SparseArray<TextView> setY;

    public C0616y(Context context) {
        this(context, null);
    }

    public C0616y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0402c6);
    }

    public C0616y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList iconTintList;
        this.setCenterIfNoTextEnabled = new Rect();
        this.setNavigationOnClickListener = new RectF();
        this.setY = new SparseArray<>();
        this.setLayoutAnimation = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.setLayoutAnimation, i, R.style._res_0x7f150411);
        Resources resources = getResources();
        ColorStateList x = setFastScrollEnabled.setX(context, obtainStyledAttributes, 1);
        this.setTextAlignment = x;
        LayoutInflater.from(context).inflate(R.layout.res_0x7f0d004a, (ViewGroup) this, true);
        C0530v c0530v = (C0530v) findViewById(R.id.res_0x7f0a0116);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0530v;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = resources.getDimensionPixelSize(R.dimen.res_0x7f070170);
        int colorForState = x.getColorForState(new int[]{16842913}, x.getDefaultColor());
        this.setUiOptions = new int[]{colorForState, colorForState, x.getDefaultColor()};
        c0530v.setX.add(this);
        iconTintList = setLineHeight.setIconTintList(context, R.color.res_0x7f060215);
        int defaultColor = iconTintList.getDefaultColor();
        ColorStateList x2 = setFastScrollEnabled.setX(context, obtainStyledAttributes, 0);
        setBackgroundColor(x2 != null ? x2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: o.y.3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (C0616y.this.isShown()) {
                    C0616y.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    int i2 = C0616y.this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList;
                    C0616y.this.setRadius(((C0616y.this.getHeight() / 2) - i2) - C0616y.this.MenuHostHelper$$ExternalSyntheticLambda1);
                    return true;
                }
                return true;
            }
        });
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.setChipCornerRadius = new setCounterOverflowTextColor() { // from class: o.y.5
            @Override // o.setCounterOverflowTextColor
            public final void setY(View view, setDecorPadding setdecorpadding) {
                super.setY(view, setdecorpadding);
                int intValue = ((Integer) view.getTag(R.id.res_0x7f0a0125)).intValue();
                if (intValue > 0) {
                    setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(C0616y.this.setY.get(intValue - 1));
                }
                setdecorpadding.setY(setDecorPadding.setY.MenuHostHelper$$ExternalSyntheticLambda0(0, 1, intValue, 1, false, view.isSelected()));
                setdecorpadding.setIconTintList(true);
                setdecorpadding.setIconTintList(setDecorPadding.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
            }

            @Override // o.setCounterOverflowTextColor
            public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, int i2, Bundle bundle) {
                if (i2 == 16) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    float x3 = view.getX() + (view.getWidth() / 2.0f);
                    float height = (view.getHeight() / 2.0f) + view.getY();
                    C0616y.this.MenuHostHelper$$ExternalSyntheticLambda0.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x3, height, 0));
                    C0616y.this.MenuHostHelper$$ExternalSyntheticLambda0.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x3, height, 0));
                    return true;
                }
                return super.MenuHostHelper$$ExternalSyntheticLambda1(view, i2, bundle);
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.setOnLongClickListener = resources.getDimensionPixelSize(R.dimen.res_0x7f07018e);
        this.setUnboundedRipple = resources.getDimensionPixelSize(R.dimen.res_0x7f07018f);
        this.setX = resources.getDimensionPixelSize(R.dimen.res_0x7f070177);
    }

    public void setValues(String[] strArr, int i) {
        this.ViewPager$SavedState$1 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.setY.size();
        for (int i2 = 0; i2 < Math.max(this.ViewPager$SavedState$1.length, size); i2++) {
            TextView textView = this.setY.get(i2);
            if (i2 >= this.ViewPager$SavedState$1.length) {
                removeView(textView);
                this.setY.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.res_0x7f0d0049, (ViewGroup) this, false);
                    this.setY.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.ViewPager$SavedState$1[i2]);
                textView.setTag(R.id.res_0x7f0a0125, Integer.valueOf(i2));
                setBaselineAlignBottom.setX(textView, this.setChipCornerRadius);
                textView.setTextColor(this.setTextAlignment);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.ViewPager$SavedState$1[i2]));
                }
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        setDecorPadding.setY(accessibilityNodeInfo).setX(setDecorPadding.setX.setIconTintList(1, this.ViewPager$SavedState$1.length, false, 1));
    }

    @Override // o.C
    public void setRadius(int i) {
        if (i != MenuHostHelper$$ExternalSyntheticLambda1()) {
            super.setRadius(i);
            this.MenuHostHelper$$ExternalSyntheticLambda0.setCircleRadius(MenuHostHelper$$ExternalSyntheticLambda1());
        }
    }

    @Override // o.setMIndicatorOptions, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setNavigationOnClickListener();
    }

    public void setHandRotation(float f) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setHandRotation(f);
        setNavigationOnClickListener();
    }

    private void setNavigationOnClickListener() {
        RectF rectF = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
        for (int i = 0; i < this.setY.size(); i++) {
            TextView textView = this.setY.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.setCenterIfNoTextEnabled);
                offsetDescendantRectToMyCoords(textView, this.setCenterIfNoTextEnabled);
                textView.setSelected(rectF.contains(this.setCenterIfNoTextEnabled.centerX(), this.setCenterIfNoTextEnabled.centerY()));
                this.setNavigationOnClickListener.set(this.setCenterIfNoTextEnabled);
                this.setNavigationOnClickListener.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                textView.getPaint().setShader(RectF.intersects(rectF, this.setNavigationOnClickListener) ? new RadialGradient(rectF.centerX() - this.setNavigationOnClickListener.left, rectF.centerY() - this.setNavigationOnClickListener.top, rectF.width() * 0.5f, this.setUiOptions, this.setLayoutAnimation, Shader.TileMode.CLAMP) : null);
                textView.invalidate();
            }
        }
    }

    @Override // o.C0530v.setX
    public final void MenuHostHelper$$ExternalSyntheticLambda0(float f, boolean z) {
        if (Math.abs(this.setIconTintList - f) > 0.001f) {
            this.setIconTintList = f;
            setNavigationOnClickListener();
        }
    }

    @Override // o.setMIndicatorOptions, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.setX / Math.max(Math.max(this.setOnLongClickListener / displayMetrics.heightPixels, this.setUnboundedRipple / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}