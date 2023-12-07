package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.Locale;
import o.setEnsureMinTouchTargetSize;
import o.setIconTint;

/* renamed from: o.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259k extends GridLayoutManager {
    int MenuHostHelper$$ExternalSyntheticLambda0;
    ColorStateList MenuHostHelper$$ExternalSyntheticLambda1;
    final float setIconTintList;
    private final int setNavigationOnClickListener;
    private final Rect setUiOptions;
    final setAccessibilityTraversalBefore setX;
    private final AccessibilityManager setY;

    public C0259k(Context context) {
        this(context, null);
    }

    public C0259k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f040039);
    }

    public C0259k(Context context, AttributeSet attributeSet, int i) {
        super(C0501u.MenuHostHelper$$ExternalSyntheticLambda0(context, attributeSet, i, 0), attributeSet, i);
        this.setUiOptions = new Rect();
        Context context2 = getContext();
        int[] iArr = setIconTint.setIconTintList.setMaxEms;
        ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(context2, attributeSet, i, R.style._res_0x7f1502c2);
        ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(context2, attributeSet, iArr, i, R.style._res_0x7f1502c2, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style._res_0x7f1502c2);
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.setNavigationOnClickListener = obtainStyledAttributes.getResourceId(2, R.layout.res_0x7f0d0058);
        this.setIconTintList = obtainStyledAttributes.getDimensionPixelOffset(1, R.dimen.res_0x7f0701ee);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getColor(3, 0);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setFastScrollEnabled.setX(context2, obtainStyledAttributes, 4);
        this.setY = (AccessibilityManager) context2.getSystemService("accessibility");
        setAccessibilityTraversalBefore setaccessibilitytraversalbefore = new setAccessibilityTraversalBefore(context2);
        this.setX = setaccessibilitytraversalbefore;
        setaccessibilitytraversalbefore.setIconTintList(true);
        setaccessibilitytraversalbefore.setY(this);
        setaccessibilitytraversalbefore.setNavigationOnClickListener(2);
        setaccessibilitytraversalbefore.setIconTintList(getAdapter());
        setaccessibilitytraversalbefore.MenuHostHelper$$ExternalSyntheticLambda1(new AdapterView.OnItemClickListener() { // from class: o.k.5
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                C0259k c0259k = C0259k.this;
                C0259k.setX(C0259k.this, i2 < 0 ? c0259k.setX.setCenterIfNoTextEnabled() : c0259k.getAdapter().getItem(i2));
                AdapterView.OnItemClickListener onItemClickListener = C0259k.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        view = C0259k.this.setX.setTextAlignment();
                        i2 = C0259k.this.setX.setIconSize();
                        j = C0259k.this.setX.setChipCornerRadius();
                    }
                    onItemClickListener.onItemClick(C0259k.this.setX.setY(), view, i2, j);
                }
                C0259k.this.setX.setIconTintList();
            }
        });
        if (obtainStyledAttributes.hasValue(5)) {
            setSimpleItems(obtainStyledAttributes.getResourceId(5, 0));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.setY;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.setX.setLayoutAnimation();
        } else {
            super.showDropDown();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.setX.setIconTintList(getAdapter());
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        C0447s MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.setX.setX(getOnItemSelectedListener());
    }

    public final void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public final void setSimpleItems(String[] strArr) {
        setAdapter(new setY(getContext(), this.setNavigationOnClickListener, strArr));
    }

    public final void setSimpleItemSelectedColor(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        if (getAdapter() instanceof setY) {
            setY sety = (setY) getAdapter();
            sety.setIconTintList = sety.MenuHostHelper$$ExternalSyntheticLambda1();
            sety.setX = sety.setX();
        }
    }

    public final void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = colorStateList;
        if (getAdapter() instanceof setY) {
            setY sety = (setY) getAdapter();
            sety.setIconTintList = sety.MenuHostHelper$$ExternalSyntheticLambda1();
            sety.setX = sety.setX();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0447s MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null && MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        C0447s MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null || !MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1) {
            return super.getHint();
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0.setIconSize) {
            return MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            C0447s MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
            int i3 = 0;
            if (adapter != null && MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                int min = Math.min(adapter.getCount(), Math.max(0, this.setX.setIconSize()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, MenuHostHelper$$ExternalSyntheticLambda0);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i3 = Math.max(i3, view.getMeasuredWidth());
                }
                Drawable MenuHostHelper$$ExternalSyntheticLambda1 = this.setX.MenuHostHelper$$ExternalSyntheticLambda1();
                if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                    MenuHostHelper$$ExternalSyntheticLambda1.getPadding(this.setUiOptions);
                    i3 += this.setUiOptions.left + this.setUiOptions.right;
                }
                i3 += MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener.setOnLongClickListener.getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    private C0447s MenuHostHelper$$ExternalSyntheticLambda0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof C0447s) {
                return (C0447s) parent;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.k$setY */
    /* loaded from: classes.dex */
    public class setY<T> extends ArrayAdapter<String> {
        ColorStateList setIconTintList;
        ColorStateList setX;

        setY(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            this.setIconTintList = MenuHostHelper$$ExternalSyntheticLambda1();
            this.setX = setX();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                RippleDrawable rippleDrawable = null;
                if (C0259k.this.getText().toString().contentEquals(textView.getText())) {
                    if (C0259k.this.MenuHostHelper$$ExternalSyntheticLambda0 != 0) {
                        ColorDrawable colorDrawable = new ColorDrawable(C0259k.this.MenuHostHelper$$ExternalSyntheticLambda0);
                        if (this.setIconTintList != null) {
                            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(colorDrawable, this.setX);
                            rippleDrawable = new RippleDrawable(this.setIconTintList, colorDrawable, null);
                        } else {
                            rippleDrawable = colorDrawable;
                        }
                    }
                }
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(textView, rippleDrawable);
            }
            return view2;
        }

        final ColorStateList setX() {
            if (C0259k.this.MenuHostHelper$$ExternalSyntheticLambda0 != 0) {
                if (C0259k.this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                    int[] iArr = {16843623, -16842919};
                    int[] iArr2 = {16842913, -16842919};
                    return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{setExtended.setY(C0259k.this.MenuHostHelper$$ExternalSyntheticLambda1.getColorForState(iArr2, 0), C0259k.this.MenuHostHelper$$ExternalSyntheticLambda0), setExtended.setY(C0259k.this.MenuHostHelper$$ExternalSyntheticLambda1.getColorForState(iArr, 0), C0259k.this.MenuHostHelper$$ExternalSyntheticLambda0), C0259k.this.MenuHostHelper$$ExternalSyntheticLambda0});
                }
                return null;
            }
            return null;
        }

        final ColorStateList MenuHostHelper$$ExternalSyntheticLambda1() {
            if (C0259k.this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                int[] iArr = {16842919};
                return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{C0259k.this.MenuHostHelper$$ExternalSyntheticLambda1.getColorForState(iArr, 0), 0});
            }
            return null;
        }
    }

    static /* synthetic */ void setX(C0259k c0259k, Object obj) {
        c0259k.setText(c0259k.convertSelectionToString(obj), false);
    }
}