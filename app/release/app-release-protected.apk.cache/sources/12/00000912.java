package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public class setAccessibilityTraversalBefore implements setEdgeEffectFactory {
    private static Method MenuHostHelper$$ExternalSyntheticLambda1;
    private static Method setUiOptions;
    private static Method setX;
    private DataSetObserver ExtendableSavedState$1;
    private View FloatingActionButton$BaseBehavior;
    private Runnable FragmentStateAdapter$2;
    private final setOnLongClickListener FragmentStateAdapter$5;
    int MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean SearchView$SavedState$1;
    private int ViewPager$SavedState$1;
    private int setAnimationFromJson;
    private int setCenterIfNoTextEnabled;
    private AdapterView.OnItemClickListener setCheckedIconEnabled;
    private View setChipCornerRadius;
    private boolean setChipIconTintResource;
    private final Rect setConstraintSet;
    private final setAccessibilityTraversalBefore$MenuHostHelper$$ExternalSyntheticLambda0 setContentScrimResource;
    private Rect setGuidelinePercent;
    private int setHasDecor;
    private int setIconSize;
    setCheckedIconTint setIconTintList;
    private boolean setIconified;
    private Context setLayoutAnimation;
    private AdapterView.OnItemSelectedListener setLayoutDirection;
    private Drawable setMaxEms;
    private final setIconTintList setMinAndMaxProgress;
    public PopupWindow setNavigationOnClickListener;
    private ListAdapter setOnLongClickListener;
    private int setOnNavigationItemSelectedListener;
    private boolean setTextAlignment;
    private boolean setTextAppearanceResource;
    private int setTextScaleX;
    final setUiOptions setUnboundedRipple;
    final Handler setY;
    private boolean setZ;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                setX = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                setUiOptions = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                MenuHostHelper$$ExternalSyntheticLambda1 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public setAccessibilityTraversalBefore(Context context) {
        this(context, null, R.attr.res_0x7f040289);
    }

    public setAccessibilityTraversalBefore(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f040289);
    }

    public setAccessibilityTraversalBefore(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [o.setAccessibilityTraversalBefore$MenuHostHelper$$ExternalSyntheticLambda0] */
    public setAccessibilityTraversalBefore(Context context, AttributeSet attributeSet, int i, int i2) {
        this.setIconSize = -2;
        this.setOnNavigationItemSelectedListener = -2;
        this.setTextScaleX = 1002;
        this.setCenterIfNoTextEnabled = 0;
        this.setTextAlignment = false;
        this.setTextAppearanceResource = false;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = Integer.MAX_VALUE;
        this.setHasDecor = 0;
        this.setUnboundedRipple = new setUiOptions();
        this.FragmentStateAdapter$5 = new setOnLongClickListener();
        this.setContentScrimResource = new AbsListView.OnScrollListener() { // from class: o.setAccessibilityTraversalBefore$MenuHostHelper$$ExternalSyntheticLambda0
            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i3, int i4, int i5) {
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i3) {
                if (i3 != 1 || setAccessibilityTraversalBefore.this.setAnimationFromJson() || setAccessibilityTraversalBefore.this.setNavigationOnClickListener.getContentView() == null) {
                    return;
                }
                setAccessibilityTraversalBefore.this.setY.removeCallbacks(setAccessibilityTraversalBefore.this.setUnboundedRipple);
                setAccessibilityTraversalBefore.this.setUnboundedRipple.run();
            }
        };
        this.setMinAndMaxProgress = new setIconTintList();
        this.setConstraintSet = new Rect();
        this.setLayoutAnimation = context;
        this.setY = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setAnimationFromJson.setY.StaggeredGridLayoutManager$SavedState$1, i, i2);
        this.ViewPager$SavedState$1 = obtainStyledAttributes.getDimensionPixelOffset(setAnimationFromJson.setY.setTransformationMethod, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(setAnimationFromJson.setY.setEndIconTintList, 0);
        this.setAnimationFromJson = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.setZ = true;
        }
        obtainStyledAttributes.recycle();
        setForceShowIcon setforceshowicon = new setForceShowIcon(context, attributeSet, i, i2);
        this.setNavigationOnClickListener = setforceshowicon;
        setforceshowicon.setInputMethodMode(1);
    }

    public void setIconTintList(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.ExtendableSavedState$1;
        if (dataSetObserver == null) {
            this.ExtendableSavedState$1 = new DataSetObserver() { // from class: o.setAccessibilityTraversalBefore$MenuHostHelper$$ExternalSyntheticLambda1
                @Override // android.database.DataSetObserver
                public final void onChanged() {
                    if (setAccessibilityTraversalBefore.this.setUnboundedRipple()) {
                        setAccessibilityTraversalBefore.this.setLayoutAnimation();
                    }
                }

                @Override // android.database.DataSetObserver
                public final void onInvalidated() {
                    setAccessibilityTraversalBefore.this.setIconTintList();
                }
            };
        } else {
            ListAdapter listAdapter2 = this.setOnLongClickListener;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.setOnLongClickListener = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.ExtendableSavedState$1);
        }
        setCheckedIconTint setcheckedicontint = this.setIconTintList;
        if (setcheckedicontint != null) {
            setcheckedicontint.setAdapter(this.setOnLongClickListener);
        }
    }

    public void setOnLongClickListener(int i) {
        this.setHasDecor = i;
    }

    public void setIconTintList(boolean z) {
        this.setIconified = z;
        this.setNavigationOnClickListener.setFocusable(z);
    }

    public boolean setZ() {
        return this.setIconified;
    }

    public Drawable MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setNavigationOnClickListener.getBackground();
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable) {
        this.setNavigationOnClickListener.setBackgroundDrawable(drawable);
    }

    public void setY(int i) {
        this.setNavigationOnClickListener.setAnimationStyle(i);
    }

    public View ViewPager$SavedState$1() {
        return this.setChipCornerRadius;
    }

    public void setY(View view) {
        this.setChipCornerRadius = view;
    }

    public int MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.ViewPager$SavedState$1;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.ViewPager$SavedState$1 = i;
    }

    public int a_() {
        if (this.setZ) {
            return this.setAnimationFromJson;
        }
        return 0;
    }

    public void setIconTintList(int i) {
        this.setAnimationFromJson = i;
        this.setZ = true;
    }

    public void setIconTintList(Rect rect) {
        this.setGuidelinePercent = rect != null ? new Rect(rect) : null;
    }

    public void setUiOptions(int i) {
        this.setCenterIfNoTextEnabled = i;
    }

    public int setOnNavigationItemSelectedListener() {
        return this.setOnNavigationItemSelectedListener;
    }

    public void setLayoutAnimation(int i) {
        this.setOnNavigationItemSelectedListener = i;
    }

    public void setX(int i) {
        Drawable background = this.setNavigationOnClickListener.getBackground();
        if (background != null) {
            background.getPadding(this.setConstraintSet);
            this.setOnNavigationItemSelectedListener = this.setConstraintSet.left + this.setConstraintSet.right + i;
            return;
        }
        setLayoutAnimation(i);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(AdapterView.OnItemClickListener onItemClickListener) {
        this.setCheckedIconEnabled = onItemClickListener;
    }

    public void setX(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.setLayoutDirection = onItemSelectedListener;
    }

    @Override // o.setEdgeEffectFactory
    public void setLayoutAnimation() {
        int x = setX();
        boolean animationFromJson = setAnimationFromJson();
        setRightEdgeEffectColor.setY(this.setNavigationOnClickListener, this.setTextScaleX);
        boolean z = true;
        if (this.setNavigationOnClickListener.isShowing()) {
            if (setBaselineAlignBottom.setChipIconTintResource(ViewPager$SavedState$1())) {
                int i = this.setOnNavigationItemSelectedListener;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = ViewPager$SavedState$1().getWidth();
                }
                int i2 = this.setIconSize;
                if (i2 == -1) {
                    if (!animationFromJson) {
                        x = -1;
                    }
                    if (animationFromJson) {
                        this.setNavigationOnClickListener.setWidth(this.setOnNavigationItemSelectedListener == -1 ? -1 : 0);
                        this.setNavigationOnClickListener.setHeight(0);
                    } else {
                        this.setNavigationOnClickListener.setWidth(this.setOnNavigationItemSelectedListener == -1 ? -1 : 0);
                        this.setNavigationOnClickListener.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    x = i2;
                }
                this.setNavigationOnClickListener.setOutsideTouchable((this.setTextAppearanceResource || this.setTextAlignment) ? false : false);
                this.setNavigationOnClickListener.update(ViewPager$SavedState$1(), this.ViewPager$SavedState$1, this.setAnimationFromJson, i < 0 ? -1 : i, x < 0 ? -1 : x);
                return;
            }
            return;
        }
        int i3 = this.setOnNavigationItemSelectedListener;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = ViewPager$SavedState$1().getWidth();
        }
        int i4 = this.setIconSize;
        if (i4 == -1) {
            x = -1;
        } else if (i4 != -2) {
            x = i4;
        }
        this.setNavigationOnClickListener.setWidth(i3);
        this.setNavigationOnClickListener.setHeight(x);
        setY(true);
        this.setNavigationOnClickListener.setOutsideTouchable((this.setTextAppearanceResource || this.setTextAlignment) ? false : true);
        this.setNavigationOnClickListener.setTouchInterceptor(this.FragmentStateAdapter$5);
        if (this.SearchView$SavedState$1) {
            setRightEdgeEffectColor.setIconTintList(this.setNavigationOnClickListener, this.setChipIconTintResource);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = setUiOptions;
            if (method != null) {
                try {
                    method.invoke(this.setNavigationOnClickListener, this.setGuidelinePercent);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            setY.setX(this.setNavigationOnClickListener, this.setGuidelinePercent);
        }
        setRightEdgeEffectColor.setX(this.setNavigationOnClickListener, ViewPager$SavedState$1(), this.ViewPager$SavedState$1, this.setAnimationFromJson, this.setCenterIfNoTextEnabled);
        this.setIconTintList.setSelection(-1);
        if (!this.setIconified || this.setIconTintList.isInTouchMode()) {
            setNavigationOnClickListener();
        }
        if (this.setIconified) {
            return;
        }
        this.setY.post(this.setMinAndMaxProgress);
    }

    @Override // o.setEdgeEffectFactory
    public void setIconTintList() {
        this.setNavigationOnClickListener.dismiss();
        setOnLongClickListener();
        this.setNavigationOnClickListener.setContentView(null);
        this.setIconTintList = null;
        this.setY.removeCallbacks(this.setUnboundedRipple);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(PopupWindow.OnDismissListener onDismissListener) {
        this.setNavigationOnClickListener.setOnDismissListener(onDismissListener);
    }

    private void setOnLongClickListener() {
        View view = this.FloatingActionButton$BaseBehavior;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.FloatingActionButton$BaseBehavior);
            }
        }
    }

    public void setNavigationOnClickListener(int i) {
        this.setNavigationOnClickListener.setInputMethodMode(i);
    }

    public void setUnboundedRipple(int i) {
        setCheckedIconTint setcheckedicontint = this.setIconTintList;
        if (!setUnboundedRipple() || setcheckedicontint == null) {
            return;
        }
        setcheckedicontint.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        setcheckedicontint.setSelection(i);
        if (setcheckedicontint.getChoiceMode() != 0) {
            setcheckedicontint.setItemChecked(i, true);
        }
    }

    public void setNavigationOnClickListener() {
        setCheckedIconTint setcheckedicontint = this.setIconTintList;
        if (setcheckedicontint != null) {
            setcheckedicontint.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            setcheckedicontint.requestLayout();
        }
    }

    @Override // o.setEdgeEffectFactory
    public boolean setUnboundedRipple() {
        return this.setNavigationOnClickListener.isShowing();
    }

    public boolean setAnimationFromJson() {
        return this.setNavigationOnClickListener.getInputMethodMode() == 2;
    }

    public Object setCenterIfNoTextEnabled() {
        if (setUnboundedRipple()) {
            return this.setIconTintList.getSelectedItem();
        }
        return null;
    }

    public int setIconSize() {
        if (setUnboundedRipple()) {
            return this.setIconTintList.getSelectedItemPosition();
        }
        return -1;
    }

    public long setChipCornerRadius() {
        if (setUnboundedRipple()) {
            return this.setIconTintList.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public View setTextAlignment() {
        if (setUnboundedRipple()) {
            return this.setIconTintList.getSelectedView();
        }
        return null;
    }

    @Override // o.setEdgeEffectFactory
    public ListView setY() {
        return this.setIconTintList;
    }

    setCheckedIconTint MenuHostHelper$$ExternalSyntheticLambda0(Context context, boolean z) {
        return new setCheckedIconTint(context, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int setX() {
        int i;
        int i2;
        int makeMeasureSpec;
        int i3;
        if (this.setIconTintList == null) {
            Context context = this.setLayoutAnimation;
            this.FragmentStateAdapter$2 = new Runnable() { // from class: o.setAccessibilityTraversalBefore.3
                @Override // java.lang.Runnable
                public final void run() {
                    View ViewPager$SavedState$1 = setAccessibilityTraversalBefore.this.ViewPager$SavedState$1();
                    if (ViewPager$SavedState$1 == null || ViewPager$SavedState$1.getWindowToken() == null) {
                        return;
                    }
                    setAccessibilityTraversalBefore.this.setLayoutAnimation();
                }
            };
            setCheckedIconTint MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(context, !this.setIconified);
            this.setIconTintList = MenuHostHelper$$ExternalSyntheticLambda0;
            Drawable drawable = this.setMaxEms;
            if (drawable != null) {
                MenuHostHelper$$ExternalSyntheticLambda0.setSelector(drawable);
            }
            this.setIconTintList.setAdapter(this.setOnLongClickListener);
            this.setIconTintList.setOnItemClickListener(this.setCheckedIconEnabled);
            this.setIconTintList.setFocusable(true);
            this.setIconTintList.setFocusableInTouchMode(true);
            this.setIconTintList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: o.setAccessibilityTraversalBefore.5
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j) {
                    setCheckedIconTint setcheckedicontint;
                    if (i4 == -1 || (setcheckedicontint = setAccessibilityTraversalBefore.this.setIconTintList) == null) {
                        return;
                    }
                    setcheckedicontint.MenuHostHelper$$ExternalSyntheticLambda0 = false;
                }
            });
            this.setIconTintList.setOnScrollListener(this.setContentScrimResource);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.setLayoutDirection;
            if (onItemSelectedListener != null) {
                this.setIconTintList.setOnItemSelectedListener(onItemSelectedListener);
            }
            setCheckedIconTint setcheckedicontint = this.setIconTintList;
            View view = this.FloatingActionButton$BaseBehavior;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.setHasDecor;
                if (i4 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(setcheckedicontint, layoutParams);
                } else if (i4 == 1) {
                    linearLayout.addView(setcheckedicontint, layoutParams);
                    linearLayout.addView(view);
                } else {
                    StringBuilder sb = new StringBuilder("Invalid hint position ");
                    sb.append(this.setHasDecor);
                    Log.e("ListPopupWindow", sb.toString());
                }
                int i5 = this.setOnNavigationItemSelectedListener;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                setcheckedicontint = linearLayout;
            } else {
                i = 0;
            }
            this.setNavigationOnClickListener.setContentView(setcheckedicontint);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.setNavigationOnClickListener.getContentView();
            View view2 = this.FloatingActionButton$BaseBehavior;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.setNavigationOnClickListener.getBackground();
        if (background != null) {
            background.getPadding(this.setConstraintSet);
            i2 = this.setConstraintSet.top + this.setConstraintSet.bottom;
            if (!this.setZ) {
                this.setAnimationFromJson = -this.setConstraintSet.top;
            }
        } else {
            this.setConstraintSet.setEmpty();
            i2 = 0;
        }
        int iconTintList = setIconTintList(ViewPager$SavedState$1(), this.setAnimationFromJson, this.setNavigationOnClickListener.getInputMethodMode() == 2);
        if (this.setTextAlignment || this.setIconSize == -1) {
            return iconTintList + i2;
        }
        int i6 = this.setOnNavigationItemSelectedListener;
        if (i6 == -2) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.setLayoutAnimation.getResources().getDisplayMetrics().widthPixels - (this.setConstraintSet.left + this.setConstraintSet.right), Integer.MIN_VALUE);
        } else if (i6 == -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.setLayoutAnimation.getResources().getDisplayMetrics().widthPixels - (this.setConstraintSet.left + this.setConstraintSet.right), 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        int x = this.setIconTintList.setX(makeMeasureSpec, 0, -1, iconTintList - i, -1);
        if (x > 0) {
            i += i2 + this.setIconTintList.getPaddingTop() + this.setIconTintList.getPaddingBottom();
        }
        return x + i;
    }

    public void setX(boolean z) {
        this.SearchView$SavedState$1 = true;
        this.setChipIconTintResource = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setIconTintList implements Runnable {
        setIconTintList() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            setAccessibilityTraversalBefore.this.setNavigationOnClickListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setUiOptions implements Runnable {
        setUiOptions() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (setAccessibilityTraversalBefore.this.setIconTintList == null || !setBaselineAlignBottom.setChipIconTintResource(setAccessibilityTraversalBefore.this.setIconTintList) || setAccessibilityTraversalBefore.this.setIconTintList.getCount() <= setAccessibilityTraversalBefore.this.setIconTintList.getChildCount() || setAccessibilityTraversalBefore.this.setIconTintList.getChildCount() > setAccessibilityTraversalBefore.this.MenuHostHelper$$ExternalSyntheticLambda0) {
                return;
            }
            setAccessibilityTraversalBefore.this.setNavigationOnClickListener.setInputMethodMode(2);
            setAccessibilityTraversalBefore.this.setLayoutAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setOnLongClickListener implements View.OnTouchListener {
        setOnLongClickListener() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && setAccessibilityTraversalBefore.this.setNavigationOnClickListener != null && setAccessibilityTraversalBefore.this.setNavigationOnClickListener.isShowing() && x >= 0 && x < setAccessibilityTraversalBefore.this.setNavigationOnClickListener.getWidth() && y >= 0 && y < setAccessibilityTraversalBefore.this.setNavigationOnClickListener.getHeight()) {
                setAccessibilityTraversalBefore.this.setY.postDelayed(setAccessibilityTraversalBefore.this.setUnboundedRipple, 250L);
                return false;
            } else if (action == 1) {
                setAccessibilityTraversalBefore.this.setY.removeCallbacks(setAccessibilityTraversalBefore.this.setUnboundedRipple);
                return false;
            } else {
                return false;
            }
        }
    }

    private void setY(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = setX;
            if (method != null) {
                try {
                    method.invoke(this.setNavigationOnClickListener, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.setNavigationOnClickListener.setIsClippedToScreen(z);
    }

    private int setIconTintList(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = MenuHostHelper$$ExternalSyntheticLambda1;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.setNavigationOnClickListener, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.setNavigationOnClickListener.getMaxAvailableHeight(view, i);
        }
        return setX.setY(this.setNavigationOnClickListener, view, i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        static void setX(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        static int setY(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }
}