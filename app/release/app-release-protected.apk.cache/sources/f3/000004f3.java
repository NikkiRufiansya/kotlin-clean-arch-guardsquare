package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import o.getPathName;
import o.setMaxEms;
import o.setTabRippleColor;

/* loaded from: classes.dex */
public class getPathName extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    int MenuHostHelper$$ExternalSyntheticLambda0;
    protected final setY MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    private boolean setLayoutAnimation;
    private int setNavigationOnClickListener;
    private int setOnLongClickListener;
    private Spinner setUiOptions;
    protected ViewPropertyAnimator setUnboundedRipple;
    Runnable setX;
    setTabRippleColor setY;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    static {
        new DecelerateInterpolator();
    }

    public getPathName(Context context) {
        super(context);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new setY();
        setHorizontalScrollBarEnabled(false);
        setImageTintMode MenuHostHelper$$ExternalSyntheticLambda0 = setImageTintMode.MenuHostHelper$$ExternalSyntheticLambda0(context);
        setContentHeight(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0());
        this.setOnLongClickListener = MenuHostHelper$$ExternalSyntheticLambda0.setY.getResources().getDimensionPixelSize(R.dimen.res_0x7f07000a);
        setTabRippleColor settabripplecolor = new setTabRippleColor(getContext(), null, R.attr.res_0x7f040008);
        settabripplecolor.setMeasureWithLargestChildEnabled(true);
        settabripplecolor.setGravity(17);
        settabripplecolor.setLayoutParams(new setTabRippleColor.setY(-2, -1));
        this.setY = settabripplecolor;
        addView(settabripplecolor, new ViewGroup.LayoutParams(-2, -1));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = false;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.setY.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = View.MeasureSpec.getSize(i) / 2;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = Math.min(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setOnLongClickListener);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.setIconTintList, 1073741824);
        if (!z2 && this.setLayoutAnimation) {
            this.setY.measure(0, makeMeasureSpec);
            if (this.setY.getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                setIconTintList();
            } else {
                Spinner spinner = this.setUiOptions;
                if (spinner != null && spinner.getParent() == this) {
                    z = true;
                }
                if (!z) {
                    if (this.setUiOptions == null) {
                        setTabContainer settabcontainer = new setTabContainer(getContext(), null, R.attr.res_0x7f04000e);
                        settabcontainer.setLayoutParams(new setTabRippleColor.setY(-2, -1));
                        settabcontainer.setOnItemSelectedListener(this);
                        this.setUiOptions = settabcontainer;
                    }
                    removeView(this.setY);
                    addView(this.setUiOptions, new ViewGroup.LayoutParams(-2, -1));
                    if (this.setUiOptions.getAdapter() == null) {
                        this.setUiOptions.setAdapter((SpinnerAdapter) new BaseAdapter() { // from class: o.getPathName$MenuHostHelper$$ExternalSyntheticLambda1
                            @Override // android.widget.Adapter
                            public final long getItemId(int i3) {
                                return i3;
                            }

                            @Override // android.widget.Adapter
                            public final int getCount() {
                                return getPathName.this.setY.getChildCount();
                            }

                            @Override // android.widget.Adapter
                            public final Object getItem(int i3) {
                                return ((getPathName.setX) getPathName.this.setY.getChildAt(i3)).MenuHostHelper$$ExternalSyntheticLambda1;
                            }

                            @Override // android.widget.Adapter
                            public final View getView(int i3, View view, ViewGroup viewGroup) {
                                if (view == null) {
                                    getPathName getpathname = getPathName.this;
                                    getPathName.setX setx = new getPathName.setX(getpathname.getContext(), (setMaxEms.setIconTintList) getItem(i3), true);
                                    setx.setBackgroundDrawable(null);
                                    setx.setLayoutParams(new AbsListView.LayoutParams(-1, getpathname.setIconTintList));
                                    return setx;
                                }
                                getPathName.setX setx2 = (getPathName.setX) view;
                                setx2.MenuHostHelper$$ExternalSyntheticLambda1 = (setMaxEms.setIconTintList) getItem(i3);
                                setx2.setX();
                                return view;
                            }
                        });
                    }
                    Runnable runnable = this.setX;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.setX = null;
                    }
                    this.setUiOptions.setSelection(this.setNavigationOnClickListener);
                }
            }
        } else {
            setIconTintList();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z2 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.setNavigationOnClickListener);
    }

    public void setAllowCollapse(boolean z) {
        this.setLayoutAnimation = z;
    }

    public void setTabSelected(int i) {
        this.setNavigationOnClickListener = i;
        int childCount = this.setY.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.setY.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = this.setY.getChildAt(i);
                Runnable runnable = this.setX;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                Runnable runnable2 = new Runnable() { // from class: o.getPathName.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        getPathName.this.smoothScrollTo(childAt2.getLeft() - ((getPathName.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        getPathName.this.setX = null;
                    }
                };
                this.setX = runnable2;
                post(runnable2);
            }
            i2++;
        }
        Spinner spinner = this.setUiOptions;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }

    public void setContentHeight(int i) {
        this.setIconTintList = i;
        requestLayout();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setImageTintMode MenuHostHelper$$ExternalSyntheticLambda0 = setImageTintMode.MenuHostHelper$$ExternalSyntheticLambda0(getContext());
        setContentHeight(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0());
        this.setOnLongClickListener = MenuHostHelper$$ExternalSyntheticLambda0.setY.getResources().getDimensionPixelSize(R.dimen.res_0x7f07000a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.setX;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.setX;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        setMaxEms.setIconTintList seticontintlist = ((setX) view).MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setX extends LinearLayout {
        private ImageView MenuHostHelper$$ExternalSyntheticLambda0;
        setMaxEms.setIconTintList MenuHostHelper$$ExternalSyntheticLambda1;
        private TextView setUiOptions;
        private View setX;
        private final int[] setY;

        public setX(Context context, setMaxEms.setIconTintList seticontintlist, boolean z) {
            super(context, null, R.attr.res_0x7f040009);
            int[] iArr = {16842964};
            this.setY = iArr;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist;
            setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(context, null, iArr, R.attr.res_0x7f040009, 0);
            if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(0)) {
                setBackgroundDrawable(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(0));
            }
            MenuHostHelper$$ExternalSyntheticLambda0.setX();
            setGravity(8388627);
            setX();
        }

        @Override // android.view.View
        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (getPathName.this.MenuHostHelper$$ExternalSyntheticLambda0 <= 0 || getMeasuredWidth() <= getPathName.this.MenuHostHelper$$ExternalSyntheticLambda0) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPathName.this.MenuHostHelper$$ExternalSyntheticLambda0, 1073741824), i2);
        }

        public final void setX() {
            setMaxEms.setIconTintList seticontintlist = this.MenuHostHelper$$ExternalSyntheticLambda1;
            View MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                ViewParent parent = MenuHostHelper$$ExternalSyntheticLambda0.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(MenuHostHelper$$ExternalSyntheticLambda0);
                    }
                    addView(MenuHostHelper$$ExternalSyntheticLambda0);
                }
                this.setX = MenuHostHelper$$ExternalSyntheticLambda0;
                TextView textView = this.setUiOptions;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.MenuHostHelper$$ExternalSyntheticLambda0.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.setX;
            if (view != null) {
                removeView(view);
                this.setX = null;
            }
            Drawable x = seticontintlist.setX();
            CharSequence iconTintList = seticontintlist.setIconTintList();
            if (x != null) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                    setOutlineAmbientShadowColor setoutlineambientshadowcolor = new setOutlineAmbientShadowColor(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    setoutlineambientshadowcolor.setLayoutParams(layoutParams);
                    addView(setoutlineambientshadowcolor, 0);
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = setoutlineambientshadowcolor;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0.setImageDrawable(x);
                this.MenuHostHelper$$ExternalSyntheticLambda0.setVisibility(0);
            } else {
                ImageView imageView2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.MenuHostHelper$$ExternalSyntheticLambda0.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(iconTintList);
            if (z) {
                if (this.setUiOptions == null) {
                    getStableInsets getstableinsets = new getStableInsets(getContext(), null, R.attr.res_0x7f04000a);
                    getstableinsets.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    getstableinsets.setLayoutParams(layoutParams2);
                    addView(getstableinsets);
                    this.setUiOptions = getstableinsets;
                }
                this.setUiOptions.setText(iconTintList);
                this.setUiOptions.setVisibility(0);
            } else {
                TextView textView2 = this.setUiOptions;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.setUiOptions.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (imageView3 != null) {
                imageView3.setContentDescription(seticontintlist.setY());
            }
            transact.setIconTintList(this, z ? null : seticontintlist.setY());
        }
    }

    /* loaded from: classes.dex */
    protected class setY extends AnimatorListenerAdapter {
        private boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
        private int setY;

        protected setY() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            getPathName.this.setVisibility(0);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return;
            }
            getPathName.this.setUnboundedRipple = null;
            getPathName.this.setVisibility(this.setY);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        }
    }

    private boolean setIconTintList() {
        Spinner spinner = this.setUiOptions;
        if (spinner != null && spinner.getParent() == this) {
            removeView(this.setUiOptions);
            addView(this.setY, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.setUiOptions.getSelectedItemPosition());
            return false;
        }
        return false;
    }
}